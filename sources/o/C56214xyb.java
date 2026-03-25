package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56214xyb extends xKE<java.util.List<? extends StrategyResponse>> {
    public ContractGridReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56214xyb EZpvd(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.AEQbTJ = contractGridReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        ContractGridReq contractGridReq = this.AEQbTJ;
        ContractGridReq contractGridReqCopy = null;
        java.lang.String voucherId = contractGridReq != null ? contractGridReq.getVoucherId() : null;
        if (voucherId == null || voucherId.length() == 0) {
            ContractGridReq contractGridReq2 = this.AEQbTJ;
            if (contractGridReq2 != null) {
                contractGridReqCopy = contractGridReq2.copy(((-97) & 1) != 0 ? contractGridReq2.instId : null, ((-97) & 2) != 0 ? contractGridReq2.instType : null, ((-97) & 4) != 0 ? contractGridReq2.basePos : null, ((-97) & 8) != 0 ? contractGridReq2.gridNum : null, ((-97) & 16) != 0 ? contractGridReq2.investType : null, ((-97) & 32) != 0 ? contractGridReq2.maxPx : null, ((-97) & 64) != 0 ? contractGridReq2.minPx : null, ((-97) & 128) != 0 ? contractGridReq2.sz : null, ((-97) & 256) != 0 ? contractGridReq2.runType : null, ((-97) & 512) != 0 ? contractGridReq2.slTriggerPx : null, ((-97) & 1024) != 0 ? contractGridReq2.tpTriggerPx : null, ((-97) & 2048) != 0 ? contractGridReq2.tpRatio : null, ((-97) & 4096) != 0 ? contractGridReq2.slRatio : null, ((-97) & 8192) != 0 ? contractGridReq2.tpOrdPx : null, ((-97) & 16384) != 0 ? contractGridReq2.slOrdPx : null, ((-97) & 32768) != 0 ? contractGridReq2.direction : null, ((-97) & 65536) != 0 ? contractGridReq2.displayName : null, ((-97) & 131072) != 0 ? contractGridReq2.lever : null, ((-97) & 262144) != 0 ? contractGridReq2.signParams : null, ((-97) & 524288) != 0 ? contractGridReq2.profitSharingRatio : null, ((-97) & 1048576) != 0 ? contractGridReq2.ordType : null, ((-97) & 2097152) != 0 ? contractGridReq2.annualizedRate : null, ((-97) & 4194304) != 0 ? contractGridReq2.autoTransfer : null, ((-97) & 8388608) != 0 ? contractGridReq2.systemSource : null, ((-97) & 16777216) != 0 ? contractGridReq2.nmpUnderlyingId : null, ((-97) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? contractGridReq2.batchNo : null, ((-97) & 67108864) != 0 ? contractGridReq2.voucherId : null, ((-97) & 134217728) != 0 ? contractGridReq2.autoReserve : null, ((-97) & 268435456) != 0 ? contractGridReq2.actualMarginSz : null, ((-97) & 536870912) != 0 ? contractGridReq2.extraMarginSz : null, ((-97) & 1073741824) != 0 ? contractGridReq2.contractGridVersion : null, ((-97) & Integer.MIN_VALUE) != 0 ? contractGridReq2.openPosSlippage : null, (15 & 1) != 0 ? contractGridReq2.openPosSlippageDefault : null, (15 & 2) != 0 ? contractGridReq2.ordVariant : null, (15 & 4) != 0 ? contractGridReq2.algoId : null, (15 & 8) != 0 ? contractGridReq2.topupActualMarginSz : null);
            }
        } else {
            contractGridReqCopy = this.AEQbTJ;
        }
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        if (contractGridReqCopy == null) {
            contractGridReqCopy = new ContractGridReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, 15, (DefaultConstructorMarker) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXContractGridPlaceOrder = bizApiService.contractGridPlaceOrder(contractGridReqCopy);
        final Function1 function1 = new Function1() { // from class: o.xya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56214xyb.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXContractGridPlaceOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56214xyb.AEQbTJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56214xyb.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56214xyb.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C56214xyb c56214xyb, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        ContractGridReq contractGridReq = c56214xyb.AEQbTJ;
        java.lang.String instId = contractGridReq != null ? contractGridReq.getInstId() : null;
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "contract_grid", instId == null ? "" : instId, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C56214xyb c56214xyb, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        ContractGridReq contractGridReq = c56214xyb.AEQbTJ;
        java.lang.String instId = contractGridReq != null ? contractGridReq.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c55867xrz.OLrzqt((java.lang.String) null, "contract_grid", instId, th);
        return Unit.INSTANCE;
    }
}
