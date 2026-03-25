package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26619jfj {

    /* JADX INFO: renamed from: o.jfj$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26619jfj {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jfj$Application */
    public static final class Application implements InterfaceC26619jfj {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jfj$TaskDescription */
    public static final class TaskDescription implements InterfaceC26619jfj {
        public final java.util.List<iWX> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jfj$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<iWX> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.util.List<iWX> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tabs=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.util.List<iWX> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:198)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.iWX>):void (m)] (LINE:197) call: o.jfj.TaskDescription.<init>(java.util.List):void type: THIS */
        public /* synthetic */ TaskDescription(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }
    }
}
