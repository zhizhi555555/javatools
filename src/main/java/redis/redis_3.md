## redis 常用命令

### 全局命令

 keys *  查看所有键

 dbsize 查看的是当前所在redis数据库的键总数 如果存在大量键，线上禁止使用此指令

 exists key 检查键是否存在，存在返回1，不存在返回0

 del key 删除键，返回删除键个数，删除不存在键返回0

 expire key seconds  设置键过期的时间，单位是秒，  //set name lgs  expire name 10 //10秒过期

 ttl key 查看键剩余的过期时间，和expire配合使用

type key 查看键的数据结构类型： //type name  //返回string,键不存在返回none

### 设置获取键值得命令
set name lgs

get name

### 命令执行的顺序

单线程执行：

执行过程：发送指令－〉执行命令－〉返回结果

执行命令：单线程执行，所有命令进入队列，按顺序执行，使用I/O多路复用解决I/O问题

单线程快原因：纯内存访问， 非阻塞I/O（使用多路复用），单线程避免线程切换和竞争产生资源消耗