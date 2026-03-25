package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46606taO implements InterfaceC46612taU {
    public androidx.fragment.app.Fragment EZpvd;
    public android.content.Context KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.EZpvd = null;
        this.KWHzl = null;
    }

    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
        this.KWHzl = fragment.getContext();
    }

    @Override // o.InterfaceC46612taU
    public void copydefault(MarketCoinInfo marketCoinInfo, InterfaceC41655qus interfaceC41655qus, java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2) {
        oKA oka;
        DexInstrument dexInstrumentCopydefault;
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Context context = this.KWHzl;
        if (context == null || (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) == null) {
            return;
        }
        oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, str, num, null, null, str2, (interfaceC41655qus == null || (dexInstrumentCopydefault = interfaceC41655qus.copydefault()) == null) ? null : new C35968oKj(dexInstrumentCopydefault.getChainId(), dexInstrumentCopydefault.getTokenContractAddress(), dexInstrumentCopydefault.getChainName(), dexInstrumentCopydefault.getTokenSymbol(), dexInstrumentCopydefault.getChainLogoUrl(), dexInstrumentCopydefault.getTokenLogoUrl(), ""), null, 1228, null);
    }
}
