package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kis, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28869kis {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kis.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC28869kis(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.kis$Application */
    public static final class Application extends AbstractC28869kis {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1906698882;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Application() {
            super(null);
        }
    }

    private AbstractC28869kis() {
    }

    /* JADX INFO: renamed from: o.kis$TaskDescription */
    public static final class TaskDescription extends AbstractC28869kis {
        public final PumpLiveInfoData OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, PumpLiveInfoData pumpLiveInfoData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pumpLiveInfoData = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskDescription.copydefault;
            }
            return taskDescription.copydefault(pumpLiveInfoData, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PumpLiveInfoData EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull PumpLiveInfoData pumpLiveInfoData, boolean z) {
            Intrinsics.checkNotNullParameter(pumpLiveInfoData, "");
            return new TaskDescription(pumpLiveInfoData, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(data=" + this.OLrzqt + ", isLive=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PumpLiveInfoData pumpLiveInfoData, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(pumpLiveInfoData, "");
            this.OLrzqt = pumpLiveInfoData;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData, boolean):void (m)] (LINE:38) call: o.kis.TaskDescription.<init>(com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(PumpLiveInfoData pumpLiveInfoData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pumpLiveInfoData, (i & 2) != 0 ? true : z);
        }
    }

    /* JADX INFO: renamed from: o.kis$StateListAnimator */
    public static final class StateListAnimator extends AbstractC28869kis {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -705548598;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.kis$ActionBar */
    public static final class ActionBar extends AbstractC28869kis {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -705699313;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty";
        }

        private ActionBar() {
            super(null);
        }
    }
}
