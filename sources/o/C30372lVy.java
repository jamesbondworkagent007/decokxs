package o;

import com.geetest.deepknow.DPAPI;
import com.geetest.deepknow.DPListener;
import com.okinc.captcha.impl.geetest.GeetestCaptchaDeepknowException;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.lVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30372lVy {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final android.app.Activity KWHzl;
    public final DPAPI copydefault;

    public C30372lVy(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
        DPAPI dpapi = DPAPI.getInstance(activity, "f8553adb1e94368c52b9617f669a0227");
        Intrinsics.checkNotNullExpressionValue(dpapi, "");
        this.copydefault = dpapi;
    }

    /* JADX INFO: renamed from: o.lVy$StateListAnimator */
    public static final class StateListAnimator implements DPListener {
        public final /* synthetic */ CancellableContinuation<java.lang.String> AEQbTJ;

        @Override // com.geetest.deepknow.DPListener
        public void onSessionStatus(boolean z) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.lang.String> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        @Override // com.geetest.deepknow.DPListener
        public void onSessionResult(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            if (this.AEQbTJ.isActive()) {
                try {
                    int iOptInt = jSONObject.optInt("status");
                    if (iOptInt == 1) {
                        java.lang.String strOptString = jSONObject.optString(OtcExtraKeys.PARAMS_SESSION_ID);
                        CancellableContinuation<java.lang.String> cancellableContinuation = this.AEQbTJ;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(strOptString));
                    } else {
                        java.lang.String strOptString2 = jSONObject.optString("message");
                        CancellableContinuation<java.lang.String> cancellableContinuation2 = this.AEQbTJ;
                        Result.Application application2 = Result.Companion;
                        Intrinsics.copydefault((java.lang.Object) strOptString2);
                        cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new GeetestCaptchaDeepknowException(java.lang.String.valueOf(iOptInt), strOptString2))));
                    }
                } catch (java.lang.Exception e) {
                    CancellableContinuation<java.lang.String> cancellableContinuation3 = this.AEQbTJ;
                    Result.Application application3 = Result.Companion;
                    cancellableContinuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lVy$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lVy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.copydefault.getSessionStatus(new StateListAnimator(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
