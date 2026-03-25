package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iWU {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements iWU {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class Application implements iWU {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements iWU {
        public final iWT AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, iWT iwt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                iwt = activity.AEQbTJ;
            }
            return activity.copydefault(iwt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final iWT OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull iWT iwt) {
            Intrinsics.checkNotNullParameter(iwt, "");
            return new Activity(iwt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(header=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull iWT iwt) {
            Intrinsics.checkNotNullParameter(iwt, "");
            this.AEQbTJ = iwt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.iWT:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iWT:0x0006: INVOKE (wrap:o.iWT$Activity:0x0004: SGET  A[WRAPPED] (LINE:149) o.iWT.Companion o.iWT$Activity) VIRTUAL call: o.iWT.Activity.copydefault():o.iWT A[MD:():o.iWT (m), WRAPPED] (LINE:149)) : (r1v0 o.iWT))
 A[MD:(o.iWT):void (m)] (LINE:148) call: o.iWU.Activity.<init>(o.iWT):void type: THIS */
        public /* synthetic */ Activity(iWT iwt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? iWT.Companion.copydefault() : iwt);
        }
    }
}
