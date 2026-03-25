package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30503lcQ;
import o.C28160kRc;
import o.C28222kTk;
import o.C28227kTp;
import o.C30457lbX;
import o.C30516lcd;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$observeQuoteAndTPSL$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateFlow<String> $balanceInfo;
    final /* synthetic */ StateFlow<C28222kTk> $baseMarketInfo;
    final /* synthetic */ StateFlow<DexMultiTokenInfoBean> $fromToken;
    final /* synthetic */ Function1<C30808liD, String> $getCheckLimitSlippage;
    final /* synthetic */ Function0<String> $getLimitInput;
    final /* synthetic */ StateFlow<Boolean> $isAutoSellVisible;
    final /* synthetic */ Function0<Boolean> $isLimitOrder;
    final /* synthetic */ Function0<Boolean> $isMCapSupportedForLimit;
    final /* synthetic */ StateFlow<AdvancedLimitBy> $limitOrderBy;
    final /* synthetic */ StateFlow<AdvancedQuoteUiData> $quoteUiData;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ StateFlow<C30808liD> $settingModel;
    final /* synthetic */ StateFlow<DexMultiTokenInfoBean> $toToken;
    final /* synthetic */ StateFlow<AdvancedTradeType> $tradeType;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function1<? super o.liD, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellDelegate$observeQuoteAndTPSL$1(StateFlow<AdvancedQuoteUiData> stateFlow, C28227kTp c28227kTp, StateFlow<C30808liD> stateFlow2, StateFlow<? extends AdvancedTradeType> stateFlow3, StateFlow<? extends AdvancedLimitBy> stateFlow4, Function0<String> function0, StateFlow<C28222kTk> stateFlow5, Function1<? super C30808liD, String> function1, Function0<Boolean> function02, StateFlow<DexMultiTokenInfoBean> stateFlow6, StateFlow<String> stateFlow7, StateFlow<Boolean> stateFlow8, CoroutineScope coroutineScope, StateFlow<DexMultiTokenInfoBean> stateFlow9, Function0<Boolean> function03, Continuation<? super AdvancedAutoSellDelegate$observeQuoteAndTPSL$1> continuation) {
        super(2, continuation);
        this.$quoteUiData = stateFlow;
        this.this$0 = c28227kTp;
        this.$settingModel = stateFlow2;
        this.$tradeType = stateFlow3;
        this.$limitOrderBy = stateFlow4;
        this.$getLimitInput = function0;
        this.$baseMarketInfo = stateFlow5;
        this.$getCheckLimitSlippage = function1;
        this.$isMCapSupportedForLimit = function02;
        this.$fromToken = stateFlow6;
        this.$balanceInfo = stateFlow7;
        this.$isAutoSellVisible = stateFlow8;
        this.$scope = coroutineScope;
        this.$toToken = stateFlow9;
        this.$isLimitOrder = function03;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$observeQuoteAndTPSL$1(this.$quoteUiData, this.this$0, this.$settingModel, this.$tradeType, this.$limitOrderBy, this.$getLimitInput, this.$baseMarketInfo, this.$getCheckLimitSlippage, this.$isMCapSupportedForLimit, this.$fromToken, this.$balanceInfo, this.$isAutoSellVisible, this.$scope, this.$toToken, this.$isLimitOrder, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$observeQuoteAndTPSL$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.$quoteUiData, this.this$0.EZpvd(), this.$settingModel, AnonymousClass3.INSTANCE);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$tradeType, this.$limitOrderBy, this.$getLimitInput, this.$baseMarketInfo, this.$getCheckLimitSlippage, this.$isMCapSupportedForLimit, this.$fromToken, this.$balanceInfo, this.$isAutoSellVisible, this.$scope, this.$toToken, this.$isLimitOrder, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$observeQuoteAndTPSL$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements yHT<AdvancedQuoteUiData, AbstractC30503lcQ, C30808liD, Continuation<? super Triple<? extends AdvancedQuoteUiData, ? extends AbstractC30503lcQ, ? extends C30808liD>>, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
            super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AdvancedQuoteUiData advancedQuoteUiData, AbstractC30503lcQ abstractC30503lcQ, C30808liD c30808liD, Continuation<? super Triple<AdvancedQuoteUiData, ? extends AbstractC30503lcQ, C30808liD>> continuation) {
            return AdvancedAutoSellDelegate$observeQuoteAndTPSL$1.invokeSuspend$lambda$0(advancedQuoteUiData, abstractC30503lcQ, c30808liD, continuation);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* bridge */ /* synthetic */ Object invoke(AdvancedQuoteUiData advancedQuoteUiData, AbstractC30503lcQ abstractC30503lcQ, C30808liD c30808liD, Continuation<? super Triple<? extends AdvancedQuoteUiData, ? extends AbstractC30503lcQ, ? extends C30808liD>> continuation) {
            return invoke2(advancedQuoteUiData, abstractC30503lcQ, c30808liD, (Continuation<? super Triple<AdvancedQuoteUiData, ? extends AbstractC30503lcQ, C30808liD>>) continuation);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$observeQuoteAndTPSL$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends AdvancedQuoteUiData, ? extends AbstractC30503lcQ, ? extends C30808liD>, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow<String> $balanceInfo;
        final /* synthetic */ StateFlow<C28222kTk> $baseMarketInfo;
        final /* synthetic */ StateFlow<DexMultiTokenInfoBean> $fromToken;
        final /* synthetic */ Function1<C30808liD, String> $getCheckLimitSlippage;
        final /* synthetic */ Function0<String> $getLimitInput;
        final /* synthetic */ StateFlow<Boolean> $isAutoSellVisible;
        final /* synthetic */ Function0<Boolean> $isLimitOrder;
        final /* synthetic */ Function0<Boolean> $isMCapSupportedForLimit;
        final /* synthetic */ StateFlow<AdvancedLimitBy> $limitOrderBy;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ StateFlow<DexMultiTokenInfoBean> $toToken;
        final /* synthetic */ StateFlow<AdvancedTradeType> $tradeType;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C28227kTp this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.liD, java.lang.String> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C28227kTp c28227kTp, StateFlow<? extends AdvancedTradeType> stateFlow, StateFlow<? extends AdvancedLimitBy> stateFlow2, Function0<String> function0, StateFlow<C28222kTk> stateFlow3, Function1<? super C30808liD, String> function1, Function0<Boolean> function02, StateFlow<DexMultiTokenInfoBean> stateFlow4, StateFlow<String> stateFlow5, StateFlow<Boolean> stateFlow6, CoroutineScope coroutineScope, StateFlow<DexMultiTokenInfoBean> stateFlow7, Function0<Boolean> function03, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = c28227kTp;
            this.$tradeType = stateFlow;
            this.$limitOrderBy = stateFlow2;
            this.$getLimitInput = function0;
            this.$baseMarketInfo = stateFlow3;
            this.$getCheckLimitSlippage = function1;
            this.$isMCapSupportedForLimit = function02;
            this.$fromToken = stateFlow4;
            this.$balanceInfo = stateFlow5;
            this.$isAutoSellVisible = stateFlow6;
            this.$scope = coroutineScope;
            this.$toToken = stateFlow7;
            this.$isLimitOrder = function03;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$tradeType, this.$limitOrderBy, this.$getLimitInput, this.$baseMarketInfo, this.$getCheckLimitSlippage, this.$isMCapSupportedForLimit, this.$fromToken, this.$balanceInfo, this.$isAutoSellVisible, this.$scope, this.$toToken, this.$isLimitOrder, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Triple<? extends AdvancedQuoteUiData, ? extends AbstractC30503lcQ, ? extends C30808liD> triple, Continuation<? super Unit> continuation) {
            return invoke2((Triple<AdvancedQuoteUiData, ? extends AbstractC30503lcQ, C30808liD>) triple, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Triple<AdvancedQuoteUiData, ? extends AbstractC30503lcQ, C30808liD> triple, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C30457lbX c30457lbX;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Triple triple = (Triple) this.L$0;
                AdvancedQuoteUiData advancedQuoteUiData = (AdvancedQuoteUiData) triple.component1();
                C30808liD c30808liD = (C30808liD) triple.component3();
                AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = advancedQuoteUiData != null ? advancedQuoteUiData.KWHzl() : null;
                if (advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.LegacyLimit) {
                    C28160kRc c28160kRc = this.this$0.fetchVPNInfo;
                    AdvancedQuoteResponse advancedQuoteResponseGHZMYf = ((AdvancedQuoteAndCallData.LegacyLimit) advancedQuoteAndCallDataKWHzl).gHZMYf();
                    AdvancedTradeType value = this.$tradeType.getValue();
                    String strInvoke = this.$limitOrderBy.getValue() == AdvancedLimitBy.Price ? this.$getLimitInput.invoke() : "";
                    String strInvoke2 = this.$limitOrderBy.getValue() == AdvancedLimitBy.MCap ? this.$getLimitInput.invoke() : "";
                    String strOLrzqt = this.$baseMarketInfo.getValue().OLrzqt();
                    String strCopydefault = this.$baseMarketInfo.getValue().copydefault();
                    String strInvoke3 = this.$getCheckLimitSlippage.invoke(c30808liD);
                    boolean zBooleanValue = this.$isMCapSupportedForLimit.invoke().booleanValue();
                    DexMultiTokenInfoBean value2 = this.$fromToken.getValue();
                    c30457lbX = c28160kRc.EZpvd(advancedQuoteResponseGHZMYf, value, strInvoke3, strInvoke, strInvoke2, strOLrzqt, strCopydefault, zBooleanValue, value2 == null ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : value2);
                } else if (advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.V6) {
                    C30457lbX c30457lbXKWHzl = this.this$0.AEQbTJ.KWHzl(((AdvancedQuoteAndCallData.V6) advancedQuoteAndCallDataKWHzl).sSMYrx(), c30808liD, this.$tradeType.getValue());
                    String value3 = this.$balanceInfo.getValue();
                    c30457lbX = c30457lbXKWHzl.copydefault((8159 & 1) != 0 ? c30457lbXKWHzl.EZpvd : null, (8159 & 2) != 0 ? c30457lbXKWHzl.OLrzqt : null, (8159 & 4) != 0 ? c30457lbXKWHzl.AYXKKw : null, (8159 & 8) != 0 ? c30457lbXKWHzl.DbNXlk : null, (8159 & 16) != 0 ? c30457lbXKWHzl.djBIcL : null, (8159 & 32) != 0 ? c30457lbXKWHzl.AEQbTJ : null, (8159 & 64) != 0 ? c30457lbXKWHzl.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbXKWHzl.KWHzl : null, (8159 & 256) != 0 ? c30457lbXKWHzl.gEmmrt : null, (8159 & 512) != 0 ? c30457lbXKWHzl.AhwBna : null, (8159 & 1024) != 0 ? c30457lbXKWHzl.copydefault : null, (8159 & 2048) != 0 ? c30457lbXKWHzl.values : value3 == null ? "" : value3, (8159 & 4096) != 0 ? c30457lbXKWHzl.valueOf : null);
                } else {
                    if (advancedQuoteAndCallDataKWHzl != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c30457lbX = new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
                C30457lbX c30457lbX2 = c30457lbX;
                List<C30516lcd> listEZpvd = ((C30457lbX) this.this$0.KWHzl.getValue()).EZpvd();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listEZpvd) {
                    if (((C30516lcd) obj2).OLrzqt() == ConfirmOrderTag.BOOST) {
                        arrayList.add(obj2);
                    }
                }
                MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                C30457lbX c30457lbXCopydefault = c30457lbX2.copydefault((8159 & 1) != 0 ? c30457lbX2.EZpvd : null, (8159 & 2) != 0 ? c30457lbX2.OLrzqt : null, (8159 & 4) != 0 ? c30457lbX2.AYXKKw : null, (8159 & 8) != 0 ? c30457lbX2.DbNXlk : null, (8159 & 16) != 0 ? c30457lbX2.djBIcL : null, (8159 & 32) != 0 ? c30457lbX2.AEQbTJ : CollectionsKt___CollectionsKt.djBIcL((Collection) c30457lbX2.EZpvd(), (Iterable) arrayList), (8159 & 64) != 0 ? c30457lbX2.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbX2.KWHzl : this.this$0.KWHzl(this.$isAutoSellVisible.getValue().booleanValue()), (8159 & 256) != 0 ? c30457lbX2.gEmmrt : null, (8159 & 512) != 0 ? c30457lbX2.AhwBna : null, (8159 & 1024) != 0 ? c30457lbX2.copydefault : null, (8159 & 2048) != 0 ? c30457lbX2.values : null, (8159 & 4096) != 0 ? c30457lbX2.valueOf : null);
                this.this$0.KWHzl(c30457lbXCopydefault);
                mutableStateFlow.setValue(c30457lbXCopydefault);
                this.this$0.AEQbTJ(this.$scope, advancedQuoteUiData != null ? advancedQuoteUiData.KWHzl() : null, this.$fromToken.getValue(), this.$toToken.getValue(), this.$isLimitOrder.invoke().booleanValue());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(AdvancedQuoteUiData advancedQuoteUiData, AbstractC30503lcQ abstractC30503lcQ, C30808liD c30808liD, Continuation continuation) {
        return new Triple(advancedQuoteUiData, abstractC30503lcQ, c30808liD);
    }
}
