package o;

/* JADX INFO: renamed from: o.pJk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C38024pJk {
    public static java.util.HashMap<java.lang.String, java.util.List<C38022pJi>> OLrzqt = new java.util.HashMap<>();

    private C38024pJk() {
    }

    public static java.lang.String OLrzqt(java.lang.Object obj) {
        return obj == null ? "" : java.lang.String.format("%s-%s", obj.getClass().getName(), java.lang.String.valueOf(obj.hashCode()));
    }

    public static java.util.List<C38022pJi> AEQbTJ(java.lang.Object obj) {
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (android.text.TextUtils.isEmpty(strOLrzqt)) {
            return null;
        }
        return OLrzqt.get(strOLrzqt);
    }

    public static void KWHzl(java.lang.Object obj) {
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (android.text.TextUtils.isEmpty(strOLrzqt)) {
            return;
        }
        OLrzqt.remove(strOLrzqt);
    }
}
