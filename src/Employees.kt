abstract class Employee(val name: String, val salary: Double) {
    abstract fun work()
    abstract fun calculateAnnualBonus(): Double

    fun details() {
        println("Employee Name: $name")
        println("Salary: $salary")
    }
}

interface Evaluable {
    fun evaluatePerformance() {
        println("Evaluating employee performance.")
    }
}

class Developer(name: String, salary: Double) : Employee(name, salary), Evaluable {
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.10
    }
}

class Manager(name: String, salary: Double) : Employee(name, salary), Evaluable {
    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.20
    }
}

class Designer(name: String, salary: Double) : Employee(name, salary), Evaluable {
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.15
    }
}

abstract class Student() : Evaluable{
    override fun evaluatePerformance() {
        println("Learning and turning in assignments.")
    }
}


