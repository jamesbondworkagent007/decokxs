package com.okinc.kline.ui.mvp;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39562pug;
import o.C56391yDq;
import o.C56442yFn;
import o.oLY;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends oLY>>, Object> {
    final /* synthetic */ List<oLY> $data;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oLY> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1(C39562pug c39562pug, List<? extends oLY> list, Continuation<? super MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1> continuation) {
        super(2, continuation);
        this.this$0 = c39562pug;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends oLY>> continuation) {
        return ((MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C39562pug.convertData$default(this.this$0, "SPOT", this.$data, null, 4, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
