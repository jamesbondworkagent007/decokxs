package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import uniffi.account.PasskeyVerifyType;
import uniffi.account.SuccessType;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyCrossDeviceVerifyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1(PasskeyCrossDeviceVerifyViewModel passkeyCrossDeviceVerifyViewModel, Continuation<? super PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceVerifyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyCrossDeviceVerifyActivity.Input inputCopydefault = this.this$0.copydefault();
            this.this$0.values.OLrzqt(inputCopydefault != null ? inputCopydefault.AEQbTJ() : false ? PasskeyVerifyType.SYNC : PasskeyVerifyType.CROSS_DEVICE_VERIFY, this.this$0.AkhnZx ? SuccessType.AUTO : SuccessType.MANUAL);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
