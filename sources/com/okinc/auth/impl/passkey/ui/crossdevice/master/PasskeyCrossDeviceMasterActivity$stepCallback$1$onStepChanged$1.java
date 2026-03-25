package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.content.DialogInterface;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncompatibleV2BottomFragment;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncorrectDeviceOrAccountBottomFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;
import o.pUU;
import o.zPD;
import uniffi.account.BluetoothConnectDevice;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ zPD $step;
    int label;
    final /* synthetic */ PasskeyCrossDeviceMasterActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1(zPD zpd, PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity, Continuation<? super PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1> continuation) {
        super(2, continuation);
        this.$step = zpd;
        this.this$0 = passkeyCrossDeviceMasterActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1(this.$step, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            zPD zpd = this.$step;
            if (Intrinsics.EZpvd(zpd, zPD.ActionBar.INSTANCE)) {
                this.this$0.valueOf().KWHzl(BluetoothConnectDevice.AUTHORIZATION);
                PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment = new PasskeyCrossDeviceMasterBottomFragment();
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                passkeyCrossDeviceMasterBottomFragment.show(supportFragmentManager);
                this.this$0.gEmmrt().isConnected();
            } else if (Intrinsics.EZpvd(zpd, zPD.TaskDescription.INSTANCE)) {
                this.this$0.gEmmrt().fetchVPNInfo();
            } else if (zpd instanceof zPD.PictureInPictureParams) {
                this.this$0.gEmmrt().AkhnZx();
                if (((zPD.PictureInPictureParams) this.$step).EZpvd()) {
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.TarCU);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.Ufzxmz);
                }
                C55326xho.toastWithSuccessfulIcon$default(strAYXKKw, 0, 1, (Object) null);
                this.this$0.finish();
            } else if (Intrinsics.EZpvd(zpd, zPD.TaskStackBuilder.INSTANCE) || Intrinsics.EZpvd(zpd, zPD.LoaderManager.INSTANCE)) {
                this.this$0.finish();
            } else if ((zpd instanceof zPD.StateListAnimator) || Intrinsics.EZpvd(zpd, zPD.Application.INSTANCE)) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.RXzakW), 0, 1, (Object) null);
                this.this$0.finish();
            } else if (zpd instanceof zPD.Activity) {
                this.this$0.KWHzl();
                PasskeyIncompatibleV2BottomFragment.ActionBar actionBar = PasskeyIncompatibleV2BottomFragment.Companion;
                final PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity = this.this$0;
                PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragmentOLrzqt = actionBar.OLrzqt(new Function0() { // from class: o.aIr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1.invokeSuspend$lambda$0(passkeyCrossDeviceMasterActivity);
                    }
                }, false, !((zPD.Activity) this.$step).OLrzqt());
                final PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity2 = this.this$0;
                passkeyIncompatibleV2BottomFragmentOLrzqt.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aIq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        passkeyCrossDeviceMasterActivity2.finish();
                    }
                });
                FragmentManager supportFragmentManager2 = passkeyCrossDeviceMasterActivity2.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                passkeyIncompatibleV2BottomFragmentOLrzqt.show(supportFragmentManager2);
            } else if (Intrinsics.EZpvd(zpd, zPD.Fragment.INSTANCE) || Intrinsics.EZpvd(zpd, zPD.FragmentManager.INSTANCE)) {
                this.this$0.KWHzl();
                PasskeyIncorrectDeviceOrAccountBottomFragment.StateListAnimator stateListAnimator = PasskeyIncorrectDeviceOrAccountBottomFragment.Companion;
                final PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity3 = this.this$0;
                PasskeyIncorrectDeviceOrAccountBottomFragment passkeyIncorrectDeviceOrAccountBottomFragmentCopydefault = stateListAnimator.copydefault(new Function0() { // from class: o.aIz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1.invokeSuspend$lambda$3(passkeyCrossDeviceMasterActivity3);
                    }
                });
                final PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity4 = this.this$0;
                passkeyIncorrectDeviceOrAccountBottomFragmentCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aIx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        passkeyCrossDeviceMasterActivity4.finish();
                    }
                });
                FragmentManager supportFragmentManager3 = passkeyCrossDeviceMasterActivity4.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                passkeyIncorrectDeviceOrAccountBottomFragmentCopydefault.show(supportFragmentManager3);
            } else if (Intrinsics.EZpvd(zpd, zPD.AssistContent.INSTANCE)) {
                pUU.copydefault(this.this$0.getTAG(), "ScanSourceNotSetup - this should not happen");
                this.this$0.finish();
            } else if (zpd instanceof zPD.Dialog) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.RXzakW), 0, 1, (Object) null);
                this.this$0.finish();
            } else {
                if (!(zpd instanceof zPD.PendingIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.copydefault(this.this$0.getTAG(), "PasskeyError: " + ((zPD.PendingIntent) this.$step).EZpvd());
                if (!(((zPD.PendingIntent) this.$step).EZpvd() instanceof OkxPasskeyException.UserCancelled)) {
                    C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.RXzakW), 0, 1, (Object) null);
                    this.this$0.finish();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity) {
        ActivityResultLauncher activityResultLauncher = passkeyCrossDeviceMasterActivity.valueOf;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, false, true, 14, null));
        passkeyCrossDeviceMasterActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity) {
        passkeyCrossDeviceMasterActivity.finish();
        return Unit.INSTANCE;
    }
}
