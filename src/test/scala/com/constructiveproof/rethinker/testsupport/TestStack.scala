package com.constructiveproof.rethinker.testsupport

import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfter, FunSpecLike, Matchers}

trait TestStack extends FunSpecLike with Matchers with MockitoSugar with BeforeAndAfter
