package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33794nGb;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$fetchAndUpdateTrendingGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$fetchAndUpdateTrendingGroups$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$fetchAndUpdateTrendingGroups$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListViewModel$fetchAndUpdateTrendingGroups$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$fetchAndUpdateTrendingGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strKWHzl = C44157sFk.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            boolean zAEQbTJ = C33794nGb.EZpvd.AEQbTJ(strKWHzl);
            if (((Boolean) this.this$0.AubY.getValue()).booleanValue() || !((Boolean) this.this$0.AxsJAY.getValue()).booleanValue() || zAEQbTJ) {
                this.this$0.QKVWgx.setValue(yDY.AhwBna());
                return Unit.INSTANCE;
            }
            ConversationListViewModel conversationListViewModel = this.this$0;
            this.label = 1;
            obj = conversationListViewModel.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.QKVWgx.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
