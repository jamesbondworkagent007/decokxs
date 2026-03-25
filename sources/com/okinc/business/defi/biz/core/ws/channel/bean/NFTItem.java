package com.okinc.business.defi.biz.core.ws.channel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NFTItem {
    private String authorAddress;
    private int certificateFlag;
    private String collectionName;
    private String contractAddress;
    private String coverUrl;
    private String dataUrl;
    private String imageUrl;
    private String info;
    private PriceDetail lastFee;
    private PriceDetail lastSale;
    private String name;
    private String network;
    private Long nftId;
    private int owned;
    private String ownerAddress;
    private Integer project;
    private int resourceType;
    private String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NFTItem() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (PriceDetail) null, (PriceDetail) null, (String) null, (String) null, (String) null, 0, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.dataUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.coverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail component13() {
        return this.lastSale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail component14() {
        return this.lastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.authorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ownerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.certificateFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTItem copy(Long l, @NotNull String str, String str2, @NotNull String str3, @NotNull String str4, Integer num, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, PriceDetail priceDetail, PriceDetail priceDetail2, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new NFTItem(l, str, str2, str3, str4, num, str5, i, str6, str7, str8, i2, priceDetail, priceDetail2, str9, str10, str11, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFTItem)) {
            return false;
        }
        NFTItem nFTItem = (NFTItem) obj;
        return Intrinsics.EZpvd(this.nftId, nFTItem.nftId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) nFTItem.contractAddress) && Intrinsics.EZpvd((Object) this.tokenId, (Object) nFTItem.tokenId) && Intrinsics.EZpvd((Object) this.name, (Object) nFTItem.name) && Intrinsics.EZpvd((Object) this.info, (Object) nFTItem.info) && Intrinsics.EZpvd(this.project, nFTItem.project) && Intrinsics.EZpvd((Object) this.collectionName, (Object) nFTItem.collectionName) && this.certificateFlag == nFTItem.certificateFlag && Intrinsics.EZpvd((Object) this.imageUrl, (Object) nFTItem.imageUrl) && Intrinsics.EZpvd((Object) this.dataUrl, (Object) nFTItem.dataUrl) && Intrinsics.EZpvd((Object) this.coverUrl, (Object) nFTItem.coverUrl) && this.resourceType == nFTItem.resourceType && Intrinsics.EZpvd(this.lastSale, nFTItem.lastSale) && Intrinsics.EZpvd(this.lastFee, nFTItem.lastFee) && Intrinsics.EZpvd((Object) this.authorAddress, (Object) nFTItem.authorAddress) && Intrinsics.EZpvd((Object) this.ownerAddress, (Object) nFTItem.ownerAddress) && Intrinsics.EZpvd((Object) this.network, (Object) nFTItem.network) && this.owned == nFTItem.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorAddress() {
        return this.authorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCertificateFlag() {
        return this.certificateFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollectionName() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
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
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail getLastFee() {
        return this.lastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail getLastSale() {
        return this.lastSale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOwned() {
        return this.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerAddress() {
        return this.ownerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceType() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.nftId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.contractAddress.hashCode();
        String str = this.tokenId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.name.hashCode();
        int iHashCode5 = this.info.hashCode();
        Integer num = this.project;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        int iHashCode7 = this.collectionName.hashCode();
        int iHashCode8 = Integer.hashCode(this.certificateFlag);
        int iHashCode9 = this.imageUrl.hashCode();
        int iHashCode10 = this.dataUrl.hashCode();
        int iHashCode11 = this.coverUrl.hashCode();
        int iHashCode12 = Integer.hashCode(this.resourceType);
        PriceDetail priceDetail = this.lastSale;
        int iHashCode13 = priceDetail == null ? 0 : priceDetail.hashCode();
        PriceDetail priceDetail2 = this.lastFee;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (priceDetail2 != null ? priceDetail2.hashCode() : 0)) * 31) + this.authorAddress.hashCode()) * 31) + this.ownerAddress.hashCode()) * 31) + this.network.hashCode()) * 31) + Integer.hashCode(this.owned);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthorAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateFlag(int i) {
        this.certificateFlag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.collectionName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractAddress = str;
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
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.info = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastFee(PriceDetail priceDetail) {
        this.lastFee = priceDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastSale(PriceDetail priceDetail) {
        this.lastSale = priceDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(Long l) {
        this.nftId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwned(int i) {
        this.owned = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwnerAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ownerAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProject(Integer num) {
        this.project = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResourceType(int i) {
        this.resourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NFTItem(nftId=" + this.nftId + ", contractAddress=" + this.contractAddress + ", tokenId=" + this.tokenId + ", name=" + this.name + ", info=" + this.info + ", project=" + this.project + ", collectionName=" + this.collectionName + ", certificateFlag=" + this.certificateFlag + ", imageUrl=" + this.imageUrl + ", dataUrl=" + this.dataUrl + ", coverUrl=" + this.coverUrl + ", resourceType=" + this.resourceType + ", lastSale=" + this.lastSale + ", lastFee=" + this.lastFee + ", authorAddress=" + this.authorAddress + ", ownerAddress=" + this.ownerAddress + ", network=" + this.network + ", owned=" + this.owned + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NFTItem> serializer() {
            return NFTItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NFTItem(int i, Long l, String str, String str2, String str3, String str4, Integer num, String str5, int i2, String str6, String str7, String str8, int i3, PriceDetail priceDetail, PriceDetail priceDetail2, String str9, String str10, String str11, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        this.nftId = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str;
        }
        if ((i & 4) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str2;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 16) == 0) {
            this.info = "";
        } else {
            this.info = str4;
        }
        this.project = (i & 32) == 0 ? -1 : num;
        if ((i & 64) == 0) {
            this.collectionName = "";
        } else {
            this.collectionName = str5;
        }
        if ((i & 128) == 0) {
            this.certificateFlag = 0;
        } else {
            this.certificateFlag = i2;
        }
        if ((i & 256) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str6;
        }
        if ((i & 512) == 0) {
            this.dataUrl = "";
        } else {
            this.dataUrl = str7;
        }
        if ((i & 1024) == 0) {
            this.coverUrl = "";
        } else {
            this.coverUrl = str8;
        }
        if ((i & 2048) == 0) {
            this.resourceType = 0;
        } else {
            this.resourceType = i3;
        }
        if ((i & 4096) == 0) {
            this.lastSale = null;
        } else {
            this.lastSale = priceDetail;
        }
        if ((i & 8192) == 0) {
            this.lastFee = null;
        } else {
            this.lastFee = priceDetail2;
        }
        if ((i & 16384) == 0) {
            this.authorAddress = "";
        } else {
            this.authorAddress = str9;
        }
        if ((32768 & i) == 0) {
            this.ownerAddress = "";
        } else {
            this.ownerAddress = str10;
        }
        if ((65536 & i) == 0) {
            this.network = "";
        } else {
            this.network = str11;
        }
        if ((i & 131072) == 0) {
            this.owned = 0;
        } else {
            this.owned = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NFTItem nFTItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = nFTItem.nftId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, nFTItem.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nFTItem.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nFTItem.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nFTItem.tokenId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, nFTItem.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) nFTItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, nFTItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nFTItem.info, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nFTItem.info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = nFTItem.project) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, nFTItem.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) nFTItem.collectionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, nFTItem.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || nFTItem.certificateFlag != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, nFTItem.certificateFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) nFTItem.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, nFTItem.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) nFTItem.dataUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, nFTItem.dataUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) nFTItem.coverUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, nFTItem.coverUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || nFTItem.resourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, nFTItem.resourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || nFTItem.lastSale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, PriceDetail$$serializer.INSTANCE, nFTItem.lastSale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || nFTItem.lastFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, PriceDetail$$serializer.INSTANCE, nFTItem.lastFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) nFTItem.authorAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, nFTItem.authorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) nFTItem.ownerAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, nFTItem.ownerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) nFTItem.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, nFTItem.network);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && nFTItem.owned == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 17, nFTItem.owned);
    }

    public NFTItem(Long l, @NotNull String str, String str2, @NotNull String str3, @NotNull String str4, Integer num, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, PriceDetail priceDetail, PriceDetail priceDetail2, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.nftId = l;
        this.contractAddress = str;
        this.tokenId = str2;
        this.name = str3;
        this.info = str4;
        this.project = num;
        this.collectionName = str5;
        this.certificateFlag = i;
        this.imageUrl = str6;
        this.dataUrl = str7;
        this.coverUrl = str8;
        this.resourceType = i2;
        this.lastSale = priceDetail;
        this.lastFee = priceDetail2;
        this.authorAddress = str9;
        this.ownerAddress = str10;
        this.network = str11;
        this.owned = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cc: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0031: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r25v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail:?: TERNARY null = ((wrap:int:0x006d: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail) : (r32v0 com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail:?: TERNARY null = ((wrap:int:0x0078: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r33v0 com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail) : (null com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008a: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0095: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r36v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ NFTItem(Long l, String str, String str2, String str3, String str4, Integer num, String str5, int i, String str6, String str7, String str8, int i2, PriceDetail priceDetail, PriceDetail priceDetail2, String str9, String str10, String str11, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : l, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? -1 : num, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? null : priceDetail, (i4 & 8192) == 0 ? priceDetail2 : null, (i4 & 16384) != 0 ? "" : str9, (i4 & 32768) != 0 ? "" : str10, (i4 & 65536) == 0 ? str11 : "", (i4 & 131072) != 0 ? 0 : i3);
    }
}
