package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC11162cE {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<AbstractC11162cE> AEQbTJ = yDY.gEmmrt(Activity.OLrzqt, Application.OLrzqt, ActionBar.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cE.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC11162cE(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC11162cE() {
    }

    /* JADX INFO: renamed from: o.cE$Activity */
    public static final class Activity extends AbstractC11162cE {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String EZpvd = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cE$Application */
    public static final class Application extends AbstractC11162cE {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String EZpvd = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cE$ActionBar */
    public static final class ActionBar extends AbstractC11162cE {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String copydefault = CardSyncResponse.SUCCEEDED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Succeeded";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cE$StateListAnimator */
    public static final class StateListAnimator extends AbstractC11162cE {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.EZpvd;
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
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.cE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC11162cE OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -604548089) {
                if (iHashCode != -562638271) {
                    if (iHashCode == 2066319421 && str.equals(CardSyncResponse.FAILED)) {
                        return Activity.OLrzqt;
                    }
                } else if (str.equals(CardSyncResponse.SUCCEEDED)) {
                    return ActionBar.EZpvd;
                }
            } else if (str.equals("IN_PROGRESS")) {
                return Application.OLrzqt;
            }
            return new StateListAnimator(str);
        }
    }
}
