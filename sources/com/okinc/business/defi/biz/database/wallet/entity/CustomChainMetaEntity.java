package com.okinc.business.defi.biz.database.wallet.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainMetaEntity implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CustomChainMetaEntity> CREATOR = new Creator();
    private long chainId;
    private String chainName;
    private long createAt;
    private String explorerUrl;
    private String faucetUrl;
    private int fromCustom;
    private String iconUrl;
    private CustomChainCoinMetaEntity nativeToken;
    private long realChainId;
    private String rpcUrl;
    private long updateAt;

    public static final class Creator implements Parcelable.Creator<CustomChainMetaEntity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMetaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomChainMetaEntity(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : CustomChainCoinMetaEntity.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMetaEntity[] newArray(int i) {
            return new CustomChainMetaEntity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainMetaEntity() {
        this(0L, 0L, null, null, 0, null, null, null, 0L, 0L, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMetaEntity component11() {
        return this.nativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.fromCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.faucetUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainMetaEntity copy(long j, long j2, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j3, long j4, CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CustomChainMetaEntity(j, j2, str, str2, i, str3, str4, str5, j3, j4, customChainCoinMetaEntity);
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
        if (!(obj instanceof CustomChainMetaEntity)) {
            return false;
        }
        CustomChainMetaEntity customChainMetaEntity = (CustomChainMetaEntity) obj;
        return this.chainId == customChainMetaEntity.chainId && this.realChainId == customChainMetaEntity.realChainId && Intrinsics.EZpvd((Object) this.chainName, (Object) customChainMetaEntity.chainName) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) customChainMetaEntity.iconUrl) && this.fromCustom == customChainMetaEntity.fromCustom && Intrinsics.EZpvd((Object) this.rpcUrl, (Object) customChainMetaEntity.rpcUrl) && Intrinsics.EZpvd((Object) this.faucetUrl, (Object) customChainMetaEntity.faucetUrl) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) customChainMetaEntity.explorerUrl) && this.createAt == customChainMetaEntity.createAt && this.updateAt == customChainMetaEntity.updateAt && Intrinsics.EZpvd(this.nativeToken, customChainMetaEntity.nativeToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaucetUrl() {
        return this.faucetUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFromCustom() {
        return this.fromCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMetaEntity getNativeToken() {
        return this.nativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRpcUrl() {
        return this.rpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateAt() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = Long.hashCode(this.realChainId);
        int iHashCode3 = this.chainName.hashCode();
        int iHashCode4 = this.iconUrl.hashCode();
        int iHashCode5 = Integer.hashCode(this.fromCustom);
        int iHashCode6 = this.rpcUrl.hashCode();
        int iHashCode7 = this.faucetUrl.hashCode();
        int iHashCode8 = this.explorerUrl.hashCode();
        int iHashCode9 = Long.hashCode(this.createAt);
        int iHashCode10 = Long.hashCode(this.updateAt);
        CustomChainCoinMetaEntity customChainCoinMetaEntity = this.nativeToken;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (customChainCoinMetaEntity == null ? 0 : customChainCoinMetaEntity.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaucetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.faucetUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromCustom(int i) {
        this.fromCustom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeToken(CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        this.nativeToken = customChainCoinMetaEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChainId(long j) {
        this.realChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRpcUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rpcUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateAt(long j) {
        this.updateAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainMetaEntity(chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", chainName=" + this.chainName + ", iconUrl=" + this.iconUrl + ", fromCustom=" + this.fromCustom + ", rpcUrl=" + this.rpcUrl + ", faucetUrl=" + this.faucetUrl + ", explorerUrl=" + this.explorerUrl + ", createAt=" + this.createAt + ", updateAt=" + this.updateAt + ", nativeToken=" + this.nativeToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeLong(this.realChainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.fromCustom);
        parcel.writeString(this.rpcUrl);
        parcel.writeString(this.faucetUrl);
        parcel.writeString(this.explorerUrl);
        parcel.writeLong(this.createAt);
        parcel.writeLong(this.updateAt);
        CustomChainCoinMetaEntity customChainCoinMetaEntity = this.nativeToken;
        if (customChainCoinMetaEntity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customChainCoinMetaEntity.writeToParcel(parcel, i);
        }
    }

    public CustomChainMetaEntity(long j, long j2, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j3, long j4, CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = j;
        this.realChainId = j2;
        this.chainName = str;
        this.iconUrl = str2;
        this.fromCustom = i;
        this.rpcUrl = str3;
        this.faucetUrl = str4;
        this.explorerUrl = str5;
        this.createAt = j3;
        this.updateAt = j4;
        this.nativeToken = customChainCoinMetaEntity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r29v0 long) : (0 long))
  (wrap:com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity) : (r31v0 com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity))
 A[MD:(long, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, long, com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity):void (m)] (LINE:21) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity.<init>(long, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, long, com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity):void type: THIS */
    public /* synthetic */ CustomChainMetaEntity(long j, long j2, String str, String str2, int i, String str3, String str4, String str5, long j3, long j4, CustomChainCoinMetaEntity customChainCoinMetaEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) == 0 ? str5 : "", (i2 & 256) != 0 ? 0L : j3, (i2 & 512) == 0 ? j4 : 0L, (i2 & 1024) != 0 ? null : customChainCoinMetaEntity);
    }
}
