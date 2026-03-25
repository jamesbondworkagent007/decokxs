package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC12232cj {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public static final java.util.List<AbstractC12232cj> OLrzqt = yDY.gEmmrt(Activity.copydefault, Application.KWHzl, StateListAnimator.AEQbTJ, ActionBar.AEQbTJ, PendingIntent.AEQbTJ, FragmentManager.KWHzl, LoaderManager.copydefault, Fragment.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC12232cj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12232cj() {
    }

    /* JADX INFO: renamed from: o.cj$Activity */
    public static final class Activity extends AbstractC12232cj {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String AEQbTJ = "EXCEEDS_MAX_FACES";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExceedsMaxFaces";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$Application */
    public static final class Application extends AbstractC12232cj {
        public static final Application KWHzl = new Application();
        public static final java.lang.String AEQbTJ = "EXTREME_POSE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExtremePose";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$StateListAnimator */
    public static final class StateListAnimator extends AbstractC12232cj {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String copydefault = "FACE_NOT_LARGEST";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FaceNotLargest";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$ActionBar */
    public static final class ActionBar extends AbstractC12232cj {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String copydefault = "LOW_BRIGHTNESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowBrightness";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$PendingIntent */
    public static final class PendingIntent extends AbstractC12232cj {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final java.lang.String KWHzl = "LOW_CONFIDENCE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowConfidence";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$FragmentManager */
    public static final class FragmentManager extends AbstractC12232cj {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final java.lang.String AEQbTJ = "LOW_FACE_QUALITY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowFaceQuality";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$LoaderManager */
    public static final class LoaderManager extends AbstractC12232cj {
        public static final LoaderManager copydefault = new LoaderManager();
        public static final java.lang.String AEQbTJ = "LOW_SHARPNESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowSharpness";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$Fragment */
    public static final class Fragment extends AbstractC12232cj {
        public static final Fragment copydefault = new Fragment();
        public static final java.lang.String KWHzl = "SMALL_BOUNDING_BOX";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmallBoundingBox";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cj$Dialog */
    public static final class Dialog extends AbstractC12232cj {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.KWHzl;
            }
            return dialog.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Dialog) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.cj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=8] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC12232cj EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1552045016:
                    if (str.equals("LOW_FACE_QUALITY")) {
                        return FragmentManager.KWHzl;
                    }
                    break;
                case -1205561898:
                    if (str.equals("LOW_SHARPNESS")) {
                        return LoaderManager.copydefault;
                    }
                    break;
                case -1123785285:
                    if (str.equals("EXCEEDS_MAX_FACES")) {
                        return Activity.copydefault;
                    }
                    break;
                case -904888772:
                    if (str.equals("LOW_BRIGHTNESS")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
                case -723799947:
                    if (str.equals("LOW_CONFIDENCE")) {
                        return PendingIntent.AEQbTJ;
                    }
                    break;
                case -618172850:
                    if (str.equals("FACE_NOT_LARGEST")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case -263589656:
                    if (str.equals("SMALL_BOUNDING_BOX")) {
                        return Fragment.copydefault;
                    }
                    break;
                case 1267943524:
                    if (str.equals("EXTREME_POSE")) {
                        return Application.KWHzl;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
