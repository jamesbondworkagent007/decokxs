package QfgSZK;

import com.google.mlkit.common.MlKitException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class Zpvmxu {
    public static int JFG = 9631;
    private static AtomicBoolean QceJvZ = new AtomicBoolean(false);
    public static int hSn = 4083;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Zpvmxu() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Long OHqIaq(int i) {
        long jORxRYg = AxsJAY.uzCIH().ORxRYg(i);
        if (QceJvZ.get()) {
            jORxRYg |= 8388608;
        }
        AtomicBoolean atomicBoolean = QceJvZ;
        if (JFG > 9630) {
            atomicBoolean.set(false);
            return Long.valueOf(jORxRYg);
        }
        while (true) {
            int i2 = JFG;
            if (i2 + 26 == 88) {
                JFG = (i2 * 66) >> MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void dbAction(boolean z) {
        if (z) {
            QceJvZ.set(true);
        }
    }
}
