package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56223xyk extends xKE<java.util.List<? extends StrategyResponse>> {
    public GridReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56223xyk copydefault(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.AEQbTJ = gridReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        GridReq gridReq = this.AEQbTJ;
        GridReq gridReqCopy = null;
        java.lang.String voucherId = gridReq != null ? gridReq.getVoucherId() : null;
        if (voucherId == null || voucherId.length() == 0) {
            GridReq gridReq2 = this.AEQbTJ;
            if (gridReq2 != null) {
                gridReqCopy = gridReq2.copy(((-1) & 1) != 0 ? gridReq2.maxPx : null, ((-1) & 2) != 0 ? gridReq2.minPx : null, ((-1) & 4) != 0 ? gridReq2.gridNum : null, ((-1) & 8) != 0 ? gridReq2.runType : null, ((-1) & 16) != 0 ? gridReq2.quoteSz : null, ((-1) & 32) != 0 ? gridReq2.baseSz : null, ((-1) & 64) != 0 ? gridReq2.investType : null, ((-1) & 128) != 0 ? gridReq2.tpTriggerPx : null, ((-1) & 256) != 0 ? gridReq2.slTriggerPx : null, ((-1) & 512) != 0 ? gridReq2.tpslTriggerParamReq : null, ((-1) & 1024) != 0 ? gridReq2.tpOrdPx : null, ((-1) & 2048) != 0 ? gridReq2.slOrdPx : null, ((-1) & 4096) != 0 ? gridReq2.duration : null, ((-1) & 8192) != 0 ? gridReq2.signParams : null, ((-1) & 16384) != 0 ? gridReq2.reserveFunds : null, ((-1) & 32768) != 0 ? gridReq2.trailingUpConfig : null, ((-1) & 65536) != 0 ? gridReq2.trailingDownConfig : null, ((-1) & 131072) != 0 ? gridReq2.perGridProfitRatio : null, ((-1) & 262144) != 0 ? gridReq2.pxLimit : null, ((-1) & 524288) != 0 ? gridReq2.profitSharingRatio : null, ((-1) & 1048576) != 0 ? gridReq2.instId : null, ((-1) & 2097152) != 0 ? gridReq2.instType : null, ((-1) & 4194304) != 0 ? gridReq2.ordType : null, ((-1) & 8388608) != 0 ? gridReq2.annualizedRate : null, ((-1) & 16777216) != 0 ? gridReq2.sourceCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? gridReq2.sourceCcySz : null, ((-1) & 67108864) != 0 ? gridReq2.investSymbol : null, ((-1) & 134217728) != 0 ? gridReq2.autoTransfer : null, ((-1) & 268435456) != 0 ? gridReq2.marketPx : null, ((-1) & 536870912) != 0 ? gridReq2.systemSource : null, ((-1) & 1073741824) != 0 ? gridReq2.nmpUnderlyingId : null, ((-1) & Integer.MIN_VALUE) != 0 ? gridReq2.earnParam : null, (12 & 1) != 0 ? gridReq2.batchNo : null, (12 & 2) != 0 ? gridReq2.voucherId : null, (12 & 4) != 0 ? gridReq2.tradeQuoteCcy : null, (12 & 8) != 0 ? gridReq2.profitAutoReinvestParam : null);
            }
        } else {
            gridReqCopy = this.AEQbTJ;
        }
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        if (gridReqCopy == null) {
            gridReqCopy = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXSpotGridPlaceOrder = bizApiService.spotGridPlaceOrder(gridReqCopy);
        final Function1 function1 = new Function1() { // from class: o.xyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56223xyk.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXSpotGridPlaceOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56223xyk.EZpvd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56223xyk.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56223xyk.OLrzqt(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C56223xyk c56223xyk, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        java.lang.String constant = TacticsType.TACTICS_GRDE.getConstant();
        GridReq gridReq = c56223xyk.AEQbTJ;
        java.lang.String instId = gridReq != null ? gridReq.getInstId() : null;
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, constant, instId == null ? "" : instId, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C56223xyk c56223xyk, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String constant = TacticsType.TACTICS_GRDE.getConstant();
        GridReq gridReq = c56223xyk.AEQbTJ;
        java.lang.String instId = gridReq != null ? gridReq.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c55867xrz.OLrzqt((java.lang.String) null, constant, instId, th);
        return Unit.INSTANCE;
    }
}
