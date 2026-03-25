package com.okinc.auth.impl.passkey.ui.twofa;

import androidx.fragment.app.FragmentActivity;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC30369lVv;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.lWe;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel$clickSend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Fido2VerificationOption $authType;
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$clickSend$1(Fido2VerificationOption fido2VerificationOption, PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, FragmentActivity fragmentActivity, Continuation<? super PasskeyTwoFaOtpViewModel$clickSend$1> continuation) {
        super(2, continuation);
        this.$authType = fido2VerificationOption;
        this.this$0 = passkeyTwoFaOtpViewModel;
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$clickSend$1(this.$authType, this.this$0, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$clickSend$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpViewModel$clickSend$1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:53)|(1:(1:(1:(4:7|47|49|50)(2:8|9))(4:10|30|49|50))(2:11|12))(2:13|(1:(2:16|17)(6:18|19|51|20|21|(1:23)))(3:48|49|50))|54|24|(6:26|27|(1:29)|30|49|50)(2:33|(3:35|49|50)(2:36|37))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        int i;
        Object objStartCaptcha$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        PasskeyTwoFaOtpViewModel$clickSend$1 passkeyTwoFaOtpViewModel$clickSend$1 = 2;
        try {
            try {
            } catch (Exception e) {
                e = e;
                obj2 = objCopydefault;
                passkeyTwoFaOtpViewModel$clickSend$1 = this;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int i3 = Application.EZpvd[this.$authType.ordinal()];
            if (i3 == 1) {
                this.this$0.OLrzqt(this.$authType, (Map<String, String>) null);
                return Unit.INSTANCE;
            }
            if (i3 == 2) {
                lWe lwe = (lWe) C43251rlk.copydefault(lWe.class);
                FragmentActivity fragmentActivity = this.$activity;
                CaptchaScene captchaScene = CaptchaScene.HIGH_RISK;
                CaptchaVendor captchaVendor = CaptchaVendor.GEETEST;
                this.label = 1;
                i = 2;
                try {
                    objStartCaptcha$default = lWe.StateListAnimator.startCaptcha$default(lwe, fragmentActivity, captchaScene, "passkey2fa", captchaVendor, null, null, null, null, null, null, false, null, null, this, 8176, null);
                    obj2 = objCopydefault;
                    if (objStartCaptcha$default == obj2) {
                        return obj2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    passkeyTwoFaOtpViewModel$clickSend$1 = this;
                    obj2 = objCopydefault;
                    MutableSharedFlow mutableSharedFlow = passkeyTwoFaOtpViewModel$clickSend$1.this$0.fetchVPNInfo;
                    String strGEmmrt = C33129mqd.gEmmrt(e.getMessage());
                    passkeyTwoFaOtpViewModel$clickSend$1.label = 3;
                    if (mutableSharedFlow.emit(strGEmmrt, passkeyTwoFaOtpViewModel$clickSend$1) == obj2) {
                        return obj2;
                    }
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    Unit unit2 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Unit unit3 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objStartCaptcha$default = obj;
            i = 2;
            obj2 = objCopydefault;
        }
        AbstractC30369lVv abstractC30369lVv = (AbstractC30369lVv) objStartCaptcha$default;
        if (abstractC30369lVv instanceof AbstractC30369lVv.TaskDescription) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.fetchVPNInfo;
            String strGEmmrt2 = C33129mqd.gEmmrt(((AbstractC30369lVv.TaskDescription) abstractC30369lVv).EZpvd());
            this.label = i;
            if (mutableSharedFlow2.emit(strGEmmrt2, this) == obj2) {
                return obj2;
            }
            Unit unit22 = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
        if (!(abstractC30369lVv instanceof AbstractC30369lVv.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.OLrzqt(this.$authType, (Map<String, String>) ((AbstractC30369lVv.Activity) abstractC30369lVv).AEQbTJ());
        return Unit.INSTANCE;
    }
}
