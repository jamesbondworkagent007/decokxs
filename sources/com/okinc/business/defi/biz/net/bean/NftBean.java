package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.api.bean.NftPrice$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NftBean implements Parcelable {
    private NftPrice floorSalePrice;
    private long generalChainId;
    private String logo;
    private String name;
    private String network;
    private Integer owned;
    private Boolean owner;
    private Integer project;
    private Integer total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NftBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NftBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            NftPrice nftPrice = (NftPrice) parcel.readParcelable(NftBean.class.getClassLoader());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NftBean(numValueOf, string, string2, string3, j, nftPrice, numValueOf2, numValueOf3, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftBean[] newArray(int i) {
            return new NftBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftBean() {
        this((Integer) null, (String) null, (String) null, (String) null, 0L, (NftPrice) null, (Integer) null, (Integer) null, (Boolean) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @SerialName("fsp")
    public static /* synthetic */ void getFloorSalePrice$annotations() {
    }

    @SerialName("chId")
    public static /* synthetic */ void getGeneralChainId$annotations() {
    }

    @SerialName("lg")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @SerialName("nm")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("net")
    public static /* synthetic */ void getNetwork$annotations() {
    }

    @SerialName("od")
    public static /* synthetic */ void getOwned$annotations() {
    }

    @SerialName("prj")
    public static /* synthetic */ void getProject$annotations() {
    }

    @SerialName("tot")
    public static /* synthetic */ void getTotal$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
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
    public final long component5() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice component6() {
        return this.floorSalePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.owned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftBean copy(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, NftPrice nftPrice, Integer num2, Integer num3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NftBean(num, str, str2, str3, j, nftPrice, num2, num3, bool);
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
        if (!(obj instanceof NftBean)) {
            return false;
        }
        NftBean nftBean = (NftBean) obj;
        return Intrinsics.EZpvd(this.project, nftBean.project) && Intrinsics.EZpvd((Object) this.name, (Object) nftBean.name) && Intrinsics.EZpvd((Object) this.network, (Object) nftBean.network) && Intrinsics.EZpvd((Object) this.logo, (Object) nftBean.logo) && this.generalChainId == nftBean.generalChainId && Intrinsics.EZpvd(this.floorSalePrice, nftBean.floorSalePrice) && Intrinsics.EZpvd(this.owned, nftBean.owned) && Intrinsics.EZpvd(this.total, nftBean.total) && Intrinsics.EZpvd(this.owner, nftBean.owner);
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
    public final Integer getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.project;
        int iHashCode = num == null ? 0 : num.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = this.logo.hashCode();
        int iHashCode5 = Long.hashCode(this.generalChainId);
        NftPrice nftPrice = this.floorSalePrice;
        int iHashCode6 = nftPrice == null ? 0 : nftPrice.hashCode();
        Integer num2 = this.owned;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.total;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        Boolean bool = this.owner;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool != null ? bool.hashCode() : 0);
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
    public final void setProject(Integer num) {
        this.project = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(Integer num) {
        this.total = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NftBean(project=" + this.project + ", name=" + this.name + ", network=" + this.network + ", logo=" + this.logo + ", generalChainId=" + this.generalChainId + ", floorSalePrice=" + this.floorSalePrice + ", owned=" + this.owned + ", total=" + this.total + ", owner=" + this.owner + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.project;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.network);
        parcel.writeString(this.logo);
        parcel.writeLong(this.generalChainId);
        parcel.writeParcelable(this.floorSalePrice, i);
        Integer num2 = this.owned;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.total;
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.NftBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftBean> serializer() {
            return NftBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftBean(int i, Integer num, String str, String str2, String str3, long j, NftPrice nftPrice, Integer num2, Integer num3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.project = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
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
            this.generalChainId = 0L;
        } else {
            this.generalChainId = j;
        }
        if ((i & 32) == 0) {
            this.floorSalePrice = null;
        } else {
            this.floorSalePrice = nftPrice;
        }
        if ((i & 64) == 0) {
            this.owned = 0;
        } else {
            this.owned = num2;
        }
        if ((i & 128) == 0) {
            this.total = 0;
        } else {
            this.total = num3;
        }
        if ((i & 256) == 0) {
            this.owner = Boolean.FALSE;
        } else {
            this.owner = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NftBean nftBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num3 = nftBean.project) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, nftBean.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nftBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nftBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nftBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, nftBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) nftBean.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, nftBean.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || nftBean.generalChainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, nftBean.generalChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || nftBean.floorSalePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, NftPrice$$serializer.INSTANCE, nftBean.floorSalePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num2 = nftBean.owned) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, nftBean.owned);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num = nftBean.total) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, nftBean.total);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(nftBean.owner, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, nftBean.owner);
    }

    public NftBean(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, NftPrice nftPrice, Integer num2, Integer num3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.project = num;
        this.name = str;
        this.network = str2;
        this.logo = str3;
        this.generalChainId = j;
        this.floorSalePrice = nftPrice;
        this.owned = num2;
        this.total = num3;
        this.owner = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NftBean(Integer num, String str, String str2, String str3, long j, NftPrice nftPrice, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? num : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : nftPrice, (i & 64) != 0 ? num : num2, (i & 128) == 0 ? num3 : 0, (i & 256) != 0 ? Boolean.FALSE : bool);
    }
}
