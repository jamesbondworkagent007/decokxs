package com.okinc.planet.biz_content.draft;

import com.okinc.uilab.stateful.StatefulView;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46359tRk;
import o.C47512trW;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class PublisherDraftViewModel$refreshDraftList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47512trW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherDraftViewModel$refreshDraftList$1(C47512trW c47512trW, Continuation<? super PublisherDraftViewModel$refreshDraftList$1> continuation) {
        super(2, continuation);
        this.this$0 = c47512trW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PublisherDraftViewModel$refreshDraftList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PublisherDraftViewModel$refreshDraftList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StatefulView.Status status;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C46359tRk c46359tRk = this.this$0.copydefault;
                    this.label = 1;
                    obj = c46359tRk.copydefault("", "10", this);
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
                    List<DraftDataInfo> drafts = draftInfo.getDrafts();
                    if (drafts.isEmpty()) {
                        status = StatefulView.Status.Empty;
                    } else {
                        status = StatefulView.Status.Content;
                    }
                    this.this$0.copydefault().postValue(new C47512trW.TaskDescription(status, drafts, true, draftInfo.getNextCursor(), 0, 16, null));
                    pUU.EZpvd("PublisherDraftViewModel", "Drafts refreshed: " + drafts.size() + " items, nextCursor: " + draftInfo.getNextCursor());
                } else {
                    this.this$0.copydefault().postValue(new C47512trW.TaskDescription(StatefulView.Status.Error, yDY.AhwBna(), true, null, iIntValue));
                    pUU.copydefault("PublisherDraftViewModel", "Failed to load drafts, errorCode: " + iIntValue);
                }
            } catch (Exception e) {
                this.this$0.copydefault().postValue(new C47512trW.TaskDescription(StatefulView.Status.Error, yDY.AhwBna(), true, null, -1));
                pUU.AEQbTJ("PublisherDraftViewModel", "Error loading drafts", e);
            }
            this.this$0.OLrzqt = false;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.OLrzqt = false;
            throw th;
        }
    }
}
