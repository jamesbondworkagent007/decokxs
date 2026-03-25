package o;

/* JADX INFO: renamed from: o.arw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7870arw {
    public static void AEQbTJ(java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().copydefault("[LuaView]", OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static void KWHzl(java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().EZpvd("[LuaView]", OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static void copydefault(java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().AEQbTJ("[LuaView]", OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static void KWHzl(java.lang.Throwable th, java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().OLrzqt("[LuaView]", th, OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static void EZpvd(java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().OLrzqt("[LuaView]", OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static void AEQbTJ(@androidx.annotation.Nullable java.lang.Throwable th, java.lang.Object... objArr) {
        C7323ahf.AEQbTJ().AEQbTJ("[LuaView]", th, OLrzqt(objArr), new java.lang.Object[0]);
    }

    public static java.lang.String OLrzqt(java.lang.Object... objArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                stringBuffer.append(obj);
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
