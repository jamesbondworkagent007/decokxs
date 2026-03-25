package o;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28637keY {

    /* JADX INFO: renamed from: o.keY$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28637keY {
        public final java.util.List<C28696kfe> AEQbTJ;
        public final ConfigInfoData KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.keY$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, ConfigInfoData configInfoData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                configInfoData = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(list, configInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(java.util.List<C28696kfe> list, ConfigInfoData configInfoData) {
            return new StateListAnimator(list, configInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C28696kfe> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfigInfoData copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.util.List<C28696kfe> list = this.AEQbTJ;
            int iHashCode = list == null ? 0 : list.hashCode();
            ConfigInfoData configInfoData = this.KWHzl;
            return (iHashCode * 31) + (configInfoData != null ? configInfoData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loading(tabs=" + this.AEQbTJ + ", config=" + this.KWHzl + ")";
        }

        public StateListAnimator(java.util.List<C28696kfe> list, ConfigInfoData configInfoData) {
            this.AEQbTJ = list;
            this.KWHzl = configInfoData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:com.okinc.business.market.features.meme.domain.model.ConfigInfoData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.ConfigInfoData) : (r3v0 com.okinc.business.market.features.meme.domain.model.ConfigInfoData))
 A[MD:(java.util.List<o.kfe>, com.okinc.business.market.features.meme.domain.model.ConfigInfoData):void (m)] (LINE:249) call: o.keY.StateListAnimator.<init>(java.util.List, com.okinc.business.market.features.meme.domain.model.ConfigInfoData):void type: THIS */
        public /* synthetic */ StateListAnimator(java.util.List list, ConfigInfoData configInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : configInfoData);
        }
    }

    /* JADX INFO: renamed from: o.keY$Activity */
    public static final class Activity implements InterfaceC28637keY {
        public final java.util.List<C28696kfe> KWHzl;
        public final ConfigInfoData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.keY$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, ConfigInfoData configInfoData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                configInfoData = activity.copydefault;
            }
            return activity.KWHzl(list, configInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C28696kfe> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.util.List<C28696kfe> list, @NotNull ConfigInfoData configInfoData) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(configInfoData, "");
            return new Activity(list, configInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfigInfoData OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tabs=" + this.KWHzl + ", config=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.util.List<C28696kfe> list, @NotNull ConfigInfoData configInfoData) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(configInfoData, "");
            this.KWHzl = list;
            this.copydefault = configInfoData;
        }
    }

    /* JADX INFO: renamed from: o.keY$TaskDescription */
    public static final class TaskDescription implements InterfaceC28637keY {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }
}
