import java.util.*

internal object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val t = `in`.nextInt().toLong()
        for (a0 in 0 until t) {
            val n = `in`.nextInt().toLong()
            val q = n - 1
            val x = q / 15
            val w = 105 * (x * (x + 1)) / 2 - 45 * x
            val z = q % 15
            var v: Long = 0
            var u: Long = 0
            if (z != 0L) {

                val a = z / 5
                val b = z / 3
                val r = q - z

                v = a * r + a * (a + 1) / 2 * 5
                u = b * r + b * (b + 1) / 2 * 3


            }

            println(w + v + u)
        }

    }
}
     