package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC46078tH {
    public static final Application KWHzl = new Application(null);
    public static final java.util.List<AbstractC46078tH> copydefault = yDY.gEmmrt(StateListAnimator.AEQbTJ, Activity.OLrzqt, TaskDescription.OLrzqt, ActionBar.EZpvd, FragmentManager.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tH.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC46078tH(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC46078tH() {
    }

    /* JADX INFO: renamed from: o.tH$StateListAnimator */
    public static final class StateListAnimator extends AbstractC46078tH {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String EZpvd = "ACTIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Active";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tH$Activity */
    public static final class Activity extends AbstractC46078tH {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String EZpvd = "CREATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Creating";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tH$TaskDescription */
    public static final class TaskDescription extends AbstractC46078tH {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String EZpvd = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tH$ActionBar */
    public static final class ActionBar extends AbstractC46078tH {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String OLrzqt = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tH$FragmentManager */
    public static final class FragmentManager extends AbstractC46078tH {
        public static final FragmentManager OLrzqt = new FragmentManager();
        public static final java.lang.String AEQbTJ = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tH$Dialog */
    public static final class Dialog extends AbstractC46078tH {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Dialog) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    /* JADX INFO: renamed from: o.tH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC46078tH copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1691918663:
                    if (str.equals("CREATING")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return ActionBar.EZpvd;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return FragmentManager.OLrzqt;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
