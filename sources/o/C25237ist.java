package o;

import com.okinc.wallet.api.WalletDexService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ist, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25237ist {
    public static final int EZpvd = WalletDexService.SupportedMevNodeBean.$stable;
    public final WalletDexService.SupportedMevNodeBean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25237ist copy$default(C25237ist c25237ist, WalletDexService.SupportedMevNodeBean supportedMevNodeBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            supportedMevNodeBean = c25237ist.KWHzl;
        }
        return c25237ist.OLrzqt(supportedMevNodeBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletDexService.SupportedMevNodeBean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25237ist OLrzqt(@NotNull WalletDexService.SupportedMevNodeBean supportedMevNodeBean) {
        Intrinsics.checkNotNullParameter(supportedMevNodeBean, "");
        return new C25237ist(supportedMevNodeBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25237ist) && Intrinsics.EZpvd(this.KWHzl, ((C25237ist) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MEVSupportedNodeItem(nodeBean=" + this.KWHzl + ")";
    }

    public C25237ist(@NotNull WalletDexService.SupportedMevNodeBean supportedMevNodeBean) {
        Intrinsics.checkNotNullParameter(supportedMevNodeBean, "");
        this.KWHzl = supportedMevNodeBean;
    }
}
