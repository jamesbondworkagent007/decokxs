package com.okinc.core.ok_app.security;

import androidx.camera.core.RetryPolicy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import o.AbstractC47263tmj;
import o.C33427mwJ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1(Continuation<? super AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1 accessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1 = new AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1(continuation);
        accessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1.L$0 = obj;
        return accessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
        return ((AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
            if (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) {
                this.label = 1;
                if (DelayKt.delay(5000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                C33427mwJ.Companion.values();
            } else if (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) {
                this.label = 2;
                if (DelayKt.delay(RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, this) == objCopydefault) {
                    return objCopydefault;
                }
                C33427mwJ.Companion.values();
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            C33427mwJ.Companion.values();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            C33427mwJ.Companion.values();
        }
        return Unit.INSTANCE;
    }
}
