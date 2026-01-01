package non.access.modifiers;

public class IntrerfaceClass2 implements InterfaceClass,InterfaceClass1{

	@Override
	public void loginIntoApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logoutFromApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startSession() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void stopSession() {
		// TODO Auto-generated method stub
		InterfaceClass.terminateBrowser();
	}

}
