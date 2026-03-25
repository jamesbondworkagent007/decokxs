package com.okinc.auth.impl.mfa.ui;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OTP $currentOtpType;
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1(MfaViewModel mfaViewModel, OTP otp, Continuation<? super MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaViewModel;
        this.$currentOtpType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1(this.this$0, this.$currentOtpType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MfaResponse value = this.this$0.valueOf().getValue();
            if (value != null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.AkhnZx;
                SwitchVerificationMethodRequest.TaskDescription taskDescription = SwitchVerificationMethodRequest.Companion;
                OTP otp = this.$currentOtpType;
                Long value2 = this.this$0.KWHzl().getValue();
                SwitchVerificationMethodRequest switchVerificationMethodRequestCopydefault = taskDescription.copydefault(otp, value, C56443yFo.KWHzl(value2 != null ? value2.longValue() : 0L));
                this.label = 1;
                if (mutableSharedFlow.emit(switchVerificationMethodRequestCopydefault, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.this$0.EZpvd(new MfaFailure.GenericFailure(MultiTransferSignData.DEFAULT_INTERVAL, "No response found"));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
