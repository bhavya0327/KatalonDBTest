import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration

// 1. Open Browser
WebUI.openBrowser('')
WebUI.maximizeWindow()

// 2. Format the URL with credentials
//
String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth"

// 3. Navigate directly (Bypasses the broken CDP system)
WebUI.navigateToUrl(url)

// 4. Verification
WebUI.waitForPageLoad(5)
WebUI.verifyTextPresent("Congratulations!", false)