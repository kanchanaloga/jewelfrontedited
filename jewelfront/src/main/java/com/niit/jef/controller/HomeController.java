
package com.niit.jef.controller;

import javax.servlet.http.HttpServletRequest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.niit.jee.dao.UserDAO;
import com.niit.jee.dao.CartDAO;
import com.niit.jee.dao.CategoryDAO;
import com.niit.jee.dao.ProductDAO;
import com.niit.jee.dao.SupplierDAO;
import com.niit.jee.model.Cart;
import com.niit.jee.model.Category;
import com.niit.jee.model.Product;
import com.niit.jee.model.Supplier;
import com.niit.jee.model.User;
import java.lang.*;


@Controller
public class HomeController
{
	
	@Autowired
	CategoryDAO categoryDao;
	@Autowired
	SupplierDAO supplierDao;
	
	@Autowired
	ProductDAO productDao;
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	CartDAO cart1;
	
	public void UserDAO(UserDAO userDao)
	{
		this.userDao =userDao;
	}
	
	public void CategoryDAO(CategoryDAO categoryDao)
	{
		this.categoryDao=categoryDao;
	}
	
	public void SupplierDAO(SupplierDAO supplierDao)
	{
		this.supplierDao=supplierDao;
	}
	
	
	@RequestMapping("/")
	public ModelAndView index() { 
		ModelAndView mv = new ModelAndView("index");
		List<Category> list=categoryDao.getAllCategories();
		mv.addObject("list",list);
		return mv;
	}
/*	@RequestMapping("/logout")
	public String logout() { 
		ModelAndView mv = new ModelAndView("/");
		List<Category> list=categoryDao.getAllCategories();
		mv.addObject("list",list);
		return mv;
		return "redirect:/";
	}*/
	/*@RequestMapping("/productDetails")
	public ModelAndView product() {

		ModelAndView mv = new ModelAndView("productDetails");
		
		return mv;
	}
	*/
	@RequestMapping("/category")
	public ModelAndView category() { 
		ModelAndView mv = new ModelAndView("productTable");
		
		return mv;
	}
	@RequestMapping("admin/add")
	public ModelAndView adding() 
	{ 
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		
		
		return mv;
	}
	@RequestMapping("admin/addCategory")
	public ModelAndView addCategory(HttpServletRequest request) 
	{ 
		int c_id=Integer.valueOf(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		System.out.println(c_id+"---"+c_name);
		categoryDao.persist(new Category(c_id, c_name));
		ModelAndView mv = new ModelAndView("/add");
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
	
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		
		return mv;
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration()
	{
		ModelAndView mv = new ModelAndView("registration");
	    
	    
		
		return mv;
	}
	
	/*@RequestMapping("/login")
	public ModelAndView login1()
	{
		ModelAndView mv = new ModelAndView("login");
		
		return mv;
	}*/

	@RequestMapping("admin/suppliercategory")
	public ModelAndView addsupplier(HttpServletRequest request) 
	{ Supplier s=new Supplier();
		int s_id=Integer.valueOf(request.getParameter("s_id"));
		String s_name=request.getParameter("s_name");
		System.out.println(s_id+"---"+s_name);
		s.setS_id(s_id);
		s.setS_name(s_name);
		supplierDao.persist(s);
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);		
		return mv;	
	}	
	
	

	/*
	@RequestMapping("/addProducts")
	public ModelAndView addProducts(HttpServletRequest request) 
	{ 
		System.out.println("in Products Controller");
		int id=Integer.valueOf(request.getParameter("p_id"));
		String pname=request.getParameter("p_name");
		String pdesc=request.getParameter("p_desc");
		int price=Integer.valueOf(request.getParameter("p_price"));
		int cid=Integer.valueOf(request.getParameter("c_id"));
		int sid=Integer.valueOf(request.getParameter("s_id"));
		String file=request.getParameter("img");
		Category c=categoryDao.findById(cid);
		Supplier s=supplierDao.findById(sid);
		Product p=new Product();
		p.setCategory(c);
		p.setSupplier(s);
		p.setP_id(id);
		p.setP_name(pname);
		p.setP_description(pdesc);
		p.setP_price(price);
	    p.setP_image(file);
		productDao.persist(p);
		
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		
	
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}*/

	
	

	@RequestMapping("admin/addProducts")
	public ModelAndView addProducts(@RequestParam("file") MultipartFile file,HttpServletRequest request) 
	{ 
		System.out.println(" Products Controller");
		int id=Integer.valueOf(request.getParameter("p_id"));
		String pname=request.getParameter("p_name");
		String pdesc=request.getParameter("p_desc");
		int price=Integer.valueOf(request.getParameter("p_price"));
		int cid=Integer.valueOf(request.getParameter("c_id"));
		int sid=Integer.valueOf(request.getParameter("s_id"));
	/*	String file=request.getParameter("img");*/
		Category c=categoryDao.findById(cid);
		Supplier s=supplierDao.findById(sid);
		Product p=new Product();
		p.setCategory(c);
		p.setSupplier(s);
		p.setP_id(id);
		p.setP_name(pname);
		p.setP_description(pdesc);
		p.setP_price(price);
	   /* p.setP_image(file);*/
		String originalfile = file.getOriginalFilename();
		p.setP_image(originalfile);
		productDao.persist(p);
String filepath = request.getSession().getServletContext().getRealPath("/") + "resources/product/" + file.getOriginalFilename();
		
		System.out.println(filepath);
		try {
			byte imagebyte[] = file.getBytes();
			BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
			fos.write(imagebyte);
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			} catch (Exception e) {
		
			e.printStackTrace();
			}
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		
	
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}
	@RequestMapping("/adduser")
	public ModelAndView adduser(HttpServletRequest request) 
	{ 
		String email=request.getParameter("email");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		 int age=  Integer.valueOf(request.getParameter("age"));
	
	long phone= Long.valueOf(request.getParameter("phoneno")).longValue();
		
		String password=request.getParameter("password");
		String u_role="ROLE_USER";
	     User us=new User();
	     
	     us.setU_add(address);
	     us.setU_mail(email);
	     us.setU_name(name);
	     us.setU_age(age);
	     us.setU_phone(phone);
	     us.setU_password(password);
	     us.setU_role(u_role);
		//System.out.println(c_id+"---"+c_name);
		userDao.persist(us);
		ModelAndView mv = new ModelAndView("/login");
	return mv;
	}
	
	
	@RequestMapping("admin/categorylist")
	public ModelAndView adding4(){
		/*List<Product> list=productDao.getProducts();*/
		ModelAndView m = new ModelAndView("categorylist");
		List<Category> clist=categoryDao.getAllCategories();
		/*List<Supplier> slist=supplierDao.getAllUsers();*/
		/*m.addObject("list", list);*/
		/*m.addObject("slist", slist);*/
		m.addObject("clist", clist);
	     return m;
	    		 }
	

	@RequestMapping("admin/supplierlist")
	public ModelAndView adding5(){
		/*List<Product> list=productDao.getProducts();*/
		ModelAndView m = new ModelAndView("supplierlist");
//		List<Category> clist=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		/*m.addObject("list", list);*/
		m.addObject("slist", slist);
		/*m.addObject("clist", clist);*/
	     return m;
	    		 }

@RequestMapping("admin/productlist")
	public ModelAndView adding3(){
		List<Product> list=productDao.getProducts();
		ModelAndView m = new ModelAndView("productlist");
		List<Category> clist=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllUsers();
		m.addObject("list", list);
		m.addObject("slist", slist);
		m.addObject("clist", clist);
	     return m;
	    		 }
//delete and edit 

/**
 * @param request
 * @return
 */
 
 @RequestMapping(value="admin/product_delete")
    public ModelAndView deleteProduct(HttpServletRequest request)
    {
	 Product p=productDao.findById(Integer.valueOf(request.getParameter("id")));
     System.out.print(p);
 productDao.delete(p);
 List<Product> list=productDao.getProducts();
 ModelAndView mv = new ModelAndView("productlist");    
	List<Category> clist=categoryDao.getAllCategories();
	List<Supplier> slist=supplierDao.getAllUsers();
	mv.addObject("slist", slist);
	mv.addObject("clist", clist);
 mv.addObject("list",list);
 return mv;
    }
        
    
@RequestMapping(value="admin/product_edit")
public ModelAndView editProducts(HttpServletRequest request){	
String id=request.getParameter("id");
System.out.println(id);
ModelAndView mv=new ModelAndView("productEdit");
List<Category> list=categoryDao.getAllCategories();
List<Supplier> slist=supplierDao.getAllUsers();
System.out.println(productDao.findById(Integer.valueOf(id)).toString());
mv.addObject("product",productDao.findById(Integer.valueOf(id)) );	
mv.addObject("slist", slist);
mv.addObject("clist", list);
return mv;
}


@RequestMapping(value = "admin/product_update"  , method = RequestMethod.POST)
public  ModelAndView updateProduct(@RequestParam ("file") MultipartFile file ,HttpServletRequest request) 
{ 
	System.out.println("in Products Controller");
	String id=request.getParameter("pId");
	String pname=request.getParameter("pn");
	/*String pdesc=request.getParameter("p_desc");*/
	String price=request.getParameter("pp");
	String cid=request.getParameter("pc");
	String sid=request.getParameter("psc");
	String img=request.getParameter("file");
//	Category c=categoryDao.getCategoryDetails(Integer.valueOf(cid));
	Category c=categoryDao.getCategoryDetails(Integer.parseInt(cid));
	Supplier s=supplierDao.getSupplierDetails(Integer.parseInt(sid));
	Product p=new Product();
	p.setCategory(c);
	/*p.setP_description(pdesc);*/
	p.setP_name(pname);
	p.setP_price(Integer.valueOf(price));
	p.setP_id(Integer.valueOf(id));	
	String originalfile = file.getOriginalFilename();
	p.setP_image(img);
	p.setSupplier(s);
	
	productDao.update(p);
	String filepath = request.getSession().getServletContext().getRealPath("/");
	System.out.println(filepath+"resources/product/"+originalfile);
	try {
		byte imagebyte[] = file.getBytes();
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"resources/product/"+originalfile));
		fos.write(imagebyte);
		fos.close();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	

//	List<CategoryModel> list=catsDao.getAllCategoryDetails();
//	List<SupplierModel> slist=supDao.getAllSupplier();
	
	List<Category> clist=categoryDao.getAllCategories();
	List<Supplier> slist=supplierDao.getAllUsers();
	 List<Product> list=productDao.getProducts();
	//ModelAndView mv = new ModelAndView("productList");
	ModelAndView mv = new ModelAndView("productlist");
	mv.addObject("slist", slist);
	mv.addObject("list", list);
	mv.addObject("clist", clist);
	return mv;
}


   /*product filter*/

@RequestMapping("/productFilter")
public ModelAndView productListFilter( HttpServletRequest request)
{ 
	List<Product> list=productDao. getFilterProducts(Integer.valueOf(request.getParameter("id")));
	//List<Product> list=productDao.getProducts();
	ModelAndView mv = new ModelAndView("productFilter");	
	
	mv.addObject("clist",list);
	return mv;
}

/*



@ModelAttribute

  public void addAttributes(Model model)

  {

	  model.addAttribute("clist",categoryDao.getAllCategories());

  }
*/



@RequestMapping("/product")
public ModelAndView addCarttable(HttpServletRequest request) 
{
	
/*	int id=Integer.valueOf(request.getParameter("prodid"));
	
	int quan=Integer.valueOf(request.getParameter("prodquantity"));
	
	int price=Integer.valueOf(request.getParameter("prodprice"));*/
	/*int uid=Integer.valueOf(request.getParameter("userid"));
	int sid=Integer.valueOf(request.getParameter("suplierid"));*/
	
	/*UserModel c=user1.findById(uid);
	SupplierModel s=supplierDAO.findById(sid);*/
	//System.out.println(""+id+""+quan+""+price);
	Product p=productDao.findById(Integer.parseInt(request.getParameter("id")));
/*	Cart g=new Cart();
	g.setPrices(price);
	g.setQuantity(quan);
	g.setProductid(p);
	
	g.setSuplierid(s);
	g.setUserid(c);
	
	
	cart1.save(g);
	*/
	ModelAndView mv = new ModelAndView("productDetails");
	mv.getModelMap().addAttribute("product", p);
	return mv;
}

@RequestMapping(value="/productdetails", method=RequestMethod.POST)
public ModelAndView addCarttable1(HttpServletRequest request) 
{
	
	int id=Integer.valueOf(request.getParameter("prodid"));
	
	int quan=Integer.valueOf(request.getParameter("prodquantity"));
	
	int price=Integer.valueOf(request.getParameter("prodprice"));
	/*int uid=Integer.valueOf(request.getParameter("userid"));
	int sid=Integer.valueOf(request.getParameter("suplierid"));*/
	
	/*UserModel c=user1.findById(uid);
	SupplierModel s=supplierDAO.findById(sid);*/
/*	System.out.println(""+id+""+quan+""+price);*/
	Product p=productDao.findById(id);
	Cart g=new Cart();
	/*g.setPrices(price);*/
	g.setQuantity(quan);
	g.setProductid(p);
	
	
	//int price=g.getPrices();
	/*g.setSuplierid(s);
	g.setUserid(c);*/
	g.setPrices(price);
	
	
	List<Cart> cartlist=cart1.checkExistance(id);
	ModelAndView mv = new ModelAndView("viewcarttable");
	//cart1.setPrices(price);
	int count=cartlist.size();
	
	if(count==0)

	{

	cart1.save(g);

	}

	else

	{

		Cart cart=cart1.findById(cartlist.get(0).getCartid());

		int ex=cart.getQuantity();
		int p1=cart.getPrices();

		System.out.println("Existance Count ="+ex+"\n current Count = "+quan+"-Total =-"+(ex+quan));

		int tot=ex+quan;
		int tot1=p1+price;

		cart.setQuantity(tot);
		
		cart.setPrices(tot1);
		cart1.update(cart);

	}
	List<Cart> cartList=cart1.getAll();

	mv.addObject("cartlist",cartList);
	
	
//	mv.addObject("p",p);*/
	return mv;

}















	@RequestMapping("/cart_delete")
	public ModelAndView editCart(HttpServletRequest request)
	{
	int cid=Integer.valueOf(request.getParameter("id"));
	Cart c=cart1.findById(cid);
	cart1.delete(c);
	ModelAndView mv=new ModelAndView("viewcarttable");
	List<Cart> cartList=cart1.getAll();
	mv.addObject("cartlist", cartList);
	return mv;
	}
	
	
	
	@RequestMapping("/customerDetails")
public ModelAndView customer(HttpServletRequest request)
{
int tot=Integer.valueOf(request.getParameter("tot"));
ModelAndView mv=new ModelAndView("registration1");
mv.addObject("tot", tot);
return mv;

	}


@RequestMapping("/invoice")

	public ModelAndView invoice(HttpServletRequest request)

	{

		String name=request.getParameter("name");

		String add=request.getParameter("add");

		String phone=request.getParameter("contact_no");

		String email=request.getParameter("email");

		String tot=request.getParameter("tot");

		ModelAndView mv=new ModelAndView("invoice");

		mv.addObject("name", name);

		mv.addObject("add", add);

		mv.addObject("phone", phone);

		mv.addObject("email", email);

		mv.addObject("tot", tot);
return mv;

	}

	
 /*  spring security*/




@RequestMapping("/login")

	public ModelAndView login(HttpServletRequest request1) {

		ModelAndView mv = new ModelAndView("login");

		return mv;

	}

	

/*	@RequestMapping("/userlogged")

	public ModelAndView userLogged() { 

		ModelAndView mv = new ModelAndView("/");

		

		return mv;

	}*/

	@RequestMapping("/userlogged")

	public String userLogged() { 

		return "redirect:/";	

	}
	@RequestMapping("/confirmation")

	public ModelAndView thank(HttpServletRequest request)

	{

		ModelAndView mv = new ModelAndView("confirmation");
       return mv;}
	
	

}


