package o;

import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.PendingOrderLine;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPG {
    public static final wPG KWHzl = new wPG();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wPE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wPG.EZpvd();
        }
    });
    public static final int EZpvd = 8;

    private wPG() {
    }

    public static final oKA EZpvd() {
        return (oKA) C43251rlk.copydefault(oKA.class);
    }

    public final oKA OLrzqt() {
        return (oKA) AEQbTJ.getValue();
    }

    public final void OLrzqt(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        PendingOrderLine pendingOrderLineAEQbTJ = Intrinsics.EZpvd((java.lang.Object) gridReq.getOrdType(), (java.lang.Object) "grid") ? AEQbTJ(gridReq) : null;
        if (pendingOrderLineAEQbTJ != null) {
            pUU.KWHzl("BotKlineHelper", gridReq.getOrdType() + " -> " + pendingOrderLineAEQbTJ);
            KWHzl.OLrzqt().AEQbTJ(pendingOrderLineAEQbTJ);
        }
    }

    public final void EZpvd(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        PendingOrderLine pendingOrderLineOLrzqt = OLrzqt(contractGridReq);
        pUU.KWHzl("BotKlineHelper", contractGridReq.getOrdType() + " -> " + pendingOrderLineOLrzqt);
        OLrzqt().AEQbTJ(pendingOrderLineOLrzqt);
    }

    public final void KWHzl() {
        ((oKA) C43251rlk.copydefault(oKA.class)).AEQbTJ(new PendingOrderLine("", "", "", yDY.AhwBna()));
        pUU.KWHzl("BotKlineHelper", "clear pending order line now");
    }

    public final PendingOrderLine AEQbTJ(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String minPx = gridReq.getMinPx();
        java.lang.String maxPx = gridReq.getMaxPx();
        java.lang.String gridNum = gridReq.getGridNum();
        java.lang.String runType = gridReq.getRunType();
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(gridReq.getSignParams());
        return c56068xvo.OLrzqt("grid", (960 & 2) != 0 ? null : minPx, (960 & 4) != 0 ? null : maxPx, (960 & 8) != 0 ? null : gridNum, (960 & 16) != 0 ? null : runType, (960 & 32) != 0 ? null : advancedTriggerSign != null ? advancedTriggerSign.getTriggerPx() : null, (960 & 64) != 0 ? null : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : null, (960 & 512) == 0 ? null : null);
    }

    public final PendingOrderLine OLrzqt(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String minPx = contractGridReq.getMinPx();
        java.lang.String maxPx = contractGridReq.getMaxPx();
        java.lang.String gridNum = contractGridReq.getGridNum();
        java.lang.String runType = contractGridReq.getRunType();
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(contractGridReq.getSignParams());
        return c56068xvo.OLrzqt("contract_grid", (960 & 2) != 0 ? null : minPx, (960 & 4) != 0 ? null : maxPx, (960 & 8) != 0 ? null : gridNum, (960 & 16) != 0 ? null : runType, (960 & 32) != 0 ? null : advancedTriggerSign != null ? advancedTriggerSign.getTriggerPx() : null, (960 & 64) != 0 ? null : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : contractGridReq.getDirection(), (960 & 512) == 0 ? null : null);
    }
}
