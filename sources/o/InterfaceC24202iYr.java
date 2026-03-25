package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC24202iYr {

    /* JADX INFO: renamed from: o.iYr$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC24202iYr {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.iYr$ActionBar */
    public static final class ActionBar implements InterfaceC24202iYr {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.iYr$TaskDescription */
    public static final class TaskDescription implements InterfaceC24202iYr {
        public final C27364jtm EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C27364jtm c27364jtm, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c27364jtm = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                z = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(c27364jtm, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull C27364jtm c27364jtm, boolean z) {
            Intrinsics.checkNotNullParameter(c27364jtm, "");
            return new TaskDescription(c27364jtm, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C27364jtm KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserDashboard(data=" + this.EZpvd + ", shouldShowTabArrow=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull C27364jtm c27364jtm, boolean z) {
            Intrinsics.checkNotNullParameter(c27364jtm, "");
            this.EZpvd = c27364jtm;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.iYr$Fragment */
    public static final class Fragment implements InterfaceC24202iYr {
        public final java.util.List<InterfaceC27436jvE> EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iYr$Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = fragment.EZpvd;
            }
            if ((i & 2) != 0) {
                z = fragment.KWHzl;
            }
            return fragment.copydefault(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InterfaceC27436jvE> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(@NotNull java.util.List<? extends InterfaceC27436jvE> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Fragment(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd) && this.KWHzl == fragment.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserTokenDashboard(data=" + this.EZpvd + ", shouldShowTabArrow=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.jvE> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(@NotNull java.util.List<? extends InterfaceC27436jvE> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.iYr$LoaderManager */
    public static final class LoaderManager implements InterfaceC24202iYr {
        public final iYC AEQbTJ;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, iYC iyc, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                iyc = loaderManager.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = loaderManager.copydefault;
            }
            return loaderManager.KWHzl(iyc, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager KWHzl(@NotNull iYC iyc, boolean z) {
            Intrinsics.checkNotNullParameter(iyc, "");
            return new LoaderManager(iyc, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final iYC copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, loaderManager.AEQbTJ) && this.copydefault == loaderManager.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserRecommendDashboard(data=" + this.AEQbTJ + ", shouldShowTabArrow=" + this.copydefault + ")";
        }

        public LoaderManager(@NotNull iYC iyc, boolean z) {
            Intrinsics.checkNotNullParameter(iyc, "");
            this.AEQbTJ = iyc;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.iYC)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(o.iYC, boolean):void (m)] (LINE:25) call: o.iYr.LoaderManager.<init>(o.iYC, boolean):void type: THIS */
        public /* synthetic */ LoaderManager(iYC iyc, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(iyc, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.iYr$Activity */
    public static final class Activity implements InterfaceC24202iYr {
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.copydefault;
            }
            return activity.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(boolean z) {
            return new Activity(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.copydefault == ((Activity) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GuestMode(guestMode=" + this.copydefault + ")";
        }

        public Activity(boolean z) {
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.iYr$Application */
    public static final class Application implements InterfaceC24202iYr {
        public final boolean KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.KWHzl;
            }
            if ((i & 2) != 0) {
                z2 = application.copydefault;
            }
            return application.AEQbTJ(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(boolean z, boolean z2) {
            return new Application(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.KWHzl == application.KWHzl && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(isEmpty=" + this.KWHzl + ", shouldShowTabArrow=" + this.copydefault + ")";
        }

        public Application(boolean z, boolean z2) {
            this.KWHzl = z;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:32) call: o.iYr.Application.<init>(boolean, boolean):void type: THIS */
        public /* synthetic */ Application(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z2);
        }
    }
}
