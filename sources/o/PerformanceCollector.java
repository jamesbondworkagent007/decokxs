package o;

import com.google.android.gms.stats.CodePackage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PerformanceCollector {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final java.util.List<PerformanceCollector> OLrzqt = yDY.gEmmrt(ActionBar.KWHzl, StateListAnimator.EZpvd, Application.KWHzl, Activity.KWHzl, LoaderManager.AEQbTJ, PendingIntent.KWHzl, Fragment.AEQbTJ, FragmentManager.AEQbTJ, SharedElementCallback.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PerformanceCollector.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PerformanceCollector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private PerformanceCollector() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar extends PerformanceCollector {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String AEQbTJ = "COMMERCIAL_ITEM";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CommercialItem";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator extends PerformanceCollector {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "DATE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Date";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application extends PerformanceCollector {
        public static final Application KWHzl = new Application();
        public static final java.lang.String AEQbTJ = "EVENT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Event";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity extends PerformanceCollector {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String EZpvd = CodePackage.LOCATION;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Location";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class LoaderManager extends PerformanceCollector {
        public static final LoaderManager AEQbTJ = new LoaderManager();
        public static final java.lang.String KWHzl = "ORGANIZATION";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Organization";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class PendingIntent extends PerformanceCollector {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String EZpvd = "OTHER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Other";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Fragment extends PerformanceCollector {
        public static final Fragment AEQbTJ = new Fragment();
        public static final java.lang.String EZpvd = "PERSON";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Person";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class FragmentManager extends PerformanceCollector {
        public static final FragmentManager AEQbTJ = new FragmentManager();
        public static final java.lang.String EZpvd = "QUANTITY";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Quantity";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class SharedElementCallback extends PerformanceCollector {
        public static final SharedElementCallback KWHzl = new SharedElementCallback();
        public static final java.lang.String EZpvd = "TITLE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Title";
        }

        private SharedElementCallback() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Dialog extends PerformanceCollector {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.EZpvd;
            }
            return dialog.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PerformanceCollector
        public java.lang.String EZpvd() {
            return this.EZpvd;
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
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Dialog) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PerformanceCollector.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=9] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final PerformanceCollector KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1938387115:
                    if (str.equals("PERSON")) {
                        return Fragment.AEQbTJ;
                    }
                    break;
                case -1611296843:
                    if (str.equals(CodePackage.LOCATION)) {
                        return Activity.KWHzl;
                    }
                    break;
                case -798763725:
                    if (str.equals("ORGANIZATION")) {
                        return LoaderManager.AEQbTJ;
                    }
                    break;
                case -502377333:
                    if (str.equals("QUANTITY")) {
                        return FragmentManager.AEQbTJ;
                    }
                    break;
                case 2090926:
                    if (str.equals("DATE")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case 66353786:
                    if (str.equals("EVENT")) {
                        return Application.KWHzl;
                    }
                    break;
                case 75532016:
                    if (str.equals("OTHER")) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case 79833656:
                    if (str.equals("TITLE")) {
                        return SharedElementCallback.KWHzl;
                    }
                    break;
                case 159482600:
                    if (str.equals("COMMERCIAL_ITEM")) {
                        return ActionBar.KWHzl;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
