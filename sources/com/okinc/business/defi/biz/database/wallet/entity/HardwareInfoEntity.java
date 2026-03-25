package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HardwareInfoEntity {
    public static final int $stable = 8;
    private long createAt;
    private String data;
    private String hardwareName;
    private String hardwarePassphraseId;
    private String hardwareSystem;
    private int hardwareType;
    private String hardwareUniqueId;
    private String rootWalletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HardwareInfoEntity() {
        this(null, null, null, null, 0, null, 0L, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hardwareUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.hardwarePassphraseId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.hardwareName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.hardwareSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.hardwareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HardwareInfoEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, long j, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new HardwareInfoEntity(str, str2, str3, str4, i, str5, j, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HardwareInfoEntity)) {
            return false;
        }
        HardwareInfoEntity hardwareInfoEntity = (HardwareInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.hardwareUniqueId, (Object) hardwareInfoEntity.hardwareUniqueId) && Intrinsics.EZpvd((Object) this.hardwarePassphraseId, (Object) hardwareInfoEntity.hardwarePassphraseId) && Intrinsics.EZpvd((Object) this.hardwareName, (Object) hardwareInfoEntity.hardwareName) && Intrinsics.EZpvd((Object) this.hardwareSystem, (Object) hardwareInfoEntity.hardwareSystem) && this.hardwareType == hardwareInfoEntity.hardwareType && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) hardwareInfoEntity.rootWalletId) && this.createAt == hardwareInfoEntity.createAt && Intrinsics.EZpvd((Object) this.data, (Object) hardwareInfoEntity.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHardwareName() {
        return this.hardwareName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHardwarePassphraseId() {
        return this.hardwarePassphraseId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHardwareSystem() {
        return this.hardwareSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHardwareType() {
        return this.hardwareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHardwareUniqueId() {
        return this.hardwareUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.hardwareUniqueId.hashCode();
        int iHashCode2 = this.hardwarePassphraseId.hashCode();
        int iHashCode3 = this.hardwareName.hashCode();
        int iHashCode4 = this.hardwareSystem.hashCode();
        int iHashCode5 = Integer.hashCode(this.hardwareType);
        int iHashCode6 = this.rootWalletId.hashCode();
        int iHashCode7 = Long.hashCode(this.createAt);
        String str = this.data;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHardwareName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hardwareName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHardwarePassphraseId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hardwarePassphraseId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHardwareSystem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hardwareSystem = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHardwareType(int i) {
        this.hardwareType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHardwareUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hardwareUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRootWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rootWalletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HardwareInfoEntity(hardwareUniqueId=" + this.hardwareUniqueId + ", hardwarePassphraseId=" + this.hardwarePassphraseId + ", hardwareName=" + this.hardwareName + ", hardwareSystem=" + this.hardwareSystem + ", hardwareType=" + this.hardwareType + ", rootWalletId=" + this.rootWalletId + ", createAt=" + this.createAt + ", data=" + this.data + ")";
    }

    public HardwareInfoEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, long j, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.hardwareUniqueId = str;
        this.hardwarePassphraseId = str2;
        this.hardwareName = str3;
        this.hardwareSystem = str4;
        this.hardwareType = i;
        this.rootWalletId = str5;
        this.createAt = j;
        this.data = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ HardwareInfoEntity(String str, String str2, String str3, String str4, int i, String str5, long j, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? 0L : j, (i2 & 128) == 0 ? str6 : "");
    }
}
