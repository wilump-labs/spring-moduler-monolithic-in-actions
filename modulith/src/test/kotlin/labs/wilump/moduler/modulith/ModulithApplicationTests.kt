package labs.wilump.moduler.modulith

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.modulith.core.ApplicationModule
import org.springframework.modulith.core.ApplicationModules
import java.util.function.Consumer


@SpringBootTest
class ModulithApplicationTests {

    @Test
    fun contextLoads() {
        ApplicationModules.of(ModulithApplication::class.java).verify()
    }

//    @Disabled
    @Test
    fun printModuleModel() {
        val modules = ApplicationModules.of(ModulithApplication::class.java)
        modules.forEach(Consumer { x: ApplicationModule? -> println(x) })
    }
}