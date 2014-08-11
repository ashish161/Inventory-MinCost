package com.agilebootcamp.tw.store;

import com.agilebootcamp.tw.constant.StoreConstants.Item;

public class Inventory {

	private Item itemType;
	private int itemCount;
	private int itemPrice;

	public Inventory(Item item, int itemCount) {
		this.itemType = item;
		this.itemCount = itemCount;
	}

	public Inventory(Item itemType, int itemCount, int itemPrice) {
		super();
		this.itemType = itemType;
		this.itemCount = itemCount;
		this.itemPrice = itemPrice;
	}

	public int getItemCount() {
		return itemCount;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public Item getItemType() {
		return itemType;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setItemType(Item itemType) {
		this.itemType = itemType;
	}

}
