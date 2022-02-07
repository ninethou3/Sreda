package ru.dasreda;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class RussianPost {

    public final static String MAIN_PAGE_URL = "https://www.pochta.ru";

    @FindBy(xpath = ".//input [@placeholder = 'Откуда']")
    public SelenideElement addressFrom;

    @FindBy(xpath = ".//input [@placeholder = 'Куда']")
    public SelenideElement addressTo;

    @FindBy(xpath = ".//span[contains(text(), 'Рассчитать')]")
    public SelenideElement calculateButton;

    @FindBy(xpath = ".//input [@placeholder = 'Введите вес']")
    public SelenideElement weight;

    @FindBy(xpath = "//*[@id=\"page-parcel\"]/div[1]/div[1]/form/div[3]/div/div/div[1]/div/div[1]/label[1]/i")
    public SelenideElement valuable;

    @FindBy(xpath = "//*[@id=\"parcel-summary\"]/div/div[2]/div[2]/a")
    public SelenideElement arrange;

    @FindBy(id = "barcode")
    public SelenideElement barcode;

    @FindBy(id = "tracking-card-footer__print-button")
    public SelenideElement printButton;



    public RussianPost findAddressFrom(){
        addressFrom.scrollIntoView(true).click();
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost sendFrom(String from){
        addressFrom.setValue(from);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost arrowFrom(){
        addressFrom.sendKeys(Keys.ARROW_DOWN);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost downFrom(){
        addressFrom.sendKeys(Keys.ENTER);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost sendTo(String to){
        addressTo.setValue(to);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost arrowTo(){
        addressTo.sendKeys(Keys.ARROW_DOWN);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost downTo(){
        addressTo.sendKeys(Keys.ENTER);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost calculateButtonClick(){
        calculateButton.click();
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost sendWeight(String toWeight){
        weight.scrollIntoView(true).sendKeys(toWeight);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost arrowWeight(){
        weight.sendKeys(Keys.ARROW_DOWN);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost downWeight(){
        weight.sendKeys(Keys.ENTER);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost clickValuable(){
        valuable.click();
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost scrollArrange(){
        arrange.scrollIntoView(true);
        Selenide.sleep(2000);
        return this;
    }
    public boolean clickArrange(){
        return arrange.is(Condition.exactText("Оформить"));
    }
    public RussianPost barcodePlace(){
        barcode.scrollIntoView(true).click();
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost barcodeInput(String barcodeNumber){
        barcode.setValue(barcodeNumber);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost barcodeEnter(){
        barcode.sendKeys(Keys.ENTER);
        Selenide.sleep(2000);
        return this;
    }
    public RussianPost printView(){
        printButton.scrollIntoView(true);
        Selenide.sleep(2000);
        return this;
    }
    public boolean print(){
        return printButton.is(Condition.exactText("Распечатать"));
    }
}

