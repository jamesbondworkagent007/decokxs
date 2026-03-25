package com.okinc.auth.impl.debugtool.passkey;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C5643aAO;
import o.C56442yFn;
import o.C6617aSi;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyDebugToolFragment$initView$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5643aAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyDebugToolFragment$initView$3$1(C5643aAO c5643aAO, Continuation<? super PasskeyDebugToolFragment$initView$3$1> continuation) {
        super(2, continuation);
        this.this$0 = c5643aAO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyDebugToolFragment$initView$3$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyDebugToolFragment$initView$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Task<PendingIntent> signPendingIntent = this.this$0.EZpvd().getSignPendingIntent(this.this$0.AhwBna().toPublicKeyCredentialRequestOptions());
            Intrinsics.checkNotNullExpressionValue(signPendingIntent, "");
            this.label = 1;
            obj = C6617aSi.EZpvd(signPendingIntent, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PendingIntent pendingIntent = (PendingIntent) obj;
        C5643aAO c5643aAO = this.this$0;
        Intrinsics.copydefault(pendingIntent);
        c5643aAO.EZpvd(pendingIntent);
        return Unit.INSTANCE;
    }
}
