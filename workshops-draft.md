#### Create sample project

* Defined project name, ie. "my-very-first-project"

* Create package com.coderborther

* Preview generated class: Main

#### Introduce console output

* In generated Main class create System.out invocation

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Started: Airplane management");
        System.out.println("Finished: Airplane management");
    }
}
```

* Replace inline String with String variable and utilize string concatenation

```java
package com.coderbrother;

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        System.out.println("Finished: " + programName);
    }
}
```

#### Introduce new class

* Create new Airplane class 

```java
package com.coderbrother;

public class Airplane {
    public String registration;
}
```

* Create an instance of newly created class in main class

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        
        Airplane airplane1 = new Airplane();
        System.out.println(airplane1.registration);
        
        System.out.println("Finished: " + programName);
    }
}
```

> If the value of the object is not defined, all class object fields will default to **null**.

* Set the registration number

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        
        Airplane airplane1 = new Airplane();
        airplane1.registration = "AAA-111";
        System.out.println(airplane1.registration);
        
        System.out.println("Finished: " + programName);
    }
}
```

* Create getter and setter for registration and make registration field **private**

```java
public class Airplane {
    private String registration;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane();
        airplane1.setRegistration("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Java defines 4 scopes for class fields: default, private, public and protected.

* Create new constructor which takes registration as a parameter
  
```java
public class Airplane {
    private String registration;

    public Airplane(String newRegistration) {
        registration = newRegistration;
    }
    
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Once custom constructor is defined default constructor is disabled automatically. If you want to keep the default constructor you have to define it manually.

* Override registration with using setter method

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setRegistration("AAA-222");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

* Remove setter method invocation

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

#### Introduce an array

* Create second airplane

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        Airplane airplane2 = new Airplane("BBB-222");
        System.out.println(airplane2.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

* Defined Java array of airplanes with predefined size size, warning: try to insert more elements than defined
  
```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[2];
        airplanes[0] = airplane1;
        airplanes[1] = airplane2;
        
        System.out.println(airplanes[0].getRegistration());
        System.out.println(airplanes[1].getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> If you try to add more elements than defined size of an array, **ArrayIndexOutOfBoundsException** exception will be thrown.

* Create an array based on objects

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        System.out.println(airplanes[0].getRegistration());
        System.out.println(airplanes[1].getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Java will define the size of an array based on the objects in the constructor

#### Introduction to "for" loop

* Change the invocation of System.out.println on each object to be invoked in a **for** loop

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println(airplanes[index].getRegistration());
        }

        System.out.println("Finished: " + programName);
    }
}
```

#### Introduce new primitive types

* Add Airplane length, height and engine quantity fields

```java
public class Airplane {
    private String registration;
    private double length;
    private double height;
    private int engineQuantity;

    public Airplane(String newRegistration) {
        registration = newRegistration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }
}
```

* Set new properties for Airplane instances and override console output

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new Airplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println("Airplane: " + airplanes[index].getRegistration() + ": " + airplanes[index].getHeight()
                    + ": " + airplanes[index].getLength() + ": " + airplanes[index].getEngineQuantity());
        }

        System.out.println("Finished: " + programName);
    }
}
```

> Java defaults non-initialised primitives to: **0** for int, **0.0** for double. As mentioned before all non-initialized object fields are set to **null**.

> Each primitive has correctonding, built-in Java class defined (ie. Integer for int, Double for double etc.). The conversion between primitive and wrapper is done automatically.

* Introduce describe method which returns string description of the airplane

```java
    public String describe() {
        return "[registration: " + registration + ", height: " + height + ", length: " + length
                + ", engineQuantity: " + engineQuantity + "]";
    }
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new Airplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println("Airplane: " + airplanes[index].describe());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Change describe method body to use Java StringBuilder
```java
    public String describe() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engineQuantity: ").append(engineQuantity)
                .append("]");
        return builder.toString();
    }
```

* Remove variable assignment
```java
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engineQuantity: ").append(engineQuantity)
                .append("]")
                .toString();
    }
```

* Add check is an airplane is a small sized plane

```java
    public boolean isSmallSize() {
        double area = length * height;
        if (area < 30.0d) {
            return true;
        } else {
            return false;
        }
    }
```

> The condition if/else/then is one of the most important block statement in every programming language next to loops

* Add check is an airplane is a medium sized plane

```java
    public boolean isMediumSize() {
        double area = length * height;
        if (area >= 30.0d && area < 100.0d) {
            return true;
        } else {
            return false;
        }
    }
```

* Add check is an airplane is a large sized plane

```java
    public boolean isLargeSize() {
        double area = length * height;
        if (area >= 100.0d) {
            return true;
        } else {
            return false;
        }
    }
```

* Create reusable area calculation method

```java
    public double getArea() {
        return length * height;
    }

    public boolean isSmallSize() {
        double area = getArea();
        if (area < 30.0d) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (area >= 30.0d && area < 100.0d) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        double area = getArea();
        if (area >= 100.0d) {
            return true;
        } else {
            return false;
        }
    }
```

* Optimize reusable area constraints

```java
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;
    
    (...)

    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (area >= SMALL_AREA_LIMIT && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        double area = getArea();
        if (area >= MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }
```

> "&&" (AND) is an example of logical operator in Java. Another logical operators is: "||" (OR).

* Examine the airplane size
```java
        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }
```

* Update the size calculations for code reuse

```java
    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (!isSmallSize() && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        return !isSmallSize() && !isMediumSize();
    }
```

> "!" is an unary operator. It works on boolean values negating the value of the variable. In the other words it changes the value from **true** yo **false** and **false** to **true**.

#### Introduce different types of airplanes

* Add deufalt constructor with no arguments and update existing one

```java
    public Airplane() {
    }

    public Airplane(String registration) {
        this.registration = registration;
    }
```

> "this" keyword provides the reference to current instance

* Add passenger and cargo airplane

```java
package com.coderbrother;

public class PassengerAirplane extends Airplane {
    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
```

```java
package com.coderbrother;

public class CargoAirplane extends Airplane {
    private double cargoCapacity;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
```

```java
        CargoAirplane cargoAirplane = new CargoAirplane();
        PassengerAirplane passengerAirplane = new PassengerAirplane();

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
```

* Change the airplane variables assignment

```java
        Airplane cargoAirplane = new CargoAirplane();
        Airplane passengerAirplane = new PassengerAirplane();

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
```

> In Java you can assign subclass instance to the parent object reference variable. Keep in mind that it will restrict the available methods to the one defined in the parent class.

* Add Airplane subclasses constructor which supports registration number

```java
package com.coderbrother;

public class PassengerAirplane extends Airplane {
    private int passengerCapacity;
    
    public PassengerAirplane() {
    }
    
    public PassengerAirplane(String registration) {
        super(registration);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
```

```java
package com.coderbrother;

public class CargoAirplane extends Airplane {
    private double cargoCapacity;

    public CargoAirplane() {
    }

    public CargoAirplane(String registration) {
        super(registration);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
```

```java
        Airplane cargoAirplane = new CargoAirplane("CCC-333");
        Airplane passengerAirplane = new PassengerAirplane("DDD-444");

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
```

* Remove Airplane default constructors

```java
public class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private int engineQuantity;

    public Airplane(String registration) {
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }

    public double getArea() {
        return length * height;
    }

    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (!isSmallSize() && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        return !isSmallSize() && !isMediumSize();
    }

    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engineQuantity: ").append(engineQuantity)
                .append("]")
                .toString();
    }
}
```

```java
public class PassengerAirplane extends Airplane {
    private int passengerCapacity;

    public PassengerAirplane(String registration) {
        super(registration);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}

```

```java
public class CargoAirplane extends Airplane {
    private double cargoCapacity;

    public CargoAirplane(String registration) {
        super(registration);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
```

* Redefine the array of airplanes

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineQuantity(2);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2, airplane3, airplane4 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Block the ability to create and instance of Airplane class

```java
public abstract class Airplane {
    (...)
}
```


#### Introduce the airplane engine type
```java
package com.coderbrother;

public abstract class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private String engineType;
    private int engineQuantity;

    public Airplane(String registration) {
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }

    public double getArea() {
        return length * height;
    }

    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (!isSmallSize() && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        return !isSmallSize() && !isMediumSize();
    }

    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType)
                .append("]")
                .toString();
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineType("Jet");
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineType("Turboprop");
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineType("Jet");
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineType("Turboprop");
        airplane4.setEngineQuantity(2);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2, airplane3, airplane4 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Introduce enumeration for engine type

```java
package com.coderbrother;

public enum EngineType {
    JET, TURBOPROP;
}
```

```java
public abstract class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private EngineType engineType;
    private int engineQuantity;

    public Airplane(String registration) {
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }

    public double getArea() {
        return length * height;
    }

    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (!isSmallSize() && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        return !isSmallSize() && !isMediumSize();
    }

    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType)
                .append("]")
                .toString();
    }
}
```

```java
        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineType(EngineType.JET);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineType(EngineType.TURBOPROP);
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineType(EngineType.JET);
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineType(EngineType.TURBOPROP);
        airplane4.setEngineQuantity(2);
```

* Add better engine description

**File:** *com/coderbrother/EngineType.java*
```java
public enum EngineType {
    JET("Jet"), TURBOPROP("Turboprop");

    private String description;

    EngineType(String description) {
        this.description = description;
    }

    public String describe() {
        return description;
    }
}
```

**File:** *com/coderbrother/Airplane.java*
```java
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType.describe())
                .append("]")
                .toString();
    }
```
