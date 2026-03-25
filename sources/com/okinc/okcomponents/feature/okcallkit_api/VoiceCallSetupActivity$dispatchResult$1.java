package com.okinc.okcomponents.feature.okcallkit_api;

import android.content.Intent;
import android.os.Bundle;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC42573rXw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceCallSetupActivity$dispatchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $result;
    int label;
    final /* synthetic */ ActivityC42573rXw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallSetupActivity$dispatchResult$1(ActivityC42573rXw activityC42573rXw, int i, Continuation<? super VoiceCallSetupActivity$dispatchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC42573rXw;
        this.$result = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceCallSetupActivity$dispatchResult$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceCallSetupActivity$dispatchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bundle extras;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Intent intent = this.this$0.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                extras = Bundle.EMPTY;
            }
            Intent intent2 = new Intent();
            intent2.putExtras(extras);
            this.this$0.setResult(this.$result, intent2);
            int i = this.$result;
            Intrinsics.copydefault(extras);
            RxBus.AEQbTJ(new ActivityC42573rXw.Activity(i, extras));
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
