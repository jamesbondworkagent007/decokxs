package o;

/* JADX INFO: loaded from: classes9.dex */
public class pIL implements pIK {
    @Override // o.pIK
    public void EZpvd(android.os.Message message) {
    }

    @Override // o.pIK
    public void OLrzqt(android.os.Message message) {
    }

    @Override // o.pIK
    public void copydefault(android.os.Message message) {
    }

    @Override // o.pIK
    public void AEQbTJ(android.os.Message message) {
        try {
            KWHzl(message);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            try {
                valueOf(message);
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                try {
                    djBIcL(message);
                } catch (java.lang.Throwable th3) {
                    th3.printStackTrace();
                }
            }
        }
    }

    public final void KWHzl(android.os.Message message) throws java.lang.Exception {
        AEQbTJ(((android.app.servertransaction.ClientTransaction) message.obj).getActivityToken());
    }

    public final void djBIcL(android.os.Message message) throws java.lang.Exception {
        java.lang.Object obj = message.obj;
        AEQbTJ((android.os.IBinder) obj.getClass().getDeclaredField("mActivityToken").get(obj));
    }

    public final void valueOf(android.os.Message message) throws java.lang.Exception {
        java.lang.Object obj = message.obj;
        AEQbTJ((android.os.IBinder) obj.getClass().getDeclaredMethod("getActivityToken", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]));
    }

    public void AEQbTJ(android.os.IBinder iBinder) throws java.lang.Exception {
        java.lang.Object objInvoke = android.app.ActivityManager.class.getDeclaredMethod("getService", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Class<?> cls = objInvoke.getClass();
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("finishActivity", android.os.IBinder.class, cls2, android.content.Intent.class, cls2);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(objInvoke, iBinder, 0, null, 0);
        pUU.EZpvd(pIL.class.getSimpleName(), "finish");
    }
}
