package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MpStgyParam implements Parcelable {
    private String actualMarginSz;
    private String algoId;
    private String algoOrdType;
    private Boolean autoReserve;
    private String balType;
    private boolean basePos;
    private String cTime;
    private String completedCycles;
    private String copyType;
    private String deltaRatio;
    private String direction;
    private Integer displayDigits;
    private String extraMarginSz;
    private String floatProfit;
    private String gridNum;
    private String instId;
    private String instType;
    private String interval;
    private String investCcy;
    private String investment;
    private String investmentCcy;
    private String lever;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private String openPosSlippage;
    private Boolean openPosSlippageDefault;
    private String ordType;
    private String pTime;
    private String perGridProfitRatio;
    private String period;
    private String pnlCcy;
    private ArrayList<SmartPortfolioListItem> portfolioList;
    private String priceRangeCcy;
    private String profitSharingRatio;
    private String pxSteps;
    private String pxStepsMult;
    private String recurringDay;
    private String recurringHour;
    private ArrayList<RecurringListItem> recurringList;
    private String recurringTime;
    private Boolean reserveFunds;
    private String runPx;
    private String runType;
    private String safetyOrdRatio;
    private List<SignParamItem> signParams;
    private String slMode;
    private String slPct;
    private String slRatio;
    private String slTriggerPx;
    private String sourceCcy;
    private String stgyName;
    private String stopType;
    private String sz;
    private String totalPnl;
    private String tpPct;
    private String tpRatio;
    private String tpTriggerPx;
    private TpSlTriggerParamReqResp tpslTriggerParamResp;
    private String trackingMode;
    private final String tradeQuoteCcy;
    private TrailingConfig trailingDownConfig;
    private TrailingConfig trailingUpConfig;
    private List<DcaTriggerParam> triggerParams;
    private String triggerPx;
    private String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpStgyParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RecurringListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartPortfolioListItem$$serializer.INSTANCE), new ArrayListSerializer(SignParamItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MpStgyParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            TpSlTriggerParamReqResp tpSlTriggerParamReqRespCreateFromParcel = TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel);
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            int i = parcel.readInt();
            boolean z2 = z;
            ArrayList arrayList5 = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList5.add(RecurringListItem.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList6.add(SmartPortfolioListItem.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            if (parcel.readInt() == 0) {
                arrayList = arrayList6;
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i5);
                arrayList = arrayList6;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList7.add(SignParamItem.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string34 = parcel.readString();
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            TrailingConfig trailingConfigCreateFromParcel2 = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            String string46 = parcel.readString();
            String string47 = parcel.readString();
            String string48 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i7);
                arrayList3 = arrayList2;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList8.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList4 = arrayList8;
            }
            return new MpStgyParam(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, tpSlTriggerParamReqRespCreateFromParcel, string17, string18, z2, string19, string20, string21, string22, string23, string24, arrayList5, string25, string26, string27, string28, string29, string30, string31, string32, string33, arrayList, arrayList3, boolValueOf, string34, trailingConfigCreateFromParcel, trailingConfigCreateFromParcel2, boolValueOf2, string35, string36, string37, string38, boolValueOf3, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyParam[] newArray(int i) {
            return new MpStgyParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpStgyParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (List) null, (Boolean) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, -1, -1, 3, (DefaultConstructorMarker) null);
    }

    @SerialName("tpslTriggerParam")
    public static /* synthetic */ void getTpslTriggerParamResp$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyType() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatio() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayDigits() {
        return this.displayDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfit() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
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
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentCcy() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPosSlippage() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOpenPosSlippageDefault() {
        return this.openPosSlippageDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartPortfolioListItem> getPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceRangeCcy() {
        return this.priceRangeCcy;
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
    public final String getRecurringDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringHour() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> getRecurringList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTime() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunPx() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdRatio() {
        return this.safetyOrdRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignParamItem> getSignParams() {
        return this.signParams;
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
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParamResp() {
        return this.tpslTriggerParamResp;
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
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(String str) {
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoReserve(Boolean bool) {
        this.autoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePos(boolean z) {
        this.basePos = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayDigits(Integer num) {
        this.displayDigits = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(String str) {
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFloatProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.floatProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippage(String str) {
        this.openPosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippageDefault(Boolean bool) {
        this.openPosSlippageDefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerGridProfitRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlCcy(String str) {
        this.pnlCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortfolioList(@NotNull ArrayList<SmartPortfolioListItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.portfolioList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceRangeCcy(String str) {
        this.priceRangeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxStepsMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringHour(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringHour = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringList(@NotNull ArrayList<RecurringListItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.recurringList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafetyOrdRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.safetyOrdRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(List<SignParamItem> list) {
        this.signParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(String str) {
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcy(String str) {
        this.sourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(String str) {
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParamResp(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackingMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trackingMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownConfig(TrailingConfig trailingConfig) {
        this.trailingDownConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpConfig(TrailingConfig trailingConfig) {
        this.trailingUpConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.ordType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pTime);
        parcel.writeString(this.instType);
        parcel.writeString(this.investment);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.instId);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.runType);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        this.tpslTriggerParamResp.writeToParcel(parcel, i);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.lever);
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.direction);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.period);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.recurringTime);
        parcel.writeString(this.recurringHour);
        ArrayList<RecurringListItem> arrayList = this.recurringList;
        parcel.writeInt(arrayList.size());
        Iterator<RecurringListItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.stgyName);
        parcel.writeString(this.floatProfit);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.trackingMode);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.runPx);
        parcel.writeString(this.balType);
        parcel.writeString(this.interval);
        parcel.writeString(this.deltaRatio);
        ArrayList<SmartPortfolioListItem> arrayList2 = this.portfolioList;
        parcel.writeInt(arrayList2.size());
        Iterator<SmartPortfolioListItem> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<SignParamItem> list = this.signParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SignParamItem> it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.reserveFunds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.stopType);
        TrailingConfig trailingConfig = this.trailingUpConfig;
        if (trailingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig.writeToParcel(parcel, i);
        }
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        if (trailingConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig2.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.autoReserve;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.sz);
        parcel.writeString(this.openPosSlippage);
        Boolean bool3 = this.openPosSlippageDefault;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.safetyOrdRatio);
        parcel.writeString(this.volMult);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.investmentCcy);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.slPct);
        parcel.writeString(this.slMode);
        parcel.writeString(this.completedCycles);
        List<DcaTriggerParam> list2 = this.triggerParams;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DcaTriggerParam> it4 = list2.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.copyType);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.priceRangeCcy);
        Integer num = this.displayDigits;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.triggerPx);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MpStgyParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpStgyParam> serializer() {
            return MpStgyParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpStgyParam(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, ArrayList arrayList, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, ArrayList arrayList2, List list, Boolean bool, String str34, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, Boolean bool2, String str35, String str36, String str37, String str38, Boolean bool3, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, List list2, String str49, String str50, String str51, String str52, Integer num, String str53, String str54, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str2;
        }
        if ((i & 4) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str3;
        }
        if ((i & 8) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str4;
        }
        if ((i & 16) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str5;
        }
        if ((i & 32) == 0) {
            this.instType = "";
        } else {
            this.instType = str6;
        }
        if ((i & 64) == 0) {
            this.investment = "";
        } else {
            this.investment = str7;
        }
        if ((i & 128) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str8;
        }
        if ((i & 256) == 0) {
            this.instId = "";
        } else {
            this.instId = str9;
        }
        if ((i & 512) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str10;
        }
        if ((i & 1024) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str11;
        }
        if ((i & 2048) == 0) {
            this.runType = "";
        } else {
            this.runType = str12;
        }
        if ((i & 4096) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str13;
        }
        if ((i & 8192) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str14;
        }
        if ((i & 16384) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str15;
        }
        if ((i & 32768) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str16;
        }
        this.tpslTriggerParamResp = (i & 65536) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((i & 131072) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str17;
        }
        if ((i & 262144) == 0) {
            this.lever = "";
        } else {
            this.lever = str18;
        }
        this.basePos = (i & 524288) == 0 ? false : z;
        if ((1048576 & i) == 0) {
            this.direction = "";
        } else {
            this.direction = str19;
        }
        if ((2097152 & i) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str20;
        }
        if ((4194304 & i) == 0) {
            this.period = "";
        } else {
            this.period = str21;
        }
        if ((8388608 & i) == 0) {
            this.recurringDay = "";
        } else {
            this.recurringDay = str22;
        }
        if ((16777216 & i) == 0) {
            this.recurringTime = "";
        } else {
            this.recurringTime = str23;
        }
        if ((33554432 & i) == 0) {
            this.recurringHour = "";
        } else {
            this.recurringHour = str24;
        }
        this.recurringList = (67108864 & i) == 0 ? new ArrayList() : arrayList;
        if ((134217728 & i) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str25;
        }
        if ((268435456 & i) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str26;
        }
        if ((536870912 & i) == 0) {
            this.profitSharingRatio = "";
        } else {
            this.profitSharingRatio = str27;
        }
        if ((1073741824 & i) == 0) {
            this.trackingMode = "";
        } else {
            this.trackingMode = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str29;
        }
        if ((i2 & 1) == 0) {
            this.runPx = "";
        } else {
            this.runPx = str30;
        }
        if ((i2 & 2) == 0) {
            this.balType = "";
        } else {
            this.balType = str31;
        }
        if ((i2 & 4) == 0) {
            this.interval = "";
        } else {
            this.interval = str32;
        }
        if ((i2 & 8) == 0) {
            this.deltaRatio = "";
        } else {
            this.deltaRatio = str33;
        }
        this.portfolioList = (i2 & 16) == 0 ? new ArrayList() : arrayList2;
        if ((i2 & 32) == 0) {
            this.signParams = null;
        } else {
            this.signParams = list;
        }
        if ((i2 & 64) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool;
        }
        if ((i2 & 128) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str34;
        }
        if ((i2 & 256) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((i2 & 512) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        this.autoReserve = (i2 & 1024) == 0 ? Boolean.TRUE : bool2;
        if ((i2 & 2048) == 0) {
            this.actualMarginSz = null;
        } else {
            this.actualMarginSz = str35;
        }
        if ((i2 & 4096) == 0) {
            this.extraMarginSz = null;
        } else {
            this.extraMarginSz = str36;
        }
        if ((i2 & 8192) == 0) {
            this.sz = "";
        } else {
            this.sz = str37;
        }
        if ((i2 & 16384) == 0) {
            this.openPosSlippage = null;
        } else {
            this.openPosSlippage = str38;
        }
        this.openPosSlippageDefault = (i2 & 32768) == 0 ? Boolean.TRUE : bool3;
        if ((i2 & 65536) == 0) {
            this.pxStepsMult = "";
        } else {
            this.pxStepsMult = str39;
        }
        if ((i2 & 131072) == 0) {
            this.safetyOrdRatio = "";
        } else {
            this.safetyOrdRatio = str40;
        }
        if ((i2 & 262144) == 0) {
            this.volMult = "";
        } else {
            this.volMult = str41;
        }
        if ((i2 & 524288) == 0) {
            this.pxSteps = "";
        } else {
            this.pxSteps = str42;
        }
        if ((1048576 & i2) == 0) {
            this.tpPct = "";
        } else {
            this.tpPct = str43;
        }
        if ((2097152 & i2) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str44;
        }
        if ((4194304 & i2) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str45;
        }
        if ((8388608 & i2) == 0) {
            this.slPct = "";
        } else {
            this.slPct = str46;
        }
        if ((16777216 & i2) == 0) {
            this.slMode = "";
        } else {
            this.slMode = str47;
        }
        if ((33554432 & i2) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str48;
        }
        if ((67108864 & i2) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((134217728 & i2) == 0) {
            this.perGridProfitRatio = "";
        } else {
            this.perGridProfitRatio = str49;
        }
        if ((268435456 & i2) == 0) {
            this.copyType = "";
        } else {
            this.copyType = str50;
        }
        if ((536870912 & i2) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str51;
        }
        if ((1073741824 & i2) == 0) {
            this.priceRangeCcy = "";
        } else {
            this.priceRangeCcy = str52;
        }
        this.displayDigits = (Integer.MIN_VALUE & i2) == 0 ? 2 : num;
        if ((i3 & 1) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str53;
        }
        if ((i3 & 2) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str54;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3082=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MpStgyParam mpStgyParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mpStgyParam.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mpStgyParam.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mpStgyParam.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mpStgyParam.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) mpStgyParam.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, mpStgyParam.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) mpStgyParam.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, mpStgyParam.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) mpStgyParam.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, mpStgyParam.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) mpStgyParam.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, mpStgyParam.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) mpStgyParam.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, mpStgyParam.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) mpStgyParam.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, mpStgyParam.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) mpStgyParam.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, mpStgyParam.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) mpStgyParam.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, mpStgyParam.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) mpStgyParam.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, mpStgyParam.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) mpStgyParam.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, mpStgyParam.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) mpStgyParam.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, mpStgyParam.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) mpStgyParam.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, mpStgyParam.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || mpStgyParam.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, mpStgyParam.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || mpStgyParam.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, mpStgyParam.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(mpStgyParam.tpslTriggerParamResp, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, TpSlTriggerParamReqResp$$serializer.INSTANCE, mpStgyParam.tpslTriggerParamResp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || mpStgyParam.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, mpStgyParam.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) mpStgyParam.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, mpStgyParam.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || mpStgyParam.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, mpStgyParam.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) mpStgyParam.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, mpStgyParam.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) mpStgyParam.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, mpStgyParam.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) mpStgyParam.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, mpStgyParam.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) mpStgyParam.recurringDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, mpStgyParam.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) mpStgyParam.recurringTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, mpStgyParam.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) mpStgyParam.recurringHour, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, mpStgyParam.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd(mpStgyParam.recurringList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], mpStgyParam.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) mpStgyParam.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, mpStgyParam.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) mpStgyParam.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, mpStgyParam.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) mpStgyParam.profitSharingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, mpStgyParam.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) mpStgyParam.trackingMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, mpStgyParam.trackingMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) mpStgyParam.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, mpStgyParam.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) mpStgyParam.runPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, mpStgyParam.runPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) mpStgyParam.balType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, mpStgyParam.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) mpStgyParam.interval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, mpStgyParam.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) mpStgyParam.deltaRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, mpStgyParam.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd(mpStgyParam.portfolioList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], mpStgyParam.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || mpStgyParam.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, kSerializerArr[37], mpStgyParam.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || mpStgyParam.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, mpStgyParam.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || mpStgyParam.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, mpStgyParam.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || mpStgyParam.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, TrailingConfig$$serializer.INSTANCE, mpStgyParam.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || mpStgyParam.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, TrailingConfig$$serializer.INSTANCE, mpStgyParam.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd(mpStgyParam.autoReserve, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, BooleanSerializer.INSTANCE, mpStgyParam.autoReserve);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || mpStgyParam.actualMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, mpStgyParam.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || mpStgyParam.extraMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, mpStgyParam.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) mpStgyParam.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, mpStgyParam.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || mpStgyParam.openPosSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, mpStgyParam.openPosSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd(mpStgyParam.openPosSlippageDefault, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, BooleanSerializer.INSTANCE, mpStgyParam.openPosSlippageDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) mpStgyParam.pxStepsMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, mpStgyParam.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) mpStgyParam.safetyOrdRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, mpStgyParam.safetyOrdRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) mpStgyParam.volMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, mpStgyParam.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) mpStgyParam.pxSteps, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, mpStgyParam.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) mpStgyParam.tpPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, mpStgyParam.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) mpStgyParam.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, mpStgyParam.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) mpStgyParam.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, mpStgyParam.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) mpStgyParam.slPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, mpStgyParam.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) mpStgyParam.slMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, mpStgyParam.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) mpStgyParam.completedCycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, mpStgyParam.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || mpStgyParam.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, kSerializerArr[58], mpStgyParam.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) mpStgyParam.perGridProfitRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, mpStgyParam.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) mpStgyParam.copyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, mpStgyParam.copyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) mpStgyParam.pnlCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, StringSerializer.INSTANCE, mpStgyParam.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) mpStgyParam.priceRangeCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, mpStgyParam.priceRangeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || (num = mpStgyParam.displayDigits) == null || num.intValue() != 2) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, IntSerializer.INSTANCE, mpStgyParam.displayDigits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || mpStgyParam.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, mpStgyParam.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) && Intrinsics.EZpvd((Object) mpStgyParam.triggerPx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 65, mpStgyParam.triggerPx);
    }

    public MpStgyParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, String str16, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str17, @NotNull String str18, boolean z, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull ArrayList<SmartPortfolioListItem> arrayList2, List<SignParamItem> list, Boolean bool, String str34, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, Boolean bool2, String str35, String str36, @NotNull String str37, String str38, Boolean bool3, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, List<DcaTriggerParam> list2, @NotNull String str49, @NotNull String str50, String str51, String str52, Integer num, String str53, @NotNull String str54) {
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str54, "");
        this.algoId = str;
        this.algoOrdType = str2;
        this.ordType = str3;
        this.cTime = str4;
        this.pTime = str5;
        this.instType = str6;
        this.investment = str7;
        this.gridNum = str8;
        this.instId = str9;
        this.maxPx = str10;
        this.minPx = str11;
        this.runType = str12;
        this.tpTriggerPx = str13;
        this.slTriggerPx = str14;
        this.tpRatio = str15;
        this.slRatio = str16;
        this.tpslTriggerParamResp = tpSlTriggerParamReqResp;
        this.sourceCcy = str17;
        this.lever = str18;
        this.basePos = z;
        this.direction = str19;
        this.investCcy = str20;
        this.period = str21;
        this.recurringDay = str22;
        this.recurringTime = str23;
        this.recurringHour = str24;
        this.recurringList = arrayList;
        this.stgyName = str25;
        this.floatProfit = str26;
        this.profitSharingRatio = str27;
        this.trackingMode = str28;
        this.totalPnl = str29;
        this.runPx = str30;
        this.balType = str31;
        this.interval = str32;
        this.deltaRatio = str33;
        this.portfolioList = arrayList2;
        this.signParams = list;
        this.reserveFunds = bool;
        this.stopType = str34;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.autoReserve = bool2;
        this.actualMarginSz = str35;
        this.extraMarginSz = str36;
        this.sz = str37;
        this.openPosSlippage = str38;
        this.openPosSlippageDefault = bool3;
        this.pxStepsMult = str39;
        this.safetyOrdRatio = str40;
        this.volMult = str41;
        this.pxSteps = str42;
        this.tpPct = str43;
        this.investmentCcy = str44;
        this.maxSafetyOrds = str45;
        this.slPct = str46;
        this.slMode = str47;
        this.completedCycles = str48;
        this.triggerParams = list2;
        this.perGridProfitRatio = str49;
        this.copyType = str50;
        this.pnlCcy = str51;
        this.priceRangeCcy = str52;
        this.displayDigits = num;
        this.tradeQuoteCcy = str53;
        this.triggerPx = str54;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0343: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r133v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r133v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r133v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r133v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r133v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r133v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r133v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r133v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r133v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r133v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r133v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r133v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r133v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r133v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r133v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r133v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:?: TERNARY null = ((wrap:int:0x0094: ARITH (r133v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b0: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.ArrayList:?: CAST (java.util.ArrayList) (null java.util.ArrayList))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:3103) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r83v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r133v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r133v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r133v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r86v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r133v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r133v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r133v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r133v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r133v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0110: ARITH (r133v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x011b: ARITH (r133v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0121: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3113) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r93v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r133v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r133v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r133v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014a: ARITH (r133v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0155: ARITH (r133v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015e: ARITH (r134v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0167: ARITH (r134v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0170: ARITH (r134v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0179: ARITH (r134v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0182: ARITH (r134v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0188: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3123) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r103v0 java.util.ArrayList))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x018e: ARITH (r134v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r104v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0197: ARITH (r134v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r105v0 java.lang.Boolean))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r134v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r106v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r134v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r107v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r134v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r108v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:java.lang.Boolean:0x01cc: TERNARY null = ((wrap:int:0x01c3: ARITH (r134v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01c7: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r109v0 java.lang.Boolean))
  (wrap:java.lang.String:0x01d7: TERNARY null = ((wrap:int:0x01ce: ARITH (r134v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r110v0 java.lang.String))
  (wrap:java.lang.String:0x01e2: TERNARY null = ((wrap:int:0x01d9: ARITH (r134v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r111v0 java.lang.String))
  (wrap:java.lang.String:0x01ed: TERNARY null = ((wrap:int:0x01e4: ARITH (r134v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ef: ARITH (r134v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r113v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01f8: ARITH (r134v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01fc: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r114v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0201: ARITH (r134v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x020a: ARITH (r134v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0213: ARITH (r134v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x021c: ARITH (r134v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0227: ARITH (r134v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0232: ARITH (r134v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023d: ARITH (r134v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0248: ARITH (r134v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0253: ARITH (r134v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025e: ARITH (r134v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0269: ARITH (r134v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r125v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0274: ARITH (r134v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x027f: ARITH (r134v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x028a: ARITH (r134v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r128v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0295: ARITH (r134v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r129v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x02a0: ARITH (r134v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (2 int) : (r130v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02ad: ARITH (r135v0 int) & (1 int) A[WRAPPED]) == (0 int)) ? (r131v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02b4: ARITH (r135v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r132v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.RecurringListItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.SmartPortfolioListItem>, java.util.List<com.okinc.unify_trade.biz.SignParamItem>, java.lang.Boolean, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:3085) call: com.okinc.unify_trade.biz.MpStgyParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.List, java.lang.Boolean, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MpStgyParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, ArrayList arrayList, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, ArrayList arrayList2, List list, Boolean bool, String str34, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, Boolean bool2, String str35, String str36, String str37, String str38, Boolean bool3, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, List list2, String str49, String str50, String str51, String str52, Integer num, String str53, String str54, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? false : z, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? new ArrayList() : arrayList, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? "" : str26, (i & 536870912) != 0 ? "" : str27, (i & 1073741824) != 0 ? "" : str28, (i & Integer.MIN_VALUE) != 0 ? "" : str29, (i2 & 1) != 0 ? "" : str30, (i2 & 2) != 0 ? "" : str31, (i2 & 4) != 0 ? "" : str32, (i2 & 8) != 0 ? "" : str33, (i2 & 16) != 0 ? new ArrayList() : arrayList2, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : str34, (i2 & 256) != 0 ? null : trailingConfig, (i2 & 512) != 0 ? null : trailingConfig2, (i2 & 1024) != 0 ? Boolean.TRUE : bool2, (i2 & 2048) != 0 ? null : str35, (i2 & 4096) != 0 ? null : str36, (i2 & 8192) != 0 ? "" : str37, (i2 & 16384) != 0 ? null : str38, (i2 & 32768) != 0 ? Boolean.TRUE : bool3, (i2 & 65536) != 0 ? "" : str39, (i2 & 131072) != 0 ? "" : str40, (i2 & 262144) != 0 ? "" : str41, (i2 & 524288) != 0 ? "" : str42, (i2 & 1048576) != 0 ? "" : str43, (i2 & 2097152) != 0 ? "" : str44, (i2 & 4194304) != 0 ? "" : str45, (i2 & 8388608) != 0 ? "" : str46, (i2 & 16777216) != 0 ? "" : str47, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str48, (i2 & 67108864) != 0 ? null : list2, (i2 & 134217728) != 0 ? "" : str49, (i2 & 268435456) != 0 ? "" : str50, (i2 & 536870912) != 0 ? "" : str51, (i2 & 1073741824) != 0 ? "" : str52, (i2 & Integer.MIN_VALUE) != 0 ? 2 : num, (i3 & 1) == 0 ? str53 : null, (i3 & 2) != 0 ? "" : str54);
    }
}
