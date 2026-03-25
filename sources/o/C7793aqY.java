package o;

import com.immomo.mls.utils.AssertUtils;
import com.immomo.mls.utils.ScriptLoadException;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.aqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7793aqY {

    /* JADX INFO: renamed from: o.aqY$Activity */
    public interface Activity {
        void copydefault(int i, @androidx.annotation.Nullable java.lang.String str);
    }

    private C7793aqY() {
    }

    public static void EZpvd(@androidx.annotation.NonNull C8016auk c8016auk, @androidx.annotation.NonNull Globals globals, @androidx.annotation.Nullable Activity activity) {
        AssertUtils.AEQbTJ(c8016auk);
        AssertUtils.AEQbTJ(globals);
        AssertUtils.AEQbTJ(c8016auk.AEQbTJ());
        try {
            C7856ari.KWHzl(c8016auk, globals);
            C7838arQ.AEQbTJ(c8016auk.valueOf());
            copydefault(c8016auk, globals, activity);
        } catch (ScriptLoadException e) {
            EZpvd(activity, 1, e.getMsg());
        }
    }

    public static void copydefault(@androidx.annotation.NonNull C8016auk c8016auk, @androidx.annotation.NonNull Globals globals, @androidx.annotation.Nullable Activity activity) {
        if (globals.isDestroyed()) {
            return;
        }
        C7838arQ.copydefault(c8016auk.valueOf());
        if (globals.gEmmrt()) {
            EZpvd(activity, 0, (java.lang.String) null);
        } else {
            EZpvd(activity, 2, globals.values());
        }
    }

    public static void EZpvd(@androidx.annotation.Nullable Activity activity, int i, java.lang.String str) {
        if (activity != null) {
            activity.copydefault(i, str);
        }
    }
}
