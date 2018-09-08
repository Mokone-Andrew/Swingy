package za.co.wethinkcode.Swingy.Model.Artifacts;

public abstract class Artifacts {
	
	private int points;
    protected String name;
    public static Artifacts Weapon;
    public static Artifacts Armor;
    public static Artifacts Helm;

    public Artifacts(String name2, int points2) {
		// TODO Auto-generated constructor stub
	}

	public void Artifact(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return name + " (+" + points + ")";
    }

}