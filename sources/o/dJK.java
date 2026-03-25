package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.account.api.model.login.BindConst;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.dFP;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJK implements dFP.StateListAnimator {
    public final WeakReference<C13241dEa> copydefault;

    public dJK(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.copydefault = weakReference;
    }

    @Override // o.dFP.StateListAnimator
    public void copydefault(android.os.Bundle bundle) {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            java.lang.String string = bundle != null ? bundle.getString(BindConst.TELEGRAM_RESULT_KEY) : null;
            c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + c13241dEa.dNCPSb() + ", " + string + ")", null);
        }
    }

    @Override // o.dFP.StateListAnimator
    public void EZpvd(android.os.Bundle bundle) {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            java.lang.String string = bundle != null ? bundle.getString(BindConst.TELEGRAM_RESULT_KEY) : null;
            if (string != null && !C59449zhJ.startsWith$default(string, "{", false, 2, null)) {
                string = ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + string + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            }
            c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + c13241dEa.dNCPSb() + ", " + string + ")", null);
        }
    }

    @Override // o.dFP.StateListAnimator
    public void EZpvd(java.lang.String str) {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            if (str != null && !C59449zhJ.startsWith$default(str, "{", false, 2, null)) {
                str = ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            }
            c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + c13241dEa.dNCPSb() + ", " + str + ")", null);
        }
    }

    @Override // o.dFP.StateListAnimator
    public void KWHzl(android.os.Bundle bundle) {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            java.lang.String string = bundle != null ? bundle.getString(BindConst.TELEGRAM_RESULT_KEY) : null;
            c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + c13241dEa.dNCPSb() + ", " + string + ")", null);
        }
    }

    @Override // o.dFP.StateListAnimator
    public void AEQbTJ(android.os.Bundle bundle) {
        java.lang.String string;
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            if (bundle == null || (string = bundle.getString("data")) == null) {
                string = "";
            }
            c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + c13241dEa.dNCPSb() + ", " + string + ")", null);
        }
    }

    @Override // o.dFP.StateListAnimator
    public void OLrzqt(android.os.Bundle bundle) {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.evaluateJavascript("window.tronLink.sendError(" + c13241dEa.dNCPSb() + ", \"" + c13241dEa.getContext().getString(dLX.Dialog.AxsJAY) + "\")", null);
        }
    }
}
