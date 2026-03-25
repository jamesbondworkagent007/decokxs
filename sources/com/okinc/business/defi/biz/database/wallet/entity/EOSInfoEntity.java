package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EOSInfoEntity {
    public static final int $stable = 8;
    private String accountName;
    private String activeKey;
    private String ownerKey;
    private String pubKey;
    private int shouldBeDeleted;
    private int state;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EOSInfoEntity() {
        this(null, null, 0, null, null, null, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EOSInfoEntity copy$default(EOSInfoEntity eOSInfoEntity, String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = eOSInfoEntity.walletId;
        }
        if ((i3 & 2) != 0) {
            str2 = eOSInfoEntity.accountName;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            i = eOSInfoEntity.state;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = eOSInfoEntity.pubKey;
        }
        String str7 = str3;
        if ((i3 & 16) != 0) {
            str4 = eOSInfoEntity.activeKey;
        }
        String str8 = str4;
        if ((i3 & 32) != 0) {
            str5 = eOSInfoEntity.ownerKey;
        }
        String str9 = str5;
        if ((i3 & 64) != 0) {
            i2 = eOSInfoEntity.shouldBeDeleted;
        }
        return eOSInfoEntity.copy(str, str6, i4, str7, str8, str9, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.shouldBeDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EOSInfoEntity copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new EOSInfoEntity(str, str2, i, str3, str4, str5, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EOSInfoEntity)) {
            return false;
        }
        EOSInfoEntity eOSInfoEntity = (EOSInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) eOSInfoEntity.walletId) && Intrinsics.EZpvd((Object) this.accountName, (Object) eOSInfoEntity.accountName) && this.state == eOSInfoEntity.state && Intrinsics.EZpvd((Object) this.pubKey, (Object) eOSInfoEntity.pubKey) && Intrinsics.EZpvd((Object) this.activeKey, (Object) eOSInfoEntity.activeKey) && Intrinsics.EZpvd((Object) this.ownerKey, (Object) eOSInfoEntity.ownerKey) && this.shouldBeDeleted == eOSInfoEntity.shouldBeDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveKey() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerKey() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShouldBeDeleted() {
        return this.shouldBeDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.walletId.hashCode() * 31) + this.accountName.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + this.pubKey.hashCode()) * 31) + this.activeKey.hashCode()) * 31) + this.ownerKey.hashCode()) * 31) + Integer.hashCode(this.shouldBeDeleted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activeKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwnerKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ownerKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldBeDeleted(int i) {
        this.shouldBeDeleted = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(int i) {
        this.state = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EOSInfoEntity(walletId=" + this.walletId + ", accountName=" + this.accountName + ", state=" + this.state + ", pubKey=" + this.pubKey + ", activeKey=" + this.activeKey + ", ownerKey=" + this.ownerKey + ", shouldBeDeleted=" + this.shouldBeDeleted + ")";
    }

    public EOSInfoEntity(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.walletId = str;
        this.accountName = str2;
        this.state = i;
        this.pubKey = str3;
        this.activeKey = str4;
        this.ownerKey = str5;
        this.shouldBeDeleted = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:int:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ EOSInfoEntity(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) == 0 ? str5 : "", (i3 & 64) != 0 ? 0 : i2);
    }
}
