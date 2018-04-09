class Solution {
  //Write your code here
    var _stack = Stack[Char]()
    var _queue = Queue[Char]()
    def pushCharacter(ch: Char): Unit = {
        _stack.push(ch)
    }
    def enqueueCharacter(ch: Char): Unit = {
        _queue.enqueue(ch)
    }
    def popCharacter(): Char = {
        _stack.pop
    }
    def dequeueCharacter() : Char = {
        _queue.dequeue
    }
}