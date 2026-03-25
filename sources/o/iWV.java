package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iWV {

    public static final class StateListAnimator implements iWV {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar implements iWV {
        public final java.util.List<iWX> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iWV$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.util.List<iWX> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<iWX> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tabs=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.util.List<iWX> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:141)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.iWX>):void (m)] (LINE:140) call: o.iWV.ActionBar.<init>(java.util.List):void type: THIS */
        public /* synthetic */ ActionBar(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }
    }
}
