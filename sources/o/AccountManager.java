package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountManager {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccountManager$Activity) A[MD:(o.AccountManager$Activity):void (m)] call: o.AccountManager.<init>(o.AccountManager$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccountManager(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public AccountManager(Activity activity) {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccountManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminUpdateUserAttributesResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(AccountManager.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountManager.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Activity {
        public final Activity KWHzl() {
            return this;
        }

        public final AccountManager OLrzqt() {
            return new AccountManager(this, null);
        }
    }
}
