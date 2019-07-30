
## Chapter3 数组

要点
- 若长度固定则使用Array，若长度可能变化则使用ArrayBuffer

- 数组提供初始值时不要使用关键字new，如 Array(1, 2, 3)

- 使用 (i) 访问指定下标为i的元素

- 使用 for(elem <- arr) 遍历数组元素

- 使用 for(elem <- arr if elem % 2 == 0) yield elem 生成新数组

- Scala 数组与 Java 数组可以互操作；用ArrayBuffer，使用scala.collection.JavaConversion中的转换函数

- Array与ArrayBuffer的API
    - +=，arr += 1
    - ++=，arr ++= Array(4, 5, 6)
    - arr.trimEnd(count)
    - arr.insert(i, 7, 8, 9)
    - arr.remove(i, count)
    - arr.remove(i)，相当于 arr.remove(i, 1)
    - toArray()/toBuffer() 