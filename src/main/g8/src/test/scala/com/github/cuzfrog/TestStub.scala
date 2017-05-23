package com.github.cuzfrog

import utest._

object TestStub extends TestSuite{
  val tests = this{
    'dummy{
      println("test stub.")
    }
  }
}