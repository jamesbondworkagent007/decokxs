package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessageListFragmentViewModel$onMessagesReceived$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRetry;
    final /* synthetic */ List<OKMessage> $messages;
    int label;
    final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragmentViewModel$onMessagesReceived$1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, boolean z, List<OKMessage> list, Continuation<? super BroadcastMessageListFragmentViewModel$onMessagesReceived$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageListFragmentViewModel;
        this.$isRetry = z;
        this.$messages = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageListFragmentViewModel$onMessagesReceived$1(this.this$0, this.$isRetry, this.$messages, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragmentViewModel$onMessagesReceived$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<OKMessage> list;
        Iterator<T> it;
        MutableSharedFlow mutableSharedFlow;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1 broadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1 = new BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1(this.this$0, this.$messages, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, broadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                if (!this.$isRetry && (!this.$messages.isEmpty())) {
                    list = this.$messages;
                    if (!(list instanceof Collection) && list.isEmpty()) {
                        mutableSharedFlow = this.this$0.EZpvd;
                        unit = Unit.INSTANCE;
                        this.label = 3;
                        if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((OKMessage) it.next()).getSentStatus() != OKMessage.SentStatus.SENDING) {
                                break;
                            }
                        }
                        mutableSharedFlow = this.this$0.EZpvd;
                        unit = Unit.INSTANCE;
                        this.label = 3;
                        if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
        this.label = 2;
        if (mutableSharedFlow2.emit((List) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        if (!this.$isRetry) {
            list = this.$messages;
            if (!(list instanceof Collection)) {
                it = list.iterator();
                while (it.hasNext()) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                unit = Unit.INSTANCE;
                this.label = 3;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
