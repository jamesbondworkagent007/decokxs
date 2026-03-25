package o;

import com.onesignal.CallbackThreadManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.yoL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57749yoL<ObserverType, StateType> {
    public boolean EZpvd;
    public java.util.List<java.lang.Object> KWHzl = new java.util.ArrayList();
    public java.lang.String OLrzqt;

    public C57749yoL(java.lang.String str, boolean z) {
        this.OLrzqt = str;
        this.EZpvd = z;
    }

    public void AEQbTJ(ObserverType observertype) {
        this.KWHzl.add(new WeakReference(observertype));
    }

    public void EZpvd(ObserverType observertype) {
        this.KWHzl.add(observertype);
    }

    public boolean KWHzl(final StateType statetype) {
        boolean z = false;
        for (final java.lang.Object obj : this.KWHzl) {
            if (obj instanceof WeakReference) {
                obj = ((WeakReference) obj).get();
            }
            if (obj != null) {
                try {
                    final java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod(this.OLrzqt, statetype.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.EZpvd) {
                        CallbackThreadManager.Companion.AEQbTJ(new java.lang.Runnable() { // from class: o.yoL.5
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    declaredMethod.invoke(obj, statetype);
                                } catch (java.lang.IllegalAccessException e) {
                                    e.printStackTrace();
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    } else {
                        try {
                            declaredMethod.invoke(obj, statetype);
                        } catch (java.lang.IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z = true;
                } catch (java.lang.NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return z;
    }
}
