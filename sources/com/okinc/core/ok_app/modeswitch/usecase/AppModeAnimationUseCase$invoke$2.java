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
public final class AppModeAnimationUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $activityContext;
    final /* synthetic */ int $appMode;
    final /* synthetic */ AbstractC33173mrU $appModeTag;
    final /* synthetic */ Bundle $bundle;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33448mwe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppModeAnimationUseCase$invoke$2(C33448mwe c33448mwe, Context context, int i, AbstractC33173mrU abstractC33173mrU, Bundle bundle, Continuation<? super AppModeAnimationUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c33448mwe;
        this.$activityContext = context;
        this.$appMode = i;
        this.$appModeTag = abstractC33173mrU;
        this.$bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppModeAnimationUseCase$invoke$2 appModeAnimationUseCase$invoke$2 = new AppModeAnimationUseCase$invoke$2(this.this$0, this.$activityContext, this.$appMode, this.$appModeTag, this.$bundle, continuation);
        appModeAnimationUseCase$invoke$2.L$0 = obj;
        return appModeAnimationUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppModeAnimationUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33448mwe c33448mwe = this.this$0;
            C33448mwe.ActionBar.Application application = C33448mwe.ActionBar.Application.KWHzl;
            Context context = this.$activityContext;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                int i2 = this.$appMode;
                AbstractC33173mrU abstractC33173mrU = this.$appModeTag;
                Bundle bundle = this.$bundle;
                this.label = 1;
                if (c33448mwe.OLrzqt(application, activity, i2, abstractC33173mrU, bundle, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.valueOf("ModeSwitch", "invoke: activityContext is not an Activity");
                return Unit.INSTANCE;
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
