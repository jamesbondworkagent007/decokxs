package com.okinc.auth.impl.mfa.ui.face;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C5818aDe;
import o.pUU;
import o.rTU;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaFaceFragment$initView$6 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5818aDe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaFaceFragment$initView$6(C5818aDe c5818aDe, Continuation<? super VerifyMfaFaceFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c5818aDe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaFaceFragment$initView$6 verifyMfaFaceFragment$initView$6 = new VerifyMfaFaceFragment$initView$6(this.this$0, continuation);
        verifyMfaFaceFragment$initView$6.L$0 = obj;
        return verifyMfaFaceFragment$initView$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((VerifyMfaFaceFragment$initView$6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl("MfaFaceRecognitionActivity", "Start Face Verify SDK: " + str);
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if (rtu != null) {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.AhwBna;
                Map mapEZpvd = null;
                if (this.this$0.AYXKKw().fIwbmz() != null) {
                    SubdomainStrategy subdomainStrategyFIwbmz = this.this$0.AYXKKw().fIwbmz();
                    String string = subdomainStrategyFIwbmz != null ? subdomainStrategyFIwbmz.toString() : null;
                    mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("Subdomain-Strategy", string != null ? string : ""));
                }
                rtu.AEQbTJ(fragmentActivityRequireActivity, str, activityResultLauncher, new FacialExtParams(mapEZpvd, "MFA FaceVerify"));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
