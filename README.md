levelup-java-examples
=====================

[![Build Status](https://travis-ci.org/leveluplunch/levelup-java-exercises.png?branch=master)](https://travis-ci.org/leveluplunch/levelup-java-examples)


Levelup [Java examples](http://www.leveluplunch.com/java/examples/) is a series of java examples that attempt to cross cut libraries such as straight up java, [Google Guava](https://code.google.com/p/guava-libraries/), [Apache commons](http://commons.apache.org/), [Spring IO](http://spring.io/), [Joda Time](http://www.joda.org/joda-time/), [Hamcrest](https://code.google.com/p/hamcrest/), [Jackson JSON/XML processor](http://wiki.fasterxml.com/JacksonHome), [jsonpath](http://goessner.net/articles/JsonPath/), [Junit](http://junit.org/) and much more...


## Staying in touch

* [leveluplunch.com](http://www.leveluplunch.com)
* [Twitter](https://twitter.com/leveluplunch)
* [Google plus](https://plus.google.com/+Leveluplunch)
* [Facebook](https://www.facebook.com/leveluplunch)
* [Youtube channel](https://www.youtube.com/user/LevelUpLunch)
	
## License

Level up lunch is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

To run inside a docker container
--------------------------------

You can now build, package and run this microservice using Docker.

Now you can build your docker image by entering from a terminal where you have access to Docker, execute the following command:

```shell
> ./mvnw clean package docker:build
```

Even push it to a repository of your choice:

```shell
> ./mvnw clean package docker:build -DpushImage
```
