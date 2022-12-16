package com.mealkit.product;



public class ProductVo {

	// �긽�뭹 �뀒�씠釉�
	private int product_number;// �긽�뭹 踰덊샇 primary key
	private String product_name;  // �긽�뭹 �씠由�
	private int product_price;  // �긽�뭹 媛�寃� 
	private int product_stock; // �긽�뭹 �옱怨�
	private String product_desc;  // �긽�뭹 �꽕紐�
	private String category_code;
	
	
	

	public ProductVo() {}
	
	public ProductVo(
			int product_number,
			String product_name,
			int product_price,
			int product_stock,
			String product_desc) {
		this.product_number = product_number;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_desc = product_desc;
	}

	public int getProduct_number() {
		return product_number;
	}

	public void setProduct_number(int product_number) {
		this.product_number = product_number;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public String getCategory_code() {
		return category_code;
	}

	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}

	@Override
	public String toString() {
		return "ProductVo [product_number=" + product_number + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_stock=" + product_stock + ", product_desc=" + product_desc
				+ ", category_code=" + category_code + "]";
	}




	

	
	
}
