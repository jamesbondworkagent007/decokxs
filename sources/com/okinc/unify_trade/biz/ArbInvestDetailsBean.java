package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
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
public final class ArbInvestDetailsBean implements Parcelable {
    private final boolean allowLeverPrincipal;
    private final List<ArbInvestDetailsItems> arbItems;
    private final ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private final CostVo closeCost;
    private final String displayMinPaybackDays;
    private final String enlargedAmt;
    private final List<EstimatedApyVo> estimatedApyList;
    private final EstimatedClosePnlVo estimatedClosePnl;
    private final CostVo estimatedOpenCost;
    private final EstimatedStakingVo estimatedStaking;
    private final String estimatingArbPnl;
    private final String estimatingEnlargeArbPnl;
    private final String highestApyPeriod;
    private final String instFamily;
    private final String interestDebt;
    private ArbInvestDetailsBeanStakingType4UI isStaking;
    private final String marketSpreadRatio;
    private final String minAmt;
    private final String minUnitAmt;
    private final CostVo openCost;
    private final String spreadRatio;
    private String totalAmt;
    private String unit;
    private final String unitAmt;
    private final String userExpectSpreadRatio;
    private final String userExpectUnitAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbInvestDetailsBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ArbInvestDetailsItems$$serializer.INSTANCE), null, null, null, null, null, ArbInvestDetailsBeanStakingType4UI.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(EstimatedApyVo$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ArbInvestDetailsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbInvestDetailsBean createFromParcel(Parcel parcel) {
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
            ArrayList arrayList;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(ArbInvestDetailsItems.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UICreateFromParcel = ArbInvestDetailsBeanStakingType4UI.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfoCreateFromParcel = parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            EstimatedStakingVo estimatedStakingVoCreateFromParcel = parcel.readInt() == 0 ? null : EstimatedStakingVo.CREATOR.createFromParcel(parcel);
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                arbitrageTotalPnlInfo = arbitrageTotalPnlInfoCreateFromParcel;
                str = string11;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arbitrageTotalPnlInfo = arbitrageTotalPnlInfoCreateFromParcel;
                arrayList = new ArrayList(i3);
                str = string11;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList.add(EstimatedApyVo.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
            }
            return new ArbInvestDetailsBean(arrayList2, string, string2, string3, string4, string5, arbInvestDetailsBeanStakingType4UICreateFromParcel, string6, string7, string8, string9, string10, str, arbitrageTotalPnlInfo, z, string12, string13, estimatedStakingVoCreateFromParcel, string14, string15, string16, arrayList, parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EstimatedClosePnlVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CostVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbInvestDetailsBean[] newArray(int i) {
            return new ArbInvestDetailsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbInvestDetailsBean() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbInvestDetailsBeanStakingType4UI) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, false, (String) null, (String) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbInvestDetailsItems> component1() {
        return this.arbItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.unitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userExpectSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.userExpectUnitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component14() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.allowLeverPrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.enlargedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo component18() {
        return this.estimatedStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.minAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedApyVo> component22() {
        return this.estimatedApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component23() {
        return this.estimatedOpenCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedClosePnlVo component24() {
        return this.estimatedClosePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component25() {
        return this.closeCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component26() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estimatingArbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimatingEnlargeArbPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsBeanStakingType4UI component7() {
        return this.isStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.spreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.marketSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsBean copy(@NotNull List<ArbInvestDetailsItems> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, String str6, String str7, String str8, String str9, String str10, String str11, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, boolean z, String str12, String str13, EstimatedStakingVo estimatedStakingVo, String str14, String str15, String str16, List<EstimatedApyVo> list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arbInvestDetailsBeanStakingType4UI, "");
        return new ArbInvestDetailsBean(list, str, str2, str3, str4, str5, arbInvestDetailsBeanStakingType4UI, str6, str7, str8, str9, str10, str11, arbitrageTotalPnlInfo, z, str12, str13, estimatedStakingVo, str14, str15, str16, list2, costVo, estimatedClosePnlVo, costVo2, costVo3);
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
        if (!(obj instanceof ArbInvestDetailsBean)) {
            return false;
        }
        ArbInvestDetailsBean arbInvestDetailsBean = (ArbInvestDetailsBean) obj;
        return Intrinsics.EZpvd(this.arbItems, arbInvestDetailsBean.arbItems) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) arbInvestDetailsBean.totalAmt) && Intrinsics.EZpvd((Object) this.unit, (Object) arbInvestDetailsBean.unit) && Intrinsics.EZpvd((Object) this.estimatingArbPnl, (Object) arbInvestDetailsBean.estimatingArbPnl) && Intrinsics.EZpvd((Object) this.estimatingEnlargeArbPnl, (Object) arbInvestDetailsBean.estimatingEnlargeArbPnl) && Intrinsics.EZpvd((Object) this.instFamily, (Object) arbInvestDetailsBean.instFamily) && this.isStaking == arbInvestDetailsBean.isStaking && Intrinsics.EZpvd((Object) this.spreadRatio, (Object) arbInvestDetailsBean.spreadRatio) && Intrinsics.EZpvd((Object) this.marketSpreadRatio, (Object) arbInvestDetailsBean.marketSpreadRatio) && Intrinsics.EZpvd((Object) this.unitAmt, (Object) arbInvestDetailsBean.unitAmt) && Intrinsics.EZpvd((Object) this.minUnitAmt, (Object) arbInvestDetailsBean.minUnitAmt) && Intrinsics.EZpvd((Object) this.userExpectSpreadRatio, (Object) arbInvestDetailsBean.userExpectSpreadRatio) && Intrinsics.EZpvd((Object) this.userExpectUnitAmt, (Object) arbInvestDetailsBean.userExpectUnitAmt) && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, arbInvestDetailsBean.arbitrageTotalPnlInfo) && this.allowLeverPrincipal == arbInvestDetailsBean.allowLeverPrincipal && Intrinsics.EZpvd((Object) this.enlargedAmt, (Object) arbInvestDetailsBean.enlargedAmt) && Intrinsics.EZpvd((Object) this.interestDebt, (Object) arbInvestDetailsBean.interestDebt) && Intrinsics.EZpvd(this.estimatedStaking, arbInvestDetailsBean.estimatedStaking) && Intrinsics.EZpvd((Object) this.minAmt, (Object) arbInvestDetailsBean.minAmt) && Intrinsics.EZpvd((Object) this.displayMinPaybackDays, (Object) arbInvestDetailsBean.displayMinPaybackDays) && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) arbInvestDetailsBean.highestApyPeriod) && Intrinsics.EZpvd(this.estimatedApyList, arbInvestDetailsBean.estimatedApyList) && Intrinsics.EZpvd(this.estimatedOpenCost, arbInvestDetailsBean.estimatedOpenCost) && Intrinsics.EZpvd(this.estimatedClosePnl, arbInvestDetailsBean.estimatedClosePnl) && Intrinsics.EZpvd(this.closeCost, arbInvestDetailsBean.closeCost) && Intrinsics.EZpvd(this.openCost, arbInvestDetailsBean.openCost);
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
    public final String getEstimatingArbPnl() {
        return this.estimatingArbPnl;
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
    public final String getInstFamily() {
        return this.instFamily;
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
    public final CostVo getOpenCost() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadRatio() {
        return this.spreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
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
        int iHashCode = this.arbItems.hashCode();
        int iHashCode2 = this.totalAmt.hashCode();
        int iHashCode3 = this.unit.hashCode();
        int iHashCode4 = this.estimatingArbPnl.hashCode();
        int iHashCode5 = this.estimatingEnlargeArbPnl.hashCode();
        String str = this.instFamily;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.isStaking.hashCode();
        String str2 = this.spreadRatio;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.marketSpreadRatio;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.unitAmt;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.minUnitAmt;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.userExpectSpreadRatio;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.userExpectUnitAmt;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode14 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        int iHashCode15 = Boolean.hashCode(this.allowLeverPrincipal);
        String str8 = this.enlargedAmt;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.interestDebt;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        int iHashCode18 = estimatedStakingVo == null ? 0 : estimatedStakingVo.hashCode();
        String str10 = this.minAmt;
        int iHashCode19 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.displayMinPaybackDays;
        int iHashCode20 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.highestApyPeriod;
        int iHashCode21 = str12 == null ? 0 : str12.hashCode();
        List<EstimatedApyVo> list = this.estimatedApyList;
        int iHashCode22 = list == null ? 0 : list.hashCode();
        CostVo costVo = this.estimatedOpenCost;
        int iHashCode23 = costVo == null ? 0 : costVo.hashCode();
        EstimatedClosePnlVo estimatedClosePnlVo = this.estimatedClosePnl;
        int iHashCode24 = estimatedClosePnlVo == null ? 0 : estimatedClosePnlVo.hashCode();
        CostVo costVo2 = this.closeCost;
        int iHashCode25 = costVo2 == null ? 0 : costVo2.hashCode();
        CostVo costVo3 = this.openCost;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (costVo3 == null ? 0 : costVo3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsBeanStakingType4UI isStaking() {
        return this.isStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStaking(@NotNull ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI) {
        Intrinsics.checkNotNullParameter(arbInvestDetailsBeanStakingType4UI, "");
        this.isStaking = arbInvestDetailsBeanStakingType4UI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbInvestDetailsBean(arbItems=" + this.arbItems + ", totalAmt=" + this.totalAmt + ", unit=" + this.unit + ", estimatingArbPnl=" + this.estimatingArbPnl + ", estimatingEnlargeArbPnl=" + this.estimatingEnlargeArbPnl + ", instFamily=" + this.instFamily + ", isStaking=" + this.isStaking + ", spreadRatio=" + this.spreadRatio + ", marketSpreadRatio=" + this.marketSpreadRatio + ", unitAmt=" + this.unitAmt + ", minUnitAmt=" + this.minUnitAmt + ", userExpectSpreadRatio=" + this.userExpectSpreadRatio + ", userExpectUnitAmt=" + this.userExpectUnitAmt + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", allowLeverPrincipal=" + this.allowLeverPrincipal + ", enlargedAmt=" + this.enlargedAmt + ", interestDebt=" + this.interestDebt + ", estimatedStaking=" + this.estimatedStaking + ", minAmt=" + this.minAmt + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", highestApyPeriod=" + this.highestApyPeriod + ", estimatedApyList=" + this.estimatedApyList + ", estimatedOpenCost=" + this.estimatedOpenCost + ", estimatedClosePnl=" + this.estimatedClosePnl + ", closeCost=" + this.closeCost + ", openCost=" + this.openCost + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ArbInvestDetailsItems> list = this.arbItems;
        parcel.writeInt(list.size());
        Iterator<ArbInvestDetailsItems> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.unit);
        parcel.writeString(this.estimatingArbPnl);
        parcel.writeString(this.estimatingEnlargeArbPnl);
        parcel.writeString(this.instFamily);
        this.isStaking.writeToParcel(parcel, i);
        parcel.writeString(this.spreadRatio);
        parcel.writeString(this.marketSpreadRatio);
        parcel.writeString(this.unitAmt);
        parcel.writeString(this.minUnitAmt);
        parcel.writeString(this.userExpectSpreadRatio);
        parcel.writeString(this.userExpectUnitAmt);
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        if (arbitrageTotalPnlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.allowLeverPrincipal ? 1 : 0);
        parcel.writeString(this.enlargedAmt);
        parcel.writeString(this.interestDebt);
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        if (estimatedStakingVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedStakingVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.minAmt);
        parcel.writeString(this.displayMinPaybackDays);
        parcel.writeString(this.highestApyPeriod);
        List<EstimatedApyVo> list2 = this.estimatedApyList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<EstimatedApyVo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        CostVo costVo = this.estimatedOpenCost;
        if (costVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo.writeToParcel(parcel, i);
        }
        EstimatedClosePnlVo estimatedClosePnlVo = this.estimatedClosePnl;
        if (estimatedClosePnlVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedClosePnlVo.writeToParcel(parcel, i);
        }
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbInvestDetailsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbInvestDetailsBean> serializer() {
            return ArbInvestDetailsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbInvestDetailsBean(int i, List list, String str, String str2, String str3, String str4, String str5, ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, String str6, String str7, String str8, String str9, String str10, String str11, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, boolean z, String str12, String str13, EstimatedStakingVo estimatedStakingVo, String str14, String str15, String str16, List list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, SerializationConstructorMarker serializationConstructorMarker) {
        this.arbItems = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str;
        }
        if ((i & 4) == 0) {
            this.unit = "";
        } else {
            this.unit = str2;
        }
        if ((i & 8) == 0) {
            this.estimatingArbPnl = "";
        } else {
            this.estimatingArbPnl = str3;
        }
        if ((i & 16) == 0) {
            this.estimatingEnlargeArbPnl = "";
        } else {
            this.estimatingEnlargeArbPnl = str4;
        }
        if ((i & 32) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str5;
        }
        this.isStaking = (i & 64) == 0 ? ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING : arbInvestDetailsBeanStakingType4UI;
        if ((i & 128) == 0) {
            this.spreadRatio = "";
        } else {
            this.spreadRatio = str6;
        }
        if ((i & 256) == 0) {
            this.marketSpreadRatio = "";
        } else {
            this.marketSpreadRatio = str7;
        }
        if ((i & 512) == 0) {
            this.unitAmt = "";
        } else {
            this.unitAmt = str8;
        }
        if ((i & 1024) == 0) {
            this.minUnitAmt = "";
        } else {
            this.minUnitAmt = str9;
        }
        if ((i & 2048) == 0) {
            this.userExpectSpreadRatio = "";
        } else {
            this.userExpectSpreadRatio = str10;
        }
        if ((i & 4096) == 0) {
            this.userExpectUnitAmt = "";
        } else {
            this.userExpectUnitAmt = str11;
        }
        if ((i & 8192) == 0) {
            this.arbitrageTotalPnlInfo = null;
        } else {
            this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        }
        this.allowLeverPrincipal = (i & 16384) == 0 ? false : z;
        if ((32768 & i) == 0) {
            this.enlargedAmt = "";
        } else {
            this.enlargedAmt = str12;
        }
        if ((65536 & i) == 0) {
            this.interestDebt = "";
        } else {
            this.interestDebt = str13;
        }
        if ((131072 & i) == 0) {
            this.estimatedStaking = null;
        } else {
            this.estimatedStaking = estimatedStakingVo;
        }
        if ((262144 & i) == 0) {
            this.minAmt = "";
        } else {
            this.minAmt = str14;
        }
        if ((524288 & i) == 0) {
            this.displayMinPaybackDays = "";
        } else {
            this.displayMinPaybackDays = str15;
        }
        if ((1048576 & i) == 0) {
            this.highestApyPeriod = "";
        } else {
            this.highestApyPeriod = str16;
        }
        this.estimatedApyList = (2097152 & i) == 0 ? new ArrayList() : list2;
        if ((4194304 & i) == 0) {
            this.estimatedOpenCost = null;
        } else {
            this.estimatedOpenCost = costVo;
        }
        if ((8388608 & i) == 0) {
            this.estimatedClosePnl = null;
        } else {
            this.estimatedClosePnl = estimatedClosePnlVo;
        }
        if ((16777216 & i) == 0) {
            this.closeCost = null;
        } else {
            this.closeCost = costVo2;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.openCost = null;
        } else {
            this.openCost = costVo3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [4472=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbInvestDetailsBean arbInvestDetailsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(arbInvestDetailsBean.arbItems, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], arbInvestDetailsBean.arbItems);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, arbInvestDetailsBean.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.unit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, arbInvestDetailsBean.unit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.estimatingArbPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, arbInvestDetailsBean.estimatingArbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.estimatingEnlargeArbPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, arbInvestDetailsBean.estimatingEnlargeArbPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.instFamily, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbInvestDetailsBean.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || arbInvestDetailsBean.isStaking != ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], arbInvestDetailsBean.isStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.spreadRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, arbInvestDetailsBean.spreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.marketSpreadRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, arbInvestDetailsBean.marketSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.unitAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, arbInvestDetailsBean.unitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.minUnitAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, arbInvestDetailsBean.minUnitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.userExpectSpreadRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, arbInvestDetailsBean.userExpectSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.userExpectUnitAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, arbInvestDetailsBean.userExpectUnitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || arbInvestDetailsBean.arbitrageTotalPnlInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, ArbitrageTotalPnlInfo$$serializer.INSTANCE, arbInvestDetailsBean.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || arbInvestDetailsBean.allowLeverPrincipal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, arbInvestDetailsBean.allowLeverPrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.enlargedAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, arbInvestDetailsBean.enlargedAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.interestDebt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, arbInvestDetailsBean.interestDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || arbInvestDetailsBean.estimatedStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, EstimatedStakingVo$$serializer.INSTANCE, arbInvestDetailsBean.estimatedStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.minAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, arbInvestDetailsBean.minAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.displayMinPaybackDays, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, arbInvestDetailsBean.displayMinPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) arbInvestDetailsBean.highestApyPeriod, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, arbInvestDetailsBean.highestApyPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(arbInvestDetailsBean.estimatedApyList, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], arbInvestDetailsBean.estimatedApyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || arbInvestDetailsBean.estimatedOpenCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, CostVo$$serializer.INSTANCE, arbInvestDetailsBean.estimatedOpenCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || arbInvestDetailsBean.estimatedClosePnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, EstimatedClosePnlVo$$serializer.INSTANCE, arbInvestDetailsBean.estimatedClosePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || arbInvestDetailsBean.closeCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, CostVo$$serializer.INSTANCE, arbInvestDetailsBean.closeCost);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && arbInvestDetailsBean.openCost == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, CostVo$$serializer.INSTANCE, arbInvestDetailsBean.openCost);
    }

    public ArbInvestDetailsBean(@NotNull List<ArbInvestDetailsItems> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, String str6, String str7, String str8, String str9, String str10, String str11, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, boolean z, String str12, String str13, EstimatedStakingVo estimatedStakingVo, String str14, String str15, String str16, List<EstimatedApyVo> list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arbInvestDetailsBeanStakingType4UI, "");
        this.arbItems = list;
        this.totalAmt = str;
        this.unit = str2;
        this.estimatingArbPnl = str3;
        this.estimatingEnlargeArbPnl = str4;
        this.instFamily = str5;
        this.isStaking = arbInvestDetailsBeanStakingType4UI;
        this.spreadRatio = str6;
        this.marketSpreadRatio = str7;
        this.unitAmt = str8;
        this.minUnitAmt = str9;
        this.userExpectSpreadRatio = str10;
        this.userExpectUnitAmt = str11;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.allowLeverPrincipal = z;
        this.enlargedAmt = str12;
        this.interestDebt = str13;
        this.estimatedStaking = estimatedStakingVo;
        this.minAmt = str14;
        this.displayMinPaybackDays = str15;
        this.highestApyPeriod = str16;
        this.estimatedApyList = list2;
        this.estimatedOpenCost = costVo;
        this.estimatedClosePnl = estimatedClosePnlVo;
        this.closeCost = costVo2;
        this.openCost = costVo3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0136: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r55v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4476)) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r55v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r55v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r55v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r55v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r55v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI:?: TERNARY null = ((wrap:int:0x0037: ARITH (r55v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] (LINE:4482) com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI) : (r35v0 com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r55v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r55v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r55v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r55v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r55v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r55v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo:?: TERNARY null = ((wrap:int:0x0070: ARITH (r55v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo) : (r42v0 com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r55v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r55v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r55v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.EstimatedStakingVo:?: TERNARY null = ((wrap:int:0x009e: ARITH (r55v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EstimatedStakingVo) : (r46v0 com.okinc.unify_trade.biz.EstimatedStakingVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r55v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r55v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r55v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r55v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d0: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:4497) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r50v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r55v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r51v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.EstimatedClosePnlVo:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r55v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EstimatedClosePnlVo) : (r52v0 com.okinc.unify_trade.biz.EstimatedClosePnlVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r55v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r53v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x00f9: ARITH (r55v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) == (0 int)) ? (r54v0 com.okinc.unify_trade.biz.CostVo) : (null com.okinc.unify_trade.biz.CostVo))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.ArbInvestDetailsItems>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.EstimatedApyVo>, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.EstimatedClosePnlVo, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo):void (m)] (LINE:4475) call: com.okinc.unify_trade.biz.ArbInvestDetailsBean.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.EstimatedClosePnlVo, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo):void type: THIS */
    public /* synthetic */ ArbInvestDetailsBean(List list, String str, String str2, String str3, String str4, String str5, ArbInvestDetailsBeanStakingType4UI arbInvestDetailsBeanStakingType4UI, String str6, String str7, String str8, String str9, String str10, String str11, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, boolean z, String str12, String str13, EstimatedStakingVo estimatedStakingVo, String str14, String str15, String str16, List list2, CostVo costVo, EstimatedClosePnlVo estimatedClosePnlVo, CostVo costVo2, CostVo costVo3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING : arbInvestDetailsBeanStakingType4UI, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? null : arbitrageTotalPnlInfo, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? null : estimatedStakingVo, (i & 262144) != 0 ? "" : str14, (i & 524288) != 0 ? "" : str15, (i & 1048576) != 0 ? "" : str16, (i & 2097152) != 0 ? new ArrayList() : list2, (i & 4194304) != 0 ? null : costVo, (i & 8388608) != 0 ? null : estimatedClosePnlVo, (i & 16777216) != 0 ? null : costVo2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? costVo3 : null);
    }
}
