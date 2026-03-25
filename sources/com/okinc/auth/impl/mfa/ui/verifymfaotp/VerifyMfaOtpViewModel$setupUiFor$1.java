package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import android.text.BidiFormatter;
import androidx.autofill.HintConstants;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.uilab.code.OKCodeInput;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33070mpX;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C5779aCs;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel$setupUiFor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OTP $otpType;
    int label;
    final /* synthetic */ VerifyMfaOtpViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OTP.values().length];
            try {
                iArr[OTP.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OTP.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OTP.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OTP.VOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OTP.AUTHENTICATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpViewModel$setupUiFor$1(VerifyMfaOtpViewModel verifyMfaOtpViewModel, OTP otp, Continuation<? super VerifyMfaOtpViewModel$setupUiFor$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaOtpViewModel;
        this.$otpType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpViewModel$setupUiFor$1(this.this$0, this.$otpType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpViewModel$setupUiFor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C5779aCs c5779aCs;
        String strAYXKKw;
        Pair pairOLrzqt;
        String strGEmmrt;
        Object value2;
        C5779aCs c5779aCs2;
        String strAYXKKw2;
        Pair pairOLrzqt2;
        BidiFormatter bidiFormatter;
        String strValueOf;
        Object value3;
        C5779aCs c5779aCs3;
        String strAYXKKw3;
        Pair pairOLrzqt3;
        BidiFormatter bidiFormatter2;
        String strValueOf2;
        Object value4;
        C5779aCs c5779aCs4;
        String strAYXKKw4;
        Pair pairOLrzqt4;
        BidiFormatter bidiFormatter3;
        String strValueOf3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(this.$otpType);
            int i2 = Application.copydefault[this.$otpType.ordinal()];
            if (i2 == 1) {
                MutableStateFlow mutableStateFlow = this.this$0.DbNXlk;
                VerifyMfaOtpViewModel verifyMfaOtpViewModel = this.this$0;
                do {
                    value = mutableStateFlow.getValue();
                    c5779aCs = (C5779aCs) value;
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.OqFWZa);
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(C8206ayP.Dialog.hUfVAv);
                    MfaResponse mfaResponse = (MfaResponse) verifyMfaOtpViewModel.gEmmrt.getValue();
                    String strGEmmrt2 = mfaResponse != null ? mfaResponse.gEmmrt() : null;
                    if (strGEmmrt2 == null) {
                        strGEmmrt2 = "";
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(numAEQbTJ, C56423yEv.EZpvd(C56390yDp.OLrzqt("email", strGEmmrt2)));
                    MfaResponse mfaResponse2 = (MfaResponse) verifyMfaOtpViewModel.gEmmrt.getValue();
                    strGEmmrt = mfaResponse2 != null ? mfaResponse2.gEmmrt() : null;
                } while (!mutableStateFlow.compareAndSet(value, C5779aCs.copy$default(c5779aCs, false, null, strAYXKKw, pairOLrzqt, strGEmmrt == null ? "" : strGEmmrt, true, "email", 3, null)));
            } else if (i2 == 2 || i2 == 3) {
                MutableStateFlow mutableStateFlow2 = this.this$0.DbNXlk;
                VerifyMfaOtpViewModel verifyMfaOtpViewModel2 = this.this$0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    c5779aCs2 = (C5779aCs) value2;
                    strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.DarRvM);
                    Integer numAEQbTJ2 = C56443yFo.AEQbTJ(C8206ayP.Dialog.AxsJAYaxsJAY);
                    BidiFormatter bidiFormatter4 = verifyMfaOtpViewModel2.isConnected;
                    MfaResponse mfaResponse3 = (MfaResponse) verifyMfaOtpViewModel2.gEmmrt.getValue();
                    String strValueOf4 = mfaResponse3 != null ? mfaResponse3.valueOf() : null;
                    if (strValueOf4 == null) {
                        strValueOf4 = "";
                    }
                    pairOLrzqt2 = C56390yDp.OLrzqt(numAEQbTJ2, C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_PHONE, bidiFormatter4.unicodeWrap(strValueOf4, true))));
                    bidiFormatter = verifyMfaOtpViewModel2.isConnected;
                    MfaResponse mfaResponse4 = (MfaResponse) verifyMfaOtpViewModel2.gEmmrt.getValue();
                    strValueOf = mfaResponse4 != null ? mfaResponse4.valueOf() : null;
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                } while (!mutableStateFlow2.compareAndSet(value2, C5779aCs.copy$default(c5779aCs2, false, null, strAYXKKw2, pairOLrzqt2, bidiFormatter.unicodeWrap(strValueOf, true), true, HintConstants.AUTOFILL_HINT_PHONE, 3, null)));
                MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
                OKCodeInput.AutofillType autofillType = OKCodeInput.AutofillType.SMS;
                this.label = 1;
                if (mutableSharedFlow.emit(autofillType, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i2 == 4) {
                MutableStateFlow mutableStateFlow3 = this.this$0.DbNXlk;
                VerifyMfaOtpViewModel verifyMfaOtpViewModel3 = this.this$0;
                do {
                    value3 = mutableStateFlow3.getValue();
                    c5779aCs3 = (C5779aCs) value3;
                    strAYXKKw3 = C33070mpX.AYXKKw(C8206ayP.Dialog.DarRvM);
                    Integer numAEQbTJ3 = C56443yFo.AEQbTJ(C8206ayP.Dialog.accept);
                    BidiFormatter bidiFormatter5 = verifyMfaOtpViewModel3.isConnected;
                    MfaResponse mfaResponse5 = (MfaResponse) verifyMfaOtpViewModel3.gEmmrt.getValue();
                    String strValueOf5 = mfaResponse5 != null ? mfaResponse5.valueOf() : null;
                    if (strValueOf5 == null) {
                        strValueOf5 = "";
                    }
                    pairOLrzqt3 = C56390yDp.OLrzqt(numAEQbTJ3, C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_PHONE, bidiFormatter5.unicodeWrap(strValueOf5, true))));
                    bidiFormatter2 = verifyMfaOtpViewModel3.isConnected;
                    MfaResponse mfaResponse6 = (MfaResponse) verifyMfaOtpViewModel3.gEmmrt.getValue();
                    strValueOf2 = mfaResponse6 != null ? mfaResponse6.valueOf() : null;
                    if (strValueOf2 == null) {
                        strValueOf2 = "";
                    }
                } while (!mutableStateFlow3.compareAndSet(value3, C5779aCs.copy$default(c5779aCs3, false, null, strAYXKKw3, pairOLrzqt3, bidiFormatter2.unicodeWrap(strValueOf2, true), true, HintConstants.AUTOFILL_HINT_PHONE, 3, null)));
                MutableSharedFlow mutableSharedFlow2 = this.this$0.AhwBna;
                OKCodeInput.AutofillType autofillType2 = OKCodeInput.AutofillType.SMS;
                this.label = 2;
                if (mutableSharedFlow2.emit(autofillType2, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.EZpvd.setValue(OTP.VOICE);
            } else if (i2 == 5) {
                MutableStateFlow mutableStateFlow4 = this.this$0.DbNXlk;
                VerifyMfaOtpViewModel verifyMfaOtpViewModel4 = this.this$0;
                do {
                    value4 = mutableStateFlow4.getValue();
                    c5779aCs4 = (C5779aCs) value4;
                    strAYXKKw4 = C33070mpX.AYXKKw(C8206ayP.Dialog.DXXBbs);
                    pairOLrzqt4 = C56390yDp.OLrzqt(C56443yFo.AEQbTJ(C8206ayP.Dialog.gkJEwt), C56424yEw.KWHzl());
                    bidiFormatter3 = verifyMfaOtpViewModel4.isConnected;
                    MfaResponse mfaResponse7 = (MfaResponse) verifyMfaOtpViewModel4.gEmmrt.getValue();
                    strValueOf3 = mfaResponse7 != null ? mfaResponse7.valueOf() : null;
                    if (strValueOf3 == null) {
                        strValueOf3 = "";
                    }
                } while (!mutableStateFlow4.compareAndSet(value4, C5779aCs.copy$default(c5779aCs4, false, null, strAYXKKw4, pairOLrzqt4, bidiFormatter3.unicodeWrap(strValueOf3, true), false, "authenticator", 3, null)));
                this.this$0.EZpvd.setValue(OTP.AUTHENTICATOR);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(OTP.VOICE);
        }
        return Unit.INSTANCE;
    }
}
