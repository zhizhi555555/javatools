### Redis 有哪些数据类型，可参考《Redis常见的5种不同的数据类型详解》

### Redis 介绍

### Redis 内部结构

### Redis 使用场景


### Redis 持久化机制，可参考《使用快照和AOF将Redis数据持久化到硬盘中》

### Redis 集群方案与实现

### Redis 为什么是单线程的？

>  因为CPU不是Redis的瓶颈。Redis的瓶颈最有可能是机器内存或者网络带宽。（以上主要来自官方FAQ）既然单线程容易实现，而且CPU不会成为瓶颈，那就顺理成章地采用单线程的方案了。关于redis的性能，官方网站也有，普通笔记本轻松处理每秒几十万的请求，参见：How
  fast is Redis?
  
### 如果万一CPU成为你的Redis瓶颈了，或者，你就是不想让服务器其他核闲置，那怎么办？

> 那也很简单，你多起几个Redis进程就好了。Redis是keyvalue数据库，又不是关系数据库，数据之间没有约束。只要客户端分清哪些key放在哪个Redis进程上就可以了。redis-cluster可以帮你做的更好。  

### 缓存雪崩、缓存穿透、缓存预热、缓存更新、缓存降级

![缓存雪崩、缓存穿透、缓存预热、缓存更新、缓存降级](https://github.com/zhizhi555555/javatools/blob/master/src/main/java/redis/redis10.md)
### 使用缓存的合理性问题

### Redis常见的回收策略
