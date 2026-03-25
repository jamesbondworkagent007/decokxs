package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC47594tt {
    public static final Application KWHzl = new Application(null);
    public static final java.util.List<AbstractC47594tt> EZpvd = yDY.gEmmrt(TaskDescription.OLrzqt, StateListAnimator.AEQbTJ, Activity.copydefault, ActionBar.AEQbTJ, LoaderManager.copydefault, FragmentManager.OLrzqt, PendingIntent.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tt.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC47594tt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private AbstractC47594tt() {
    }

    /* JADX INFO: renamed from: o.tt$TaskDescription */
    public static final class TaskDescription extends AbstractC47594tt {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String AEQbTJ = "COMPLETED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$StateListAnimator */
    public static final class StateListAnimator extends AbstractC47594tt {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String OLrzqt = "COMPLETED_WITH_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CompletedWithError";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$Activity */
    public static final class Activity extends AbstractC47594tt {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String AEQbTJ = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$ActionBar */
    public static final class ActionBar extends AbstractC47594tt {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String copydefault = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$LoaderManager */
    public static final class LoaderManager extends AbstractC47594tt {
        public static final LoaderManager copydefault = new LoaderManager();
        public static final java.lang.String OLrzqt = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$FragmentManager */
    public static final class FragmentManager extends AbstractC47594tt {
        public static final FragmentManager OLrzqt = new FragmentManager();
        public static final java.lang.String AEQbTJ = "STOP_REQUESTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StopRequested";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$PendingIntent */
    public static final class PendingIntent extends AbstractC47594tt {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final java.lang.String copydefault = "SUBMITTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Submitted";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tt$Fragment */
    public static final class Fragment extends AbstractC47594tt {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.AEQbTJ;
            }
            return fragment.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC47594tt
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Fragment) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: renamed from: o.tt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC47594tt AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return LoaderManager.copydefault;
                    }
                    break;
                case -1159694117:
                    if (str.equals("SUBMITTED")) {
                        return PendingIntent.AEQbTJ;
                    }
                    break;
                case -605681839:
                    if (str.equals("STOP_REQUESTED")) {
                        return FragmentManager.OLrzqt;
                    }
                    break;
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 916983747:
                    if (str.equals("COMPLETED_WITH_ERROR")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case 1383663147:
                    if (str.equals("COMPLETED")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Activity.copydefault;
                    }
                    break;
            }
            return new Fragment(str);
        }
    }
}
