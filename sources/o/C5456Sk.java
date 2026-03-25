package o;

import android.os.Handler;

/* JADX INFO: renamed from: o.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5456Sk<Z> extends AbstractC5449Sd<Z> {
    public static final android.os.Handler OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper(), new Handler.Callback() { // from class: o.Sk.3
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C5456Sk) message.obj).KWHzl();
            return true;
        }
    });
    public final ComponentCallbacks2C5333Nr AEQbTJ;

    @Override // o.InterfaceC5462Sq
    public void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    public static <Z> C5456Sk<Z> OLrzqt(ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, int i, int i2) {
        return new C5456Sk<>(componentCallbacks2C5333Nr, i, i2);
    }

    public C5456Sk(ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, int i, int i2) {
        super(i, i2);
        this.AEQbTJ = componentCallbacks2C5333Nr;
    }

    @Override // o.InterfaceC5462Sq
    public void copydefault(@androidx.annotation.NonNull Z z, @androidx.annotation.Nullable InterfaceC5460So<? super Z> interfaceC5460So) {
        RV rvOLrzqt = OLrzqt();
        if (rvOLrzqt == null || !rvOLrzqt.valueOf()) {
            return;
        }
        OLrzqt.obtainMessage(1, this).sendToTarget();
    }

    public void KWHzl() {
        this.AEQbTJ.EZpvd((InterfaceC5462Sq<?>) this);
    }
}
