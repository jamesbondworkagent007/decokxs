package o;

import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.dFE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJG implements dFE.Application {
    public final WeakReference<C13241dEa> copydefault;

    public dJG(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.copydefault = weakReference;
    }

    @Override // o.dFE.Application
    public void AEQbTJ(@NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(9);
            c13241dEa.evaluateJavascript("window.okxTonWallet.sendError(" + obj + "," + num + ",\"" + str + "\")", null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.dFE.Application
    public void copydefault(@NotNull java.lang.Object obj, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(9);
            switch (str.hashCode()) {
                case -1703386833:
                    if (!str.equals("tonConnect_reconnect")) {
                        return;
                    }
                    break;
                case -1365094972:
                    if (str.equals("tonConnect_disconnect")) {
                        c13241dEa.evaluateJavascript("window.okxTonWallet.sendResponse(" + obj + ",[])", null);
                        return;
                    }
                    return;
                case 1636816066:
                    if (!str.equals("tonConnect_connect")) {
                        return;
                    }
                    break;
                case 1708861966:
                    if (str.equals("tonConnect_sendTransaction")) {
                        c13241dEa.evaluateJavascript("window.okxTonWallet.sendResponse(" + obj + "," + new Gson().toJson(C56424yEw.djBIcL(C56390yDp.OLrzqt("result", bundle.getString("tx_sign")))) + ")", null);
                        return;
                    }
                    return;
                default:
                    return;
            }
            java.lang.String string = bundle.getString("result");
            pUU.KWHzl("dappwebview", string != null ? string : "");
            c13241dEa.evaluateJavascript("window.okxTonWallet.sendResponse(" + obj + "," + string + ")", null);
        }
    }

    @Override // o.dFE.Application
    public void copydefault(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(9);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(607L, str, interfaceC9738bbJ, false);
            }
        }
    }

    @Override // o.dFE.Application
    public void copydefault() {
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.gkJEwt();
        }
    }
}
