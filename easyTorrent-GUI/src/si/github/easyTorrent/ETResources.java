package si.github.easyTorrent;

import com.sun.org.apache.bcel.internal.Constants;

public interface ETResources extends Constants {
	
	String title(); 
/*	
 * TODO find a way to implement resources as interface not as inputstream:
 * EXAMPLE:
 * 
 * ETResources res = GWT.create(ETResources.class);
 * String ex = res.title();
*/
}
