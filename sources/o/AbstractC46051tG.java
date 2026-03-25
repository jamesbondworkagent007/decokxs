package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC46051tG {
    public static final Activity EZpvd = new Activity(null);
    public static final java.util.List<AbstractC46051tG> AEQbTJ = yDY.gEmmrt(ActionBar.KWHzl, Application.KWHzl, TaskDescription.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tG.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC46051tG(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private AbstractC46051tG() {
    }

    /* JADX INFO: renamed from: o.tG$ActionBar */
    public static final class ActionBar extends AbstractC46051tG {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String OLrzqt = "CSV";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46051tG
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Csv";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tG$Application */
    public static final class Application extends AbstractC46051tG {
        public static final Application KWHzl = new Application();
        public static final java.lang.String copydefault = "TMX";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46051tG
        public java.lang.String EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Tmx";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tG$TaskDescription */
    public static final class TaskDescription extends AbstractC46051tG {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String OLrzqt = "TSV";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46051tG
        public java.lang.String EZpvd() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Tsv";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.tG$StateListAnimator */
    public static final class StateListAnimator extends AbstractC46051tG {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46051tG
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: renamed from: o.tG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AbstractC46051tG OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != 67046) {
                if (iHashCode != 83199) {
                    if (iHashCode == 83383 && str.equals("TSV")) {
                        return TaskDescription.copydefault;
                    }
                } else if (str.equals("TMX")) {
                    return Application.KWHzl;
                }
            } else if (str.equals("CSV")) {
                return ActionBar.KWHzl;
            }
            return new StateListAnimator(str);
        }
    }
}
