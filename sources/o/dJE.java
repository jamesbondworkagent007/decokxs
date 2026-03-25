package o;

import com.google.gson.Gson;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.dGQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJE implements dGQ.StateListAnimator {
    public final WeakReference<C13241dEa> KWHzl;

    public dJE(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.KWHzl = weakReference;
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.KWHzl.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(6);
            c13241dEa.evaluateJavascript("window.starknet.sendError(" + str + ",\"" + str2 + "\")", null);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.QVAiDq();
            }
        }
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.KWHzl.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(6);
            if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "requestAccounts") || c13241dEa.values() == null) {
                return;
            }
            java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2), C56390yDp.OLrzqt("network", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", "0x534e5f4d41494e"), C56390yDp.OLrzqt("rpcUrl", "https://www.okx.com/priapi/v1/wallet/rpc/send?chainId=9004"))));
            c13241dEa.evaluateJavascript(C59442zhC.fJNWhG("\n                              window.starknet.sendResponse(" + c13241dEa.dNCPSb() + ", JSON.stringify(" + new Gson().toJson(mapGEmmrt) + "));\n                            "), null);
        }
    }

    @Override // o.dGQ.StateListAnimator
    public void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.KWHzl.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(6);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
            }
        }
    }
}
