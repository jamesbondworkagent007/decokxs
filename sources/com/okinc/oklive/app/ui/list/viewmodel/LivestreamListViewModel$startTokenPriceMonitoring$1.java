package com.okinc.oklive.app.ui.list.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44571sUw;
import o.C56391yDq;
import o.C56442yFn;
import o.sTG;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$startTokenPriceMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    final /* synthetic */ C44571sUw $tokenTag;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$startTokenPriceMonitoring$1(sUN sun, C44571sUw c44571sUw, String str, Continuation<? super LivestreamListViewModel$startTokenPriceMonitoring$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$tokenTag = c44571sUw;
        this.$instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$startTokenPriceMonitoring$1(this.this$0, this.$tokenTag, this.$instId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$startTokenPriceMonitoring$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fIwbmz();
            this.this$0.djBIcL = this.$tokenTag;
            sTG stg = this.this$0.zLjUOn;
            String str = this.$instId;
            this.label = 1;
            if (stg.KWHzl(str, "SPOT", this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sUN sun = this.this$0;
        sun.wlaJM = sun.valueOf();
        return Unit.INSTANCE;
    }
}
