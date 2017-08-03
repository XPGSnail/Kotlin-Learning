fun main(args: Array<String>) {
    Animal("Cat").play()
    Animal("bird",10).sleep()
    Dog("erha", "male").play()
    Dog("xiaohua", "female", 3)
    erHa("xiaoming", "male", 4)
    erHa("xiaohan","female")
    Bird("xiaomiao",1).flying()
    Bird("111",2).Inner().test()
}

open class Animal(var name: String) {

    open val age: Int = 0

    constructor(name: String, age: Int) : this(name)

    init {
        println("animal: $name,$age")
    }

    fun play() {
        println("$name is playing")
    }

    open fun sleep() {
        println("$name is sleeping")
    }
}

open class Dog(name: String, var sex: String) : Animal(name) {
    override var age: Int = 0

    constructor(name: String, sex: String, age: Int) : this(name, sex) {
        this.age = age
        println("Dog $name，$sex，$age")
        super.play()
    }

    final override fun sleep() {
        println("dog is sleeping")
        super.sleep()
    }
}

class erHa(name: String, sex: String, int: Int) : Dog(name, sex, int) {
    constructor(name: String, sex: String) : this(name, sex, 0) {
        sleep()
        println("erHa constructor")
    }
}

interface fly{
    fun flying()
}

class Bird(name:String,age:Int):fly,Animal(name,age) {

    override fun flying() {
        println("$name age:$age is flying")
    }

    inner class Inner(){
        fun test(){
            println("inner class")
            this@Bird.flying()
        }
    }
}