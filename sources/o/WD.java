package o;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class WD {
    public static final WD KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static WD KWHzl() {
        return KWHzl;
    }

    public abstract PropertyName AEQbTJ(AnnotatedParameter annotatedParameter);

    public abstract java.lang.Boolean EZpvd(WM wm);

    public abstract java.lang.Boolean KWHzl(WM wm);

    static {
        WD wd;
        try {
            wd = (WD) C5619Yr.EZpvd(WC.class, false);
        } catch (java.lang.Throwable unused) {
            wd = null;
        }
        KWHzl = wd;
    }
}
