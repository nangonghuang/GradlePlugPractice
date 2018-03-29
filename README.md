# GradlePlugPratice

感谢 [如何使用Android Studio开发Gradle插件](http://blog.csdn.net/sbsujjbcy/article/details/50782830)


参考 [gradle文档](https://docs.gradle.org/current/userguide/custom_plugins.html), 这里是[个人很粗糙的翻译](https://github.com/nangonghuang/test/blob/master/Gradle%20User%20Guide/Chapter%2041.md)

* v1.0.0 主要是最原始的输出字符串功能

   * 发布插件到本地repo ： terminal执行 : gradlew uploadArchives

   * 执行task看到输出字符串: terminal执行 : gradlew testTask
   
* v1.1.0 增加统计gradle任务执行时间的代码