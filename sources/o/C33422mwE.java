package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.modeswitch.view.ViewConfiger$config$1$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33422mwE {
    public final java.lang.String EZpvd;
    public Job copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public C33422mwE(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public final <T> void KWHzl(@NotNull android.view.View view, @NotNull LifecycleOwner lifecycleOwner, @NotNull StateFlow<? extends T> stateFlow, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(stateFlow.getValue());
        if (ViewCompat.isAttachedToWindow(view)) {
            pUU.EZpvd(OLrzqt(), "attached");
            this.copydefault = C33367mvC.collectOnLifecycle$default(stateFlow, lifecycleOwner, null, new ViewConfiger$config$1$1(function1, null), 2, null);
            if (!ViewCompat.isAttachedToWindow(view)) {
                pUU.KWHzl(OLrzqt(), "detached");
                Job job = this.copydefault;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.copydefault = null;
                return;
            }
            view.addOnAttachStateChangeListener(new Activity(view, this));
            return;
        }
        view.addOnAttachStateChangeListener(new TaskDescription(view, this, stateFlow, lifecycleOwner, view, function1));
    }

    /* JADX INFO: renamed from: o.mwE$TaskDescription */
    public static final class TaskDescription implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ LifecycleOwner KWHzl;
        public final /* synthetic */ StateFlow OLrzqt;
        public final /* synthetic */ Function1 copydefault;
        public final /* synthetic */ C33422mwE gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(android.view.View view, C33422mwE c33422mwE, StateFlow stateFlow, LifecycleOwner lifecycleOwner, android.view.View view2, Function1 function1) {
            this.EZpvd = view;
            this.gEmmrt = c33422mwE;
            this.OLrzqt = stateFlow;
            this.KWHzl = lifecycleOwner;
            this.AEQbTJ = view2;
            this.copydefault = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            pUU.EZpvd(this.gEmmrt.OLrzqt(), "attached");
            this.gEmmrt.copydefault = C33367mvC.collectOnLifecycle$default(this.OLrzqt, this.KWHzl, null, new ViewConfiger$config$1$1(this.copydefault, null), 2, null);
            android.view.View view2 = this.AEQbTJ;
            if (!ViewCompat.isAttachedToWindow(view2)) {
                pUU.KWHzl(this.gEmmrt.OLrzqt(), "detached");
                Job job = this.gEmmrt.copydefault;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.gEmmrt.copydefault = null;
                return;
            }
            view2.addOnAttachStateChangeListener(new Activity(view2, this.gEmmrt));
        }
    }

    /* JADX INFO: renamed from: o.mwE$Activity */
    public static final class Activity implements View.OnAttachStateChangeListener {
        public final /* synthetic */ C33422mwE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(android.view.View view, C33422mwE c33422mwE) {
            this.KWHzl = view;
            this.EZpvd = c33422mwE;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            pUU.KWHzl(this.EZpvd.OLrzqt(), "detached");
            Job job = this.EZpvd.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.EZpvd.copydefault = null;
        }
    }
}
