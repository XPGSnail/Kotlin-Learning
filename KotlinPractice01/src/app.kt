import javafx.scene.Parent

fun main(args: Array<String>) {
    println("hello world!")
    Student().writeHomework()
    Person("Person").eat()
    Person1("Person1")
    Person1("Panda",18)
}

class Student constructor(val name: String = "lilei") {

    fun writeHomework() {
        println("$name 今天的作业写完了！可以去撒欢了")
    }

}

class Person constructor(var name: String) {
    init {
        println("大家好我是:$name")
    }

    fun eat() {
        name = name + "1"
        println("$name 吃饭喽")
    }
}

class Person1(val name: String) {
    init {
//        name = name+"2"
        println("大家好我是:$name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("constructor $name $age")
    }
}