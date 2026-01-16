import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to home page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click Make Appointment button (updated locator)
WebUI.click(findTestObject('Object Repository/btn_MakeAppointment'))

// Fill username
WebUI.setText(findTestObject('Object Repository/input_Username'), 'John Doe')

// Fill password
WebUI.setText(findTestObject('Object Repository/input_Password'), 'ThisIsNotAPassword')

// Click Login button
WebUI.click(findTestObject('Object Repository/btn_Login'))

// Add additional steps to verify login success or appointment page can be here

// Close browser
WebUI.closeBrowser()
