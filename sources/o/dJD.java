package o;

import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C13273dFf;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJD implements C13273dFf.Activity {
    public final WeakReference<C13241dEa> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(boolean z) {
        return z ? "window.svm" : "window.solana";
    }

    public dJD(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.OLrzqt = weakReference;
    }

    @Override // o.C13273dFf.Activity
    public void OLrzqt(android.os.Bundle bundle, boolean z) {
        java.lang.String string;
        java.lang.String string2;
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            java.lang.String str = "";
            if (bundle == null || (string = bundle.getString("tx_sign")) == null) {
                string = "";
            }
            if (bundle != null && (string2 = bundle.getString("data")) != null) {
                str = string2;
            }
            java.util.HashMap map = new java.util.HashMap();
            map.put("publicKey", C33129mqd.gEmmrt(c13241dEa.AEQbTJ()));
            map.put("signatures", str);
            map.put("txs", string);
            c13241dEa.evaluateJavascript(KWHzl(z) + ".sendResultResponse(" + c13241dEa.dNCPSb() + ",\"\"," + new Gson().toJson(map) + ")", null);
        }
    }

    @Override // o.C13273dFf.Activity
    public void EZpvd(android.os.Bundle bundle, boolean z) {
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.evaluateJavascript(KWHzl(z) + ".sendErrorResponse(" + c13241dEa.dNCPSb() + ",\"" + c13241dEa.getFieldNames() + "\",\"" + c13241dEa.getContext().getString(dLX.Dialog.AxsJAY) + "\")", null);
        }
    }

    @Override // o.C13273dFf.Activity
    public void copydefault(android.os.Bundle bundle, boolean z) {
        java.lang.String string;
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            if (bundle == null || (string = bundle.getString("data")) == null) {
                string = "";
            }
            java.util.Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("txHash", string));
            c13241dEa.evaluateJavascript(KWHzl(z) + ".sendResultResponse(" + c13241dEa.dNCPSb() + ",\"\"," + new Gson().toJson(mapEZpvd) + ")", null);
        }
    }
}
