package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RecommendedInvestment implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int INVEST_TYPE_FARM = 3;
    public static final int INVEST_TYPE_POOL = 2;
    public static final int INVEST_TYPE_SAVE = 1;
    public static final int INVEST_TYPE_STAKE = 5;
    public static final int INVEST_TYPE_VAULTS = 4;
    public static final int RATE_TYPE_APR = 1;
    public static final int RATE_TYPE_APY = 0;
    private final long aggregateInvestmentId;
    private final List<Logo> bottomRightLogoList;
    private final long chainId;
    private final int investType;
    private final long investmentId;
    private final String investmentName;
    private final String investmentShowName;
    private final List<Logo> middleLogoList;
    private final String network;
    private final String networkLogo;
    private final String platformLogo;
    private final String platformName;
    private final String rate;
    private final int rateType;
    private final String rateTypeDesc;
    private final int recommendType;
    private final String recommendTypeDesc;
    private final int sequence;
    private final List<Logo> topLeftLogoList;
    private final List<Logo> topRightLogoList;
    private final String tvl;
    private final List<UnderlyingToken> underlyingToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendedInvestment> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecommendedInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedInvestment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            String string6 = parcel.readString();
            long j2 = parcel.readLong();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            long j3 = parcel.readLong();
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList2.add(Logo.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            int i7 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList3.add(Logo.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            int i9 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList4.add(Logo.CREATOR.createFromParcel(parcel));
                i10++;
                i9 = i9;
            }
            int i11 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList5.add(Logo.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            return new RecommendedInvestment(j, string, string2, string3, i, string4, string5, i2, string6, j2, string7, string8, arrayList, j3, arrayList2, arrayList3, arrayList4, arrayList5, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedInvestment[] newArray(int i) {
            return new RecommendedInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendedInvestment() {
        this(0L, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, 0L, (String) null, (String) null, (List) null, 0L, (List) null, (List) null, (List) null, (List) null, (String) null, 0, 0, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component13() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component14() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> component15() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> component16() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> component17() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> component18() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.recommendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.recommendTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendedInvestment copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, long j2, @NotNull String str7, @NotNull String str8, @NotNull List<UnderlyingToken> list, long j3, @NotNull List<Logo> list2, @NotNull List<Logo> list3, @NotNull List<Logo> list4, @NotNull List<Logo> list5, @NotNull String str9, int i3, int i4, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new RecommendedInvestment(j, str, str2, str3, i, str4, str5, i2, str6, j2, str7, str8, list, j3, list2, list3, list4, list5, str9, i3, i4, str10);
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
        if (!(obj instanceof RecommendedInvestment)) {
            return false;
        }
        RecommendedInvestment recommendedInvestment = (RecommendedInvestment) obj;
        return this.investmentId == recommendedInvestment.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) recommendedInvestment.investmentName) && Intrinsics.EZpvd((Object) this.platformName, (Object) recommendedInvestment.platformName) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) recommendedInvestment.platformLogo) && this.investType == recommendedInvestment.investType && Intrinsics.EZpvd((Object) this.tvl, (Object) recommendedInvestment.tvl) && Intrinsics.EZpvd((Object) this.rate, (Object) recommendedInvestment.rate) && this.rateType == recommendedInvestment.rateType && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) recommendedInvestment.rateTypeDesc) && this.chainId == recommendedInvestment.chainId && Intrinsics.EZpvd((Object) this.network, (Object) recommendedInvestment.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) recommendedInvestment.networkLogo) && Intrinsics.EZpvd(this.underlyingToken, recommendedInvestment.underlyingToken) && this.aggregateInvestmentId == recommendedInvestment.aggregateInvestmentId && Intrinsics.EZpvd(this.middleLogoList, recommendedInvestment.middleLogoList) && Intrinsics.EZpvd(this.bottomRightLogoList, recommendedInvestment.bottomRightLogoList) && Intrinsics.EZpvd(this.topRightLogoList, recommendedInvestment.topRightLogoList) && Intrinsics.EZpvd(this.topLeftLogoList, recommendedInvestment.topLeftLogoList) && Intrinsics.EZpvd((Object) this.investmentShowName, (Object) recommendedInvestment.investmentShowName) && this.sequence == recommendedInvestment.sequence && this.recommendType == recommendedInvestment.recommendType && Intrinsics.EZpvd((Object) this.recommendTypeDesc, (Object) recommendedInvestment.recommendTypeDesc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAggregateInvestmentId() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentShowName() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecommendType() {
        return this.recommendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendTypeDesc() {
        return this.recommendTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Logo> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getUnderlyingToken() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.investmentId) * 31) + this.investmentName.hashCode()) * 31) + this.platformName.hashCode()) * 31) + this.platformLogo.hashCode()) * 31) + Integer.hashCode(this.investType)) * 31) + this.tvl.hashCode()) * 31) + this.rate.hashCode()) * 31) + Integer.hashCode(this.rateType)) * 31) + this.rateTypeDesc.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + this.network.hashCode()) * 31) + this.networkLogo.hashCode()) * 31) + this.underlyingToken.hashCode()) * 31) + Long.hashCode(this.aggregateInvestmentId)) * 31) + this.middleLogoList.hashCode()) * 31) + this.bottomRightLogoList.hashCode()) * 31) + this.topRightLogoList.hashCode()) * 31) + this.topLeftLogoList.hashCode()) * 31) + this.investmentShowName.hashCode()) * 31) + Integer.hashCode(this.sequence)) * 31) + Integer.hashCode(this.recommendType)) * 31) + this.recommendTypeDesc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendedInvestment(investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", platformName=" + this.platformName + ", platformLogo=" + this.platformLogo + ", investType=" + this.investType + ", tvl=" + this.tvl + ", rate=" + this.rate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", chainId=" + this.chainId + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", underlyingToken=" + this.underlyingToken + ", aggregateInvestmentId=" + this.aggregateInvestmentId + ", middleLogoList=" + this.middleLogoList + ", bottomRightLogoList=" + this.bottomRightLogoList + ", topRightLogoList=" + this.topRightLogoList + ", topLeftLogoList=" + this.topLeftLogoList + ", investmentShowName=" + this.investmentShowName + ", sequence=" + this.sequence + ", recommendType=" + this.recommendType + ", recommendTypeDesc=" + this.recommendTypeDesc + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        parcel.writeString(this.platformName);
        parcel.writeString(this.platformLogo);
        parcel.writeInt(this.investType);
        parcel.writeString(this.tvl);
        parcel.writeString(this.rate);
        parcel.writeInt(this.rateType);
        parcel.writeString(this.rateTypeDesc);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        List<UnderlyingToken> list = this.underlyingToken;
        parcel.writeInt(list.size());
        Iterator<UnderlyingToken> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.aggregateInvestmentId);
        List<Logo> list2 = this.middleLogoList;
        parcel.writeInt(list2.size());
        Iterator<Logo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<Logo> list3 = this.bottomRightLogoList;
        parcel.writeInt(list3.size());
        Iterator<Logo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<Logo> list4 = this.topRightLogoList;
        parcel.writeInt(list4.size());
        Iterator<Logo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        List<Logo> list5 = this.topLeftLogoList;
        parcel.writeInt(list5.size());
        Iterator<Logo> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.investmentShowName);
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.recommendType);
        parcel.writeString(this.recommendTypeDesc);
    }

    public /* synthetic */ RecommendedInvestment(int i, long j, String str, String str2, String str3, int i2, String str4, String str5, int i3, String str6, long j2, String str7, String str8, List list, long j3, List list2, List list3, List list4, List list5, String str9, int i4, int i5, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
        if ((i & 2) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str;
        }
        if ((i & 4) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str2;
        }
        if ((i & 8) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str3;
        }
        if ((i & 16) == 0) {
            this.investType = 0;
        } else {
            this.investType = i2;
        }
        if ((i & 32) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str4;
        }
        if ((i & 64) == 0) {
            this.rate = "";
        } else {
            this.rate = str5;
        }
        if ((i & 128) == 0) {
            this.rateType = 0;
        } else {
            this.rateType = i3;
        }
        if ((i & 256) == 0) {
            this.rateTypeDesc = "";
        } else {
            this.rateTypeDesc = str6;
        }
        if ((i & 512) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 1024) == 0) {
            this.network = "";
        } else {
            this.network = str7;
        }
        if ((i & 2048) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str8;
        }
        this.underlyingToken = (i & 4096) == 0 ? yDY.AhwBna() : list;
        if ((i & 8192) == 0) {
            this.aggregateInvestmentId = 0L;
        } else {
            this.aggregateInvestmentId = j3;
        }
        this.middleLogoList = (i & 16384) == 0 ? yDY.AhwBna() : list2;
        this.bottomRightLogoList = (32768 & i) == 0 ? yDY.AhwBna() : list3;
        this.topRightLogoList = (65536 & i) == 0 ? yDY.AhwBna() : list4;
        this.topLeftLogoList = (131072 & i) == 0 ? yDY.AhwBna() : list5;
        if ((262144 & i) == 0) {
            this.investmentShowName = "";
        } else {
            this.investmentShowName = str9;
        }
        if ((524288 & i) == 0) {
            this.sequence = 0;
        } else {
            this.sequence = i4;
        }
        if ((1048576 & i) == 0) {
            this.recommendType = 0;
        } else {
            this.recommendType = i5;
        }
        if ((i & 2097152) == 0) {
            this.recommendTypeDesc = "";
        } else {
            this.recommendTypeDesc = str10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [847=6] */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RecommendedInvestment recommendedInvestment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recommendedInvestment.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, recommendedInvestment.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recommendedInvestment.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recommendedInvestment.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recommendedInvestment.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recommendedInvestment.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recommendedInvestment.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recommendedInvestment.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || recommendedInvestment.investType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, recommendedInvestment.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recommendedInvestment.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recommendedInvestment.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recommendedInvestment.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recommendedInvestment.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || recommendedInvestment.rateType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, recommendedInvestment.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recommendedInvestment.rateTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recommendedInvestment.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recommendedInvestment.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, recommendedInvestment.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recommendedInvestment.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recommendedInvestment.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recommendedInvestment.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recommendedInvestment.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(recommendedInvestment.underlyingToken, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], recommendedInvestment.underlyingToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || recommendedInvestment.aggregateInvestmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, recommendedInvestment.aggregateInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(recommendedInvestment.middleLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], recommendedInvestment.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(recommendedInvestment.bottomRightLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], recommendedInvestment.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(recommendedInvestment.topRightLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], recommendedInvestment.topRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(recommendedInvestment.topLeftLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], recommendedInvestment.topLeftLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) recommendedInvestment.investmentShowName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, recommendedInvestment.investmentShowName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || recommendedInvestment.sequence != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, recommendedInvestment.sequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || recommendedInvestment.recommendType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, recommendedInvestment.recommendType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) recommendedInvestment.recommendTypeDesc, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, recommendedInvestment.recommendTypeDesc);
    }

    public RecommendedInvestment(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, long j2, @NotNull String str7, @NotNull String str8, @NotNull List<UnderlyingToken> list, long j3, @NotNull List<Logo> list2, @NotNull List<Logo> list3, @NotNull List<Logo> list4, @NotNull List<Logo> list5, @NotNull String str9, int i3, int i4, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.investmentId = j;
        this.investmentName = str;
        this.platformName = str2;
        this.platformLogo = str3;
        this.investType = i;
        this.tvl = str4;
        this.rate = str5;
        this.rateType = i2;
        this.rateTypeDesc = str6;
        this.chainId = j2;
        this.network = str7;
        this.networkLogo = str8;
        this.underlyingToken = list;
        this.aggregateInvestmentId = j3;
        this.middleLogoList = list2;
        this.bottomRightLogoList = list3;
        this.topRightLogoList = list4;
        this.topLeftLogoList = list5;
        this.investmentShowName = str9;
        this.sequence = i3;
        this.recommendType = i4;
        this.recommendTypeDesc = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0109: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004d: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r37v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0066: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:869)) : (r41v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0073: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r42v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007c: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:871)) : (r44v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008a: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:872)) : (r45v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0097: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:873)) : (r46v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a8: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:874)) : (r47v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment$UnderlyingToken>, long, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment$Logo>, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment$Logo>, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment$Logo>, java.util.List<com.okinc.business.defi.biz.net.bean.RecommendedInvestment$Logo>, java.lang.String, int, int, java.lang.String):void (m)] (LINE:850) call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.<init>(long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, long, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ RecommendedInvestment(long j, String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, long j2, String str7, String str8, List list, long j3, List list2, List list3, List list4, List list5, String str9, int i3, int i4, String str10, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? "" : str3, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? "" : str5, (i5 & 128) != 0 ? 0 : i2, (i5 & 256) != 0 ? "" : str6, (i5 & 512) != 0 ? 0L : j2, (i5 & 1024) != 0 ? "" : str7, (i5 & 2048) != 0 ? "" : str8, (i5 & 4096) != 0 ? yDY.AhwBna() : list, (i5 & 8192) != 0 ? 0L : j3, (i5 & 16384) != 0 ? yDY.AhwBna() : list2, (i5 & 32768) != 0 ? yDY.AhwBna() : list3, (i5 & 65536) != 0 ? yDY.AhwBna() : list4, (i5 & 131072) != 0 ? yDY.AhwBna() : list5, (i5 & 262144) != 0 ? "" : str9, (i5 & 524288) != 0 ? 0 : i3, (i5 & 1048576) != 0 ? 0 : i4, (i5 & 2097152) != 0 ? "" : str10);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecommendedInvestment> serializer() {
            return RecommendedInvestment$$serializer.INSTANCE;
        }
    }

    static {
        RecommendedInvestment$Logo$$serializer recommendedInvestment$Logo$$serializer = RecommendedInvestment$Logo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RecommendedInvestment$UnderlyingToken$$serializer.INSTANCE), null, new ArrayListSerializer(recommendedInvestment$Logo$$serializer), new ArrayListSerializer(recommendedInvestment$Logo$$serializer), new ArrayListSerializer(recommendedInvestment$Logo$$serializer), new ArrayListSerializer(recommendedInvestment$Logo$$serializer), null, null, null, null};
    }

    @Serializable
    public static final class UnderlyingToken implements Parcelable {
        public static final int $stable = 0;
        private final boolean isBaseToken;
        private final String tokenAddress;
        private final String tokenLogo;
        private final String tokenSymbol;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<UnderlyingToken> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<UnderlyingToken> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnderlyingToken createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UnderlyingToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnderlyingToken[] newArray(int i) {
                return new UnderlyingToken[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UnderlyingToken() {
            this((String) null, (String) null, (String) null, false, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnderlyingToken copy$default(UnderlyingToken underlyingToken, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = underlyingToken.tokenSymbol;
            }
            if ((i & 2) != 0) {
                str2 = underlyingToken.tokenLogo;
            }
            if ((i & 4) != 0) {
                str3 = underlyingToken.tokenAddress;
            }
            if ((i & 8) != 0) {
                z = underlyingToken.isBaseToken;
            }
            return underlyingToken.copy(str, str2, str3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isBaseToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnderlyingToken copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new UnderlyingToken(str, str2, str3, z);
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
            if (!(obj instanceof UnderlyingToken)) {
                return false;
            }
            UnderlyingToken underlyingToken = (UnderlyingToken) obj;
            return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) underlyingToken.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) underlyingToken.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) underlyingToken.tokenAddress) && this.isBaseToken == underlyingToken.isBaseToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.tokenSymbol.hashCode() * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + Boolean.hashCode(this.isBaseToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isBaseToken() {
            return this.isBaseToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnderlyingToken(tokenSymbol=" + this.tokenSymbol + ", tokenLogo=" + this.tokenLogo + ", tokenAddress=" + this.tokenAddress + ", isBaseToken=" + this.isBaseToken + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenSymbol);
            parcel.writeString(this.tokenLogo);
            parcel.writeString(this.tokenAddress);
            parcel.writeInt(this.isBaseToken ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.UnderlyingToken.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UnderlyingToken> serializer() {
                return RecommendedInvestment$UnderlyingToken$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UnderlyingToken(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tokenSymbol = "";
            } else {
                this.tokenSymbol = str;
            }
            if ((i & 2) == 0) {
                this.tokenLogo = "";
            } else {
                this.tokenLogo = str2;
            }
            if ((i & 4) == 0) {
                this.tokenAddress = "";
            } else {
                this.tokenAddress = str3;
            }
            if ((i & 8) == 0) {
                this.isBaseToken = false;
            } else {
                this.isBaseToken = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UnderlyingToken underlyingToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) underlyingToken.tokenSymbol, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, underlyingToken.tokenSymbol);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) underlyingToken.tokenLogo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, underlyingToken.tokenLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) underlyingToken.tokenAddress, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, underlyingToken.tokenAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || underlyingToken.isBaseToken) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, underlyingToken.isBaseToken);
            }
        }

        public UnderlyingToken(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.tokenSymbol = str;
            this.tokenLogo = str2;
            this.tokenAddress = str3;
            this.isBaseToken = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:894) call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.UnderlyingToken.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ UnderlyingToken(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
        }
    }

    @Serializable
    public static final class Logo implements Parcelable {
        public static final int $stable = 0;
        private final String tokenLogo;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Logo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Logo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Logo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Logo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Logo[] newArray(int i) {
                return new Logo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Logo() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Logo copy$default(Logo logo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logo.tokenLogo;
            }
            return logo.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Logo copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Logo(str);
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
            return (obj instanceof Logo) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) ((Logo) obj).tokenLogo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.tokenLogo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Logo(tokenLogo=" + this.tokenLogo + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenLogo);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.Logo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Logo> serializer() {
                return RecommendedInvestment$Logo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Logo(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tokenLogo = "";
            } else {
                this.tokenLogo = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Logo logo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) logo.tokenLogo, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 0, logo.tokenLogo);
        }

        public Logo(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenLogo = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:904) call: com.okinc.business.defi.biz.net.bean.RecommendedInvestment.Logo.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Logo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
