package com.okinc.auth.impl.passkey.ui.twofa;

import androidx.fragment.app.FragmentActivity;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel$clickSwitch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Fido2VerificationOption $authType;
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$clickSwitch$1(PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, Fido2VerificationOption fido2VerificationOption, FragmentActivity fragmentActivity, Continuation<? super PasskeyTwoFaOtpViewModel$clickSwitch$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyTwoFaOtpViewModel;
        this.$authType = fido2VerificationOption;
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$clickSwitch$1(this.this$0, this.$authType, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$clickSwitch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AkhnZx) {
                Integer num = (Integer) this.this$0.OLrzqt.getValue();
                String strDbNXlk = (num != null && num.intValue() == 1) ? this.this$0.DbNXlk(C8206ayP.Dialog.DWgRXt) : this.this$0.DbNXlk(C8206ayP.Dialog.DcqEDu);
                MutableSharedFlow mutableSharedFlow = this.this$0.fetchVPNInfo;
                this.label = 1;
                if (mutableSharedFlow.emit(strDbNXlk, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Integer num2 = (Integer) this.this$0.OLrzqt.getValue();
                if (num2 != null && num2.intValue() == 0) {
                    this.this$0.OLrzqt.setValue(C56443yFo.AEQbTJ(1));
                } else {
                    this.this$0.OLrzqt.setValue(C56443yFo.AEQbTJ(0));
                }
                this.this$0.AYXKKw();
                this.this$0.OLrzqt(this.$authType);
                Integer num3 = (Integer) this.this$0.OLrzqt.getValue();
                if (num3 != null && num3.intValue() == 1) {
                    this.this$0.OLrzqt(this.$authType, this.$activity);
                }
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
