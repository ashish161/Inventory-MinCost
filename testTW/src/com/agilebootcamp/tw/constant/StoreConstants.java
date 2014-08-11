package com.agilebootcamp.tw.constant;

import java.util.regex.Pattern;

public class StoreConstants {
	public static enum Item {
		IPOD, IPHONE;

		public static Item getItemTypeByStr(String itemTypeStr) {
			if ("IPOD".equalsIgnoreCase(itemTypeStr)) {
				return IPOD;
			} else if ("IPHONE".equalsIgnoreCase(itemTypeStr)) {
				return IPHONE;
			} else {
				return null;
			}
		}
	}

	public static final String OUT_OF_STOCK = "OUT_OF_STOCK";

	public static final int BRAZIL_IPHONE_COST = 100;
	public static final int BRAZIL_IPHONE = 100;
	public static final int BRAZIL_IPOD_COST = 65;
	public static final int BRAZIL_IPOD = 100;
	public static final String BRAZIL = "BRAZIL";
	public static final Pattern BRAZIL_REGEX = Pattern.compile("B[0-9]{3}[A-Z]{2}[A-Z0-9]{7}");

	public static final int ARGENTINA_IPHONE_COST = 150;
	public static final int ARGENTINA_IPHONE = 50;
	public static final int ARGENTINA_IPOD_COST = 100;
	public static final int ARGENTINA_IPOD = 100;
	public static final Pattern ARGENTINA_REGEX = Pattern.compile("A[A-Z]{2}[A-Z0-9{9}]");
	public static final String ARGENTINA = "ARGENTINA";
}
