package com.okinc.auth.impl.passkey.ui.management.okxpay;

import android.content.Context;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6573aRr;
import o.C56391yDq;
import o.C56442yFn;
import o.C6176aKR;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityPasskeyOkxPayFragment$initView$5 extends SuspendLambda implements Function2<GetAuthenticationTypeResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6176aKR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPasskeyOkxPayFragment$initView$5(C6176aKR c6176aKR, Continuation<? super SecurityPasskeyOkxPayFragment$initView$5> continuation) {
        super(2, continuation);
        this.this$0 = c6176aKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityPasskeyOkxPayFragment$initView$5 securityPasskeyOkxPayFragment$initView$5 = new SecurityPasskeyOkxPayFragment$initView$5(this.this$0, continuation);
        securityPasskeyOkxPayFragment$initView$5.L$0 = obj;
        return securityPasskeyOkxPayFragment$initView$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAuthenticationTypeResponse getAuthenticationTypeResponse, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyOkxPayFragment$initView$5) create(getAuthenticationTypeResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GetAuthenticationTypeResponse getAuthenticationTypeResponse = (GetAuthenticationTypeResponse) this.L$0;
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            this.this$0.gEmmrt.launch(ActivityC6573aRr.Companion.OLrzqt(context, getAuthenticationTypeResponse));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
