import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun MainView(modifier: Modifier = Modifier, viewModel: MainViewModel = viewModel()) {

    val contador: Int? by viewModel.contador.observeAsState(initial = 0)

    Column(modifier = modifier) {
        Text(text = "================")
        Text(text = "================")
        Text(text = "================")
        Text(text = "================")

        TextField(value = contador.toString(), onValueChange = {})

        Button(onClick = {
            viewModel.incrementaContador()
         }) {
            Text(text = contador.toString())
        }
    }
}
