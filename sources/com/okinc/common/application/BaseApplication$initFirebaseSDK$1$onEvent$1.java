package com.okinc.common.application;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.okuser.data.User;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC47263tmj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseApplication$initFirebaseSDK$1$onEvent$1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseApplication this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$initFirebaseSDK$1$onEvent$1(BaseApplication baseApplication, Continuation<? super BaseApplication$initFirebaseSDK$1$onEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = baseApplication;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseApplication$initFirebaseSDK$1$onEvent$1 baseApplication$initFirebaseSDK$1$onEvent$1 = new BaseApplication$initFirebaseSDK$1$onEvent$1(this.this$0, continuation);
        baseApplication$initFirebaseSDK$1$onEvent$1.L$0 = obj;
        return baseApplication$initFirebaseSDK$1$onEvent$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
        return ((BaseApplication$initFirebaseSDK$1$onEvent$1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
            if ((abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) || (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator)) {
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.this$0);
                User userOLrzqt = this.this$0.UeEOUB().OLrzqt();
                firebaseAnalytics.setUserId(userOLrzqt != null ? userOLrzqt.getTk() : null);
                this.this$0.AEQbTJ.set(false);
            } else if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                FirebaseAnalytics.getInstance(this.this$0).setUserId(null);
                this.this$0.AEQbTJ.set(false);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
