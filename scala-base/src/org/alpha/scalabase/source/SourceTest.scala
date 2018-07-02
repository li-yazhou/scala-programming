package org.alpha.scalabase.source

import java.io.{File, FileInputStream}

import scala.io.Source


/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/2 21:31
  */
object SourceTest {

    def main(args: Array[String]): Unit = {
        readFile()
        println("-" * 50)
        readDigit()
        println("-" * 50)
        readBinFile()
    }


    /**
      * 使用Java的FileInputStream类读取二进制文件
      */
    def readBinFile(): Unit = {
        val filePath = "D:/workspace-2018/Java-workspace/IdeaProjects/scala-core/scala-base/resources/source.txt"
        val file = new File(filePath)
        val in = new FileInputStream(file)

        val bytes = new Array[Byte](file.length().toInt)
        in.read(bytes)
        in.close()

        println(bytes)
    }


    def readDigit(): Unit = {
        // val age = scala.io.readInt()
        val filePath = "D:/workspace-2018/Java-workspace/IdeaProjects/scala-core/scala-base/resources/numbers.txt"
        val source = Source.fromFile(filePath, "UTF-8")
        val tokens = source.mkString.split("\\s+")
        val numbers = for (w <- tokens) yield w.toDouble
        for (number <- numbers) {
            print(number + ", ")
        }
        println()

        val numbers2 = tokens.map(_.toDouble)
        for (number <- numbers2) {
            print(number + ", ")
        }
        println()
    }


    /**
      * 将文件读为一个迭代器
      * 将文件读为字符串数组
      * 将文件读为一个字符串
      */
    def readFile(): Unit = {
        val file = "source.txt"
        val filePath = "D:/workspace-2018/Java-workspace/IdeaProjects/scala-core/scala-base/resources/source.txt"
        val source = Source.fromFile(filePath, "UTF-8")

        val lineIterator = source.getLines()
        var lineNum = 1
        for (line <- lineIterator) {
            println(lineNum + "  " + line)
            lineNum += 1
        }
        source.close()

        println("-"*10)
        val source2 = Source.fromFile(filePath, "UTF-8")
        val lines: Array[String] = source2.getLines.toArray
        for (line <- lines) {
            println(line)
        }
        source2.close()

        println("-"*10)
        val source3 = Source.fromFile(filePath, "UTF-8")
        val content: String = source3.mkString
        println(content)
        source3.close()


    }

}
