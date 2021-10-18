# So these are the autotests for TheSoul Publishing site

The main page of the site is here: https://www.thesoul-publishing.com/
And looks like this:
<img width="1434" alt="main" src="https://user-images.githubusercontent.com/32490159/137587615-1489d770-a7c1-4f87-ab88-c22edec606e2.png">

# Project in Allure TestOps with manual & automated tests

Click <a target="_blank" href="https://allure.autotests.cloud/project/551/dashboards">here</a> to see TheSoul Publishing project in  Allure TestOps

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
