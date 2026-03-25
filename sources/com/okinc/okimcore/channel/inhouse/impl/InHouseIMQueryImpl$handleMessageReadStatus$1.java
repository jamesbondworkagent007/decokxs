package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44136sEq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMQueryImpl$handleMessageReadStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OKMessage> $messages;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C44136sEq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$handleMessageReadStatus$1(List<OKMessage> list, C44136sEq c44136sEq, Continuation<? super InHouseIMQueryImpl$handleMessageReadStatus$1> continuation) {
        super(2, continuation);
        this.$messages = list;
        this.this$0 = c44136sEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMQueryImpl$handleMessageReadStatus$1 inHouseIMQueryImpl$handleMessageReadStatus$1 = new InHouseIMQueryImpl$handleMessageReadStatus$1(this.$messages, this.this$0, continuation);
        inHouseIMQueryImpl$handleMessageReadStatus$1.L$0 = obj;
        return inHouseIMQueryImpl$handleMessageReadStatus$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMQueryImpl$handleMessageReadStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:23:0x006b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C44136sEq c44136sEq;
        Iterator it;
        CoroutineScope coroutineScope;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            List<OKMessage> list = this.$messages;
            c44136sEq = this.this$0;
            it = list.iterator();
            coroutineScope = coroutineScope2;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) this.L$2;
        c44136sEq = (C44136sEq) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.EZpvd(c44136sEq.EZpvd, "c msg  read status failed  === " + thM7380exceptionOrNullimpl.getMessage());
        }
        while (it.hasNext()) {
            OKMessage oKMessage = (OKMessage) it.next();
            if (oKMessage.getMessageDirection() != OKMessage.MessageDirection.SEND && oKMessage.getSentStatus() != OKMessage.SentStatus.READ) {
                Result.Application application2 = Result.Companion;
                String targetId = oKMessage.getTargetId();
                long seq = oKMessage.getSeq();
                this.L$0 = coroutineScope;
                this.L$1 = c44136sEq;
                this.L$2 = it;
                this.label = 1;
                obj = c44136sEq.AEQbTJ(targetId, seq, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                while (it.hasNext()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
