package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5990aGr;
import o.C56391yDq;
import o.C56442yFn;
import o.C5967aGU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateServiceFragment$initView$3 extends SuspendLambda implements Function2<AbstractC5990aGr, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5967aGU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceFragment$initView$3(C5967aGU c5967aGU, Continuation<? super PasskeyAuthenticateServiceFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c5967aGU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyAuthenticateServiceFragment$initView$3 passkeyAuthenticateServiceFragment$initView$3 = new PasskeyAuthenticateServiceFragment$initView$3(this.this$0, continuation);
        passkeyAuthenticateServiceFragment$initView$3.L$0 = obj;
        return passkeyAuthenticateServiceFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5990aGr abstractC5990aGr, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceFragment$initView$3) create(abstractC5990aGr, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC5990aGr abstractC5990aGr = (AbstractC5990aGr) this.L$0;
            if (abstractC5990aGr instanceof AbstractC5990aGr.Activity) {
                this.this$0.showLoadingAtOnce();
                this.this$0.valueOf.launch(((AbstractC5990aGr.Activity) abstractC5990aGr).copydefault());
            } else if (abstractC5990aGr instanceof AbstractC5990aGr.StateListAnimator) {
                this.this$0.showLoadingAtOnce();
                this.this$0.djBIcL.launch(((AbstractC5990aGr.StateListAnimator) abstractC5990aGr).EZpvd());
            } else if (abstractC5990aGr instanceof AbstractC5990aGr.Application) {
                C5967aGU c5967aGU = this.this$0;
                String strOLrzqt = ((AbstractC5990aGr.Application) abstractC5990aGr).OLrzqt();
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                c5967aGU.EZpvd(new PasskeyState.AuthenticateError(strOLrzqt));
            } else if (Intrinsics.EZpvd(abstractC5990aGr, AbstractC5990aGr.TaskDescription.copydefault)) {
                this.this$0.EZpvd(PasskeyState.DeviceNotCompatible.INSTANCE);
            } else if (Intrinsics.EZpvd(abstractC5990aGr, AbstractC5990aGr.ActionBar.OLrzqt)) {
                this.this$0.EZpvd(PasskeyState.IsChinaIp.INSTANCE);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
