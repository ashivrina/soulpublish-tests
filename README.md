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
<a target="_blank" href="https://jenkins.autotests.cloud/job/TheSoulPublishing">jenkins.autotests.cloud/job/TheSoulPublishing</a>

# USAGE examples

### To run tests remotely, fill remote.properties or pass the value:

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
