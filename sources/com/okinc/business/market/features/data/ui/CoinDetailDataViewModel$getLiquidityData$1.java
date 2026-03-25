package com.okinc.business.market.features.data.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.jQC;
import o.jQE;
import o.jQG;
import o.jQN;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinDetailDataViewModel$getLiquidityData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ boolean $isReload;
    final /* synthetic */ String $periodType;
    int label;
    final /* synthetic */ CoinDetailDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailDataViewModel$getLiquidityData$1(String str, CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, Continuation<? super CoinDetailDataViewModel$getLiquidityData$1> continuation) {
        super(2, continuation);
        this.$periodType = str;
        this.this$0 = coinDetailDataViewModel;
        this.$isRefresh = z;
        this.$isReload = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailDataViewModel$getLiquidityData$1(this.$periodType, this.this$0, this.$isRefresh, this.$isReload, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailDataViewModel$getLiquidityData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$periodType == null) {
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                boolean z = this.$isRefresh;
                mutableStateFlow.setValue(new jQG(new jQE((z || this.$isReload) ? false : true, this.$isReload, z), false, null, 6, null));
            }
            jQN jqn = this.this$0.AkhnZx;
            String chainId = this.this$0.valueOf().getChainId();
            String tokenContractAddress = this.this$0.valueOf().getTokenContractAddress();
            String str = this.$periodType;
            this.label = 1;
            objAEQbTJ = jqn.AEQbTJ(chainId, tokenContractAddress, str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        CoinDetailDataViewModel coinDetailDataViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            coinDetailDataViewModel.EZpvd.setValue(new jQG(null, false, (jQC) objAEQbTJ, 3, null));
        }
        CoinDetailDataViewModel coinDetailDataViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            coinDetailDataViewModel2.EZpvd.setValue(new jQG(null, true, null, 5, null));
        }
        return Unit.INSTANCE;
    }
}
