package com.okinc.dexkline.market.features.data.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.mXJ;
import o.mXK;
import o.mXR;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinDetailDataViewModel$getLiquidityData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ boolean $isReload;
    int label;
    final /* synthetic */ CoinDetailDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailDataViewModel$getLiquidityData$1(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, Continuation<? super CoinDetailDataViewModel$getLiquidityData$1> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailDataViewModel;
        this.$isRefresh = z;
        this.$isReload = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailDataViewModel$getLiquidityData$1(this.this$0, this.$isRefresh, this.$isReload, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailDataViewModel$getLiquidityData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            boolean z = this.$isRefresh;
            mutableStateFlow.setValue(new mXJ(new mXK((z || this.$isReload) ? false : true, this.$isReload, z), false, null, 6, null));
            mXR mxr = this.this$0.values;
            String chainId = this.this$0.copydefault().getChainId();
            String tokenContractAddress = this.this$0.copydefault().getTokenContractAddress();
            this.label = 1;
            objCopydefault = mxr.copydefault(chainId, tokenContractAddress, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        CoinDetailDataViewModel coinDetailDataViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            coinDetailDataViewModel.copydefault.setValue(new mXJ(null, false, (List) objCopydefault, 3, null));
        }
        CoinDetailDataViewModel coinDetailDataViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            coinDetailDataViewModel2.copydefault.setValue(new mXJ(null, true, null, 5, null));
        }
        return Unit.INSTANCE;
    }
}
