$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/aboutus.feature");
formatter.feature({
  "name": "feature to test about us button functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check about us page is displayed on clicking about us button",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [4162606152b299039fed5fbda88c9c5d, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.Y7pgzL}, goog:chromeOptions: {debuggerAddress: localhost:37473}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4162606152b299039fed5fbda88c9c5d\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/aboutus.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "click on About us button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_About_us_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view About us Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_About_us_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/carlisting.feature");
formatter.feature({
  "name": "Feature to test Car Listing page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check CarListing page is displayed on clicking CarListing button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view Car Listing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom unknown error: cannot determine loading status\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [1274a6d73cf34bc753f7667515d0933c, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.RtaClU}, goog:chromeOptions: {debuggerAddress: localhost:38621}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1274a6d73cf34bc753f7667515d0933c\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/carlisting.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check cars are displayed on selecting brand type and fuel type",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Brand Type",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.select_Brand_Type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Fuel Type",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.select_Fuel_Type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Find Your Car",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Find_Your_Car()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view Car Listings",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listings()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the details of the car is displayed on clicking on view details button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view Car Listings",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on view details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_view_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to view car details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.the_user_should_be_able_to_view_car_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Accessories button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Accessories_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all the accessories are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.all_the_accessories_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom unknown error: cannot determine loading status\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [0dd1535ddf80f8fe9de9ea3c4a55ccb3, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.6VEzEi}, goog:chromeOptions: {debuggerAddress: localhost:36389}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0dd1535ddf80f8fe9de9ea3c4a55ccb3\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/carlisting.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check functionality of prev and next buttons",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view Car Listings",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listings()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on view details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_view_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on prev button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_prev_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view prev image",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_prev_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on next button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view next image",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_next_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check functionality of Vehicle Overview button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [ef7ac90eb885447f8faae2d0aeab5a45, clickElement {id\u003d012542bb-1457-4b3a-af6e-9ba5a7f898f4}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.BYocS3}, goog:chromeOptions: {debuggerAddress: localhost:46867}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[RemoteWebDriver: chrome on LINUX (ef7ac90eb885447f8faae2d0aeab5a45)] -\u003e xpath: //*[@id\u003d\"navigation\"]/ul/li[3]/a]\nSession ID: ef7ac90eb885447f8faae2d0aeab5a45\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\n\tat PageObject.carlistingpage.Carlistingbtn(carlistingpage.java:39)\n\tat StepDefinitions.Aboutusstep.click_on_CarListing_button(Aboutusstep.java:90)\n\tat ✽.user clicks on CarListing button(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/carlisting.feature:37)\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be able to view Car Listings",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listings()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on view details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_view_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Vehicle Overview button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Vehicle_OSverview_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view overview of the vehicle",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_overview()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [2012fa9ab997b13c460dc6648f0d9392, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.TORf8c}, goog:chromeOptions: {debuggerAddress: localhost:44187}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2012fa9ab997b13c460dc6648f0d9392\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/carlisting.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check whether the booking is done by the user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Login as customer",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.login_as_customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sign in as admin",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.sign_in_as_admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on bookings",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_bookings()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on New",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_New()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check whether the customer name is viewed on bookings",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.check_whether_the_customer_name_is_viewed_on_bookings()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To book the car by selecting from date, to date and a message",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on CarListing button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_CarListing_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on view details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_view_details()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [12f1b51b20c546fcbaa93294a029d98c, findElement {using\u003dxpath, value\u003d/html/body/section[2]/div/div/div/div[2]/div[2]/a}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.al8o4N}, goog:chromeOptions: {debuggerAddress: localhost:36261}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 12f1b51b20c546fcbaa93294a029d98c\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:351)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:343)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\n\tat PageObject.carlistingpage.Viewdetailsbtn(carlistingpage.java:59)\n\tat StepDefinitions.Aboutusstep.click_on_view_details(Aboutusstep.java:127)\n\tat ✽.click on view details(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/carlisting.feature:52)\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be able to view Car Listings",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Car_Listings()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select From date",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.select_From_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select To date",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.select_To_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Type a message1",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.type_a_message1()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/homepage.feature");
formatter.feature({
  "name": "Feature to test FAQs button functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check FAQs page is displayed on clicking faqs button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on FAQs button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_FAQs_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view FAQs Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_FAQs_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Contact us page functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Contact us button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Contact_us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view Contact us Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Contact_us_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type your full name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.type_your_full_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type your email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.type_your_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "your phone number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.your_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type a message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.type_a_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on send message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_send_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should view SUCCESS",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_view_SUCCESS()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Admin sign in page is displayed on clicking Admin button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Admin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Admin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view Admin signin Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_view_Admin_signin_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Login page is displayed on clicking Login/Register button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Login/Register button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Login_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_view_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [cbc486f78d1753e171243deb5408a290, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.0XYGlI}, goog:chromeOptions: {debuggerAddress: localhost:40889}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: cbc486f78d1753e171243deb5408a290\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/homepage.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check privacy policy page and Terms of use page is displayed on clicking privacy and terms of use button respectively",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on privacy button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_privacy_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to view privacy Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_view_Privacy_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on terms of use button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_termsofuse_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to Terms and Conditions Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_Terms_and_Conditions_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check functionality of Subscribe button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "enter email address",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.enter_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on subscribe button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_subscribe_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [7938a165d7e440a0a4143a1402b0e2ba, findElement {using\u003dname, value\u003demailsubscibe}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.2ms4Gl}, goog:chromeOptions: {debuggerAddress: localhost:43713}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7938a165d7e440a0a4143a1402b0e2ba\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:351)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:343)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\n\tat PageObject.Homepage.SubscribeBtn(Homepage.java:87)\n\tat StepDefinitions.Aboutusstep.click_on_subscribe_button(Aboutusstep.java:330)\n\tat ✽.click on subscribe button(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/homepage.feature:38)\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be able to see popup message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_see_popup_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_navigates_to_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash\nfrom tab crashed\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [7d1790a55219e3e1c4d990c2f48a0477, get {url\u003dhttps://carrental.neohire.io/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /tmp/.com.google.Chrome.eNUzqR}, goog:chromeOptions: {debuggerAddress: localhost:43197}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: LINUX, proxy: Proxy(), se:cdp: ws://10.56.17.3:4444/sessio..., se:cdpVersion: 96.0.4664.45, se:vnc: ws://10.56.17.3:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://10.56.17.3:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7d1790a55219e3e1c4d990c2f48a0477\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:296)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:975)\n\tat StepDefinitions.Aboutusstep.user_navigates_to_url(Aboutusstep.java:68)\n\tat ✽.user navigates to url(file:///home/coder/project/workspace/CarRentalProject/src/test/resources/Features/homepage.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user shoud be able to view carrental portal",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_shoud_be_able_to_view_carrental_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check functionality Service HelpLine button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Service Helpline option",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.click_on_Service_Helpline_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to see a popup message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Aboutusstep.user_should_be_able_to_see_a_popup_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});