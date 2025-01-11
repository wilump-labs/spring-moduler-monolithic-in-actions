package labs.wilump.moduler.modulith.order

import org.junit.jupiter.api.Test
import org.springframework.modulith.test.ApplicationModuleTest

@ApplicationModuleTest(
    mode = ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES,
)
class OrderIntegrationTests {

//    @MockBean
//    private lateinit var commonComponent: CommonComponent

    @Test
    fun contextLoads() {
    }
}