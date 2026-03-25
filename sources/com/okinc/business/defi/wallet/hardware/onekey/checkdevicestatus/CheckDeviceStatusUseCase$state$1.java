package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C13754dXa;
import o.C56391yDq;
import o.C56442yFn;
import o.eHS;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckDeviceStatusUseCase$state$1 extends SuspendLambda implements yHO<Boolean, OneKeyAuthStage, Continuation<? super eHS>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckDeviceStatusUseCase$state$1(Continuation<? super CheckDeviceStatusUseCase$state$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Boolean bool, OneKeyAuthStage oneKeyAuthStage, Continuation<? super eHS> continuation) {
        return invoke(bool.booleanValue(), oneKeyAuthStage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, OneKeyAuthStage oneKeyAuthStage, Continuation<? super eHS> continuation) {
        CheckDeviceStatusUseCase$state$1 checkDeviceStatusUseCase$state$1 = new CheckDeviceStatusUseCase$state$1(continuation);
        checkDeviceStatusUseCase$state$1.Z$0 = z;
        checkDeviceStatusUseCase$state$1.L$0 = oneKeyAuthStage;
        return checkDeviceStatusUseCase$state$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            OneKeyAuthStage oneKeyAuthStage = (OneKeyAuthStage) this.L$0;
            if (z) {
                i = C13754dXa.FragmentManager.PlaybackStateCompatApi21CustomAction;
            } else if (oneKeyAuthStage == OneKeyAuthStage.WAIT_FOR_PIN) {
                i = C13754dXa.FragmentManager.applyDayNightToActiveDelegates;
            } else {
                i = oneKeyAuthStage == OneKeyAuthStage.WAIT_FOR_BUTTON_CLICK ? C13754dXa.FragmentManager.addActiveDelegate : C13754dXa.FragmentManager.isCompatVectorFromResourcesEnabled;
            }
            return new eHS(i, (oneKeyAuthStage == OneKeyAuthStage.WAIT_FOR_PIN || oneKeyAuthStage == OneKeyAuthStage.WAIT_FOR_BUTTON_CLICK) ? false : true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
