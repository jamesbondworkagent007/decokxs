package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28796khY {

    /* JADX INFO: renamed from: o.khY$Activity */
    public static final class Activity implements InterfaceC28796khY {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1824735500;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.khY$TaskDescription */
    public static final class TaskDescription implements InterfaceC28796khY {
        public final HolderInfoData AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, HolderInfoData holderInfoData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                holderInfoData = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(holderInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HolderInfoData OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull HolderInfoData holderInfoData) {
            Intrinsics.checkNotNullParameter(holderInfoData, "");
            return new TaskDescription(holderInfoData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(holderInfo=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull HolderInfoData holderInfoData) {
            Intrinsics.checkNotNullParameter(holderInfoData, "");
            this.AEQbTJ = holderInfoData;
        }
    }

    /* JADX INFO: renamed from: o.khY$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28796khY {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
