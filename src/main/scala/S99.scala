package com.s99

class S99List {
/** The List section of Scala99
 *
 *  Mutability is frowned upon and Lists only have two methods head and tail.
 */
    def last(inputList: List[Int]): Int = {

        if (inputList.length == 1)
            return inputList.head
        else
            last(inputList.tail)

    }

    def penultimate(inputList: List[Int]): Int = {

        if (inputList.length == 2)
            return inputList.head
        else
            penultimate(inputList.tail)
    }

    def nth(idx: Int, inputList: List[Int]): Int = {

        if (idx == 0)
            return inputList.head
        else
            nth(idx-1, inputList.tail)
    }
}