package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nTH {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTH.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ nTH(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private nTH() {
    }

    public static final class Fragment extends nTH {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = fragment.OLrzqt;
            }
            return fragment.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Fragment(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fragment.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragment.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PaymentRequired(sign=" + this.KWHzl + ", amount=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
        }
    }

    public static final class TaskDescription extends nTH {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Dialog extends nTH {
        public static final Dialog OLrzqt = new Dialog();

        private Dialog() {
            super(null);
        }
    }

    public static final class LoaderManager extends nTH {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    public static final class PendingIntent extends nTH {
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(boolean z) {
            return new PendingIntent(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && this.EZpvd == ((PendingIntent) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "VerifyAssets(approvalRequired=" + this.EZpvd + ")";
        }

        public PendingIntent(boolean z) {
            super(null);
            this.EZpvd = z;
        }
    }

    public static final class StateListAnimator extends nTH {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class ActionBar extends nTH {
        public final nTF AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, nTF ntf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ntf = actionBar.AEQbTJ;
            }
            return actionBar.OLrzqt(ntf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nTF OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull nTF ntf) {
            Intrinsics.checkNotNullParameter(ntf, "");
            return new ActionBar(ntf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApprovalRequired(approvalFormData=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull nTF ntf) {
            super(null);
            Intrinsics.checkNotNullParameter(ntf, "");
            this.AEQbTJ = ntf;
        }
    }

    public static final class Activity extends nTH {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends nTH {
        public static final Application copydefault = new Application();

        private Application() {
            super(null);
        }
    }
}
