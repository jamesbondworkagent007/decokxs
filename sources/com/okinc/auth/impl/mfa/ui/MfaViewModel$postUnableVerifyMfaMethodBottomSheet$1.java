package com.okinc.auth.impl.mfa.ui;

import com.okinc.auth.impl.mfa.model.OTP;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $selectedMethod;
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1(String str, MfaViewModel mfaViewModel, Continuation<? super MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1> continuation) {
        super(2, continuation);
        this.$selectedMethod = str;
        this.this$0 = mfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1(this.$selectedMethod, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [225=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                String str = this.$selectedMethod;
                switch (str.hashCode()) {
                    case -1474005237:
                        if (str.equals("RESULT_VALUE_FACE_VERIFY")) {
                            MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
                            OTP otp = OTP.FACE_VERIFY;
                            this.label = 7;
                            if (mutableSharedFlow.emit(otp, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.FACE_VERIFY.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case -947729302:
                        if (str.equals("RESULT_VALUE_GA")) {
                            MutableSharedFlow mutableSharedFlow2 = this.this$0.AhwBna;
                            OTP otp2 = OTP.AUTHENTICATOR;
                            this.label = 4;
                            if (mutableSharedFlow2.emit(otp2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.AUTHENTICATOR.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case 685174697:
                        if (str.equals("RESULT_VALUE_SMS")) {
                            MutableSharedFlow mutableSharedFlow3 = this.this$0.AhwBna;
                            OTP otp3 = OTP.SMS;
                            this.label = 1;
                            if (mutableSharedFlow3.emit(otp3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.SMS.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case 903184939:
                        if (str.equals("RESULT_VALUE_PASSWORD")) {
                            MutableSharedFlow mutableSharedFlow4 = this.this$0.AhwBna;
                            OTP otp4 = OTP.PASSWORD;
                            this.label = 6;
                            if (mutableSharedFlow4.emit(otp4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.PASSWORD.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case 1032294382:
                        if (str.equals("RESULT_VALUE_RESET_PASSKEY")) {
                            this.this$0.wlaJM();
                            this.this$0.OLrzqt("", false, true);
                        }
                        return Unit.INSTANCE;
                    case 1038199456:
                        if (str.equals("RESULT_VALUE_UNAVAILABLE")) {
                            this.this$0.iwGUEr();
                            this.this$0.OLrzqt("", true, false);
                        }
                        return Unit.INSTANCE;
                    case 1276049150:
                        if (str.equals("RESULT_VALUE_PASSKEY")) {
                            MutableSharedFlow mutableSharedFlow5 = this.this$0.AhwBna;
                            OTP otp5 = OTP.PASSKEY;
                            this.label = 5;
                            if (mutableSharedFlow5.emit(otp5, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.PASSKEY.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case 1309943276:
                        if (str.equals("RESULT_VALUE_EMAIL")) {
                            MutableSharedFlow mutableSharedFlow6 = this.this$0.AhwBna;
                            OTP otp6 = OTP.EMAIL;
                            this.label = 3;
                            if (mutableSharedFlow6.emit(otp6, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.EMAIL.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    case 1325710210:
                        if (str.equals("RESULT_VALUE_VOICE")) {
                            MutableSharedFlow mutableSharedFlow7 = this.this$0.AhwBna;
                            OTP otp7 = OTP.VOICE;
                            this.label = 2;
                            if (mutableSharedFlow7.emit(otp7, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.VOICE.getKey()), false, false);
                        }
                        return Unit.INSTANCE;
                    default:
                        return Unit.INSTANCE;
                }
            case 1:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.SMS.getKey()), false, false);
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.VOICE.getKey()), false, false);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.EMAIL.getKey()), false, false);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.AUTHENTICATOR.getKey()), false, false);
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.PASSKEY.getKey()), false, false);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.PASSWORD.getKey()), false, false);
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(C33129mqd.gEmmrt(OTP.FACE_VERIFY.getKey()), false, false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
