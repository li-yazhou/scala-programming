package org.alpha.scalabase.implicitbase

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

import org.junit.Test

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/11 21:50
  */
class RichFileTest {

    @Test(timeout = 5000)
    def read(): Unit = {
        val filePath = "D:/workspace-2018/Java-workspace/IdeaProjects/scala-core/scala-base/resources/source.txt"
        val file = new File(filePath)
        val richFile = new RichFile(file)
        println(richFile.read)
    }


    /**
      * File to RichFile，利用隐式转换丰富现有类库的功能，关键字 implicit
      * @param from File
      * @return RichFile
      */
    implicit def file2RichFile(from: File) = new RichFile(from)

    @Test(timeout = 5000)
    def fileRead(): Unit = {
        val filePath = "D:/workspace-2018/Java-workspace/IdeaProjects/scala-core/scala-base/resources/source.txt"
        val file = new File(filePath)
        /* 直接使用File对象调用RichFile中的方法 */
        println(file.read)

        val now: Date = new Date
        val simpleDateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss")
        println(simpleDateFormat.format(now))
    }

}
