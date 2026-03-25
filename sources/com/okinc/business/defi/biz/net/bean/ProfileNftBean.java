package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.bean.NftDetail;
import com.okinc.business.defi.api.bean.NftDetail$$serializer;
import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.api.bean.NftPrice$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ProfileNftBean implements Parcelable {
    private String address;
    private String backgroundImage;
    private Integer certificateFlag;
    private String collectionName;
    private String contractAddress;
    private String desc;
    private ArrayList<NftDetail> detail;
    private NftPrice floorPrice;
    private NftPrice floorSalePrice;
    private long generalChainId;
    private String logo;
    private NftPrice medianPrice;
    private String name;
    private String network;
    private Integer owned;
    private Boolean owner;
    private String platformUrl;
    private Integer project;
    private NftPrice topPrice;
    private Integer total;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProfileNftBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(NftDetail$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ProfileNftBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileNftBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ProfileNftBean.class.getClassLoader()));
                }
            }
            return new ProfileNftBean(string, j, string2, string3, string4, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (NftPrice) parcel.readParcelable(ProfileNftBean.class.getClassLoader()), (NftPrice) parcel.readParcelable(ProfileNftBean.class.getClassLoader()), (NftPrice) parcel.readParcelable(ProfileNftBean.class.getClassLoader()), (NftPrice) parcel.readParcelable(ProfileNftBean.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileNftBean[] newArray(int i) {
            return new ProfileNftBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfileNftBean() {
        this((String) null, 0L, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (NftPrice) null, (NftPrice) null, (NftPrice) null, (NftPrice) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, 2097151, (DefaultConstructorMarker) null);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getGeneralChainId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component10() {
        return this.topPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component11() {
        return this.floorPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component12() {
        return this.medianPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component13() {
        return this.floorSalePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.certificateFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftDetail> component6() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfileNftBean copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, ArrayList<NftDetail> arrayList, String str5, String str6, String str7, NftPrice nftPrice, NftPrice nftPrice2, NftPrice nftPrice3, NftPrice nftPrice4, String str8, @NotNull String str9, Integer num, Integer num2, String str10, Integer num3, Boolean bool, Integer num4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ProfileNftBean(str, j, str2, str3, str4, arrayList, str5, str6, str7, nftPrice, nftPrice2, nftPrice3, nftPrice4, str8, str9, num, num2, str10, num3, bool, num4);
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
        if (!(obj instanceof ProfileNftBean)) {
            return false;
        }
        ProfileNftBean profileNftBean = (ProfileNftBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) profileNftBean.name) && this.generalChainId == profileNftBean.generalChainId && Intrinsics.EZpvd((Object) this.network, (Object) profileNftBean.network) && Intrinsics.EZpvd((Object) this.logo, (Object) profileNftBean.logo) && Intrinsics.EZpvd((Object) this.url, (Object) profileNftBean.url) && Intrinsics.EZpvd(this.detail, profileNftBean.detail) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) profileNftBean.contractAddress) && Intrinsics.EZpvd((Object) this.address, (Object) profileNftBean.address) && Intrinsics.EZpvd((Object) this.desc, (Object) profileNftBean.desc) && Intrinsics.EZpvd(this.topPrice, profileNftBean.topPrice) && Intrinsics.EZpvd(this.floorPrice, profileNftBean.floorPrice) && Intrinsics.EZpvd(this.medianPrice, profileNftBean.medianPrice) && Intrinsics.EZpvd(this.floorSalePrice, profileNftBean.floorSalePrice) && Intrinsics.EZpvd((Object) this.collectionName, (Object) profileNftBean.collectionName) && Intrinsics.EZpvd((Object) this.platformUrl, (Object) profileNftBean.platformUrl) && Intrinsics.EZpvd(this.certificateFlag, profileNftBean.certificateFlag) && Intrinsics.EZpvd(this.project, profileNftBean.project) && Intrinsics.EZpvd((Object) this.backgroundImage, (Object) profileNftBean.backgroundImage) && Intrinsics.EZpvd(this.owned, profileNftBean.owned) && Intrinsics.EZpvd(this.owner, profileNftBean.owner) && Intrinsics.EZpvd(this.total, profileNftBean.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCertificateFlag() {
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
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftDetail> getDetail() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getFloorPrice() {
        return this.floorPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getFloorSalePrice() {
        return this.floorSalePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGeneralChainId() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getMedianPrice() {
        return this.medianPrice;
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
    public final Integer getOwned() {
        return this.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformUrl() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice getTopPrice() {
        return this.topPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = Long.hashCode(this.generalChainId);
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = this.logo.hashCode();
        int iHashCode5 = this.url.hashCode();
        ArrayList<NftDetail> arrayList = this.detail;
        int iHashCode6 = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.contractAddress;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        NftPrice nftPrice = this.topPrice;
        int iHashCode10 = nftPrice == null ? 0 : nftPrice.hashCode();
        NftPrice nftPrice2 = this.floorPrice;
        int iHashCode11 = nftPrice2 == null ? 0 : nftPrice2.hashCode();
        NftPrice nftPrice3 = this.medianPrice;
        int iHashCode12 = nftPrice3 == null ? 0 : nftPrice3.hashCode();
        NftPrice nftPrice4 = this.floorSalePrice;
        int iHashCode13 = nftPrice4 == null ? 0 : nftPrice4.hashCode();
        String str4 = this.collectionName;
        int iHashCode14 = str4 == null ? 0 : str4.hashCode();
        int iHashCode15 = this.platformUrl.hashCode();
        Integer num = this.certificateFlag;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        Integer num2 = this.project;
        int iHashCode17 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.backgroundImage;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        Integer num3 = this.owned;
        int iHashCode19 = num3 == null ? 0 : num3.hashCode();
        Boolean bool = this.owner;
        int iHashCode20 = bool == null ? 0 : bool.hashCode();
        Integer num4 = this.total;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (num4 == null ? 0 : num4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundImage(String str) {
        this.backgroundImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateFlag(Integer num) {
        this.certificateFlag = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectionName(String str) {
        this.collectionName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDesc(String str) {
        this.desc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetail(ArrayList<NftDetail> arrayList) {
        this.detail = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloorPrice(NftPrice nftPrice) {
        this.floorPrice = nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloorSalePrice(NftPrice nftPrice) {
        this.floorSalePrice = nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralChainId(long j) {
        this.generalChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMedianPrice(NftPrice nftPrice) {
        this.medianPrice = nftPrice;
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
    public final void setOwned(Integer num) {
        this.owned = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwner(Boolean bool) {
        this.owner = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platformUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProject(Integer num) {
        this.project = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopPrice(NftPrice nftPrice) {
        this.topPrice = nftPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(Integer num) {
        this.total = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfileNftBean(name=" + this.name + ", generalChainId=" + this.generalChainId + ", network=" + this.network + ", logo=" + this.logo + ", url=" + this.url + ", detail=" + this.detail + ", contractAddress=" + this.contractAddress + ", address=" + this.address + ", desc=" + this.desc + ", topPrice=" + this.topPrice + ", floorPrice=" + this.floorPrice + ", medianPrice=" + this.medianPrice + ", floorSalePrice=" + this.floorSalePrice + ", collectionName=" + this.collectionName + ", platformUrl=" + this.platformUrl + ", certificateFlag=" + this.certificateFlag + ", project=" + this.project + ", backgroundImage=" + this.backgroundImage + ", owned=" + this.owned + ", owner=" + this.owner + ", total=" + this.total + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeLong(this.generalChainId);
        parcel.writeString(this.network);
        parcel.writeString(this.logo);
        parcel.writeString(this.url);
        ArrayList<NftDetail> arrayList = this.detail;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<NftDetail> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.address);
        parcel.writeString(this.desc);
        parcel.writeParcelable(this.topPrice, i);
        parcel.writeParcelable(this.floorPrice, i);
        parcel.writeParcelable(this.medianPrice, i);
        parcel.writeParcelable(this.floorSalePrice, i);
        parcel.writeString(this.collectionName);
        parcel.writeString(this.platformUrl);
        Integer num = this.certificateFlag;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.project;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.backgroundImage);
        Integer num3 = this.owned;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.owner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num4 = this.total;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ProfileNftBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfileNftBean> serializer() {
            return ProfileNftBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfileNftBean(int i, String str, long j, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, String str7, NftPrice nftPrice, NftPrice nftPrice2, NftPrice nftPrice3, NftPrice nftPrice4, String str8, String str9, Integer num, Integer num2, String str10, Integer num3, Boolean bool, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        this.generalChainId = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 8) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
        if ((i & 16) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i & 32) == 0) {
            this.detail = null;
        } else {
            this.detail = arrayList;
        }
        if ((i & 64) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str5;
        }
        if ((i & 128) == 0) {
            this.address = null;
        } else {
            this.address = str6;
        }
        if ((i & 256) == 0) {
            this.desc = null;
        } else {
            this.desc = str7;
        }
        if ((i & 512) == 0) {
            this.topPrice = null;
        } else {
            this.topPrice = nftPrice;
        }
        if ((i & 1024) == 0) {
            this.floorPrice = null;
        } else {
            this.floorPrice = nftPrice2;
        }
        if ((i & 2048) == 0) {
            this.medianPrice = null;
        } else {
            this.medianPrice = nftPrice3;
        }
        if ((i & 4096) == 0) {
            this.floorSalePrice = null;
        } else {
            this.floorSalePrice = nftPrice4;
        }
        if ((i & 8192) == 0) {
            this.collectionName = null;
        } else {
            this.collectionName = str8;
        }
        if ((i & 16384) == 0) {
            this.platformUrl = "";
        } else {
            this.platformUrl = str9;
        }
        if ((32768 & i) == 0) {
            this.certificateFlag = null;
        } else {
            this.certificateFlag = num;
        }
        this.project = (65536 & i) == 0 ? 0 : num2;
        if ((131072 & i) == 0) {
            this.backgroundImage = null;
        } else {
            this.backgroundImage = str10;
        }
        this.owned = (262144 & i) == 0 ? 0 : num3;
        this.owner = (524288 & i) == 0 ? Boolean.FALSE : bool;
        this.total = (i & 1048576) == 0 ? 0 : num4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ProfileNftBean profileNftBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profileNftBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, profileNftBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || profileNftBean.generalChainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, profileNftBean.generalChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) profileNftBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, profileNftBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) profileNftBean.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, profileNftBean.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) profileNftBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, profileNftBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || profileNftBean.detail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], profileNftBean.detail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || profileNftBean.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, profileNftBean.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || profileNftBean.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, profileNftBean.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || profileNftBean.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, profileNftBean.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || profileNftBean.topPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, NftPrice$$serializer.INSTANCE, profileNftBean.topPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || profileNftBean.floorPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, NftPrice$$serializer.INSTANCE, profileNftBean.floorPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || profileNftBean.medianPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, NftPrice$$serializer.INSTANCE, profileNftBean.medianPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || profileNftBean.floorSalePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, NftPrice$$serializer.INSTANCE, profileNftBean.floorSalePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || profileNftBean.collectionName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, profileNftBean.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) profileNftBean.platformUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, profileNftBean.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || profileNftBean.certificateFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, profileNftBean.certificateFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || (num3 = profileNftBean.project) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, profileNftBean.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || profileNftBean.backgroundImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, profileNftBean.backgroundImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || (num2 = profileNftBean.owned) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, profileNftBean.owned);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(profileNftBean.owner, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, profileNftBean.owner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || (num = profileNftBean.total) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, profileNftBean.total);
        }
    }

    public ProfileNftBean(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, ArrayList<NftDetail> arrayList, String str5, String str6, String str7, NftPrice nftPrice, NftPrice nftPrice2, NftPrice nftPrice3, NftPrice nftPrice4, String str8, @NotNull String str9, Integer num, Integer num2, String str10, Integer num3, Boolean bool, Integer num4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.name = str;
        this.generalChainId = j;
        this.network = str2;
        this.logo = str3;
        this.url = str4;
        this.detail = arrayList;
        this.contractAddress = str5;
        this.address = str6;
        this.desc = str7;
        this.topPrice = nftPrice;
        this.floorPrice = nftPrice2;
        this.medianPrice = nftPrice3;
        this.floorSalePrice = nftPrice4;
        this.collectionName = str8;
        this.platformUrl = str9;
        this.certificateFlag = num;
        this.project = num2;
        this.backgroundImage = str10;
        this.owned = num3;
        this.owner = bool;
        this.total = num4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r47v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r47v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r47v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r47v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r47v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002d: ARITH (r47v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r31v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r47v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r47v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r47v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x004d: ARITH (r47v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r35v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x0055: ARITH (r47v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r36v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x005d: ARITH (r47v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r37v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:com.okinc.business.defi.api.bean.NftPrice:?: TERNARY null = ((wrap:int:0x0065: ARITH (r47v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NftPrice) : (r38v0 com.okinc.business.defi.api.bean.NftPrice))
  (wrap:java.lang.String:0x0077: TERNARY null = ((wrap:int:0x006f: ARITH (r47v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r47v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0085: ARITH (r47v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0090: ARITH (r47v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r47v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r47v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r47v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bb: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r45v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r47v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 java.lang.Integer))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.defi.api.bean.NftDetail>, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:57) call: com.okinc.business.defi.biz.net.bean.ProfileNftBean.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, com.okinc.business.defi.api.bean.NftPrice, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ ProfileNftBean(String str, long j, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, String str7, NftPrice nftPrice, NftPrice nftPrice2, NftPrice nftPrice3, NftPrice nftPrice4, String str8, String str9, Integer num, Integer num2, String str10, Integer num3, Boolean bool, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : arrayList, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : nftPrice, (i & 1024) != 0 ? null : nftPrice2, (i & 2048) != 0 ? null : nftPrice3, (i & 4096) != 0 ? null : nftPrice4, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? "" : str9, (i & 32768) != 0 ? null : num, (i & 65536) != 0 ? 0 : num2, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? 0 : num3, (i & 524288) != 0 ? Boolean.FALSE : bool, (i & 1048576) != 0 ? 0 : num4);
    }
}
