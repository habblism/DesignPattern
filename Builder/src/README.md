# 建造者模式

##### **前言**
一直以为 Builder Pattern 就是链式调用的写法，就是所谓的建造者模式，真正来看书时一脸茫然。

##### **介绍**
建造者模式，当一个类的构建过程很复杂时（需要调用很多 setter 方法设置属性，甚至是需要特定的顺序调用），可以使用建造者模式，
来将 **生成一个已经设置完整的实例** 的这个过程独立包装出来。 对于客户端来说，**创建者模式隔离复杂对象的创建和使用，
使得客户端总是使用相同的创建过程可以创建不同类型的产品，而代价是，对于每一种客户端期待的产品，
都必须实现一个 Builder 类，来描述这个创建过程。**


##### **实现**
![UML 图](http://owx8bh6es.bkt.clouddn.com/2017-09-30%2017-08-15%20%E7%9A%84%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE.png)

##### **什么时候使用？**
建造者模式适用情况包括：
 - 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性；
 - 需要生成的产品对象的属性相互依赖，需要指定其生成顺序；

