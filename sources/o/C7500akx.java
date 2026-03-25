package o;

import androidx.recyclerview.widget.RecyclerView;
import o.C7382ail;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.akx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7500akx implements C7382ail.Application {
    public static java.lang.reflect.Method KWHzl;
    public final C7494akr OLrzqt = new C7494akr();
    public final RecyclerView.RecycledViewPool copydefault = new C7502akz(C7330ahm.AkhnZx);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7494akr AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecyclerView.RecycledViewPool copydefault() {
        return this.copydefault;
    }

    public static C7500akx AEQbTJ(@androidx.annotation.NonNull Globals globals) {
        C7382ail c7382ail = ((C7322ahe) globals.AuCTel()).AYXKKw;
        C7500akx c7500akx = (C7500akx) c7382ail.EZpvd(C7500akx.class);
        if (c7500akx != null) {
            return c7500akx;
        }
        C7500akx c7500akx2 = new C7500akx();
        c7382ail.OLrzqt(C7500akx.class, c7500akx2);
        return c7500akx2;
    }

    private C7500akx() {
    }

    public void EZpvd() {
        this.copydefault.clear();
    }

    public int gEmmrt() {
        java.lang.reflect.Method methodOLrzqt = OLrzqt();
        if (methodOLrzqt == null) {
            return 0;
        }
        try {
            return ((java.lang.Integer) methodOLrzqt.invoke(this.copydefault, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static java.lang.reflect.Method OLrzqt() {
        java.lang.reflect.Method method = KWHzl;
        if (method != null) {
            return method;
        }
        try {
            java.lang.reflect.Method declaredMethod = RecyclerView.RecycledViewPool.class.getDeclaredMethod("size", new java.lang.Class[0]);
            KWHzl = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.Throwable unused) {
        }
        return KWHzl;
    }

    @Override // o.C7382ail.Application
    public void KWHzl() {
        EZpvd();
        this.OLrzqt.OLrzqt();
    }
}
