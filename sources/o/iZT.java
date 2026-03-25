package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iZT {

    public static final class Application implements iZT {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }

    public static final class TaskDescription implements iZT {
        public final DeFiTokenModelAssetDetail OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, DeFiTokenModelAssetDetail deFiTokenModelAssetDetail, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deFiTokenModelAssetDetail = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(deFiTokenModelAssetDetail);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull DeFiTokenModelAssetDetail deFiTokenModelAssetDetail) {
            Intrinsics.checkNotNullParameter(deFiTokenModelAssetDetail, "");
            return new TaskDescription(deFiTokenModelAssetDetail);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeFiTokenModelAssetDetail KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(assetDetail=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull DeFiTokenModelAssetDetail deFiTokenModelAssetDetail) {
            Intrinsics.checkNotNullParameter(deFiTokenModelAssetDetail, "");
            this.OLrzqt = deFiTokenModelAssetDetail;
        }
    }

    public static final class StateListAnimator implements iZT {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
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
