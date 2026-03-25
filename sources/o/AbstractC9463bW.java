package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC9463bW {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final java.util.List<AbstractC9463bW> copydefault = yDY.gEmmrt(StateListAnimator.EZpvd, Application.AEQbTJ, Activity.EZpvd, TaskDescription.KWHzl, LoaderManager.AEQbTJ, FragmentManager.AEQbTJ, Fragment.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bW.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9463bW(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC9463bW() {
    }

    /* JADX INFO: renamed from: o.bW$StateListAnimator */
    public static final class StateListAnimator extends AbstractC9463bW {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String KWHzl = "BlackFrames";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BlackFrames";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$Application */
    public static final class Application extends AbstractC9463bW {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String KWHzl = "ColorBars";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ColorBars";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$Activity */
    public static final class Activity extends AbstractC9463bW {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String AEQbTJ = "Content";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$TaskDescription */
    public static final class TaskDescription extends AbstractC9463bW {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String AEQbTJ = "EndCredits";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EndCredits";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$LoaderManager */
    public static final class LoaderManager extends AbstractC9463bW {
        public static final LoaderManager AEQbTJ = new LoaderManager();
        public static final java.lang.String KWHzl = "OpeningCredits";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpeningCredits";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$FragmentManager */
    public static final class FragmentManager extends AbstractC9463bW {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String KWHzl = "Slate";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Slate";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$Fragment */
    public static final class Fragment extends AbstractC9463bW {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String AEQbTJ = "StudioLogo";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StudioLogo";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bW$Dialog */
    public static final class Dialog extends AbstractC9463bW {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.AEQbTJ;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Dialog) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    /* JADX INFO: renamed from: o.bW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC9463bW EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1678783399:
                    if (str.equals("Content")) {
                        return Activity.EZpvd;
                    }
                    break;
                case -1045363873:
                    if (str.equals("EndCredits")) {
                        return TaskDescription.KWHzl;
                    }
                    break;
                case -310615901:
                    if (str.equals("ColorBars")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 79966585:
                    if (str.equals("Slate")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 1075307713:
                    if (str.equals("StudioLogo")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case 1674022978:
                    if (str.equals("OpeningCredits")) {
                        return LoaderManager.AEQbTJ;
                    }
                    break;
                case 1712745829:
                    if (str.equals("BlackFrames")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
