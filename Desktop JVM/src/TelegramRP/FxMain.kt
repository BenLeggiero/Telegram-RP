package TelegramRP


import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.layout.Pane
import javafx.stage.Stage
import java.util.*


/**
 * The main file of the Telegram RP desktop client
 *
 * @author Ben Leggiero
 * @since 2017-07-17
 */
class FxMain : Application() {


    override fun start(primaryStage: Stage) {
        primaryStage.show()
    }


    companion object {
        @JvmStatic fun main(args: Array<String>) {
            launch(FxMain::class.java)
        }
    }
}