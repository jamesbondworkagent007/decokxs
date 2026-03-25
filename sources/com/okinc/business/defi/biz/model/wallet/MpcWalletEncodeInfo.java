package com.okinc.business.defi.biz.model.wallet;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class MpcWalletEncodeInfo {
    public static final int $stable = 8;
    private String accountName;
    private List<String> copiedEscapeList;
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
    public MpcWalletEncodeInfo() {
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
    public final List<String> component2() {
        return this.copiedEscapeList;
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
    public final MpcWalletEncodeInfo copy(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i2, long j, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        return new MpcWalletEncodeInfo(str, list, str2, str3, i, str4, str5, str6, str7, str8, str9, str10, str11, i2, j, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpcWalletEncodeInfo)) {
            return false;
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfo = (MpcWalletEncodeInfo) obj;
        return Intrinsics.EZpvd((Object) this.rootWalletId, (Object) mpcWalletEncodeInfo.rootWalletId) && Intrinsics.EZpvd(this.copiedEscapeList, mpcWalletEncodeInfo.copiedEscapeList) && Intrinsics.EZpvd((Object) this.mpcId, (Object) mpcWalletEncodeInfo.mpcId) && Intrinsics.EZpvd((Object) this.uid, (Object) mpcWalletEncodeInfo.uid) && this.status == mpcWalletEncodeInfo.status && Intrinsics.EZpvd((Object) this.version, (Object) mpcWalletEncodeInfo.version) && Intrinsics.EZpvd((Object) this.accountName, (Object) mpcWalletEncodeInfo.accountName) && Intrinsics.EZpvd((Object) this.displayAccountName, (Object) mpcWalletEncodeInfo.displayAccountName) && Intrinsics.EZpvd((Object) this.encryptShareKey, (Object) mpcWalletEncodeInfo.encryptShareKey) && Intrinsics.EZpvd((Object) this.ecdsaPubkey, (Object) mpcWalletEncodeInfo.ecdsaPubkey) && Intrinsics.EZpvd((Object) this.ecdsaChainCode, (Object) mpcWalletEncodeInfo.ecdsaChainCode) && Intrinsics.EZpvd((Object) this.ed25519Pubkey, (Object) mpcWalletEncodeInfo.ed25519Pubkey) && Intrinsics.EZpvd((Object) this.ed25519ChainCode, (Object) mpcWalletEncodeInfo.ed25519ChainCode) && this.isEscape == mpcWalletEncodeInfo.isEscape && this.mpcCreateAt == mpcWalletEncodeInfo.mpcCreateAt && this.createType == mpcWalletEncodeInfo.createType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCopiedEscapeList() {
        return this.copiedEscapeList;
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
        return (((((((((((((((((((((((((((((this.rootWalletId.hashCode() * 31) + this.copiedEscapeList.hashCode()) * 31) + this.mpcId.hashCode()) * 31) + this.uid.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.version.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.displayAccountName.hashCode()) * 31) + this.encryptShareKey.hashCode()) * 31) + this.ecdsaPubkey.hashCode()) * 31) + this.ecdsaChainCode.hashCode()) * 31) + this.ed25519Pubkey.hashCode()) * 31) + this.ed25519ChainCode.hashCode()) * 31) + Integer.hashCode(this.isEscape)) * 31) + Long.hashCode(this.mpcCreateAt)) * 31) + Integer.hashCode(this.createType);
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
    public final void setCopiedEscapeList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copiedEscapeList = list;
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
        return "MpcWalletEncodeInfo(rootWalletId=" + this.rootWalletId + ", copiedEscapeList=" + this.copiedEscapeList + ", mpcId=" + this.mpcId + ", uid=" + this.uid + ", status=" + this.status + ", version=" + this.version + ", accountName=" + this.accountName + ", displayAccountName=" + this.displayAccountName + ", encryptShareKey=" + this.encryptShareKey + ", ecdsaPubkey=" + this.ecdsaPubkey + ", ecdsaChainCode=" + this.ecdsaChainCode + ", ed25519Pubkey=" + this.ed25519Pubkey + ", ed25519ChainCode=" + this.ed25519ChainCode + ", isEscape=" + this.isEscape + ", mpcCreateAt=" + this.mpcCreateAt + ", createType=" + this.createType + ")";
    }

    public MpcWalletEncodeInfo(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i2, long j, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        this.rootWalletId = str;
        this.copiedEscapeList = list;
        this.mpcId = str2;
        this.uid = str3;
        this.status = i;
        this.version = str4;
        this.accountName = str5;
        this.displayAccountName = str6;
        this.encryptShareKey = str7;
        this.ecdsaPubkey = str8;
        this.ecdsaChainCode = str9;
        this.ed25519Pubkey = str10;
        this.ed25519ChainCode = str11;
        this.isEscape = i2;
        this.mpcCreateAt = j;
        this.createType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcShare2Status:0x002b: SGET  A[WRAPPED] (LINE:21) com.okinc.business.defi.biz.core.mpc.MpcShare2Status.SHARE2_INVALID com.okinc.business.defi.biz.core.mpc.MpcShare2Status)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcShare2Status.getValue():int A[MD:():int (m), WRAPPED] (LINE:21)) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0074: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x007c: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType:0x008c: SGET  A[WRAPPED] (LINE:32) com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.LOCAL_CREATE com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType)
 VIRTUAL call: com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.getValue():int A[MD:():int (m), WRAPPED] (LINE:32)) : (r35v0 int))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, int):void (m)] (LINE:16) call: com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, int):void type: THIS */
    public /* synthetic */ MpcWalletEncodeInfo(String str, List list, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? yDY.AhwBna() : list, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? MpcShare2Status.SHARE2_INVALID.getValue() : i, (i4 & 32) != 0 ? "0" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) != 0 ? "" : str7, (i4 & 512) != 0 ? "" : str8, (i4 & 1024) != 0 ? "" : str9, (i4 & 2048) != 0 ? "" : str10, (i4 & 4096) == 0 ? str11 : "", (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) != 0 ? 0L : j, (i4 & 32768) != 0 ? MpcWalletCreateType.LOCAL_CREATE.getValue() : i3);
    }

    public final MPCWalletEntity convertToEntity$OKWallet_wallet_impl() {
        String str = this.rootWalletId;
        String json = new Gson().toJson(this.copiedEscapeList);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return new MPCWalletEntity(str, json, this.mpcId, this.uid, this.status, this.version, this.accountName, this.displayAccountName, this.encryptShareKey, this.ecdsaPubkey, this.ecdsaChainCode, this.ed25519Pubkey, this.ed25519ChainCode, this.isEscape, this.mpcCreateAt, this.createType);
    }
}
