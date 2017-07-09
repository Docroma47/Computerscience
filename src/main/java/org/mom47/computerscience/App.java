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

		public void setMessage(String text) {
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

		public void setCharVariable(char c) {
			this.charVariable = c;
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

		public void setShortVariable(short sh) {
			this.shortVariable = sh;
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




		public void main(String[] args) {
			App peremenie = new App();
			peremenie.setMessage("POLiCE!Hands up!");
			peremenie.setIntVariable(12);
			peremenie.setLongVariable(4500);
			peremenie.setBooleanVariable1(true);
			peremenie.setBooleanVariable2(false);


			System.out.println(peremenie.getLongVariable());


			peremenie.setDoubleVariable1(-2.02);
			peremenie.setDoubleVariable2(-2.023);
			peremenie.setFloatVariable(13.1213f);
			peremenie.getFloatVariable();
			peremenie.getDoublevariable1();
			peremenie.getDoublevariable2();
			peremenie.getMessage();
			peremenie.getIntVariable();
			peremenie.getLongVariable();
			peremenie.getBooleanVariable1();
			peremenie.getBooleanVariable2();

		}

}