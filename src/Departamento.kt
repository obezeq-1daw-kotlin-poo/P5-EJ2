class Departamento() {
    private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        var total = 0.0
        for (empleado in empleados) {
            total += empleado.calculaSalario()
        }
        return total
    }


    fun mostrarInformacionEmpleados() {
        for (empleado in empleados) {
            println("Empleado con nombre ${empleado.nombre} y cono una ID ${String.format("%04d", empleado.id)} tiene un salario de %.2f al mes.".format(empleado.calculaSalario()))
        }
    }
}