package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class FullBackupDataOutput {
    public static final Activity copydefault = new Activity(null);
    public static final java.util.List<FullBackupDataOutput> EZpvd = yDY.gEmmrt(StateListAnimator.KWHzl, Application.AEQbTJ, TaskDescription.AEQbTJ, ActionBar.AEQbTJ, Dialog.KWHzl, Fragment.KWHzl, FragmentManager.AEQbTJ, LoaderManager.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FullBackupDataOutput.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FullBackupDataOutput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FullBackupDataOutput() {
    }

    public static final class StateListAnimator extends FullBackupDataOutput {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "Created";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Created";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends FullBackupDataOutput {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String KWHzl = "Expired";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Expired";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends FullBackupDataOutput {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String OLrzqt = "Failed";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class ActionBar extends FullBackupDataOutput {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String OLrzqt = "InProgress";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Dialog extends FullBackupDataOutput {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String OLrzqt = "Pending";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Pending";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class Fragment extends FullBackupDataOutput {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String AEQbTJ = "Stopped";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class FragmentManager extends FullBackupDataOutput {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String KWHzl = "Stopping";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopping";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class LoaderManager extends FullBackupDataOutput {
        public static final LoaderManager AEQbTJ = new LoaderManager();
        public static final java.lang.String KWHzl = "Succeeded";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Succeeded";
        }

        private LoaderManager() {
            super(null);
        }
    }

    public static final class PendingIntent extends FullBackupDataOutput {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            return pendingIntent.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((PendingIntent) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FullBackupDataOutput.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=8] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final FullBackupDataOutput OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1601759544:
                    if (str.equals("Created")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case -1345265087:
                    if (str.equals("Succeeded")) {
                        return LoaderManager.AEQbTJ;
                    }
                    break;
                case -219666003:
                    if (str.equals("Stopped")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case 355417861:
                    if (str.equals("Expired")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 646453906:
                    if (str.equals("InProgress")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 982065527:
                    if (str.equals("Pending")) {
                        return Dialog.KWHzl;
                    }
                    break;
                case 1780292756:
                    if (str.equals("Stopping")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 2096857181:
                    if (str.equals("Failed")) {
                        return TaskDescription.AEQbTJ;
                    }
                    break;
            }
            return new PendingIntent(str);
        }
    }
}
