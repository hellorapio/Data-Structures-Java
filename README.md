# Data Structures Implementation in Java

Some Data Structures i have Implemented recently,
Take A Look

## Table of Contents
1. [LinkedList](#LinkedList)
2. [Queues](#Queues)


## LinkedList

My LinkedList Java Implementation via Generics With Various of Functions you can use Daily in your Work

### Table of Contents
1. [Creation](#creation)
2. [Functions](#functions)
3. [Usage](#usage)



### Creation

    LinkedData<"T"> "object name" = new LinkedData<>();

As you Know Types can Vary as you Like
You Can add (Integer, String, Boolean, Float, Char, Double, etc...)


### Functions

Linked List is Zero Indexed


| Function | Description |
|--|--|
| addToFront(T value) | Adds Element to The Beginning of The LinkedList , Return true |
| addToBack(T value) | Adds Element to The End of The LinkedList , Return true |
| addWithinIndex(T value , int index) | Adds Element to The Specified Position in The LinkedList , Return true if Element is added or false if index was Out of Range|
| removeFirst() | Removes the First Element of The Linked List , Return First Element |
| removeLast() | Removes the Last Element of The Linked List , Return Last Element |
| removeWithinIndex(int index) | Removes Element in The Specified Position in The LinkedList , Return The Removed Element |
| removeWithValue(T value) | Removes Every Element in The LinkedList that has same Value , Return true if Found and Removed or False if it wasn't Found|
| isEmpty() | Return true if List doesn't have Elements or False if it Has |
| clear() | Removes All Elements in the LinkedList , Return true if the List is Cleared or false is List has No Elements Already  |
| getLast() | Return Last Element in The List |
| getFirst() | Return First Element in The List |
| get(int index) | Return the Element in The Index you Specified |
| reverse() | Reverse the LinkedList , Return Void |
| print() | Prints all Elements in The List , Return Void |

### Usage

The Comments are the Output

    LinkedData<String> names = new LinkedData<>(); 
    
    System.out.println(names.addToFront("Jack")); // true
    System.out.println(names.addToBack("John")); // true
    names.print(); // [Jack,John]
    names.reverse();
    names.print() // [John,Jack]
    names.removeWithValue("John");
    names.print(); // [Jack]
    names.addWithinIndex("Tyler", 0);
    names.print(); // [Tyler,Jack]
    names.addWithinIndex("Sara", 1);
    names.print(); // [Tyler,Sara,Jack]

## Queues

Queue Data Structure With its Operation based on 2 Implementations :
Arrays and LinkedLists
Differences that :
Array is Size Locked and Have isFull() Method
LinkedList is Not Size Locked and Doesn't have isFull() Method

### Table of Contents
1. [Creation](#creation-1)
2. [Functions](#functions-1)
3. [Usage](#usage-1)



### Creation

    LinkedQueue<"T"> "object name" = new LinkedQueue<>();
    
    ArrayQueue<"T"> "object name" = new ArrayQueue<>(any size);

As you Know Types can Vary as you Like
You Can add (Integer, String, Boolean, Float, Char, Double, etc...)

you Can type any Size you want of the Queue

### Functions

Keep Mind that Queue Have some Operations and Restrictions which you have only Specific Things you can Access


| Function | Description |
|--|--|
| enqueue(T value) | Adds Element to The End of The Queue , Return true if Added , in Array Case if its full it returns false |
| dequeue() | Removes the First Element of The Queue , Return First Element or Null if the Queue isEmpty which can Happen in Both |
| peek() | Returns the Element in the Front of the Queue or Null if the Queue is Empty|
| isEmpty() | Checks if The Queue is Empty , return true if Empty or false if not |
| isFull() | Checks if The ArrayQueue is Full of Elements , Only in Arrays , return true if full or false if empty |
| size() | returns The size of the Queue |
| display() | displays All Elements of the Queue |


### Usage

The Comments are the Output

    // LinkedQueue

    LinkedQueue<String> names = new LinkedQueue<>();

    // ArrayQueue

    ArrayQueue<String> names = new ArrayQueue<>(20); 

    System.out.println(names.enqueue("Jack")); // true
    System.out.println(names.enqueue("John")); // true
    names.display(); // Jack John
    System.out.println(names.dequeue()); // Jack
    names.display(); // John
    System.out.println(names.enqueue("Sandy")); // true
    System.out.println(names.peek()); // John
    names.display(); // John Sandy

## Stacks

Stack Data Structure With its Operation based on 2 Implementations :
Arrays and LinkedLists
Differences that :
Array is Size Locked and Have isFull() Method
LinkedList is Not Size Locked and Doesn't have isFull() Method

### Table of Contents
1. [Creation](#creation-2)
2. [Functions](#functions-2)
3. [Usage](#usage-2)



### Creation

    LinkedStack<"T"> "object name" = new LinkedStack<>();
    
    ArrayStack<"T"> "object name" = new ArrayStack<>(any size);

As you Know Types can Vary as you Like
You Can add (Integer, String, Boolean, Float, Char, Double, etc...)

you Can type any Size you want of the Stack

### Functions

Keep Mind that Stack Have some Operations and Restrictions which you have only Specific Things you can Access


| Function | Description |
|--|--|
| push(T value) | Adds Element to The End of The Stack , Return true if Added , in Array Case if its full it returns false |
| pop() | Removes the Last Element of The Stack , Return Last Element or Null if the Stack isEmpty which can Happen in Both |
| peek() | Returns the Element in the End of the Stack or Null if the Stack is Empty|
| isEmpty() | Checks if The Stack is Empty , return true if Empty or false if not |
| isFull() | Checks if The ArrayStack is Full of Elements , Only in Arrays , return true if full or false if empty |
| size() | returns The size of the Stack |
| display() | displays All Elements of the Stack |


### Usage

The Comments are the Output

    // LinkedQueue

    LinkedStack<String> names = new LinkedStack<>();

    // ArrayQueue

    ArrayStack<String> names = new ArrayStack<>(15); 

    System.out.println(names.push("Jack")); // true
    System.out.println(names.push("John")); // true
    names.display(); // John Jack
    System.out.println(names.pop()); // John
    names.display(); // Jack
    System.out.println(names.push("Sandy")); // true
    System.out.println(names.peek()); // Sandy
    names.display(); // Sandy Jack