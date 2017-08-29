package com.niit.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;
import com.niit.utility.JdbcUtil;

import oracle.net.aso.p;

@Repository
public class ProductDAOImpl implements ProductDAO{
	

	@Override
	public void save(Product p) {
		try{
			Connection conn=JdbcUtil.loadDriver();
			PreparedStatement ps=conn.prepareStatement("insert into product(id,name,description) values(?,?,?)");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setString(3, p.getDescription());
			ps.executeUpdate();
			
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Override
	public List<Product> getProductList(){
		List<Product> prod = new ArrayList<Product>();
		try{
			Connection conn=JdbcUtil.loadDriver();
			PreparedStatement statement = conn.prepareStatement("select*from product");
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Product product= new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				prod.add(product);
				
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return prod;
	}
	
	@Override
	public void deleteProduct(int pro){
		try{
			Connection con=JdbcUtil.loadDriver();
			PreparedStatement ps = con.prepareStatement("delete from product where id=?");
			ps.setInt(1, pro);
			ps.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
			
			
		}
	
	
	@Override
	public void updateProduct(Product pro) {
		try{
			Connection conn=JdbcUtil.loadDriver();
			PreparedStatement ps= conn.prepareStatement("update product set name=?,description=? where id=?");
			ps.setInt(3, pro.getId());
			ps.setString(1, pro.getName());
			ps.setString(2, pro.getDescription());
			
			ps.executeUpdate();
			ps.close();
			
		}
		catch(Exception e){
System.out.println(e);
		
	}
		
	}
	@Override
	public Product getProductById(int id) {
		Product p= new Product();
		try{
			Connection con=JdbcUtil.loadDriver();
			PreparedStatement ps = con.prepareStatement("select * from product where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));

			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return p;
	}

	

	
}
