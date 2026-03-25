package com.okinc.im.imui.livestream.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C36547ocy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$initTaskQueue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$initTaskQueue$1(C36547ocy c36547ocy, Continuation<? super LivestreamChatViewModel$initTaskQueue$1> continuation) {
        super(2, continuation);
        this.this$0 = c36547ocy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamChatViewModel$initTaskQueue$1 livestreamChatViewModel$initTaskQueue$1 = new LivestreamChatViewModel$initTaskQueue$1(this.this$0, continuation);
        livestreamChatViewModel$initTaskQueue$1.L$0 = obj;
        return livestreamChatViewModel$initTaskQueue$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$initTaskQueue$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:29:0x0079) to fix multi-entry loop: BACK_EDGE: B:29:0x0079 -> B:15:0x0042 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0042 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        ChannelIterator it;
        CoroutineScope coroutineScope2;
        Object objHasNext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            it = this.this$0.wlaJM.iterator();
            this.L$0 = coroutineScope;
            this.L$1 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != objCopydefault) {
            }
        } else if (i == 1) {
            ChannelIterator channelIterator = (ChannelIterator) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            it = channelIterator;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                it = it;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                coroutineScope = coroutineScope2;
                this.L$0 = coroutineScope;
                this.L$1 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != objCopydefault) {
                }
            }
            coroutineScope = coroutineScope2;
            try {
            } catch (Throwable th2) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                coroutineScope = coroutineScope;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            this.L$0 = coroutineScope;
            this.L$1 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != objCopydefault) {
                return objCopydefault;
            }
            coroutineScope2 = coroutineScope;
            obj = objHasNext;
            it = it;
            if (!((Boolean) obj).booleanValue()) {
                Function1 function1 = (Function1) it.next();
                Result.Application application3 = Result.Companion;
                this.L$0 = coroutineScope2;
                this.L$1 = it;
                this.label = 2;
                it = it;
                if (function1.invoke(this) == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                Result.m7377constructorimpl(Unit.INSTANCE);
                this.L$0 = coroutineScope;
                this.L$1 = it;
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
