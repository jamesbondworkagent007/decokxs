package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OrderPreCheckResp implements Parcelable {
    private String _data;
    private String bonus;
    private String changeCoinAvailBa;
    private String changeDebt;
    private String changeDebtCcy;
    private String changeEquity;
    private String changeImr;
    private String changeMgnRatio;
    private String changeMmr;
    private String changeTotalBalance;
    private String coinAvailBa;
    private String coinLeverage;
    private String debt;
    private String debtAmount;
    private String debtCcy;
    private String equity;
    private String fee;
    private String feeCcy;
    private String hourRates;
    private String imr;
    private String instId;
    private String interestAmount;
    private String liqPx;
    private String liqPxPriceDiff;
    private String liqPxPriceDiffRatio;
    private String mgnRatio;
    private String mmr;
    private String ordCost;
    private String rateType;
    private String repayAmount;
    private String sCode;
    private String totalBalance;
    private String type;
    private String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderPreCheckResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrderPreCheckResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderPreCheckResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderPreCheckResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderPreCheckResp[] newArray(int i) {
            return new OrderPreCheckResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderPreCheckResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.coinAvailBa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.changeCoinAvailBa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.debt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.changeDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.changeTotalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this._data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.changeDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.liqPxPriceDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.liqPxPriceDiffRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.interestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.debtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.bonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.ordCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.equity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changeMgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changeImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changeMmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.changeEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderPreCheckResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, String str33, String str34) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        return new OrderPreCheckResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34);
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
        if (!(obj instanceof OrderPreCheckResp)) {
            return false;
        }
        OrderPreCheckResp orderPreCheckResp = (OrderPreCheckResp) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) orderPreCheckResp.instId) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) orderPreCheckResp.mgnRatio) && Intrinsics.EZpvd((Object) this.imr, (Object) orderPreCheckResp.imr) && Intrinsics.EZpvd((Object) this.mmr, (Object) orderPreCheckResp.mmr) && Intrinsics.EZpvd((Object) this.equity, (Object) orderPreCheckResp.equity) && Intrinsics.EZpvd((Object) this.changeMgnRatio, (Object) orderPreCheckResp.changeMgnRatio) && Intrinsics.EZpvd((Object) this.changeImr, (Object) orderPreCheckResp.changeImr) && Intrinsics.EZpvd((Object) this.changeMmr, (Object) orderPreCheckResp.changeMmr) && Intrinsics.EZpvd((Object) this.changeEquity, (Object) orderPreCheckResp.changeEquity) && Intrinsics.EZpvd((Object) this.coinAvailBa, (Object) orderPreCheckResp.coinAvailBa) && Intrinsics.EZpvd((Object) this.changeCoinAvailBa, (Object) orderPreCheckResp.changeCoinAvailBa) && Intrinsics.EZpvd((Object) this.debt, (Object) orderPreCheckResp.debt) && Intrinsics.EZpvd((Object) this.changeDebt, (Object) orderPreCheckResp.changeDebt) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) orderPreCheckResp.totalBalance) && Intrinsics.EZpvd((Object) this.changeTotalBalance, (Object) orderPreCheckResp.changeTotalBalance) && Intrinsics.EZpvd((Object) this.type, (Object) orderPreCheckResp.type) && Intrinsics.EZpvd((Object) this.sCode, (Object) orderPreCheckResp.sCode) && Intrinsics.EZpvd((Object) this._data, (Object) orderPreCheckResp._data) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) orderPreCheckResp.debtCcy) && Intrinsics.EZpvd((Object) this.changeDebtCcy, (Object) orderPreCheckResp.changeDebtCcy) && Intrinsics.EZpvd((Object) this.liqPx, (Object) orderPreCheckResp.liqPx) && Intrinsics.EZpvd((Object) this.liqPxPriceDiff, (Object) orderPreCheckResp.liqPxPriceDiff) && Intrinsics.EZpvd((Object) this.liqPxPriceDiffRatio, (Object) orderPreCheckResp.liqPxPriceDiffRatio) && Intrinsics.EZpvd((Object) this.repayAmount, (Object) orderPreCheckResp.repayAmount) && Intrinsics.EZpvd((Object) this.interestAmount, (Object) orderPreCheckResp.interestAmount) && Intrinsics.EZpvd((Object) this.debtAmount, (Object) orderPreCheckResp.debtAmount) && Intrinsics.EZpvd((Object) this.hourRates, (Object) orderPreCheckResp.hourRates) && Intrinsics.EZpvd((Object) this.fee, (Object) orderPreCheckResp.fee) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) orderPreCheckResp.feeCcy) && Intrinsics.EZpvd((Object) this.bonus, (Object) orderPreCheckResp.bonus) && Intrinsics.EZpvd((Object) this.yearRates, (Object) orderPreCheckResp.yearRates) && Intrinsics.EZpvd((Object) this.ordCost, (Object) orderPreCheckResp.ordCost) && Intrinsics.EZpvd((Object) this.coinLeverage, (Object) orderPreCheckResp.coinLeverage) && Intrinsics.EZpvd((Object) this.rateType, (Object) orderPreCheckResp.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonus() {
        return this.bonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeCoinAvailBa() {
        return this.changeCoinAvailBa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeDebt() {
        return this.changeDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeDebtCcy() {
        return this.changeDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeEquity() {
        return this.changeEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeImr() {
        return this.changeImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeMgnRatio() {
        return this.changeMgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeMmr() {
        return this.changeMmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeTotalBalance() {
        return this.changeTotalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAvailBa() {
        return this.coinAvailBa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLeverage() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebt() {
        return this.debt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtAmount() {
        return this.debtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcy() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEquity() {
        return this.equity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestAmount() {
        return this.interestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxPriceDiff() {
        return this.liqPxPriceDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxPriceDiffRatio() {
        return this.liqPxPriceDiffRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdCost() {
        return this.ordCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayAmount() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_data() {
        return this._data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.mgnRatio.hashCode();
        int iHashCode3 = this.imr.hashCode();
        int iHashCode4 = this.mmr.hashCode();
        int iHashCode5 = this.equity.hashCode();
        int iHashCode6 = this.changeMgnRatio.hashCode();
        int iHashCode7 = this.changeImr.hashCode();
        int iHashCode8 = this.changeMmr.hashCode();
        int iHashCode9 = this.changeEquity.hashCode();
        int iHashCode10 = this.coinAvailBa.hashCode();
        int iHashCode11 = this.changeCoinAvailBa.hashCode();
        int iHashCode12 = this.debt.hashCode();
        int iHashCode13 = this.changeDebt.hashCode();
        int iHashCode14 = this.totalBalance.hashCode();
        int iHashCode15 = this.changeTotalBalance.hashCode();
        int iHashCode16 = this.type.hashCode();
        int iHashCode17 = this.sCode.hashCode();
        int iHashCode18 = this._data.hashCode();
        int iHashCode19 = this.debtCcy.hashCode();
        int iHashCode20 = this.changeDebtCcy.hashCode();
        int iHashCode21 = this.liqPx.hashCode();
        int iHashCode22 = this.liqPxPriceDiff.hashCode();
        int iHashCode23 = this.liqPxPriceDiffRatio.hashCode();
        int iHashCode24 = this.repayAmount.hashCode();
        int iHashCode25 = this.interestAmount.hashCode();
        int iHashCode26 = this.debtAmount.hashCode();
        int iHashCode27 = this.hourRates.hashCode();
        int iHashCode28 = this.fee.hashCode();
        int iHashCode29 = this.feeCcy.hashCode();
        String str = this.bonus;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.yearRates;
        int iHashCode31 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ordCost;
        int iHashCode32 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.coinLeverage;
        int iHashCode33 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rateType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBonus(String str) {
        this.bonus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeCoinAvailBa(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeCoinAvailBa = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeDebt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeDebt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeDebtCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeDebtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeEquity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeEquity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeImr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeMgnRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeMgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeMmr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeMmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeTotalBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeTotalBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAvailBa(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAvailBa = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinLeverage(String str) {
        this.coinLeverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debtAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEquity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.equity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHourRates(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hourRates = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterestAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interestAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPxPriceDiff(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPxPriceDiff = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPxPriceDiffRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPxPriceDiffRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdCost(String str) {
        this.ordCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(String str) {
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repayAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYearRates(String str) {
        this.yearRates = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderPreCheckResp(instId=" + this.instId + ", mgnRatio=" + this.mgnRatio + ", imr=" + this.imr + ", mmr=" + this.mmr + ", equity=" + this.equity + ", changeMgnRatio=" + this.changeMgnRatio + ", changeImr=" + this.changeImr + ", changeMmr=" + this.changeMmr + ", changeEquity=" + this.changeEquity + ", coinAvailBa=" + this.coinAvailBa + ", changeCoinAvailBa=" + this.changeCoinAvailBa + ", debt=" + this.debt + ", changeDebt=" + this.changeDebt + ", totalBalance=" + this.totalBalance + ", changeTotalBalance=" + this.changeTotalBalance + ", type=" + this.type + ", sCode=" + this.sCode + ", _data=" + this._data + ", debtCcy=" + this.debtCcy + ", changeDebtCcy=" + this.changeDebtCcy + ", liqPx=" + this.liqPx + ", liqPxPriceDiff=" + this.liqPxPriceDiff + ", liqPxPriceDiffRatio=" + this.liqPxPriceDiffRatio + ", repayAmount=" + this.repayAmount + ", interestAmount=" + this.interestAmount + ", debtAmount=" + this.debtAmount + ", hourRates=" + this.hourRates + ", fee=" + this.fee + ", feeCcy=" + this.feeCcy + ", bonus=" + this.bonus + ", yearRates=" + this.yearRates + ", ordCost=" + this.ordCost + ", coinLeverage=" + this.coinLeverage + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.imr);
        parcel.writeString(this.mmr);
        parcel.writeString(this.equity);
        parcel.writeString(this.changeMgnRatio);
        parcel.writeString(this.changeImr);
        parcel.writeString(this.changeMmr);
        parcel.writeString(this.changeEquity);
        parcel.writeString(this.coinAvailBa);
        parcel.writeString(this.changeCoinAvailBa);
        parcel.writeString(this.debt);
        parcel.writeString(this.changeDebt);
        parcel.writeString(this.totalBalance);
        parcel.writeString(this.changeTotalBalance);
        parcel.writeString(this.type);
        parcel.writeString(this.sCode);
        parcel.writeString(this._data);
        parcel.writeString(this.debtCcy);
        parcel.writeString(this.changeDebtCcy);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.liqPxPriceDiff);
        parcel.writeString(this.liqPxPriceDiffRatio);
        parcel.writeString(this.repayAmount);
        parcel.writeString(this.interestAmount);
        parcel.writeString(this.debtAmount);
        parcel.writeString(this.hourRates);
        parcel.writeString(this.fee);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.bonus);
        parcel.writeString(this.yearRates);
        parcel.writeString(this.ordCost);
        parcel.writeString(this.coinLeverage);
        parcel.writeString(this.rateType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderPreCheckResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderPreCheckResp> serializer() {
            return OrderPreCheckResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderPreCheckResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str2;
        }
        if ((i & 4) == 0) {
            this.imr = "";
        } else {
            this.imr = str3;
        }
        if ((i & 8) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str4;
        }
        if ((i & 16) == 0) {
            this.equity = "";
        } else {
            this.equity = str5;
        }
        if ((i & 32) == 0) {
            this.changeMgnRatio = "";
        } else {
            this.changeMgnRatio = str6;
        }
        if ((i & 64) == 0) {
            this.changeImr = "";
        } else {
            this.changeImr = str7;
        }
        if ((i & 128) == 0) {
            this.changeMmr = "";
        } else {
            this.changeMmr = str8;
        }
        if ((i & 256) == 0) {
            this.changeEquity = "";
        } else {
            this.changeEquity = str9;
        }
        if ((i & 512) == 0) {
            this.coinAvailBa = "";
        } else {
            this.coinAvailBa = str10;
        }
        if ((i & 1024) == 0) {
            this.changeCoinAvailBa = "";
        } else {
            this.changeCoinAvailBa = str11;
        }
        if ((i & 2048) == 0) {
            this.debt = "";
        } else {
            this.debt = str12;
        }
        if ((i & 4096) == 0) {
            this.changeDebt = "";
        } else {
            this.changeDebt = str13;
        }
        if ((i & 8192) == 0) {
            this.totalBalance = "";
        } else {
            this.totalBalance = str14;
        }
        if ((i & 16384) == 0) {
            this.changeTotalBalance = "";
        } else {
            this.changeTotalBalance = str15;
        }
        if ((32768 & i) == 0) {
            this.type = "";
        } else {
            this.type = str16;
        }
        if ((65536 & i) == 0) {
            this.sCode = "";
        } else {
            this.sCode = str17;
        }
        if ((131072 & i) == 0) {
            this._data = "";
        } else {
            this._data = str18;
        }
        if ((262144 & i) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str19;
        }
        if ((524288 & i) == 0) {
            this.changeDebtCcy = "";
        } else {
            this.changeDebtCcy = str20;
        }
        if ((1048576 & i) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str21;
        }
        if ((2097152 & i) == 0) {
            this.liqPxPriceDiff = "";
        } else {
            this.liqPxPriceDiff = str22;
        }
        if ((4194304 & i) == 0) {
            this.liqPxPriceDiffRatio = "";
        } else {
            this.liqPxPriceDiffRatio = str23;
        }
        if ((8388608 & i) == 0) {
            this.repayAmount = "";
        } else {
            this.repayAmount = str24;
        }
        if ((16777216 & i) == 0) {
            this.interestAmount = "";
        } else {
            this.interestAmount = str25;
        }
        if ((33554432 & i) == 0) {
            this.debtAmount = "";
        } else {
            this.debtAmount = str26;
        }
        if ((67108864 & i) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str27;
        }
        if ((134217728 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str28;
        }
        if ((268435456 & i) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str29;
        }
        if ((536870912 & i) == 0) {
            this.bonus = "";
        } else {
            this.bonus = str30;
        }
        if ((1073741824 & i) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.ordCost = "";
        } else {
            this.ordCost = str32;
        }
        if ((i2 & 1) == 0) {
            this.coinLeverage = "";
        } else {
            this.coinLeverage = str33;
        }
        if ((i2 & 2) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str34;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderPreCheckResp orderPreCheckResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderPreCheckResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderPreCheckResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderPreCheckResp.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderPreCheckResp.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderPreCheckResp.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderPreCheckResp.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderPreCheckResp.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderPreCheckResp.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderPreCheckResp.equity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderPreCheckResp.equity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeMgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderPreCheckResp.changeMgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeImr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderPreCheckResp.changeImr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeMmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderPreCheckResp.changeMmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeEquity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderPreCheckResp.changeEquity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderPreCheckResp.coinAvailBa, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderPreCheckResp.coinAvailBa);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeCoinAvailBa, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderPreCheckResp.changeCoinAvailBa);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderPreCheckResp.debt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderPreCheckResp.debt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderPreCheckResp.changeDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderPreCheckResp.totalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderPreCheckResp.totalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeTotalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderPreCheckResp.changeTotalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderPreCheckResp.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderPreCheckResp.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderPreCheckResp.sCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderPreCheckResp.sCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderPreCheckResp._data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderPreCheckResp._data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderPreCheckResp.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderPreCheckResp.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderPreCheckResp.changeDebtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderPreCheckResp.changeDebtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderPreCheckResp.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderPreCheckResp.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderPreCheckResp.liqPxPriceDiff, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderPreCheckResp.liqPxPriceDiff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderPreCheckResp.liqPxPriceDiffRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderPreCheckResp.liqPxPriceDiffRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderPreCheckResp.repayAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderPreCheckResp.repayAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderPreCheckResp.interestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderPreCheckResp.interestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderPreCheckResp.debtAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderPreCheckResp.debtAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderPreCheckResp.hourRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderPreCheckResp.hourRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) orderPreCheckResp.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, orderPreCheckResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) orderPreCheckResp.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, orderPreCheckResp.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) orderPreCheckResp.bonus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, orderPreCheckResp.bonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) orderPreCheckResp.yearRates, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, orderPreCheckResp.yearRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) orderPreCheckResp.ordCost, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, orderPreCheckResp.ordCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) orderPreCheckResp.coinLeverage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, orderPreCheckResp.coinLeverage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && Intrinsics.EZpvd((Object) orderPreCheckResp.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, orderPreCheckResp.rateType);
    }

    public OrderPreCheckResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, String str33, String str34) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        this.instId = str;
        this.mgnRatio = str2;
        this.imr = str3;
        this.mmr = str4;
        this.equity = str5;
        this.changeMgnRatio = str6;
        this.changeImr = str7;
        this.changeMmr = str8;
        this.changeEquity = str9;
        this.coinAvailBa = str10;
        this.changeCoinAvailBa = str11;
        this.debt = str12;
        this.changeDebt = str13;
        this.totalBalance = str14;
        this.changeTotalBalance = str15;
        this.type = str16;
        this.sCode = str17;
        this._data = str18;
        this.debtCcy = str19;
        this.changeDebtCcy = str20;
        this.liqPx = str21;
        this.liqPxPriceDiff = str22;
        this.liqPxPriceDiffRatio = str23;
        this.repayAmount = str24;
        this.interestAmount = str25;
        this.debtAmount = str26;
        this.hourRates = str27;
        this.fee = str28;
        this.feeCcy = str29;
        this.bonus = str30;
        this.yearRates = str31;
        this.ordCost = str32;
        this.coinLeverage = str33;
        this.rateType = str34;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0193: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r69v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r69v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r69v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r69v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r69v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r69v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r69v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r69v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r69v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r69v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r69v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r69v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r69v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r69v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r69v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r69v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r69v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r69v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r69v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r69v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r69v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r69v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r69v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r69v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r69v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r69v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r69v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r69v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r69v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r69v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r69v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r69v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:756) call: com.okinc.unify_trade.biz.OrderPreCheckResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderPreCheckResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34);
    }
}
