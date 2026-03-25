package com.okinc.im.imui.messageV2.view.messagelist;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$initUiEventQueue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$initUiEventQueue$1(MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$initUiEventQueue$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListViewModel$initUiEventQueue$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$initUiEventQueue$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:29:0x0069) to fix multi-entry loop: BACK_EDGE: B:29:0x0069 -> B:15:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChannelIterator it;
        ChannelIterator channelIterator;
        Object objHasNext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            it = this.this$0.gasjUx.iterator();
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != objCopydefault) {
            }
        } else if (i == 1) {
            channelIterator = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (ChannelIterator) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                it = channelIterator;
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != objCopydefault) {
                }
            }
            it = channelIterator;
            try {
            } catch (Throwable th2) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                it = it;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != objCopydefault) {
                return objCopydefault;
            }
            channelIterator = it;
            obj = objHasNext;
            if (!((Boolean) obj).booleanValue()) {
                Function1 function1 = (Function1) channelIterator.next();
                Result.Application application3 = Result.Companion;
                this.L$0 = channelIterator;
                this.label = 2;
                if (function1.invoke(this) == objCopydefault) {
                    return objCopydefault;
                }
                it = channelIterator;
                Result.m7377constructorimpl(Unit.INSTANCE);
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != objCopydefault) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
