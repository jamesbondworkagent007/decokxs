package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class OAEPParameterSpec {
    public static final TaskDescription copydefault = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OAEPParameterSpec$Activity) A[MD:(o.OAEPParameterSpec$Activity):void (m)] call: o.OAEPParameterSpec.<init>(o.OAEPParameterSpec$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OAEPParameterSpec(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public OAEPParameterSpec(Activity activity) {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OAEPParameterSpec.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminRemoveUserFromGroupResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(OAEPParameterSpec.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OAEPParameterSpec.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Activity {
        public final Activity EZpvd() {
            return this;
        }

        public final OAEPParameterSpec OLrzqt() {
            return new OAEPParameterSpec(this, null);
        }
    }
}
