package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\Downloads\\selenium\\chromedriver.exe");
//        TEST CASE WITH ELEMENTS:
        WebDriver w = new ChromeDriver();

//        ELEMENT 1
        w.get("https://www.thesparksfoundationsingapore.org/");
        w.manage().window().maximize();



        String actual_title = w.getTitle();
        String estimated_title = "The Sparks Foundation | Home";


            if(actual_title.equalsIgnoreCase(estimated_title)){
                System.out.println("first test is successful!");
            }
            else{
                System.out.println("first test is unsuccessful!");
            }

//        ELEMENT 2
        w.get("https://www.thesparksfoundationsingapore.org/about/vision-mission-and-values/");
        w.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)w;
        js.executeScript("scrollBy(0, 5000)");

        boolean status = w.findElement(By.className("b-nav")).isDisplayed();

            if(status){
                System.out.println("second test is successful!");
            }
            else{
                System.out.println("second test is unsuccessful!");
            }

//        ELEMENT 3
        w.get("https://www.thesparksfoundationsingapore.org/policies-and-code/code-of-ethics-and-conduct/");
        w.manage().window().maximize();

        boolean status2 = w.findElement(By.className("media-body")).isDisplayed();

            if(status2){
                System.out.println("Third test is successful!");
            }
            else{
                System.out.println("Third test is unsuccessful!");
            }

//        ELEMENT 4
        w.get("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
        w.manage().window().maximize();


        boolean status3 = w.findElement(By.className("w3l-blog-list")).isDisplayed();

            if(status3){
                System.out.println("fourth test is successful!");
            }
            else{
                System.out.println("fourth test is unsuccessful!");
            }

//        ELEMENT 5
        w.get("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
        w.manage().window().maximize();


        boolean status4 = w.findElement(By.className("top-header-agile-right")).isDisplayed();

            if(status4){
                System.out.println("fifth test is successful!");
            }
            else{
                System.out.println("fifth test is unsuccessful!");
            }

//        ELEMENT 6
        w.get("https://www.thesparksfoundationsingapore.org/");
        w.manage().window().maximize();

        boolean status5 = w.findElement(By.className("flex-active")).isDisplayed();

            if(status5){
                System.out.println("sixth test is successful!");
            }
            else{
                System.out.println("sixth test is unsuccessful!");
            }

//        ELEMENT 7
        w.get("https://www.thesparksfoundationsingapore.org/links/ai-in-education/");
        w.manage().window().maximize();

        String actual_cus = w.getTitle();
        String estimated_cus = "The Sparks Foundation | Home";


            if(actual_cus.equalsIgnoreCase(estimated_cus)){
                System.out.println("seventh test is successful!");
            }
            else{
                System.out.println("seventh test is unsuccessful!");
            }

//        ELEMENT 8
        w.get("https://www.thesparksfoundationsingapore.org/links/ai-in-education/");
        w.manage().window().maximize();

        JavascriptExecutor js2 = (JavascriptExecutor)w;
        js2.executeScript("scrollBy(0, 5000)");

        //    verify that we are now back on Internshala's homepage

        w.findElement(By.className("b-nav")).click();

            if (w.getTitle().equals("The Sparks Foundation | Home")){
                System.out.println("eighth test is successful!");
            }
            else{
                System.out.println("eighth test is unsuccessful!");
            }

//        ELEMENT 9
        w.get("https://www.thesparksfoundationsingapore.org/policies-and-code/service-quality-values/");
        w.manage().window().maximize();

        boolean s = w.findElement(By.className("b-nav")).isDisplayed();

        if(s){
            System.out.println("ninth test is successful!");
        }
        else{
            System.out.println("ninth test is unsuccessful!");
        }

//        ELEMENT 10
        w.get("https://www.thesparksfoundationsingapore.org/join-us/brand-ambassador/");
        w.manage().window().maximize();

         boolean s2 = w.findElement(By.className("clearfix")).isDisplayed();

            if(s2){
                System.out.println("tenth test is successful!");
            }
            else{
                System.out.println("tenth test is unsuccessful!");
            }
        System.out.println("All tests are executed Successfully");
        w.close(); // close driver
    }
}


