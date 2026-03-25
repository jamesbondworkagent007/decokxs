package o;

import com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28783khL {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC28783khL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.khL$Activity */
    public static final class Activity extends AbstractC28783khL {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super(null);
        }
    }

    private AbstractC28783khL() {
    }

    /* JADX INFO: renamed from: o.khL$TaskDescription */
    public static final class TaskDescription extends AbstractC28783khL {
        public final BundleDetailData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, BundleDetailData bundleDetailData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bundleDetailData = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(bundleDetailData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull BundleDetailData bundleDetailData) {
            Intrinsics.checkNotNullParameter(bundleDetailData, "");
            return new TaskDescription(bundleDetailData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BundleDetailData KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(bundleDetail=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull BundleDetailData bundleDetailData) {
            super(null);
            Intrinsics.checkNotNullParameter(bundleDetailData, "");
            this.copydefault = bundleDetailData;
        }
    }

    /* JADX INFO: renamed from: o.khL$ActionBar */
    public static final class ActionBar extends AbstractC28783khL {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }
}
