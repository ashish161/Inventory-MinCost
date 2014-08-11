package com.agilebootcamp.tw.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.agilebootcamp.tw.constant.StoreConstants;
import com.agilebootcamp.tw.constant.StoreConstants.Item;

public class Order {

	private Store store;
	private String passport;
	private String nationality;
	private Map<Item, Inventory> items = new HashMap<Item, Inventory>();

	public Order(Store store, String passport, Inventory... inventory) {
		this.store = store;
		this.passport = passport;
		setNationality();
		setItems(inventory);
	}

	public int getItemCount(Item itemType) {
		return this.items.get(itemType).getItemCount();
	}

	public int getItemPrice(Item itemType) {
		return this.items.get(itemType).getItemPrice();
	}

	public Set<Item> getItems() {
		return this.items.keySet();

	}

	public String getNationality() {
		return nationality;
	}

	public String getPassport() {
		return passport;
	}

	public Store getStore() {
		return store;
	}

	private void setItems(Inventory... i) {
		for (Inventory inventoryOrdered : i) {
			items.put(inventoryOrdered.getItemType(), inventoryOrdered);
		}
	}

	private void setNationality() {
		if (passport != null && passport.length() > 0) {
			if (StoreConstants.BRAZIL_REGEX.matcher(passport).find(0)) {
				this.nationality = StoreConstants.BRAZIL;
			} else if (StoreConstants.ARGENTINA_REGEX.matcher(passport).find(0)) {
				this.nationality = StoreConstants.ARGENTINA;
			}
		}
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
