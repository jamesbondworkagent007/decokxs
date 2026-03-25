package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC6211aL {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final java.util.List<AbstractC6211aL> copydefault = yDY.gEmmrt(ActionBar.OLrzqt, Application.OLrzqt, Activity.KWHzl, TaskDescription.OLrzqt, Fragment.OLrzqt, Dialog.KWHzl, PendingIntent.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC6211aL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6211aL() {
    }

    /* JADX INFO: renamed from: o.aL$ActionBar */
    public static final class ActionBar extends AbstractC6211aL {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String AEQbTJ = "EXCEEDS_MAX_FACES";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExceedsMaxFaces";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$Application */
    public static final class Application extends AbstractC6211aL {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String AEQbTJ = "EXTREME_POSE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExtremePose";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$Activity */
    public static final class Activity extends AbstractC6211aL {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = "LOW_BRIGHTNESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowBrightness";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$TaskDescription */
    public static final class TaskDescription extends AbstractC6211aL {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String KWHzl = "LOW_CONFIDENCE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowConfidence";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$Fragment */
    public static final class Fragment extends AbstractC6211aL {
        public static final Fragment OLrzqt = new Fragment();
        public static final java.lang.String AEQbTJ = "LOW_FACE_QUALITY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowFaceQuality";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$Dialog */
    public static final class Dialog extends AbstractC6211aL {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String OLrzqt = "LOW_SHARPNESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowSharpness";
        }

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$PendingIntent */
    public static final class PendingIntent extends AbstractC6211aL {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String AEQbTJ = "SMALL_BOUNDING_BOX";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmallBoundingBox";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aL$LoaderManager */
    public static final class LoaderManager extends AbstractC6211aL {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.AEQbTJ;
            }
            return loaderManager.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
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

    /* JADX INFO: renamed from: o.aL$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC6211aL KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1552045016:
                    if (str.equals("LOW_FACE_QUALITY")) {
                        return Fragment.OLrzqt;
                    }
                    break;
                case -1205561898:
                    if (str.equals("LOW_SHARPNESS")) {
                        return Dialog.KWHzl;
                    }
                    break;
                case -1123785285:
                    if (str.equals("EXCEEDS_MAX_FACES")) {
                        return ActionBar.OLrzqt;
                    }
                    break;
                case -904888772:
                    if (str.equals("LOW_BRIGHTNESS")) {
                        return Activity.KWHzl;
                    }
                    break;
                case -723799947:
                    if (str.equals("LOW_CONFIDENCE")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
                case -263589656:
                    if (str.equals("SMALL_BOUNDING_BOX")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
                case 1267943524:
                    if (str.equals("EXTREME_POSE")) {
                        return Application.OLrzqt;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
