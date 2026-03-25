package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56138xxE extends xKE<java.util.List<? extends StrategyResponse>> {
    public DcaOrderReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56138xxE copydefault(@NotNull DcaOrderReq dcaOrderReq) {
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        this.AEQbTJ = dcaOrderReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        DcaOrderReq dcaOrderReqCopy;
        DcaOrderReq dcaOrderReq = this.AEQbTJ;
        java.lang.String voucherId = dcaOrderReq != null ? dcaOrderReq.getVoucherId() : null;
        if (voucherId == null || voucherId.length() == 0) {
            DcaOrderReq dcaOrderReq2 = this.AEQbTJ;
            if (dcaOrderReq2 != null) {
                dcaOrderReqCopy = dcaOrderReq2.copy(((-1) & 1) != 0 ? dcaOrderReq2.instId : null, ((-1) & 2) != 0 ? dcaOrderReq2.initOrdAmt : null, ((-1) & 4) != 0 ? dcaOrderReq2.reserveFunds : null, ((-1) & 8) != 0 ? dcaOrderReq2.safetyOrdAmt : null, ((-1) & 16) != 0 ? dcaOrderReq2.maxSafetyOrds : null, ((-1) & 32) != 0 ? dcaOrderReq2.pxSteps : null, ((-1) & 64) != 0 ? dcaOrderReq2.pxStepsMult : null, ((-1) & 128) != 0 ? dcaOrderReq2.volMult : null, ((-1) & 256) != 0 ? dcaOrderReq2.tpPct : null, ((-1) & 512) != 0 ? dcaOrderReq2.slPct : null, ((-1) & 1024) != 0 ? dcaOrderReq2.direction : null, ((-1) & 2048) != 0 ? dcaOrderReq2.investType : null, ((-1) & 4096) != 0 ? dcaOrderReq2.investmentAmt : null, ((-1) & 8192) != 0 ? dcaOrderReq2.userRiskMode : null, ((-1) & 16384) != 0 ? dcaOrderReq2.sourceAlgoId : null, ((-1) & 32768) != 0 ? dcaOrderReq2.lever : null, ((-1) & 65536) != 0 ? dcaOrderReq2.slMode : null, ((-1) & 131072) != 0 ? dcaOrderReq2.triggerParams : null, ((-1) & 262144) != 0 ? dcaOrderReq2.initOrdPct : null, ((-1) & 524288) != 0 ? dcaOrderReq2.trackingMode : null, ((-1) & 1048576) != 0 ? dcaOrderReq2.profitSharingRatio : null, ((-1) & 2097152) != 0 ? dcaOrderReq2.totalAmt : null, ((-1) & 4194304) != 0 ? dcaOrderReq2.reinvestment : null, ((-1) & 8388608) != 0 ? dcaOrderReq2.isToManual : false, ((-1) & 16777216) != 0 ? dcaOrderReq2.autoMarginReloadSwitch : false, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dcaOrderReq2.autoMarginReloadMaxAmount : null, ((-1) & 67108864) != 0 ? dcaOrderReq2.annualizedRate : null, ((-1) & 134217728) != 0 ? dcaOrderReq2.instType : null, ((-1) & 268435456) != 0 ? dcaOrderReq2.autoTransfer : null, ((-1) & 536870912) != 0 ? dcaOrderReq2.ordType : null, ((-1) & 1073741824) != 0 ? dcaOrderReq2.systemSource : null, ((-1) & Integer.MIN_VALUE) != 0 ? dcaOrderReq2.nmpUnderlyingId : null, (12 & 1) != 0 ? dcaOrderReq2.batchNo : null, (12 & 2) != 0 ? dcaOrderReq2.voucherId : null, (12 & 4) != 0 ? dcaOrderReq2.tradeQuoteCcy : null, (12 & 8) != 0 ? dcaOrderReq2.vipProfit : null);
            } else {
                dcaOrderReqCopy = null;
            }
        } else {
            dcaOrderReqCopy = this.AEQbTJ;
        }
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (dcaOrderReqCopy == null) {
            dcaOrderReqCopy = new DcaOrderReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXContractDcaPlaceOrder = bizApiService.contractDcaPlaceOrder(dcaOrderReqCopy);
        final Function1 function1 = new Function1() { // from class: o.xxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56138xxE.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXContractDcaPlaceOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56138xxE.EZpvd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56138xxE.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56138xxE.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C56138xxE c56138xxE, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        DcaOrderReq dcaOrderReq = c56138xxE.AEQbTJ;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "contract_dca", instId == null ? "" : instId, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C56138xxE c56138xxE, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        DcaOrderReq dcaOrderReq = c56138xxE.AEQbTJ;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c55867xrz.OLrzqt((java.lang.String) null, "contract_dca", instId, th);
        return Unit.INSTANCE;
    }
}
