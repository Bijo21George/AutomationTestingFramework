package utilities;

import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;

public class CommonFunctions {
  public static void main(String[] args){
    CommonFunctions commonFunctions = new CommonFunctions();
    commonFunctions.generateRandomNumber(1,2,2);
  }
  public void generateRandomNumber(int low, int high, int decimals){
    final Random random = new Random();
    final double dbl = random.nextDouble()*(high-low)+low;
    String randomNumber= String.format("%."+decimals+"f",dbl);
    System.out.println(randomNumber);
  }

    public void scrollWebPage() {
      JavascriptExecutor js= (JavascriptExecutor) ThreadLocalDriver.getWebDriverThreadLocal();
      js.executeScript("window.scrollBy(0,400)");
    }
}
