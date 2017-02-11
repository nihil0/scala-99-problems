package com.s99

class S99List {
/** The List section of Scala99
 *
 *  Mutability is frowned upon and Lists only have methods head, isEmpty and tail. Length method may be used but should be avoided
 *  if it leads to a trivial solution. L33t functional programz allowed. 
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

    def length(inputList: List[Int]): Int = {

        def lenRecursion(n: Int, someList: List[Int]): Int = {
            if (someList.isEmpty)
                return n
            else
                lenRecursion(n+1, someList.tail)
        }

        return lenRecursion(0,inputList)
    }

    def reverse(input: List[Int]): List[Int] = input.foldLeft(List[Int]())( (x: List[Int], y: Int) => y :: x )

}