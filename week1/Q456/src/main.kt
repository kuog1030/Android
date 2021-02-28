open class Human(var name: String){
    open fun attack() {
        println("$name uses Fist Attack!")
    }

    open var hasMana: Boolean = false
}

class Mage(name: String) : Human(name){
    override fun attack(){
        println("$name uses Fireball!")
    }
    override var hasMana = true
}

fun main(args: Array<String>) {
    val link = Human("Link")
    link.attack()

    val zelda = Mage("Zelda")
    zelda.attack()

    print("${link.hasMana}, ${zelda.hasMana}")
}