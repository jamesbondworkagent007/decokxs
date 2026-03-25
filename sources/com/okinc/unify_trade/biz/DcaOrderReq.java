package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DcaOrderReq implements Parcelable {
    private String annualizedRate;
    private String autoMarginReloadMaxAmount;
    private boolean autoMarginReloadSwitch;
    private String autoTransfer;
    private String batchNo;
    private String direction;
    private String initOrdAmt;
    private String initOrdPct;
    private String instId;
    private String instType;
    private String investType;
    private String investmentAmt;
    private boolean isToManual;
    private String lever;
    private String maxSafetyOrds;
    private String nmpUnderlyingId;
    private String ordType;
    private String profitSharingRatio;
    private String pxSteps;
    private String pxStepsMult;
    private String reinvestment;
    private Boolean reserveFunds;
    private String safetyOrdAmt;
    private String slMode;
    private String slPct;
    private String sourceAlgoId;
    private String systemSource;
    private String totalAmt;
    private String tpPct;
    private String trackingMode;
    private String tradeQuoteCcy;
    private List<DcaTriggerParam> triggerParams;
    private String userRiskMode;
    private AutoVipProfitInfo vipProfit;
    private String volMult;
    private String voucherId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DcaOrderReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(DcaTriggerParam$$serializer.INSTANCE)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DcaOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaOrderReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            int i;
            DcaTriggerParam dcaTriggerParamCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    if (parcel.readInt() == 0) {
                        i = i2;
                        dcaTriggerParamCreateFromParcel = null;
                    } else {
                        i = i2;
                        dcaTriggerParamCreateFromParcel = DcaTriggerParam.CREATOR.createFromParcel(parcel);
                    }
                    arrayList2.add(dcaTriggerParamCreateFromParcel);
                    i3++;
                    i2 = i;
                }
                arrayList = arrayList2;
            }
            return new DcaOrderReq(string, string2, boolValueOf, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AutoVipProfitInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaOrderReq[] newArray(int i) {
            return new DcaOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaOrderReq() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.userRiskMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component18() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.trackingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.isToManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo component36() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaOrderReq copy(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<DcaTriggerParam> list, String str17, String str18, String str19, String str20, @NotNull String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, @NotNull String str26, String str27, String str28, String str29, String str30, String str31, AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new DcaOrderReq(str, str2, bool, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, list, str17, str18, str19, str20, str21, z, z2, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, autoVipProfitInfo);
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
        if (!(obj instanceof DcaOrderReq)) {
            return false;
        }
        DcaOrderReq dcaOrderReq = (DcaOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) dcaOrderReq.instId) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) dcaOrderReq.initOrdAmt) && Intrinsics.EZpvd(this.reserveFunds, dcaOrderReq.reserveFunds) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) dcaOrderReq.safetyOrdAmt) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) dcaOrderReq.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) dcaOrderReq.pxSteps) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) dcaOrderReq.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) dcaOrderReq.volMult) && Intrinsics.EZpvd((Object) this.tpPct, (Object) dcaOrderReq.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) dcaOrderReq.slPct) && Intrinsics.EZpvd((Object) this.direction, (Object) dcaOrderReq.direction) && Intrinsics.EZpvd((Object) this.investType, (Object) dcaOrderReq.investType) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) dcaOrderReq.investmentAmt) && Intrinsics.EZpvd((Object) this.userRiskMode, (Object) dcaOrderReq.userRiskMode) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) dcaOrderReq.sourceAlgoId) && Intrinsics.EZpvd((Object) this.lever, (Object) dcaOrderReq.lever) && Intrinsics.EZpvd((Object) this.slMode, (Object) dcaOrderReq.slMode) && Intrinsics.EZpvd(this.triggerParams, dcaOrderReq.triggerParams) && Intrinsics.EZpvd((Object) this.initOrdPct, (Object) dcaOrderReq.initOrdPct) && Intrinsics.EZpvd((Object) this.trackingMode, (Object) dcaOrderReq.trackingMode) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) dcaOrderReq.profitSharingRatio) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) dcaOrderReq.totalAmt) && Intrinsics.EZpvd((Object) this.reinvestment, (Object) dcaOrderReq.reinvestment) && this.isToManual == dcaOrderReq.isToManual && this.autoMarginReloadSwitch == dcaOrderReq.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) dcaOrderReq.autoMarginReloadMaxAmount) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) dcaOrderReq.annualizedRate) && Intrinsics.EZpvd((Object) this.instType, (Object) dcaOrderReq.instType) && Intrinsics.EZpvd((Object) this.autoTransfer, (Object) dcaOrderReq.autoTransfer) && Intrinsics.EZpvd((Object) this.ordType, (Object) dcaOrderReq.ordType) && Intrinsics.EZpvd((Object) this.systemSource, (Object) dcaOrderReq.systemSource) && Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) dcaOrderReq.nmpUnderlyingId) && Intrinsics.EZpvd((Object) this.batchNo, (Object) dcaOrderReq.batchNo) && Intrinsics.EZpvd((Object) this.voucherId, (Object) dcaOrderReq.voucherId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) dcaOrderReq.tradeQuoteCcy) && Intrinsics.EZpvd(this.vipProfit, dcaOrderReq.vipProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoMarginReloadMaxAmount() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoMarginReloadSwitch() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoTransfer() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdPct() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentAmt() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingId() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingMode() {
        return this.trackingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserRiskMode() {
        return this.userRiskMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo getVipProfit() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.initOrdAmt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.reserveFunds;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.safetyOrdAmt;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.maxSafetyOrds;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pxSteps;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pxStepsMult;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.volMult;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tpPct;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.slPct;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.direction;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.investType;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.investmentAmt;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.userRiskMode;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.sourceAlgoId;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.lever;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.slMode;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        List<DcaTriggerParam> list = this.triggerParams;
        int iHashCode18 = list == null ? 0 : list.hashCode();
        String str17 = this.initOrdPct;
        int iHashCode19 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.trackingMode;
        int iHashCode20 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.profitSharingRatio;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.totalAmt;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        int iHashCode23 = this.reinvestment.hashCode();
        int iHashCode24 = Boolean.hashCode(this.isToManual);
        int iHashCode25 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str21 = this.autoMarginReloadMaxAmount;
        int iHashCode26 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.annualizedRate;
        int iHashCode27 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.instType;
        int iHashCode28 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.autoTransfer;
        int iHashCode29 = str24 == null ? 0 : str24.hashCode();
        int iHashCode30 = this.ordType.hashCode();
        String str25 = this.systemSource;
        int iHashCode31 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.nmpUnderlyingId;
        int iHashCode32 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.batchNo;
        int iHashCode33 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.voucherId;
        int iHashCode34 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.tradeQuoteCcy;
        int iHashCode35 = str29 == null ? 0 : str29.hashCode();
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (autoVipProfitInfo == null ? 0 : autoVipProfitInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isToManual() {
        return this.isToManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadMaxAmount(String str) {
        this.autoMarginReloadMaxAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadSwitch(boolean z) {
        this.autoMarginReloadSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoTransfer(String str) {
        this.autoTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchNo(String str) {
        this.batchNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrdAmt(String str) {
        this.initOrdAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrdPct(String str) {
        this.initOrdPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(String str) {
        this.investType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentAmt(String str) {
        this.investmentAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(String str) {
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNmpUnderlyingId(String str) {
        this.nmpUnderlyingId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(String str) {
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(String str) {
        this.pxStepsMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reinvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafetyOrdAmt(String str) {
        this.safetyOrdAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(String str) {
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(String str) {
        this.slPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToManual(boolean z) {
        this.isToManual = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(String str) {
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPct(String str) {
        this.tpPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackingMode(String str) {
        this.trackingMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserRiskMode(String str) {
        this.userRiskMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipProfit(AutoVipProfitInfo autoVipProfitInfo) {
        this.vipProfit = autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(String str) {
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherId(String str) {
        this.voucherId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaOrderReq(instId=" + this.instId + ", initOrdAmt=" + this.initOrdAmt + ", reserveFunds=" + this.reserveFunds + ", safetyOrdAmt=" + this.safetyOrdAmt + ", maxSafetyOrds=" + this.maxSafetyOrds + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", direction=" + this.direction + ", investType=" + this.investType + ", investmentAmt=" + this.investmentAmt + ", userRiskMode=" + this.userRiskMode + ", sourceAlgoId=" + this.sourceAlgoId + ", lever=" + this.lever + ", slMode=" + this.slMode + ", triggerParams=" + this.triggerParams + ", initOrdPct=" + this.initOrdPct + ", trackingMode=" + this.trackingMode + ", profitSharingRatio=" + this.profitSharingRatio + ", totalAmt=" + this.totalAmt + ", reinvestment=" + this.reinvestment + ", isToManual=" + this.isToManual + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ", annualizedRate=" + this.annualizedRate + ", instType=" + this.instType + ", autoTransfer=" + this.autoTransfer + ", ordType=" + this.ordType + ", systemSource=" + this.systemSource + ", nmpUnderlyingId=" + this.nmpUnderlyingId + ", batchNo=" + this.batchNo + ", voucherId=" + this.voucherId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", vipProfit=" + this.vipProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.initOrdAmt);
        Boolean bool = this.reserveFunds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.direction);
        parcel.writeString(this.investType);
        parcel.writeString(this.investmentAmt);
        parcel.writeString(this.userRiskMode);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.lever);
        parcel.writeString(this.slMode);
        List<DcaTriggerParam> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (DcaTriggerParam dcaTriggerParam : list) {
                if (dcaTriggerParam == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    dcaTriggerParam.writeToParcel(parcel, i);
                }
            }
        }
        parcel.writeString(this.initOrdPct);
        parcel.writeString(this.trackingMode);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.reinvestment);
        parcel.writeInt(this.isToManual ? 1 : 0);
        parcel.writeInt(this.autoMarginReloadSwitch ? 1 : 0);
        parcel.writeString(this.autoMarginReloadMaxAmount);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.instType);
        parcel.writeString(this.autoTransfer);
        parcel.writeString(this.ordType);
        parcel.writeString(this.systemSource);
        parcel.writeString(this.nmpUnderlyingId);
        parcel.writeString(this.batchNo);
        parcel.writeString(this.voucherId);
        parcel.writeString(this.tradeQuoteCcy);
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        if (autoVipProfitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoVipProfitInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcaOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaOrderReq> serializer() {
            return DcaOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaOrderReq(int i, int i2, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, String str18, String str19, String str20, String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, AutoVipProfitInfo autoVipProfitInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.initOrdAmt = null;
        } else {
            this.initOrdAmt = str2;
        }
        if ((i & 4) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool;
        }
        if ((i & 8) == 0) {
            this.safetyOrdAmt = null;
        } else {
            this.safetyOrdAmt = str3;
        }
        if ((i & 16) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = str4;
        }
        if ((i & 32) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str5;
        }
        if ((i & 64) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str6;
        }
        if ((i & 128) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str7;
        }
        if ((i & 256) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str8;
        }
        if ((i & 512) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str9;
        }
        if ((i & 1024) == 0) {
            this.direction = null;
        } else {
            this.direction = str10;
        }
        if ((i & 2048) == 0) {
            this.investType = null;
        } else {
            this.investType = str11;
        }
        if ((i & 4096) == 0) {
            this.investmentAmt = null;
        } else {
            this.investmentAmt = str12;
        }
        if ((i & 8192) == 0) {
            this.userRiskMode = null;
        } else {
            this.userRiskMode = str13;
        }
        if ((i & 16384) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str14;
        }
        if ((32768 & i) == 0) {
            this.lever = null;
        } else {
            this.lever = str15;
        }
        if ((65536 & i) == 0) {
            this.slMode = null;
        } else {
            this.slMode = str16;
        }
        if ((131072 & i) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
        if ((262144 & i) == 0) {
            this.initOrdPct = null;
        } else {
            this.initOrdPct = str17;
        }
        if ((524288 & i) == 0) {
            this.trackingMode = null;
        } else {
            this.trackingMode = str18;
        }
        if ((1048576 & i) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str19;
        }
        if ((2097152 & i) == 0) {
            this.totalAmt = null;
        } else {
            this.totalAmt = str20;
        }
        this.reinvestment = (4194304 & i) == 0 ? "false" : str21;
        if ((8388608 & i) == 0) {
            this.isToManual = false;
        } else {
            this.isToManual = z;
        }
        this.autoMarginReloadSwitch = (16777216 & i) != 0 ? z2 : false;
        if ((33554432 & i) == 0) {
            this.autoMarginReloadMaxAmount = null;
        } else {
            this.autoMarginReloadMaxAmount = str22;
        }
        if ((67108864 & i) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str23;
        }
        if ((134217728 & i) == 0) {
            this.instType = null;
        } else {
            this.instType = str24;
        }
        if ((268435456 & i) == 0) {
            this.autoTransfer = null;
        } else {
            this.autoTransfer = str25;
        }
        this.ordType = (536870912 & i) == 0 ? "" : str26;
        if ((1073741824 & i) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str27;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nmpUnderlyingId = null;
        } else {
            this.nmpUnderlyingId = str28;
        }
        if ((i2 & 1) == 0) {
            this.batchNo = null;
        } else {
            this.batchNo = str29;
        }
        if ((i2 & 2) == 0) {
            this.voucherId = null;
        } else {
            this.voucherId = str30;
        }
        if ((i2 & 4) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str31;
        }
        if ((i2 & 8) == 0) {
            this.vipProfit = null;
        } else {
            this.vipProfit = autoVipProfitInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcaOrderReq dcaOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcaOrderReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dcaOrderReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dcaOrderReq.initOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dcaOrderReq.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcaOrderReq.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, dcaOrderReq.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dcaOrderReq.safetyOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dcaOrderReq.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dcaOrderReq.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dcaOrderReq.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dcaOrderReq.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dcaOrderReq.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dcaOrderReq.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dcaOrderReq.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dcaOrderReq.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dcaOrderReq.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dcaOrderReq.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, dcaOrderReq.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dcaOrderReq.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dcaOrderReq.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dcaOrderReq.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, dcaOrderReq.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || dcaOrderReq.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, dcaOrderReq.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || dcaOrderReq.investmentAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, dcaOrderReq.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dcaOrderReq.userRiskMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dcaOrderReq.userRiskMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dcaOrderReq.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, dcaOrderReq.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dcaOrderReq.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, dcaOrderReq.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || dcaOrderReq.slMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, dcaOrderReq.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || dcaOrderReq.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], dcaOrderReq.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || dcaOrderReq.initOrdPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, dcaOrderReq.initOrdPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || dcaOrderReq.trackingMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, dcaOrderReq.trackingMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || dcaOrderReq.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, dcaOrderReq.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || dcaOrderReq.totalAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, dcaOrderReq.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) dcaOrderReq.reinvestment, (Object) "false")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, dcaOrderReq.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || dcaOrderReq.isToManual) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, dcaOrderReq.isToManual);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || dcaOrderReq.autoMarginReloadSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, dcaOrderReq.autoMarginReloadSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || dcaOrderReq.autoMarginReloadMaxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, dcaOrderReq.autoMarginReloadMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || dcaOrderReq.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, dcaOrderReq.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || dcaOrderReq.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, dcaOrderReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || dcaOrderReq.autoTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, dcaOrderReq.autoTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) dcaOrderReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, dcaOrderReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || dcaOrderReq.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, dcaOrderReq.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || dcaOrderReq.nmpUnderlyingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, dcaOrderReq.nmpUnderlyingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || dcaOrderReq.batchNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, dcaOrderReq.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || dcaOrderReq.voucherId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, dcaOrderReq.voucherId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || dcaOrderReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, dcaOrderReq.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && dcaOrderReq.vipProfit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, AutoVipProfitInfo$$serializer.INSTANCE, dcaOrderReq.vipProfit);
    }

    public DcaOrderReq(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<DcaTriggerParam> list, String str17, String str18, String str19, String str20, @NotNull String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, @NotNull String str26, String str27, String str28, String str29, String str30, String str31, AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str26, "");
        this.instId = str;
        this.initOrdAmt = str2;
        this.reserveFunds = bool;
        this.safetyOrdAmt = str3;
        this.maxSafetyOrds = str4;
        this.pxSteps = str5;
        this.pxStepsMult = str6;
        this.volMult = str7;
        this.tpPct = str8;
        this.slPct = str9;
        this.direction = str10;
        this.investType = str11;
        this.investmentAmt = str12;
        this.userRiskMode = str13;
        this.sourceAlgoId = str14;
        this.lever = str15;
        this.slMode = str16;
        this.triggerParams = list;
        this.initOrdPct = str17;
        this.trackingMode = str18;
        this.profitSharingRatio = str19;
        this.totalAmt = str20;
        this.reinvestment = str21;
        this.isToManual = z;
        this.autoMarginReloadSwitch = z2;
        this.autoMarginReloadMaxAmount = str22;
        this.annualizedRate = str23;
        this.instType = str24;
        this.autoTransfer = str25;
        this.ordType = str26;
        this.systemSource = str27;
        this.nmpUnderlyingId = str28;
        this.batchNo = str29;
        this.voucherId = str30;
        this.tradeQuoteCcy = str31;
        this.vipProfit = autoVipProfitInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a3: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0093: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r54v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("false") : (r59v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) == (0 int)) ? (r61v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0135: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013e: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.AutoVipProfitInfo:?: TERNARY null = ((wrap:int:0x0150: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.AutoVipProfitInfo) : (r72v0 com.okinc.unify_trade.biz.AutoVipProfitInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.AutoVipProfitInfo):void (m)] (LINE:655) call: com.okinc.unify_trade.biz.DcaOrderReq.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.AutoVipProfitInfo):void type: THIS */
    public /* synthetic */ DcaOrderReq(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, String str18, String str19, String str20, String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, AutoVipProfitInfo autoVipProfitInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : list, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? null : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? "false" : str21, (i & 8388608) != 0 ? false : z, (i & 16777216) == 0 ? z2 : false, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str22, (i & 67108864) != 0 ? null : str23, (i & 134217728) != 0 ? null : str24, (i & 268435456) != 0 ? null : str25, (i & 536870912) != 0 ? "" : str26, (i & 1073741824) != 0 ? null : str27, (i & Integer.MIN_VALUE) != 0 ? null : str28, (i2 & 1) != 0 ? null : str29, (i2 & 2) != 0 ? null : str30, (i2 & 4) != 0 ? null : str31, (i2 & 8) != 0 ? null : autoVipProfitInfo);
    }
}
