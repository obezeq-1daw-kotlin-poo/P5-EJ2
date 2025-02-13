abstract class Empleado(val nombre: String, val id: Int) {
    abstract fun calculaSalario(): Double
}

class EmpleadoPorHora(nombre: String, id: Int, private val horasTrabajadas: Int, private val tarifaPorHora: Double) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }
}

class EmpleadoFijo(nombre: String, id: Int, private val salarioFijo: Double, private val numPagas: Int) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}

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