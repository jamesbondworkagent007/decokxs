package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.no, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35053no {
    public static final TaskDescription KWHzl = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.no$StateListAnimator) A[MD:(o.no$StateListAnimator):void (m)] call: o.no.<init>(o.no$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35053no(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    public C35053no(StateListAnimator stateListAnimator) {
    }

    /* JADX INFO: renamed from: o.no$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.no.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteAdapterResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C35053no.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35053no.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.no$StateListAnimator */
    public static final class StateListAnimator {
        public final StateListAnimator copydefault() {
            return this;
        }

        public final C35053no KWHzl() {
            return new C35053no(this, null);
        }
    }
}
