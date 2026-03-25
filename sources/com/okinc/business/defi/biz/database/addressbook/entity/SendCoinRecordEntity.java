package com.okinc.business.defi.biz.database.addressbook.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SendCoinRecordEntity {
    public static final int $stable = 8;
    private String address;
    private String chainId;
    private String chainName;
    private String chainUrl;
    private long createTime;
    private int smartContract;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SendCoinRecordEntity() {
        this(null, null, null, null, null, 0L, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.smartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendCoinRecordEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SendCoinRecordEntity(str, str2, str3, str4, str5, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendCoinRecordEntity)) {
            return false;
        }
        SendCoinRecordEntity sendCoinRecordEntity = (SendCoinRecordEntity) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) sendCoinRecordEntity.address) && Intrinsics.EZpvd((Object) this.chainId, (Object) sendCoinRecordEntity.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) sendCoinRecordEntity.chainName) && Intrinsics.EZpvd((Object) this.walletId, (Object) sendCoinRecordEntity.walletId) && Intrinsics.EZpvd((Object) this.chainUrl, (Object) sendCoinRecordEntity.chainUrl) && this.createTime == sendCoinRecordEntity.createTime && this.smartContract == sendCoinRecordEntity.smartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainUrl() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSmartContract() {
        return this.smartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.address.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.walletId.hashCode()) * 31) + this.chainUrl.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.smartContract);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSmartContract() {
        return this.smartContract == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartContract() {
        this.smartContract = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartContract(int i) {
        this.smartContract = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendCoinRecordEntity(address=" + this.address + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", walletId=" + this.walletId + ", chainUrl=" + this.chainUrl + ", createTime=" + this.createTime + ", smartContract=" + this.smartContract + ")";
    }

    public SendCoinRecordEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.address = str;
        this.chainId = str2;
        this.chainName = str3;
        this.walletId = str4;
        this.chainUrl = str5;
        this.createTime = j;
        this.smartContract = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void (m)] (LINE:11) call: com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ SendCoinRecordEntity(String str, String str2, String str3, String str4, String str5, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? 0 : i);
    }
}
