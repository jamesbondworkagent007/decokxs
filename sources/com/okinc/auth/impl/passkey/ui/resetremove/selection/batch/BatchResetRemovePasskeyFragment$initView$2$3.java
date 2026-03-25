package com.okinc.auth.impl.passkey.ui.resetremove.selection.batch;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class BatchResetRemovePasskeyFragment$initView$2$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BatchResetRemovePasskeyFragment$initView$2$3(Continuation<? super BatchResetRemovePasskeyFragment$initView$2$3> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BatchResetRemovePasskeyFragment$initView$2$3 batchResetRemovePasskeyFragment$initView$2$3 = new BatchResetRemovePasskeyFragment$initView$2$3(continuation);
        batchResetRemovePasskeyFragment$initView$2$3.L$0 = obj;
        return batchResetRemovePasskeyFragment$initView$2$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((BatchResetRemovePasskeyFragment$initView$2$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55326xho.toast$default((String) this.L$0, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
