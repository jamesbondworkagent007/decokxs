package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC7026ac {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<AbstractC7026ac> copydefault = yDY.gEmmrt(Application.EZpvd, Activity.OLrzqt, ActionBar.EZpvd, StateListAnimator.AEQbTJ, FragmentManager.EZpvd, PendingIntent.OLrzqt, Fragment.EZpvd, LoaderManager.EZpvd, TaskStackBuilder.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ac.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC7026ac(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC7026ac() {
    }

    /* JADX INFO: renamed from: o.ac$Application */
    public static final class Application extends AbstractC7026ac {
        public static final Application EZpvd = new Application();
        public static final java.lang.String AEQbTJ = "ACCESS_DENIED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AccessDenied";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$Activity */
    public static final class Activity extends AbstractC7026ac {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String AEQbTJ = "INTERNAL_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InternalError";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$ActionBar */
    public static final class ActionBar extends AbstractC7026ac {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String AEQbTJ = "INVALID_KMS_KEY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidKmsKey";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$StateListAnimator */
    public static final class StateListAnimator extends AbstractC7026ac {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String OLrzqt = "INVALID_MANIFEST";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidManifest";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$FragmentManager */
    public static final class FragmentManager extends AbstractC7026ac {
        public static final FragmentManager EZpvd = new FragmentManager();
        public static final java.lang.String OLrzqt = "INVALID_OUTPUT_CONFIG";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidOutputConfig";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$PendingIntent */
    public static final class PendingIntent extends AbstractC7026ac {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String EZpvd = "INVALID_S3_OBJECT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidS3Object";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$Fragment */
    public static final class Fragment extends AbstractC7026ac {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String OLrzqt = "RESOURCE_NOT_FOUND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResourceNotFound";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$LoaderManager */
    public static final class LoaderManager extends AbstractC7026ac {
        public static final LoaderManager EZpvd = new LoaderManager();
        public static final java.lang.String AEQbTJ = "RESOURCE_NOT_READY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResourceNotReady";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC7026ac {
        public static final TaskStackBuilder AEQbTJ = new TaskStackBuilder();
        public static final java.lang.String OLrzqt = "THROTTLED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Throttled";
        }

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ac$Dialog */
    public static final class Dialog extends AbstractC7026ac {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
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
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: renamed from: o.ac$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ac.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=9] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC7026ac copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -485608986:
                    if (str.equals("INTERNAL_ERROR")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case -484982824:
                    if (str.equals("INVALID_OUTPUT_CONFIG")) {
                        return FragmentManager.EZpvd;
                    }
                    break;
                case -8285211:
                    if (str.equals("RESOURCE_NOT_FOUND")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case 2479622:
                    if (str.equals("RESOURCE_NOT_READY")) {
                        return LoaderManager.EZpvd;
                    }
                    break;
                case 8614807:
                    if (str.equals("INVALID_MANIFEST")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case 1006971606:
                    if (str.equals("ACCESS_DENIED")) {
                        return Application.EZpvd;
                    }
                    break;
                case 1483592137:
                    if (str.equals("INVALID_KMS_KEY")) {
                        return ActionBar.EZpvd;
                    }
                    break;
                case 1528687194:
                    if (str.equals("THROTTLED")) {
                        return TaskStackBuilder.AEQbTJ;
                    }
                    break;
                case 1753602486:
                    if (str.equals("INVALID_S3_OBJECT")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
