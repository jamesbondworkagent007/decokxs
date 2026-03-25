package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29359ksE;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel$fetchTrendingTokens$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $isShowLoading;
    final /* synthetic */ String $rankType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SurgeTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabViewModel$fetchTrendingTokens$1(boolean z, SurgeTabViewModel surgeTabViewModel, String str, String str2, Continuation<? super SurgeTabViewModel$fetchTrendingTokens$1> continuation) {
        super(2, continuation);
        this.$isShowLoading = z;
        this.this$0 = surgeTabViewModel;
        this.$rankType = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SurgeTabViewModel$fetchTrendingTokens$1 surgeTabViewModel$fetchTrendingTokens$1 = new SurgeTabViewModel$fetchTrendingTokens$1(this.$isShowLoading, this.this$0, this.$rankType, this.$chainId, continuation);
        surgeTabViewModel$fetchTrendingTokens$1.L$0 = obj;
        return surgeTabViewModel$fetchTrendingTokens$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabViewModel$fetchTrendingTokens$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isShowLoading) {
                MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, InterfaceC29359ksE.StateListAnimator.copydefault));
            }
            TrendingConfigData trendingConfigDataAhwBna = this.this$0.AhwBna();
            if (trendingConfigDataAhwBna == null) {
                MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, InterfaceC29359ksE.Activity.OLrzqt));
                return Unit.INSTANCE;
            }
            C29300kqz c29300kqz = this.this$0.valueOf;
            String str = this.$rankType;
            String str2 = this.$chainId;
            this.label = 1;
            objCopydefault = c29300kqz.copydefault(str, str2, trendingConfigDataAhwBna, this);
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
        SurgeTabViewModel surgeTabViewModel = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            MutableStateFlow mutableStateFlow3 = surgeTabViewModel.AEQbTJ;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, InterfaceC29359ksE.Activity.OLrzqt));
        }
        return Unit.INSTANCE;
    }
}
