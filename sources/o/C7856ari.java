package o;

import com.immomo.mls.utils.ERROR;
import com.immomo.mls.utils.ScriptLoadException;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.ari, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7856ari {
    public static void KWHzl(@androidx.annotation.NonNull C8016auk c8016auk, @androidx.annotation.NonNull Globals globals) throws ScriptLoadException {
        copydefault(c8016auk.AEQbTJ(), globals);
    }

    public static void copydefault(@androidx.annotation.NonNull C8015auj c8015auj, @androidx.annotation.NonNull Globals globals) throws ScriptLoadException {
        boolean zOLrzqt;
        AEQbTJ(globals);
        if (c8015auj.AYXKKw()) {
            return;
        }
        if (c8015auj.OLrzqt == null && c8015auj.OLrzqt() == 0) {
            throw new ScriptLoadException(ERROR.COMPILE_FAILED, null);
        }
        java.lang.String strAEQbTJ = c8015auj.AEQbTJ();
        if (c8015auj.valueOf) {
            zOLrzqt = c8015auj.valueOf() ? globals.AEQbTJ(c8015auj.KWHzl(), strAEQbTJ) : globals.KWHzl(c8015auj.OLrzqt, strAEQbTJ);
        } else {
            zOLrzqt = globals.OLrzqt(strAEQbTJ, c8015auj.EZpvd());
        }
        c8015auj.EZpvd(zOLrzqt);
        c8015auj.OLrzqt(null);
        if (zOLrzqt) {
            return;
        }
        throw new ScriptLoadException(-5, "compile error" + globals.values(), null);
    }

    public static void AEQbTJ(@androidx.annotation.NonNull Globals globals) throws ScriptLoadException {
        if (globals.isDestroyed()) {
            throw new ScriptLoadException(ERROR.GLOBALS_DESTROY, null);
        }
    }
}
