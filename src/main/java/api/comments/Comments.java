package api.comments;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Comments{

	@JsonProperty("name")
	private String name;

	@JsonProperty("postId")
	private int postId;

	@JsonProperty("id")
	private int id;

	@JsonProperty("body")
	private String body;

	@JsonProperty("email")
	private String email;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPostId(int postId){
		this.postId = postId;
	}

	public int getPostId(){
		return postId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Comments{" + 
			"name = '" + name + '\'' + 
			",postId = '" + postId + '\'' + 
			",id = '" + id + '\'' + 
			",body = '" + body + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}