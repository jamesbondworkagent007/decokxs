package o;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.ypJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57800ypJ {
    public java.lang.Object AEQbTJ;
    public boolean AhwBna;
    public boolean EZpvd;
    public java.lang.reflect.Field KWHzl;
    public Activity OLrzqt;
    public android.content.Context copydefault;

    public C57800ypJ(android.content.Context context) {
        this.EZpvd = false;
        this.AhwBna = false;
        this.copydefault = context;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.AEQbTJ = cls.getMethod(com.ibm.icu.text.DateFormat.DAY, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.NullPointerException unused) {
                this.AEQbTJ = cls.getMethod("e", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                this.AhwBna = true;
            }
            java.lang.reflect.Field declaredField = cls.getDeclaredField("f");
            this.KWHzl = declaredField;
            declaredField.setAccessible(true);
            Activity activity = new Activity();
            this.OLrzqt = activity;
            activity.copydefault = (PurchasingListener) this.KWHzl.get(this.AEQbTJ);
            this.EZpvd = true;
            copydefault();
        } catch (java.lang.ClassCastException e) {
            OLrzqt(e);
        } catch (java.lang.ClassNotFoundException e2) {
            OLrzqt(e2);
        } catch (java.lang.IllegalAccessException e3) {
            OLrzqt(e3);
        } catch (java.lang.NoSuchFieldException e4) {
            OLrzqt(e4);
        } catch (java.lang.NoSuchMethodException e5) {
            OLrzqt(e5);
        } catch (InvocationTargetException e6) {
            OLrzqt(e6);
        }
    }

    public static void OLrzqt(java.lang.Exception exc) {
        OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public final void copydefault() {
        if (this.AhwBna) {
            OSUtils.EZpvd(new java.lang.Runnable() { // from class: o.ypJ.3
                @Override // java.lang.Runnable
                public void run() {
                    PurchasingService.registerListener(C57800ypJ.this.copydefault, C57800ypJ.this.OLrzqt);
                }
            });
        } else {
            PurchasingService.registerListener(this.copydefault, this.OLrzqt);
        }
    }

    public void AEQbTJ() {
        if (this.EZpvd) {
            try {
                Activity activity = (PurchasingListener) this.KWHzl.get(this.AEQbTJ);
                Activity activity2 = this.OLrzqt;
                if (activity != activity2) {
                    activity2.copydefault = activity;
                    copydefault();
                }
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: o.ypJ$Activity */
    public class Activity {
        public PurchasingListener copydefault;

        public Activity() {
        }
    }
}
