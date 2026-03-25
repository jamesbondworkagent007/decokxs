package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IHwInterface {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final java.util.List<IHwInterface> AEQbTJ = yDY.gEmmrt(Activity.KWHzl, Application.KWHzl, StateListAnimator.EZpvd, TaskDescription.copydefault, PendingIntent.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IHwInterface.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IHwInterface(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private IHwInterface() {
    }

    public static final class Activity extends IHwInterface {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String EZpvd = "CREATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Creating";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends IHwInterface {
        public static final Application KWHzl = new Application();
        public static final java.lang.String copydefault = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends IHwInterface {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String KWHzl = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class TaskDescription extends IHwInterface {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String EZpvd = "IN_SERVICE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InService";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class PendingIntent extends IHwInterface {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String EZpvd = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class LoaderManager extends IHwInterface {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.KWHzl;
            }
            return loaderManager.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IHwInterface
        public java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((LoaderManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IHwInterface.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final IHwInterface AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1691918663:
                    if (str.equals("CREATING")) {
                        return Activity.KWHzl;
                    }
                    break;
                case 57281915:
                    if (str.equals("IN_SERVICE")) {
                        return TaskDescription.copydefault;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return Application.KWHzl;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return PendingIntent.copydefault;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
