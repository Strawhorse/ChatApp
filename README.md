# ChatApp
 Simple TCP chat room built in Java 17

Using a Server class which is runnable on a thread, thanks for the idea at: https://www.youtube.com/watch?v=hIc_9Wbn704

Also good information on:
- https://www.linkedin.com/pulse/java-multithreading-code-example-using-runnable-interface-digest#:~:text=A%20runnable%20interface%20in%20Java,Threads%20must%20implement%20this%20interface.
- https://www.geeksforgeeks.org/multithreaded-servers-in-java/
- https://www.javatpoint.com/runnable-interface-in-java
- https://www.baeldung.com/java-runnable-vs-extending-thread

Server mostly finished; using an Executor framework: provides a way to separate the task execution logic from the application code, allowing developers to focus on business logic rather than thread management.

"The framework includes several key components, including the Executor, ExecutorService, ScheduledExecutorService, and ThreadPoolExecutor. These components enable developers to control the number of threads, manage task priorities, and handle exceptions and timeouts."
https://medium.com/javarevisited/a-complete-guide-on-executorservice-in-java-67528f1a535b#:~:text=The%20Executor%20Framework%20is%20a,logic%20rather%20than%20thread%20management.

