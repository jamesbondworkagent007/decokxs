package com.okinc.liveness.lca.debugtool.ui;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C47029tiN;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C47029tiN $status;
    int label;
    final /* synthetic */ LcaDebugSettingActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1(LcaDebugSettingActivity lcaDebugSettingActivity, C47029tiN c47029tiN, Continuation<? super LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1> continuation) {
        super(2, continuation);
        this.this$0 = lcaDebugSettingActivity;
        this.$status = c47029tiN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1(this.this$0, this.$status, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.dismissLoading();
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
            C47029tiN c47029tiN = this.$status;
            final LcaDebugSettingActivity lcaDebugSettingActivity = this.this$0;
            viewOnClickListenerC54939xaY.setTitle("AliFaceGuard Callback");
            final String string = c47029tiN.toString();
            viewOnClickListenerC54939xaY.EZpvd(string);
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.AEQbTJ("Copy", new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lcaDebugSettingActivity.copyToClipboard("LcaDebugSetting.getRiskService", string);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
