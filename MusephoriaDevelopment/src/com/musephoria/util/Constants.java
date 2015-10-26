/**
 *
 */
package com.musephoria.util;

/**
 * @author FanaticCoder
 *
 */
public final class Constants {
	public static final String sqlConfigName = "mySqlConfig.properties";
	public static final String dbName = "dbName";
	public static final String dbURL = "dbURL";
	public static final String jdbcDriverInfo = "jdbcDriverInfo";
	public static final String username = "username";
	public static final String password = "password";
	public static final String envNameContext = "java:comp/env";
	public static final String mysqlPoolName = "jdbc/mysqlPool";

	// Error Messages
	public static final String connectionFailed = "Failed to Get/Make Connection. ";
	public static final String userNameExists = " user already exists.";

	// Error Codes
	public static final int errorCode = -1;
	public static final int errorUserNameExists = 101;


	// Success Messages
	public static final String successMessage = "Success";
	public static final String dataSaved = "Data Saved.";
	public static final String dataNotSaved = "Failed to Save Data.";
	public static final String accountCreatedMessage = "Account Created";

	// Success Codes
	public static final int successCode = 1;

	// FileNames
	public static final String sqlQueryProperty = "com/musephoria/util/SqlQuery.properties";

	// Property Keys
	public static final String fetchAllCd = "fetchAllCd";
	public static final String getCategoryList = "fetCategoryList";
	public static final String checkIfUserExists = "checkIfUserExists";
	public static final String getAccountInfo = "getAccountInfo";
	public static final String getCustomerDetails = "getCustomerDetails";
	public static final String getProductList = "getProductList";
	public static final String getProductListWithCategory = "getProductListWithCategory";
	public static final String getProductInfo="getProductInfo";
	public static final String getCartItems = "getCartItems";
	public static final String getCustomerIdbyUsername="getCustomerIdbyUsername";
}
