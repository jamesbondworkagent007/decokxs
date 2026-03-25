package o;

import com.immomo.mls.fun.ud.UDImageInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class HandlerExecutor {
    public static final ActionBar EZpvd = new ActionBar(null);
    public static final java.util.List<HandlerExecutor> KWHzl = yDY.gEmmrt(Activity.OLrzqt, TaskDescription.OLrzqt, StateListAnimator.copydefault, Application.AEQbTJ, Dialog.OLrzqt, PendingIntent.OLrzqt, FragmentManager.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HandlerExecutor.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HandlerExecutor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HandlerExecutor() {
    }

    public static final class Activity extends HandlerExecutor {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String AEQbTJ = "IMAGE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return UDImageInfo.LUA_CLASS_NAME;
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends HandlerExecutor {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public static final java.lang.String AEQbTJ = "MS_WORD";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MsWord";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class StateListAnimator extends HandlerExecutor {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "NATIVE_PDF";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NativePdf";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends HandlerExecutor {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "PLAIN_TEXT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlainText";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Dialog extends HandlerExecutor {
        public static final Dialog OLrzqt = new Dialog();
        public static final java.lang.String copydefault = "SCANNED_PDF";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ScannedPdf";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class PendingIntent extends HandlerExecutor {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String AEQbTJ = "TEXTRACT_ANALYZE_DOCUMENT_JSON";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextractAnalyzeDocumentJson";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class FragmentManager extends HandlerExecutor {
        public static final FragmentManager copydefault = new FragmentManager();
        public static final java.lang.String AEQbTJ = "TEXTRACT_DETECT_DOCUMENT_TEXT_JSON";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextractDetectDocumentTextJson";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class Fragment extends HandlerExecutor {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.OLrzqt;
            }
            return fragment.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Fragment) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HandlerExecutor.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HandlerExecutor KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1700247168:
                    if (str.equals("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON")) {
                        return FragmentManager.copydefault;
                    }
                    break;
                case -704396118:
                    if (str.equals("NATIVE_PDF")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case 69775675:
                    if (str.equals("IMAGE")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case 422149603:
                    if (str.equals("SCANNED_PDF")) {
                        return Dialog.OLrzqt;
                    }
                    break;
                case 659660423:
                    if (str.equals("TEXTRACT_ANALYZE_DOCUMENT_JSON")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
                case 1536396962:
                    if (str.equals("PLAIN_TEXT")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 2084931075:
                    if (str.equals("MS_WORD")) {
                        return TaskDescription.OLrzqt;
                    }
                    break;
            }
            return new Fragment(str);
        }
    }
}
