package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import o.C55688xof;

/* JADX INFO: renamed from: o.wUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52689wUs {
    public static final C52689wUs KWHzl = new C52689wUs();

    private C52689wUs() {
    }

    public final void EZpvd(android.app.Activity activity) {
        InterfaceC49505upn interfaceC49505upn;
        if (C48291uMa.Companion.AEQbTJ().copydefault()) {
            if (activity != null) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKt))), null, 4, null);
            }
        } else {
            if (activity == null || (interfaceC49505upn = (InterfaceC49505upn) C43251rlk.OLrzqt(InterfaceC49505upn.class)) == null) {
                return;
            }
            interfaceC49505upn.OLrzqt(activity, 0);
        }
    }
}
