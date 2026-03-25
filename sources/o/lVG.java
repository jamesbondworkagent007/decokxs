package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.recaptcha.RecaptchaFragment;
import com.okinc.captcha.impl.recaptcha.RecaptchaUserCancelException;
import com.okinc.captcha.impl.recaptcha.RecaptchaVerificationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lVG {
    public final Function0<Unit> AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final FragmentActivity copydefault;
    public final java.lang.String valueOf;

    public lVG(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = fragmentActivity;
        this.OLrzqt = str;
        this.KWHzl = z;
        this.valueOf = str2;
        this.EZpvd = z2;
        this.AEQbTJ = function0;
    }

    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new RecaptchaVerificationException())));
            }
        }
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new RecaptchaUserCancelException())));
            }
        }
    }

    public static final class StateListAnimator implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
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
            if (this.KWHzl.isActive()) {
                java.util.Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str));
                CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.KWHzl;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(mapEZpvd));
            }
        }
    }

    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ lVG EZpvd;
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation, lVG lvg) {
            this.OLrzqt = cancellableContinuation;
            this.EZpvd = lvg;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            if (this.OLrzqt.isActive()) {
                this.EZpvd.AEQbTJ.invoke();
            }
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RecaptchaFragment.Companion.EZpvd(this.copydefault, this.OLrzqt, this.KWHzl, this.valueOf, this.EZpvd, new StateListAnimator(cancellableContinuationImpl), new ActionBar(cancellableContinuationImpl), new Activity(cancellableContinuationImpl), new TaskDescription(cancellableContinuationImpl, this));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
