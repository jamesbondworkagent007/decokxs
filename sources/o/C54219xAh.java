package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54219xAh extends xKE<java.util.List<? extends StrategyResponse>> {
    public static final int AEQbTJ = 8;
    public final StrategyReq KWHzl = new StrategyReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) (0 == true ? 1 : 0), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.Float) null, (PlaceOrderCondition) null, (ProfitAutoReinvestParam) null, (java.lang.String) null, -1, -1, 1048575, (DefaultConstructorMarker) null);

    public final C54219xAh EZpvd(@NotNull StrategyBaseReq strategyBaseReq) {
        Intrinsics.checkNotNullParameter(strategyBaseReq, "");
        this.KWHzl.initBaseReq(strategyBaseReq);
        return this;
    }

    public final C54219xAh EZpvd(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        this.KWHzl.initSmartIceBergReq(iceBergReq);
        return this;
    }

    public final C54219xAh copydefault(@NotNull TwapReq twapReq) {
        Intrinsics.checkNotNullParameter(twapReq, "");
        this.KWHzl.initTwapReq(twapReq);
        return this;
    }

    public final C54219xAh copydefault(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.KWHzl.initGridReq(gridReq);
        return this;
    }

    public final C54219xAh OLrzqt(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.KWHzl.initContractGridReq(contractGridReq);
        return this;
    }

    public final C54219xAh EZpvd(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.KWHzl.initSignalBotReq(signalBotReq);
        return this;
    }

    public final C54219xAh EZpvd(@NotNull SmartArbitrageReq smartArbitrageReq) {
        Intrinsics.checkNotNullParameter(smartArbitrageReq, "");
        this.KWHzl.initSmartArbitrageReq(smartArbitrageReq);
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXMakeAllStrategyOrder = ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).makeAllStrategyOrder(this.KWHzl);
        final Function1 function1 = new Function1() { // from class: o.xAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54219xAh.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXMakeAllStrategyOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54219xAh.KWHzl(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54219xAh.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54219xAh.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C54219xAh c54219xAh, ResponseData responseData) {
        java.lang.String str;
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        java.lang.String ordType = c54219xAh.KWHzl.getOrdType();
        java.lang.String instId = c54219xAh.KWHzl.getInstId();
        if (instId.length() == 0) {
            java.lang.String instFamily = c54219xAh.KWHzl.getInstFamily();
            if (instFamily == null) {
                instFamily = "";
            }
            str = instFamily;
        } else {
            str = instId;
        }
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, ordType, str, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C54219xAh c54219xAh, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String ordType = c54219xAh.KWHzl.getOrdType();
        java.lang.String instId = c54219xAh.KWHzl.getInstId();
        if (instId.length() == 0) {
            java.lang.String instFamily = c54219xAh.KWHzl.getInstFamily();
            if (instFamily == null) {
                instFamily = "";
            }
            instId = instFamily;
        }
        c55867xrz.OLrzqt((java.lang.String) null, ordType, instId, th);
        return Unit.INSTANCE;
    }
}
