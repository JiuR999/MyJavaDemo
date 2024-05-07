package pojo

data class Student(val id:String,val name:String,val age:Int){
    fun study(name: String){
        println("${name}正在学习")
    }

}
