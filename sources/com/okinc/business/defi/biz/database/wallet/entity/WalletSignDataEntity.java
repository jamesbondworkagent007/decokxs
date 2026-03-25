package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSignDataEntity {
    public static final int $stable = 0;
    private final int addressType;
    private final Long baseChainIndex;
    private final String baseChainSign;
    private final long chainIndex;
    private final String chainSign;
    private final int operationType;
    private final int syncType;
    private final String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.operationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.syncType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.baseChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.baseChainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSignDataEntity copy(@NotNull String str, int i, int i2, int i3, long j, @NotNull String str2, Long l, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletSignDataEntity(str, i, i2, i3, j, str2, l, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSignDataEntity)) {
            return false;
        }
        WalletSignDataEntity walletSignDataEntity = (WalletSignDataEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletSignDataEntity.walletId) && this.operationType == walletSignDataEntity.operationType && this.syncType == walletSignDataEntity.syncType && this.addressType == walletSignDataEntity.addressType && this.chainIndex == walletSignDataEntity.chainIndex && Intrinsics.EZpvd((Object) this.chainSign, (Object) walletSignDataEntity.chainSign) && Intrinsics.EZpvd(this.baseChainIndex, walletSignDataEntity.baseChainIndex) && Intrinsics.EZpvd((Object) this.baseChainSign, (Object) walletSignDataEntity.baseChainSign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBaseChainIndex() {
        return this.baseChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseChainSign() {
        return this.baseChainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSign() {
        return this.chainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOperationType() {
        return this.operationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSyncType() {
        return this.syncType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        int iHashCode2 = Integer.hashCode(this.operationType);
        int iHashCode3 = Integer.hashCode(this.syncType);
        int iHashCode4 = Integer.hashCode(this.addressType);
        int iHashCode5 = Long.hashCode(this.chainIndex);
        int iHashCode6 = this.chainSign.hashCode();
        Long l = this.baseChainIndex;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        String str = this.baseChainSign;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSignDataEntity(walletId=" + this.walletId + ", operationType=" + this.operationType + ", syncType=" + this.syncType + ", addressType=" + this.addressType + ", chainIndex=" + this.chainIndex + ", chainSign=" + this.chainSign + ", baseChainIndex=" + this.baseChainIndex + ", baseChainSign=" + this.baseChainSign + ")";
    }

    public WalletSignDataEntity(@NotNull String str, int i, int i2, int i3, long j, @NotNull String str2, Long l, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.walletId = str;
        this.operationType = i;
        this.syncType = i2;
        this.addressType = i3;
        this.chainIndex = j;
        this.chainSign = str2;
        this.baseChainIndex = l;
        this.baseChainSign = str3;
    }
}
