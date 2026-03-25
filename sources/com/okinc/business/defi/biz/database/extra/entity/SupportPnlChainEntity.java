package com.okinc.business.defi.biz.database.extra.entity;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SupportPnlChainEntity {
    public static final int $stable = 8;
    private long chainId;
    private String chainLogo;
    private String chainName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportPnlChainEntity copy$default(SupportPnlChainEntity supportPnlChainEntity, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = supportPnlChainEntity.chainId;
        }
        if ((i & 2) != 0) {
            str = supportPnlChainEntity.chainName;
        }
        if ((i & 4) != 0) {
            str2 = supportPnlChainEntity.chainLogo;
        }
        return supportPnlChainEntity.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportPnlChainEntity copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SupportPnlChainEntity(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportPnlChainEntity)) {
            return false;
        }
        SupportPnlChainEntity supportPnlChainEntity = (SupportPnlChainEntity) obj;
        return this.chainId == supportPnlChainEntity.chainId && Intrinsics.EZpvd((Object) this.chainName, (Object) supportPnlChainEntity.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) supportPnlChainEntity.chainLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainId) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportPnlChainEntity(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ")";
    }

    public SupportPnlChainEntity(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = j;
        this.chainName = str;
        this.chainLogo = str2;
    }
}
