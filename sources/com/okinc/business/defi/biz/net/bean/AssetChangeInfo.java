package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AssetChangeInfo implements Parcelable {
    private String coinAmount;
    private long coinId;
    private String coinImgUrl;
    private String coinSymbol;
    private int direction;
    private String nftId;
    private int vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetChangeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AssetChangeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetChangeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetChangeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetChangeInfo[] newArray(int i) {
            return new AssetChangeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetChangeInfo() {
        this((String) null, (String) null, (String) null, 0, (String) null, 0L, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetChangeInfo copy(String str, String str2, String str3, int i, String str4, long j, int i2) {
        return new AssetChangeInfo(str, str2, str3, i, str4, j, i2);
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
        if (!(obj instanceof AssetChangeInfo)) {
            return false;
        }
        AssetChangeInfo assetChangeInfo = (AssetChangeInfo) obj;
        return Intrinsics.EZpvd((Object) this.coinAmount, (Object) assetChangeInfo.coinAmount) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) assetChangeInfo.coinSymbol) && Intrinsics.EZpvd((Object) this.coinImgUrl, (Object) assetChangeInfo.coinImgUrl) && this.vdecimalNum == assetChangeInfo.vdecimalNum && Intrinsics.EZpvd((Object) this.nftId, (Object) assetChangeInfo.nftId) && this.coinId == assetChangeInfo.coinId && this.direction == assetChangeInfo.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinImgUrl() {
        return this.coinImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinSymbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coinImgUrl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Integer.hashCode(this.vdecimalNum);
        String str4 = this.nftId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.coinId)) * 31) + Integer.hashCode(this.direction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinImgUrl(String str) {
        this.coinImgUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(String str) {
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(int i) {
        this.direction = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(int i) {
        this.vdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetChangeInfo(coinAmount=" + this.coinAmount + ", coinSymbol=" + this.coinSymbol + ", coinImgUrl=" + this.coinImgUrl + ", vdecimalNum=" + this.vdecimalNum + ", nftId=" + this.nftId + ", coinId=" + this.coinId + ", direction=" + this.direction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinSymbol);
        parcel.writeString(this.coinImgUrl);
        parcel.writeInt(this.vdecimalNum);
        parcel.writeString(this.nftId);
        parcel.writeLong(this.coinId);
        parcel.writeInt(this.direction);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetChangeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetChangeInfo> serializer() {
            return AssetChangeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetChangeInfo(int i, String str, String str2, String str3, int i2, String str4, long j, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str;
        }
        if ((i & 2) == 0) {
            this.coinSymbol = "";
        } else {
            this.coinSymbol = str2;
        }
        if ((i & 4) == 0) {
            this.coinImgUrl = "";
        } else {
            this.coinImgUrl = str3;
        }
        if ((i & 8) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = i2;
        }
        if ((i & 16) == 0) {
            this.nftId = "";
        } else {
            this.nftId = str4;
        }
        if ((i & 32) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 64) == 0) {
            this.direction = 2;
        } else {
            this.direction = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetChangeInfo assetChangeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetChangeInfo.coinAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetChangeInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetChangeInfo.coinSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetChangeInfo.coinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetChangeInfo.coinImgUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetChangeInfo.coinImgUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetChangeInfo.vdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, assetChangeInfo.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetChangeInfo.nftId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetChangeInfo.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || assetChangeInfo.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, assetChangeInfo.coinId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && assetChangeInfo.direction == 2) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, assetChangeInfo.direction);
    }

    public AssetChangeInfo(String str, String str2, String str3, int i, String str4, long j, int i2) {
        this.coinAmount = str;
        this.coinSymbol = str2;
        this.coinImgUrl = str3;
        this.vdecimalNum = i;
        this.nftId = str4;
        this.coinId = j;
        this.direction = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, int):void (m)] (LINE:292) call: com.okinc.business.defi.biz.net.bean.AssetChangeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ AssetChangeInfo(String str, String str2, String str3, int i, String str4, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? str4 : "", (i3 & 32) != 0 ? 0L : j, (i3 & 64) != 0 ? 2 : i2);
    }
}
