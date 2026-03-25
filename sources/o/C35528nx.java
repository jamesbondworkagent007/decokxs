package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35528nx {
    public static final TaskDescription KWHzl = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nx$Activity) A[MD:(o.nx$Activity):void (m)] call: o.nx.<init>(o.nx$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35528nx(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public C35528nx(Activity activity) {
    }

    /* JADX INFO: renamed from: o.nx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteAdapterVersionResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C35528nx.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35528nx.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.nx$Activity */
    public static final class Activity {
        public final Activity copydefault() {
            return this;
        }

        public final C35528nx KWHzl() {
            return new C35528nx(this, null);
        }
    }
}
