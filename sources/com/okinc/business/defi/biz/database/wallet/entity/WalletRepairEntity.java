package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletRepairEntity {
    public static final int $stable = 8;
    private String extJson;
    private int identifierType;
    private String reserved;
    private int status;
    private long timestamp;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletRepairEntity() {
        this(null, 0, 0, null, null, 0L, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletRepairEntity copy$default(WalletRepairEntity walletRepairEntity, String str, int i, int i2, String str2, String str3, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = walletRepairEntity.walletId;
        }
        if ((i3 & 2) != 0) {
            i = walletRepairEntity.identifierType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = walletRepairEntity.status;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = walletRepairEntity.reserved;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = walletRepairEntity.extJson;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            j = walletRepairEntity.timestamp;
        }
        return walletRepairEntity.copy(str, i4, i5, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.identifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.reserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.extJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletRepairEntity copy(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new WalletRepairEntity(str, i, i2, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletRepairEntity)) {
            return false;
        }
        WalletRepairEntity walletRepairEntity = (WalletRepairEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletRepairEntity.walletId) && this.identifierType == walletRepairEntity.identifierType && this.status == walletRepairEntity.status && Intrinsics.EZpvd((Object) this.reserved, (Object) walletRepairEntity.reserved) && Intrinsics.EZpvd((Object) this.extJson, (Object) walletRepairEntity.extJson) && this.timestamp == walletRepairEntity.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtJson() {
        return this.extJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIdentifierType() {
        return this.identifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserved() {
        return this.reserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + Integer.hashCode(this.identifierType)) * 31) + Integer.hashCode(this.status)) * 31) + this.reserved.hashCode()) * 31) + this.extJson.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdentifierType(int i) {
        this.identifierType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserved(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reserved = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletRepairEntity(walletId=" + this.walletId + ", identifierType=" + this.identifierType + ", status=" + this.status + ", reserved=" + this.reserved + ", extJson=" + this.extJson + ", timestamp=" + this.timestamp + ")";
    }

    public WalletRepairEntity(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.walletId = str;
        this.identifierType = i;
        this.status = i2;
        this.reserved = str2;
        this.extJson = str3;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String, long):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ WalletRepairEntity(String str, int i, int i2, String str2, String str3, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str2, (i3 & 16) == 0 ? str3 : "", (i3 & 32) != 0 ? 0L : j);
    }
}
