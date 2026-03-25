package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC35769oD {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final java.util.List<AbstractC35769oD> KWHzl = yDY.gEmmrt(TaskDescription.OLrzqt, Application.OLrzqt, ActionBar.copydefault, Activity.copydefault, Fragment.EZpvd, PendingIntent.copydefault, LoaderManager.OLrzqt, FragmentManager.copydefault, AssistContent.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35769oD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35769oD() {
    }

    /* JADX INFO: renamed from: o.oD$TaskDescription */
    public static final class TaskDescription extends AbstractC35769oD {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String copydefault = "ANSWER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Answer";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$Application */
    public static final class Application extends AbstractC35769oD {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String copydefault = "CHILD";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Child";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$ActionBar */
    public static final class ActionBar extends AbstractC35769oD {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String OLrzqt = "COMPLEX_FEATURES";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ComplexFeatures";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$Activity */
    public static final class Activity extends AbstractC35769oD {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String OLrzqt = "MERGED_CELL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MergedCell";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$Fragment */
    public static final class Fragment extends AbstractC35769oD {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String OLrzqt = "TABLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Table";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$PendingIntent */
    public static final class PendingIntent extends AbstractC35769oD {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String OLrzqt = "TABLE_FOOTER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableFooter";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$LoaderManager */
    public static final class LoaderManager extends AbstractC35769oD {
        public static final LoaderManager OLrzqt = new LoaderManager();
        public static final java.lang.String EZpvd = "TABLE_TITLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableTitle";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$FragmentManager */
    public static final class FragmentManager extends AbstractC35769oD {
        public static final FragmentManager copydefault = new FragmentManager();
        public static final java.lang.String EZpvd = "TITLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Title";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$AssistContent */
    public static final class AssistContent extends AbstractC35769oD {
        public static final AssistContent OLrzqt = new AssistContent();
        public static final java.lang.String copydefault = "VALUE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Value";
        }

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oD$Dialog */
    public static final class Dialog extends AbstractC35769oD {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
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
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: renamed from: o.oD$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=9] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC35769oD OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1452933483:
                    if (str.equals("MERGED_CELL")) {
                        return Activity.copydefault;
                    }
                    break;
                case -1025329396:
                    if (str.equals("COMPLEX_FEATURES")) {
                        return ActionBar.copydefault;
                    }
                    break;
                case -618998169:
                    if (str.equals("TABLE_TITLE")) {
                        return LoaderManager.OLrzqt;
                    }
                    break;
                case 64093436:
                    if (str.equals("CHILD")) {
                        return Application.OLrzqt;
                    }
                    break;
                case 79578030:
                    if (str.equals("TABLE")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case 79833656:
                    if (str.equals("TITLE")) {
                        return FragmentManager.copydefault;
                    }
                    break;
                case 81434961:
                    if (str.equals("VALUE")) {
                        return AssistContent.OLrzqt;
                    }
                    break;
                case 1890485068:
                    if (str.equals("TABLE_FOOTER")) {
                        return PendingIntent.copydefault;
                    }
                    break;
                case 1935487934:
                    if (str.equals("ANSWER")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
