package com.okinc.business.defi.biz.core.ws.channel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CollectionItem {
    private String backgroundImage;
    private int certificateFlag;
    private long chainId;
    private String collectionName;
    private String contractAddress;
    private String desc;
    private PriceDetail floorSalePrice;
    private String logo;
    private String name;
    private String network;
    private int project;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CollectionItem() {
        this(0, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (PriceDetail) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.certificateFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail component11() {
        return this.floorSalePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollectionItem copy(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, PriceDetail priceDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CollectionItem(i, j, str, str2, str3, str4, str5, str6, str7, i2, priceDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionItem)) {
            return false;
        }
        CollectionItem collectionItem = (CollectionItem) obj;
        return this.project == collectionItem.project && this.chainId == collectionItem.chainId && Intrinsics.EZpvd((Object) this.name, (Object) collectionItem.name) && Intrinsics.EZpvd((Object) this.network, (Object) collectionItem.network) && Intrinsics.EZpvd((Object) this.logo, (Object) collectionItem.logo) && Intrinsics.EZpvd((Object) this.backgroundImage, (Object) collectionItem.backgroundImage) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) collectionItem.contractAddress) && Intrinsics.EZpvd((Object) this.desc, (Object) collectionItem.desc) && Intrinsics.EZpvd((Object) this.collectionName, (Object) collectionItem.collectionName) && this.certificateFlag == collectionItem.certificateFlag && Intrinsics.EZpvd(this.floorSalePrice, collectionItem.floorSalePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCertificateFlag() {
        return this.certificateFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
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
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail getFloorSalePrice() {
        return this.floorSalePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
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
    public final int getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.project);
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.network.hashCode();
        int iHashCode5 = this.logo.hashCode();
        int iHashCode6 = this.backgroundImage.hashCode();
        int iHashCode7 = this.contractAddress.hashCode();
        int iHashCode8 = this.desc.hashCode();
        int iHashCode9 = this.collectionName.hashCode();
        int iHashCode10 = Integer.hashCode(this.certificateFlag);
        PriceDetail priceDetail = this.floorSalePrice;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (priceDetail == null ? 0 : priceDetail.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backgroundImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateFlag(int i) {
        this.certificateFlag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
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
    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.desc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloorSalePrice(PriceDetail priceDetail) {
        this.floorSalePrice = priceDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
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
    public final void setProject(int i) {
        this.project = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CollectionItem(project=" + this.project + ", chainId=" + this.chainId + ", name=" + this.name + ", network=" + this.network + ", logo=" + this.logo + ", backgroundImage=" + this.backgroundImage + ", contractAddress=" + this.contractAddress + ", desc=" + this.desc + ", collectionName=" + this.collectionName + ", certificateFlag=" + this.certificateFlag + ", floorSalePrice=" + this.floorSalePrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CollectionItem> serializer() {
            return CollectionItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CollectionItem(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, PriceDetail priceDetail, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.project = 0;
        } else {
            this.project = i2;
        }
        if ((i & 2) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 8) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 16) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
        if ((i & 32) == 0) {
            this.backgroundImage = "";
        } else {
            this.backgroundImage = str4;
        }
        if ((i & 64) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str5;
        }
        if ((i & 128) == 0) {
            this.desc = "";
        } else {
            this.desc = str6;
        }
        if ((i & 256) == 0) {
            this.collectionName = "";
        } else {
            this.collectionName = str7;
        }
        if ((i & 512) == 0) {
            this.certificateFlag = 0;
        } else {
            this.certificateFlag = i3;
        }
        if ((i & 1024) == 0) {
            this.floorSalePrice = null;
        } else {
            this.floorSalePrice = priceDetail;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CollectionItem collectionItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || collectionItem.project != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, collectionItem.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || collectionItem.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, collectionItem.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) collectionItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, collectionItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) collectionItem.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, collectionItem.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) collectionItem.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, collectionItem.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) collectionItem.backgroundImage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, collectionItem.backgroundImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) collectionItem.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, collectionItem.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) collectionItem.desc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, collectionItem.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) collectionItem.collectionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, collectionItem.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || collectionItem.certificateFlag != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, collectionItem.certificateFlag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && collectionItem.floorSalePrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, PriceDetail$$serializer.INSTANCE, collectionItem.floorSalePrice);
    }

    public CollectionItem(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, PriceDetail priceDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.project = i;
        this.chainId = j;
        this.name = str;
        this.network = str2;
        this.logo = str3;
        this.backgroundImage = str4;
        this.contractAddress = str5;
        this.desc = str6;
        this.collectionName = str7;
        this.certificateFlag = i2;
        this.floorSalePrice = priceDetail;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 int) : (0 int))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail) : (r25v0 com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail))
 A[MD:(int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail):void (m)] (LINE:48) call: com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem.<init>(int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail):void type: THIS */
    public /* synthetic */ CollectionItem(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, PriceDetail priceDetail, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) == 0 ? str7 : "", (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) != 0 ? null : priceDetail);
    }
}
