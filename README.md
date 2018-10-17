MHW Mobile
==============

Android Application for Monster Hunter World Collection. Build with Kotlin & Java Language

## Getting Start

You can open this project with Android Studio

## Prerequisites

What things you need to install the software and install them :

* Java 8
* Gradle

If you using Mac OS, you could install this with [Homebrew](homebrew.sh)

```sh
$ brew cask install java8
$ brew install gradle
```

## Installing

Create first folder repo, then clone project

```sh
$ cd Workspace/android/
$ git clone https://github.com/mohamad-rizki/mhw-mobile
```

### Testing

To testing with JVM, just running this command

```sh
$ ./gradlew test
```

Will generate report for testing. In directory `app/build/reports/tests`

## Built With

* Android Support libraries
* [Retrofit 2](http://square.github.io/retrofit/) - For Networking
* [RxJava](https://github.com/ReactiveX/RxJava) and [RxAndroid](https://github.com/ReactiveX/RxAndroid) - Better coding
* [Butterknife](https://github.com/JakeWharton/butterknife) - Used to View Injection
* [Timber](https://github.com/JakeWharton/timber) - For better logging

## Authors

* [M Rizki Dafianto](https://github.com/mohamad-rizki)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
