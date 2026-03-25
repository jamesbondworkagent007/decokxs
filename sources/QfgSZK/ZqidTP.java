package QfgSZK;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ZqidTP {
    final Context Umbazn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZqidTP(Context context) {
        this.Umbazn = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String geAOna() {
        return this.Umbazn.getPackageName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FileOutputStream openFileOutput(String str) throws FileNotFoundException {
        return this.Umbazn.openFileOutput(str, 0);
    }
}
