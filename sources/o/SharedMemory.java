package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SharedMemory {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final java.util.List<SharedMemory> AEQbTJ = yDY.gEmmrt(Activity.KWHzl, ActionBar.OLrzqt, Application.OLrzqt, Fragment.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SharedMemory.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SharedMemory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SharedMemory() {
    }

    public static final class Activity extends SharedMemory {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String OLrzqt = "DOCUMENT_SIZE_EXCEEDED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DocumentSizeExceeded";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends SharedMemory {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String EZpvd = "PAGE_LIMIT_EXCEEDED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PageLimitExceeded";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends SharedMemory {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String KWHzl = "TEXTRACT_ACCESS_DENIED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextractAccessDenied";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Fragment extends SharedMemory {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String OLrzqt = "UNSUPPORTED_DOC_TYPE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UnsupportedDocType";
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class StateListAnimator extends SharedMemory {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SharedMemory.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SharedMemory AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1459625052:
                    if (str.equals("TEXTRACT_ACCESS_DENIED")) {
                        return Application.OLrzqt;
                    }
                    break;
                case -1252939541:
                    if (str.equals("UNSUPPORTED_DOC_TYPE")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case -840911443:
                    if (str.equals("DOCUMENT_SIZE_EXCEEDED")) {
                        return Activity.KWHzl;
                    }
                    break;
                case 1536320295:
                    if (str.equals("PAGE_LIMIT_EXCEEDED")) {
                        return ActionBar.OLrzqt;
                    }
                    break;
            }
            return new StateListAnimator(str);
        }
    }
}
