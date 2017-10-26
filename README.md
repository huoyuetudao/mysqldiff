# mysqldiff


1. 两个 MYSQL 数据库对象结构快速比对工具 （比如：本地测试库、远程运维库表结构、表中列等对比）

2. 比对结果导出EXCEL 存放于 “工程根目录”/export/ 目录下

3. 比对的对象包括 表、表列、表索引、表分区差异、触发器代码差异、存储过程代码差异，函数代码差异 和 对象是否存在等信息

4. 运行 cn.guzt.test.AppTest 中的 test方法即可（设置你的JDBC信息）  一般2秒左右即可出比对结果

5. 工程所需的jar 在 lib目录下
