package com.okinc.planet.biz_content.draft;

import androidx.lifecycle.MutableLiveData;
import com.okinc.uilab.stateful.StatefulView;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46359tRk;
import o.C47512trW;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class PublisherDraftViewModel$loadMoreDrafts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C47512trW.TaskDescription $currentState;
    final /* synthetic */ String $nextCursor;
    int label;
    final /* synthetic */ C47512trW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherDraftViewModel$loadMoreDrafts$1(C47512trW c47512trW, String str, C47512trW.TaskDescription taskDescription, Continuation<? super PublisherDraftViewModel$loadMoreDrafts$1> continuation) {
        super(2, continuation);
        this.this$0 = c47512trW;
        this.$nextCursor = str;
        this.$currentState = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PublisherDraftViewModel$loadMoreDrafts$1(this.this$0, this.$nextCursor, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PublisherDraftViewModel$loadMoreDrafts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C46359tRk c46359tRk = this.this$0.copydefault;
                    String str = this.$nextCursor;
                    this.label = 1;
                    obj = c46359tRk.copydefault(str, "10", this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                Pair pair = (Pair) obj;
                DraftInfo draftInfo = (DraftInfo) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                if (draftInfo != null) {
                    this.this$0.EZpvd = draftInfo.getNextCursor();
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.$currentState.copydefault());
                    listFJNWhG.addAll(draftInfo.getDrafts());
                    this.this$0.copydefault().postValue(new C47512trW.TaskDescription(StatefulView.Status.Content, listFJNWhG, false, draftInfo.getNextCursor(), 0, 16, null));
                    pUU.EZpvd("PublisherDraftViewModel", "Drafts load more: " + draftInfo.getDrafts().size() + " new items, nextCursor: " + draftInfo.getNextCursor());
                } else {
                    this.this$0.AEQbTJ().postValue("Failed to load more drafts");
                    pUU.copydefault("PublisherDraftViewModel", "Failed to load more drafts, errorCode: " + iIntValue);
                }
            } catch (Exception e) {
                MutableLiveData<String> mutableLiveDataAEQbTJ = this.this$0.AEQbTJ();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error loading more drafts";
                }
                mutableLiveDataAEQbTJ.postValue(message);
                pUU.AEQbTJ("PublisherDraftViewModel", "Error loading more drafts", e);
            }
            this.this$0.OLrzqt = false;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.OLrzqt = false;
            throw th;
        }
    }
}
