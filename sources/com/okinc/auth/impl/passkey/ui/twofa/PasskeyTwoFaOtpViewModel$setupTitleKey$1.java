package com.okinc.auth.impl.passkey.ui.twofa;

import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel$setupTitleKey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fido2VerificationOption $authType;
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Fido2VerificationOption.values().length];
            try {
                iArr[Fido2VerificationOption.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fido2VerificationOption.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$setupTitleKey$1(PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, Fido2VerificationOption fido2VerificationOption, Continuation<? super PasskeyTwoFaOtpViewModel$setupTitleKey$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyTwoFaOtpViewModel;
        this.$authType = fido2VerificationOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$setupTitleKey$1(this.this$0, this.$authType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$setupTitleKey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.djBIcL;
            int i2 = ActionBar.OLrzqt[this.$authType.ordinal()];
            if (i2 == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.reset);
            } else if (i2 == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RqmePg);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.zLAIeZ);
            }
            this.label = 1;
            if (mutableSharedFlow.emit(strAYXKKw, this) == objCopydefault) {
                return objCopydefault;
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
