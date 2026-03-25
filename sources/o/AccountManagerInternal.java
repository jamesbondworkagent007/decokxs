package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountManagerInternal {
    public static final TaskDescription KWHzl = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccountManagerInternal$Application) A[MD:(o.AccountManagerInternal$Application):void (m)] call: o.AccountManagerInternal.<init>(o.AccountManagerInternal$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccountManagerInternal(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public AccountManagerInternal(Application application) {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccountManagerInternal.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminUserGlobalSignOutResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(AccountManagerInternal.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountManagerInternal.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application copydefault() {
            return this;
        }

        public final AccountManagerInternal OLrzqt() {
            return new AccountManagerInternal(this, null);
        }
    }
}
