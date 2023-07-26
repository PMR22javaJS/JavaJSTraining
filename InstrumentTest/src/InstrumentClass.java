interface Instrument{
	void use();
}

abstract class MusicalInstrument implements Instrument{
	abstract public void play();
}

abstract class MedicalInstrument implements Instrument{
	abstract public void operate();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument{
	abstract public void tuneStrings();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument{
	abstract public void blowAir();
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument{
	abstract public void tuneSurface();
}

abstract class SurgicalInstrument extends MedicalInstrument{
	abstract public void sterile();
}

abstract class PathologicalInstrument extends MedicalInstrument{
	abstract public void reader();
}

class Guitar extends StringBasedMusicalInstrument{
	public void use() {
		System.out.println("Guitar Instrument is used");
	}
	
	public void play() {
		System.out.println("Guitar : String Based Instrument");
	}
	
	public void tuneStrings() {
		System.out.println("The strings of Guitar is being tuned");
	}
	
	public void pluck() {
		System.out.println("Pluck the Guitar ");
	}
}

class ElectronicGuitar extends Guitar{
	public void use() {
		System.out.println("Electronic Guitar Instrument is used");
	}
	
	public void play() {
		System.out.println("Electronic Guitar : String Based Instrument");
	}
	
	public void tuneStrings() {
		System.out.println("The strings of Electronic Guitar is being tuned");
	}
	
	public void pluck() {
		System.out.println("Pluck the Electronic Guitar ");
	}
	
	public void preset() {
		System.out.println("Preset the Electronic Guitar");
	}
}

class Violin extends StringBasedMusicalInstrument{
	public void use() {
		System.out.println("The Violin is Used");
	}
	
	public void play() {
		System.out.println("Violin : String Based Instrument");
	}
	
	public void tuneStrings() {
		System.out.println("Tune the strings of Violin");
	}
	
	public void bowing() {
		System.out.println("Bow the Violin Strings");
	}
}

class Cello extends Violin{
	public void use() {
		System.out.println("The Cello is Used");
	}
	
	public void play() {
		System.out.println("Cello : String Based Instrument");
	}
	
	public void tuneStrings() {
		System.out.println("Tune the strings of Cello");
	}
	
	public void bowing() {
		System.out.println("Bow the Cello Strings");
	}
	
	public void longBowing() {
		System.out.println("Cello needs Long Bowning");
	}
}

class Flute extends AirBasedMusicalInstrument{
	public void use() {
		System.out.println("Instrument Flute is being used");
	}
	
	public void play() {
		System.out.println("Flute : Air Based Musical Instrument");
	}
	
	public void blowAir() {
		System.out.println("We need to blow air in FLute");
	}
}

class Table extends DrumBasedMusicalInstrument{
	public void use() {
		System.out.println("Table instrument is used");
	}
	
	public void play() {
		System.out.println("Table : Drum Based Instrument");
	}
	
	public void tuneSurface() {
		System.out.println("Tune the surface of Table");
	}
}

class SurgicalCutter extends SurgicalInstrument{
	public void use() {
		System.out.println("Surgical cutter is used");
	}
	
	public void operate() {
		System.out.println("Surgical Cutter : Surgical Instrument");
	}
	
	public void sterile() {
		System.out.println("Sterile the surgical cutter before using");
	}
	
	public void cut() {
		System.out.println("Cut the bone using surgical cutter");
	}
}

class ECGMeter extends PathologicalInstrument{
	public void use() {
		System.out.println("ECG Meter is used");
	}
	
	public void operate() {
		System.out.println("ECG Meter : Pathological Instrument");
	}
	
	public void reader() {
		System.out.println("The heart rate is being measured");
	}
	
	public void rate() {
		System.out.println("The rate of heart is 72 beats per min");
	}
}


public class InstrumentClass {
	public static void main(String[] args) {
		ElectronicGuitar elecGuitar=new ElectronicGuitar();
		elecGuitar.use();
		elecGuitar.play();
		elecGuitar.tuneStrings();
		elecGuitar.pluck();
		elecGuitar.preset();
		
		System.out.println("--------------------------------------------");
		
		Cello cello=new Cello();
		cello.use();
		cello.play();
		cello.tuneStrings();
		cello.bowing();
		cello.longBowing();
		
		System.out.println("--------------------------------------------");
		
		Flute flute=new Flute();
		flute.use();
		flute.play();
		flute.blowAir();
		
		System.out.println("--------------------------------------------");
		
		Table table=new Table();
		table.use();
		table.play();
		table.tuneSurface();
		
		System.out.println("--------------------------------------------");
		
		SurgicalCutter cutterObj=new SurgicalCutter();
		cutterObj.use();
		cutterObj.operate();
		cutterObj.sterile();
		cutterObj.cut();
		
		System.out.println("--------------------------------------------");
		
		ECGMeter ecg=new ECGMeter();
		ecg.use();
		ecg.operate();
		ecg.reader();
		ecg.rate();
	}
}