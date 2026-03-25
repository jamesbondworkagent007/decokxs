package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UiAutomationConnection {
    public static final TaskDescription OLrzqt = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UiAutomationConnection$StateListAnimator) A[MD:(o.UiAutomationConnection$StateListAnimator):void (m)] call: o.UiAutomationConnection.<init>(o.UiAutomationConnection$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UiAutomationConnection(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    public UiAutomationConnection(StateListAnimator stateListAnimator) {
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UiAutomationConnection.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "SetUserMfaPreferenceResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(UiAutomationConnection.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UiAutomationConnection.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator {
        public final StateListAnimator EZpvd() {
            return this;
        }

        public final UiAutomationConnection copydefault() {
            return new UiAutomationConnection(this, null);
        }
    }
}
