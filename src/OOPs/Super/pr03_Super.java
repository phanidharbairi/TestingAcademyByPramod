package OOPs.Super;

public class pr03_Super {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("Chrome");
        t1.openBrowser();
        System.out.println("Test Case T1 running...");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());

    }
}

class BaseClass {
    private String browser;

    public BaseClass(String browser){
         this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
           this.browser = browser;
        }
        else {
            System.out.println("Change browser not allowed. You're not an Admin");
        }
    }

    void openBrowser() {
        System.out.println("Opening browser!!");
    }
    void openBrowser(String BrowserName) {
        System.out.println("Open Browser ->" + BrowserName);
    }
    void closeBrowser() {
        System.out.println("Closing Browser!!");
    }
}


class TestCase1 extends BaseClass {
    public TestCase1(String browser){
        super(browser);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Override the parent method");
    }
}