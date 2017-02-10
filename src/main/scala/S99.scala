package com.s99

class S99 {
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
}