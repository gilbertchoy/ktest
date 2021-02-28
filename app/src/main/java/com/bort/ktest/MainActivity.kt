package com.bort.ktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*



class MainActivity : AppCompatActivity() {

    //lateinit example - declares variable but not initialized
    private lateinit var latevariable:String

    //nullable - allows the variable to be nullable or not
    private var nully : String ? = null

    //lazy init example
    private val xx: String by lazy{
        test()// wtv comes out of this is set as xx val
    }
    fun test (): String{
        return "sdf"
    }


    class car(val color: String, var windows:Int){
        //this class has color and windows attributes
        var tires: Int ? = null

        fun settires(t:Int){
            tires = t
        }
    }

    //

    //class w/ constructor

//    class Node(var root: Int){
//        var leftchild: Int ? = null
//        var rightchild: Int ? = null
//    }

    class Node(var root: Int){

        var leftchild: Int ? = null
        var rightchild: Int ? = null

//        fun setleftchild( x: Int){
//            leftchild = x
//        }
//        fun setleftchild( x: Int){
//            leftchild = x
//        }
    }

    class Node1(
            var key: Int,
            var left: Node1 ? = null,
            var right: Node1 ? = null){

        init{}

        fun setleft(y:Int){
            left = Node1(3)
        }
    }


    class Node2(fName: String, personAge: Int) {
        val firstName: String
        var age: Int

        // initializer block
        init {
            firstName = fName.capitalize()
            age = personAge

            println("First Name = $firstName")
            println("Age = $age")
        }
    }

    class Node3(var root:Int, var left:Node3 ? = null, var right:Node3 ? = null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //example object
        var truck = car("blue", 4)
        println("car object color: " + truck.color)
        truck.settires(5)
        println("car object tires: " + truck.tires)

    //BINARY TREE
        var zero = Node3(0)
        var one = Node3(1)
        var two = Node3(2)
        var four = Node3(4)
        var five = Node3(5)
        var tree = Node3(3)

        //Binary Tree - preorder traversal
        tree.left = four
        tree.right = five
        four.left = zero
        four.right = one
        five.left = two

        var nodetest2 = Node2("bort", 99)
        nodetest2.age = 69
        println("nodetest age" + nodetest2.age)
        println("nodetest firstName" + nodetest2.firstName)

        var node3 = Node3(5)
        println("Node3 root:" + node3.root);
        println("Node3 left:" + node3.left);
        println("Node3 right:" + node3.right);

        //node3.left = 99
        //node3.right = 98
        println("Node3 root:" + node3.root);
        println("Node3 left:" + node3.left);
        println("Node3 right:" + node3.right);

        //preorder traversal
        fun preordertraversal(node:Node3 ?){
            if(node?.root != null){
                println("preorder traversal: " + node?.root)
                preordertraversal(node?.left)
                preordertraversal(node?.right)
            }
        }

        preordertraversal(tree)

        //postorder traversal
        fun postordertraversal(node:Node3 ?){
            if(node?.root != null){
                postordertraversal((node.left))
                postordertraversal(node.right)
                println("postorder traversal: " + node?.root)
            }
        }

        postordertraversal(tree)

        fun addNode(current: Node3 ?, value: Int){

            if(current.root == null){

            }

            if(value < current.root){
                addNode(current.left, 3)
            }
        }




        var stringit = "aaabbaabb"
        for(ch in stringit){
            println("string letters:"+ch)
            if(ch.equals('a') ) {
                println("equals a")
            }

        }

        val ar1 = intArrayOf(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,6,7,8,8,8,8,9,9,9)
        val ar2 = IntArray(10)

        for ( element in ar1){
            ar2[element-1] = ar2[element-1] + 1
        }

        println("ar2 out")
        printArray1(ar2)


        //if elements left swap with element rightmost of X   X | Y










        //hashmap
        var map = hashMapOf<Int,Int>()
        map.put(1,2)
        map.put(2,3)

        if(map.containsKey(3)){
            map[3] = map[3]?.plus(1)!!
        }
        else{
            map[3] = 0
        }

        for ((key, value) in map) {
            println("array print ${map[key]}")
        }
        //array
        val ar = intArrayOf(1, 2, 3)
        var arr = arrayOfNulls<Int>(100)
        var arr2 = arrayOf(arrayOf(1,2,3),arrayOf(1,2,3),arrayOf(1,2,3))
        var out = arr2[1][1]
        println("berttest array ${arr2[1][1]}")
        for(a in ar){
            //blah
        }



        var socks = 0
        for ((key, value) in map) {
            socks = socks + (value/2)
        }

        var numint = 0
        for ((key, value) in map) {
            numint = numint + value/2
        }

        println("berttest numint: $numint")


        for((key,value) in map) numint = numint + value/2


        val testlist = arrayListOf(1,2,3,4)
        for(s:Int in testlist){
            print("al")
        }

        for (ch in "abc"){
            print(ch + 1)
        }

        for( c in 0 until 9){
            println("berttest c"+c)
        }

        //range for loop
        fun recognize(a:Char) = when (a) {
            in '0' until '9' -> "It's a digit"
            in 'a' .. 'z' -> "It's a letter"
            else -> "I don't know"
        }
        println("berttest recognize" + recognize('3'))


        //bubblesort
        val list = arrayOf(8,4,7,6,2,1,3,9,5)
        for(element in list){
            for(i in 0..list.size-2) {
                if(list[i]<list[i+1]){
                    var temp = list[i]
                    list[i] = list[i+1]
                    list[i+1] = temp
                }
            }
        }
        printArray(list)


        for(i in 0 until 0){
            println("shouldnotprint")
        }




        //mergesort
        //var listm = intArrayOf(8,4,7,6,2,1,3,9,5)
        var listm = intArrayOf(8,5,7,9,2,4,6,3)
        println("mergesort")
        mergesort(listm,0,listm.size-1)
        printArray1(listm)

        //quicksort
//        var ar3 = intArrayOf(8,4,7,6,2,1,3,9,5)
//        println("quicksort")
//        quicksort(ar3,0,ar3.size-1)
//        printArray1(ar3)



    }

    fun quicksort(arr:IntArray, l:Int, r:Int){
        if(l<r){
            var n = partition(arr,l,r)
            quicksort(arr,l,n-1)
            quicksort(arr,n+1,r)
        }

    }

    fun partition(arr:IntArray, l:Int, r:Int):Int{
        var temp = mutableListOf<Int>()

        for(i in l..r){

        }

        return 0
    }

    fun mergesort(arr: IntArray,l:Int,r:Int){
        if(l<r){
            //split
            var m: Int
            m = (r+l)/2
            mergesort(arr,l,m)
            mergesort(arr,m+1,r)
            //merge
            merge(arr,l,m,r)
        }
    }

    fun merge(arr: IntArray, l:Int, m:Int, r:Int){
        //save in 2 arrays
        var left = IntArray(m-l+1)
        var right = IntArray(r-m)

        var count = 0
        for(i in l until m+1){
            left[count] = arr[i]
            count++
        }
        count = 0
        for(i in m+1 until r+1){
            right[count] = arr[i]
            count++
        }

        var i = l
        var lefti = 0
        var righti = 0
        while(i <= r){
            if(lefti < left.size && righti < right.size){
                if(left[lefti] < right[righti]){
                    arr[i] = left[lefti]
                    lefti++
                }
                else{
                    arr[i] = right[righti]
                    righti++
                }
            }
            else if(lefti < left.size){
                arr[i] = left[lefti]
                lefti++
            }
            else{
                arr[i] = right[righti]
                righti++
            }
            i++
        }
    }

    fun printArray(a: Array<Int>) {
        for (element in a){
            println("printArray " + element)
        }
    }

    fun printArray1(a: IntArray){
        var count = 0
        for (element in a){
            println("printArray1 " + count + ": " + element)
            count++
        }
    }

    fun printy(msg: String = "berttest", size: Int = 40) {
        var x = 0

        repeat(4) {
            println(msg)
            x++
            println(x)
        }

        var a = 1
        var b = 2
        var c = 3

        //( a > b ) ? a=5:b=4

    }

    enum class Color { BLUE, ORANGE, RED}


    fun testy(color: Color): String =
            when (color) {
                Color.BLUE -> "cold"
                Color.ORANGE -> "warm"
                Color.RED -> "hot"
            }

    fun testy1(input: String) =
            when(input){
                "y","yes" -> "fuck you"
                "n","no" -> "suck it"
                else -> "fuck off"
            }

    fun testy2(input: String, input1: Int) =
            when(setOf(input,input1)){
                setOf("bitch", 0) -> "yes"
                setOf("fuck", 1) -> "no"
                else -> "haha"
            }


}