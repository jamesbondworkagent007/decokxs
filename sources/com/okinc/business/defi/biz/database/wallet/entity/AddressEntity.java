package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressEntity {
    public static final int $stable = 8;
    private String address;
    private long coinId;
    private long createAt;
    private String domain;
    private String remark;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressEntity() {
        this(null, 0L, null, 0L, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressEntity copy$default(AddressEntity addressEntity, String str, long j, String str2, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressEntity.address;
        }
        if ((i & 2) != 0) {
            j = addressEntity.coinId;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            str2 = addressEntity.remark;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j2 = addressEntity.createAt;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            str3 = addressEntity.domain;
        }
        return addressEntity.copy(str, j3, str4, j4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressEntity copy(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressEntity(str, j, str2, j2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEntity)) {
            return false;
        }
        AddressEntity addressEntity = (AddressEntity) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressEntity.address) && this.coinId == addressEntity.coinId && Intrinsics.EZpvd((Object) this.remark, (Object) addressEntity.remark) && this.createAt == addressEntity.createAt && Intrinsics.EZpvd((Object) this.domain, (Object) addressEntity.domain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.address.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.remark.hashCode()) * 31) + Long.hashCode(this.createAt)) * 31) + this.domain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.remark = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressEntity(address=" + this.address + ", coinId=" + this.coinId + ", remark=" + this.remark + ", createAt=" + this.createAt + ", domain=" + this.domain + ")";
    }

    public AddressEntity(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.address = str;
        this.coinId = j;
        this.remark = str2;
        this.createAt = j2;
        this.domain = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r11v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, long, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.biz.database.wallet.entity.AddressEntity.<init>(java.lang.String, long, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ AddressEntity(String str, long j, String str2, long j2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? "" : str3);
    }
}
