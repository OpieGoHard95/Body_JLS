// Coded by Jared Smith
// Code from page 42 
// Class name Body

class Body {
	public long idNum;
	public String name;
	public Body orbits;
	
	public static long nextID = 0;


	Body() {
	  idNum = nextID++;
	  }
	
	Body(String bodyName, Body orbitsAround) {
	  this();
	  name = bodyName;
	  orbits = orbitsAround;
	  }

	public String toString() {
	  String desc = idNum + " (" + name + ")";
	  if (orbits != null)
		desc += " orbits " + orbits.toString();
	  return desc;
	  }
}
