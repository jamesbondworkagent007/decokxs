package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RemoteMailException {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<RemoteMailException> EZpvd = yDY.gEmmrt(Application.AEQbTJ, StateListAnimator.AEQbTJ, Activity.AEQbTJ, ActionBar.copydefault, Dialog.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteMailException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteMailException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private RemoteMailException() {
    }

    public static final class Application extends RemoteMailException {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "ACTIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Active";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends RemoteMailException {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "CREATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Creating";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends RemoteMailException {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String OLrzqt = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends RemoteMailException {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Dialog extends RemoteMailException {
        public static final Dialog OLrzqt = new Dialog();
        public static final java.lang.String AEQbTJ = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class FragmentManager extends RemoteMailException {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.OLrzqt;
            }
            return fragmentManager.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FragmentManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RemoteMailException
        public java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((FragmentManager) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteMailException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final RemoteMailException OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1691918663:
                    if (str.equals("CREATING")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return Activity.AEQbTJ;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return ActionBar.copydefault;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return Dialog.OLrzqt;
                    }
                    break;
            }
            return new FragmentManager(str);
        }
    }
}
