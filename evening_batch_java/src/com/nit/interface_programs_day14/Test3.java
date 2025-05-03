package com.nit.interface_programs_day14;

abstract class Cake {
	private String shape, flaver;
	private int quantity;
	private float price;

	public Cake(String shape, String flaver, int quantity) {
		this.shape = shape;
		this.flaver = flaver;
		this.quantity = quantity;

	}

	protected String getShape() {
		return shape;
	}

	protected void setShape(String shape) {
		this.shape = shape;
	}

	protected String getFlaver() {
		return flaver;
	}

	protected void setFlaver(String flaver) {
		this.flaver = flaver;
	}

	protected int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected float getPrice() {
		return price;
	}

	protected void setPrice(float price) {
		this.price = price;
	}

	// shape,flavour,qty,price
	// A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-
	protected void showCake() {
		System.out.println("A " + getShape() + " " + getFlaver() + " Cake Of " + getQuantity() + "Kg/Kg's Ready @ Rs. "
				+ getPrice());

	}
}

class OrderedCake extends Cake {

	private String message;

	public OrderedCake() {

		super("Round", "Vanilla", 1);
		this.setPrice(400);
		
		

	}

	public OrderedCake(String shape, String flaver, int quantity) {
		super(shape, flaver, quantity);

	}

	public OrderedCake(String shape, String flaver, int quantity, String message) {
		super(shape, flaver, quantity);
		this.message = message;
	}

	/*
	 * Task :Print the following if message is not null or empty
	 * "A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-"
	 * . Otherwise display the message from superclass./
	 */
	@Override
	public void showCake() {
		if (getMessage().isEmpty()) {

			super.showCake();

		} else {

			if (this.getPrice() > 400) {
				this.setPrice(this.getQuantity() * getPrice());

			}

			System.out.println("A " + getShape() + " " + getFlaver() + " Cake Of " + getQuantity()
					+ "Kg/Kg's ready with message " + getMessage() + " @ Rs." + this.getPrice() + "/-");

		}
	}

	protected String getMessage() {
		return message;
	}

	protected void setMessage(String message) {
		this.message = message;
	}

}

public class Test3 {
	public static void main(String[] args) {
		OrderedCake cake=new OrderedCake("Round", "Vennala", 2, "Friend meeting");
		//OrderedCake cake1=new OrderedCake("flat", "sweet", 2);
		cake.showCake();
		//cake1.showCake();
	

	}

}

/*
 * Q3)Cake - Order Cake
WAP for the below requirement:
A abstract class "Cake" is given. Create a subclass called OrderedCake.
And check the working of it.
Meet the following requirements.
Attributes:
    Attribute Name : shape
    Type:String
    Modifier:private

    Attribute Name :flavour
    Type:String
    Modifier:private

    Attribute Name :qty  
    Type:int
    Modifier:private

    Attribute Name :price
    Type:float
    Modifier:private

Constructor:(One only)
    Modifier : protected
    type : With 3 parameters shape,flavour,qty in the same order.

Methods :
    Define setters and getters for all fields with
    protected Modifier/Access specifier
    Name of the method : showCake()    
    Return Type : void
    Modifier : Protected.
    Task : It must print data as per below format/example.

    "A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-"
Create an inherited class "OrderedCake".Inherit this from "Cake"

Define the following for the "OrderedCake" class
Attributes:
    Attribute name : message
    Type     : String
    Modifier :private

Constructors:(3 only)
    Non Parameterised Constructor : Ensure shape is Round, flavour is Vanilla
        and qty is 1 kg and price is 400.
    Parameterized public Constructor : For shape,flavour,qty
    Parameterized public Constructor : For shape,flavour,qty and message.    
    Price is to be dynamically changed @400 per Kg.
Methods :
    Name of Method : showCake() - Override this
    Return type : void
    Modifier : public
    Task :Print the following if message is not null or empty
    "A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-".
    Otherwise display the message from superclass.

Create FBCake class to test the working of the above./
 */