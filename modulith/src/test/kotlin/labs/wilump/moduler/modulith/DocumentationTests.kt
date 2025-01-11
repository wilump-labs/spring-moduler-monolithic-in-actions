package labs.wilump.moduler.modulith

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

class DocumentationTests {
    private val modules = ApplicationModules.of(ModulithApplication::class.java)

    @Test
    fun writeDocumentationSnippets() {
        Documenter(modules)
            .writeModuleCanvases()
            .writeModulesAsPlantUml()
            .writeIndividualModulesAsPlantUml()
    }
}