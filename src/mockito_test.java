import org.junit.Test;
import org.mockito.Mockito;

public class mockito_test {
	
	
	@Test
	public static void mock_test () {
		// Mock - Object
		BigThing bt = Mockito.mock (BigThing.class);
		
		// get soll immer 1000 returnen
		Mockito.when (bt.getSize()).thenReturn(1000);
		
		// wirft eine Exception when eingegebene Size = 0 
		Mockito.doThrow(new IllegalArgumentException()).when(bt.setSize(0));
		
		// verschiedene Parameterwerte
		Mockito.when(bt.setSize(5)).thenReturn(5);
	}
}
