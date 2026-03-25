package o;

import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17923fXh {

    /* JADX INFO: renamed from: o.fXh$ActionBar */
    public static final class ActionBar {
        public final java.util.Map<java.lang.String, EIP7702WalletStatus> KWHzl;
        public final java.util.Map<java.lang.String, TeeStatus> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fXh$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                map2 = actionBar.KWHzl;
            }
            return actionBar.KWHzl(map, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.util.Map<java.lang.String, TeeStatus> map, @NotNull java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            return new ActionBar(map, map2);
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
            return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TeeAndEip7702Status(teeStatusMap=" + this.copydefault + ", eip7702StatusMap=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.Map<java.lang.String, TeeStatus> map, @NotNull java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.copydefault = map;
            this.KWHzl = map2;
        }
    }
}
