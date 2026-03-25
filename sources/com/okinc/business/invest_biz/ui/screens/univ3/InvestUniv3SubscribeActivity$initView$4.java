package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3PriceChart;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23732iHg;
import o.C25493ixk;
import o.C27492jwH;
import o.C27586jxw;
import o.C33069mpW;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeActivity$initView$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initView$4(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initView$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initView$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<BigDecimal> mutableStateFlowEjfBZ = this.this$0.isConnected().ejfBZ();
            final InvestUniv3SubscribeActivity investUniv3SubscribeActivity = this.this$0;
            FlowCollector<? super BigDecimal> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$initView$4.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                    String tokenSymbol;
                    String tokenSymbol2;
                    String tokenPrice;
                    if (C33129mqd.OLrzqt(bigDecimal, C56443yFo.AEQbTJ(0))) {
                        return Unit.INSTANCE;
                    }
                    C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
                    C23732iHg c23732iHg2 = null;
                    if (c23732iHg == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg = null;
                    }
                    InvestUniv3PriceChart investUniv3PriceChart = c23732iHg.QUSxYX;
                    Intrinsics.copydefault(bigDecimal);
                    investUniv3PriceChart.copydefault(bigDecimal, investUniv3SubscribeActivity.isConnected().fIwbmz());
                    C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg3 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg3 = null;
                    }
                    c23732iHg3.iwGUEr.KWHzl(bigDecimal, investUniv3SubscribeActivity.isConnected().fIwbmz());
                    InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = investUniv3SubscribeActivity.isConnected().gEmmrt();
                    List<InvestTokenWithAmount> investWithTokenList = investUniv3SubscribeInfoGEmmrt != null ? investUniv3SubscribeInfoGEmmrt.getInvestWithTokenList() : null;
                    InvestTokenWithAmount investTokenWithAmount = investWithTokenList != null ? (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investWithTokenList, 0) : null;
                    InvestTokenWithAmount investTokenWithAmount2 = investWithTokenList != null ? (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investWithTokenList, 1) : null;
                    InvestTokenWithAmount investTokenWithAmount3 = investUniv3SubscribeActivity.ejfBZ() ? investTokenWithAmount2 : investTokenWithAmount;
                    if (!investUniv3SubscribeActivity.ejfBZ()) {
                        investTokenWithAmount = investTokenWithAmount2;
                    }
                    if (investTokenWithAmount3 == null || (tokenSymbol = investTokenWithAmount3.getTokenSymbol()) == null) {
                        tokenSymbol = "";
                    }
                    if (investTokenWithAmount == null || (tokenSymbol2 = investTokenWithAmount.getTokenSymbol()) == null) {
                        tokenSymbol2 = "";
                    }
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    boolean zCopydefault = c27492jwH.copydefault(investTokenWithAmount3, investTokenWithAmount);
                    C27586jxw c27586jxw = C27586jxw.OLrzqt;
                    if (investTokenWithAmount == null || (tokenPrice = investTokenWithAmount.getTokenPrice()) == null) {
                        tokenPrice = "";
                    }
                    String strLocalizeCryptoPrice$default = C27586jxw.localizeCryptoPrice$default(c27586jxw, C33129mqd.EZpvd(tokenPrice), false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, 4, null);
                    String strKWHzl = c27492jwH.KWHzl(C33129mqd.gEmmrt(bigDecimal), c27492jwH.AEQbTJ(bigDecimal));
                    C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg4 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg4 = null;
                    }
                    c23732iHg4.getNewProxyInstance.setText(C33069mpW.KWHzl(investUniv3SubscribeActivity, zCopydefault ? C25493ixk.FragmentManager.hUfVAv : C25493ixk.FragmentManager.iZzfmt, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strKWHzl), C56390yDp.OLrzqt("token", tokenSymbol), C56390yDp.OLrzqt("token1", tokenSymbol2), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strLocalizeCryptoPrice$default))));
                    C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg5 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg5 = null;
                    }
                    c23732iHg5.QVAiDq.setMaxDecimal(c27492jwH.AEQbTJ(bigDecimal));
                    C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c23732iHg2 = c23732iHg6;
                    }
                    c23732iHg2.RJOkX.setMaxDecimal(c27492jwH.AEQbTJ(bigDecimal));
                    investUniv3SubscribeActivity.zsXlph();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableStateFlowEjfBZ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
