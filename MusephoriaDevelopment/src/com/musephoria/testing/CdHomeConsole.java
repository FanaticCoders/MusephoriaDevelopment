/**
 *
 */
package com.musephoria.testing;

import com.musephoria.dao.CdHome;
//import com.musephoria.entity.Cd;
import com.musephoria.webserviceclient.ProductCatalogServiceClient;

/**
 * @author Admin
 *
 */
public class CdHomeConsole {
	/**
	 * @param args
	 */

	public static void main(String[] args) {

		try {
			// Dont Delete.!!
			// Test Method for getCategoryList
			CdHome cdDaoObj = new CdHome();

			/*
			 * List<String> resObj = cdDaoObj.getCategoryList();
			 * Iterator<String> iterator = resObj.iterator();
			 * while(iterator.hasNext()) {
			 * System.out.println(iterator.next().toString()); }
			 */

			/*
			 * List<Cd> resObj1 = cdDaoObj.getProductList("Rock"); Iterator<Cd>
			 * iterator1 = resObj1.iterator(); while(iterator1.hasNext()) {
			 * System.out.println(iterator1.next().getArtist()); }
			 */
			/*
			 * List<Cd> cdlist; cdDaoObj.getProductList("Rock");
			 * System.out.println(cdObj.getGenre());
			 */

			/*
			 * Cd resObj1 = cdDaoObj.getProductInfo(1001);
			 * System.out.println(resObj1.getName());
			 */

			ProductCatalogServiceClient client = new ProductCatalogServiceClient();
			String[] temp = client.getCategoryList();
			for (String string : temp) {
				System.out.println(string.toString());
			}

			/*
			 * ProductCatalogServiceClient client = new
			 * ProductCatalogServiceClient(); Cd[] temp =
			 * client.getProductList("Rock"); for (Cd string : temp) {
			 * System.out.println(string.getCdId()); }
			 */

			/*
			 * ProductCatalogServiceClient client = new
			 * ProductCatalogServiceClient(); client.getProductInfo(1001);
			 * System.out.println(temp.getGenre());
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}

}
