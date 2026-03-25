package o;

import com.okinc.business.dexlogic.bean.ShareLinkVO;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29021kll {

    /* JADX INFO: renamed from: o.kll$ActionBar */
    public static final class ActionBar implements InterfaceC29021kll {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kll$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements InterfaceC29021kll {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kll$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC29021kll {
        public final C28899kjV EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C28899kjV c28899kjV, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28899kjV = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(c28899kjV, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull C28899kjV c28899kjV, boolean z) {
            Intrinsics.checkNotNullParameter(c28899kjV, "");
            return new TaskDescription(c28899kjV, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C28899kjV OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(moduleDetail=" + this.EZpvd + ", isWebsocket=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull C28899kjV c28899kjV, boolean z) {
            Intrinsics.checkNotNullParameter(c28899kjV, "");
            this.EZpvd = c28899kjV;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.kll$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC29021kll {
        public final ShareLinkVO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, ShareLinkVO shareLinkVO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                shareLinkVO = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(shareLinkVO);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShareLinkVO AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(ShareLinkVO shareLinkVO) {
            return new StateListAnimator(shareLinkVO);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ShareLinkVO shareLinkVO = this.KWHzl;
            if (shareLinkVO == null) {
                return 0;
            }
            return shareLinkVO.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Config(shareLinkConfig=" + this.KWHzl + ")";
        }

        public StateListAnimator(ShareLinkVO shareLinkVO) {
            this.KWHzl = shareLinkVO;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ShareLinkVO:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ShareLinkVO) : (r1v0 com.okinc.business.dexlogic.bean.ShareLinkVO))
 A[MD:(com.okinc.business.dexlogic.bean.ShareLinkVO):void (m)] (LINE:28) call: o.kll.StateListAnimator.<init>(com.okinc.business.dexlogic.bean.ShareLinkVO):void type: THIS */
        public /* synthetic */ StateListAnimator(ShareLinkVO shareLinkVO, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : shareLinkVO);
        }
    }
}
