package arnakator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import arnakator.model.IArticle;
import arnakator.model.IDescription;
import arnakator.model.impl.Description;
import arnakator.model.impl.Product;

public class ApplicationTest {

	private Application app;
	
	@Before
	public void setUp() {
		app = Application.getInstance();
		setTestArticles();
	}
	
	public void setTestArticles() {
		for(int i = 0; i < 100; i++) {
			Product p = new Product();
			p.setBasePrice(i);
			p.setQuantity(50);
			IDescription desc = new Description();
			desc.setTitle("Produit " + i);
			p.setDescription(desc);
			app.getArticleService().updateOrAdd(p);
		}
	}
	
	@Test
	public void testApplication() {
		IArticle a = app.getArticleService().getArticle(5);
		double price = a.getPrice();
		a.setQuantity(40);
		a = app.getArticleService().updateOrAdd(a);
		assertTrue(price < a.getPrice());
		System.out.println("ancien prix : " + price + ", nouveau prix : " + a.getPrice());
		System.out.println("Client arnaqué avec succès");
	}

}
