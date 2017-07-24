package TelegramRP


import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage
import org.bh.tools.ui.swing.*


/**
 * The main file of the Telegram RP desktop client
 *
 * @author Ben Leggiero
 * @since 2017-07-17
 */
class FxMain : Application() {


    override fun start(primaryStage: Stage) {
        primaryStage.show()
        val location = javaClass.getResource("MainWindowPane.fxml")
//        val bundle = ResourceBundle.getBundle("TelegramRP.MainWindowPane")
        val loader = FXMLLoader(location)
        val root: Pane = loader.load()
        val controller: MainWindowPane = loader.getController()
        val scene: Scene = primaryStage.scene
        scene.root = root
    }


    companion object {
        @JvmStatic fun main(args: Array<String>) {
            launch(FxMain::class.java)
        }
    }
}
