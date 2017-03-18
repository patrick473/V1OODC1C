package practica.practicum14;

import java.io.*;

public class KlasManager {

	public void klasOpslaan(Klas deKlas) throws IOException {
		/* Voeg hier code toe om parameter 'deKlas' in bestand klas.obj */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("klas.obj"));
		oos.writeObject(deKlas);
		oos.close();
	}

	public Klas klasInladen() throws IOException, ClassNotFoundException{
		Klas deKlas = null;

		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */
		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("klas.obj"));
		Object object = ois.readObject();
		deKlas = (Klas) object;
		return deKlas;
	}
}
