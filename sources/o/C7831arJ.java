package o;

import com.immomo.mls.utils.ErrorMonitor$clearLocalBundles$1;
import java.util.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7831arJ {
    public static final C7831arJ EZpvd = new C7831arJ();
    public static final java.util.List<StateListAnimator> AEQbTJ = new java.util.ArrayList();
    public static final int KWHzl = 8;

    private C7831arJ() {
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        ArrayDeque arrayDeque;
        java.lang.Object next;
        byte b;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (true) {
            arrayDeque = null;
            b = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((StateListAnimator) next).copydefault(), (java.lang.Object) str)) {
                break;
            }
        }
        StateListAnimator stateListAnimator = (StateListAnimator) next;
        if (stateListAnimator == null) {
            stateListAnimator = new StateListAnimator(str, arrayDeque, 2, b == true ? 1 : 0);
            AEQbTJ.add(stateListAnimator);
        }
        stateListAnimator.EZpvd().add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        pUU.EZpvd("ErrorMonitor", str + " errorOccurred, size: " + stateListAnimator.EZpvd().size());
        if (stateListAnimator.EZpvd().size() < 5) {
            return false;
        }
        java.lang.Long lPoll = stateListAnimator.EZpvd().poll();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Intrinsics.copydefault(lPoll);
        if (jCurrentTimeMillis - lPoll.longValue() > 3600000) {
            return false;
        }
        pUU.valueOf("ErrorMonitor", str + " Trigger event");
        EZpvd();
        stateListAnimator.EZpvd().clear();
        return true;
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new ErrorMonitor$clearLocalBundles$1(null), 2, null);
    }

    /* JADX INFO: renamed from: o.arJ$StateListAnimator */
    public static final class StateListAnimator {
        public final ArrayDeque<java.lang.Long> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.arJ$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, ArrayDeque arrayDeque, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                arrayDeque = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(str, arrayDeque);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayDeque<java.lang.Long> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull ArrayDeque<java.lang.Long> arrayDeque) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayDeque, "");
            return new StateListAnimator(str, arrayDeque);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ErrorInfo(appId=" + this.copydefault + ", timestamps=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull ArrayDeque<java.lang.Long> arrayDeque) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayDeque, "");
            this.copydefault = str;
            this.OLrzqt = arrayDeque;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.ArrayDeque:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayDeque:0x0007: CONSTRUCTOR (5 int) A[MD:(int):void (c), WRAPPED] (LINE:53) call: java.util.ArrayDeque.<init>(int):void type: CONSTRUCTOR) : (r2v0 java.util.ArrayDeque))
 A[MD:(java.lang.String, java.util.ArrayDeque<java.lang.Long>):void (m)] (LINE:51) call: o.arJ.StateListAnimator.<init>(java.lang.String, java.util.ArrayDeque):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, ArrayDeque arrayDeque, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new ArrayDeque(5) : arrayDeque);
        }
    }
}
