package Association_CarTask;

public class Honda extends Car{
public void hondaStartEngine() {
	CarEngine he=new CarEngine();
	he.engineStarts();
}

public void hondaMusicPlayer() {
	MusicPlayer hp=new MusicPlayer();
	hp.carMusicPlayer();
}
}
