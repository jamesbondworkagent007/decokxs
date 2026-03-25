package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44557sUi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sUN;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$loadMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $nextPage;
    final /* synthetic */ long $uid;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$loadMore$1(sUN sun, long j, int i, Continuation<? super LivestreamListViewModel$loadMore$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$uid = j;
        this.$nextPage = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$loadMore$1(this.this$0, this.$uid, this.$nextPage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$loadMore$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8709executeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(C56443yFo.KWHzl(true));
            C44557sUi c44557sUi = this.this$0.fIwbmz;
            long j = this.$uid;
            int i2 = this.$nextPage;
            this.label = 1;
            objM8709executeBWLJW6A$default = C44557sUi.m8709executeBWLJW6A$default(c44557sUi, j, i2, 0, this, 4, null);
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
        sUN sun = this.this$0;
        int i3 = this.$nextPage;
        if (Result.m7384isSuccessimpl(objM8709executeBWLJW6A$default)) {
            RecordedStreamsResponse recordedStreamsResponse = (RecordedStreamsResponse) objM8709executeBWLJW6A$default;
            List<RecordingInfoResponse> items = recordedStreamsResponse.getItems();
            if (items == null) {
                items = yDY.AhwBna();
            }
            List listBuildProfileItems$default = sUN.buildProfileItems$default(sun, items, false, false, 4, null);
            if (true ^ listBuildProfileItems$default.isEmpty()) {
                sun.fARcdN = recordedStreamsResponse.hasMorePages();
                sun.AYXKKw = i3;
                sun.OLrzqt.setValue(CollectionsKt___CollectionsKt.djBIcL((Collection) sun.OLrzqt.getValue(), (Iterable) listBuildProfileItems$default));
            } else {
                sun.fARcdN = false;
            }
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8709executeBWLJW6A$default);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("LivestreamListViewModel", "Failed to load more recordings", thM7380exceptionOrNullimpl);
        }
        this.this$0.copydefault.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
