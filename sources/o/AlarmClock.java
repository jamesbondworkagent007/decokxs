package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AlarmClock {
    public static final Activity copydefault = new Activity(null);
    public static final java.util.List<AlarmClock> EZpvd = yDY.gEmmrt(ActionBar.AEQbTJ, TaskDescription.KWHzl, StateListAnimator.KWHzl, Application.OLrzqt, Dialog.KWHzl, PendingIntent.AEQbTJ, Fragment.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AlarmClock.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AlarmClock(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlarmClock() {
    }

    public static final class ActionBar extends AlarmClock {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String KWHzl = "GRAPHIC";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Graphic";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class TaskDescription extends AlarmClock {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String AEQbTJ = "HARASSMENT_OR_ABUSE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HarassmentOrAbuse";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class StateListAnimator extends AlarmClock {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String OLrzqt = "HATE_SPEECH";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HateSpeech";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends AlarmClock {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String KWHzl = "INSULT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Insult";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Dialog extends AlarmClock {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String AEQbTJ = "PROFANITY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Profanity";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class PendingIntent extends AlarmClock {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final java.lang.String OLrzqt = "SEXUAL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Sexual";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Fragment extends AlarmClock {
        public static final Fragment OLrzqt = new Fragment();
        public static final java.lang.String KWHzl = "VIOLENCE_OR_THREAT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViolenceOrThreat";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class LoaderManager extends AlarmClock {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.AEQbTJ;
            }
            return loaderManager.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((LoaderManager) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AlarmClock.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AlarmClock KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2130447857:
                    if (str.equals("INSULT")) {
                        return Application.OLrzqt;
                    }
                    break;
                case -1852319430:
                    if (str.equals("SEXUAL")) {
                        return PendingIntent.AEQbTJ;
                    }
                    break;
                case -1061716585:
                    if (str.equals("HATE_SPEECH")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case -405623982:
                    if (str.equals("VIOLENCE_OR_THREAT")) {
                        return Fragment.OLrzqt;
                    }
                    break;
                case 998325960:
                    if (str.equals("GRAPHIC")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case 1006039491:
                    if (str.equals("HARASSMENT_OR_ABUSE")) {
                        return TaskDescription.KWHzl;
                    }
                    break;
                case 1773870472:
                    if (str.equals("PROFANITY")) {
                        return Dialog.KWHzl;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
