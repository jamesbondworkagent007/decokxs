package o;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.dFP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJH implements dFP.Activity {
    public final WeakReference<C13241dEa> OLrzqt;

    public dJH(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.OLrzqt = weakReference;
    }

    @Override // o.dFP.Activity
    public void OLrzqt(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setWeb3JsIdSign(java.lang.String.valueOf(j));
            c13241dEa.setAddress(str);
            c13241dEa.evaluateJavascript(C59442zhC.fJNWhG("\n                    window.originTronWeb.defaultAddress.hex = window.tronWeb.address.toHex(\"" + str + "\");\n                    window.originTronWeb.defaultAddress.base58 = \"" + str + "\";\n                    window.originTronWeb.ready = true;\n                    window.tronLink.ready = true;\n                    window.originTronWeb.isTronMode = true;\n                    "), null);
            if (j != -1) {
                c13241dEa.setDappType(2);
                c13241dEa.evaluateJavascript("window.tronLink.sendResponse(" + j + ", {\"code\": 200, \"message\":\"success\"})", null);
            }
        }
    }

    @Override // o.dFP.Activity
    public void OLrzqt(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(2);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
            }
        }
    }

    @Override // o.dFP.Activity
    public void EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.setWeb3JsIdSign(java.lang.String.valueOf(j));
            c13241dEa.setDappType(2);
        }
    }

    @Override // o.dFP.Activity
    public void AEQbTJ(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.OLrzqt.get();
        if (c13241dEa != null) {
            c13241dEa.evaluateJavascript("window.tronLink.sendError(" + j + ", \"" + str + "\")", null);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.QVAiDq();
            }
            if (j != -1) {
                c13241dEa.setDappType(2);
            }
        }
    }
}
