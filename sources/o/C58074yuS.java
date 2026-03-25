package o;

import android.app.Application;
import com.tinder.scarlet.lifecycle.android.ApplicationResumedLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58074yuS implements InterfaceC58028ytZ {
    public final C58071yuP AEQbTJ;
    public CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.AEQbTJ.subscribe(interfaceC60097zve);
    }

    /* JADX INFO: renamed from: o.yuS$Activity */
    public final class Activity implements Application.ActivityLifecycleCallbacks {
        public boolean KWHzl;
        public Job OLrzqt;
        public final /* synthetic */ C58074yuS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(Job job) {
            this.OLrzqt = job;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = false;
            this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(this.copydefault.copydefault, null, null, new ApplicationResumedLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1(this, this.copydefault, null), 3, null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = true;
            Job job = this.OLrzqt;
            if (job != null && job.isActive()) {
                Job job2 = this.OLrzqt;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.OLrzqt = null;
            }
            this.copydefault.AEQbTJ.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
        }
    }
}
