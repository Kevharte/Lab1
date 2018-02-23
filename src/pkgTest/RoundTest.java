package pkgTest;

import static org.junit.Assert.*;

import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest {
	for(int a = 0; a < 10000; a++) {
		Round r = new Round();
		
		if(Round.isNatural(r.FirstRoll())){
			assertEquals(eGameResult.NATURAL, r.geteGameResult());
		}else if(Round.isCraps(r.FirstRoll())){
			assertEquals(eGameResult.CRAPS, r.geteGameResult());
		}else {
			assertEquals(eGameResult.POINT, r.getGameResult()):
		}
		
	}
}
