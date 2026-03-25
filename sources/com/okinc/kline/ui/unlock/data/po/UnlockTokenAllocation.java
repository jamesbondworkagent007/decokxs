package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenAllocation {
    public static final int $stable = 8;

    @SerializedName("ccy")
    private final String ccy;

    @SerializedName("list")
    private final List<UnlockTokenAllocationInfo> list;

    @SerializedName("maxSupply")
    private final String maxSupply;

    @SerializedName("unlockedTs")
    private final String unlockedTs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocation */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlockTokenAllocation copy$default(UnlockTokenAllocation unlockTokenAllocation, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockTokenAllocation.ccy;
        }
        if ((i & 2) != 0) {
            list = unlockTokenAllocation.list;
        }
        if ((i & 4) != 0) {
            str2 = unlockTokenAllocation.maxSupply;
        }
        if ((i & 8) != 0) {
            str3 = unlockTokenAllocation.unlockedTs;
        }
        return unlockTokenAllocation.copy(str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnlockTokenAllocationInfo> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.unlockedTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockTokenAllocation copy(@NotNull String str, @NotNull List<UnlockTokenAllocationInfo> list, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UnlockTokenAllocation(str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockTokenAllocation)) {
            return false;
        }
        UnlockTokenAllocation unlockTokenAllocation = (UnlockTokenAllocation) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) unlockTokenAllocation.ccy) && Intrinsics.EZpvd(this.list, unlockTokenAllocation.list) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) unlockTokenAllocation.maxSupply) && Intrinsics.EZpvd((Object) this.unlockedTs, (Object) unlockTokenAllocation.unlockedTs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnlockTokenAllocationInfo> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSupply() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlockedTs() {
        return this.unlockedTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ccy.hashCode() * 31) + this.list.hashCode()) * 31) + this.maxSupply.hashCode()) * 31) + this.unlockedTs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockTokenAllocation(ccy=" + this.ccy + ", list=" + this.list + ", maxSupply=" + this.maxSupply + ", unlockedTs=" + this.unlockedTs + ")";
    }

    public UnlockTokenAllocation(@NotNull String str, @NotNull List<UnlockTokenAllocationInfo> list, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ccy = str;
        this.list = list;
        this.maxSupply = str2;
        this.unlockedTs = str3;
    }
}
