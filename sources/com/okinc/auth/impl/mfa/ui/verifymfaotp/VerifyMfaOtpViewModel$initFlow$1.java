package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import com.okinc.auth.impl.mfa.model.MfaNextStep;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel$initFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaResponse $mfaResponse;
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ VerifyMfaOtpViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaNextStep.values().length];
            try {
                iArr[MfaNextStep.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaNextStep.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaNextStep.AUTHENTICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpViewModel$initFlow$1(VerifyMfaOtpViewModel verifyMfaOtpViewModel, String str, MfaResponse mfaResponse, MfaScenario mfaScenario, SubdomainStrategy subdomainStrategy, Continuation<? super VerifyMfaOtpViewModel$initFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaOtpViewModel;
        this.$sessionId = str;
        this.$mfaResponse = mfaResponse;
        this.$mfaScenario = mfaScenario;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpViewModel$initFlow$1(this.this$0, this.$sessionId, this.$mfaResponse, this.$mfaScenario, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpViewModel$initFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.valueOf.setValue(this.$sessionId);
            this.this$0.gEmmrt.setValue(this.$mfaResponse);
            this.this$0.OLrzqt.setValue(this.$mfaScenario);
            this.this$0.djBIcL.setValue(this.$subdomainStrategy);
            MfaNextStep.ActionBar actionBar = MfaNextStep.Companion;
            MfaResponse mfaResponse = (MfaResponse) this.this$0.gEmmrt.getValue();
            String strDjBIcL = mfaResponse != null ? mfaResponse.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            int i = Activity.OLrzqt[actionBar.KWHzl(strDjBIcL).ordinal()];
            if (i == 1) {
                VerifyMfaOtpViewModel verifyMfaOtpViewModel = this.this$0;
                OTP otp = OTP.EMAIL;
                verifyMfaOtpViewModel.AEQbTJ(otp);
                this.this$0.OLrzqt(otp);
            } else if (i == 2) {
                VerifyMfaOtpViewModel verifyMfaOtpViewModel2 = this.this$0;
                OTP otp2 = OTP.SMS;
                verifyMfaOtpViewModel2.AEQbTJ(otp2);
                this.this$0.OLrzqt(otp2);
            } else if (i != 3) {
                MfaResponse mfaResponse2 = (MfaResponse) this.this$0.gEmmrt.getValue();
                pUU.copydefault("Unknown next step " + (mfaResponse2 != null ? mfaResponse2.djBIcL() : null));
                Unit unit = Unit.INSTANCE;
            } else {
                this.this$0.AEQbTJ(OTP.AUTHENTICATOR);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
