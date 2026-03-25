package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56258xzS extends xKE<java.util.List<? extends StrategyPendingListResp>> {
    public static final int AEQbTJ = 8;
    public StrategyPendingListReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56258xzS KWHzl(@NotNull StrategyPendingListReq strategyPendingListReq) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        this.copydefault = strategyPendingListReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyPendingListResp>>> EZpvd() {
        java.lang.String instType;
        StrategyPendingListReq strategyPendingListReq = this.copydefault;
        if (strategyPendingListReq == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyPendingListReq.getInstType(), (java.lang.Object) "ANY")) {
            instType = null;
        } else {
            StrategyPendingListReq strategyPendingListReq2 = this.copydefault;
            if (strategyPendingListReq2 == null) {
                Intrinsics.gEmmrt("");
                strategyPendingListReq2 = null;
            }
            instType = strategyPendingListReq2.getInstType();
        }
        BizApiService bizApiService = (BizApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(BizApiService.class), C56032xvE.KWHzl());
        StrategyPendingListReq strategyPendingListReq3 = this.copydefault;
        if (strategyPendingListReq3 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq3 = null;
        }
        java.lang.String algoId = strategyPendingListReq3.getAlgoId();
        StrategyPendingListReq strategyPendingListReq4 = this.copydefault;
        if (strategyPendingListReq4 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq4 = null;
        }
        java.lang.String instId = strategyPendingListReq4.getInstId();
        StrategyPendingListReq strategyPendingListReq5 = this.copydefault;
        if (strategyPendingListReq5 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq5 = null;
        }
        java.lang.String after = strategyPendingListReq5.getAfter();
        StrategyPendingListReq strategyPendingListReq6 = this.copydefault;
        if (strategyPendingListReq6 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq6 = null;
        }
        java.lang.String before = strategyPendingListReq6.getBefore();
        StrategyPendingListReq strategyPendingListReq7 = this.copydefault;
        if (strategyPendingListReq7 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq7 = null;
        }
        java.lang.String limit = strategyPendingListReq7.getLimit();
        StrategyPendingListReq strategyPendingListReq8 = this.copydefault;
        if (strategyPendingListReq8 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq8 = null;
        }
        java.lang.String start = strategyPendingListReq8.getStart();
        StrategyPendingListReq strategyPendingListReq9 = this.copydefault;
        if (strategyPendingListReq9 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq9 = null;
        }
        java.lang.String end = strategyPendingListReq9.getEnd();
        StrategyPendingListReq strategyPendingListReq10 = this.copydefault;
        if (strategyPendingListReq10 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq10 = null;
        }
        java.lang.String tdMode = strategyPendingListReq10.getTdMode();
        StrategyPendingListReq strategyPendingListReq11 = this.copydefault;
        if (strategyPendingListReq11 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq11 = null;
        }
        java.lang.String instDirection = strategyPendingListReq11.getInstDirection();
        StrategyPendingListReq strategyPendingListReq12 = this.copydefault;
        if (strategyPendingListReq12 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq12 = null;
        }
        java.lang.String posOrSide = strategyPendingListReq12.getPosOrSide();
        StrategyPendingListReq strategyPendingListReq13 = this.copydefault;
        if (strategyPendingListReq13 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq13 = null;
        }
        java.lang.String referName = strategyPendingListReq13.getReferName();
        StrategyPendingListReq strategyPendingListReq14 = this.copydefault;
        if (strategyPendingListReq14 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq14 = null;
        }
        java.lang.String sortType = strategyPendingListReq14.getSortType();
        StrategyPendingListReq strategyPendingListReq15 = this.copydefault;
        if (strategyPendingListReq15 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq15 = null;
        }
        java.lang.String source = strategyPendingListReq15.getSource();
        StrategyPendingListReq strategyPendingListReq16 = this.copydefault;
        if (strategyPendingListReq16 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq16 = null;
        }
        java.lang.String ordType = strategyPendingListReq16.getOrdType();
        StrategyPendingListReq strategyPendingListReq17 = this.copydefault;
        if (strategyPendingListReq17 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq17 = null;
        }
        boolean requireProfits = strategyPendingListReq17.getRequireProfits();
        StrategyPendingListReq strategyPendingListReq18 = this.copydefault;
        if (strategyPendingListReq18 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq18 = null;
        }
        java.lang.String baseCoins = strategyPendingListReq18.getBaseCoins();
        StrategyPendingListReq strategyPendingListReq19 = this.copydefault;
        if (strategyPendingListReq19 == null) {
            Intrinsics.gEmmrt("");
            strategyPendingListReq19 = null;
        }
        return BizApiService.TaskDescription.getPendingStrategyOrderList$default(bizApiService, algoId, instType, instId, after, before, limit, start, end, tdMode, instDirection, posOrSide, referName, sortType, source, ordType, null, java.lang.Boolean.valueOf(requireProfits), null, null, null, baseCoins, strategyPendingListReq19.getSortOrder(), 950272, null);
    }
}
