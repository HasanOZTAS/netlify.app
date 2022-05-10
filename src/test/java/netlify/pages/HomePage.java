package netlify.pages;

import netlify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(),this);
    }


    // Web elements

    @FindBy(xpath = "//div[contains(@class,'ProductCardstyle__ProductImageWrapper')]")
    public List<WebElement> products;

    @FindBy(xpath = "//p[contains(@class,'BestSellerBadge')]")
    public WebElement bestSellerBadge;

    @FindBy(xpath = "//li[contains(@class,'PaginationIndicatorstyle__Li')]")
    public List<WebElement> pageButtons;

    @FindBy(xpath = "//div[contains(@class,'ProductCardstyle__ProductImageWrapper')]//button[text()='Add to Cart']")
    public WebElement addToCartBar;

    @FindBy(xpath = "//div[@class='style__Column-sc-4ctdae-1 EwxsO']//div[@class='style__Column-sc-4ctdae-1 iTjutW']//p[@class='title']")
    public List<WebElement> cartList;

    @FindBy(xpath = "//*[@id=\"__next\"]//div[2]/button/span")
    public WebElement cartCounterBadge;

    @FindBy(xpath = "//button[contains(@class,'ShoppingCartButton')]")
    public WebElement basketIcon;

    @FindBy(xpath = "//div[contains(@class,'ButtonContainer')]//span")
    public WebElement clearButton;



}
