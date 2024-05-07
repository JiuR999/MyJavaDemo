import pojo.Student
import java.util.Scanner

class Test_01 {

}
fun main() {
    //val c = add(5,6);
    val sc = Scanner(System.`in`)
    //val stu = Student("512021","张旭",18)
//    for(i in 0..10){
//        print("第${i+1}次输入:")
//        val num = sc.nextInt()
//        var status = ""
//        when (num){
//            10->println("l")
//            20->println("h")
//            else-> println("不合法")
//        }
//
//    }
    println(add())
    //println(stu.toString()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
}
fun add(a:Int=10,b:Int=10): Int {
    return a+b;
}