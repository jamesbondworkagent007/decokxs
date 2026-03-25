package com.okinc.core.ok_app.modeswitch.usecase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33173mrU;
import o.C33448mwe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class AppModeAnimationUseCase$animatePro$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $activityContext;
    final /* synthetic */ C33448mwe.ActionBar $animationType;
    final /* synthetic */ int $appMode;
    final /* synthetic */ Bundle $bundle;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33448mwe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppModeAnimationUseCase$animatePro$2(C33448mwe c33448mwe, C33448mwe.ActionBar actionBar, Context context, int i, Bundle bundle, Continuation<? super AppModeAnimationUseCase$animatePro$2> continuation) {
        super(2, continuation);
        this.this$0 = c33448mwe;
        this.$animationType = actionBar;
        this.$activityContext = context;
        this.$appMode = i;
        this.$bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppModeAnimationUseCase$animatePro$2 appModeAnimationUseCase$animatePro$2 = new AppModeAnimationUseCase$animatePro$2(this.this$0, this.$animationType, this.$activityContext, this.$appMode, this.$bundle, continuation);
        appModeAnimationUseCase$animatePro$2.L$0 = obj;
        return appModeAnimationUseCase$animatePro$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppModeAnimationUseCase$animatePro$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33448mwe c33448mwe = this.this$0;
            C33448mwe.ActionBar actionBar = this.$animationType;
            Context context = this.$activityContext;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                pUU.valueOf("ModeSwitch", "animatePro: activityContext is not an Activity");
                return Unit.INSTANCE;
            }
            int i2 = this.$appMode;
            AbstractC33173mrU.Activity activity2 = AbstractC33173mrU.Activity.EZpvd;
            Bundle bundle = this.$bundle;
            this.label = 1;
            if (c33448mwe.OLrzqt(actionBar, activity, i2, activity2, bundle, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
