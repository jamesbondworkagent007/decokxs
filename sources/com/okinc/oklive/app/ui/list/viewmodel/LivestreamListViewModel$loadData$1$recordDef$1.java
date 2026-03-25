package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44557sUi;
import o.C56391yDq;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$loadData$1$recordDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends RecordedStreamsResponse>>, Object> {
    final /* synthetic */ long $uidLong;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$loadData$1$recordDef$1(sUN sun, long j, Continuation<? super LivestreamListViewModel$loadData$1$recordDef$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$uidLong = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$loadData$1$recordDef$1(this.this$0, this.$uidLong, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends RecordedStreamsResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<RecordedStreamsResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<RecordedStreamsResponse>> continuation) {
        return ((LivestreamListViewModel$loadData$1$recordDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8709executeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44557sUi c44557sUi = this.this$0.fIwbmz;
            long j = this.$uidLong;
            this.label = 1;
            objM8709executeBWLJW6A$default = C44557sUi.m8709executeBWLJW6A$default(c44557sUi, j, 0, 0, this, 4, null);
            if (objM8709executeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8709executeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objM8709executeBWLJW6A$default);
    }
}
