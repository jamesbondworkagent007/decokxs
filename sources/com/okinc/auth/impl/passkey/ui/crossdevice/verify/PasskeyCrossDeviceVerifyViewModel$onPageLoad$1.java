package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import com.okinc.account.api.model.passkey.PasskeyCrossDeviceVerificationStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceVerifyViewModel$onPageLoad$1 extends SuspendLambda implements Function2<PasskeyCrossDeviceVerificationStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PasskeyCrossDeviceVerifyViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyCrossDeviceVerificationStatus.values().length];
            try {
                iArr[PasskeyCrossDeviceVerificationStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceVerifyViewModel$onPageLoad$1(PasskeyCrossDeviceVerifyViewModel passkeyCrossDeviceVerifyViewModel, Continuation<? super PasskeyCrossDeviceVerifyViewModel$onPageLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceVerifyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyCrossDeviceVerifyViewModel$onPageLoad$1 passkeyCrossDeviceVerifyViewModel$onPageLoad$1 = new PasskeyCrossDeviceVerifyViewModel$onPageLoad$1(this.this$0, continuation);
        passkeyCrossDeviceVerifyViewModel$onPageLoad$1.L$0 = obj;
        return passkeyCrossDeviceVerifyViewModel$onPageLoad$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyCrossDeviceVerificationStatus passkeyCrossDeviceVerificationStatus, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceVerifyViewModel$onPageLoad$1) create(passkeyCrossDeviceVerificationStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (ActionBar.copydefault[((PasskeyCrossDeviceVerificationStatus) this.L$0).ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl(PasskeyCrossDeviceVerifyViewModel.copydefault, "receive verification finished event");
            this.this$0.AkhnZx = true;
            this.this$0.EZpvd();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
