package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StatsDimensionsValue {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final java.util.List<StatsDimensionsValue> KWHzl = yDY.gEmmrt(StateListAnimator.copydefault, Activity.copydefault, TaskDescription.EZpvd, FragmentManager.EZpvd, PendingIntent.copydefault, Fragment.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StatsDimensionsValue.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StatsDimensionsValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private StatsDimensionsValue() {
    }

    public static final class StateListAnimator extends StatsDimensionsValue {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String OLrzqt = "COMPLETED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends StatsDimensionsValue {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String OLrzqt = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends StatsDimensionsValue {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String copydefault = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class FragmentManager extends StatsDimensionsValue {
        public static final FragmentManager EZpvd = new FragmentManager();
        public static final java.lang.String OLrzqt = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class PendingIntent extends StatsDimensionsValue {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String EZpvd = "STOP_REQUESTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StopRequested";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Fragment extends StatsDimensionsValue {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String copydefault = "SUBMITTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Submitted";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class Application extends StatsDimensionsValue {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            return application.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.StatsDimensionsValue
        public java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Application) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StatsDimensionsValue.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=6] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final StatsDimensionsValue OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return FragmentManager.EZpvd;
                    }
                    break;
                case -1159694117:
                    if (str.equals("SUBMITTED")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case -605681839:
                    if (str.equals("STOP_REQUESTED")) {
                        return PendingIntent.copydefault;
                    }
                    break;
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        return TaskDescription.EZpvd;
                    }
                    break;
                case 1383663147:
                    if (str.equals("COMPLETED")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Activity.copydefault;
                    }
                    break;
            }
            return new Application(str);
        }
    }
}
