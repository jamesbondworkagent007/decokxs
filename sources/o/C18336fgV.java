package o;

import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18336fgV {
    public static final int EZpvd = HDWalletCloudBackupBean.$stable;
    public final boolean AEQbTJ;
    public final HDWalletCloudBackupBean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18336fgV copy$default(C18336fgV c18336fgV, boolean z, HDWalletCloudBackupBean hDWalletCloudBackupBean, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c18336fgV.AEQbTJ;
        }
        if ((i & 2) != 0) {
            hDWalletCloudBackupBean = c18336fgV.OLrzqt;
        }
        if ((i & 4) != 0) {
            z2 = c18336fgV.copydefault;
        }
        return c18336fgV.AEQbTJ(z, hDWalletCloudBackupBean, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18336fgV AEQbTJ(boolean z, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean, boolean z2) {
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        return new C18336fgV(z, hDWalletCloudBackupBean, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HDWalletCloudBackupBean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18336fgV)) {
            return false;
        }
        C18336fgV c18336fgV = (C18336fgV) obj;
        return this.AEQbTJ == c18336fgV.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c18336fgV.OLrzqt) && this.copydefault == c18336fgV.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupContentBean(onDevicesStatus=" + this.AEQbTJ + ", cloudBackupBean=" + this.OLrzqt + ", isWalletTypeSupport=" + this.copydefault + ")";
    }

    public C18336fgV(boolean z, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean, boolean z2) {
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        this.AEQbTJ = z;
        this.OLrzqt = hDWalletCloudBackupBean;
        this.copydefault = z2;
    }
}
