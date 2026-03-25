package o;

import com.okinc.core.util.SPUtils;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCD implements InterfaceC39921qCs<SearchTrader> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<SearchTrader> KWHzl = new java.util.ArrayList<>();

    public qCD() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("trade_search_history_trader", SearchTrader.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.KWHzl.addAll(arrayList);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.util.List<SearchTrader> EZpvd() {
        xND xndAEQbTJ;
        java.lang.Boolean boolAYXKKw;
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        return (interfaceC49317umK == null || !interfaceC49317umK.djBIcL() || (xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ()) == null || (boolAYXKKw = xndAEQbTJ.AYXKKw()) == null || !boolAYXKKw.booleanValue()) ? yDY.AhwBna() : this.KWHzl;
    }

    public void AEQbTJ(@NotNull SearchTrader searchTrader) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        if (!this.KWHzl.contains(searchTrader)) {
            this.KWHzl.add(0, searchTrader);
        } else {
            this.KWHzl.remove(searchTrader);
            this.KWHzl.add(0, searchTrader);
        }
        AEQbTJ();
    }

    public void copydefault() {
        this.KWHzl.clear();
        SPUtils.put("trade_search_history_trader", this.KWHzl);
    }

    public void AEQbTJ() {
        SPUtils.put("trade_search_history_trader", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.KWHzl, 20));
    }
}
