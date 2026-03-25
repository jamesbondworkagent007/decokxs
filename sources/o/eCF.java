package o;

import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eCF {
    public final EIP7702WalletStatus OLrzqt;
    public final AbstractC12782ctV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EIP7702WalletStatus OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV copydefault() {
        return this.copydefault;
    }

    public eCF(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull EIP7702WalletStatus eIP7702WalletStatus) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(eIP7702WalletStatus, "");
        this.copydefault = abstractC12782ctV;
        this.OLrzqt = eIP7702WalletStatus;
    }
}
