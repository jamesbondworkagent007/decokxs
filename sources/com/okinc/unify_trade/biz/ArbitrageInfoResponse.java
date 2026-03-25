package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageInfoResponse implements Parcelable {
    private final boolean allowLeverPrincipal;
    private final List<ArbInvestDetailsItems> arbItems;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private final CostVo closeCost;
    private final String displayMinPaybackDays;
    private final String enlargedAmt;
    private final List<EstimatedApyVo> estimatedApyList;
    private final EstimatedStakingVo estimatedAutoStaking;
    private final EstimatedClosePnlVo estimatedClosePnl;
    private final CostVo estimatedOpenCost;
    private final EstimatedStakingVo estimatedStaking;
    private final String estimatingEnlargeArbPnl;
    private final String highestApyPeriod;
    private final String interestDebt;
    private final String marketSpreadRatio;
    private final String minAmt;
    private final String minUnitAmt;
    private final String minimalPaybackDays;
    private final CostVo openCost;
    private final String realizedClosePnl;
    private final String spreadRatio;
    private final String unitAmt;
    private final String userExpectSpreadRatio;
    private final String userExpectUnitAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(ArbInvestDetailsItems$$serializer.INSTANCE), null, null, null, null, null, null, null, new ArrayListSerializer(EstimatedApyVo$$serializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ArbitrageInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfoCreateFromParcel = ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ArbInvestDetailsItems.CREATOR.createFromParcel(parcel));
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            EstimatedStakingVo estimatedStakingVoCreateFromParcel = parcel.readInt() == 0 ? null : EstimatedStakingVo.CREATOR.createFromParcel(parcel);
            EstimatedStakingVo estimatedStakingVoCreateFromParcel2 = parcel.readInt() == 0 ? null : EstimatedStakingVo.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(EstimatedApyVo.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            return new ArbitrageInfoResponse(string, string2, string3, string4, string5, string6, arbitrageTotalPnlInfoCreateFromParcel, string7, arrayList, string8, string9, estimatedStakingVoCreateFromParcel, estimatedStakingVoCreateFromParcel2, string10, string11, string12, arrayList2, parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), EstimatedClosePnlVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageInfoResponse[] newArray(int i) {
            return new ArbitrageInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageInfoResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, (String) null, (List) null, (String) null, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (String) null, (String) null, false, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.spreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.enlargedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo component12() {
        return this.estimatedStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo component13() {
        return this.estimatedAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.minAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedApyVo> component17() {
        return this.estimatedApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component18() {
        return this.estimatedOpenCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedClosePnlVo component19() {
        return this.estimatedClosePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marketSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component20() {
        return this.closeCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component21() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.minimalPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.realizedClosePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.allowLeverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userExpectSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.userExpectUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component7() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.estimatingEnlargeArbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbInvestDetailsItems> component9() {
        return this.arbItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageInfoResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, @NotNull String str7, @NotNull List<ArbInvestDetailsItems> list, @NotNull String str8, @NotNull String str9, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<EstimatedApyVo> list2, CostVo costVo, @NotNull EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, String str13, String str14, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arbitrageTotalPnlInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(estimatedClosePnlVo, "");
        return new ArbitrageInfoResponse(str, str2, str3, str4, str5, str6, arbitrageTotalPnlInfo, str7, list, str8, str9, estimatedStakingVo, estimatedStakingVo2, str10, str11, str12, list2, costVo, estimatedClosePnlVo, costVo2, costVo3, str13, str14, z);
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
        if (!(obj instanceof ArbitrageInfoResponse)) {
            return false;
        }
        ArbitrageInfoResponse arbitrageInfoResponse = (ArbitrageInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.spreadRatio, (Object) arbitrageInfoResponse.spreadRatio) && Intrinsics.EZpvd((Object) this.marketSpreadRatio, (Object) arbitrageInfoResponse.marketSpreadRatio) && Intrinsics.EZpvd((Object) this.unitAmt, (Object) arbitrageInfoResponse.unitAmt) && Intrinsics.EZpvd((Object) this.minUnitAmt, (Object) arbitrageInfoResponse.minUnitAmt) && Intrinsics.EZpvd((Object) this.userExpectSpreadRatio, (Object) arbitrageInfoResponse.userExpectSpreadRatio) && Intrinsics.EZpvd((Object) this.userExpectUnitAmt, (Object) arbitrageInfoResponse.userExpectUnitAmt) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, arbitrageInfoResponse.arbitrageTotalPnlInfo) && Intrinsics.EZpvd((Object) this.estimatingEnlargeArbPnl, (Object) arbitrageInfoResponse.estimatingEnlargeArbPnl) && Intrinsics.EZpvd(this.arbItems, arbitrageInfoResponse.arbItems) && Intrinsics.EZpvd((Object) this.enlargedAmt, (Object) arbitrageInfoResponse.enlargedAmt) && Intrinsics.EZpvd((Object) this.interestDebt, (Object) arbitrageInfoResponse.interestDebt) && Intrinsics.EZpvd(this.estimatedStaking, arbitrageInfoResponse.estimatedStaking) && Intrinsics.EZpvd(this.estimatedAutoStaking, arbitrageInfoResponse.estimatedAutoStaking) && Intrinsics.EZpvd((Object) this.minAmt, (Object) arbitrageInfoResponse.minAmt) && Intrinsics.EZpvd((Object) this.displayMinPaybackDays, (Object) arbitrageInfoResponse.displayMinPaybackDays) && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) arbitrageInfoResponse.highestApyPeriod) && Intrinsics.EZpvd(this.estimatedApyList, arbitrageInfoResponse.estimatedApyList) && Intrinsics.EZpvd(this.estimatedOpenCost, arbitrageInfoResponse.estimatedOpenCost) && Intrinsics.EZpvd(this.estimatedClosePnl, arbitrageInfoResponse.estimatedClosePnl) && Intrinsics.EZpvd(this.closeCost, arbitrageInfoResponse.closeCost) && Intrinsics.EZpvd(this.openCost, arbitrageInfoResponse.openCost) && Intrinsics.EZpvd((Object) this.minimalPaybackDays, (Object) arbitrageInfoResponse.minimalPaybackDays) && Intrinsics.EZpvd((Object) this.realizedClosePnl, (Object) arbitrageInfoResponse.realizedClosePnl) && this.allowLeverPrincipal == arbitrageInfoResponse.allowLeverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowLeverPrincipal() {
        return this.allowLeverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbInvestDetailsItems> getArbItems() {
        return this.arbItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo getArbitrageTotalPnlInfo() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getCloseCost() {
        return this.closeCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayMinPaybackDays() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnlargedAmt() {
        return this.enlargedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedApyVo> getEstimatedApyList() {
        return this.estimatedApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo getEstimatedAutoStaking() {
        return this.estimatedAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedClosePnlVo getEstimatedClosePnl() {
        return this.estimatedClosePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getEstimatedOpenCost() {
        return this.estimatedOpenCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo getEstimatedStaking() {
        return this.estimatedStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatingEnlargeArbPnl() {
        return this.estimatingEnlargeArbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighestApyPeriod() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestDebt() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketSpreadRatio() {
        return this.marketSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmt() {
        return this.minAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinUnitAmt() {
        return this.minUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimalPaybackDays() {
        return this.minimalPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getOpenCost() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedClosePnl() {
        return this.realizedClosePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadRatio() {
        return this.spreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitAmt() {
        return this.unitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserExpectSpreadRatio() {
        return this.userExpectSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserExpectUnitAmt() {
        return this.userExpectUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.spreadRatio.hashCode();
        int iHashCode2 = this.marketSpreadRatio.hashCode();
        int iHashCode3 = this.unitAmt.hashCode();
        int iHashCode4 = this.minUnitAmt.hashCode();
        int iHashCode5 = this.userExpectSpreadRatio.hashCode();
        int iHashCode6 = this.userExpectUnitAmt.hashCode();
        int iHashCode7 = this.arbitrageTotalPnlInfo.hashCode();
        int iHashCode8 = this.estimatingEnlargeArbPnl.hashCode();
        int iHashCode9 = this.arbItems.hashCode();
        int iHashCode10 = this.enlargedAmt.hashCode();
        int iHashCode11 = this.interestDebt.hashCode();
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        int iHashCode12 = estimatedStakingVo == null ? 0 : estimatedStakingVo.hashCode();
        EstimatedStakingVo estimatedStakingVo2 = this.estimatedAutoStaking;
        int iHashCode13 = estimatedStakingVo2 == null ? 0 : estimatedStakingVo2.hashCode();
        int iHashCode14 = this.minAmt.hashCode();
        int iHashCode15 = this.displayMinPaybackDays.hashCode();
        int iHashCode16 = this.highestApyPeriod.hashCode();
        int iHashCode17 = this.estimatedApyList.hashCode();
        CostVo costVo = this.estimatedOpenCost;
        int iHashCode18 = costVo == null ? 0 : costVo.hashCode();
        int iHashCode19 = this.estimatedClosePnl.hashCode();
        CostVo costVo2 = this.closeCost;
        int iHashCode20 = costVo2 == null ? 0 : costVo2.hashCode();
        CostVo costVo3 = this.openCost;
        int iHashCode21 = costVo3 == null ? 0 : costVo3.hashCode();
        String str = this.minimalPaybackDays;
        int iHashCode22 = str == null ? 0 : str.hashCode();
        String str2 = this.realizedClosePnl;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.allowLeverPrincipal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageInfoResponse(spreadRatio=" + this.spreadRatio + ", marketSpreadRatio=" + this.marketSpreadRatio + ", unitAmt=" + this.unitAmt + ", minUnitAmt=" + this.minUnitAmt + ", userExpectSpreadRatio=" + this.userExpectSpreadRatio + ", userExpectUnitAmt=" + this.userExpectUnitAmt + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", estimatingEnlargeArbPnl=" + this.estimatingEnlargeArbPnl + ", arbItems=" + this.arbItems + ", enlargedAmt=" + this.enlargedAmt + ", interestDebt=" + this.interestDebt + ", estimatedStaking=" + this.estimatedStaking + ", estimatedAutoStaking=" + this.estimatedAutoStaking + ", minAmt=" + this.minAmt + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", highestApyPeriod=" + this.highestApyPeriod + ", estimatedApyList=" + this.estimatedApyList + ", estimatedOpenCost=" + this.estimatedOpenCost + ", estimatedClosePnl=" + this.estimatedClosePnl + ", closeCost=" + this.closeCost + ", openCost=" + this.openCost + ", minimalPaybackDays=" + this.minimalPaybackDays + ", realizedClosePnl=" + this.realizedClosePnl + ", allowLeverPrincipal=" + this.allowLeverPrincipal + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.spreadRatio);
        parcel.writeString(this.marketSpreadRatio);
        parcel.writeString(this.unitAmt);
        parcel.writeString(this.minUnitAmt);
        parcel.writeString(this.userExpectSpreadRatio);
        parcel.writeString(this.userExpectUnitAmt);
        this.arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        parcel.writeString(this.estimatingEnlargeArbPnl);
        List<ArbInvestDetailsItems> list = this.arbItems;
        parcel.writeInt(list.size());
        Iterator<ArbInvestDetailsItems> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.enlargedAmt);
        parcel.writeString(this.interestDebt);
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        if (estimatedStakingVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedStakingVo.writeToParcel(parcel, i);
        }
        EstimatedStakingVo estimatedStakingVo2 = this.estimatedAutoStaking;
        if (estimatedStakingVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedStakingVo2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minAmt);
        parcel.writeString(this.displayMinPaybackDays);
        parcel.writeString(this.highestApyPeriod);
        List<EstimatedApyVo> list2 = this.estimatedApyList;
        parcel.writeInt(list2.size());
        Iterator<EstimatedApyVo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        CostVo costVo = this.estimatedOpenCost;
        if (costVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo.writeToParcel(parcel, i);
        }
        this.estimatedClosePnl.writeToParcel(parcel, i);
        CostVo costVo2 = this.closeCost;
        if (costVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo2.writeToParcel(parcel, i);
        }
        CostVo costVo3 = this.openCost;
        if (costVo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minimalPaybackDays);
        parcel.writeString(this.realizedClosePnl);
        parcel.writeInt(this.allowLeverPrincipal ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageInfoResponse> serializer() {
            return ArbitrageInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageInfoResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, String str7, List list, String str8, String str9, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, String str10, String str11, String str12, List list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, String str13, String str14, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.spreadRatio = "";
        } else {
            this.spreadRatio = str;
        }
        if ((i & 2) == 0) {
            this.marketSpreadRatio = "";
        } else {
            this.marketSpreadRatio = str2;
        }
        if ((i & 4) == 0) {
            this.unitAmt = "";
        } else {
            this.unitAmt = str3;
        }
        if ((i & 8) == 0) {
            this.minUnitAmt = "";
        } else {
            this.minUnitAmt = str4;
        }
        if ((i & 16) == 0) {
            this.userExpectSpreadRatio = "";
        } else {
            this.userExpectSpreadRatio = str5;
        }
        if ((i & 32) == 0) {
            this.userExpectUnitAmt = "";
        } else {
            this.userExpectUnitAmt = str6;
        }
        this.arbitrageTotalPnlInfo = (i & 64) == 0 ? new ArbitrageTotalPnlInfo((String) null, (String) null, (ArbitrageGainVo) null, (ArbitrageCostVo) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : arbitrageTotalPnlInfo;
        if ((i & 128) == 0) {
            this.estimatingEnlargeArbPnl = "";
        } else {
            this.estimatingEnlargeArbPnl = str7;
        }
        this.arbItems = (i & 256) == 0 ? yDY.AhwBna() : list;
        if ((i & 512) == 0) {
            this.enlargedAmt = "";
        } else {
            this.enlargedAmt = str8;
        }
        if ((i & 1024) == 0) {
            this.interestDebt = "";
        } else {
            this.interestDebt = str9;
        }
        if ((i & 2048) == 0) {
            this.estimatedStaking = null;
        } else {
            this.estimatedStaking = estimatedStakingVo;
        }
        this.estimatedAutoStaking = (i & 4096) == 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo2;
        if ((i & 8192) == 0) {
            this.minAmt = "";
        } else {
            this.minAmt = str10;
        }
        if ((i & 16384) == 0) {
            this.displayMinPaybackDays = "";
        } else {
            this.displayMinPaybackDays = str11;
        }
        if ((32768 & i) == 0) {
            this.highestApyPeriod = "";
        } else {
            this.highestApyPeriod = str12;
        }
        this.estimatedApyList = (65536 & i) == 0 ? yDY.AhwBna() : list2;
        this.estimatedOpenCost = (131072 & i) == 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo;
        this.estimatedClosePnl = (262144 & i) == 0 ? new EstimatedClosePnlVo((String) null, (GainVo) null, (String) null, (CostVo) null, (CostVo) null, 31, (DefaultConstructorMarker) null) : estimatedClosePnlVo;
        if ((524288 & i) == 0) {
            this.closeCost = null;
        } else {
            this.closeCost = costVo2;
        }
        if ((1048576 & i) == 0) {
            this.openCost = null;
        } else {
            this.openCost = costVo3;
        }
        if ((2097152 & i) == 0) {
            this.minimalPaybackDays = null;
        } else {
            this.minimalPaybackDays = str13;
        }
        if ((4194304 & i) == 0) {
            this.realizedClosePnl = null;
        } else {
            this.realizedClosePnl = str14;
        }
        this.allowLeverPrincipal = (i & 8388608) == 0 ? false : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [5561=7] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageInfoResponse arbitrageInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.spreadRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, arbitrageInfoResponse.spreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.marketSpreadRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, arbitrageInfoResponse.marketSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.unitAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, arbitrageInfoResponse.unitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.minUnitAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, arbitrageInfoResponse.minUnitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.userExpectSpreadRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, arbitrageInfoResponse.userExpectSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.userExpectUnitAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, arbitrageInfoResponse.userExpectUnitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(arbitrageInfoResponse.arbitrageTotalPnlInfo, new ArbitrageTotalPnlInfo((String) null, (String) null, (ArbitrageGainVo) null, (ArbitrageCostVo) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, ArbitrageTotalPnlInfo$$serializer.INSTANCE, arbitrageInfoResponse.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.estimatingEnlargeArbPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, arbitrageInfoResponse.estimatingEnlargeArbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(arbitrageInfoResponse.arbItems, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], arbitrageInfoResponse.arbItems);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.enlargedAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, arbitrageInfoResponse.enlargedAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.interestDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, arbitrageInfoResponse.interestDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || arbitrageInfoResponse.estimatedStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, EstimatedStakingVo$$serializer.INSTANCE, arbitrageInfoResponse.estimatedStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(arbitrageInfoResponse.estimatedAutoStaking, new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, EstimatedStakingVo$$serializer.INSTANCE, arbitrageInfoResponse.estimatedAutoStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.minAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, arbitrageInfoResponse.minAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.displayMinPaybackDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, arbitrageInfoResponse.displayMinPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) arbitrageInfoResponse.highestApyPeriod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, arbitrageInfoResponse.highestApyPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(arbitrageInfoResponse.estimatedApyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], arbitrageInfoResponse.estimatedApyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(arbitrageInfoResponse.estimatedOpenCost, new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, CostVo$$serializer.INSTANCE, arbitrageInfoResponse.estimatedOpenCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(arbitrageInfoResponse.estimatedClosePnl, new EstimatedClosePnlVo((String) null, (GainVo) null, (String) null, (CostVo) null, (CostVo) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, EstimatedClosePnlVo$$serializer.INSTANCE, arbitrageInfoResponse.estimatedClosePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || arbitrageInfoResponse.closeCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, CostVo$$serializer.INSTANCE, arbitrageInfoResponse.closeCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || arbitrageInfoResponse.openCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, CostVo$$serializer.INSTANCE, arbitrageInfoResponse.openCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || arbitrageInfoResponse.minimalPaybackDays != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, arbitrageInfoResponse.minimalPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || arbitrageInfoResponse.realizedClosePnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, arbitrageInfoResponse.realizedClosePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || arbitrageInfoResponse.allowLeverPrincipal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, arbitrageInfoResponse.allowLeverPrincipal);
        }
    }

    public ArbitrageInfoResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, @NotNull String str7, @NotNull List<ArbInvestDetailsItems> list, @NotNull String str8, @NotNull String str9, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<EstimatedApyVo> list2, CostVo costVo, @NotNull EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, String str13, String str14, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arbitrageTotalPnlInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(estimatedClosePnlVo, "");
        this.spreadRatio = str;
        this.marketSpreadRatio = str2;
        this.unitAmt = str3;
        this.minUnitAmt = str4;
        this.userExpectSpreadRatio = str5;
        this.userExpectUnitAmt = str6;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.estimatingEnlargeArbPnl = str7;
        this.arbItems = list;
        this.enlargedAmt = str8;
        this.interestDebt = str9;
        this.estimatedStaking = estimatedStakingVo;
        this.estimatedAutoStaking = estimatedStakingVo2;
        this.minAmt = str10;
        this.displayMinPaybackDays = str11;
        this.highestApyPeriod = str12;
        this.estimatedApyList = list2;
        this.estimatedOpenCost = costVo;
        this.estimatedClosePnl = estimatedClosePnlVo;
        this.closeCost = costVo2;
        this.openCost = costVo3;
        this.minimalPaybackDays = str13;
        this.realizedClosePnl = str14;
        this.allowLeverPrincipal = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x018c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo:?: TERNARY null = ((wrap:int:0x0034: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbitrageGainVo:?: CAST (com.okinc.unify_trade.biz.ArbitrageGainVo) (null com.okinc.unify_trade.biz.ArbitrageGainVo))
  (wrap:com.okinc.unify_trade.biz.ArbitrageCostVo:?: CAST (com.okinc.unify_trade.biz.ArbitrageCostVo) (null com.okinc.unify_trade.biz.ArbitrageCostVo))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageGainVo, com.okinc.unify_trade.biz.ArbitrageCostVo, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:5571) call: com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageGainVo, com.okinc.unify_trade.biz.ArbitrageCostVo, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0053: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5573)) : (r36v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.EstimatedStakingVo:?: TERNARY null = ((wrap:int:0x006e: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EstimatedStakingVo) : (r39v0 com.okinc.unify_trade.biz.EstimatedStakingVo))
  (wrap:com.okinc.unify_trade.biz.EstimatedStakingVo:?: TERNARY null = ((wrap:int:0x0076: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:5577) call: com.okinc.unify_trade.biz.EstimatedStakingVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r40v0 com.okinc.unify_trade.biz.EstimatedStakingVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c5: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5581)) : (r44v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f2: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:5582) call: com.okinc.unify_trade.biz.CostVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r45v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.EstimatedClosePnlVo:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.GainVo:?: CAST (com.okinc.unify_trade.biz.GainVo) (null com.okinc.unify_trade.biz.GainVo))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: CAST (com.okinc.unify_trade.biz.CostVo) (null com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: CAST (com.okinc.unify_trade.biz.CostVo) (null com.okinc.unify_trade.biz.CostVo))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.GainVo, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:5583) call: com.okinc.unify_trade.biz.EstimatedClosePnlVo.<init>(java.lang.String, com.okinc.unify_trade.biz.GainVo, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.unify_trade.biz.EstimatedClosePnlVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x0126: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r47v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x0131: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r48v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013c: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0152: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, java.lang.String, java.util.List<com.okinc.unify_trade.biz.ArbInvestDetailsItems>, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.EstimatedStakingVo, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.EstimatedApyVo>, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.EstimatedClosePnlVo, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, java.lang.String, java.lang.String, boolean):void (m)] (LINE:5564) call: com.okinc.unify_trade.biz.ArbitrageInfoResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.EstimatedStakingVo, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.EstimatedClosePnlVo, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ArbitrageInfoResponse(String str, String str2, String str3, String str4, String str5, String str6, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, String str7, List list, String str8, String str9, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, String str10, String str11, String str12, List list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, String str13, String str14, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new ArbitrageTotalPnlInfo((String) null, (String) null, (ArbitrageGainVo) null, (ArbitrageCostVo) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : arbitrageTotalPnlInfo, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? null : estimatedStakingVo, (i & 4096) != 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo2, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? yDY.AhwBna() : list2, (i & 131072) != 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo, (i & 262144) != 0 ? new EstimatedClosePnlVo((String) null, (GainVo) null, (String) null, (CostVo) null, (CostVo) null, 31, (DefaultConstructorMarker) null) : estimatedClosePnlVo, (i & 524288) != 0 ? null : costVo2, (i & 1048576) != 0 ? null : costVo3, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? null : str14, (i & 8388608) != 0 ? false : z);
    }
}
