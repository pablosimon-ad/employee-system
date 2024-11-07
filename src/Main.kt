fun main() {

    val employees: List<Employee> = listOf(
        Developer("Alice", 80000.0),
        Manager("Bob", 120000.0),
        Designer("Carol", 70000.0)
    )

    for (employee in employees) {
        employee.details()
        employee.work()
        println("Annual Bonus: ${employee.calculateAnnualBonus()}")


        if (employee is Evaluable) {
            employee.evaluatePerformance()
        }
        println()
    }
}