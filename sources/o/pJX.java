package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC38044pKd;
import o.pJX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pJX {
    public static final ActionBar Companion = ActionBar.EZpvd;

    public interface Application {
        void copydefault(@NotNull InterfaceC38044pKd.ActionBar actionBar);
    }

    void AhwBna();

    pJX KWHzl(@NotNull Application application);

    void KWHzl(@NotNull java.lang.Object obj);

    public static final class ActionBar {
        public static volatile pJX copydefault;
        public static final /* synthetic */ ActionBar EZpvd = new ActionBar();
        public static final InterfaceC56387yDm<StateListAnimator> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pJX.ActionBar.KWHzl();
            }
        });

        private ActionBar() {
        }

        public static final StateListAnimator KWHzl() {
            return new StateListAnimator(false, 0, 0L, 0L, 0L, 0L, 0.0f, false, 254, null);
        }

        public final StateListAnimator AEQbTJ() {
            return AEQbTJ.getValue();
        }

        public final void copydefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull android.app.Application application, @NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            if (copydefault == null) {
                synchronized (this) {
                    copydefault = new C38030pJq(application, stateListAnimator, coroutineDispatcher, null, 8, null);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        public final pJX copydefault() {
            pJX pjx = copydefault;
            if (pjx != null) {
                return pjx;
            }
            throw new java.lang.IllegalStateException("LeakDetector not initialized. Call init() first.");
        }
    }

    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final long AhwBna;
        public final long EZpvd;
        public final int KWHzl;
        public final float OLrzqt;
        public final boolean copydefault;
        public final long djBIcL;
        public final long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(boolean z, int i, long j, long j2, long j3, long j4, float f, boolean z2) {
            return new StateListAnimator(z, i, j, j2, j3, j4, f, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && this.KWHzl == stateListAnimator.KWHzl && this.djBIcL == stateListAnimator.djBIcL && this.EZpvd == stateListAnimator.EZpvd && this.AhwBna == stateListAnimator.AhwBna && this.gEmmrt == stateListAnimator.gEmmrt && java.lang.Float.compare(this.OLrzqt, stateListAnimator.OLrzqt) == 0 && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.djBIcL)) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.AhwBna)) * 31) + java.lang.Long.hashCode(this.gEmmrt)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Config(isEnabled=" + this.AEQbTJ + ", maxTrackedObjects=" + this.KWHzl + ", suspectedLeakThreshold=" + this.djBIcL + ", confirmedLeakThreshold=" + this.EZpvd + ", reportProcessingInterval=" + this.AhwBna + ", referenceQueuePollInterval=" + this.gEmmrt + ", memoryRatioExceededThreshold=" + this.OLrzqt + ", isFragmentLeakDetectEnabled=" + this.copydefault + ")";
        }

        public StateListAnimator(boolean z, int i, long j, long j2, long j3, long j4, float f, boolean z2) {
            this.AEQbTJ = z;
            this.KWHzl = i;
            this.djBIcL = j;
            this.EZpvd = j2;
            this.AhwBna = j3;
            this.gEmmrt = j4;
            this.OLrzqt = f;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (r12v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (50 int) : (r13v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (5000 long) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1000 long) : (r16v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (2000 long) : (r18v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (3000 long) : (r20v0 long))
  (wrap:float:?: TERNARY null = ((wrap:int:0x002d: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.2f float) : (r22v0 float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
 A[MD:(boolean, int, long, long, long, long, float, boolean):void (m)] (LINE:52) call: o.pJX.StateListAnimator.<init>(boolean, int, long, long, long, long, float, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, int i, long j, long j2, long j3, long j4, float f, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 50 : i, (i2 & 4) != 0 ? 5000L : j, (i2 & 8) != 0 ? 1000L : j2, (i2 & 16) != 0 ? 2000L : j3, (i2 & 32) != 0 ? 3000L : j4, (i2 & 64) != 0 ? 0.2f : f, (i2 & 128) != 0 ? true : z2);
        }
    }
}
