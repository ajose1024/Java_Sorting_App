# Exercise 1: Sorting Balls

[http://codekata.com/kata/kata11-sorting-it-out/](http://codekata.com/kata/kata11-sorting-it-out/)
 
In the Pragmatic Lottery (motto: There’s One Born Every Minute, and it Might Just Be You!),
we select each week’s winning combination by drawing balls.

There are sixty balls, numbered (not surprisingly, as we are programmers) 0 to 59.

The balls are drawn by the personable, but somewhat distracted, Daisy Mae. As a result,
some weeks five numbers are drawn, while other weeks seven, nine, or even fifteen balls
make it to the winner’s rack.

Regardless of the number of balls drawn, our viewers need to see the list of winning numbers
in sorted order just as soon as possible.

So, your challenge is to come up with some code that accepts each number as it is drawn and
presents the sorted list of numbers so far.

The tests might look something like:

```java
rack = Rack.new
assert_equal([], rack.balls)
rack.add(20)
assert_equal([ 20 ], rack.balls)
rack.add(10)
assert_equal([ 10, 20 ], rack.balls)
rack.add(30)
assert_equal([ 10, 20, 30 ], rack.balls)
```
 
## Constraints
* Please don’t use any JDK in built sorting library or utility. You need to build your sorting routine

* Please don’t spend a lot of time on setting up procedures to read the input or display the output. For our purposes a method which accepts the input would suffice

* Follow clean code / SOLID principles and stay as close as possible to object oriented programming. Name variables, methods, functions appropriately. Refactor when necessary.

* Avoid static, utils or helper classes

* Make reasonable assumptions and document it as a README.md
