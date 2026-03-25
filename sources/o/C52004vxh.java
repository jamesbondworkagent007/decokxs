package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52004vxh extends uLN<StateListAnimator> {
    public final void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!Intrinsics.EZpvd(activity, Activity.TaskDescription.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        EZpvd(StateListAnimator.ActionBar.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.vxh$Activity */
    public interface Activity {

        /* JADX INFO: renamed from: o.vxh$Activity$TaskDescription */
        public static final class TaskDescription implements Activity {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
            }
        }
    }

    /* JADX INFO: renamed from: o.vxh$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.vxh$StateListAnimator$ActionBar */
        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
            }
        }
    }
}
