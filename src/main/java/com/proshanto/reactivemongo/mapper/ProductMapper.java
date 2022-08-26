package com.proshanto.reactivemongo.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.proshanto.reactivemongo.conversion.ProductConverter;
import com.proshanto.reactivemongo.dto.ProductDTO;
import com.proshanto.reactivemongo.entity.Product;

@Service
public class ProductMapper {

	public static ProductConverter<Product, ProductDTO> entityToDTO() {
		ProductDTO pd = new ProductDTO();
		return (p) -> pd.setName(p.getName()).setPrice(p.getPrice())
				.setQty(p.getQty());
	}
	
	
	public static ProductConverter<ProductDTO, Product> dtoToEntity() {
		Product p = new Product();
		return (pd) -> p.setName(pd.getName()).setPrice(pd.getPrice())
				.setQty(pd.getQty());
	}

	public static ProductDTO entityToDTO(Product product) {
		ProductDTO pd = new ProductDTO();
		BeanUtils.copyProperties(product, pd);
		return pd;
	}
	
	public static Product dtoToEntity(ProductDTO productDTO) {
		Product p = new Product();
		BeanUtils.copyProperties(productDTO, p);
		return p;
	}

}
