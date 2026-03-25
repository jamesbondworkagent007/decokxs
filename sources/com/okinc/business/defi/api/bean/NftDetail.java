package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class NftDetail implements Parcelable {
    private String authorAddress;
    private String contract;
    private String coverUrl;
    private String dataUrl;
    private String id;
    private String imageUrl;
    private String intro;
    private NftPrice lastFee;
    private NftPrice lastSale;
    private String name;
    private String nftId;
    private boolean owner;
    private Integer resourceType;
    private String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NftDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NftDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NftDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : NftPrice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NftPrice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftDetail[] newArray(int i) {
            return new NftDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (NftPrice) null, (NftPrice) null, (String) null, false, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component10() {
        return this.lastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.authorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dataUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component9() {
        return this.lastSale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Integer num, NftPrice nftPrice, NftPrice nftPrice2, String str8, boolean z, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new NftDetail(str, str2, str3, str4, str5, str6, str7, num, nftPrice, nftPrice2, str8, z, str9, str10);
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
        if (!(obj instanceof NftDetail)) {
            return false;
        }
        NftDetail nftDetail = (NftDetail) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) nftDetail.name) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) nftDetail.imageUrl) && Intrinsics.EZpvd((Object) this.intro, (Object) nftDetail.intro) && Intrinsics.EZpvd((Object) this.contract, (Object) nftDetail.contract) && Intrinsics.EZpvd((Object) this.id, (Object) nftDetail.id) && Intrinsics.EZpvd((Object) this.dataUrl, (Object) nftDetail.dataUrl) && Intrinsics.EZpvd((Object) this.coverUrl, (Object) nftDetail.coverUrl) && Intrinsics.EZpvd(this.resourceType, nftDetail.resourceType) && Intrinsics.EZpvd(this.lastSale, nftDetail.lastSale) && Intrinsics.EZpvd(this.lastFee, nftDetail.lastFee) && Intrinsics.EZpvd((Object) this.authorAddress, (Object) nftDetail.authorAddress) && this.owner == nftDetail.owner && Intrinsics.EZpvd((Object) this.nftId, (Object) nftDetail.nftId) && Intrinsics.EZpvd((Object) this.tokenId, (Object) nftDetail.tokenId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorAddress() {
        return this.authorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataUrl() {
        return this.dataUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntro() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getLastFee() {
        return this.lastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getLastSale() {
        return this.lastSale;
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
    public final boolean getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResourceType() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.imageUrl.hashCode();
        int iHashCode3 = this.intro.hashCode();
        int iHashCode4 = this.contract.hashCode();
        int iHashCode5 = this.id.hashCode();
        int iHashCode6 = this.dataUrl.hashCode();
        int iHashCode7 = this.coverUrl.hashCode();
        Integer num = this.resourceType;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        NftPrice nftPrice = this.lastSale;
        int iHashCode9 = nftPrice == null ? 0 : nftPrice.hashCode();
        NftPrice nftPrice2 = this.lastFee;
        int iHashCode10 = nftPrice2 == null ? 0 : nftPrice2.hashCode();
        String str = this.authorAddress;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        int iHashCode12 = Boolean.hashCode(this.owner);
        String str2 = this.nftId;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenId;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthorAddress(String str) {
        this.authorAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContract(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contract = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoverUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coverUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntro(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intro = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastFee(NftPrice nftPrice) {
        this.lastFee = nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastSale(NftPrice nftPrice) {
        this.lastSale = nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwner(boolean z) {
        this.owner = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResourceType(Integer num) {
        this.resourceType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NftDetail(name=" + this.name + ", imageUrl=" + this.imageUrl + ", intro=" + this.intro + ", contract=" + this.contract + ", id=" + this.id + ", dataUrl=" + this.dataUrl + ", coverUrl=" + this.coverUrl + ", resourceType=" + this.resourceType + ", lastSale=" + this.lastSale + ", lastFee=" + this.lastFee + ", authorAddress=" + this.authorAddress + ", owner=" + this.owner + ", nftId=" + this.nftId + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.intro);
        parcel.writeString(this.contract);
        parcel.writeString(this.id);
        parcel.writeString(this.dataUrl);
        parcel.writeString(this.coverUrl);
        Integer num = this.resourceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        NftPrice nftPrice = this.lastSale;
        if (nftPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nftPrice.writeToParcel(parcel, i);
        }
        NftPrice nftPrice2 = this.lastFee;
        if (nftPrice2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nftPrice2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.authorAddress);
        parcel.writeInt(this.owner ? 1 : 0);
        parcel.writeString(this.nftId);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.NftDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftDetail> serializer() {
            return NftDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, NftPrice nftPrice, NftPrice nftPrice2, String str8, boolean z, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.intro = "";
        } else {
            this.intro = str3;
        }
        if ((i & 8) == 0) {
            this.contract = "";
        } else {
            this.contract = str4;
        }
        if ((i & 16) == 0) {
            this.id = "";
        } else {
            this.id = str5;
        }
        if ((i & 32) == 0) {
            this.dataUrl = "";
        } else {
            this.dataUrl = str6;
        }
        if ((i & 64) == 0) {
            this.coverUrl = "";
        } else {
            this.coverUrl = str7;
        }
        this.resourceType = (i & 128) == 0 ? 1 : num;
        if ((i & 256) == 0) {
            this.lastSale = null;
        } else {
            this.lastSale = nftPrice;
        }
        if ((i & 512) == 0) {
            this.lastFee = null;
        } else {
            this.lastFee = nftPrice2;
        }
        if ((i & 1024) == 0) {
            this.authorAddress = null;
        } else {
            this.authorAddress = str8;
        }
        this.owner = (i & 2048) == 0 ? false : z;
        if ((i & 4096) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str9;
        }
        if ((i & 8192) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(NftDetail nftDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nftDetail.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nftDetail.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nftDetail.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nftDetail.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nftDetail.intro, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, nftDetail.intro);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) nftDetail.contract, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, nftDetail.contract);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nftDetail.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nftDetail.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) nftDetail.dataUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, nftDetail.dataUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) nftDetail.coverUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, nftDetail.coverUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num = nftDetail.resourceType) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, nftDetail.resourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || nftDetail.lastSale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, NftPrice$$serializer.INSTANCE, nftDetail.lastSale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || nftDetail.lastFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, NftPrice$$serializer.INSTANCE, nftDetail.lastFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || nftDetail.authorAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, nftDetail.authorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || nftDetail.owner) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, nftDetail.owner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || nftDetail.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, nftDetail.nftId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && nftDetail.tokenId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, nftDetail.tokenId);
    }

    public NftDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Integer num, NftPrice nftPrice, NftPrice nftPrice2, String str8, boolean z, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.name = str;
        this.imageUrl = str2;
        this.intro = str3;
        this.contract = str4;
        this.id = str5;
        this.dataUrl = str6;
        this.coverUrl = str7;
        this.resourceType = num;
        this.lastSale = nftPrice;
        this.lastFee = nftPrice2;
        this.authorAddress = str8;
        this.owner = z;
        this.nftId = str9;
        this.tokenId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r23v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x0047: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r24v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x0050: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r25v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.defi.api.bean.NftDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NftDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, NftPrice nftPrice, NftPrice nftPrice2, String str8, boolean z, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? 1 : num, (i & 256) != 0 ? null : nftPrice, (i & 512) != 0 ? null : nftPrice2, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str9, (i & 8192) == 0 ? str10 : null);
    }
}
