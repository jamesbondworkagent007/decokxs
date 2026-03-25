package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VolumeRecord {
    public static final Activity KWHzl = new Activity(null);
    public static final java.util.List<VolumeRecord> AEQbTJ = yDY.gEmmrt(Application.EZpvd, StateListAnimator.copydefault, TaskDescription.EZpvd, PendingIntent.copydefault, FragmentManager.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.VolumeRecord.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VolumeRecord(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VolumeRecord() {
    }

    public static final class Application extends VolumeRecord {
        public static final Application EZpvd = new Application();
        public static final java.lang.String copydefault = "INTERNAL_SERVER_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InternalServerError";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends VolumeRecord {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String EZpvd = "PAGE_CHARACTERS_EXCEEDED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PageCharactersExceeded";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class TaskDescription extends VolumeRecord {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String copydefault = "PAGE_SIZE_EXCEEDED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PageSizeExceeded";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class PendingIntent extends VolumeRecord {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String OLrzqt = "TEXTRACT_BAD_PAGE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextractBadPage";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class FragmentManager extends VolumeRecord {
        public static final FragmentManager copydefault = new FragmentManager();
        public static final java.lang.String OLrzqt = "TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextractProvisionedThroughputExceeded";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class ActionBar extends VolumeRecord {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.VolumeRecord.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final VolumeRecord OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -630263762:
                    if (str.equals("INTERNAL_SERVER_ERROR")) {
                        return Application.EZpvd;
                    }
                    break;
                case -495995871:
                    if (str.equals("PAGE_SIZE_EXCEEDED")) {
                        return TaskDescription.EZpvd;
                    }
                    break;
                case -333701160:
                    if (str.equals("PAGE_CHARACTERS_EXCEEDED")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case 1091368555:
                    if (str.equals("TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED")) {
                        return FragmentManager.copydefault;
                    }
                    break;
                case 1939388699:
                    if (str.equals("TEXTRACT_BAD_PAGE")) {
                        return PendingIntent.copydefault;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}
