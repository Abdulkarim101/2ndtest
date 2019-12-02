package services;

import packtdto.ProductDto;

public class ProductService {

	public ProductDto giveDemoProduct() {
		ProductDto p = new ProductDto();
		p.setName("Iphone11");
		p.setCategory("Phone & Tablets");
		p.setDescription("this is new iphone");

		return p;

	}

}
