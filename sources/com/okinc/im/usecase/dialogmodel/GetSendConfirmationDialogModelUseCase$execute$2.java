package com.okinc.im.usecase.dialogmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35773oDd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oCS;
import o.oGB;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSendConfirmationDialogModelUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C35773oDd>, Object> {
    int label;
    final /* synthetic */ oCS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSendConfirmationDialogModelUseCase$execute$2(oCS ocs, Continuation<? super GetSendConfirmationDialogModelUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = ocs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSendConfirmationDialogModelUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C35773oDd> continuation) {
        return ((GetSendConfirmationDialogModelUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zKWHzl = this.this$0.OLrzqt.KWHzl();
            String strKWHzl = this.this$0.copydefault.KWHzl();
            if (zKWHzl && strKWHzl != null) {
                oGB ogb = this.this$0.KWHzl;
                this.label = 1;
                obj = ogb.EZpvd(strKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (!Intrinsics.EZpvd(obj, C56443yFo.KWHzl(true))) {
            return C35773oDd.OLrzqt;
        }
        return null;
    }
}
