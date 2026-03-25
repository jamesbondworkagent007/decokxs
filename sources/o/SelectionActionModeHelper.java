package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class SelectionActionModeHelper {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SelectionActionModeHelper$TaskDescription) A[MD:(o.SelectionActionModeHelper$TaskDescription):void (m)] call: o.SelectionActionModeHelper.<init>(o.SelectionActionModeHelper$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SelectionActionModeHelper(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    public SelectionActionModeHelper(TaskDescription taskDescription) {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SelectionActionModeHelper.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DistributeDatasetEntriesResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(SelectionActionModeHelper.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectionActionModeHelper.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class TaskDescription {
        public final TaskDescription copydefault() {
            return this;
        }

        public final SelectionActionModeHelper EZpvd() {
            return new SelectionActionModeHelper(this, null);
        }
    }
}
