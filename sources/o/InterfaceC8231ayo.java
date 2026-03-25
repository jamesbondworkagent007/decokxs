package o;

import com.okinc.assets.backend.api.model.InvalidAssetListResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ayo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8231ayo {

    /* JADX INFO: renamed from: o.ayo$TaskDescription */
    public static final class TaskDescription implements InterfaceC8231ayo {
        public final int KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.KWHzl;
            }
            if ((i2 & 2) != 0) {
                z = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(int i, boolean z) {
            return new TaskDescription(i, z);
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
            return this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Tradable(currencyId=" + this.KWHzl + ", isOnChain=" + this.copydefault + ")";
        }

        public TaskDescription(int i, boolean z) {
            this.KWHzl = i;
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.ayo$ActionBar */
    public static final class ActionBar implements InterfaceC8231ayo {
        public final InvalidAssetListResp KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, InvalidAssetListResp invalidAssetListResp, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                invalidAssetListResp = actionBar.KWHzl;
            }
            return actionBar.EZpvd(i, invalidAssetListResp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(int i, InvalidAssetListResp invalidAssetListResp) {
            return new ActionBar(i, invalidAssetListResp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
            InvalidAssetListResp invalidAssetListResp = this.KWHzl;
            return (iHashCode * 31) + (invalidAssetListResp == null ? 0 : invalidAssetListResp.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Untradable(currencyId=" + this.OLrzqt + ", untradableResponse=" + this.KWHzl + ")";
        }

        public ActionBar(int i, InvalidAssetListResp invalidAssetListResp) {
            this.OLrzqt = i;
            this.KWHzl = invalidAssetListResp;
        }
    }
}
