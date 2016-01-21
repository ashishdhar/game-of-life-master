import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import com.wakaleo.gameoflife.web.webtests.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

tags "acceptance"

before_each "Configure test URL", {
<<<<<<< d8226e444577d94bcc9115c17480db1e618edb0c
	webtest_home = System.properties.'webtest.home'
    println "Testing against $webtest_home"
=======
	testServer = System.properties.'test.server'
>>>>>>> Updated version number
}

scenario "Application version number is displayed on the home page",{
	given "that the application is up and running", {
		homePage = new HomePage(new HtmlUnitDriver())         
	}
	and "that the user is on the home page", {
		homePage.open(webtest_home);
	}
	then "the current application version number should be displayed", {
		homePage.text.shouldHave "Game Of Life version "
	}
}

