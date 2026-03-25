package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C16013ebs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$getValidActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Activity>, Object> {
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$getValidActivity$2(C16013ebs c16013ebs, Continuation<? super DAppConnectRequestHelper$getValidActivity$2> continuation) {
        super(2, continuation);
        this.this$0 = c16013ebs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$getValidActivity$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Activity> continuation) {
        return ((DAppConnectRequestHelper$getValidActivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Activity activityCopydefault;
        Activity activityCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        do {
            if (this.this$0.copydefault() != null && (((activityCopydefault = this.this$0.copydefault()) == null || !activityCopydefault.isFinishing()) && ((activityCopydefault2 = this.this$0.copydefault()) == null || !activityCopydefault2.isDestroyed()))) {
                Activity activityCopydefault3 = this.this$0.copydefault();
                pUU.KWHzl("DAppConnectRequestHelper", "getValidActivity - using context of " + (activityCopydefault3 != null ? activityCopydefault3.getClass().getSimpleName() : null));
                return this.this$0.copydefault();
            }
            this.label = 1;
        } while (DelayKt.delay(200L, this) != objCopydefault);
        return objCopydefault;
    }
}
