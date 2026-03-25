package com.reown.android.internal.common.connection;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.reown.foundation.network.ConnectionLifecycle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C58071yuP;
import o.InterfaceC58028ytZ;
import o.InterfaceC60097zve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DefaultConnectionLifecycle implements InterfaceC58028ytZ, ConnectionLifecycle {
    public final MutableStateFlow<Boolean> _onResume;
    public final CompletableJob job;
    public final C58071yuP lifecycleRegistry;
    public final StateFlow<Boolean> onResume;
    public CoroutineScope scope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC58028ytZ combineWith(@NotNull InterfaceC58028ytZ... interfaceC58028ytZArr) {
        Intrinsics.checkNotNullParameter(interfaceC58028ytZArr, "");
        return this.lifecycleRegistry.AEQbTJ(interfaceC58028ytZArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.network.ConnectionLifecycle
    public StateFlow<Boolean> getOnResume() {
        return this.onResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.lifecycleRegistry.subscribe(interfaceC60097zve);
    }

    public DefaultConnectionLifecycle(@NotNull Application application, @NotNull C58071yuP c58071yuP) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c58071yuP, "");
        this.lifecycleRegistry = c58071yuP;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.job = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getDefault()));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._onResume = MutableStateFlow;
        this.onResume = FlowKt.asStateFlow(MutableStateFlow);
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r3v0 android.app.Application)
  (wrap:o.yuP:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yuP:0x000a: CONSTRUCTOR (0 long), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:25) call: o.yuP.<init>(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 o.yuP))
 A[MD:(android.app.Application, o.yuP):void (m)] (LINE:23) call: com.reown.android.internal.common.connection.DefaultConnectionLifecycle.<init>(android.app.Application, o.yuP):void type: THIS */
    public /* synthetic */ DefaultConnectionLifecycle(Application application, C58071yuP c58071yuP, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i & 2) != 0 ? new C58071yuP(0L, 1, null) : c58071yuP);
    }

    @Override // com.reown.foundation.network.ConnectionLifecycle
    public void reconnect() {
        this.lifecycleRegistry.onNext(new InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator(null, 1, null));
        this.lifecycleRegistry.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
    }

    public final class ActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public boolean isResumed;
        public Job job;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Job getJob() {
            return this.job;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isResumed() {
            return this.isResumed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setJob(Job job) {
            this.job = job;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setResumed(boolean z) {
            this.isResumed = z;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActivityLifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.isResumed = false;
            this.job = BuildersKt__Builders_commonKt.launch$default(DefaultConnectionLifecycle.this.scope, null, null, new DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityPaused$1(this, DefaultConnectionLifecycle.this, null), 3, null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.isResumed = true;
            Job job = this.job;
            if (job != null && job.isActive()) {
                Job job2 = this.job;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.job = null;
            }
            BuildersKt__Builders_commonKt.launch$default(DefaultConnectionLifecycle.this.scope, null, null, new DefaultConnectionLifecycle$ActivityLifecycleCallbacks$onActivityResumed$1(DefaultConnectionLifecycle.this, null), 3, null);
        }
    }
}
