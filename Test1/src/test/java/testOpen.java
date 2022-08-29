import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class testOpen {
    @Test

    public void openTest() throws InterruptedException {
        open("https://portal-dev.dtln.cloud/");
        Thread.sleep(30000);
    }
}
