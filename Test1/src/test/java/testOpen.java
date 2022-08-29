import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class testOpen {
    @Test

    public void openTest() throws InterruptedException {
        open("https://portal.dtln.ru/");
        Thread.sleep(30000);
    }
}
