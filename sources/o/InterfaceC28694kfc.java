package o;

import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28694kfc {

    /* JADX INFO: renamed from: o.kfc$TaskDescription */
    public static final class TaskDescription implements InterfaceC28694kfc {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kfc$Activity */
    public static final class Activity implements InterfaceC28694kfc {
        public static final Activity KWHzl = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kfc$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28694kfc {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kfc$Application */
    public static final class Application implements InterfaceC28694kfc {
        public final boolean AEQbTJ;
        public final java.util.List<MemeUiModel> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kfc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            return application.copydefault(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<MemeUiModel> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.util.List<MemeUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list, z);
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
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(tokenList=" + this.OLrzqt + ", shouldShowCoachmark=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull java.util.List<MemeUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:243)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.domain.model.MemeUiModel>, boolean):void (m)] (LINE:242) call: o.kfc.Application.<init>(java.util.List, boolean):void type: THIS */
        public /* synthetic */ Application(java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z);
        }
    }
}
