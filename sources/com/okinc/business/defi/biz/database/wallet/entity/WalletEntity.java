package com.okinc.business.defi.biz.database.wallet.entity;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletEntity {
    public static final int $stable = 8;
    private int aaWalletStatus;
    private int addressIndex;
    private int backup;
    private long chainId;
    private int cloudBackup;
    private String completedSyncOperation;
    private long createAt;
    private String createVersion;
    private String data;
    private int eoaWalletType;
    private int fromCreate;
    private int iHuaweiBackup;
    private String id;
    private int isSegWit;
    private String language;
    private int main;
    private int modifiedName;
    private String name;
    private int orderValue;
    private String rootWalletId;
    private String syncOperation;
    private int syncStatus;
    private int type;
    private String xpriv;
    private String xpub;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletEntity() {
        this(null, 0, null, 0L, null, null, 0, 0, 0, 0, 0, null, null, 0, 0, 0L, 0, null, 0, 0, null, null, 0, 0, null, 33554431, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.iHuaweiBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isSegWit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.fromCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.syncStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.completedSyncOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.syncOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.eoaWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.aaWalletStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.createVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.modifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.cloudBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletEntity copy(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, int i2, int i3, int i4, int i5, int i6, @NotNull String str5, @NotNull String str6, int i7, int i8, long j2, int i9, @NotNull String str7, int i10, int i11, @NotNull String str8, String str9, int i12, int i13, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new WalletEntity(str, i, str2, j, str3, str4, i2, i3, i4, i5, i6, str5, str6, i7, i8, j2, i9, str7, i10, i11, str8, str9, i12, i13, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletEntity)) {
            return false;
        }
        WalletEntity walletEntity = (WalletEntity) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) walletEntity.id) && this.type == walletEntity.type && Intrinsics.EZpvd((Object) this.data, (Object) walletEntity.data) && this.chainId == walletEntity.chainId && Intrinsics.EZpvd((Object) this.language, (Object) walletEntity.language) && Intrinsics.EZpvd((Object) this.name, (Object) walletEntity.name) && this.modifiedName == walletEntity.modifiedName && this.backup == walletEntity.backup && this.cloudBackup == walletEntity.cloudBackup && this.iHuaweiBackup == walletEntity.iHuaweiBackup && this.main == walletEntity.main && Intrinsics.EZpvd((Object) this.xpub, (Object) walletEntity.xpub) && Intrinsics.EZpvd((Object) this.xpriv, (Object) walletEntity.xpriv) && this.isSegWit == walletEntity.isSegWit && this.fromCreate == walletEntity.fromCreate && this.createAt == walletEntity.createAt && this.orderValue == walletEntity.orderValue && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) walletEntity.rootWalletId) && this.addressIndex == walletEntity.addressIndex && this.syncStatus == walletEntity.syncStatus && Intrinsics.EZpvd((Object) this.completedSyncOperation, (Object) walletEntity.completedSyncOperation) && Intrinsics.EZpvd((Object) this.syncOperation, (Object) walletEntity.syncOperation) && this.eoaWalletType == walletEntity.eoaWalletType && this.aaWalletStatus == walletEntity.aaWalletStatus && Intrinsics.EZpvd((Object) this.createVersion, (Object) walletEntity.createVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAaWalletStatus() {
        return this.aaWalletStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBackup() {
        return this.backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCloudBackup() {
        return this.cloudBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedSyncOperation() {
        return this.completedSyncOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateVersion() {
        return this.createVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEoaWalletType() {
        return this.eoaWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFromCreate() {
        return this.fromCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIHuaweiBackup() {
        return this.iHuaweiBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMain() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModifiedName() {
        return this.modifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSyncOperation() {
        return this.syncOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpriv() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpub() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Integer.hashCode(this.type);
        int iHashCode3 = this.data.hashCode();
        int iHashCode4 = Long.hashCode(this.chainId);
        int iHashCode5 = this.language.hashCode();
        int iHashCode6 = this.name.hashCode();
        int iHashCode7 = Integer.hashCode(this.modifiedName);
        int iHashCode8 = Integer.hashCode(this.backup);
        int iHashCode9 = Integer.hashCode(this.cloudBackup);
        int iHashCode10 = Integer.hashCode(this.iHuaweiBackup);
        int iHashCode11 = Integer.hashCode(this.main);
        int iHashCode12 = this.xpub.hashCode();
        int iHashCode13 = this.xpriv.hashCode();
        int iHashCode14 = Integer.hashCode(this.isSegWit);
        int iHashCode15 = Integer.hashCode(this.fromCreate);
        int iHashCode16 = Long.hashCode(this.createAt);
        int iHashCode17 = Integer.hashCode(this.orderValue);
        int iHashCode18 = this.rootWalletId.hashCode();
        int iHashCode19 = Integer.hashCode(this.addressIndex);
        int iHashCode20 = Integer.hashCode(this.syncStatus);
        int iHashCode21 = this.completedSyncOperation.hashCode();
        String str = this.syncOperation;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.eoaWalletType)) * 31) + Integer.hashCode(this.aaWalletStatus)) * 31) + this.createVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSegWit() {
        return this.isSegWit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaWalletStatus(int i) {
        this.aaWalletStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(int i) {
        this.addressIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackup(int i) {
        this.backup = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloudBackup(int i) {
        this.cloudBackup = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedSyncOperation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedSyncOperation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.createVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEoaWalletType(int i) {
        this.eoaWalletType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromCreate(int i) {
        this.fromCreate = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIHuaweiBackup(int i) {
        this.iHuaweiBackup = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMain(int i) {
        this.main = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifiedName(int i) {
        this.modifiedName = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(int i) {
        this.orderValue = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRootWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rootWalletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSegWit(int i) {
        this.isSegWit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSyncOperation(String str) {
        this.syncOperation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXpriv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.xpriv = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXpub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.xpub = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletEntity(id=" + this.id + ", type=" + this.type + ", data=" + this.data + ", chainId=" + this.chainId + ", language=" + this.language + ", name=" + this.name + ", modifiedName=" + this.modifiedName + ", backup=" + this.backup + ", cloudBackup=" + this.cloudBackup + ", iHuaweiBackup=" + this.iHuaweiBackup + ", main=" + this.main + ", xpub=" + this.xpub + ", xpriv=" + this.xpriv + ", isSegWit=" + this.isSegWit + ", fromCreate=" + this.fromCreate + ", createAt=" + this.createAt + ", orderValue=" + this.orderValue + ", rootWalletId=" + this.rootWalletId + ", addressIndex=" + this.addressIndex + ", syncStatus=" + this.syncStatus + ", completedSyncOperation=" + this.completedSyncOperation + ", syncOperation=" + this.syncOperation + ", eoaWalletType=" + this.eoaWalletType + ", aaWalletStatus=" + this.aaWalletStatus + ", createVersion=" + this.createVersion + ")";
    }

    public WalletEntity(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, int i2, int i3, int i4, int i5, int i6, @NotNull String str5, @NotNull String str6, int i7, int i8, long j2, int i9, @NotNull String str7, int i10, int i11, @NotNull String str8, String str9, int i12, int i13, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.id = str;
        this.type = i;
        this.data = str2;
        this.chainId = j;
        this.language = str3;
        this.name = str4;
        this.modifiedName = i2;
        this.backup = i3;
        this.cloudBackup = i4;
        this.iHuaweiBackup = i5;
        this.main = i6;
        this.xpub = str5;
        this.xpriv = str6;
        this.isSegWit = i7;
        this.fromCreate = i8;
        this.createAt = j2;
        this.orderValue = i9;
        this.rootWalletId = str7;
        this.addressIndex = i10;
        this.syncStatus = i11;
        this.completedSyncOperation = str8;
        this.syncOperation = str9;
        this.eoaWalletType = i12;
        this.aaWalletStatus = i13;
        this.createVersion = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r32v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:int:0x0077: TERNARY null = ((wrap:int:0x006f: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0084: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008f: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d7: INVOKE 
  (wrap:com.okinc.business.defi.biz.constant.WalletType:0x00d5: SGET  A[WRAPPED] (LINE:49) com.okinc.business.defi.biz.constant.WalletType.AAWallet com.okinc.business.defi.biz.constant.WalletType)
 VIRTUAL call: java.lang.Enum.ordinal():int A[MD:():int (c), WRAPPED] (LINE:49)) : (r53v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e6: INVOKE 
  (wrap:com.okinc.business.defi.biz.net.bean.AAStatus:0x00e4: SGET  A[WRAPPED] (LINE:50) com.okinc.business.defi.biz.net.bean.AAStatus.Normal com.okinc.business.defi.biz.net.bean.AAStatus)
 VIRTUAL call: java.lang.Enum.ordinal():int A[MD:():int (c), WRAPPED] (LINE:50)) : (r54v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, java.lang.String, int, int, long, int, java.lang.String, int, int, java.lang.String, java.lang.String, int, int, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.defi.biz.database.wallet.entity.WalletEntity.<init>(java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, java.lang.String, int, int, long, int, java.lang.String, int, int, java.lang.String, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ WalletEntity(String str, int i, String str2, long j, String str3, String str4, int i2, int i3, int i4, int i5, int i6, String str5, String str6, int i7, int i8, long j2, int i9, String str7, int i10, int i11, String str8, String str9, int i12, int i13, String str10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? 0L : j, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? "" : str4, (i14 & 64) != 0 ? 0 : i2, (i14 & 128) != 0 ? 0 : i3, (i14 & 256) != 0 ? 0 : i4, (i14 & 512) != 0 ? 0 : i5, (i14 & 1024) != 0 ? 0 : i6, (i14 & 2048) != 0 ? "" : str5, (i14 & 4096) != 0 ? "" : str6, (i14 & 8192) != 0 ? 0 : i7, (i14 & 16384) != 0 ? 0 : i8, (i14 & 32768) != 0 ? 0L : j2, (i14 & 65536) != 0 ? 0 : i9, (i14 & 131072) != 0 ? "" : str7, (i14 & 262144) != 0 ? 0 : i10, (i14 & 524288) != 0 ? 0 : i11, (i14 & 1048576) != 0 ? "" : str8, (i14 & 2097152) != 0 ? null : str9, (i14 & 4194304) != 0 ? WalletType.AAWallet.ordinal() : i12, (i14 & 8388608) != 0 ? AAStatus.Normal.ordinal() : i13, (i14 & 16777216) != 0 ? "" : str10);
    }
}
