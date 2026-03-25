package o;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.aha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7318aha {
    public static ActionBar AEQbTJ = null;
    public static byte KWHzl = 1;
    public static StateListAnimator OLrzqt = null;
    public static boolean copydefault = true;

    /* JADX INFO: renamed from: o.aha$ActionBar */
    public interface ActionBar {
        void EZpvd(Globals globals, long j);

        boolean EZpvd(java.lang.Throwable th, Globals globals);

        LuaUserdata KWHzl(long j, @androidx.annotation.NonNull LuaUserdata luaUserdata);

        void KWHzl(Globals globals, boolean z);
    }

    /* JADX INFO: renamed from: o.aha$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public interface Application {
        void EZpvd(java.lang.String str);

        void OLrzqt(java.lang.String str);
    }

    /* JADX INFO: renamed from: o.aha$StateListAnimator */
    public interface StateListAnimator {
        void KWHzl(Globals globals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OLrzqt(ActionBar actionBar) {
        AEQbTJ = actionBar;
    }

    public static void KWHzl(Globals globals, boolean z) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.KWHzl(globals, z);
        }
    }

    public static boolean OLrzqt(java.lang.Throwable th, Globals globals) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            return actionBar.EZpvd(th, globals);
        }
        return false;
    }

    public static void EZpvd(Globals globals, long j) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.EZpvd(globals, j);
        }
    }

    public static LuaUserdata OLrzqt(long j, @androidx.annotation.NonNull LuaUserdata luaUserdata) {
        ActionBar actionBar = AEQbTJ;
        return actionBar != null ? actionBar.KWHzl(j, luaUserdata) : luaUserdata;
    }

    public static void copydefault(Globals globals) {
        StateListAnimator stateListAnimator = OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(globals);
        }
    }
}
