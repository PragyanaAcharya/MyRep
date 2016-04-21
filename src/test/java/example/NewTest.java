/*package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	public class NewTest {      
	        private WebDriver driver;       
	        @Test              
	        public void testEasy() {    
	            driver.get("http://www.guru99.com/selenium-tutorial.html");  
	            String title = driver.getTitle();                
	            Assert.assertTrue(title.contains("Free Selenium Tutorials"));       
	        }   
	        @BeforeTest
	        public void beforeTest() {  
	            driver = new FirefoxDriver();  
	        }       
	        @AfterTest
	        public void afterTest() {
	            driver.quit();          
	        }       
	}   
*/

	/*
	 * 
	 * 
	 * 
	 
	AmazonS3 client  = new AmazonS3Client();
	client.setRegion(Region.getRegion(Regions.US_EAST_1));
	Bucket bucket = client.createBucket("myUniqueBucket");
	for(Bucket bucket : client.listBuckets()){
	   System.out.println(bucket.getName());
	}
	client.deleteBucket("bucket-name");
	
	*
	*
	*/