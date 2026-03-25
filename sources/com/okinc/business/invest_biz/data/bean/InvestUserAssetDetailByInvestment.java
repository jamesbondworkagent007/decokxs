package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserAssetDetailByInvestment implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Long aggregateProductId;
    private final List<InvestBaseDefiTokenInfo> assetsTokenList;
    private final List<InvestBaseDefiTokenInfo> borrowTokenList;
    private final String browserUrl;
    private final CollateralRatioInfo collateralRatioInfo;
    private final String currentPrice;
    private final List<InvestBaseDefiTokenInfo> depositTokenList;
    private final InvestUserAssetDetailPromptInformation extraData;
    private final List<InvestPositionDetailExtraFieldData> extraFieldList;
    private final String feeRate;
    private final String fixedApy;
    private final InvestLogo investLogo;
    private final String investName;
    private final Integer investType;
    private final Integer investmentCategory;
    private final String investmentClassify;
    private final Long investmentId;
    private final String investmentName;
    private final Boolean isInvestTypeSupport;
    private final String maturityTime;
    private final String overflowTotalValue;
    private final String poolId;
    private final List<InvestUserAssetDetailByPosition> positionList;
    private final String rewardAddress;
    private final List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo;
    private final Long sourceInvestmentId;
    private final String subTitle;
    private final String totalValue;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserAssetDetailByInvestment> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserAssetDetailByInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailByInvestment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Long l;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformationCreateFromParcel = parcel.readInt() == 0 ? null : InvestUserAssetDetailPromptInformation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestPositionDetailExtraFieldData.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            InvestLogo investLogoCreateFromParcel = parcel.readInt() == 0 ? null : InvestLogo.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList3.add(InvestUserAssetDetailByPosition.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string7;
                arrayList5 = arrayList3;
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                str = string7;
                arrayList4 = new ArrayList(i7);
                arrayList5 = arrayList3;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList4.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
            }
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList4;
                l = lValueOf3;
                arrayList6 = null;
            } else {
                int i9 = parcel.readInt();
                l = lValueOf3;
                arrayList6 = new ArrayList(i9);
                arrayList7 = arrayList4;
                int i10 = 0;
                while (i10 != i9) {
                    arrayList6.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList6;
                arrayList9 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i11);
                arrayList8 = arrayList6;
                int i12 = 0;
                while (i12 != i11) {
                    arrayList10.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList9 = arrayList10;
            }
            return new InvestUserAssetDetailByInvestment(lValueOf, arrayList, string, string2, investUserAssetDetailPromptInformationCreateFromParcel, arrayList2, string3, investLogoCreateFromParcel, string4, numValueOf, numValueOf2, lValueOf2, string5, boolValueOf, string6, arrayList5, str, arrayList7, l, string8, string9, string10, string11, string12, arrayList8, arrayList9, parcel.readInt() == 0 ? null : CollateralRatioInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailByInvestment[] newArray(int i) {
            return new InvestUserAssetDetailByInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserAssetDetailByInvestment() {
        this((Long) null, (List) null, (String) null, (String) null, (InvestUserAssetDetailPromptInformation) null, (List) null, (String) null, (InvestLogo) null, (String) null, (Integer) null, (Integer) null, (Long) null, (String) null, (Boolean) null, (String) null, (List) null, (String) null, (List) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (CollateralRatioInfo) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null);
    }

    @SerialName("browserUrl")
    public static /* synthetic */ void getBrowserUrl$annotations() {
    }

    @SerialName("investmentClassify")
    public static /* synthetic */ void getInvestmentClassify$annotations() {
    }

    @SerialName("rewardAddress")
    public static /* synthetic */ void getRewardAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.aggregateProductId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component12() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.isInvestTypeSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserAssetDetailByPosition> component16() {
        return this.positionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.rewardAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> component18() {
        return this.rewardDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component19() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component2() {
        return this.assetsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component25() {
        return this.depositTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component26() {
        return this.borrowTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo component27() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.overflowTotalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailPromptInformation component5() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestPositionDetailExtraFieldData> component6() {
        return this.extraFieldList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo component8() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.investName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailByInvestment copy(Long l, List<InvestBaseDefiTokenInfo> list, String str, String str2, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List<InvestPositionDetailExtraFieldData> list2, String str3, InvestLogo investLogo, String str4, Integer num, Integer num2, Long l2, String str5, Boolean bool, String str6, List<InvestUserAssetDetailByPosition> list3, String str7, List<InvestUserRewardInfoByInvestment> list4, Long l3, String str8, String str9, String str10, String str11, String str12, List<InvestBaseDefiTokenInfo> list5, List<InvestBaseDefiTokenInfo> list6, CollateralRatioInfo collateralRatioInfo, @NotNull String str13, String str14) {
        Intrinsics.checkNotNullParameter(str13, "");
        return new InvestUserAssetDetailByInvestment(l, list, str, str2, investUserAssetDetailPromptInformation, list2, str3, investLogo, str4, num, num2, l2, str5, bool, str6, list3, str7, list4, l3, str8, str9, str10, str11, str12, list5, list6, collateralRatioInfo, str13, str14);
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
        if (!(obj instanceof InvestUserAssetDetailByInvestment)) {
            return false;
        }
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) obj;
        return Intrinsics.EZpvd(this.aggregateProductId, investUserAssetDetailByInvestment.aggregateProductId) && Intrinsics.EZpvd(this.assetsTokenList, investUserAssetDetailByInvestment.assetsTokenList) && Intrinsics.EZpvd((Object) this.browserUrl, (Object) investUserAssetDetailByInvestment.browserUrl) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investUserAssetDetailByInvestment.currentPrice) && Intrinsics.EZpvd(this.extraData, investUserAssetDetailByInvestment.extraData) && Intrinsics.EZpvd(this.extraFieldList, investUserAssetDetailByInvestment.extraFieldList) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investUserAssetDetailByInvestment.feeRate) && Intrinsics.EZpvd(this.investLogo, investUserAssetDetailByInvestment.investLogo) && Intrinsics.EZpvd((Object) this.investName, (Object) investUserAssetDetailByInvestment.investName) && Intrinsics.EZpvd(this.investType, investUserAssetDetailByInvestment.investType) && Intrinsics.EZpvd(this.investmentCategory, investUserAssetDetailByInvestment.investmentCategory) && Intrinsics.EZpvd(this.investmentId, investUserAssetDetailByInvestment.investmentId) && Intrinsics.EZpvd((Object) this.investmentName, (Object) investUserAssetDetailByInvestment.investmentName) && Intrinsics.EZpvd(this.isInvestTypeSupport, investUserAssetDetailByInvestment.isInvestTypeSupport) && Intrinsics.EZpvd((Object) this.poolId, (Object) investUserAssetDetailByInvestment.poolId) && Intrinsics.EZpvd(this.positionList, investUserAssetDetailByInvestment.positionList) && Intrinsics.EZpvd((Object) this.rewardAddress, (Object) investUserAssetDetailByInvestment.rewardAddress) && Intrinsics.EZpvd(this.rewardDefiTokenInfo, investUserAssetDetailByInvestment.rewardDefiTokenInfo) && Intrinsics.EZpvd(this.sourceInvestmentId, investUserAssetDetailByInvestment.sourceInvestmentId) && Intrinsics.EZpvd((Object) this.subTitle, (Object) investUserAssetDetailByInvestment.subTitle) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investUserAssetDetailByInvestment.totalValue) && Intrinsics.EZpvd((Object) this.validatorName, (Object) investUserAssetDetailByInvestment.validatorName) && Intrinsics.EZpvd((Object) this.fixedApy, (Object) investUserAssetDetailByInvestment.fixedApy) && Intrinsics.EZpvd((Object) this.maturityTime, (Object) investUserAssetDetailByInvestment.maturityTime) && Intrinsics.EZpvd(this.depositTokenList, investUserAssetDetailByInvestment.depositTokenList) && Intrinsics.EZpvd(this.borrowTokenList, investUserAssetDetailByInvestment.borrowTokenList) && Intrinsics.EZpvd(this.collateralRatioInfo, investUserAssetDetailByInvestment.collateralRatioInfo) && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investUserAssetDetailByInvestment.investmentClassify) && Intrinsics.EZpvd((Object) this.overflowTotalValue, (Object) investUserAssetDetailByInvestment.overflowTotalValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAggregateProductId() {
        return this.aggregateProductId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getAssetsTokenList() {
        return this.assetsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getBorrowTokenList() {
        return this.borrowTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo getCollateralRatioInfo() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getDepositTokenList() {
        return this.depositTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailPromptInformation getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestPositionDetailExtraFieldData> getExtraFieldList() {
        return this.extraFieldList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedApy() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo getInvestLogo() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestName() {
        return this.investName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentClassify() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaturityTime() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOverflowTotalValue() {
        return this.overflowTotalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserAssetDetailByPosition> getPositionList() {
        return this.positionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardAddress() {
        return this.rewardAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> getRewardDefiTokenInfo() {
        return this.rewardDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSourceInvestmentId() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.aggregateProductId;
        int iHashCode = l == null ? 0 : l.hashCode();
        List<InvestBaseDefiTokenInfo> list = this.assetsTokenList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.browserUrl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.currentPrice;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation = this.extraData;
        int iHashCode5 = investUserAssetDetailPromptInformation == null ? 0 : investUserAssetDetailPromptInformation.hashCode();
        List<InvestPositionDetailExtraFieldData> list2 = this.extraFieldList;
        int iHashCode6 = list2 == null ? 0 : list2.hashCode();
        String str3 = this.feeRate;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        InvestLogo investLogo = this.investLogo;
        int iHashCode8 = investLogo == null ? 0 : investLogo.hashCode();
        String str4 = this.investName;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.investType;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Integer num2 = this.investmentCategory;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        Long l2 = this.investmentId;
        int iHashCode12 = l2 == null ? 0 : l2.hashCode();
        String str5 = this.investmentName;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.isInvestTypeSupport;
        int iHashCode14 = bool == null ? 0 : bool.hashCode();
        String str6 = this.poolId;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        List<InvestUserAssetDetailByPosition> list3 = this.positionList;
        int iHashCode16 = list3 == null ? 0 : list3.hashCode();
        String str7 = this.rewardAddress;
        int iHashCode17 = str7 == null ? 0 : str7.hashCode();
        List<InvestUserRewardInfoByInvestment> list4 = this.rewardDefiTokenInfo;
        int iHashCode18 = list4 == null ? 0 : list4.hashCode();
        Long l3 = this.sourceInvestmentId;
        int iHashCode19 = l3 == null ? 0 : l3.hashCode();
        String str8 = this.subTitle;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.totalValue;
        int iHashCode21 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.validatorName;
        int iHashCode22 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.fixedApy;
        int iHashCode23 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.maturityTime;
        int iHashCode24 = str12 == null ? 0 : str12.hashCode();
        List<InvestBaseDefiTokenInfo> list5 = this.depositTokenList;
        int iHashCode25 = list5 == null ? 0 : list5.hashCode();
        List<InvestBaseDefiTokenInfo> list6 = this.borrowTokenList;
        int iHashCode26 = list6 == null ? 0 : list6.hashCode();
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        int iHashCode27 = collateralRatioInfo == null ? 0 : collateralRatioInfo.hashCode();
        int iHashCode28 = this.investmentClassify.hashCode();
        String str13 = this.overflowTotalValue;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (str13 == null ? 0 : str13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isInvestTypeSupport() {
        return this.isInvestTypeSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserAssetDetailByInvestment(aggregateProductId=" + this.aggregateProductId + ", assetsTokenList=" + this.assetsTokenList + ", browserUrl=" + this.browserUrl + ", currentPrice=" + this.currentPrice + ", extraData=" + this.extraData + ", extraFieldList=" + this.extraFieldList + ", feeRate=" + this.feeRate + ", investLogo=" + this.investLogo + ", investName=" + this.investName + ", investType=" + this.investType + ", investmentCategory=" + this.investmentCategory + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", isInvestTypeSupport=" + this.isInvestTypeSupport + ", poolId=" + this.poolId + ", positionList=" + this.positionList + ", rewardAddress=" + this.rewardAddress + ", rewardDefiTokenInfo=" + this.rewardDefiTokenInfo + ", sourceInvestmentId=" + this.sourceInvestmentId + ", subTitle=" + this.subTitle + ", totalValue=" + this.totalValue + ", validatorName=" + this.validatorName + ", fixedApy=" + this.fixedApy + ", maturityTime=" + this.maturityTime + ", depositTokenList=" + this.depositTokenList + ", borrowTokenList=" + this.borrowTokenList + ", collateralRatioInfo=" + this.collateralRatioInfo + ", investmentClassify=" + this.investmentClassify + ", overflowTotalValue=" + this.overflowTotalValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.aggregateProductId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<InvestBaseDefiTokenInfo> list = this.assetsTokenList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.browserUrl);
        parcel.writeString(this.currentPrice);
        InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation = this.extraData;
        if (investUserAssetDetailPromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUserAssetDetailPromptInformation.writeToParcel(parcel, i);
        }
        List<InvestPositionDetailExtraFieldData> list2 = this.extraFieldList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestPositionDetailExtraFieldData> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.feeRate);
        InvestLogo investLogo = this.investLogo;
        if (investLogo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investLogo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.investName);
        Integer num = this.investType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.investmentCategory;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.investmentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.investmentName);
        Boolean bool = this.isInvestTypeSupport;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.poolId);
        List<InvestUserAssetDetailByPosition> list3 = this.positionList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<InvestUserAssetDetailByPosition> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.rewardAddress);
        List<InvestUserRewardInfoByInvestment> list4 = this.rewardDefiTokenInfo;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<InvestUserRewardInfoByInvestment> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        Long l3 = this.sourceInvestmentId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.subTitle);
        parcel.writeString(this.totalValue);
        parcel.writeString(this.validatorName);
        parcel.writeString(this.fixedApy);
        parcel.writeString(this.maturityTime);
        List<InvestBaseDefiTokenInfo> list5 = this.depositTokenList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<InvestBaseDefiTokenInfo> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        List<InvestBaseDefiTokenInfo> list6 = this.borrowTokenList;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<InvestBaseDefiTokenInfo> it6 = list6.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        CollateralRatioInfo collateralRatioInfo = this.collateralRatioInfo;
        if (collateralRatioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collateralRatioInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.investmentClassify);
        parcel.writeString(this.overflowTotalValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserAssetDetailByInvestment> serializer() {
            return InvestUserAssetDetailByInvestment$$serializer.INSTANCE;
        }
    }

    static {
        InvestBaseDefiTokenInfo$$serializer investBaseDefiTokenInfo$$serializer = InvestBaseDefiTokenInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), null, null, null, new ArrayListSerializer(InvestPositionDetailExtraFieldData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestUserAssetDetailByPosition$$serializer.INSTANCE), null, new ArrayListSerializer(InvestUserRewardInfoByInvestment$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), null, null, null};
    }

    public /* synthetic */ InvestUserAssetDetailByInvestment(int i, Long l, List list, String str, String str2, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List list2, String str3, InvestLogo investLogo, String str4, Integer num, Integer num2, Long l2, String str5, Boolean bool, String str6, List list3, String str7, List list4, Long l3, String str8, String str9, String str10, String str11, String str12, List list5, List list6, CollateralRatioInfo collateralRatioInfo, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aggregateProductId = null;
        } else {
            this.aggregateProductId = l;
        }
        if ((i & 2) == 0) {
            this.assetsTokenList = null;
        } else {
            this.assetsTokenList = list;
        }
        if ((i & 4) == 0) {
            this.browserUrl = null;
        } else {
            this.browserUrl = str;
        }
        if ((i & 8) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str2;
        }
        if ((i & 16) == 0) {
            this.extraData = null;
        } else {
            this.extraData = investUserAssetDetailPromptInformation;
        }
        if ((i & 32) == 0) {
            this.extraFieldList = null;
        } else {
            this.extraFieldList = list2;
        }
        if ((i & 64) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str3;
        }
        if ((i & 128) == 0) {
            this.investLogo = null;
        } else {
            this.investLogo = investLogo;
        }
        if ((i & 256) == 0) {
            this.investName = null;
        } else {
            this.investName = str4;
        }
        if ((i & 512) == 0) {
            this.investType = null;
        } else {
            this.investType = num;
        }
        if ((i & 1024) == 0) {
            this.investmentCategory = null;
        } else {
            this.investmentCategory = num2;
        }
        if ((i & 2048) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l2;
        }
        if ((i & 4096) == 0) {
            this.investmentName = null;
        } else {
            this.investmentName = str5;
        }
        if ((i & 8192) == 0) {
            this.isInvestTypeSupport = null;
        } else {
            this.isInvestTypeSupport = bool;
        }
        if ((i & 16384) == 0) {
            this.poolId = null;
        } else {
            this.poolId = str6;
        }
        if ((32768 & i) == 0) {
            this.positionList = null;
        } else {
            this.positionList = list3;
        }
        if ((65536 & i) == 0) {
            this.rewardAddress = null;
        } else {
            this.rewardAddress = str7;
        }
        if ((131072 & i) == 0) {
            this.rewardDefiTokenInfo = null;
        } else {
            this.rewardDefiTokenInfo = list4;
        }
        if ((262144 & i) == 0) {
            this.sourceInvestmentId = null;
        } else {
            this.sourceInvestmentId = l3;
        }
        if ((524288 & i) == 0) {
            this.subTitle = null;
        } else {
            this.subTitle = str8;
        }
        if ((1048576 & i) == 0) {
            this.totalValue = null;
        } else {
            this.totalValue = str9;
        }
        if ((2097152 & i) == 0) {
            this.validatorName = null;
        } else {
            this.validatorName = str10;
        }
        if ((4194304 & i) == 0) {
            this.fixedApy = null;
        } else {
            this.fixedApy = str11;
        }
        if ((8388608 & i) == 0) {
            this.maturityTime = null;
        } else {
            this.maturityTime = str12;
        }
        if ((16777216 & i) == 0) {
            this.depositTokenList = null;
        } else {
            this.depositTokenList = list5;
        }
        if ((33554432 & i) == 0) {
            this.borrowTokenList = null;
        } else {
            this.borrowTokenList = list6;
        }
        if ((67108864 & i) == 0) {
            this.collateralRatioInfo = null;
        } else {
            this.collateralRatioInfo = collateralRatioInfo;
        }
        this.investmentClassify = (134217728 & i) == 0 ? "" : str13;
        if ((i & 268435456) == 0) {
            this.overflowTotalValue = null;
        } else {
            this.overflowTotalValue = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserAssetDetailByInvestment.aggregateProductId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investUserAssetDetailByInvestment.aggregateProductId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserAssetDetailByInvestment.assetsTokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investUserAssetDetailByInvestment.assetsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserAssetDetailByInvestment.browserUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.browserUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserAssetDetailByInvestment.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUserAssetDetailByInvestment.extraData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailPromptInformation$$serializer.INSTANCE, investUserAssetDetailByInvestment.extraData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserAssetDetailByInvestment.extraFieldList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUserAssetDetailByInvestment.extraFieldList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUserAssetDetailByInvestment.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investUserAssetDetailByInvestment.investLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, InvestLogo$$serializer.INSTANCE, investUserAssetDetailByInvestment.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investUserAssetDetailByInvestment.investName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.investName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investUserAssetDetailByInvestment.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, investUserAssetDetailByInvestment.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUserAssetDetailByInvestment.investmentCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, investUserAssetDetailByInvestment.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investUserAssetDetailByInvestment.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, investUserAssetDetailByInvestment.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investUserAssetDetailByInvestment.investmentName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investUserAssetDetailByInvestment.isInvestTypeSupport != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, investUserAssetDetailByInvestment.isInvestTypeSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investUserAssetDetailByInvestment.poolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investUserAssetDetailByInvestment.positionList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], investUserAssetDetailByInvestment.positionList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investUserAssetDetailByInvestment.rewardAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.rewardAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investUserAssetDetailByInvestment.rewardDefiTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], investUserAssetDetailByInvestment.rewardDefiTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investUserAssetDetailByInvestment.sourceInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.INSTANCE, investUserAssetDetailByInvestment.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investUserAssetDetailByInvestment.subTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investUserAssetDetailByInvestment.totalValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investUserAssetDetailByInvestment.validatorName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investUserAssetDetailByInvestment.fixedApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.fixedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investUserAssetDetailByInvestment.maturityTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.maturityTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investUserAssetDetailByInvestment.depositTokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], investUserAssetDetailByInvestment.depositTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investUserAssetDetailByInvestment.borrowTokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], investUserAssetDetailByInvestment.borrowTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investUserAssetDetailByInvestment.collateralRatioInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, CollateralRatioInfo$$serializer.INSTANCE, investUserAssetDetailByInvestment.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) investUserAssetDetailByInvestment.investmentClassify, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, investUserAssetDetailByInvestment.investmentClassify);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && investUserAssetDetailByInvestment.overflowTotalValue == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, investUserAssetDetailByInvestment.overflowTotalValue);
    }

    public InvestUserAssetDetailByInvestment(Long l, List<InvestBaseDefiTokenInfo> list, String str, String str2, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List<InvestPositionDetailExtraFieldData> list2, String str3, InvestLogo investLogo, String str4, Integer num, Integer num2, Long l2, String str5, Boolean bool, String str6, List<InvestUserAssetDetailByPosition> list3, String str7, List<InvestUserRewardInfoByInvestment> list4, Long l3, String str8, String str9, String str10, String str11, String str12, List<InvestBaseDefiTokenInfo> list5, List<InvestBaseDefiTokenInfo> list6, CollateralRatioInfo collateralRatioInfo, @NotNull String str13, String str14) {
        Intrinsics.checkNotNullParameter(str13, "");
        this.aggregateProductId = l;
        this.assetsTokenList = list;
        this.browserUrl = str;
        this.currentPrice = str2;
        this.extraData = investUserAssetDetailPromptInformation;
        this.extraFieldList = list2;
        this.feeRate = str3;
        this.investLogo = investLogo;
        this.investName = str4;
        this.investType = num;
        this.investmentCategory = num2;
        this.investmentId = l2;
        this.investmentName = str5;
        this.isInvestTypeSupport = bool;
        this.poolId = str6;
        this.positionList = list3;
        this.rewardAddress = str7;
        this.rewardDefiTokenInfo = list4;
        this.sourceInvestmentId = l3;
        this.subTitle = str8;
        this.totalValue = str9;
        this.validatorName = str10;
        this.fixedApy = str11;
        this.maturityTime = str12;
        this.depositTokenList = list5;
        this.borrowTokenList = list6;
        this.collateralRatioInfo = collateralRatioInfo;
        this.investmentClassify = str13;
        this.overflowTotalValue = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0150: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r60v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r31v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r60v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r60v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r60v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation:?: TERNARY null = ((wrap:int:0x0022: ARITH (r60v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation) : (r35v0 com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r60v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r36v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r60v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x003a: ARITH (r60v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestLogo) : (r38v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r60v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r60v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r60v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x005a: ARITH (r60v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r42v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r60v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006a: ARITH (r60v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r60v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007d: ARITH (r60v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r46v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r60v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0093: ARITH (r60v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r48v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x009e: ARITH (r60v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r49v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r60v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r60v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r60v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r60v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r60v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r60v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r55v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r60v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r56v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r60v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.CollateralRatioInfo) : (r57v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r60v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r60v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
 A[MD:(java.lang.Long, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List<com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData>, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition>, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.String, java.lang.String):void (m)] (LINE:183) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment.<init>(java.lang.Long, java.util.List, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUserAssetDetailByInvestment(Long l, List list, String str, String str2, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List list2, String str3, InvestLogo investLogo, String str4, Integer num, Integer num2, Long l2, String str5, Boolean bool, String str6, List list3, String str7, List list4, Long l3, String str8, String str9, String str10, String str11, String str12, List list5, List list6, CollateralRatioInfo collateralRatioInfo, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : investUserAssetDetailPromptInformation, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : investLogo, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : list3, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : list4, (i & 262144) != 0 ? null : l3, (i & 524288) != 0 ? null : str8, (i & 1048576) != 0 ? null : str9, (i & 2097152) != 0 ? null : str10, (i & 4194304) != 0 ? null : str11, (i & 8388608) != 0 ? null : str12, (i & 16777216) != 0 ? null : list5, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : list6, (i & 67108864) != 0 ? null : collateralRatioInfo, (i & 134217728) != 0 ? "" : str13, (i & 268435456) != 0 ? null : str14);
    }
}
