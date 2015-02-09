public class BodyDriver {
	public static void main(String[] args) {
		Body sun = new Body();
		sun.idNum = Body.nextID++;
		sun.name = "Sol";
		sun.orbits = null; // in solar system, sun is middle

		Body earth = new Body();
		earth.idNum = Body.nextID++;
		earth.name = "Earth";
		earth.orbits = sun;
	}
}
