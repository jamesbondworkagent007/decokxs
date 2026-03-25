package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupObserver {
    public static final Application copydefault = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupObserver$TaskDescription) A[MD:(o.BackupObserver$TaskDescription):void (m)] call: o.BackupObserver.<init>(o.BackupObserver$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupObserver(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    public BackupObserver(TaskDescription taskDescription) {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupObserver.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "UpdateUserPoolResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(BackupObserver.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BackupObserver.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class TaskDescription {
        public final TaskDescription KWHzl() {
            return this;
        }

        public final BackupObserver OLrzqt() {
            return new BackupObserver(this, null);
        }
    }
}
