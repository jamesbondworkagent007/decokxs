package o;

import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C13273dFf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJF implements C13273dFf.Application {
    public final WeakReference<C13241dEa> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(boolean z) {
        return z ? "window.svm" : "window.solana";
    }

    public dJF(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.OLrzqt = weakReference;
    }

    @Override // o.C13273dFf.Application
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        dES des;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(1);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.evaluateJavascript(OLrzqt(z) + ".sendErrorResponse(" + c13241dEa.dNCPSb() + ",\"" + str3 + "\",\"" + str2 + "\")", null);
            if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "connect") || (des = c13241dEa.aKErDB().get()) == null) {
                return;
            }
            des.QVAiDq();
        }
    }

    @Override // o.C13273dFf.Application
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(1);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setMAction(str3);
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "changeNetwork") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "getNetwork")) {
                java.util.HashMap map = new java.util.HashMap();
                map.put("genesisHash", str2);
                new Gson().toJson(map);
                c13241dEa.evaluateJavascript(OLrzqt(z) + ".sendResultResponse(" + c13241dEa.dNCPSb() + ",\"" + str3 + "\"," + new Gson().toJson(map) + ")", null);
            }
        }
    }

    @Override // o.C13273dFf.Application
    public void KWHzl(java.lang.Long l, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setAddress(str);
            c13241dEa.setDappType(1);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(l, str, interfaceC9738bbJ, z);
            }
        }
    }

    @Override // o.C13273dFf.Application
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(1);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setMAction(str3);
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "connect")) {
                java.util.HashMap map = new java.util.HashMap();
                map.put("publicKey", str2);
                c13241dEa.evaluateJavascript(OLrzqt(z) + ".sendParamsResponse(" + c13241dEa.dNCPSb() + ", \"connect\"," + new Gson().toJson(map) + ")", null);
                c13241dEa.evaluateJavascript("window.tronWeb.isTronMode = false;", null);
            }
        }
    }
}
