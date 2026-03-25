package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment$$serializer;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl$$serializer;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.Perpetual$$serializer;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.V3BonusStatus;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestedToken implements Parcelable {
    public static final KSerializer<Object>[] $childSerializers;
    public final long aggregateProductId;
    public final List<InvestBaseDefiTokenInfo> borrowed;
    public final List<InvestExtraAssetData> extraAssetList;
    public final InvestUserAssetDetailPromptInformation extraData;
    public final List<InvestPositionDetailExtraFieldData> extraFieldList;
    public final String feeRate;
    public final HealthRate healthRate;
    public final InvestLogo investLogo;
    public final String investTypeName;
    public final InvestmentKind investmentCategory;
    public final String investmentClassify;
    public final long investmentId;
    public final String investmentName;
    public final boolean isInvestTypeSupport;
    public final NetworkLogoUrl networkLogo;
    public final Perpetual perpetual;
    public final List<PositionInfo> positionInfoList;
    public final ProductType productType;
    public final List<InvestUserRewardInfoByInvestment> rewards;
    public final long sourceInvestmentId;
    public final String specialPositionAssetKey;
    public final List<InvestBaseDefiTokenInfo> supplied;
    public final String totalEarnings;
    public final String totalRewardValue;
    public final String totalValue;
    public final List<InvestUserRewardInfoByInvestment> unclaimedFeeRewards;
    public final V3BonusStatus v3BonusStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestedToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestedToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestedToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string = parcel.readString();
            InvestmentKind investmentKindValueOf = InvestmentKind.valueOf(parcel.readString());
            ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
            InvestLogo investLogoCreateFromParcel = InvestLogo.CREATOR.createFromParcel(parcel);
            NetworkLogoUrl networkLogoUrlCreateFromParcel = NetworkLogoUrl.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            V3BonusStatus v3BonusStatusValueOf = V3BonusStatus.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformationCreateFromParcel = InvestUserAssetDetailPromptInformation.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(InvestPositionDetailExtraFieldData.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            Perpetual perpetualCreateFromParcel = parcel.readInt() == 0 ? null : Perpetual.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(InvestExtraAssetData.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList4.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList5.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                i10++;
                i9 = i9;
            }
            int i11 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i11);
            int i12 = 0;
            while (i12 != i11) {
                arrayList6.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                i12++;
                i11 = i11;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                arrayList7.add(PositionInfo.CREATOR.createFromParcel(parcel));
                i14++;
                i13 = i13;
            }
            return new InvestedToken(j, j2, j3, string, investmentKindValueOf, productTypeValueOf, investLogoCreateFromParcel, networkLogoUrlCreateFromParcel, string2, v3BonusStatusValueOf, string3, string4, z, investUserAssetDetailPromptInformationCreateFromParcel, arrayList, perpetualCreateFromParcel, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, parcel.readString(), parcel.readInt() == 0 ? null : HealthRate.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestedToken[] newArray(int i) {
            return new InvestedToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestedToken() {
        this(0L, 0L, 0L, (String) null, (InvestmentKind) null, (ProductType) null, (InvestLogo) null, (NetworkLogoUrl) null, (String) null, (V3BonusStatus) null, (String) null, (String) null, false, (InvestUserAssetDetailPromptInformation) null, (List) null, (Perpetual) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (HealthRate) null, (String) null, (String) null, (String) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestedToken AEQbTJ(long j, long j2, long j3, @NotNull String str, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull String str2, @NotNull V3BonusStatus v3BonusStatus, @NotNull String str3, @NotNull String str4, boolean z, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull List<InvestPositionDetailExtraFieldData> list, Perpetual perpetual, @NotNull List<InvestExtraAssetData> list2, @NotNull List<InvestBaseDefiTokenInfo> list3, @NotNull List<InvestBaseDefiTokenInfo> list4, @NotNull List<InvestUserRewardInfoByInvestment> list5, @NotNull List<InvestUserRewardInfoByInvestment> list6, @NotNull List<PositionInfo> list7, @NotNull String str5, HealthRate healthRate, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(v3BonusStatus, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new InvestedToken(j, j2, j3, str, investmentKind, productType, investLogo, networkLogoUrl, str2, v3BonusStatus, str3, str4, z, investUserAssetDetailPromptInformation, list, perpetual, list2, list3, list4, list5, list6, list7, str5, healthRate, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> AEQbTJ() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestPositionDetailExtraFieldData> AYXKKw() {
        return this.extraFieldList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate AhwBna() {
        return this.healthRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind AkhnZx() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionInfo> AuCTel() {
        return this.positionInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.isInvestTypeSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestExtraAssetData> EZpvd() {
        return this.extraAssetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.aggregateProductId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailPromptInformation copydefault() {
        return this.extraData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo djBIcL() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> ejfBZ() {
        return this.rewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestedToken)) {
            return false;
        }
        InvestedToken investedToken = (InvestedToken) obj;
        return this.aggregateProductId == investedToken.aggregateProductId && this.sourceInvestmentId == investedToken.sourceInvestmentId && this.investmentId == investedToken.investmentId && Intrinsics.EZpvd((Object) this.specialPositionAssetKey, (Object) investedToken.specialPositionAssetKey) && this.investmentCategory == investedToken.investmentCategory && this.productType == investedToken.productType && Intrinsics.EZpvd(this.investLogo, investedToken.investLogo) && Intrinsics.EZpvd(this.networkLogo, investedToken.networkLogo) && Intrinsics.EZpvd((Object) this.investmentName, (Object) investedToken.investmentName) && this.v3BonusStatus == investedToken.v3BonusStatus && Intrinsics.EZpvd((Object) this.investTypeName, (Object) investedToken.investTypeName) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investedToken.totalValue) && this.isInvestTypeSupport == investedToken.isInvestTypeSupport && Intrinsics.EZpvd(this.extraData, investedToken.extraData) && Intrinsics.EZpvd(this.extraFieldList, investedToken.extraFieldList) && Intrinsics.EZpvd(this.perpetual, investedToken.perpetual) && Intrinsics.EZpvd(this.extraAssetList, investedToken.extraAssetList) && Intrinsics.EZpvd(this.supplied, investedToken.supplied) && Intrinsics.EZpvd(this.borrowed, investedToken.borrowed) && Intrinsics.EZpvd(this.rewards, investedToken.rewards) && Intrinsics.EZpvd(this.unclaimedFeeRewards, investedToken.unclaimedFeeRewards) && Intrinsics.EZpvd(this.positionInfoList, investedToken.positionInfoList) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) investedToken.totalEarnings) && Intrinsics.EZpvd(this.healthRate, investedToken.healthRate) && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investedToken.investmentClassify) && Intrinsics.EZpvd((Object) this.totalRewardValue, (Object) investedToken.totalRewardValue) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investedToken.feeRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Perpetual fARcdN() {
        return this.perpetual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fIwbmz() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType fJNWhG() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkLogoUrl fetchVPNInfo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.investTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getNewProxyInstance() {
        return this.supplied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.specialPositionAssetKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.aggregateProductId);
        int iHashCode2 = Long.hashCode(this.sourceInvestmentId);
        int iHashCode3 = Long.hashCode(this.investmentId);
        int iHashCode4 = this.specialPositionAssetKey.hashCode();
        int iHashCode5 = this.investmentCategory.hashCode();
        int iHashCode6 = this.productType.hashCode();
        int iHashCode7 = this.investLogo.hashCode();
        int iHashCode8 = this.networkLogo.hashCode();
        int iHashCode9 = this.investmentName.hashCode();
        int iHashCode10 = this.v3BonusStatus.hashCode();
        int iHashCode11 = this.investTypeName.hashCode();
        int iHashCode12 = this.totalValue.hashCode();
        int iHashCode13 = Boolean.hashCode(this.isInvestTypeSupport);
        int iHashCode14 = this.extraData.hashCode();
        int iHashCode15 = this.extraFieldList.hashCode();
        Perpetual perpetual = this.perpetual;
        int iHashCode16 = perpetual == null ? 0 : perpetual.hashCode();
        int iHashCode17 = this.extraAssetList.hashCode();
        int iHashCode18 = this.supplied.hashCode();
        int iHashCode19 = this.borrowed.hashCode();
        int iHashCode20 = this.rewards.hashCode();
        int iHashCode21 = this.unclaimedFeeRewards.hashCode();
        int iHashCode22 = this.positionInfoList.hashCode();
        int iHashCode23 = this.totalEarnings.hashCode();
        HealthRate healthRate = this.healthRate;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (healthRate != null ? healthRate.hashCode() : 0)) * 31) + this.investmentClassify.hashCode()) * 31) + this.totalRewardValue.hashCode()) * 31) + this.feeRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long isConnected() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestedToken(aggregateProductId=" + this.aggregateProductId + ", sourceInvestmentId=" + this.sourceInvestmentId + ", investmentId=" + this.investmentId + ", specialPositionAssetKey=" + this.specialPositionAssetKey + ", investmentCategory=" + this.investmentCategory + ", productType=" + this.productType + ", investLogo=" + this.investLogo + ", networkLogo=" + this.networkLogo + ", investmentName=" + this.investmentName + ", v3BonusStatus=" + this.v3BonusStatus + ", investTypeName=" + this.investTypeName + ", totalValue=" + this.totalValue + ", isInvestTypeSupport=" + this.isInvestTypeSupport + ", extraData=" + this.extraData + ", extraFieldList=" + this.extraFieldList + ", perpetual=" + this.perpetual + ", extraAssetList=" + this.extraAssetList + ", supplied=" + this.supplied + ", borrowed=" + this.borrowed + ", rewards=" + this.rewards + ", unclaimedFeeRewards=" + this.unclaimedFeeRewards + ", positionInfoList=" + this.positionInfoList + ", totalEarnings=" + this.totalEarnings + ", healthRate=" + this.healthRate + ", investmentClassify=" + this.investmentClassify + ", totalRewardValue=" + this.totalRewardValue + ", feeRate=" + this.feeRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.totalRewardValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> wlaJM() {
        return this.unclaimedFeeRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.aggregateProductId);
        parcel.writeLong(this.sourceInvestmentId);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.specialPositionAssetKey);
        parcel.writeString(this.investmentCategory.name());
        parcel.writeString(this.productType.name());
        this.investLogo.writeToParcel(parcel, i);
        this.networkLogo.writeToParcel(parcel, i);
        parcel.writeString(this.investmentName);
        parcel.writeString(this.v3BonusStatus.name());
        parcel.writeString(this.investTypeName);
        parcel.writeString(this.totalValue);
        parcel.writeInt(this.isInvestTypeSupport ? 1 : 0);
        this.extraData.writeToParcel(parcel, i);
        List<InvestPositionDetailExtraFieldData> list = this.extraFieldList;
        parcel.writeInt(list.size());
        Iterator<InvestPositionDetailExtraFieldData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Perpetual perpetual = this.perpetual;
        if (perpetual == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            perpetual.writeToParcel(parcel, i);
        }
        List<InvestExtraAssetData> list2 = this.extraAssetList;
        parcel.writeInt(list2.size());
        Iterator<InvestExtraAssetData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestBaseDefiTokenInfo> list3 = this.supplied;
        parcel.writeInt(list3.size());
        Iterator<InvestBaseDefiTokenInfo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InvestBaseDefiTokenInfo> list4 = this.borrowed;
        parcel.writeInt(list4.size());
        Iterator<InvestBaseDefiTokenInfo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list5 = this.rewards;
        parcel.writeInt(list5.size());
        Iterator<InvestUserRewardInfoByInvestment> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list6 = this.unclaimedFeeRewards;
        parcel.writeInt(list6.size());
        Iterator<InvestUserRewardInfoByInvestment> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        List<PositionInfo> list7 = this.positionInfoList;
        parcel.writeInt(list7.size());
        Iterator<PositionInfo> it7 = list7.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalEarnings);
        HealthRate healthRate = this.healthRate;
        if (healthRate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            healthRate.writeToParcel(parcel, i);
        }
        parcel.writeString(this.investmentClassify);
        parcel.writeString(this.totalRewardValue);
        parcel.writeString(this.feeRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V3BonusStatus zLjUOn() {
        return this.v3BonusStatus;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.InvestedToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestedToken> serializer() {
            return InvestedToken$$serializer.INSTANCE;
        }
    }

    static {
        InvestBaseDefiTokenInfo$$serializer investBaseDefiTokenInfo$$serializer = InvestBaseDefiTokenInfo$$serializer.INSTANCE;
        InvestUserRewardInfoByInvestment$$serializer investUserRewardInfoByInvestment$$serializer = InvestUserRewardInfoByInvestment$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, InvestmentKind.Companion.serializer(), ProductType.Companion.serializer(), null, null, null, V3BonusStatus.Companion.serializer(), null, null, null, null, new ArrayListSerializer(InvestPositionDetailExtraFieldData$$serializer.INSTANCE), null, new ArrayListSerializer(InvestExtraAssetData$$serializer.INSTANCE), new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), new ArrayListSerializer(PositionInfo$$serializer.INSTANCE), null, null, null, null, null};
    }

    public /* synthetic */ InvestedToken(int i, long j, long j2, long j3, String str, InvestmentKind investmentKind, ProductType productType, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, String str2, V3BonusStatus v3BonusStatus, String str3, String str4, boolean z, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List list, Perpetual perpetual, List list2, List list3, List list4, List list5, List list6, List list7, String str5, HealthRate healthRate, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        NetworkLogoUrl networkLogoUrl2;
        if ((i & 1) == 0) {
            this.aggregateProductId = 0L;
        } else {
            this.aggregateProductId = j;
        }
        if ((i & 2) == 0) {
            this.sourceInvestmentId = 0L;
        } else {
            this.sourceInvestmentId = j2;
        }
        if ((i & 4) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j3;
        }
        if ((i & 8) == 0) {
            this.specialPositionAssetKey = "";
        } else {
            this.specialPositionAssetKey = str;
        }
        this.investmentCategory = (i & 16) == 0 ? InvestmentKind.Default : investmentKind;
        this.productType = (i & 32) == 0 ? ProductType.Unknown : productType;
        this.investLogo = (i & 64) == 0 ? new InvestLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investLogo;
        String str9 = null;
        byte b = 0;
        byte b2 = 0;
        if ((i & 128) == 0) {
            networkLogoUrl2 = new NetworkLogoUrl(str9, (String) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            networkLogoUrl2 = networkLogoUrl;
        }
        this.networkLogo = networkLogoUrl2;
        if ((i & 256) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str2;
        }
        this.v3BonusStatus = (i & 512) == 0 ? V3BonusStatus.None : v3BonusStatus;
        if ((i & 1024) == 0) {
            this.investTypeName = "";
        } else {
            this.investTypeName = str3;
        }
        if ((i & 2048) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str4;
        }
        this.isInvestTypeSupport = (i & 4096) == 0 ? false : z;
        this.extraData = (i & 8192) == 0 ? new InvestUserAssetDetailPromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null) : investUserAssetDetailPromptInformation;
        this.extraFieldList = (i & 16384) == 0 ? yDY.AhwBna() : list;
        if ((32768 & i) == 0) {
            this.perpetual = null;
        } else {
            this.perpetual = perpetual;
        }
        this.extraAssetList = (65536 & i) == 0 ? yDY.AhwBna() : list2;
        this.supplied = (131072 & i) == 0 ? yDY.AhwBna() : list3;
        this.borrowed = (262144 & i) == 0 ? yDY.AhwBna() : list4;
        this.rewards = (524288 & i) == 0 ? yDY.AhwBna() : list5;
        this.unclaimedFeeRewards = (1048576 & i) == 0 ? yDY.AhwBna() : list6;
        this.positionInfoList = (2097152 & i) == 0 ? yDY.AhwBna() : list7;
        if ((4194304 & i) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str5;
        }
        if ((8388608 & i) == 0) {
            this.healthRate = null;
        } else {
            this.healthRate = healthRate;
        }
        if ((16777216 & i) == 0) {
            this.investmentClassify = "";
        } else {
            this.investmentClassify = str6;
        }
        if ((33554432 & i) == 0) {
            this.totalRewardValue = "";
        } else {
            this.totalRewardValue = str7;
        }
        if ((i & 67108864) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=14] */
    public static final /* synthetic */ void AEQbTJ(InvestedToken investedToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investedToken.aggregateProductId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investedToken.aggregateProductId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investedToken.sourceInvestmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investedToken.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investedToken.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, investedToken.investmentId);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investedToken.specialPositionAssetKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investedToken.specialPositionAssetKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investedToken.investmentCategory != InvestmentKind.Default) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investedToken.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investedToken.productType != ProductType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investedToken.productType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(investedToken.investLogo, new InvestLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, InvestLogo$$serializer.INSTANCE, investedToken.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investedToken.networkLogo, new NetworkLogoUrl((String) null, (String) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, NetworkLogoUrl$$serializer.INSTANCE, investedToken.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investedToken.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investedToken.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investedToken.v3BonusStatus != V3BonusStatus.None) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], investedToken.v3BonusStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investedToken.investTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investedToken.investTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investedToken.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investedToken.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investedToken.isInvestTypeSupport) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, investedToken.isInvestTypeSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(investedToken.extraData, new InvestUserAssetDetailPromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, InvestUserAssetDetailPromptInformation$$serializer.INSTANCE, investedToken.extraData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(investedToken.extraFieldList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], investedToken.extraFieldList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investedToken.perpetual != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, Perpetual$$serializer.INSTANCE, investedToken.perpetual);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investedToken.extraAssetList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investedToken.extraAssetList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(investedToken.supplied, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investedToken.supplied);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(investedToken.borrowed, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], investedToken.borrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(investedToken.rewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], investedToken.rewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(investedToken.unclaimedFeeRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], investedToken.unclaimedFeeRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(investedToken.positionInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], investedToken.positionInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) investedToken.totalEarnings, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, investedToken.totalEarnings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investedToken.healthRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, HealthRate$$serializer.INSTANCE, investedToken.healthRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) investedToken.investmentClassify, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, investedToken.investmentClassify);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) investedToken.totalRewardValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, investedToken.totalRewardValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && Intrinsics.EZpvd((Object) investedToken.feeRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 26, investedToken.feeRate);
    }

    public InvestedToken(long j, long j2, long j3, @NotNull String str, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull String str2, @NotNull V3BonusStatus v3BonusStatus, @NotNull String str3, @NotNull String str4, boolean z, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull List<InvestPositionDetailExtraFieldData> list, Perpetual perpetual, @NotNull List<InvestExtraAssetData> list2, @NotNull List<InvestBaseDefiTokenInfo> list3, @NotNull List<InvestBaseDefiTokenInfo> list4, @NotNull List<InvestUserRewardInfoByInvestment> list5, @NotNull List<InvestUserRewardInfoByInvestment> list6, @NotNull List<PositionInfo> list7, @NotNull String str5, HealthRate healthRate, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(v3BonusStatus, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.aggregateProductId = j;
        this.sourceInvestmentId = j2;
        this.investmentId = j3;
        this.specialPositionAssetKey = str;
        this.investmentCategory = investmentKind;
        this.productType = productType;
        this.investLogo = investLogo;
        this.networkLogo = networkLogoUrl;
        this.investmentName = str2;
        this.v3BonusStatus = v3BonusStatus;
        this.investTypeName = str3;
        this.totalValue = str4;
        this.isInvestTypeSupport = z;
        this.extraData = investUserAssetDetailPromptInformation;
        this.extraFieldList = list;
        this.perpetual = perpetual;
        this.extraAssetList = list2;
        this.supplied = list3;
        this.borrowed = list4;
        this.rewards = list5;
        this.unclaimedFeeRewards = list6;
        this.positionInfoList = list7;
        this.totalEarnings = str5;
        this.healthRate = healthRate;
        this.investmentClassify = str6;
        this.totalRewardValue = str7;
        this.feeRate = str8;
    }

    public /* synthetic */ InvestedToken(long j, long j2, long j3, String str, InvestmentKind investmentKind, ProductType productType, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, String str2, V3BonusStatus v3BonusStatus, String str3, String str4, boolean z, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List list, Perpetual perpetual, List list2, List list3, List list4, List list5, List list6, List list7, String str5, HealthRate healthRate, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        NetworkLogoUrl networkLogoUrl2;
        long j4 = (i & 1) != 0 ? 0L : j;
        long j5 = (i & 2) != 0 ? 0L : j2;
        long j6 = (i & 4) == 0 ? j3 : 0L;
        String str9 = (i & 8) != 0 ? "" : str;
        InvestmentKind investmentKind2 = (i & 16) != 0 ? InvestmentKind.Default : investmentKind;
        ProductType productType2 = (i & 32) != 0 ? ProductType.Unknown : productType;
        InvestLogo investLogo2 = (i & 64) != 0 ? new InvestLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investLogo;
        String str10 = null;
        byte b = 0;
        byte b2 = 0;
        if ((i & 128) != 0) {
            networkLogoUrl2 = new NetworkLogoUrl(str10, (String) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            networkLogoUrl2 = networkLogoUrl;
        }
        this(j4, j5, j6, str9, investmentKind2, productType2, investLogo2, networkLogoUrl2, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? V3BonusStatus.None : v3BonusStatus, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? "" : str4, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? new InvestUserAssetDetailPromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null) : investUserAssetDetailPromptInformation, (i & 16384) != 0 ? yDY.AhwBna() : list, (i & 32768) != 0 ? null : perpetual, (i & 65536) != 0 ? yDY.AhwBna() : list2, (i & 131072) != 0 ? yDY.AhwBna() : list3, (i & 262144) != 0 ? yDY.AhwBna() : list4, (i & 524288) != 0 ? yDY.AhwBna() : list5, (i & 1048576) != 0 ? yDY.AhwBna() : list6, (i & 2097152) != 0 ? yDY.AhwBna() : list7, (i & 4194304) != 0 ? "" : str5, (i & 8388608) != 0 ? null : healthRate, (i & 16777216) != 0 ? "" : str6, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str7, (i & 67108864) != 0 ? "" : str8);
    }
}
