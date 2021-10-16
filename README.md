# Project in Allure TestOps with manual & automated tests

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

Serve report:
```bash
allure serve build/allure-results
```

