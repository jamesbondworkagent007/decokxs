package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20068gZs {

    /* JADX INFO: renamed from: o.gZs$TaskDescription */
    public static final class TaskDescription implements InterfaceC20068gZs {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1566216988;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.gZs$Activity */
    public static final class Activity implements InterfaceC20068gZs {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1153614552;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.gZs$Application */
    public static final class Application implements InterfaceC20068gZs {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.KWHzl;
            }
            return application.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(boolean z) {
            return new Application(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.KWHzl == ((Application) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(isInvalidJwt=" + this.KWHzl + ")";
        }

        public Application(boolean z) {
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.gZs$Fragment */
    public static final class Fragment implements InterfaceC20068gZs {
        public static final Fragment KWHzl = new Fragment();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -497971098;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResetLoadMore";
        }

        private Fragment() {
        }
    }

    /* JADX INFO: renamed from: o.gZs$ActionBar */
    public static final class ActionBar implements InterfaceC20068gZs {
        public final boolean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(boolean z) {
            return new ActionBar(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.AEQbTJ == ((ActionBar) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(chainSupported=" + this.AEQbTJ + ")";
        }

        public ActionBar(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:8) call: o.gZs.ActionBar.<init>(boolean):void type: THIS */
        public /* synthetic */ ActionBar(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* JADX INFO: renamed from: o.gZs$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC20068gZs {
        public final java.util.List<java.lang.Object> AEQbTJ;
        public final C20069gZt EZpvd;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gZs$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, C20069gZt c20069gZt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                c20069gZt = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(list, z, c20069gZt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list, boolean z, @NotNull C20069gZt c20069gZt) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c20069gZt, "");
            return new StateListAnimator(list, z, c20069gZt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Object> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C20069gZt copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(list=" + this.AEQbTJ + ", hasMore=" + this.copydefault + ", rightActionGroup=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.util.List<? extends java.lang.Object> list, boolean z, @NotNull C20069gZt c20069gZt) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c20069gZt, "");
            this.AEQbTJ = list;
            this.copydefault = z;
            this.EZpvd = c20069gZt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 java.util.List)
  (r9v0 boolean)
  (wrap:o.gZt:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.gZt:0x000e: CONSTRUCTOR 
  (null java.util.List)
  (null java.util.List)
  false
  (null o.gQl)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.util.List, java.util.List, boolean, o.gQl, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: o.gZt.<init>(java.util.List, java.util.List, boolean, o.gQl, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 o.gZt))
 A[MD:(java.util.List<? extends java.lang.Object>, boolean, o.gZt):void (m)] (LINE:10) call: o.gZs.StateListAnimator.<init>(java.util.List, boolean, o.gZt):void type: THIS */
        public /* synthetic */ StateListAnimator(java.util.List list, boolean z, C20069gZt c20069gZt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? new C20069gZt(null, null, false, null, 15, null) : c20069gZt);
        }
    }
}
