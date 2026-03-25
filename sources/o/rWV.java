package o;

import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class rWV {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rWV.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ rWV(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends rWV {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private rWV() {
    }

    public static final class StateListAnimator extends rWV {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends rWV {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends rWV {
        public final Calendar AEQbTJ;
        public final Calendar OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, Calendar calendar, Calendar calendar2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                calendar = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                calendar2 = application.AEQbTJ;
            }
            return application.copydefault(calendar, calendar2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull Calendar calendar, @NotNull Calendar calendar2) {
            Intrinsics.checkNotNullParameter(calendar, "");
            Intrinsics.checkNotNullParameter(calendar2, "");
            return new Application(calendar, calendar2);
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
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CUSTOM(startDate=" + this.OLrzqt + ", endDate=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull Calendar calendar, @NotNull Calendar calendar2) {
            super(null);
            Intrinsics.checkNotNullParameter(calendar, "");
            Intrinsics.checkNotNullParameter(calendar2, "");
            this.OLrzqt = calendar;
            this.AEQbTJ = calendar2;
        }
    }
}
