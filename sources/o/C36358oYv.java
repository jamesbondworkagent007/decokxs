package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oYv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36358oYv extends androidx.transition.TransitionSet {
    public static final TaskDescription Companion = new TaskDescription(null);

    public C36358oYv() {
        setOrdering(0);
        addTransition(new androidx.transition.ChangeBounds()).addTransition(new androidx.transition.ChangeTransform()).addTransition(new androidx.transition.ChangeImageTransform());
    }

    /* JADX INFO: renamed from: o.oYv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oYv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // androidx.transition.TransitionSet, androidx.transition.Transition
    public void captureStartValues(@NotNull androidx.transition.TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "");
        super.captureStartValues(transitionValues);
        pUU.KWHzl("KlineChartTransition", "captureStartValues: " + transitionValues);
    }

    @Override // androidx.transition.TransitionSet, androidx.transition.Transition
    public void captureEndValues(@NotNull androidx.transition.TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "");
        super.captureEndValues(transitionValues);
        pUU.KWHzl("KlineChartTransition", "captureEndValues: " + transitionValues);
    }
}
