package com.okinc.business.invest_biz.ui.screens.univ3;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23962iPu;
import o.C25480ixX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InvestUniv3SubscribeReceiveInfo>, Object> {
    final /* synthetic */ String $inputAmount;
    final /* synthetic */ boolean $showAprLoading;
    final /* synthetic */ InvestUniv3SubscribeActivity.AmountInputIndex $tokenIndex;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2(String str, InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, boolean z, Continuation<? super InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2> continuation) {
        super(2, continuation);
        this.$inputAmount = str;
        this.this$0 = investUniv3SubscribeViewModel;
        this.$tokenIndex = amountInputIndex;
        this.$showAprLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2(this.$inputAmount, this.this$0, this.$tokenIndex, this.$showAprLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestUniv3SubscribeReceiveInfo> continuation) {
        return ((InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String coinAmount;
        InvestTokenWithAmount investTokenWithAmountRcXXUw;
        String coinAmount2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C33129mqd.OLrzqt(this.$inputAmount, C56443yFo.AEQbTJ(0))) {
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.this$0;
                investUniv3SubscribeViewModel.OLrzqt(investUniv3SubscribeViewModel.gasjUx());
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
                investUniv3SubscribeViewModel2.KWHzl(investUniv3SubscribeViewModel2.flVtFt());
                InvestTokenWithAmount fieldNames = this.this$0.getFieldNames();
                if (fieldNames != null) {
                    InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel3 = this.this$0;
                    MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB = investUniv3SubscribeViewModel3.AwvSrB();
                    String tokenSymbol = fieldNames.getTokenSymbol();
                    String tokenLogo = fieldNames.getTokenLogo();
                    InvestTokenWithAmount investTokenWithAmountGasjUx = investUniv3SubscribeViewModel3.gasjUx();
                    C25480ixX c25480ixX = new C25480ixX("0", tokenSymbol, tokenLogo, "0", false, investUniv3SubscribeViewModel3.KWHzl(fieldNames.isBaseToken(), fieldNames.getCoinAmount()), false, false, false, null, C33129mqd.AhwBna(fieldNames.getTokenPrecision()), (investTokenWithAmountGasjUx == null || (coinAmount = investTokenWithAmountGasjUx.getCoinAmount()) == null) ? "0" : coinAmount, false, 5072, null);
                    this.label = 1;
                    if (mutableStateFlowAwvSrB.emit(c25480ixX, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                investTokenWithAmountRcXXUw = this.this$0.RcXXUw();
                if (investTokenWithAmountRcXXUw != null) {
                }
            } else {
                InvestTokenWithAmount fieldNames2 = this.$tokenIndex == InvestUniv3SubscribeActivity.AmountInputIndex.First ? this.this$0.getFieldNames() : this.this$0.RcXXUw();
                if (fieldNames2 == null) {
                    return null;
                }
                int iKWHzl = (this.this$0.getPostValueLengthLimit() ? this.this$0.AxsJAY() : this.this$0.AxsJAYaxsJAY()).KWHzl();
                int iKWHzl2 = (this.this$0.getPostValueLengthLimit() ? this.this$0.AxsJAYaxsJAY() : this.this$0.AxsJAY()).KWHzl();
                if (this.$showAprLoading) {
                    this.this$0.aKErDB().setValue(C56443yFo.KWHzl(true));
                }
                Ref.IntRef intRef = new Ref.IntRef();
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel4 = this.this$0;
                String str = this.$inputAmount;
                this.L$0 = fieldNames2;
                this.L$1 = intRef;
                this.L$2 = investUniv3SubscribeViewModel4;
                this.L$3 = str;
                this.I$0 = iKWHzl;
                this.I$1 = iKWHzl2;
                this.label = 3;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                investUniv3SubscribeViewModel4.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel4.accept(), investUniv3SubscribeViewModel4.hBpjJd, fieldNames2, str, investUniv3SubscribeViewModel4.gHZMYf, investUniv3SubscribeViewModel4.DTwDnp, iKWHzl, iKWHzl2, investUniv3SubscribeViewModel4.zuWLRA, new StateListAnimator(investUniv3SubscribeViewModel4), new TaskDescription(intRef, investUniv3SubscribeViewModel4, cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (result == objCopydefault) {
                    return objCopydefault;
                }
                return this.this$0.isConnected();
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            investTokenWithAmountRcXXUw = this.this$0.RcXXUw();
            if (investTokenWithAmountRcXXUw != null) {
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel5 = this.this$0;
                MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE = investUniv3SubscribeViewModel5.zuBGHE();
                String tokenSymbol2 = investTokenWithAmountRcXXUw.getTokenSymbol();
                String tokenLogo2 = investTokenWithAmountRcXXUw.getTokenLogo();
                InvestTokenWithAmount investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel5.flVtFt();
                C25480ixX c25480ixX2 = new C25480ixX("0", tokenSymbol2, tokenLogo2, "0", false, investUniv3SubscribeViewModel5.KWHzl(investTokenWithAmountRcXXUw.isBaseToken(), investTokenWithAmountRcXXUw.getCoinAmount()), false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountRcXXUw.getTokenPrecision()), (investTokenWithAmountFlVtFt == null || (coinAmount2 = investTokenWithAmountFlVtFt.getCoinAmount()) == null) ? "0" : coinAmount2, false, 5072, null);
                this.label = 2;
                if (mutableStateFlowZuBGHE.emit(c25480ixX2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return this.this$0.isConnected();
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.iZzfmt().setValue(new C23962iPu(false, null, 2, null));
        InvestSubscriptionNewViewModel.StateListAnimator stateListAnimator = this.this$0.hUfVAv;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(true, null);
        }
        return null;
    }

    public static final class TaskDescription implements Function2<ResponseState, Pair<? extends InvestGasPriceConfig, ? extends InvestUniv3SubscribeReceiveInfo>, Unit> {
        public final /* synthetic */ InvestUniv3SubscribeViewModel EZpvd;
        public final /* synthetic */ CancellableContinuation<Unit> KWHzl;
        public final /* synthetic */ Ref.IntRef OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Ref.IntRef intRef, InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.OLrzqt = intRef;
            this.EZpvd = investUniv3SubscribeViewModel;
            this.KWHzl = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(ResponseState responseState, Pair<? extends InvestGasPriceConfig, ? extends InvestUniv3SubscribeReceiveInfo> pair) {
            OLrzqt(responseState, pair);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(ResponseState responseState, Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pair) {
            InvestUniv3SubscribeReceiveInfo second;
            Object next;
            Object next2;
            Intrinsics.checkNotNullParameter(responseState, "");
            if (pair != null && (second = pair.getSecond()) != null) {
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel = this.EZpvd;
                investUniv3SubscribeViewModel.OLrzqt(second);
                Iterator<T> it = second.getInvestWithTokenList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String tokenAddress = ((InvestTokenWithAmount) next).getTokenAddress();
                    InvestTokenWithAmount fieldNames = investUniv3SubscribeViewModel.getFieldNames();
                    if (Intrinsics.EZpvd((Object) tokenAddress, (Object) (fieldNames != null ? fieldNames.getTokenAddress() : null))) {
                        break;
                    }
                }
                investUniv3SubscribeViewModel.OLrzqt((InvestTokenWithAmount) next);
                Iterator<T> it2 = second.getInvestWithTokenList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    String tokenAddress2 = ((InvestTokenWithAmount) next2).getTokenAddress();
                    InvestTokenWithAmount investTokenWithAmountRcXXUw = investUniv3SubscribeViewModel.RcXXUw();
                    if (Intrinsics.EZpvd((Object) tokenAddress2, (Object) (investTokenWithAmountRcXXUw != null ? investTokenWithAmountRcXXUw.getTokenAddress() : null))) {
                        break;
                    }
                }
                investUniv3SubscribeViewModel.KWHzl((InvestTokenWithAmount) next2);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(investUniv3SubscribeViewModel), null, null, new InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2$3$2$1$3(investUniv3SubscribeViewModel, null), 3, null);
            }
            this.OLrzqt.element = this.EZpvd.OLrzqt(responseState, (Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) pair, (Continuation<? super Unit>) this.KWHzl);
        }
    }

    public static final class StateListAnimator implements Function1<InvestGasPriceConfig, String> {
        public final /* synthetic */ InvestUniv3SubscribeViewModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel) {
            this.copydefault = investUniv3SubscribeViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final String invoke(InvestGasPriceConfig investGasPriceConfig) {
            Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
            return (String) this.copydefault.OLrzqt(investGasPriceConfig).getFirst();
        }
    }
}
