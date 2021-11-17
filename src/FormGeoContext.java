
public class FormGeoContext {
	private FormGeoSelectState currentState;
	
	public FormGeoContext() {
		currentState = new NotSelected(); 
	}
	public void setState(FormGeoSelectState state) {
		currentState = state;
	}
	public boolean select() {
		return currentState.select();
	}
}
