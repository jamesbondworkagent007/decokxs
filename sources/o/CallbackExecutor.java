package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CallbackExecutor {
    public static final Activity AEQbTJ = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CallbackExecutor$TaskDescription) A[MD:(o.CallbackExecutor$TaskDescription):void (m)] call: o.CallbackExecutor.<init>(o.CallbackExecutor$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CallbackExecutor(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    public CallbackExecutor(TaskDescription taskDescription) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CallbackExecutor.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteUserAttributesResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(CallbackExecutor.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CallbackExecutor.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class TaskDescription {
        public final TaskDescription OLrzqt() {
            return this;
        }

        public final CallbackExecutor KWHzl() {
            return new CallbackExecutor(this, null);
        }
    }
}
