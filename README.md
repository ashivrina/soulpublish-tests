**Made with** ![java](https://user-images.githubusercontent.com/32490159/138323715-ec77740d-0eb1-42ad-9a38-17b0a4061a5b.jpeg)
![gradle](https://user-images.githubusercontent.com/32490159/138323739-7b09ca9d-f8fe-4b5a-9494-9858acf957e1.png)
![junit](https://user-images.githubusercontent.com/32490159/138323764-ed4401f6-2c32-404f-af38-8bf6c040cc33.png)
![selenide](https://user-images.githubusercontent.com/32490159/138323776-007f43b5-8819-4e46-90e5-73254f6b854a.jpeg)
![jenkins](https://user-images.githubusercontent.com/32490159/138324083-1992937f-946f-4b1d-9fe3-dbe3155ac0d0.jpeg)
![allure](https://user-images.githubusercontent.com/32490159/138323809-440254e7-c44f-4129-a2d1-dcdfde4eb1fa.jpeg)
![Telegram-logo](https://user-images.githubusercontent.com/32490159/138324034-2017d6c1-7e52-4645-9d10-e09d56a872d2.png)

# So these are the autotests for TheSoul Publishing site

The main page of the site is here: https://www.thesoul-publishing.com/
<br>And looks like this:
<img width="1434" alt="main" src="https://user-images.githubusercontent.com/32490159/137587615-1489d770-a7c1-4f87-ab88-c22edec606e2.png">

# Allure TestOps

A list of test cases - automated and not (yet ;-)) can be found in Allure TestOps.
Click <a target="_blank" href="https://allure.autotests.cloud/project/551/dashboards">here</a> to see TheSoul Publishing project there.

Here are the test cases:
<img width="1434" alt="Allure_manual_and_auto-success" src="https://user-images.githubusercontent.com/32490159/137683824-d3883977-d791-4075-9d58-e42a9c8c252d.png">

And this is the test launch overview - all 6 tests passed, yay 😺
<img width="1435" alt="Launch-overview" src="https://user-images.githubusercontent.com/32490159/137684031-cfe3cc8c-8770-4e86-b765-5865a647bd19.png">

# Jenkins job
Jenkins is an automation server which lets us run the tests.
Click <a target="_blank" href="https://jenkins.autotests.cloud/job/TheSoulPublishing">here</a> to see the job for TheSoul Publishing site. 
Here's a sneak peak of how you can launch tests and which parameters you can specify:
<img width="847" alt="jenkins-build-with-parameters" src="https://user-images.githubusercontent.com/32490159/138116518-a1e98f2d-0cf1-4c7b-a93b-0f7791847b7a.png">

# Telegram notifications
Notifications about test results are sent to Telegram:
<br>![telegram](https://user-images.githubusercontent.com/32490159/138120659-975c438d-2012-4e2f-8c73-7ef183070eb1.jpg)

# Example of test video
![test-video](https://user-images.githubusercontent.com/32490159/138120384-13e28d7f-9b45-48fa-b47c-eb8ce0ef8f1c.gif)

# USAGE examples

### To run tests remotely, create and fill the remote.properties file or pass the value of:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url of selenoid)
* videoStorage (url where videos of tests are stored)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```
