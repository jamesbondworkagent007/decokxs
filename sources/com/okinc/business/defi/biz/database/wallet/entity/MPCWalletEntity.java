package com.okinc.business.defi.biz.database.wallet.entity;

import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class MPCWalletEntity {
    public static final int $stable = 8;
    private String accountName;
    private String copiedEscapeListString;
    private int createType;
    private String displayAccountName;
    private String ecdsaChainCode;
    private String ecdsaPubkey;
    private String ed25519ChainCode;
    private String ed25519Pubkey;
    private String encryptShareKey;
    private int isEscape;
    private long mpcCreateAt;
    private String mpcId;
    private String rootWalletId;
    private int status;
    private String uid;
    private String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPCWalletEntity() {
        this(null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, 0L, 0, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ecdsaPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ecdsaChainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ed25519Pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ed25519ChainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isEscape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.mpcCreateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.createType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.copiedEscapeListString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.encryptShareKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCWalletEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, int i2, long j, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new MPCWalletEntity(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, str11, str12, i2, j, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPCWalletEntity)) {
            return false;
        }
        MPCWalletEntity mPCWalletEntity = (MPCWalletEntity) obj;
        return Intrinsics.EZpvd((Object) this.rootWalletId, (Object) mPCWalletEntity.rootWalletId) && Intrinsics.EZpvd((Object) this.copiedEscapeListString, (Object) mPCWalletEntity.copiedEscapeListString) && Intrinsics.EZpvd((Object) this.mpcId, (Object) mPCWalletEntity.mpcId) && Intrinsics.EZpvd((Object) this.uid, (Object) mPCWalletEntity.uid) && this.status == mPCWalletEntity.status && Intrinsics.EZpvd((Object) this.version, (Object) mPCWalletEntity.version) && Intrinsics.EZpvd((Object) this.accountName, (Object) mPCWalletEntity.accountName) && Intrinsics.EZpvd((Object) this.displayAccountName, (Object) mPCWalletEntity.displayAccountName) && Intrinsics.EZpvd((Object) this.encryptShareKey, (Object) mPCWalletEntity.encryptShareKey) && Intrinsics.EZpvd((Object) this.ecdsaPubkey, (Object) mPCWalletEntity.ecdsaPubkey) && Intrinsics.EZpvd((Object) this.ecdsaChainCode, (Object) mPCWalletEntity.ecdsaChainCode) && Intrinsics.EZpvd((Object) this.ed25519Pubkey, (Object) mPCWalletEntity.ed25519Pubkey) && Intrinsics.EZpvd((Object) this.ed25519ChainCode, (Object) mPCWalletEntity.ed25519ChainCode) && this.isEscape == mPCWalletEntity.isEscape && this.mpcCreateAt == mPCWalletEntity.mpcCreateAt && this.createType == mPCWalletEntity.createType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopiedEscapeListString() {
        return this.copiedEscapeListString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCreateType() {
        return this.createType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAccountName() {
        return this.displayAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaChainCode() {
        return this.ecdsaChainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaPubkey() {
        return this.ecdsaPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEd25519ChainCode() {
        return this.ed25519ChainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEd25519Pubkey() {
        return this.ed25519Pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptShareKey() {
        return this.encryptShareKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMpcCreateAt() {
        return this.mpcCreateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.rootWalletId.hashCode() * 31) + this.copiedEscapeListString.hashCode()) * 31) + this.mpcId.hashCode()) * 31) + this.uid.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.version.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.displayAccountName.hashCode()) * 31) + this.encryptShareKey.hashCode()) * 31) + this.ecdsaPubkey.hashCode()) * 31) + this.ecdsaChainCode.hashCode()) * 31) + this.ed25519Pubkey.hashCode()) * 31) + this.ed25519ChainCode.hashCode()) * 31) + Integer.hashCode(this.isEscape)) * 31) + Long.hashCode(this.mpcCreateAt)) * 31) + Integer.hashCode(this.createType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isEscape() {
        return this.isEscape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopiedEscapeListString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copiedEscapeListString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateType(int i) {
        this.createType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayAccountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaChainCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaChainCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaPubkey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaPubkey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEd25519ChainCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ed25519ChainCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEd25519Pubkey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ed25519Pubkey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEncryptShareKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.encryptShareKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEscape(int i) {
        this.isEscape = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcCreateAt(long j) {
        this.mpcCreateAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRootWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rootWalletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPCWalletEntity(rootWalletId=" + this.rootWalletId + ", copiedEscapeListString=" + this.copiedEscapeListString + ", mpcId=" + this.mpcId + ", uid=" + this.uid + ", status=" + this.status + ", version=" + this.version + ", accountName=" + this.accountName + ", displayAccountName=" + this.displayAccountName + ", encryptShareKey=" + this.encryptShareKey + ", ecdsaPubkey=" + this.ecdsaPubkey + ", ecdsaChainCode=" + this.ecdsaChainCode + ", ed25519Pubkey=" + this.ed25519Pubkey + ", ed25519ChainCode=" + this.ed25519ChainCode + ", isEscape=" + this.isEscape + ", mpcCreateAt=" + this.mpcCreateAt + ", createType=" + this.createType + ")";
    }

    public MPCWalletEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, int i2, long j, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.rootWalletId = str;
        this.copiedEscapeListString = str2;
        this.mpcId = str3;
        this.uid = str4;
        this.status = i;
        this.version = str5;
        this.accountName = str6;
        this.displayAccountName = str7;
        this.encryptShareKey = str8;
        this.ecdsaPubkey = str9;
        this.ecdsaChainCode = str10;
        this.ed25519Pubkey = str11;
        this.ed25519ChainCode = str12;
        this.isEscape = i2;
        this.mpcCreateAt = j;
        this.createType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcShare2Status:0x0028: SGET  A[WRAPPED] (LINE:27) com.okinc.business.defi.biz.core.mpc.MpcShare2Status.SHARE2_INVALID com.okinc.business.defi.biz.core.mpc.MpcShare2Status)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcShare2Status.getValue():int A[MD:():int (m), WRAPPED] (LINE:27)) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0071: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0079: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0085: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008b: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType:0x0089: SGET  A[WRAPPED] (LINE:38) com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.LOCAL_CREATE com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.getValue():int A[MD:():int (m), WRAPPED] (LINE:38)) : (r35v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, int):void (m)] (LINE:22) call: com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, int):void type: THIS */
    public /* synthetic */ MPCWalletEntity(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? MpcShare2Status.SHARE2_INVALID.getValue() : i, (i4 & 32) != 0 ? "0" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? "" : str8, (i4 & 512) != 0 ? "" : str9, (i4 & 1024) != 0 ? "" : str10, (i4 & 2048) != 0 ? "" : str11, (i4 & 4096) == 0 ? str12 : "", (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) != 0 ? 0L : j, (i4 & 32768) != 0 ? MpcWalletCreateType.LOCAL_CREATE.getValue() : i3);
    }
}
