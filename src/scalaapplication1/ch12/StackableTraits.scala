package scalaapplication1.ch12

/**
 * Abstract Q that adds new integers to the queue and a get that removes and returns them
 */
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

/**
 * Concrete implementation of an IntQueue using an mutable ArrayBuffer
 */
import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

 /**
  * This trait declares {@code IntQueue} as a superclass, so it can only be mixed in to a class that also extends IntQueue
  */
 trait Doubling extends IntQueue {
    // Note the call to "super." here!  Our parent is abstract, so this will only work at runtime if the trait is mixed in 
    // after another trait or class that gives a concrete definition to this method
    abstract override def put(x: Int) { super.put(2 * x) }
 }

 class MyDoublingQueue extends BasicIntQueue with Doubling



 
 trait Incrementing extends IntQueue {
    abstract override def put(x: Int) { super.put(x + 1) }
 }

 trait Filtering extends IntQueue {
    abstract override def put(x: Int) {
      if(x >=0) super.put(x)
    }
 }

 
class MyIncrementingFilteringQueue extends BasicIntQueue with Filtering with Incrementing

class MyFilteringIncrementingQueue extends BasicIntQueue with Incrementing with Filtering 