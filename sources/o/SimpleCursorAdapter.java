package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SimpleCursorAdapter {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<SimpleCursorAdapter> AEQbTJ = yDY.gEmmrt(ActionBar.OLrzqt, Activity.OLrzqt, Application.copydefault, StateListAnimator.EZpvd, Dialog.OLrzqt, PendingIntent.OLrzqt, Fragment.copydefault, FragmentManager.EZpvd, AssistContent.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SimpleCursorAdapter.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SimpleCursorAdapter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private SimpleCursorAdapter() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar extends SimpleCursorAdapter {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String copydefault = "ANGRY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Angry";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity extends SimpleCursorAdapter {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String copydefault = "CALM";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Calm";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application extends SimpleCursorAdapter {
        public static final Application copydefault = new Application();
        public static final java.lang.String OLrzqt = "CONFUSED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Confused";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator extends SimpleCursorAdapter {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String copydefault = "DISGUSTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Disgusted";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Dialog extends SimpleCursorAdapter {
        public static final Dialog OLrzqt = new Dialog();
        public static final java.lang.String copydefault = "FEAR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Fear";
        }

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class PendingIntent extends SimpleCursorAdapter {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String copydefault = "HAPPY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Happy";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Fragment extends SimpleCursorAdapter {
        public static final Fragment copydefault = new Fragment();
        public static final java.lang.String OLrzqt = "SAD";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Sad";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class FragmentManager extends SimpleCursorAdapter {
        public static final FragmentManager EZpvd = new FragmentManager();
        public static final java.lang.String OLrzqt = "SURPRISED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Surprised";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class AssistContent extends SimpleCursorAdapter {
        public static final AssistContent copydefault = new AssistContent();
        public static final java.lang.String EZpvd = "UNKNOWN";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unknown";
        }

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class LoaderManager extends SimpleCursorAdapter {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.OLrzqt;
            }
            return loaderManager.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SimpleCursorAdapter
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((LoaderManager) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SimpleCursorAdapter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=9] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SimpleCursorAdapter KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1509597540:
                    if (str.equals("DISGUSTED")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case 81846:
                    if (str.equals("SAD")) {
                        return Fragment.copydefault;
                    }
                    break;
                case 2060895:
                    if (str.equals("CALM")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case 2153776:
                    if (str.equals("FEAR")) {
                        return Dialog.OLrzqt;
                    }
                    break;
                case 62423425:
                    if (str.equals("ANGRY")) {
                        return ActionBar.OLrzqt;
                    }
                    break;
                case 68509376:
                    if (str.equals("HAPPY")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
                case 202856673:
                    if (str.equals("CONFUSED")) {
                        return Application.copydefault;
                    }
                    break;
                case 249333371:
                    if (str.equals("SURPRISED")) {
                        return FragmentManager.EZpvd;
                    }
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        return AssistContent.copydefault;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
