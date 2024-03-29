package com.tkroman.kpi.y2022.l1

import scala.collection.mutable
import munit.FunSuite

import List.*

class ListSuite extends FunSuite {
  test("foldRight") {
    val expected = -94
    val xs = List.of(1,3,8)
    val actual = xs.foldRight(100)(_-_)
    assertEquals(expected, actual)
  }

  test("concat") {
    val expected = List.of("a","b","c","d","f")
    val ys = List.of("d","f")
    val xs = List.of("a","b","c")
    val actual = xs.concat(xs,ys)
    assertEquals(expected, actual)
  }

  test("flatmap") {
    val expected = List.of("1","1","1","2","2","2","3","3","3")
    val a = List.of(1,2,3)
    val actual = a.flatMap(x=> List.of(x.toString,x.toString,x.toString))
    assertEquals(expected, actual)
  }

  test("zip") {
    val expected = List.of((1,'a'),(2,'b'),(3,'c'))
    val xs = List.of(1,2,3)
    val ys = List.of('a','b','c','d')
    val actual = xs.zip(ys)
    assertEquals(expected, actual)
  }
  test("partition") {
    val expected = (Cons(3,Cons(6,Nil)),Cons(1,Cons(2,Cons(4,Cons(5,Cons(7,Nil))))))
    val xs = Cons(1,Cons(2,Cons(3,Cons(4,Cons(5,Cons(6,Cons(7,Nil)))))))
    val actual = xs.partition(xs)(x => x%3 == 0)
    assertEquals(expected,actual)
  }
}




