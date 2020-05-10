
public class Animal {
	public static void main(String[] args) {
		
	}
}
abstract class Mammal extends Animal{
	public abstract String bark();
	public abstract String getFood();
}
abstract class Reptile extends Animal{
	public abstract String getFood();
}

final class Cat extends Mammal{
	private String name,nameSlave;
	private float weight;
	public Cat(String name, float weight, String nameSlave) {
		this.name=name;	this.weight=weight;	this.nameSlave=nameSlave;
	}
	public String bark() {
		System.out.println("Meow");
		return "Meow";
	}
	public String getFood() {
		System.out.println("Fish");
		return "Fish";
	}
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	public String getNameSlave() {
		return nameSlave;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public void setNameSlave(String nameSlave) {
		this.nameSlave=nameSlave;
	}
}
final class Dog extends Mammal{
	private String name,nameMaster;
	private float weight;
	public Dog(String name, float weight, String nameMaster) {
		this.name=name;	this.weight=weight;	this.nameMaster=nameMaster;
	}
	public String bark() {
		System.out.println("Bowbow");
		return "Bowbow";
	}
	public String getFood() {
		System.out.println("Apple");
		return "Apple";
	}
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	public String getNameMaster() {
		return nameMaster;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public void setNameSlave(String nameMaster) {
		this.nameMaster=nameMaster;
	}
}
final class Crocodile extends Reptile{
	private String name;
	private float weight;
	public Crocodile(String name, float weight) {
		this.name=name;	this.weight=weight;
	}
	public String getFood() {
		System.out.println("Meat");
		return "Meat";
	}
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
}