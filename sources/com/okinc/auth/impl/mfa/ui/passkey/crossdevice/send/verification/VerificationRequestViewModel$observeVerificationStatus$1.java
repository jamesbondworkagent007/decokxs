package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import com.okinc.account.api.model.passkey.PasskeyCrossDeviceVerificationStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationRequestViewModel$observeVerificationStatus$1 extends SuspendLambda implements Function2<PasskeyCrossDeviceVerificationStatus, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $challenge;
    final /* synthetic */ String $targetCredentialId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VerificationRequestViewModel this$0;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyCrossDeviceVerificationStatus.values().length];
            try {
                iArr[PasskeyCrossDeviceVerificationStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestViewModel$observeVerificationStatus$1(VerificationRequestViewModel verificationRequestViewModel, String str, String str2, Continuation<? super VerificationRequestViewModel$observeVerificationStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationRequestViewModel;
        this.$challenge = str;
        this.$targetCredentialId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationRequestViewModel$observeVerificationStatus$1 verificationRequestViewModel$observeVerificationStatus$1 = new VerificationRequestViewModel$observeVerificationStatus$1(this.this$0, this.$challenge, this.$targetCredentialId, continuation);
        verificationRequestViewModel$observeVerificationStatus$1.L$0 = obj;
        return verificationRequestViewModel$observeVerificationStatus$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyCrossDeviceVerificationStatus passkeyCrossDeviceVerificationStatus, Continuation<? super Unit> continuation) {
        return ((VerificationRequestViewModel$observeVerificationStatus$1) create(passkeyCrossDeviceVerificationStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (TaskDescription.AEQbTJ[((PasskeyCrossDeviceVerificationStatus) this.L$0).ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "receive verification finished event");
            this.this$0.OLrzqt(this.$challenge, this.$targetCredentialId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
