package o;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jDZ {

    public static final class ActionBar implements jDZ {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class TaskDescription implements jDZ {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class Activity implements jDZ {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    public static final class StateListAnimator implements jDZ {
        public final java.util.List<jEB> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jDZ$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<jEB> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.util.List<jEB> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ActivityContent(data=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.util.List<jEB> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    public static final class PendingIntent implements jDZ {
        public final boolean OLrzqt;
        public final java.util.List<TrackerTrendUIModel> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jDZ$PendingIntent */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = pendingIntent.copydefault;
            }
            if ((i & 2) != 0) {
                z = pendingIntent.OLrzqt;
            }
            return pendingIntent.OLrzqt(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TrackerTrendUIModel> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull java.util.List<TrackerTrendUIModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new PendingIntent(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault) && this.OLrzqt == pendingIntent.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrendContent(data=" + this.copydefault + ", isTabSwitch=" + this.OLrzqt + ")";
        }

        public PendingIntent(@NotNull java.util.List<TrackerTrendUIModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel>, boolean):void (m)] (LINE:828) call: o.jDZ.PendingIntent.<init>(java.util.List, boolean):void type: THIS */
        public /* synthetic */ PendingIntent(java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }
    }

    public static final class Application implements jDZ {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            return application.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Application) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
