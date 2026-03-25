package o;

import java.lang.reflect.InvocationHandler;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o.mpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33098mpz implements InvocationHandler {
    public java.lang.Object KWHzl;
    public final java.util.List<java.lang.String> OLrzqt = java.util.Arrays.asList("activityStopped", "reportSizeConfigurations", "isTopOfTask");

    public C33098mpz(java.lang.Object obj) {
        this.KWHzl = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (this.OLrzqt.contains(method.getName())) {
            pUU.EZpvd("IActivityManagerProxy", "invoke: " + method.getName());
            try {
                return method.invoke(this.KWHzl, objArr);
            } catch (java.lang.Exception e) {
                pUU.EZpvd("IActivityManagerProxy", "Catch Exception: " + e);
                pUX.OLrzqt.AEQbTJ(e);
                if (e.getCause() != null) {
                    KWHzl(objArr, e.getCause());
                }
                if ("isTopOfTask".equals(method.getName())) {
                    return java.lang.Boolean.TRUE;
                }
                return null;
            }
        }
        return method.invoke(this.KWHzl, objArr);
    }

    public final void KWHzl(java.lang.Object[] objArr, java.lang.Throwable th) {
        java.lang.Object obj;
        if (objArr.length == 4 && (obj = objArr[1]) != null && (obj instanceof android.os.Bundle)) {
            try {
                C33096mpx.EZpvd((android.os.Bundle) objArr[1], new LinkedHashMap());
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("tag", e);
            }
        }
    }
}
