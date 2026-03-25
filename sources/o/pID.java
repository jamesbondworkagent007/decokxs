package o;

/* JADX INFO: loaded from: classes9.dex */
public class pID implements pIK {
    @Override // o.pIK
    public void AEQbTJ(android.os.Message message) {
        try {
            java.lang.Object obj = message.obj;
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("token");
            declaredField.setAccessible(true);
            OLrzqt((android.os.IBinder) declaredField.get(obj));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.pIK
    public void copydefault(android.os.Message message) {
        KWHzl(message);
    }

    @Override // o.pIK
    public void OLrzqt(android.os.Message message) {
        KWHzl(message);
    }

    @Override // o.pIK
    public void EZpvd(android.os.Message message) {
        KWHzl(message);
    }

    public final void KWHzl(android.os.Message message) {
        try {
            java.lang.Object obj = message.obj;
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("arg1");
            declaredField.setAccessible(true);
            OLrzqt((android.os.IBinder) declaredField.get(obj));
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public void OLrzqt(android.os.IBinder iBinder) throws java.lang.Exception {
        java.lang.Object objInvoke = java.lang.Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Class<?> cls = objInvoke.getClass();
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        cls.getDeclaredMethod("finishActivity", android.os.IBinder.class, cls2, android.content.Intent.class, cls2).invoke(objInvoke, iBinder, 0, null, 0);
        pUU.EZpvd(pID.class.getSimpleName(), "finish");
    }
}
