# 遍历器模式

这也是一个比较简单的设计模式，直接看图：

![](http://owx8bh6es.bkt.clouddn.com/2017-10-07%2016-07-17%20%E7%9A%84%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE.png)

图中的 Aggregate 意位 “聚合” ，其实就是我们日常会使用到的
集合类，一个集合类应当提供一个 createIterator() 方法，提供
一个 Iterator 对象以方便客户端对其进行遍历操作，在 Java 中
也的确是这么做的。

将遍历操作包装成这个模式带来什么好处呢？

其实就是，当我们需要位集合添加不同的遍历方式，如逆序，单数优先等
时，仅仅需要：
- 添加一个 Iterator 的子类

客户端即可使用新的 Iterator 子类来进行遍历。