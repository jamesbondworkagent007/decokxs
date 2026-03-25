package o;

/* JADX INFO: loaded from: classes9.dex */
public final class pIO {
    public static boolean EZpvd(android.app.Instrumentation instrumentation) {
        java.lang.Object objKWHzl;
        android.app.Instrumentation instrumentationAEQbTJ;
        if (instrumentation == null || (objKWHzl = KWHzl()) == null || (instrumentationAEQbTJ = AEQbTJ()) == null) {
            return false;
        }
        if (instrumentationAEQbTJ instanceof pIS) {
            return true;
        }
        pIZ.OLrzqt("android.app.ActivityThread").KWHzl("mInstrumentation").OLrzqt(objKWHzl, instrumentation);
        return true;
    }

    public static java.lang.Object KWHzl() {
        return pIZ.OLrzqt("android.app.ActivityThread").EZpvd("currentActivityThread", new java.lang.Class[0]).copydefault(null, new java.lang.Object[0]);
    }

    public static android.app.Instrumentation AEQbTJ() {
        java.lang.Object objKWHzl = KWHzl();
        if (objKWHzl == null) {
            return null;
        }
        return (android.app.Instrumentation) pIZ.OLrzqt("android.app.ActivityThread").KWHzl("mInstrumentation").OLrzqt(objKWHzl);
    }
}
