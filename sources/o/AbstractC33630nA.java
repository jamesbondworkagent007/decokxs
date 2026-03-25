package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC33630nA {
    public static final Application copydefault = new Application(null);
    public static final java.util.List<AbstractC33630nA> OLrzqt = yDY.gEmmrt(Activity.KWHzl, TaskDescription.AEQbTJ, StateListAnimator.AEQbTJ, Dialog.KWHzl, LoaderManager.EZpvd, Fragment.EZpvd, FragmentManager.AEQbTJ, PendingIntent.KWHzl, AssistContent.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33630nA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC33630nA() {
    }

    /* JADX INFO: renamed from: o.nA$Activity */
    public static final class Activity extends AbstractC33630nA {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String EZpvd = "COLUMN_HEADER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ColumnHeader";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$TaskDescription */
    public static final class TaskDescription extends AbstractC33630nA {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String EZpvd = "KEY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Key";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$StateListAnimator */
    public static final class StateListAnimator extends AbstractC33630nA {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String EZpvd = "SEMI_STRUCTURED_TABLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SemiStructuredTable";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$Dialog */
    public static final class Dialog extends AbstractC33630nA {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String AEQbTJ = "STRUCTURED_TABLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StructuredTable";
        }

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$LoaderManager */
    public static final class LoaderManager extends AbstractC33630nA {
        public static final LoaderManager EZpvd = new LoaderManager();
        public static final java.lang.String AEQbTJ = "TABLE_FOOTER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableFooter";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$Fragment */
    public static final class Fragment extends AbstractC33630nA {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String AEQbTJ = "TABLE_SECTION_TITLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableSectionTitle";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$FragmentManager */
    public static final class FragmentManager extends AbstractC33630nA {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String KWHzl = "TABLE_SUMMARY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableSummary";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$PendingIntent */
    public static final class PendingIntent extends AbstractC33630nA {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String EZpvd = "TABLE_TITLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TableTitle";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$AssistContent */
    public static final class AssistContent extends AbstractC33630nA {
        public static final AssistContent AEQbTJ = new AssistContent();
        public static final java.lang.String KWHzl = "VALUE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Value";
        }

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nA$ActionBar */
    public static final class ActionBar extends AbstractC33630nA {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: renamed from: o.nA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=9] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC33630nA copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1300711439:
                    if (str.equals("SEMI_STRUCTURED_TABLE")) {
                        return StateListAnimator.AEQbTJ;
                    }
                    break;
                case -741163667:
                    if (str.equals("TABLE_SECTION_TITLE")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case -618998169:
                    if (str.equals("TABLE_TITLE")) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case 74303:
                    if (str.equals("KEY")) {
                        return TaskDescription.AEQbTJ;
                    }
                    break;
                case 81434961:
                    if (str.equals("VALUE")) {
                        return AssistContent.AEQbTJ;
                    }
                    break;
                case 1432359744:
                    if (str.equals("STRUCTURED_TABLE")) {
                        return Dialog.KWHzl;
                    }
                    break;
                case 1592823797:
                    if (str.equals("TABLE_SUMMARY")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 1890485068:
                    if (str.equals("TABLE_FOOTER")) {
                        return LoaderManager.EZpvd;
                    }
                    break;
                case 2077048726:
                    if (str.equals("COLUMN_HEADER")) {
                        return Activity.KWHzl;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}
