package o;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27023jnP {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jnP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC27023jnP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jnP$StateListAnimator */
    public static final class StateListAnimator extends AbstractC27023jnP {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    private AbstractC27023jnP() {
    }

    /* JADX INFO: renamed from: o.jnP$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription extends AbstractC27023jnP {
        public final InvestUniv3SubscribeInfo AEQbTJ;
        public final java.util.List<C27022jnO> KWHzl;
        public final InvestUniv3SubscribeInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jnP$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, InvestUniv3SubscribeInfo investUniv3SubscribeInfo, InvestUniv3SubscribeInfo investUniv3SubscribeInfo2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                investUniv3SubscribeInfo = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                investUniv3SubscribeInfo2 = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(list, investUniv3SubscribeInfo, investUniv3SubscribeInfo2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C27022jnO> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestUniv3SubscribeInfo EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.util.List<C27022jnO> list, InvestUniv3SubscribeInfo investUniv3SubscribeInfo, InvestUniv3SubscribeInfo investUniv3SubscribeInfo2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list, investUniv3SubscribeInfo, investUniv3SubscribeInfo2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestUniv3SubscribeInfo copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.AEQbTJ;
            int iHashCode2 = investUniv3SubscribeInfo == null ? 0 : investUniv3SubscribeInfo.hashCode();
            InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (investUniv3SubscribeInfo2 != null ? investUniv3SubscribeInfo2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tabs=" + this.KWHzl + ", singleInfo=" + this.AEQbTJ + ", multiInfo=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.util.List<C27022jnO> list, InvestUniv3SubscribeInfo investUniv3SubscribeInfo, InvestUniv3SubscribeInfo investUniv3SubscribeInfo2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.AEQbTJ = investUniv3SubscribeInfo;
            this.copydefault = investUniv3SubscribeInfo2;
        }
    }

    /* JADX INFO: renamed from: o.jnP$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends AbstractC27023jnP {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            return activity.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }
}
