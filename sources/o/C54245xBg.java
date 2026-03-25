package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54245xBg extends xKE<java.util.List<? extends StrategyResponse>> {
    public SmartPortfolioReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SmartPortfolioReq smartPortfolioReq) {
        Intrinsics.checkNotNullParameter(smartPortfolioReq, "");
        this.OLrzqt = smartPortfolioReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        SmartPortfolioReq smartPortfolioReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SmartPortfolioReq smartPortfolioReq2 = this.OLrzqt;
        if (smartPortfolioReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            smartPortfolioReq = smartPortfolioReq2;
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXSmartPortfolioOrder = bizApiService.smartPortfolioOrder(smartPortfolioReq);
        final Function1 function1 = new Function1() { // from class: o.xBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54245xBg.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXSmartPortfolioOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54245xBg.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54245xBg.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54245xBg.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C54245xBg c54245xBg, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        SmartPortfolioReq smartPortfolioReq = null;
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        SmartPortfolioReq smartPortfolioReq2 = c54245xBg.OLrzqt;
        if (smartPortfolioReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            smartPortfolioReq = smartPortfolioReq2;
        }
        java.util.List<CoinAssetParam> capitalList = smartPortfolioReq.getCapitalList();
        if (capitalList == null) {
            capitalList = yDY.AhwBna();
        }
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "smart_portfolio", CollectionsKt___CollectionsKt.joinToString$default(capitalList, ",", null, null, 0, null, new Function1() { // from class: o.xBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54245xBg.copydefault((CoinAssetParam) obj);
            }
        }, 30, null), null, 8, null);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence copydefault(CoinAssetParam coinAssetParam) {
        Intrinsics.checkNotNullParameter(coinAssetParam, "");
        return coinAssetParam.getCcy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C54245xBg c54245xBg, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        SmartPortfolioReq smartPortfolioReq = c54245xBg.OLrzqt;
        if (smartPortfolioReq == null) {
            Intrinsics.gEmmrt("");
            smartPortfolioReq = null;
        }
        java.util.List<CoinAssetParam> capitalList = smartPortfolioReq.getCapitalList();
        if (capitalList == null) {
            capitalList = yDY.AhwBna();
        }
        c55867xrz.OLrzqt((java.lang.String) null, "smart_portfolio", CollectionsKt___CollectionsKt.joinToString$default(capitalList, ",", null, null, 0, null, new Function1() { // from class: o.xBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54245xBg.EZpvd((CoinAssetParam) obj);
            }
        }, 30, null), th);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence EZpvd(CoinAssetParam coinAssetParam) {
        Intrinsics.checkNotNullParameter(coinAssetParam, "");
        return coinAssetParam.getCcy();
    }
}
