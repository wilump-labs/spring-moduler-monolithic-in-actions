package labs.wilump.moduler.modulith

import org.springframework.boot.runApplication
import org.springframework.modulith.Modulith

@Modulith
class ModulithApplication

fun main(args: Array<String>) {
    runApplication<ModulithApplication>(*args)
}