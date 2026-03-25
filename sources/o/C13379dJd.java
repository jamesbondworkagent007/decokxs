package o;

import com.google.gson.Gson;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.dGQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13379dJd implements dGQ.StateListAnimator {
    public final WeakReference<C13241dEa> AEQbTJ;

    public C13379dJd(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(5);
            c13241dEa.evaluateJavascript("window.keplr.sendError(" + str + ",\"" + str2 + "\")", null);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.QVAiDq();
            }
        }
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        InterfaceC9738bbJ interfaceC9738bbJValues;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(5);
            if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "requestAccounts") || (interfaceC9738bbJValues = c13241dEa.values()) == null) {
                return;
            }
            java.lang.String strEZpvd = interfaceC9738bbJValues.EZpvd(java.lang.Long.parseLong(str2));
            java.lang.String strKWHzl = ((InterfaceC9848bdN) C43251rlk.copydefault(InterfaceC9848bdN.class)).KWHzl(interfaceC9738bbJValues.OLrzqt(java.lang.Long.parseLong(str2)));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, strEZpvd), C56390yDp.OLrzqt("pubKey", strKWHzl));
                c13241dEa.evaluateJavascript("window.keplr.sendResponse(" + c13241dEa.dNCPSb() + ",JSON.stringify(" + new Gson().toJson(mapGEmmrt) + "))", null);
                return;
            }
            java.util.Map mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, strEZpvd), C56390yDp.OLrzqt("pubKey", ""));
            c13241dEa.evaluateJavascript("window.keplr.sendResponse(" + c13241dEa.dNCPSb() + ",JSON.stringify(" + new Gson().toJson(mapGEmmrt2) + "))", null);
        }
    }

    @Override // o.dGQ.StateListAnimator
    public void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(5);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
            }
        }
    }
}
