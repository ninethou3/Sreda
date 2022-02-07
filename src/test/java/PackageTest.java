import com.codeborne.selenide.Configuration;
import org.junit.Test;
import ru.dasreda.RussianPost;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class PackageTest extends RussianPost {

    @Test
    public void arrangeTest() {

        Configuration.browser = "chrome";

        final boolean arrangeIsTrue = open(MAIN_PAGE_URL, RussianPost.class)
                .findAddressFrom()
                .sendFrom("г Москва")
                .arrowFrom()
                .downFrom()
                .sendTo("обл Воронежская, г Воронеж")
                .arrowTo()
                .downTo()
                .calculateButtonClick()
                .sendWeight("15")
                .arrowWeight()
                .downWeight()
                .clickValuable()
                .scrollArrange()
                .clickArrange();

        assertTrue(arrangeIsTrue);
    }

    @Test
    public void trackTest() {

        Configuration.browser = "chrome";

        final boolean trackIsTrue = open(MAIN_PAGE_URL, RussianPost.class)
                .barcodeInput("61002567017331")
                .barcodeEnter()
                .printView()
                .print();

        assertTrue(trackIsTrue);
    }
}
