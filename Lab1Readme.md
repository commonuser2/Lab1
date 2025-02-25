# Lab1
这次Lab要求：
| 项目 | 分数 | 说明 |
| --- | --- | --- |
| 文本读取 | 30 | 读取文本中的学生姓名和成绩并选择合适的数据结构存储 |
| 平均成绩 | 30 | 计算所有学生的正确的平均成绩并输出 |
| 成绩排序 | 30 | 对学生按照成绩从高到低排序并输出学生姓名 |
| Readme文档 | 10 | 实验报告的完整性 |

## 操作步骤

### 文本读取：
通过查阅书籍以及电子资料，我决定使用`File`和`Scanner`来找到并读取文件中的具体内容，并创建一个`student`的类来存储学生姓名和成绩，同时创建一个数组用以储存所有学生数据。
### 平均成绩：
通过`for`循环累加所有学生的成绩，并除以数组长度`students.size()`来获得平均成绩，最后用`System.out.println()`输出。
### 成绩排序：
我本来是想效仿上学期学习c时写一个冒泡排序，后来得知可以直接使用方法实现排序这一效果，经过查阅决定使用 `Collections.sort()` 方法；后来IDE提示我直接用`List.sort()`替换`Collections.sort()`，这个方法看起来更加的简便。随后使用了`for (元素类型 元素变量 : 数组或集合) { // 循环体，对每个元素执行的操作 }`这一形式输出学生姓名，这一种循环方法也是c中没有的，比较方便简洁。
### 运行结果展示：
![Lab结果](https://github.com/commonuser2/Lab1/blob/master/Lab1%E7%BB%93%E6%9E%9C.png)
<!--stackedit_data:
eyJoaXN0b3J5IjpbODI0NjUwMjMxLC03NzM4ODg2OTIsODI0Nj
UwMjMxLDIwOTExMTk1OTEsLTE5OTQ0MDkyMDgsNjg3OTQ0MzQ4
LDY3MDg2Mzk3OF19
-->