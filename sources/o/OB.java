package o;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public class OB {
    public final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper(), new StateListAnimator());
    public boolean KWHzl;

    public void KWHzl(OC<?> oc, boolean z) {
        synchronized (this) {
            if (this.KWHzl || z) {
                this.AEQbTJ.obtainMessage(1, oc).sendToTarget();
            } else {
                this.KWHzl = true;
                oc.djBIcL();
                this.KWHzl = false;
            }
        }
    }

    public static final class StateListAnimator implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return false;
            }
            ((OC) message.obj).djBIcL();
            return true;
        }
    }
}
