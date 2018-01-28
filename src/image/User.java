package image;

public class User {
	
 /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pass
	 */
	public String getPath() {
		return picture;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.picture = pass;
	}
	
public User(String name,String pass) {
	 this.name  = name;
	 this.picture = pass;
 }
 
 private String name;
 private String picture;
 
}
