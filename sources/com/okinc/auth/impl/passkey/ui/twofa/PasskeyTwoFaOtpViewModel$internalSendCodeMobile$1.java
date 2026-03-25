package com.okinc.auth.impl.passkey.ui.twofa;

import android.os.CountDownTimer;
import com.okinc.auth.impl.passkey.model.AuthSendEmailOTPRequest;
import com.okinc.auth.impl.passkey.model.AuthSendSMSRequest;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C30367lVt;
import o.C33070mpX;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C5975aGc;
import o.C5976aGd;
import o.C8206ayP;
import o.InterfaceC47278tmy;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fido2VerificationOption $authType;
    final /* synthetic */ Map<String, String> $captchaVerification;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Fido2VerificationOption.values().length];
            try {
                iArr[Fido2VerificationOption.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fido2VerificationOption.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1(PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, Fido2VerificationOption fido2VerificationOption, Map<String, String> map, Continuation<? super PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyTwoFaOtpViewModel;
        this.$authType = fido2VerificationOption;
        this.$captchaVerification = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1(this.this$0, this.$authType, this.$captchaVerification, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$internalSendCodeMobile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0250 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objOLrzqt;
        Object objEZpvd;
        Result resultM7376boximpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        CountDownTimer countDownTimer;
        String str;
        MutableSharedFlow mutableSharedFlow2;
        String strKWHzl;
        UserInfo info;
        UserInfo info2;
        CountDownTimer countDownTimer2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                i = ActionBar.copydefault[this.$authType.ordinal()];
                if (i != 1) {
                    C5975aGc c5975aGc = this.this$0.AuCTel;
                    AuthSendEmailOTPRequest authSendEmailOTPRequest = new AuthSendEmailOTPRequest(C56443yFo.AEQbTJ(this.this$0.AEQbTJ), "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 32764, (DefaultConstructorMarker) null);
                    this.label = 2;
                    objOLrzqt = c5975aGc.OLrzqt(authSendEmailOTPRequest, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    resultM7376boximpl = Result.m7376boximpl(objOLrzqt);
                    mutableSharedFlow = this.this$0.KWHzl;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = resultM7376boximpl;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                    countDownTimer = this.this$0.isConnected;
                    if (countDownTimer != null) {
                    }
                    if (resultM7376boximpl == null) {
                    }
                    if (resultM7376boximpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    resultM7376boximpl = null;
                    mutableSharedFlow = this.this$0.KWHzl;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = resultM7376boximpl;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    countDownTimer = this.this$0.isConnected;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    if (resultM7376boximpl == null && Result.m7384isSuccessimpl(resultM7376boximpl.m7386unboximpl())) {
                        int i2 = ActionBar.copydefault[this.$authType.ordinal()];
                        if (i2 == 1) {
                            User userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
                            String toastEmail = (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null) ? null : info.getToastEmail();
                            strKWHzl = this.this$0.KWHzl(C8206ayP.Dialog.DQzvGNdrmXxudrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("maskedEmail", toastEmail != null ? toastEmail : "")));
                        } else if (i2 == 2) {
                            User userOLrzqt2 = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
                            String toastPhone = (userOLrzqt2 == null || (info2 = userOLrzqt2.getInfo()) == null) ? null : info2.getToastPhone();
                            str = toastPhone != null ? toastPhone : "";
                            PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel = this.this$0;
                            Integer num = (Integer) passkeyTwoFaOtpViewModel.OLrzqt.getValue();
                            strKWHzl = passkeyTwoFaOtpViewModel.KWHzl((num != null && num.intValue() == 0) ? C8206ayP.Dialog.DTeKQX : C8206ayP.Dialog.RbVjfb, C56423yEv.EZpvd(C56390yDp.OLrzqt("phonenumber", str)));
                        } else {
                            strKWHzl = C33070mpX.AYXKKw(C8206ayP.Dialog.RgLUBD);
                        }
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.fetchVPNInfo;
                        this.L$0 = null;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(strKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel2 = this.this$0;
                        passkeyTwoFaOtpViewModel2.isConnected = passkeyTwoFaOtpViewModel2.DbNXlk;
                        countDownTimer2 = this.this$0.isConnected;
                        if (countDownTimer2 != null) {
                            countDownTimer2.start();
                        }
                        return Unit.INSTANCE;
                    }
                    if (resultM7376boximpl != null && Result.m7383isFailureimpl(resultM7376boximpl.m7386unboximpl())) {
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(resultM7376boximpl.m7386unboximpl());
                        String message = thM7380exceptionOrNullimpl == null ? thM7380exceptionOrNullimpl.getMessage() : null;
                        str = message != null ? message : "";
                        mutableSharedFlow2 = this.this$0.fetchVPNInfo;
                        this.L$0 = null;
                        this.label = 6;
                        if (mutableSharedFlow2.emit(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C5976aGd c5976aGd = this.this$0.fIwbmz;
                int i3 = this.this$0.AEQbTJ;
                Integer num2 = (Integer) this.this$0.OLrzqt.getValue();
                Map<String, String> map = this.$captchaVerification;
                String strOLrzqt = map != null ? C30367lVt.OLrzqt(map) : null;
                String str2 = strOLrzqt == null ? "" : strOLrzqt;
                Map<String, String> map2 = this.$captchaVerification;
                String strCopydefault = map2 != null ? C30367lVt.copydefault(map2) : null;
                String str3 = strCopydefault == null ? "" : strCopydefault;
                Map<String, String> map3 = this.$captchaVerification;
                String strKWHzl2 = map3 != null ? C30367lVt.KWHzl(map3) : null;
                String str4 = strKWHzl2 == null ? "" : strKWHzl2;
                Map<String, String> map4 = this.$captchaVerification;
                String strEZpvd = map4 != null ? C30367lVt.EZpvd(map4) : null;
                AuthSendSMSRequest authSendSMSRequest = new AuthSendSMSRequest(str2, str3, str4, strEZpvd == null ? "" : strEZpvd, CaptchaScene.HIGH_RISK.getKey(), (String) null, C56443yFo.AEQbTJ(i3), "", "", num2, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 261152, (DefaultConstructorMarker) null);
                this.label = 3;
                objEZpvd = c5976aGd.EZpvd(authSendSMSRequest, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                resultM7376boximpl = Result.m7376boximpl(objEZpvd);
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = resultM7376boximpl;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                countDownTimer = this.this$0.isConnected;
                if (countDownTimer != null) {
                }
                if (resultM7376boximpl == null) {
                }
                if (resultM7376boximpl != null) {
                    Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(resultM7376boximpl.m7386unboximpl());
                    if (thM7380exceptionOrNullimpl2 == null) {
                    }
                    if (message != null) {
                    }
                    mutableSharedFlow2 = this.this$0.fetchVPNInfo;
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlow2.emit(str, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                i = ActionBar.copydefault[this.$authType.ordinal()];
                if (i != 1) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                resultM7376boximpl = Result.m7376boximpl(objOLrzqt);
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = resultM7376boximpl;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                countDownTimer = this.this$0.isConnected;
                if (countDownTimer != null) {
                }
                if (resultM7376boximpl == null) {
                }
                if (resultM7376boximpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                resultM7376boximpl = Result.m7376boximpl(objEZpvd);
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = resultM7376boximpl;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                countDownTimer = this.this$0.isConnected;
                if (countDownTimer != null) {
                }
                if (resultM7376boximpl == null) {
                }
                if (resultM7376boximpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                resultM7376boximpl = (Result) this.L$0;
                C56391yDq.AEQbTJ(obj);
                countDownTimer = this.this$0.isConnected;
                if (countDownTimer != null) {
                }
                if (resultM7376boximpl == null) {
                }
                if (resultM7376boximpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel22 = this.this$0;
                passkeyTwoFaOtpViewModel22.isConnected = passkeyTwoFaOtpViewModel22.DbNXlk;
                countDownTimer2 = this.this$0.isConnected;
                if (countDownTimer2 != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
