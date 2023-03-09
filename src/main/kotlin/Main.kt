fun main() {
takeIn("Kevin","Brian")
    ary(8,6,9,24,5,2,98)
    split("Masian")

    var result = join("chair","table","wall", "door")
    println(result)

    var calc =Calculator(20,4)
    calc.add()
    calc.minus()
    calc.div()
    calc.multi()
}

fun takeIn(nam1:String,nam2:String){
    var two = nam1+nam2
    println(two)
    println(nam1.get(0))
}

fun ary(numb1:Int,numb2:Int,numb3:Int,numb4:Int,numb5:Int,numb6:Int,numb7:Int){
    var me = arrayOf(numb1,numb2,numb3,numb4,numb5,numb6,numb7)
    println(me.average())
    println(me.min())
    println(me.max())
}

fun split(name:String){
    println(name)
    for (n in name){
        println(n)
    }
}
fun join(tag1:String,tag2:String,tag3:String,tag4:String):String{
    var that = arrayOf("$tag1,$tag2,$tag3,$tag4")
    return that.contentToString()
}


class Calculator(var num1:Int,var num2:Int){

        fun add(){
            println(num1 + num2)
        }
    fun minus(){
        println(num1 - num2)
    }
    fun multi(){
        println(num1 * num2)
    }
    fun div(){
        println(num1/ num2)
    }



}