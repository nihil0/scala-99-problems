package com.s99

import org.scalatest.FunSuite

class s99Tests extends FunSuite{
    var s99 = new S99List()
    val myList = List(1,1,2,3,5,8)

    test("last element of myList should be 8"){ assert(s99.last(myList) == 8) }

    test("penultimate element of myList should be 5"){ assert(s99.penultimate(myList) == 5) }

    test("Third element of myList should be 2"){ assert(s99.nth(2,myList) == 2) }

    test("Number of elements in myList should be 6"){ assert(s99.length(myList) == 6) }

    test("Reverse of myList should be [8,5,3,2,1,1]"){ assert(s99.reverse(myList) == List(8,5,3,2,1,1)) } 

}


