package org.mom47.computerscience;

public class App
{
	private String message = "Rome is a good guy!";
	private int intVariable = 1;
	private long longVariable = 120;
	private char charVariable = 2;
	private boolean booleanVariable1 = true;
	private boolean booleanVariable2 = false;
	private short shortVariable = 55;
	private double doubleVariable1 = 0.42;
	private double doubleVariable2 = -0.85;
	private float floatVariable = 0.6861f;

		public void setMessage(String text){
		this.message = text;
		}

		public String getMessage() {
			return message;
		}

		public void setIntVariable(int i) {
			this.intVariable = i;
		}

		public int getIntVariable() {
			return intVariable;
		}

		public void setLongVariable(long l) {
			this.longVariable = l;
		}

		public long getLongVariable() {
			return longVariable;
		}

		public void setCharVariable(char a) {
			this.charVariable = a;
		}

		public long getCharvariable() {
			return charVariable;
		}

		public void setDoubleVariable1(double d1) {
			this.doubleVariable1 = d1;
		}

		public double getDoublevariable1() {
			return doubleVariable1;
		}

		public void setDoubleVariable2(double d2) {
			this.doubleVariable2 = d2;
		}

		public double getDoublevariable2() {
			return doubleVariable2;
		}

		public void setBooleanVariable1(boolean b1) {
			this.booleanVariable1 = b1;
		}

		public boolean getBooleanVariable1() {
			return booleanVariable1;
		}

		public void setBooleanVariable2(boolean b2) {
			this.booleanVariable2 = b2;
		}

		public boolean getBooleanVariable2() {
			return booleanVariable2;
		}

		public void setShortVariable(short  s) {
			this.shortVariable = s;
		}

		public short getShortVariable() {
			return shortVariable;
		}

		public void setFloatVariable(float f) {
			this.floatVariable = f;
		}

		public float getFloatVariable() {
			return floatVariable;
		}

		private void calculate() {
			IntCalculator calculator  = new IntCalculator();
			calculator.add(15);
			calculator.subtract(5);
			calculator.divide(2);
			calculator.multiplys(9);
		}

		private  void calculateDays() {
			IntCalculator daysInJuly;
				IntCalculator daysInAugust;
		}
	
		public static void main(String[] args) {
			IntCalculator calculater  = new IntCalculator();
			App app = new App();
			app.calculate();
			System.out.println(calculater.getValue());
			app.setMessage("POLiCE!Hands up!");
			app.setIntVariable(12);
			app.setLongVariable(4500);
			app.setBooleanVariable1(true);
			app.setBooleanVariable2(false);
			app.setDoubleVariable1(-2.02);
			app.setDoubleVariable2(-2.023);
			app.setFloatVariable(13.1213f);
			app.setCharVariable('a');
			app.setShortVariable((short) 100);
			System.out.println(app.getFloatVariable());
			System.out.println(app.getDoublevariable1());
			System.out.println(app.getDoublevariable2());
			System.out.println(app.getMessage());
			System.out.println(app.getIntVariable());
			System.out.println(app.getLongVariable());
			System.out.println(app.getBooleanVariable1());
			System.out.println(app.getBooleanVariable2());
			System.out.println(app.getCharvariable());
			System.out.println(app.getShortVariable());
			}
}