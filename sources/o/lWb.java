package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.tencent.TencentCaptchaFragment;
import com.okinc.captcha.impl.tencent.TencentCaptchaUserCancelException;
import com.okinc.captcha.impl.tencent.TencentCaptchaVerificationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class lWb {
    public final Function0<Unit> AEQbTJ;
    public final java.lang.String EZpvd;
    public final FragmentActivity KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    public lWb(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = fragmentActivity;
        this.EZpvd = str;
        this.copydefault = str2;
        this.OLrzqt = z;
        this.AEQbTJ = function0;
    }

    public static final class ActionBar implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.AEQbTJ.isActive()) {
                JSONObject jSONObject = new JSONObject(str);
                java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("ticket", jSONObject.optString("ticket")), C56390yDp.OLrzqt("randstr", jSONObject.optString("randstr")));
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.AEQbTJ;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(mapGEmmrt));
            }
        }
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            if (this.KWHzl.isActive()) {
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.KWHzl;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new TencentCaptchaUserCancelException())));
            }
        }
    }

    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> OLrzqt;
        public final /* synthetic */ lWb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation, lWb lwb) {
            this.OLrzqt = cancellableContinuation;
            this.copydefault = lwb;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            if (this.OLrzqt.isActive()) {
                this.copydefault.AEQbTJ.invoke();
            }
        }
    }

    public static final class TaskDescription implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.OLrzqt.isActive()) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("errorCode");
                java.lang.String strOptString = jSONObject.optString("errorMessage");
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.OLrzqt;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault((java.lang.Object) strOptString);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new TencentCaptchaVerificationException(java.lang.String.valueOf(iOptInt), strOptString))));
            }
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        TencentCaptchaFragment.Companion.OLrzqt(this.KWHzl, this.EZpvd, this.copydefault, this.OLrzqt, new ActionBar(cancellableContinuationImpl), new TaskDescription(cancellableContinuationImpl), new Activity(cancellableContinuationImpl), new StateListAnimator(cancellableContinuationImpl, this));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
