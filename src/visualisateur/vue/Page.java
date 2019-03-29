package visualisateur.vue;

import javafx.scene.Parent;
import javafx.scene.Scene;

abstract public class Page extends Scene{

	public Page(Parent racine) {
		super(racine, 800, 600);
	}

}