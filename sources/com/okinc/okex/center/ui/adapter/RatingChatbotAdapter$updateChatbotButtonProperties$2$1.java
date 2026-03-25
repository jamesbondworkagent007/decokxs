package com.okinc.okex.center.ui.adapter;

import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingChatbotAdapter$updateChatbotButtonProperties$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $btnIcon;
    final /* synthetic */ String $btnTitle;
    final /* synthetic */ int $chatbotIndex;
    int label;
    final /* synthetic */ RatingChatbotAdapter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingChatbotAdapter$updateChatbotButtonProperties$2$1(RatingChatbotAdapter ratingChatbotAdapter, int i, String str, String str2, Continuation<? super RatingChatbotAdapter$updateChatbotButtonProperties$2$1> continuation) {
        super(2, continuation);
        this.this$0 = ratingChatbotAdapter;
        this.$chatbotIndex = i;
        this.$btnTitle = str;
        this.$btnIcon = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingChatbotAdapter$updateChatbotButtonProperties$2$1(this.this$0, this.$chatbotIndex, this.$btnTitle, this.$btnIcon, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingChatbotAdapter$updateChatbotButtonProperties$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.notifyItemChanged(this.$chatbotIndex, new RatingChatbotAdapter.TaskDescription(this.$btnTitle, this.$btnIcon));
        return Unit.INSTANCE;
    }
}
