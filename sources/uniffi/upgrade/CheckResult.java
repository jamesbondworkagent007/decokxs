package uniffi.upgrade;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CheckResult {
    public static final int $stable = 8;
    private boolean allForce;
    private boolean canShow;
    private String serverInfo;
    private int upgradeType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckResult copy$default(CheckResult checkResult, boolean z, int i, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = checkResult.canShow;
        }
        if ((i2 & 2) != 0) {
            i = checkResult.upgradeType;
        }
        if ((i2 & 4) != 0) {
            str = checkResult.serverInfo;
        }
        if ((i2 & 8) != 0) {
            z2 = checkResult.allForce;
        }
        return checkResult.copy(z, i, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.canShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.upgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.serverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.allForce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckResult copy(boolean z, int i, @NotNull String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckResult(z, i, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckResult)) {
            return false;
        }
        CheckResult checkResult = (CheckResult) obj;
        return this.canShow == checkResult.canShow && this.upgradeType == checkResult.upgradeType && Intrinsics.EZpvd((Object) this.serverInfo, (Object) checkResult.serverInfo) && this.allForce == checkResult.allForce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllForce() {
        return this.allForce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanShow() {
        return this.canShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerInfo() {
        return this.serverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpgradeType() {
        return this.upgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.canShow) * 31) + Integer.hashCode(this.upgradeType)) * 31) + this.serverInfo.hashCode()) * 31) + Boolean.hashCode(this.allForce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllForce(boolean z) {
        this.allForce = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanShow(boolean z) {
        this.canShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServerInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serverInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeType(int i) {
        this.upgradeType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckResult(canShow=" + this.canShow + ", upgradeType=" + this.upgradeType + ", serverInfo=" + this.serverInfo + ", allForce=" + this.allForce + ")";
    }

    public CheckResult(boolean z, int i, @NotNull String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.canShow = z;
        this.upgradeType = i;
        this.serverInfo = str;
        this.allForce = z2;
    }
}
