package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C15974ebF;
import o.C56391yDq;
import o.C56442yFn;
import o.fXY;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$getWeakContext$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WeakReference<Context>>, Object> {
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$getWeakContext$3(C15974ebF c15974ebF, Continuation<? super DAppMethodHelper$getWeakContext$3> continuation) {
        super(2, continuation);
        this.this$0 = c15974ebF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppMethodHelper$getWeakContext$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WeakReference<Context>> continuation) {
        return ((DAppMethodHelper$getWeakContext$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Activity activityValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        do {
            if (this.this$0.valueOf() != null && (((activityValueOf = this.this$0.valueOf()) == null || !activityValueOf.isFinishing()) && !(this.this$0.valueOf() instanceof fXY) && !(this.this$0.valueOf() instanceof MethodHelperActivity))) {
                Activity activityValueOf2 = this.this$0.valueOf();
                pUU.KWHzl("DAppMethodHelper", "getWeakContext - using context of " + (activityValueOf2 != null ? activityValueOf2.getClass().getSimpleName() : null));
                return new WeakReference(this.this$0.valueOf());
            }
            this.label = 1;
        } while (DelayKt.delay(200L, this) != objCopydefault);
        return objCopydefault;
    }
}
