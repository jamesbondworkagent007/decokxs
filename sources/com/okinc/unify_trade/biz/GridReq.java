package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC55792xqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridReq implements Parcelable, InterfaceC55792xqd {
    private String annualizedRate;
    private String autoTransfer;
    private String baseSz;
    private String batchNo;
    private String duration;
    private SmartEarnRequestParam earnParam;
    private String gridNum;
    private String instId;
    private String instType;
    private String investSymbol;
    private String investType;
    private String marketPx;
    private String maxPx;
    private String minPx;
    private String nmpUnderlyingId;
    private String ordType;
    private String perGridProfitRatio;
    private ProfitAutoReinvestParam profitAutoReinvestParam;
    private String profitSharingRatio;
    private String pxLimit;
    private String quoteSz;
    private Boolean reserveFunds;
    private String runType;
    private ArrayList<AdvancedTriggerSign> signParams;
    private String slOrdPx;
    private String slTriggerPx;
    private String sourceCcy;
    private String sourceCcySz;
    private String systemSource;
    private String tpOrdPx;
    private String tpTriggerPx;
    private TpSlTriggerParamReqResp tpslTriggerParamReq;
    private String tradeQuoteCcy;
    private TrailingConfig trailingDownConfig;
    private TrailingConfig trailingUpConfig;
    private String voucherId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GridReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AdvancedTriggerSign$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<GridReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
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
            TpSlTriggerParamReqResp tpSlTriggerParamReqRespCreateFromParcel = parcel.readInt() == 0 ? null : TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(AdvancedTriggerSign.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GridReq(string, string2, string3, string4, string5, string6, string7, string8, string9, tpSlTriggerParamReqRespCreateFromParcel, string10, string11, string12, arrayList, boolValueOf, parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SmartEarnRequestParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitAutoReinvestParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridReq[] newArray(int i) {
            return new GridReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
    }

    @SerialName("tpslTriggerParam")
    public static /* synthetic */ void getTpslTriggerParamReq$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component10() {
        return this.tpslTriggerParamReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> component14() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component16() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component17() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.investSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.marketPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnRequestParam component32() {
        return this.earnParam;
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
    public final ProfitAutoReinvestParam component36() {
        return this.profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, String str9, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str10, String str11, String str12, @NotNull ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, String str19, String str20, String str21, @NotNull String str22, String str23, String str24, String str25, String str26, SmartEarnRequestParam smartEarnRequestParam, String str27, String str28, String str29, ProfitAutoReinvestParam profitAutoReinvestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new GridReq(str, str2, str3, str4, str5, str6, str7, str8, str9, tpSlTriggerParamReqResp, str10, str11, str12, arrayList, bool, trailingConfig, trailingConfig2, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, smartEarnRequestParam, str27, str28, str29, profitAutoReinvestParam);
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
        if (!(obj instanceof GridReq)) {
            return false;
        }
        GridReq gridReq = (GridReq) obj;
        return Intrinsics.EZpvd((Object) this.maxPx, (Object) gridReq.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) gridReq.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) gridReq.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) gridReq.runType) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) gridReq.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) gridReq.baseSz) && Intrinsics.EZpvd((Object) this.investType, (Object) gridReq.investType) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) gridReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) gridReq.slTriggerPx) && Intrinsics.EZpvd(this.tpslTriggerParamReq, gridReq.tpslTriggerParamReq) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) gridReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) gridReq.slOrdPx) && Intrinsics.EZpvd((Object) this.duration, (Object) gridReq.duration) && Intrinsics.EZpvd(this.signParams, gridReq.signParams) && Intrinsics.EZpvd(this.reserveFunds, gridReq.reserveFunds) && Intrinsics.EZpvd(this.trailingUpConfig, gridReq.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, gridReq.trailingDownConfig) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) gridReq.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) gridReq.pxLimit) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) gridReq.profitSharingRatio) && Intrinsics.EZpvd((Object) this.instId, (Object) gridReq.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) gridReq.instType) && Intrinsics.EZpvd((Object) this.ordType, (Object) gridReq.ordType) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) gridReq.annualizedRate) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) gridReq.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) gridReq.sourceCcySz) && Intrinsics.EZpvd((Object) this.investSymbol, (Object) gridReq.investSymbol) && Intrinsics.EZpvd((Object) this.autoTransfer, (Object) gridReq.autoTransfer) && Intrinsics.EZpvd((Object) this.marketPx, (Object) gridReq.marketPx) && Intrinsics.EZpvd((Object) this.systemSource, (Object) gridReq.systemSource) && Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) gridReq.nmpUnderlyingId) && Intrinsics.EZpvd(this.earnParam, gridReq.earnParam) && Intrinsics.EZpvd((Object) this.batchNo, (Object) gridReq.batchNo) && Intrinsics.EZpvd((Object) this.voucherId, (Object) gridReq.voucherId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) gridReq.tradeQuoteCcy) && Intrinsics.EZpvd(this.profitAutoReinvestParam, gridReq.profitAutoReinvestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoTransfer() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnRequestParam getEarnParam() {
        return this.earnParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55792xqd
    public String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55792xqd
    public String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestSymbol() {
        return this.investSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketPx() {
        return this.marketPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
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
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitAutoReinvestParam getProfitAutoReinvestParam() {
        return this.profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
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
    public final String getSourceCcySz() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParamReq() {
        return this.tpslTriggerParamReq;
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
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.maxPx.hashCode();
        int iHashCode2 = this.minPx.hashCode();
        int iHashCode3 = this.gridNum.hashCode();
        String str = this.runType;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.quoteSz;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.baseSz;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.investType;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tpTriggerPx;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slTriggerPx;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParamReq;
        int iHashCode10 = tpSlTriggerParamReqResp == null ? 0 : tpSlTriggerParamReqResp.hashCode();
        String str7 = this.tpOrdPx;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.slOrdPx;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.duration;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        int iHashCode14 = this.signParams.hashCode();
        Boolean bool = this.reserveFunds;
        int iHashCode15 = bool == null ? 0 : bool.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode16 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode17 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str10 = this.perGridProfitRatio;
        int iHashCode18 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pxLimit;
        int iHashCode19 = str11 == null ? 0 : str11.hashCode();
        int iHashCode20 = this.profitSharingRatio.hashCode();
        int iHashCode21 = this.instId.hashCode();
        int iHashCode22 = this.instType.hashCode();
        int iHashCode23 = this.ordType.hashCode();
        String str12 = this.annualizedRate;
        int iHashCode24 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.sourceCcy;
        int iHashCode25 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.sourceCcySz;
        int iHashCode26 = str14 == null ? 0 : str14.hashCode();
        int iHashCode27 = this.investSymbol.hashCode();
        String str15 = this.autoTransfer;
        int iHashCode28 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.marketPx;
        int iHashCode29 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.systemSource;
        int iHashCode30 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.nmpUnderlyingId;
        int iHashCode31 = str18 == null ? 0 : str18.hashCode();
        SmartEarnRequestParam smartEarnRequestParam = this.earnParam;
        int iHashCode32 = smartEarnRequestParam == null ? 0 : smartEarnRequestParam.hashCode();
        String str19 = this.batchNo;
        int iHashCode33 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.voucherId;
        int iHashCode34 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.tradeQuoteCcy;
        int iHashCode35 = str21 == null ? 0 : str21.hashCode();
        ProfitAutoReinvestParam profitAutoReinvestParam = this.profitAutoReinvestParam;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (profitAutoReinvestParam == null ? 0 : profitAutoReinvestParam.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoTransfer(String str) {
        this.autoTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(String str) {
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchNo(String str) {
        this.batchNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(String str) {
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnParam(SmartEarnRequestParam smartEarnRequestParam) {
        this.earnParam = smartEarnRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(String str) {
        this.investType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketPx(String str) {
        this.marketPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
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
    public final void setPerGridProfitRatio(String str) {
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitAutoReinvestParam(ProfitAutoReinvestParam profitAutoReinvestParam) {
        this.profitAutoReinvestParam = profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(String str) {
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(String str) {
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(String str) {
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(@NotNull ArrayList<AdvancedTriggerSign> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.signParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcy(String str) {
        this.sourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcySz(String str) {
        this.sourceCcySz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParamReq(TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        this.tpslTriggerParamReq = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
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
    public final void setVoucherId(String str) {
        this.voucherId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridReq(maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", investType=" + this.investType + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpslTriggerParamReq=" + this.tpslTriggerParamReq + ", tpOrdPx=" + this.tpOrdPx + ", slOrdPx=" + this.slOrdPx + ", duration=" + this.duration + ", signParams=" + this.signParams + ", reserveFunds=" + this.reserveFunds + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", perGridProfitRatio=" + this.perGridProfitRatio + ", pxLimit=" + this.pxLimit + ", profitSharingRatio=" + this.profitSharingRatio + ", instId=" + this.instId + ", instType=" + this.instType + ", ordType=" + this.ordType + ", annualizedRate=" + this.annualizedRate + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", investSymbol=" + this.investSymbol + ", autoTransfer=" + this.autoTransfer + ", marketPx=" + this.marketPx + ", systemSource=" + this.systemSource + ", nmpUnderlyingId=" + this.nmpUnderlyingId + ", earnParam=" + this.earnParam + ", batchNo=" + this.batchNo + ", voucherId=" + this.voucherId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", profitAutoReinvestParam=" + this.profitAutoReinvestParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.runType);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.baseSz);
        parcel.writeString(this.investType);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParamReq;
        if (tpSlTriggerParamReqResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tpSlTriggerParamReqResp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.duration);
        ArrayList<AdvancedTriggerSign> arrayList = this.signParams;
        parcel.writeInt(arrayList.size());
        Iterator<AdvancedTriggerSign> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Boolean bool = this.reserveFunds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
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
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.ordType);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.sourceCcy);
        parcel.writeString(this.sourceCcySz);
        parcel.writeString(this.investSymbol);
        parcel.writeString(this.autoTransfer);
        parcel.writeString(this.marketPx);
        parcel.writeString(this.systemSource);
        parcel.writeString(this.nmpUnderlyingId);
        SmartEarnRequestParam smartEarnRequestParam = this.earnParam;
        if (smartEarnRequestParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnRequestParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.batchNo);
        parcel.writeString(this.voucherId);
        parcel.writeString(this.tradeQuoteCcy);
        ProfitAutoReinvestParam profitAutoReinvestParam = this.profitAutoReinvestParam;
        if (profitAutoReinvestParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitAutoReinvestParam.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridReq> serializer() {
            return GridReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridReq(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str10, String str11, String str12, ArrayList arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, SmartEarnRequestParam smartEarnRequestParam, String str27, String str28, String str29, ProfitAutoReinvestParam profitAutoReinvestParam, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str;
        }
        if ((i & 2) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str2;
        }
        if ((i & 4) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str3;
        }
        if ((i & 8) == 0) {
            this.runType = null;
        } else {
            this.runType = str4;
        }
        if ((i & 16) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str5;
        }
        if ((i & 32) == 0) {
            this.baseSz = null;
        } else {
            this.baseSz = str6;
        }
        if ((i & 64) == 0) {
            this.investType = "";
        } else {
            this.investType = str7;
        }
        if ((i & 128) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str8;
        }
        if ((i & 256) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str9;
        }
        if ((i & 512) == 0) {
            this.tpslTriggerParamReq = null;
        } else {
            this.tpslTriggerParamReq = tpSlTriggerParamReqResp;
        }
        if ((i & 1024) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str10;
        }
        if ((i & 2048) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str11;
        }
        if ((i & 4096) == 0) {
            this.duration = null;
        } else {
            this.duration = str12;
        }
        this.signParams = (i & 8192) == 0 ? new ArrayList() : arrayList;
        if ((i & 16384) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool;
        }
        if ((32768 & i) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((65536 & i) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((131072 & i) == 0) {
            this.perGridProfitRatio = null;
        } else {
            this.perGridProfitRatio = str13;
        }
        if ((262144 & i) == 0) {
            this.pxLimit = null;
        } else {
            this.pxLimit = str14;
        }
        if ((524288 & i) == 0) {
            this.profitSharingRatio = "";
        } else {
            this.profitSharingRatio = str15;
        }
        if ((1048576 & i) == 0) {
            this.instId = "";
        } else {
            this.instId = str16;
        }
        if ((2097152 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str17;
        }
        if ((4194304 & i) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str18;
        }
        if ((8388608 & i) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str19;
        }
        if ((16777216 & i) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str20;
        }
        if ((33554432 & i) == 0) {
            this.sourceCcySz = null;
        } else {
            this.sourceCcySz = str21;
        }
        if ((67108864 & i) == 0) {
            this.investSymbol = "";
        } else {
            this.investSymbol = str22;
        }
        if ((134217728 & i) == 0) {
            this.autoTransfer = null;
        } else {
            this.autoTransfer = str23;
        }
        if ((268435456 & i) == 0) {
            this.marketPx = null;
        } else {
            this.marketPx = str24;
        }
        if ((536870912 & i) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str25;
        }
        if ((1073741824 & i) == 0) {
            this.nmpUnderlyingId = null;
        } else {
            this.nmpUnderlyingId = str26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.earnParam = null;
        } else {
            this.earnParam = smartEarnRequestParam;
        }
        if ((i2 & 1) == 0) {
            this.batchNo = null;
        } else {
            this.batchNo = str27;
        }
        if ((i2 & 2) == 0) {
            this.voucherId = null;
        } else {
            this.voucherId = str28;
        }
        if ((i2 & 4) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str29;
        }
        if ((i2 & 8) == 0) {
            this.profitAutoReinvestParam = null;
        } else {
            this.profitAutoReinvestParam = profitAutoReinvestParam;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridReq gridReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridReq.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridReq.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridReq.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridReq.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridReq.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridReq.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gridReq.runType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gridReq.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gridReq.quoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gridReq.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gridReq.baseSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gridReq.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) gridReq.investType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, gridReq.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || gridReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, gridReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || gridReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, gridReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || gridReq.tpslTriggerParamReq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, TpSlTriggerParamReqResp$$serializer.INSTANCE, gridReq.tpslTriggerParamReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || gridReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, gridReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || gridReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, gridReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || gridReq.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, gridReq.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(gridReq.signParams, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], gridReq.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || gridReq.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, gridReq.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || gridReq.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, TrailingConfig$$serializer.INSTANCE, gridReq.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || gridReq.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, TrailingConfig$$serializer.INSTANCE, gridReq.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || gridReq.perGridProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, gridReq.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || gridReq.pxLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, gridReq.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) gridReq.profitSharingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, gridReq.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) gridReq.getInstId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, gridReq.getInstId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) gridReq.getInstType(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, gridReq.getInstType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) gridReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, gridReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || gridReq.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, gridReq.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || gridReq.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, gridReq.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || gridReq.sourceCcySz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, gridReq.sourceCcySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) gridReq.investSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, gridReq.investSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || gridReq.autoTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, gridReq.autoTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || gridReq.marketPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, gridReq.marketPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || gridReq.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, gridReq.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || gridReq.nmpUnderlyingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, gridReq.nmpUnderlyingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || gridReq.earnParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, SmartEarnRequestParam$$serializer.INSTANCE, gridReq.earnParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || gridReq.batchNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, gridReq.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || gridReq.voucherId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, gridReq.voucherId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || gridReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, gridReq.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && gridReq.profitAutoReinvestParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, ProfitAutoReinvestParam$$serializer.INSTANCE, gridReq.profitAutoReinvestParam);
    }

    public GridReq(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, String str9, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str10, String str11, String str12, @NotNull ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str13, String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, String str19, String str20, String str21, @NotNull String str22, String str23, String str24, String str25, String str26, SmartEarnRequestParam smartEarnRequestParam, String str27, String str28, String str29, ProfitAutoReinvestParam profitAutoReinvestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.maxPx = str;
        this.minPx = str2;
        this.gridNum = str3;
        this.runType = str4;
        this.quoteSz = str5;
        this.baseSz = str6;
        this.investType = str7;
        this.tpTriggerPx = str8;
        this.slTriggerPx = str9;
        this.tpslTriggerParamReq = tpSlTriggerParamReqResp;
        this.tpOrdPx = str10;
        this.slOrdPx = str11;
        this.duration = str12;
        this.signParams = arrayList;
        this.reserveFunds = bool;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.perGridProfitRatio = str13;
        this.pxLimit = str14;
        this.profitSharingRatio = str15;
        this.instId = str16;
        this.instType = str17;
        this.ordType = str18;
        this.annualizedRate = str19;
        this.sourceCcy = str20;
        this.sourceCcySz = str21;
        this.investSymbol = str22;
        this.autoTransfer = str23;
        this.marketPx = str24;
        this.systemSource = str25;
        this.nmpUnderlyingId = str26;
        this.earnParam = smartEarnRequestParam;
        this.batchNo = str27;
        this.voucherId = str28;
        this.tradeQuoteCcy = str29;
        this.profitAutoReinvestParam = profitAutoReinvestParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ab: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:?: TERNARY null = ((wrap:int:0x004c: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp) : (r46v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x006c: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:98) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r50v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r51v0 java.lang.Boolean))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x0085: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r52v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x0090: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r53v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.SmartEarnRequestParam:?: TERNARY null = ((wrap:int:0x0135: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.SmartEarnRequestParam) : (r68v0 com.okinc.unify_trade.biz.bot.SmartEarnRequestParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0146: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014f: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ProfitAutoReinvestParam:?: TERNARY null = ((wrap:int:0x0158: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitAutoReinvestParam) : (r72v0 com.okinc.unify_trade.biz.ProfitAutoReinvestParam))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.lang.Boolean, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.SmartEarnRequestParam, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitAutoReinvestParam):void (m)] (LINE:83) call: com.okinc.unify_trade.biz.GridReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.SmartEarnRequestParam, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitAutoReinvestParam):void type: THIS */
    public /* synthetic */ GridReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str10, String str11, String str12, ArrayList arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, SmartEarnRequestParam smartEarnRequestParam, String str27, String str28, String str29, ProfitAutoReinvestParam profitAutoReinvestParam, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : tpSlTriggerParamReqResp, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? new ArrayList() : arrayList, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : trailingConfig, (i & 65536) != 0 ? null : trailingConfig2, (i & 131072) != 0 ? null : str13, (i & 262144) != 0 ? null : str14, (i & 524288) != 0 ? "" : str15, (i & 1048576) != 0 ? "" : str16, (i & 2097152) != 0 ? "" : str17, (i & 4194304) != 0 ? "" : str18, (i & 8388608) != 0 ? null : str19, (i & 16777216) != 0 ? null : str20, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str21, (i & 67108864) != 0 ? "" : str22, (i & 134217728) != 0 ? null : str23, (i & 268435456) != 0 ? null : str24, (i & 536870912) != 0 ? null : str25, (i & 1073741824) != 0 ? null : str26, (i & Integer.MIN_VALUE) != 0 ? null : smartEarnRequestParam, (i2 & 1) != 0 ? null : str27, (i2 & 2) != 0 ? null : str28, (i2 & 4) != 0 ? null : str29, (i2 & 8) != 0 ? null : profitAutoReinvestParam);
    }
}
