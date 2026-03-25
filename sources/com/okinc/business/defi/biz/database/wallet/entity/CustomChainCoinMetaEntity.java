package com.okinc.business.defi.biz.database.wallet.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainCoinMetaEntity implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CustomChainCoinMetaEntity> CREATOR = new Creator();
    private long baseCoinId;
    private long chainId;
    private long coinId;
    private int coinType;
    private String contractAddress;
    private long createAt;
    private int decimalNum;
    private String iconUrl;
    private String name;
    private long realChainId;
    private String symbol;

    public static final class Creator implements Parcelable.Creator<CustomChainCoinMetaEntity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainCoinMetaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomChainCoinMetaEntity(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainCoinMetaEntity[] newArray(int i) {
            return new CustomChainCoinMetaEntity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainCoinMetaEntity() {
        this(0L, 0L, 0L, null, null, null, null, 0L, 0, 0, 0L, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component11() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMetaEntity copy(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j4, int i, int i2, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CustomChainCoinMetaEntity(j, j2, j3, str, str2, str3, str4, j4, i, i2, j5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainCoinMetaEntity)) {
            return false;
        }
        CustomChainCoinMetaEntity customChainCoinMetaEntity = (CustomChainCoinMetaEntity) obj;
        return this.chainId == customChainCoinMetaEntity.chainId && this.realChainId == customChainCoinMetaEntity.realChainId && this.coinId == customChainCoinMetaEntity.coinId && Intrinsics.EZpvd((Object) this.symbol, (Object) customChainCoinMetaEntity.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) customChainCoinMetaEntity.name) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) customChainCoinMetaEntity.iconUrl) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) customChainCoinMetaEntity.contractAddress) && this.baseCoinId == customChainCoinMetaEntity.baseCoinId && this.coinType == customChainCoinMetaEntity.coinType && this.decimalNum == customChainCoinMetaEntity.decimalNum && this.createAt == customChainCoinMetaEntity.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.chainId) * 31) + Long.hashCode(this.realChainId)) * 31) + Long.hashCode(this.coinId)) * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + Long.hashCode(this.baseCoinId)) * 31) + Integer.hashCode(this.coinType)) * 31) + Integer.hashCode(this.decimalNum)) * 31) + Long.hashCode(this.createAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinId(long j) {
        this.baseCoinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinType(int i) {
        this.coinType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(int i) {
        this.decimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChainId(long j) {
        this.realChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainCoinMetaEntity(chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", coinId=" + this.coinId + ", symbol=" + this.symbol + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", contractAddress=" + this.contractAddress + ", baseCoinId=" + this.baseCoinId + ", coinType=" + this.coinType + ", decimalNum=" + this.decimalNum + ", createAt=" + this.createAt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeLong(this.realChainId);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.contractAddress);
        parcel.writeLong(this.baseCoinId);
        parcel.writeInt(this.coinType);
        parcel.writeInt(this.decimalNum);
        parcel.writeLong(this.createAt);
    }

    public CustomChainCoinMetaEntity(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j4, int i, int i2, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = j;
        this.realChainId = j2;
        this.coinId = j3;
        this.symbol = str;
        this.name = str2;
        this.iconUrl = str3;
        this.contractAddress = str4;
        this.baseCoinId = j4;
        this.coinType = i;
        this.decimalNum = i2;
        this.createAt = j5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r23v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r35v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003e: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r29v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0050: ARITH (r35v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r32v0 int) : (0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0057: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
 A[MD:(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, long):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, long):void type: THIS */
    public /* synthetic */ CustomChainCoinMetaEntity(long j, long j2, long j3, String str, String str2, String str3, String str4, long j4, int i, int i2, long j5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0L : j3, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) == 0 ? str4 : "", (i3 & 128) != 0 ? 0L : j4, (i3 & 256) != 0 ? 0 : i, (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) != 0 ? 0L : j5);
    }
}
