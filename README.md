# NBD_9
NBD_9
Implement a Container class parametrized with type A. Class constructor should accept a single private value of the given type. The class should implement the following methods:

a. getContent returning the stored value

b. applyFunction accepting function A=>R and returning the result of application of this function to stored value

2.  Implement trait Maybe parametrized with type A and two classes extending it – class No extending Maybe[Nothing] and class Yes parametrized with type A and storing a single value of a given type. Create objects of both classes. Check if they both are subtypes of Maybe[_] (use isInstanceOf method parametrized with checked type)

3.  Extend solution of task 3 with function applyFunction of type A=>R returning:

a. for No: No

b. for Yes: Yes(f(stored value))

4. extend solution of task 3 with function getOrElse parametrized with type and returning:

a. for No – parameter of getOrElse

b. for Yes – content of Yes
