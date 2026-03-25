package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29299kqy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel$onChainSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TrendingConfigData $config;
    final /* synthetic */ boolean $wasInitialized;
    int label;
    final /* synthetic */ SurgeTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabViewModel$onChainSelected$1(SurgeTabViewModel surgeTabViewModel, String str, TrendingConfigData trendingConfigData, boolean z, Continuation<? super SurgeTabViewModel$onChainSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = surgeTabViewModel;
        this.$chainId = str;
        this.$config = trendingConfigData;
        this.$wasInitialized = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurgeTabViewModel$onChainSelected$1(this.this$0, this.$chainId, this.$config, this.$wasInitialized, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabViewModel$onChainSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29299kqy c29299kqy = this.this$0.fetchVPNInfo;
            String str = this.$chainId;
            this.label = 1;
            objOLrzqt = c29299kqy.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        this.this$0.KWHzl(this.$config, this.$chainId, (SurgeTrendingChainFilterData) objOLrzqt);
        this.this$0.djBIcL = this.$wasInitialized;
        SurgeTabViewModel.fetchTrendingTokens$default(this.this$0, false, 1, null);
        return Unit.INSTANCE;
    }
}
