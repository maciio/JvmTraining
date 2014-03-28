class Pancake { }
class BlueberryPancake extends Pancake { }
public class SourdoughBlueberryPancake2 extends BlueberryPancake {
public static void main(String[] args) {
  	// SourdoughBlueberryPancake2 b10 = new BlueberryPancake();
  	Pancake p4 = new Pancake();
  	Pancake p5=p4;
	Pancake p6 = (BlueberryPancake)p4;
	BlueberryPancake b2 = (BlueberryPancake)p4;
	BlueberryPancake b3 = (SourdoughBlueberryPancake2)p4;
	SourdoughBlueberryPancake2 s1=(Pancake)p4;
	// SourdoughBlueberryPancake2 s11=(BlueberryPancake)b10;
	SourdoughBlueberryPancake2 s2 = (SourdoughBlueberryPancake2)p4;
} }
