package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UTXONftInfo implements Parcelable {
    private String bizNftId;
    private Boolean brc20Nft;
    private String imgUrl;
    private String name;
    private String nftId;
    private String nftLocation;
    private Boolean platformSupport;
    private String ticker;
    private String tokenType;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXONftInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UTXONftInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONftInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UTXONftInfo(string, string2, boolValueOf, string3, string4, string5, string6, boolValueOf2, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONftInfo[] newArray(int i) {
            return new UTXONftInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXONftInfo() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nftLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.brc20Nft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.imgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ticker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.bizNftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.platformSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXONftInfo copy(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8) {
        return new UTXONftInfo(str, str2, bool, str3, str4, str5, str6, bool2, str7, str8);
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
        if (!(obj instanceof UTXONftInfo)) {
            return false;
        }
        UTXONftInfo uTXONftInfo = (UTXONftInfo) obj;
        return Intrinsics.EZpvd((Object) this.nftId, (Object) uTXONftInfo.nftId) && Intrinsics.EZpvd((Object) this.nftLocation, (Object) uTXONftInfo.nftLocation) && Intrinsics.EZpvd(this.brc20Nft, uTXONftInfo.brc20Nft) && Intrinsics.EZpvd((Object) this.imgUrl, (Object) uTXONftInfo.imgUrl) && Intrinsics.EZpvd((Object) this.name, (Object) uTXONftInfo.name) && Intrinsics.EZpvd((Object) this.ticker, (Object) uTXONftInfo.ticker) && Intrinsics.EZpvd((Object) this.bizNftId, (Object) uTXONftInfo.bizNftId) && Intrinsics.EZpvd(this.platformSupport, uTXONftInfo.platformSupport) && Intrinsics.EZpvd((Object) this.value, (Object) uTXONftInfo.value) && Intrinsics.EZpvd((Object) this.tokenType, (Object) uTXONftInfo.tokenType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizNftId() {
        return this.bizNftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBrc20Nft() {
        return this.brc20Nft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftLocation() {
        return this.nftLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPlatformSupport() {
        return this.platformSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nftId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nftLocation;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.brc20Nft;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.imgUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ticker;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.bizNftId;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Boolean bool2 = this.platformSupport;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.value;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenType;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizNftId(String str) {
        this.bizNftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrc20Nft(Boolean bool) {
        this.brc20Nft = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImgUrl(String str) {
        this.imgUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftLocation(String str) {
        this.nftLocation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformSupport(Boolean bool) {
        this.platformSupport = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTicker(String str) {
        this.ticker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXONftInfo(nftId=" + this.nftId + ", nftLocation=" + this.nftLocation + ", brc20Nft=" + this.brc20Nft + ", imgUrl=" + this.imgUrl + ", name=" + this.name + ", ticker=" + this.ticker + ", bizNftId=" + this.bizNftId + ", platformSupport=" + this.platformSupport + ", value=" + this.value + ", tokenType=" + this.tokenType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nftId);
        parcel.writeString(this.nftLocation);
        Boolean bool = this.brc20Nft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.ticker);
        parcel.writeString(this.bizNftId);
        Boolean bool2 = this.platformSupport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.value);
        parcel.writeString(this.tokenType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UTXONftInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXONftInfo> serializer() {
            return UTXONftInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UTXONftInfo(int i, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str;
        }
        if ((i & 2) == 0) {
            this.nftLocation = null;
        } else {
            this.nftLocation = str2;
        }
        if ((i & 4) == 0) {
            this.brc20Nft = null;
        } else {
            this.brc20Nft = bool;
        }
        if ((i & 8) == 0) {
            this.imgUrl = null;
        } else {
            this.imgUrl = str3;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 32) == 0) {
            this.ticker = null;
        } else {
            this.ticker = str5;
        }
        if ((i & 64) == 0) {
            this.bizNftId = null;
        } else {
            this.bizNftId = str6;
        }
        if ((i & 128) == 0) {
            this.platformSupport = null;
        } else {
            this.platformSupport = bool2;
        }
        if ((i & 256) == 0) {
            this.value = null;
        } else {
            this.value = str7;
        }
        if ((i & 512) == 0) {
            this.tokenType = null;
        } else {
            this.tokenType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXONftInfo uTXONftInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXONftInfo.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXONftInfo.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXONftInfo.nftLocation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXONftInfo.nftLocation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXONftInfo.brc20Nft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, uTXONftInfo.brc20Nft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXONftInfo.imgUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTXONftInfo.imgUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXONftInfo.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTXONftInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXONftInfo.ticker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, uTXONftInfo.ticker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXONftInfo.bizNftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, uTXONftInfo.bizNftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXONftInfo.platformSupport != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, uTXONftInfo.platformSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXONftInfo.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uTXONftInfo.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && uTXONftInfo.tokenType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, uTXONftInfo.tokenType);
    }

    public UTXONftInfo(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8) {
        this.nftId = str;
        this.nftLocation = str2;
        this.brc20Nft = bool;
        this.imgUrl = str3;
        this.name = str4;
        this.ticker = str5;
        this.bizNftId = str6;
        this.platformSupport = bool2;
        this.value = str7;
        this.tokenType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:111) call: com.okinc.business.defi.biz.net.bean.UTXONftInfo.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UTXONftInfo(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str7, (i & 512) == 0 ? str8 : null);
    }
}
