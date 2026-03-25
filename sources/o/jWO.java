package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface jWO {

    public static final class StateListAnimator implements jWO {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1377099101;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private StateListAnimator() {
        }
    }

    public static final class ActionBar implements jWO {
        public static final ActionBar AEQbTJ = new ActionBar();

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
            return 1480474927;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private ActionBar() {
        }
    }

    public static final class Activity implements jWO {
        public final boolean KWHzl;
        public final java.util.List<HoldingAsset> OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jWO$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                j = activity.copydefault;
            }
            if ((i & 4) != 0) {
                z = activity.KWHzl;
            }
            return activity.OLrzqt(list, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.util.List<HoldingAsset> list, long j, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HoldingAsset> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && this.copydefault == activity.copydefault && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(data=" + this.OLrzqt + ", timestamp=" + this.copydefault + ", reSorting=" + this.KWHzl + ")";
        }

        public Activity(@NotNull java.util.List<HoldingAsset> list, long j, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.copydefault = j;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:24)) : (r2v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.util.List<com.okinc.business.market.features.holdings.domain.model.HoldingAsset>, long, boolean):void (m)] (LINE:22) call: o.jWO.Activity.<init>(java.util.List, long, boolean):void type: THIS */
        public /* synthetic */ Activity(java.util.List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? java.lang.System.currentTimeMillis() : j, (i & 4) != 0 ? false : z);
        }
    }

    public static final class Application implements jWO {
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0L, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = application.KWHzl;
            }
            return application.copydefault(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(long j) {
            return new Application(j);
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
            return java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoWallet(timestamp=" + this.KWHzl + ")";
        }

        public Application(long j) {
            this.KWHzl = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:28)) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:27) call: o.jWO.Application.<init>(long):void type: THIS */
        public /* synthetic */ Application(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.System.currentTimeMillis() : j);
        }
    }
}
