package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28209kSy {

    /* JADX INFO: renamed from: o.kSy$Application */
    public static final class Application implements InterfaceC28209kSy {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 50759767;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kSy$ActionBar */
    public static final class ActionBar implements InterfaceC28209kSy {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2141906718;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success";
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kSy$TaskDescription */
    public static final class TaskDescription implements InterfaceC28209kSy {
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(boolean z) {
            return new TaskDescription(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.copydefault == ((TaskDescription) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LoadData(forceRefresh=" + this.copydefault + ")";
        }

        public TaskDescription(boolean z) {
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.kSy$Activity */
    public static final class Activity implements InterfaceC28209kSy {
        public final InterfaceC30595leC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC30595leC interfaceC30595leC, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC30595leC = activity.EZpvd;
            }
            return activity.copydefault(interfaceC30595leC);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC30595leC OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(InterfaceC30595leC interfaceC30595leC) {
            return new Activity(interfaceC30595leC);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            InterfaceC30595leC interfaceC30595leC = this.EZpvd;
            if (interfaceC30595leC == null) {
                return 0;
            }
            return interfaceC30595leC.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.EZpvd + ")";
        }

        public Activity(InterfaceC30595leC interfaceC30595leC) {
            this.EZpvd = interfaceC30595leC;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.leC:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.leC) : (r1v0 o.leC))
 A[MD:(o.leC):void (m)] (LINE:64) call: o.kSy.Activity.<init>(o.leC):void type: THIS */
        public /* synthetic */ Activity(InterfaceC30595leC interfaceC30595leC, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : interfaceC30595leC);
        }
    }
}
