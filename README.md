<h1>Android Dagger Kotlin Retrofit Glide Demo App</h1>

The primary purpose of this application is for practice and Demonstration of Android Software Engineering concepts and frameworks.
<a href="https://square.github.io/retrofit/"><h2>Retrofit</h2></a>
Retrofit is a type-safe REST client for Android, Java and Kotlin developed by Square. The library provides a powerful framework for authenticating and interacting with APIs and sending network requests with OkHttp. 

This library makes downloading JSON or XML data from a web API fairly straightforward. Once the data is downloaded then it is parsed into a Plain Old Java Object (POJO) which must be defined for each "resource" in the response. A comprehensive guide can be found here <a href="https://guides.codepath.com/android/consuming-apis-with-retrofit"> Link </a>

<a href="https://dagger.dev/"><h2>Dagger 2</h2></a>
Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android. It is an adaptation of an earlier version created by Square and now maintained by Google. You can find google's guide for incorporating Dagger 2 into your Android apps here <a href="https://developer.android.com/training/dependency-injection/dagger-basics">Link</a>

<h2> Image Loading and Caching </h2>
A lot of modern application display images however displaying images from remote sources has a significant on performance. Thankfully there are libraries built to aid us with this particular problem that do most of the heavy lifting from the network calls, resizing to caching. The two most popular are Glide and Picasso.

<ul>
  <li>
<h3><a href="https://square.github.io/picasso/">Picasso</a></h3>
Picasso is a powerful image downloading and caching library for Android. Images add much-needed context and visual flair to Android applications. Picasso allows for hassle-free image loading in your application—often in one line of code! Many common pitfalls of image loading on Android are handled automatically by Picasso:
<ul>
  <li>Handling ImageView recycling and download cancelation in an adapter.</li>
  <li>Complex image transformations with minimal memory use.</li>
  <li>Automatic memory and disk caching.</li>
</ul>

You may find more information about Picasso here <a href="">https://square.github.io/picasso/</a>
  </li>
  <li>
<h3><a href="https://github.com/bumptech/glide">Glide</a></h3>
Glide is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface. Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs. Glide includes a flexible API that allows developers to plug in to almost any network stack. By default Glide uses a custom HttpUrlConnection based stack, but also includes utility libraries plug in to Google's Volley project or Square's OkHttp library instead.

Glide's primary focus is on making scrolling any kind of a list of images as smooth and fast as possible, but Glide is also effective for almost any case where you need to fetch, resize, and display a remote image. Glide takes in to account two key aspects of image loading performance on Android:

<ul>
  <li>The speed at which images can be decoded.</li>
  <li>The amount of jank incurred while decoding images.</li>
</ul>

You can find Glide documentation here <a href="https://bumptech.github.io/glide/">Link</a>
  </li>
