
fun main() {

    val departamento = Departamento()

    val empleado1 = EmpleadoPorHora("Juan Pérez", 1, 160, 15.50)
    val empleado2 = EmpleadoFijo("Ana García", 2, 24000.0, 12)
    val empleado3 = EmpleadoPorHora("Luis López", 3, 180, 18.0)

    departamento.agregarEmpleado(empleado1)
    departamento.agregarEmpleado(empleado2)
    departamento.agregarEmpleado(empleado3)

    departamento.mostrarInformacionEmpleados()

    println("El salario total a pagar al mes es: %.2f".format(departamento.calculaSalarioTotal()))

}