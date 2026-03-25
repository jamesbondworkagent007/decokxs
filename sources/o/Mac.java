package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class Mac {
    public static final TaskDescription OLrzqt = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Mac$Activity) A[MD:(o.Mac$Activity):void (m)] call: o.Mac.<init>(o.Mac$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Mac(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public Mac(Activity activity) {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Mac.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminDisableUserResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(Mac.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mac.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Activity {
        public final Activity EZpvd() {
            return this;
        }

        public final Mac OLrzqt() {
            return new Mac(this, null);
        }
    }
}
