package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;
import o.zRS;
import uniffi.account.BluetoothConnectDevice;
import uniffi.account.PasskeyVerifyType;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ zRS $step;
    int label;
    final /* synthetic */ PasskeyCrossDeviceVerifyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1(zRS zrs, PasskeyCrossDeviceVerifyActivity passkeyCrossDeviceVerifyActivity, Continuation<? super PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1> continuation) {
        super(2, continuation);
        this.$step = zrs;
        this.this$0 = passkeyCrossDeviceVerifyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1(this.$step, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            zRS zrs = this.$step;
            if (Intrinsics.EZpvd(zrs, zRS.Dialog.INSTANCE) || Intrinsics.EZpvd(zrs, zRS.FragmentManager.INSTANCE)) {
                PasskeyCrossDeviceVerifyActivity.Input inputAhwBna = this.this$0.AhwBna();
                this.this$0.valueOf().OLrzqt((inputAhwBna == null || !inputAhwBna.AEQbTJ()) ? PasskeyVerifyType.CROSS_DEVICE_VERIFY : PasskeyVerifyType.SYNC);
                PasskeyCrossDeviceVerifyBottomFragment.Companion.EZpvd().show(this.this$0.getSupportFragmentManager(), "PasskeySyncQrShowBottomFragment");
            } else if (Intrinsics.EZpvd(zrs, zRS.ActionBar.INSTANCE)) {
                this.this$0.valueOf().KWHzl(BluetoothConnectDevice.TRIGGER_VERIFICATION);
                this.this$0.AYXKKw().values();
            } else if (Intrinsics.EZpvd(zrs, zRS.StateListAnimator.INSTANCE)) {
                this.this$0.AYXKKw().isConnected();
            } else if (Intrinsics.EZpvd(zrs, zRS.Fragment.INSTANCE)) {
                this.this$0.AYXKKw().DbNXlk();
                this.this$0.EZpvd(PasskeyCrossDeviceVerifyActivity.Output.Success.OLrzqt);
            } else if (Intrinsics.EZpvd(zrs, zRS.Application.INSTANCE)) {
                this.this$0.EZpvd(PasskeyCrossDeviceVerifyActivity.Output.Cancelled.AEQbTJ);
            } else if (zrs instanceof zRS.Activity) {
                C55326xho.toastWithFailedIcon$default(((zRS.Activity) this.$step).AEQbTJ(), 0, 1, (Object) null);
            } else {
                if (!Intrinsics.EZpvd(zrs, zRS.TaskDescription.INSTANCE) && !(zrs instanceof zRS.LoaderManager)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.RXzakW), 0, 1, (Object) null);
                this.this$0.finish();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
