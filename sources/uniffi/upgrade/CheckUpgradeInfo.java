package uniffi.upgrade;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CheckUpgradeInfo {
    public static final int $stable = 8;
    private String appVersion;
    private String channel;
    private Map<String, String> headers;
    private boolean ignoreGray;
    private boolean ignoreInterval;
    private String isHarmony;
    private boolean useCache;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: uniffi.upgrade.CheckUpgradeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckUpgradeInfo copy$default(CheckUpgradeInfo checkUpgradeInfo, boolean z, boolean z2, boolean z3, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkUpgradeInfo.useCache;
        }
        if ((i & 2) != 0) {
            z2 = checkUpgradeInfo.ignoreGray;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = checkUpgradeInfo.ignoreInterval;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            str = checkUpgradeInfo.isHarmony;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = checkUpgradeInfo.appVersion;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = checkUpgradeInfo.channel;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            map = checkUpgradeInfo.headers;
        }
        return checkUpgradeInfo.copy(z, z4, z5, str4, str5, str6, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.useCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.ignoreGray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.ignoreInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isHarmony;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component7() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckUpgradeInfo copy(boolean z, boolean z2, boolean z3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new CheckUpgradeInfo(z, z2, z3, str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUpgradeInfo)) {
            return false;
        }
        CheckUpgradeInfo checkUpgradeInfo = (CheckUpgradeInfo) obj;
        return this.useCache == checkUpgradeInfo.useCache && this.ignoreGray == checkUpgradeInfo.ignoreGray && this.ignoreInterval == checkUpgradeInfo.ignoreInterval && Intrinsics.EZpvd((Object) this.isHarmony, (Object) checkUpgradeInfo.isHarmony) && Intrinsics.EZpvd((Object) this.appVersion, (Object) checkUpgradeInfo.appVersion) && Intrinsics.EZpvd((Object) this.channel, (Object) checkUpgradeInfo.channel) && Intrinsics.EZpvd(this.headers, checkUpgradeInfo.headers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIgnoreGray() {
        return this.ignoreGray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIgnoreInterval() {
        return this.ignoreInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseCache() {
        return this.useCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.useCache) * 31) + Boolean.hashCode(this.ignoreGray)) * 31) + Boolean.hashCode(this.ignoreInterval)) * 31) + this.isHarmony.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.headers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isHarmony() {
        return this.isHarmony;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHarmony(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isHarmony = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.headers = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnoreGray(boolean z) {
        this.ignoreGray = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnoreInterval(boolean z) {
        this.ignoreInterval = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseCache(boolean z) {
        this.useCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckUpgradeInfo(useCache=" + this.useCache + ", ignoreGray=" + this.ignoreGray + ", ignoreInterval=" + this.ignoreInterval + ", isHarmony=" + this.isHarmony + ", appVersion=" + this.appVersion + ", channel=" + this.channel + ", headers=" + this.headers + ")";
    }

    public CheckUpgradeInfo(boolean z, boolean z2, boolean z3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.useCache = z;
        this.ignoreGray = z2;
        this.ignoreInterval = z3;
        this.isHarmony = str;
        this.appVersion = str2;
        this.channel = str3;
        this.headers = map;
    }
}
