package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dQl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13576dQl extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56424yEw.gEmmrt(C56390yDp.OLrzqt("currencySymbol", interfaceC46553tYp.QUSxYX()), C56390yDp.OLrzqt("currencySign", interfaceC46553tYp.RJOkX()), C56390yDp.OLrzqt("currencyRate", java.lang.Double.valueOf(interfaceC46553tYp.QbewEr())), C56390yDp.OLrzqt("currencyPrecision", java.lang.Integer.valueOf(interfaceC46553tYp.QfsBiF())))));
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("getGlobalCurrencyInfo", "web3/wallet/js/getGlobalCurrencyInfo");
    }
}
