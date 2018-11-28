# MVVMHabitComponent
关于Android的组件化，相信大家并不陌生，网上谈论组件化的文章，多如过江之鲫，然而一篇基于MVVM模式的组件化方案却很少。结合自身的调研和探索，在此分享一篇基于[MVVMHabit](https://github.com/goldze/MVVMHabit)框架的一套Android-Databinding组件化开发方案。目标是让学习了此方案的开发人员都可以搭建MVVM组件化项目。

<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=a8db5d8f95bc432606fd79c3d6e494e8a97401671c27de4a8fe975382a441a3e"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="MVVMHabit-Family" title="MVVMHabit-Family"></a>
##
> 如果不了解MVVMHabit的可以先学习下：[戳我去MVVMHabit](https://github.com/goldze/MVVMHabit)
## 整体架构
<img src="./img/img1.png" width="640" hegiht="640" align=center />

## 1、前言

### 1.1、MVVM的优势
想必熟悉前端的朋友对MVVM非常了解，这种模式在目前web前端火的一塌糊涂，比如vue、angular、react都是采用MVVM设计模式实现的前端框架。而在Android开发中，MVVM并不是唯一的架构模式，最常用的可能是MVC模式（通常不是理想的实现）。比较流行的是MVP，它在某种程度上与MVVM模式非常相似。不过MVVM在MVP的基础上更进一步的提高了开发效率，拥有了数据绑定的能力。说到Android MVVM，很自然的联想到谷歌出的Databinding，它提供了xml与java的完美绑定，就像html与js的绑定一样。虽然Android端的MVVM还不是很火，但我相信它是一种趋势。趁着web前端MVVM的热度，移动前端也应该崛起了。
### 1.2、组件化开发
代码是死的，产品是活的。在日常开发中，各种各样频繁变动的需求，给开发上带来了不小的麻烦。为了尽量把代码写“活”，所以出现了设计模式。但光有设计模式，还是很难满足产品BT的需求。

对于简单的小项目，大多都采用的是单一工程，独立开发。由于项目不大，编译速度及维护成本这些也在接受范围之内。而对于做好一个App产品，这种多人合作、单一工程的App架构势必会影响开发效率，增加项目的维护成本。每个开发者都要熟悉如此之多的代码，将很难进行多人协作开发，而且Android项目在编译代码的时候电脑会非常卡，又因为单一工程下代码耦合严重，每修改一处代码后都要重新编译打包测试，导致非常耗时，最重要的是这样的代码想要做单元测试根本无从下手，所以必须要有更灵活的架构代替过去单一的工程架构。

从下图可以看出，使用组件化方案架构，各个模块之间将是独立无耦合的，所有组件寄托于宿主App，独立于其他组件之外，各自编译自己的模块，有利于多人团队协作开发。

<img src="./img/img2.png" width="480" hegiht="480" align=center />

### 1.3、MVVM模式 + 组件化
光说理论没用，来点实际的东西，这里要提两个重要的框架。

- **[MVVMHabit](https://github.com/goldze/MVVMHabit)**：基于谷歌最新AAC架构，MVVM设计模式的一套快速开发库，整合Okhttp+RxJava+Retrofit+Glide等主流模块，满足日常开发需求。使用该框架可以快速开发一个高质量、易维护的Android应用。</br>
- **[ARouter](https://github.com/alibaba/ARouter)**：阿里出的一个用于帮助 Android App 进行组件化改造的框架 —— 支持模块间的路由、通信、解耦。

**MVVMHabit + ARouter**：MVVM模式 + 组件化方案，前者是设计模式，后者是方案架构，两者并用，相得益彰。有这两个框架作支撑，事半功倍，可快速开发组件化应用。
## 2、项目搭建
<img src="./img/img3.jpg" width="480" hegiht="480" align=center />
### 2.1、创建项目
搭建组件化项目与单一工程项目一样，先通过Android Studio创建一个常规项目。

File->New->New Project... 

创建的这个项目将其定义为“宿主”(大多数人都是这种叫法)，也可以叫空壳项目。它没有太多逻辑，它的职责是将分工开发的组件合而为一，打包成一个可用的apk。

### 2.2、组件分离

### 2.3、gradle配置

## 3、方案分析