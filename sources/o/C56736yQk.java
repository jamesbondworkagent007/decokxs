package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56736yQk {
    public static final C56736yQk EZpvd = new C56736yQk();
    public static ActionBar OLrzqt;

    /* JADX INFO: renamed from: o.yQk$ActionBar */
    public static final class ActionBar {
        public final java.lang.reflect.Method EZpvd;
        public final java.lang.reflect.Method KWHzl;
        public final java.lang.reflect.Method OLrzqt;
        public final java.lang.reflect.Method copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method copydefault() {
            return this.OLrzqt;
        }

        public ActionBar(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4) {
            this.KWHzl = method;
            this.EZpvd = method2;
            this.copydefault = method3;
            this.OLrzqt = method4;
        }
    }

    private C56736yQk() {
    }

    public final ActionBar AEQbTJ() {
        try {
            return new ActionBar(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new ActionBar(null, null, null, null);
        }
    }

    public final ActionBar copydefault() {
        ActionBar actionBar = OLrzqt;
        if (actionBar != null) {
            return actionBar;
        }
        ActionBar actionBarAEQbTJ = AEQbTJ();
        OLrzqt = actionBarAEQbTJ;
        return actionBarAEQbTJ;
    }

    public final java.lang.Boolean AEQbTJ(@NotNull java.lang.Class<?> cls) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.reflect.Method methodAEQbTJ = copydefault().AEQbTJ();
        if (methodAEQbTJ == null) {
            return null;
        }
        java.lang.Object objInvoke = methodAEQbTJ.invoke(cls, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        return (java.lang.Boolean) objInvoke;
    }

    public final java.lang.Class<?>[] OLrzqt(@NotNull java.lang.Class<?> cls) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.reflect.Method methodKWHzl = copydefault().KWHzl();
        if (methodKWHzl == null) {
            return null;
        }
        java.lang.Object objInvoke = methodKWHzl.invoke(cls, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        return (java.lang.Class[]) objInvoke;
    }

    public final java.lang.Boolean KWHzl(@NotNull java.lang.Class<?> cls) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.reflect.Method methodEZpvd = copydefault().EZpvd();
        if (methodEZpvd == null) {
            return null;
        }
        java.lang.Object objInvoke = methodEZpvd.invoke(cls, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        return (java.lang.Boolean) objInvoke;
    }

    public final java.lang.Object[] EZpvd(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.reflect.Method methodCopydefault = copydefault().copydefault();
        if (methodCopydefault == null) {
            return null;
        }
        return (java.lang.Object[]) methodCopydefault.invoke(cls, new java.lang.Object[0]);
    }
}
