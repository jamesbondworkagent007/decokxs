package com.okinc.buysell.ui.result;

import com.okinc.buysell.ui.result.view.AssetMaxApyEarnInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.lSS;
import o.mHA;

/* JADX INFO: loaded from: classes23.dex */
public final class ConvertResultViewModel$loadRecommendData$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromCurrency;
    final /* synthetic */ List<AssetMaxApyEarnInfo> $recommendData;
    final /* synthetic */ String $toCurrency;
    int label;
    final /* synthetic */ ConvertResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertResultViewModel$loadRecommendData$1$1$1(ConvertResultViewModel convertResultViewModel, List<AssetMaxApyEarnInfo> list, String str, String str2, Continuation<? super ConvertResultViewModel$loadRecommendData$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = convertResultViewModel;
        this.$recommendData = list;
        this.$fromCurrency = str;
        this.$toCurrency = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertResultViewModel$loadRecommendData$1$1$1(this.this$0, this.$recommendData, this.$fromCurrency, this.$toCurrency, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertResultViewModel$loadRecommendData$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            mHA.OLrzqt.OLrzqt(this.this$0.AEQbTJ, new lSS(this.$recommendData, this.$fromCurrency, this.$toCurrency));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
