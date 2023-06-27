$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AdminDashboard.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Dashboard Functionality for Car Rental Website",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 831704475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1828045308,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33918717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 301276361,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 355626249,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1918513429,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify Reg Users Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-reg-users-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "admin click on Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on Reg Users Full Detail link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "admin should be navigated to Registered Users Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Dashboard()"
});
formatter.result({
  "duration": 54343387,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[2]/nav/ul/li[2]/a\"}\n  (Session info: chrome\u003d113.0.5672.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.1\u0027, revision: \u0027eb2032df7f\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [0d58e8485086e16b90f18de1e1e5b1ad, findElement {using\u003dxpath, value\u003d/html/body/div[2]/nav/ul/li[2]/a}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.63, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: /tmp/.com.google.Chrome.6GOGBD}, goog:chromeOptions: {debuggerAddress: localhost:45613}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: linux, proxy: Proxy(), se:bidiEnabled: false, se:cdp: ws://172.17.0.2:4444/sessio..., se:cdpVersion: 113.0.5672.63, se:vnc: ws://172.17.0.2:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://172.17.0.2:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 0d58e8485086e16b90f18de1e1e5b1ad\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\n\tat pageObject.DashBoardPage.dashboardButton(DashBoardPage.java:57)\n\tat stepDefinition.Stepdefinition.admin_click_on_Dashboard(Stepdefinition.java:85)\n\tat ✽.When admin click on Dashboard(src/test/resources/Features/AdminDashboard.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.click_on_Reg_Users_Full_Detail_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Registered_Users_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 128448204,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 798103478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1833953668,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 34253121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 297551186,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 357172320,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1926118090,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Listed Vehicles Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-listed-vehicles-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "admin click on Listed Vehicles Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "admin should be navigated to Manage Vehicles Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Listed_Vehicles_Full_Detail_link()"
});
formatter.result({
  "duration": 88350843,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/a\"}\n  (Session info: chrome\u003d113.0.5672.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.1\u0027, revision: \u0027eb2032df7f\u0027\nSystem info: os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.10.162+\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCommand: [897831bffb1ca63653f8aee3237da201, findElement {using\u003dxpath, value\u003d/html/body/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/a}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.63, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: /tmp/.com.google.Chrome.6Zs2iv}, goog:chromeOptions: {debuggerAddress: localhost:39723}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: linux, proxy: Proxy(), se:bidiEnabled: false, se:cdp: ws://172.17.0.2:4444/sessio..., se:cdpVersion: 113.0.5672.63, se:vnc: ws://172.17.0.2:4444/sessio..., se:vncEnabled: true, se:vncLocalAddress: ws://172.17.0.2:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 897831bffb1ca63653f8aee3237da201\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\n\tat org.openqa.selenium.remote.TracedCommandExecutor.execute(TracedCommandExecutor.java:51)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\n\tat pageObject.DashBoardPage.listVehButton(DashBoardPage.java:69)\n\tat stepDefinition.Stepdefinition.admin_click_on_Listed_Vehicles_Full_Detail_link(Stepdefinition.java:105)\n\tat ✽.When admin click on Listed Vehicles Full Detail link(src/test/resources/Features/AdminDashboard.feature:17)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Vehicles_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 115257941,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 817365502,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1832927491,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33398453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 285680876,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 597893157,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1665477286,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Total Bookings Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-total-bookings-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "admin click on Total Bookings Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "admin should be navigated to Manage Bookings Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Total_Bookings_Full_Detail_link()"
});
formatter.result({
  "duration": 1899895,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Total_Bookings_Full_Detail_link(Stepdefinition.java:117)\n\tat ✽.When admin click on Total Bookings Full Detail link(src/test/resources/Features/AdminDashboard.feature:21)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Bookings_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 116021186,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 902819241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1854784721,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33931260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 313476263,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 874784432,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1418455210,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify Listed Brands Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-listed-brands-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "admin click on Listed Brands Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "admin should be navigated to Manage Brands Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Listed_Brands_Full_Detail_link()"
});
formatter.result({
  "duration": 302966,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Listed_Brands_Full_Detail_link(Stepdefinition.java:129)\n\tat ✽.When admin click on Listed Brands Full Detail link(src/test/resources/Features/AdminDashboard.feature:25)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Brands_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 102148153,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 801541007,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1832822069,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33356974,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 296013545,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 591101792,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1672338416,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify Subscibers Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-subscibers-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "admin click on Subscibers Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "admin should be navigated to Manage Subscribers Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Subscibers_Full_Detail_link()"
});
formatter.result({
  "duration": 281772,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Subscibers_Full_Detail_link(Stepdefinition.java:141)\n\tat ✽.When admin click on Subscibers Full Detail link(src/test/resources/Features/AdminDashboard.feature:29)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Subscribers_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 146536614,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 901218570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1815536844,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33300212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 287910344,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 584176048,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1653789554,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify Queries Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-queries-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "admin click on Queries Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "admin should be navigated to Manage Contact Us Queries Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Queries_Full_Detail_link()"
});
formatter.result({
  "duration": 285131,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Queries_Full_Detail_link(Stepdefinition.java:153)\n\tat ✽.When admin click on Queries Full Detail link(src/test/resources/Features/AdminDashboard.feature:33)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Contact_Us_Queries_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 121944048,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 915476887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1818971936,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33294624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 289553885,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 874050339,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1438903697,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify Testimonials Page in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-testimonials-page-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "admin click on Testimonials Full Detail link",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "admin should be navigated to Manage Testimonials Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Testimonials_Full_Detail_link()"
});
formatter.result({
  "duration": 246645,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Testimonials_Full_Detail_link(Stepdefinition.java:165)\n\tat ✽.When admin click on Testimonials Full Detail link(src/test/resources/Features/AdminDashboard.feature:37)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.admin_should_be_navigated_to_Manage_Testimonials_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 101647355,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "admin launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin opens url \"https://carrental.neohire.io/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "admin should able to see the admin signin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin enters username as \"admin\"  and password as \"Test@12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "admin should able to view car rental portal | admin panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_launch_the_browser()"
});
formatter.result({
  "duration": 798781610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://carrental.neohire.io/admin/",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.admin_opens_url(String)"
});
formatter.result({
  "duration": 1805524809,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_see_the_admin_signin_page()"
});
formatter.result({
  "duration": 33341139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    },
    {
      "val": "Test@12345",
      "offset": 51
    }
  ],
  "location": "Stepdefinition.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 293672741,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_login()"
});
formatter.result({
  "duration": 591712535,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.admin_should_able_to_view_car_rental_portal_admin_panel()"
});
formatter.result({
  "duration": 1657940082,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify Logout Functionality in Dashboard",
  "description": "",
  "id": "admin-dashboard-functionality-for-car-rental-website;verify-logout-functionality-in-dashboard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "admin click on Account option",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "clicks on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "admin navigates to Admin|SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.admin_click_on_Account_option()"
});
formatter.result({
  "duration": 237500,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinition.Stepdefinition.admin_click_on_Account_option(Stepdefinition.java:177)\n\tat ✽.When admin click on Account option(src/test/resources/Features/AdminDashboard.feature:41)\n",
  "status": "pending"
});
formatter.match({
  "location": "Stepdefinition.clicks_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.admin_navigates_to_Admin_SignIn_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 117101026,
  "status": "passed"
});
});