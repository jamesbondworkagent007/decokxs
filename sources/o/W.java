package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class W {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final java.util.List<W> KWHzl = yDY.gEmmrt(Activity.EZpvd, ActionBar.copydefault, Application.AEQbTJ, TaskDescription.copydefault, Dialog.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.W.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ W(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private W() {
    }

    public static final class Activity extends W {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String copydefault = DebugCoroutineInfoImplKt.CREATED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Created";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends W {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String EZpvd = "EXPIRED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Expired";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends W {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String EZpvd = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends W {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String EZpvd = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Dialog extends W {
        public static final Dialog AEQbTJ = new Dialog();
        public static final java.lang.String copydefault = CardSyncResponse.SUCCEEDED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Succeeded";
        }

        private Dialog() {
            super(null);
        }
    }

    public static final class Fragment extends W {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.copydefault;
            }
            return fragment.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Fragment) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.W.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final W KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        return TaskDescription.copydefault;
                    }
                    break;
                case -591252731:
                    if (str.equals("EXPIRED")) {
                        return ActionBar.copydefault;
                    }
                    break;
                case -562638271:
                    if (str.equals(CardSyncResponse.SUCCEEDED)) {
                        return Dialog.AEQbTJ;
                    }
                    break;
                case 1746537160:
                    if (str.equals(DebugCoroutineInfoImplKt.CREATED)) {
                        return Activity.EZpvd;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Application.AEQbTJ;
                    }
                    break;
            }
            return new Fragment(str);
        }
    }
}
