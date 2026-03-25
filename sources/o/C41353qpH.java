package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.qpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41353qpH {
    public static /* synthetic */ void friendlyToast$default(java.lang.Throwable th, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        AEQbTJ(th, z);
    }

    public static final void AEQbTJ(java.lang.Throwable th, boolean z) {
        java.lang.String message;
        java.lang.String message2;
        if (th instanceof CancellationException) {
            pUU.EZpvd(th + " friendlyToast invoke");
            return;
        }
        if (z) {
            if (th == null || (message2 = th.getMessage()) == null) {
                return;
            }
            C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            return;
        }
        if (th == null || (message = th.getMessage()) == null) {
            return;
        }
        C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }
}
