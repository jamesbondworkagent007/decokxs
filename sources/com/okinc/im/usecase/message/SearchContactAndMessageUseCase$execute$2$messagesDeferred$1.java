package com.okinc.im.usecase.message;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35819oEw;
import o.C56391yDq;
import o.C56442yFn;
import o.sKO;
import o.sKT;
import o.sQY;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchContactAndMessageUseCase$execute$2$messagesDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends sQY>>, Object> {
    final /* synthetic */ String $keyword;
    int label;
    final /* synthetic */ C35819oEw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchContactAndMessageUseCase$execute$2$messagesDeferred$1(C35819oEw c35819oEw, String str, Continuation<? super SearchContactAndMessageUseCase$execute$2$messagesDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c35819oEw;
        this.$keyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchContactAndMessageUseCase$execute$2$messagesDeferred$1(this.this$0, this.$keyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends sQY>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<sQY>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<sQY>> continuation) {
        return ((SearchContactAndMessageUseCase$execute$2$messagesDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sKO sko = this.this$0.EZpvd;
            sKT skt = new sKT(this.$keyword, null, 5, null);
            this.label = 1;
            obj = sko.KWHzl(skt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
