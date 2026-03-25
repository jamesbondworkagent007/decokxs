package o;

import com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10310blz {

    /* JADX INFO: renamed from: o.blz$Activity */
    public static final class Activity implements InterfaceC10310blz {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.blz$TaskDescription */
    public static final class TaskDescription implements InterfaceC10310blz {
        public final java.lang.Throwable EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = taskDescription.EZpvd;
            }
            return taskDescription.EZpvd(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(e=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = th;
        }
    }

    /* JADX INFO: renamed from: o.blz$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC10310blz {
        public final java.util.List<UtxoAssetDisplayItem> AEQbTJ;
        public final java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.blz$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                list2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.KWHzl(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<UtxoAssetDisplayItem> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<UtxoAssetDisplayItem> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new StateListAnimator(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(unknownAssets=" + this.copydefault + ", items=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<UtxoAssetDisplayItem> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.copydefault = list;
            this.AEQbTJ = list2;
        }
    }
}
