package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NftCollection implements Parcelable {
    public static final int $stable = 0;
    private final String chain;
    private final String collectionImage;
    private final String collectionName;
    private final PriceDetail floorPrice;
    private final int id;
    private final String image;
    private final String lastSoldNftImage;
    private final String projectName;
    private final String volume;
    private final PriceDetail volumePrice;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NftCollection> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NftCollection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftCollection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Parcelable.Creator<PriceDetail> creator = PriceDetail.CREATOR;
            return new NftCollection(string, string2, i, string3, string4, string5, string6, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftCollection[] newArray(int i) {
            return new NftCollection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftCollection() {
        this((String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (PriceDetail) null, (PriceDetail) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("lastSoldNFTImage")
    public static /* synthetic */ void getLastSoldNftImage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.collectionImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.lastSoldNftImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail component8() {
        return this.floorPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail component9() {
        return this.volumePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftCollection copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull PriceDetail priceDetail, @NotNull PriceDetail priceDetail2, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(priceDetail, "");
        Intrinsics.checkNotNullParameter(priceDetail2, "");
        return new NftCollection(str, str2, i, str3, str4, str5, str6, priceDetail, priceDetail2, str7);
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
        if (!(obj instanceof NftCollection)) {
            return false;
        }
        NftCollection nftCollection = (NftCollection) obj;
        return Intrinsics.EZpvd((Object) this.collectionImage, (Object) nftCollection.collectionImage) && Intrinsics.EZpvd((Object) this.collectionName, (Object) nftCollection.collectionName) && this.id == nftCollection.id && Intrinsics.EZpvd((Object) this.image, (Object) nftCollection.image) && Intrinsics.EZpvd((Object) this.projectName, (Object) nftCollection.projectName) && Intrinsics.EZpvd((Object) this.volume, (Object) nftCollection.volume) && Intrinsics.EZpvd((Object) this.chain, (Object) nftCollection.chain) && Intrinsics.EZpvd(this.floorPrice, nftCollection.floorPrice) && Intrinsics.EZpvd(this.volumePrice, nftCollection.volumePrice) && Intrinsics.EZpvd((Object) this.lastSoldNftImage, (Object) nftCollection.lastSoldNftImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollectionImage() {
        return this.collectionImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollectionName() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail getFloorPrice() {
        return this.floorPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastSoldNftImage() {
        return this.lastSoldNftImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectName() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail getVolumePrice() {
        return this.volumePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.collectionImage.hashCode();
        int iHashCode2 = this.collectionName.hashCode();
        int iHashCode3 = Integer.hashCode(this.id);
        int iHashCode4 = this.image.hashCode();
        int iHashCode5 = this.projectName.hashCode();
        int iHashCode6 = this.volume.hashCode();
        int iHashCode7 = this.chain.hashCode();
        int iHashCode8 = this.floorPrice.hashCode();
        int iHashCode9 = this.volumePrice.hashCode();
        String str = this.lastSoldNftImage;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NftCollection(collectionImage=" + this.collectionImage + ", collectionName=" + this.collectionName + ", id=" + this.id + ", image=" + this.image + ", projectName=" + this.projectName + ", volume=" + this.volume + ", chain=" + this.chain + ", floorPrice=" + this.floorPrice + ", volumePrice=" + this.volumePrice + ", lastSoldNftImage=" + this.lastSoldNftImage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.collectionImage);
        parcel.writeString(this.collectionName);
        parcel.writeInt(this.id);
        parcel.writeString(this.image);
        parcel.writeString(this.projectName);
        parcel.writeString(this.volume);
        parcel.writeString(this.chain);
        this.floorPrice.writeToParcel(parcel, i);
        this.volumePrice.writeToParcel(parcel, i);
        parcel.writeString(this.lastSoldNftImage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.NftCollection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftCollection> serializer() {
            return NftCollection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftCollection(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, PriceDetail priceDetail, PriceDetail priceDetail2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.collectionImage = "";
        } else {
            this.collectionImage = str;
        }
        if ((i & 2) == 0) {
            this.collectionName = "";
        } else {
            this.collectionName = str2;
        }
        this.id = (i & 4) == 0 ? 0 : i2;
        if ((i & 8) == 0) {
            this.image = "";
        } else {
            this.image = str3;
        }
        if ((i & 16) == 0) {
            this.projectName = "";
        } else {
            this.projectName = str4;
        }
        if ((i & 32) == 0) {
            this.volume = "";
        } else {
            this.volume = str5;
        }
        if ((i & 64) == 0) {
            this.chain = "";
        } else {
            this.chain = str6;
        }
        this.floorPrice = (i & 128) == 0 ? new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : priceDetail;
        this.volumePrice = (i & 256) == 0 ? new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : priceDetail2;
        this.lastSoldNftImage = (i & 512) == 0 ? null : str7;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NftCollection nftCollection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nftCollection.collectionImage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nftCollection.collectionImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nftCollection.collectionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nftCollection.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || nftCollection.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, nftCollection.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) nftCollection.image, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, nftCollection.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nftCollection.projectName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nftCollection.projectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) nftCollection.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, nftCollection.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) nftCollection.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, nftCollection.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(nftCollection.floorPrice, new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, NftCollection$PriceDetail$$serializer.INSTANCE, nftCollection.floorPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(nftCollection.volumePrice, new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, NftCollection$PriceDetail$$serializer.INSTANCE, nftCollection.volumePrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && nftCollection.lastSoldNftImage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, nftCollection.lastSoldNftImage);
    }

    public NftCollection(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull PriceDetail priceDetail, @NotNull PriceDetail priceDetail2, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(priceDetail, "");
        Intrinsics.checkNotNullParameter(priceDetail2, "");
        this.collectionImage = str;
        this.collectionName = str2;
        this.id = i;
        this.image = str3;
        this.projectName = str4;
        this.volume = str5;
        this.chain = str6;
        this.floorPrice = priceDetail;
        this.volumePrice = priceDetail2;
        this.lastSoldNftImage = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:830) call: com.okinc.business.defi.biz.net.bean.NftCollection.PriceDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail))
  (wrap:com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail:?: TERNARY null = ((wrap:int:0x005f: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:831) call: com.okinc.business.defi.biz.net.bean.NftCollection.PriceDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail, com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail, java.lang.String):void (m)] (LINE:822) call: com.okinc.business.defi.biz.net.bean.NftCollection.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail, com.okinc.business.defi.biz.net.bean.NftCollection$PriceDetail, java.lang.String):void type: THIS */
    public /* synthetic */ NftCollection(String str, String str2, int i, String str3, String str4, String str5, String str6, PriceDetail priceDetail, PriceDetail priceDetail2, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : priceDetail, (i2 & 256) != 0 ? new PriceDetail((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : priceDetail2, (i2 & 512) != 0 ? null : str7);
    }

    @Serializable
    public static final class PriceDetail implements Parcelable {
        public static final int $stable = 0;
        private final String currency;
        private final String currencyUrl;
        private final String price;
        private final String priceGains;
        private final String usdPrice;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PriceDetail> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PriceDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PriceDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PriceDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PriceDetail[] newArray(int i) {
                return new PriceDetail[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PriceDetail() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PriceDetail copy$default(PriceDetail priceDetail, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = priceDetail.priceGains;
            }
            if ((i & 2) != 0) {
                str2 = priceDetail.currency;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = priceDetail.currencyUrl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = priceDetail.price;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = priceDetail.usdPrice;
            }
            return priceDetail.copy(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.priceGains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.currencyUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.usdPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PriceDetail copy(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new PriceDetail(str, str2, str3, str4, str5);
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
            if (!(obj instanceof PriceDetail)) {
                return false;
            }
            PriceDetail priceDetail = (PriceDetail) obj;
            return Intrinsics.EZpvd((Object) this.priceGains, (Object) priceDetail.priceGains) && Intrinsics.EZpvd((Object) this.currency, (Object) priceDetail.currency) && Intrinsics.EZpvd((Object) this.currencyUrl, (Object) priceDetail.currencyUrl) && Intrinsics.EZpvd((Object) this.price, (Object) priceDetail.price) && Intrinsics.EZpvd((Object) this.usdPrice, (Object) priceDetail.usdPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrencyUrl() {
            return this.currencyUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceGains() {
            return this.priceGains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdPrice() {
            return this.usdPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.priceGains;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.currencyUrl.hashCode()) * 31) + this.price.hashCode()) * 31) + this.usdPrice.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PriceDetail(priceGains=" + this.priceGains + ", currency=" + this.currency + ", currencyUrl=" + this.currencyUrl + ", price=" + this.price + ", usdPrice=" + this.usdPrice + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceGains);
            parcel.writeString(this.currency);
            parcel.writeString(this.currencyUrl);
            parcel.writeString(this.price);
            parcel.writeString(this.usdPrice);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.NftCollection.PriceDetail.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PriceDetail> serializer() {
                return NftCollection$PriceDetail$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PriceDetail(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            this.priceGains = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.currency = "";
            } else {
                this.currency = str2;
            }
            if ((i & 4) == 0) {
                this.currencyUrl = "";
            } else {
                this.currencyUrl = str3;
            }
            if ((i & 8) == 0) {
                this.price = "";
            } else {
                this.price = str4;
            }
            if ((i & 16) == 0) {
                this.usdPrice = "";
            } else {
                this.usdPrice = str5;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PriceDetail priceDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceDetail.priceGains != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceDetail.priceGains);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceDetail.currency, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, priceDetail.currency);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) priceDetail.currencyUrl, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, priceDetail.currencyUrl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) priceDetail.price, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, priceDetail.price);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) priceDetail.usdPrice, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 4, priceDetail.usdPrice);
        }

        public PriceDetail(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.priceGains = str;
            this.currency = str2;
            this.currencyUrl = str3;
            this.price = str4;
            this.usdPrice = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:838) call: com.okinc.business.defi.biz.net.bean.NftCollection.PriceDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ PriceDetail(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
        }
    }
}
