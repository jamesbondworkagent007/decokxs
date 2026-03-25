package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist;

import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5887aEu;

/* JADX INFO: loaded from: classes14.dex */
public final class DevicesListFragment$initView$7 extends SuspendLambda implements Function2<AuthenticationStartResponse.AdditionalData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5887aEu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicesListFragment$initView$7(C5887aEu c5887aEu, Continuation<? super DevicesListFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c5887aEu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DevicesListFragment$initView$7 devicesListFragment$initView$7 = new DevicesListFragment$initView$7(this.this$0, continuation);
        devicesListFragment$initView$7.L$0 = obj;
        return devicesListFragment$initView$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthenticationStartResponse.AdditionalData additionalData, Continuation<? super Unit> continuation) {
        return ((DevicesListFragment$initView$7) create(additionalData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ().OLrzqt((AuthenticationStartResponse.AdditionalData) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
