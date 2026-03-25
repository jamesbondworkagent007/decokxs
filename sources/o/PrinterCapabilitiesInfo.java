package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PrinterCapabilitiesInfo {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final java.util.List<PrinterCapabilitiesInfo> copydefault = yDY.gEmmrt(Activity.AEQbTJ, TaskDescription.EZpvd, StateListAnimator.KWHzl, Application.EZpvd, LoaderManager.EZpvd, FragmentManager.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PrinterCapabilitiesInfo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PrinterCapabilitiesInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private PrinterCapabilitiesInfo() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity extends PrinterCapabilitiesInfo {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String KWHzl = "de";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "De";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription extends PrinterCapabilitiesInfo {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String KWHzl = "en";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "En";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator extends PrinterCapabilitiesInfo {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String EZpvd = "es";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Es";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application extends PrinterCapabilitiesInfo {
        public static final Application EZpvd = new Application();
        public static final java.lang.String KWHzl = "fr";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Fr";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class LoaderManager extends PrinterCapabilitiesInfo {
        public static final LoaderManager EZpvd = new LoaderManager();
        public static final java.lang.String KWHzl = "it";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "It";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class FragmentManager extends PrinterCapabilitiesInfo {
        public static final FragmentManager EZpvd = new FragmentManager();
        public static final java.lang.String KWHzl = "pt";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Pt";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class PendingIntent extends PrinterCapabilitiesInfo {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            return pendingIntent.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.PrinterCapabilitiesInfo
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PrinterCapabilitiesInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=6] */
        public final PrinterCapabilitiesInfo EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != 3201) {
                if (iHashCode != 3241) {
                    if (iHashCode != 3246) {
                        if (iHashCode != 3276) {
                            if (iHashCode != 3371) {
                                if (iHashCode == 3588 && str.equals("pt")) {
                                    return FragmentManager.EZpvd;
                                }
                            } else if (str.equals("it")) {
                                return LoaderManager.EZpvd;
                            }
                        } else if (str.equals("fr")) {
                            return Application.EZpvd;
                        }
                    } else if (str.equals("es")) {
                        return StateListAnimator.KWHzl;
                    }
                } else if (str.equals("en")) {
                    return TaskDescription.EZpvd;
                }
            } else if (str.equals("de")) {
                return Activity.AEQbTJ;
            }
            return new PendingIntent(str);
        }
    }
}
