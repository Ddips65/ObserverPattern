# Delivery Application - Notification System

# Program Details

This program implements the code representing a consortium of shops that have an agreement with local
independent van and taxi drivers to deliver products from the stores to the customer’s destinations.
In this assignment implement notification system to send notifications about delivery request to drivers.
When a store gets a product delivery orders should be created at store and a delivery request should be
broadcast to all drivers.I used the observer pattern because change to one object requires changes in
others so that the changes needed to be forwarded to others. I needed to send push notifications to many
drivers with delivery request.This pattern seemed the most appropriate.

• How is the flexibility, of your implementation, e.g., how you add or remove in future new types?

    This program implement observer pattern due to one to many relationship between observable and
    observer of the task.It allows subject to update all changes across all required platforms 
    automatically.It is quite flexible due to observer(Driver) can be added/removed at when program
    is running.I don't require to make big changes in the code.    

• How is the simplicity and understandability of your implementation?

    Shop class has several methods where it can subscribe and unscribe the driver.Shop interface creates
    and send out delivery request notification with additional attribute customer details and delivery
    message. The Driver class provides necessary subscribe information and the deliveryRequest which the
    assigns the driver to particular deliveries. Due to the simple implementation of this program, the
    Main.java create the object for shop class and create six new instance of the driver class.
    Register each of this driver under respected shop and updateDriver confirm receipt of the new 
    delivery request confirmation.

• How you avoided duplicated code?

    Most instance variables are well defined Getters and Setters hence they can be accessed once the
    class is instantiated.I avoided duplicated code by unifying the objects that had the same behavior
    and by using the observer pattern.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




