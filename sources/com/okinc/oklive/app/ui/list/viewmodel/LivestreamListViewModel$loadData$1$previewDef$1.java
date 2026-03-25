package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44554sUf;
import o.C56391yDq;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$loadData$1$previewDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LivestreamInfoResponse>, Object> {
    final /* synthetic */ long $uidLong;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$loadData$1$previewDef$1(sUN sun, long j, Continuation<? super LivestreamListViewModel$loadData$1$previewDef$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$uidLong = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$loadData$1$previewDef$1(this.this$0, this.$uidLong, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LivestreamInfoResponse> continuation) {
        return ((LivestreamListViewModel$loadData$1$previewDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44554sUf c44554sUf = this.this$0.fJNWhG;
            long j = this.$uidLong;
            this.label = 1;
            obj = c44554sUf.KWHzl(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
