package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.ArbitrageOrderBean$$serializer;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.RecurringListItem$$serializer;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.SmartEarnParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C55770xqH;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeStrategyOrderData implements Parcelable, BizTradeStrategyInfo, TradeAllOrderApi {
    private String actualPx;
    private String actualSide;
    private String actualSz;
    private final String advanceOrdType;
    private String algoId;
    private String amendPxOnTriggerType;
    private String amt;
    private String arbitragePnl;
    private String arbitrageProfitRate;
    private Boolean associate;
    private List<TradeOrderStopParam> attachAlgoOrds;
    private String avgPx;
    private String bizRefType;
    private String cTime;
    private String cancelSourceReason;
    private String ccy;
    private String chaseType;
    private String chaseVal;
    private String closeFraction;
    private String ctVal;
    public DexOrderDetail dexOrderDetail;
    private String displayId;
    private final StrategyDcaEditResp effectiveEditParametersDetails;
    private String failCode;
    private String failCodeReason;
    private final String initOrdAmt;
    private String instFamily;
    private String instId;
    private List<ArbitrageOrderBean> instList;
    private String instType;
    private String investAmt;
    private String investCcy;
    private String isDex;
    private String last;
    private StrategyProfitResponse latestProfit;
    private String lever;
    private final Float leveragePrincipal;
    private LinkedOrd linkedOrd;
    private String noClosePositionId;
    private String notionalUsd;
    private String ordId;
    private String ordPx;
    private String ordSource;
    private String ordType;
    private String pTime;
    private String period;
    private String posSide;
    private List<StrategyProfitResponse> profitSnapshots;
    private String quickMgnType;
    private String recurringDay;
    private ArrayList<RecurringListItem> recurringList;
    private String recurringTime;
    private String reduceOnly;
    private String ruleType;
    private final String safetyOrdAmt;
    private String side;
    private final SmartEarnParam simpleEarn;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String source;
    private String state;
    private String stgyName;
    private String stopChasePrice;
    private String sz;
    private String tdMode;
    private String tgtCcy;
    private String totalCycleProfit;
    private String totalCycleProfitRate;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private TpSlTriggerParamReqResp tpslTriggerParam;
    private String tradeQuoteCcy;
    private String triggerLast;
    private String triggerPx;
    private String triggerPxType;
    private String triggerTime;
    private String uTime;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeStrategyOrderData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ArbitrageOrderBean$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(RecurringListItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TradeStrategyOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyOrderData createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            String str2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
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
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList6.add(ArbitrageOrderBean.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i3);
            ArrayList arrayList8 = arrayList;
            int i4 = 0;
            while (i4 != i3) {
                arrayList7.add(RecurringListItem.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            String string37 = parcel.readString();
            String string38 = parcel.readString();
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
            String string49 = parcel.readString();
            String string50 = parcel.readString();
            String string51 = parcel.readString();
            if (parcel.readInt() == 0) {
                str2 = string37;
                arrayList2 = arrayList7;
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = arrayList7;
                ArrayList arrayList9 = new ArrayList(i5);
                str2 = string37;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList9.add(TradeOrderStopParam.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList3 = arrayList9;
            }
            String string52 = parcel.readString();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            LinkedOrd linkedOrdCreateFromParcel = parcel.readInt() == 0 ? null : LinkedOrd.CREATOR.createFromParcel(parcel);
            String string55 = parcel.readString();
            String string56 = parcel.readString();
            String string57 = parcel.readString();
            String string58 = parcel.readString();
            String string59 = parcel.readString();
            String string60 = parcel.readString();
            String string61 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i7);
                arrayList4 = arrayList3;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList10.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList5 = arrayList10;
            }
            return new TradeStrategyOrderData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, tpSlTriggerParamReqRespCreateFromParcel, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, arrayList8, boolValueOf, string34, string35, string36, arrayList2, str2, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, arrayList4, string52, string53, string54, linkedOrdCreateFromParcel, string55, string56, string57, string58, string59, string60, string61, arrayList5, parcel.readInt() == 0 ? null : StrategyProfitResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StrategyDcaEditResp.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DexOrderDetail.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyOrderData[] newArray(int i) {
            return new TradeStrategyOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeStrategyOrderData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (LinkedOrd) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (StrategyProfitResponse) null, (String) null, (Float) null, (SmartEarnParam) null, (String) null, (String) null, (String) null, (String) null, (String) null, (StrategyDcaEditResp) null, (String) null, (DexOrderDetail) null, -1, -1, 65535, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String alternativeCurrency() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component17() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.actualPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.actualSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageOrderBean> component35() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component36() {
        return this.associate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RecurringListItem> component40() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.totalCycleProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.failCodeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> component56() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd component60() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component68() {
        return this.profitSnapshots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse component69() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component71() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component72() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp component78() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.isDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetail component80() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, String str29, String str30, String str31, @NotNull String str32, String str33, List<ArbitrageOrderBean> list, Boolean bool, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, List<TradeOrderStopParam> list2, @NotNull String str52, String str53, @NotNull String str54, LinkedOrd linkedOrd, @NotNull String str55, String str56, String str57, String str58, String str59, String str60, String str61, List<StrategyProfitResponse> list3, StrategyProfitResponse strategyProfitResponse, String str62, Float f, SmartEarnParam smartEarnParam, String str63, String str64, String str65, String str66, @NotNull String str67, StrategyDcaEditResp strategyDcaEditResp, @NotNull String str68, DexOrderDetail dexOrderDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        return new TradeStrategyOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, tpSlTriggerParamReqResp, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, list, bool, str34, str35, str36, arrayList, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, list2, str52, str53, str54, linkedOrd, str55, str56, str57, str58, str59, str60, str61, list3, strategyProfitResponse, str62, f, smartEarnParam, str63, str64, str65, str66, str67, strategyDcaEditResp, str68, dexOrderDetail);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String createTime() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curBaseSz() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String curQuoteSz() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String currency() {
        return null;
    }

    public String customStrategyName() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String earlyFillSettleTime() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String earlyFilledTime() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean endStatusFlag() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeStrategyOrderData)) {
            return false;
        }
        TradeStrategyOrderData tradeStrategyOrderData = (TradeStrategyOrderData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) tradeStrategyOrderData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) tradeStrategyOrderData.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) tradeStrategyOrderData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) tradeStrategyOrderData.instFamily) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeStrategyOrderData.ccy) && Intrinsics.EZpvd((Object) this.ctVal, (Object) tradeStrategyOrderData.ctVal) && Intrinsics.EZpvd((Object) this.ordId, (Object) tradeStrategyOrderData.ordId) && Intrinsics.EZpvd((Object) this.algoId, (Object) tradeStrategyOrderData.algoId) && Intrinsics.EZpvd((Object) this.sz, (Object) tradeStrategyOrderData.sz) && Intrinsics.EZpvd((Object) this.last, (Object) tradeStrategyOrderData.last) && Intrinsics.EZpvd((Object) this.ordType, (Object) tradeStrategyOrderData.ordType) && Intrinsics.EZpvd((Object) this.side, (Object) tradeStrategyOrderData.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradeStrategyOrderData.posSide) && Intrinsics.EZpvd((Object) this.tdMode, (Object) tradeStrategyOrderData.tdMode) && Intrinsics.EZpvd((Object) this.state, (Object) tradeStrategyOrderData.state) && Intrinsics.EZpvd((Object) this.lever, (Object) tradeStrategyOrderData.lever) && Intrinsics.EZpvd(this.tpslTriggerParam, tradeStrategyOrderData.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) tradeStrategyOrderData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) tradeStrategyOrderData.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tradeStrategyOrderData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) tradeStrategyOrderData.slOrdPx) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) tradeStrategyOrderData.triggerPx) && Intrinsics.EZpvd((Object) this.ordPx, (Object) tradeStrategyOrderData.ordPx) && Intrinsics.EZpvd((Object) this.actualSz, (Object) tradeStrategyOrderData.actualSz) && Intrinsics.EZpvd((Object) this.actualPx, (Object) tradeStrategyOrderData.actualPx) && Intrinsics.EZpvd((Object) this.actualSide, (Object) tradeStrategyOrderData.actualSide) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) tradeStrategyOrderData.triggerTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) tradeStrategyOrderData.cTime) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) tradeStrategyOrderData.notionalUsd) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) tradeStrategyOrderData.tgtCcy) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) tradeStrategyOrderData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) tradeStrategyOrderData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) tradeStrategyOrderData.reduceOnly) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) tradeStrategyOrderData.triggerPxType) && Intrinsics.EZpvd(this.instList, tradeStrategyOrderData.instList) && Intrinsics.EZpvd(this.associate, tradeStrategyOrderData.associate) && Intrinsics.EZpvd((Object) this.uTime, (Object) tradeStrategyOrderData.uTime) && Intrinsics.EZpvd((Object) this.stgyName, (Object) tradeStrategyOrderData.stgyName) && Intrinsics.EZpvd((Object) this.amt, (Object) tradeStrategyOrderData.amt) && Intrinsics.EZpvd(this.recurringList, tradeStrategyOrderData.recurringList) && Intrinsics.EZpvd((Object) this.period, (Object) tradeStrategyOrderData.period) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) tradeStrategyOrderData.recurringDay) && Intrinsics.EZpvd((Object) this.investCcy, (Object) tradeStrategyOrderData.investCcy) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) tradeStrategyOrderData.recurringTime) && Intrinsics.EZpvd((Object) this.investAmt, (Object) tradeStrategyOrderData.investAmt) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) tradeStrategyOrderData.quickMgnType) && Intrinsics.EZpvd((Object) this.cancelSourceReason, (Object) tradeStrategyOrderData.cancelSourceReason) && Intrinsics.EZpvd((Object) this.totalCycleProfit, (Object) tradeStrategyOrderData.totalCycleProfit) && Intrinsics.EZpvd((Object) this.arbitragePnl, (Object) tradeStrategyOrderData.arbitragePnl) && Intrinsics.EZpvd((Object) this.totalCycleProfitRate, (Object) tradeStrategyOrderData.totalCycleProfitRate) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) tradeStrategyOrderData.closeFraction) && Intrinsics.EZpvd((Object) this.ordSource, (Object) tradeStrategyOrderData.ordSource) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) tradeStrategyOrderData.bizRefType) && Intrinsics.EZpvd((Object) this.failCode, (Object) tradeStrategyOrderData.failCode) && Intrinsics.EZpvd((Object) this.failCodeReason, (Object) tradeStrategyOrderData.failCodeReason) && Intrinsics.EZpvd(this.attachAlgoOrds, tradeStrategyOrderData.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.triggerLast, (Object) tradeStrategyOrderData.triggerLast) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) tradeStrategyOrderData.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tradeStrategyOrderData.avgPx) && Intrinsics.EZpvd(this.linkedOrd, tradeStrategyOrderData.linkedOrd) && Intrinsics.EZpvd((Object) this.ruleType, (Object) tradeStrategyOrderData.ruleType) && Intrinsics.EZpvd((Object) this.source, (Object) tradeStrategyOrderData.source) && Intrinsics.EZpvd((Object) this.chaseType, (Object) tradeStrategyOrderData.chaseType) && Intrinsics.EZpvd((Object) this.chaseVal, (Object) tradeStrategyOrderData.chaseVal) && Intrinsics.EZpvd((Object) this.arbitrageProfitRate, (Object) tradeStrategyOrderData.arbitrageProfitRate) && Intrinsics.EZpvd((Object) this.stopChasePrice, (Object) tradeStrategyOrderData.stopChasePrice) && Intrinsics.EZpvd((Object) this.pTime, (Object) tradeStrategyOrderData.pTime) && Intrinsics.EZpvd(this.profitSnapshots, tradeStrategyOrderData.profitSnapshots) && Intrinsics.EZpvd(this.latestProfit, tradeStrategyOrderData.latestProfit) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tradeStrategyOrderData.tradeQuoteCcy) && Intrinsics.EZpvd(this.leveragePrincipal, tradeStrategyOrderData.leveragePrincipal) && Intrinsics.EZpvd(this.simpleEarn, tradeStrategyOrderData.simpleEarn) && Intrinsics.EZpvd((Object) this.displayId, (Object) tradeStrategyOrderData.displayId) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) tradeStrategyOrderData.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) tradeStrategyOrderData.safetyOrdAmt) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) tradeStrategyOrderData.advanceOrdType) && Intrinsics.EZpvd((Object) this.noClosePositionId, (Object) tradeStrategyOrderData.noClosePositionId) && Intrinsics.EZpvd(this.effectiveEditParametersDetails, tradeStrategyOrderData.effectiveEditParametersDetails) && Intrinsics.EZpvd((Object) this.isDex, (Object) tradeStrategyOrderData.isDex) && Intrinsics.EZpvd(this.dexOrderDetail, tradeStrategyOrderData.dexOrderDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String estimateProfit() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String expiryTime() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ExtendedBusinessInfo extendedBusinessInfo() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyAmount() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyPrice() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String fmtEarlyTotal() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualPx() {
        return this.actualPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualSide() {
        return this.actualSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualSz() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAdvanceOrderType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAmendPxOnTriggerTypeForMultiSl() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbOrderPnl() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbStakingError() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getArbiDisplayMinPaybackDays() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<FundingFeeApyItem> getArbiFundingFeeApyList() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getArbiHighestApyPeriod() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArbitrageTotalPnlInfo getArbiTotalPnlInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<ArbitrageOrderBean> getArbitrageList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitragePnl() {
        return this.arbitragePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageProfitRate() {
        return this.arbitrageProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAssociate() {
        return this.associate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public List<TradeOrderStopParam> getAttachAlgoOrders() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.getAutoMarginMaxAmount()Ljava/lang/String; */
    /* JADX INFO: renamed from: getAutoMarginMaxAmount, reason: collision with other method in class */
    public Void m7133getAutoMarginMaxAmount() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getAutoMarginSwitch() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getAvgPrice() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public BalanceDetailInfoDto getBalanceDetailInfoDto() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getBaseDigit() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
    }

    public String getBotApy() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBotId() {
        return this.algoId;
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.getBotVo()Lcom/okinc/unify_trade/biz/BotVo; */
    /* JADX INFO: renamed from: getBotVo, reason: collision with other method in class */
    public Void m7134getBotVo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelSourceReason() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseType() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseVal() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getCompleteCycles() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getCurrentTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcaInitOrdAmt() {
        String str = this.initOrdAmt;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcaSafetyOrdAmt() {
        String str = this.safetyOrdAmt;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcaTriggerType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdAlternateCurrency() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getDcdArbApy() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdAvgCost() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdBotPnl() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdBotPnlRatio() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getDcdBotState() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdCoinPnl() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdCurrencyValue() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getDcdCycle() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdNotional() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDcdNotionalCcy() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public DexOrderDetail getDexOrderDetail() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDcaEditResp getEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getErrorMsg() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCode() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCodeReason() {
        return this.failCodeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFillSafetyOrders() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getFilledPercent() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<SignParamItem> getGridSignParams() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridSlPnlRatio() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridState() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getGridTpPnlRatio() {
        return "";
    }

    public String getIceAggressiveNess() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInitPxValue() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getInstIdByALl() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageOrderBean> getInstList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getInstTypeByAll() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestAmt() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInvestmentamt() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInvestmentccy() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyProfitResponse getLatestProfit() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public StrategyProfitResponse getLatestProfitData() {
        return this.latestProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    public String getLimitOrderNumber() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd getLinkedOrd() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkedOrd getLinkedOrder() {
        return this.linkedOrd;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getMTrailingDownFund() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getMarkByPage() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMaxBotUsages() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getMaxSafetyOrders() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoClosePositionId() {
        return this.noClosePositionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    public int getNumManualOrderInCycle() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<StrategyProfitResponse> getOngoingProfitSnapshots() {
        return this.profitSnapshots;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrdCopyType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdPx() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdSource() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderActivePx() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActivePxType() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderActualMarginSz() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualPx() {
        return this.actualPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualSide() {
        return this.actualSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderActualSz() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getOrderArbitrageNum() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderAvailableMargin() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderBaseSz() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCallbackRatio() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCallbackSpread() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCancelType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderCount() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderDayArbitrageNum() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderDirection() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderDuration() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public StrategyDcaEditResp getOrderEffectiveEditParametersDetails() {
        return this.effectiveEditParametersDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderExtraMarginSz() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFailCodeReason() {
        return this.failCodeReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderFloatProfit() {
        return "unsupported";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderFloatingPnl() {
        return null;
    }

    public String getOrderFundingRate() {
        return null;
    }

    public String getOrderFundingTime() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderGridNum() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderGridProfit() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrderIdByAll() {
        return this.algoId;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderInstFamily() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstId() {
        return this.instId;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<String> getOrderInstIds() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderInvestType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderInvestment() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderLiqPx() {
        return "unsupported";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderMaxPx() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderMinPx() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderMktCap() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderOrdPx() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderPnlRatio() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderProfitNum() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxLimit() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxSpread() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderPxVar() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderQuoteSz() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderRunPx() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderRunType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSide() {
        return this.side;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalChanId() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalChanName() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSignalCount() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSlOrderPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderStopResult() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSymbolsNumber() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderSzLimit() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<Integer> getOrderTags() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTimeInterval() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTotalAmt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getOrderTotalPnl() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTotalPnlRatio() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpOrderPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TpSlTriggerParamReqResp getOrderTpSlTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTradeNum() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerLast() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getOrderUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrtType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPTimeValue() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalInterval() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPortfolioBalNum() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalRatio() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getPortfolioBalType() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositionIdNoClose() {
        return this.noClosePositionId;
    }

    public String getPriceDigit() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> getProfitSnapshots() {
        return this.profitSnapshots;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getProfitValue() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getQuickMgnTypeInterval() {
        return this.quickMgnType;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getQuoteDigit() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecHourly() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<RecurringListItem> getRecList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRecNextInvestTime() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getRecTime() {
        return this.recurringTime;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public RecurringBuyDetails getRecurringBuyDetails() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringDay() {
        return this.recurringDay;
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
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean getReinvestmentInfo() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSharingRatio() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public EntrySignalOrderAmtParam getSignalAmtParam() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ExitSignalOrderAmtParam getSignalBotStopParam() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam getSimpleEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSlPrice() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<SmartArbListItem> getSmartArbList() {
        return null;
    }

    public String getSmartArbTotalFeeRatio() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public SmartEarnParam getSmartEarn() {
        return this.simpleEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    public String getSourceBotId() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getSourceId() {
        return null;
    }

    public String getStakingApy() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getStateByAll() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStgyAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStgyInvestAmt() {
        return this.investAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String getStgyInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStopBotType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopChasePrice() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStopLessMode() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getStrategyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getSumApyAndStakingApy() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    public TacticsData getTacticsRespData() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TacticsVoucherInfo getTacticsVoucherInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCycleProfit() {
        return this.totalCycleProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCycleProfitRate() {
        return this.totalCycleProfitRate;
    }

    public String getTotalDigit() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getTpPrice() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getTpRange() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String getTradeQuoteCcyForSpot() {
        return this.tradeQuoteCcy;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TrailingConfig getTrailingDown() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public TrailingConfig getTrailingUp() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerLast() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getUTimeValue() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.uly.hashCode();
        int iHashCode4 = this.instFamily.hashCode();
        int iHashCode5 = this.ccy.hashCode();
        String str = this.ctVal;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.ordId.hashCode();
        int iHashCode8 = this.algoId.hashCode();
        int iHashCode9 = this.sz.hashCode();
        int iHashCode10 = this.last.hashCode();
        int iHashCode11 = this.ordType.hashCode();
        int iHashCode12 = this.side.hashCode();
        int iHashCode13 = this.posSide.hashCode();
        int iHashCode14 = this.tdMode.hashCode();
        int iHashCode15 = this.state.hashCode();
        int iHashCode16 = this.lever.hashCode();
        int iHashCode17 = this.tpslTriggerParam.hashCode();
        int iHashCode18 = this.tpTriggerPx.hashCode();
        int iHashCode19 = this.tpOrdPx.hashCode();
        int iHashCode20 = this.slTriggerPx.hashCode();
        int iHashCode21 = this.slOrdPx.hashCode();
        int iHashCode22 = this.triggerPx.hashCode();
        int iHashCode23 = this.ordPx.hashCode();
        int iHashCode24 = this.actualSz.hashCode();
        int iHashCode25 = this.actualPx.hashCode();
        int iHashCode26 = this.actualSide.hashCode();
        int iHashCode27 = this.triggerTime.hashCode();
        int iHashCode28 = this.cTime.hashCode();
        int iHashCode29 = this.notionalUsd.hashCode();
        String str2 = this.tgtCcy;
        int iHashCode30 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tpTriggerPxType;
        int iHashCode31 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slTriggerPxType;
        int iHashCode32 = str4 == null ? 0 : str4.hashCode();
        int iHashCode33 = this.reduceOnly.hashCode();
        String str5 = this.triggerPxType;
        int iHashCode34 = str5 == null ? 0 : str5.hashCode();
        List<ArbitrageOrderBean> list = this.instList;
        int iHashCode35 = list == null ? 0 : list.hashCode();
        Boolean bool = this.associate;
        int iHashCode36 = bool == null ? 0 : bool.hashCode();
        int iHashCode37 = this.uTime.hashCode();
        int iHashCode38 = this.stgyName.hashCode();
        int iHashCode39 = this.amt.hashCode();
        int iHashCode40 = this.recurringList.hashCode();
        int iHashCode41 = this.period.hashCode();
        int iHashCode42 = this.recurringDay.hashCode();
        int iHashCode43 = this.investCcy.hashCode();
        int iHashCode44 = this.recurringTime.hashCode();
        int iHashCode45 = this.investAmt.hashCode();
        int iHashCode46 = this.quickMgnType.hashCode();
        int iHashCode47 = this.cancelSourceReason.hashCode();
        int iHashCode48 = this.totalCycleProfit.hashCode();
        int iHashCode49 = this.arbitragePnl.hashCode();
        int iHashCode50 = this.totalCycleProfitRate.hashCode();
        int iHashCode51 = this.closeFraction.hashCode();
        String str6 = this.ordSource;
        int iHashCode52 = str6 == null ? 0 : str6.hashCode();
        int iHashCode53 = this.bizRefType.hashCode();
        int iHashCode54 = this.failCode.hashCode();
        int iHashCode55 = this.failCodeReason.hashCode();
        List<TradeOrderStopParam> list2 = this.attachAlgoOrds;
        int iHashCode56 = list2 == null ? 0 : list2.hashCode();
        int iHashCode57 = this.triggerLast.hashCode();
        String str7 = this.amendPxOnTriggerType;
        int iHashCode58 = str7 == null ? 0 : str7.hashCode();
        int iHashCode59 = this.avgPx.hashCode();
        LinkedOrd linkedOrd = this.linkedOrd;
        int iHashCode60 = linkedOrd == null ? 0 : linkedOrd.hashCode();
        int iHashCode61 = this.ruleType.hashCode();
        String str8 = this.source;
        int iHashCode62 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.chaseType;
        int iHashCode63 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.chaseVal;
        int iHashCode64 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.arbitrageProfitRate;
        int iHashCode65 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.stopChasePrice;
        int iHashCode66 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.pTime;
        int iHashCode67 = str13 == null ? 0 : str13.hashCode();
        List<StrategyProfitResponse> list3 = this.profitSnapshots;
        int iHashCode68 = list3 == null ? 0 : list3.hashCode();
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        int iHashCode69 = strategyProfitResponse == null ? 0 : strategyProfitResponse.hashCode();
        String str14 = this.tradeQuoteCcy;
        int iHashCode70 = str14 == null ? 0 : str14.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode71 = f == null ? 0 : f.hashCode();
        SmartEarnParam smartEarnParam = this.simpleEarn;
        int iHashCode72 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        String str15 = this.displayId;
        int iHashCode73 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.initOrdAmt;
        int iHashCode74 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.safetyOrdAmt;
        int iHashCode75 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.advanceOrdType;
        int iHashCode76 = str18 == null ? 0 : str18.hashCode();
        int iHashCode77 = this.noClosePositionId.hashCode();
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        int iHashCode78 = strategyDcaEditResp == null ? 0 : strategyDcaEditResp.hashCode();
        int iHashCode79 = this.isDex.hashCode();
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + (dexOrderDetail == null ? 0 : dexOrderDetail.hashCode());
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isArbitrageWithStaking() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean isAssociate() {
        return this.associate;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isBasePos() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Boolean isBorrowMode() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isCopy() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDex() {
        return this.isDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String isNeedPostWarning() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isOutOfRange() {
        return false;
    }

    public boolean isPinned() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isShowTWapTips() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean isStop() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String lastSettlementSettledTime() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String lastTradeExpireTime() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String notionalAmount() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String participationRatio() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perGridProfitRatio() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perMaxProfitRate() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String perMinProfitRate() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String pnlRatioInSourceCcy() {
        return "";
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.pxSteps()Ljava/lang/String; */
    /* JADX INFO: renamed from: pxSteps, reason: collision with other method in class */
    public Void m7135pxSteps() {
        return null;
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.pxStepsMult()Ljava/lang/String; */
    /* JADX INFO: renamed from: pxStepsMult, reason: collision with other method in class */
    public Void m7136pxStepsMult() {
        return null;
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.reserveFunds()Ljava/lang/Boolean; */
    /* JADX INFO: renamed from: reserveFunds, reason: collision with other method in class */
    public Void m7137reserveFunds() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(String str) {
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitragePnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitragePnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageProfitRate(String str) {
        this.arbitrageProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssociate(Boolean bool) {
        this.associate = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(List<TradeOrderStopParam> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelSourceReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelSourceReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChaseType(String str) {
        this.chaseType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChaseVal(String str) {
        this.chaseVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFraction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeFraction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(String str) {
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isDex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(String str) {
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCodeReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failCodeReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstList(List<ArbitrageOrderBean> list) {
        this.instList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestProfit(StrategyProfitResponse strategyProfitResponse) {
        this.latestProfit = strategyProfitResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedOrd(LinkedOrd linkedOrd) {
        this.linkedOrd = linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoClosePositionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.noClosePositionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public void setOngoingProfitSnapshots(List<StrategyProfitResponse> list) {
        this.profitSnapshots = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdSource(String str) {
        this.ordSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSnapshots(List<StrategyProfitResponse> list) {
        this.profitSnapshots = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringDay = str;
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
    public final void setReduceOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(String str) {
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopChasePrice(String str) {
        this.stopChasePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTgtCcy(String str) {
        this.tgtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCycleProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalCycleProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCycleProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalCycleProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParam(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerLast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String settlementAmount() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String settlementCcy() {
        return "";
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.slPct()Ljava/lang/String; */
    /* JADX INFO: renamed from: slPct, reason: collision with other method in class */
    public Void m7138slPct() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public String sourceCcy() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String sourceCcySz() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String status() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String strike() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String strikePrecision() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public boolean supportEarlyFill() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String timeLeft() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStrategyOrderData(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", ccy=" + this.ccy + ", ctVal=" + this.ctVal + ", ordId=" + this.ordId + ", algoId=" + this.algoId + ", sz=" + this.sz + ", last=" + this.last + ", ordType=" + this.ordType + ", side=" + this.side + ", posSide=" + this.posSide + ", tdMode=" + this.tdMode + ", state=" + this.state + ", lever=" + this.lever + ", tpslTriggerParam=" + this.tpslTriggerParam + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", triggerPx=" + this.triggerPx + ", ordPx=" + this.ordPx + ", actualSz=" + this.actualSz + ", actualPx=" + this.actualPx + ", actualSide=" + this.actualSide + ", triggerTime=" + this.triggerTime + ", cTime=" + this.cTime + ", notionalUsd=" + this.notionalUsd + ", tgtCcy=" + this.tgtCcy + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", reduceOnly=" + this.reduceOnly + ", triggerPxType=" + this.triggerPxType + ", instList=" + this.instList + ", associate=" + this.associate + ", uTime=" + this.uTime + ", stgyName=" + this.stgyName + ", amt=" + this.amt + ", recurringList=" + this.recurringList + ", period=" + this.period + ", recurringDay=" + this.recurringDay + ", investCcy=" + this.investCcy + ", recurringTime=" + this.recurringTime + ", investAmt=" + this.investAmt + ", quickMgnType=" + this.quickMgnType + ", cancelSourceReason=" + this.cancelSourceReason + ", totalCycleProfit=" + this.totalCycleProfit + ", arbitragePnl=" + this.arbitragePnl + ", totalCycleProfitRate=" + this.totalCycleProfitRate + ", closeFraction=" + this.closeFraction + ", ordSource=" + this.ordSource + ", bizRefType=" + this.bizRefType + ", failCode=" + this.failCode + ", failCodeReason=" + this.failCodeReason + ", attachAlgoOrds=" + this.attachAlgoOrds + ", triggerLast=" + this.triggerLast + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", avgPx=" + this.avgPx + ", linkedOrd=" + this.linkedOrd + ", ruleType=" + this.ruleType + ", source=" + this.source + ", chaseType=" + this.chaseType + ", chaseVal=" + this.chaseVal + ", arbitrageProfitRate=" + this.arbitrageProfitRate + ", stopChasePrice=" + this.stopChasePrice + ", pTime=" + this.pTime + ", profitSnapshots=" + this.profitSnapshots + ", latestProfit=" + this.latestProfit + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", leveragePrincipal=" + this.leveragePrincipal + ", simpleEarn=" + this.simpleEarn + ", displayId=" + this.displayId + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", advanceOrdType=" + this.advanceOrdType + ", noClosePositionId=" + this.noClosePositionId + ", effectiveEditParametersDetails=" + this.effectiveEditParametersDetails + ", isDex=" + this.isDex + ", dexOrderDetail=" + this.dexOrderDetail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55847xrf
    public String totalPnlInSourceCcy() {
        return "";
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.tpPct()Ljava/lang/String; */
    /* JADX INFO: renamed from: tpPct, reason: collision with other method in class */
    public Void m7139tpPct() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String tradeId() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String tradeSide() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String turnoverRatio() {
        return null;
    }

    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo.volMult()Ljava/lang/String; */
    /* JADX INFO: renamed from: volMult, reason: collision with other method in class */
    public Void m7140volMult() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.uly);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.ccy);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.ordId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.sz);
        parcel.writeString(this.last);
        parcel.writeString(this.ordType);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.state);
        parcel.writeString(this.lever);
        this.tpslTriggerParam.writeToParcel(parcel, i);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.ordPx);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.actualPx);
        parcel.writeString(this.actualSide);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.cTime);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.triggerPxType);
        List<ArbitrageOrderBean> list = this.instList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ArbitrageOrderBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.associate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.uTime);
        parcel.writeString(this.stgyName);
        parcel.writeString(this.amt);
        ArrayList<RecurringListItem> arrayList = this.recurringList;
        parcel.writeInt(arrayList.size());
        Iterator<RecurringListItem> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.period);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.recurringTime);
        parcel.writeString(this.investAmt);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.cancelSourceReason);
        parcel.writeString(this.totalCycleProfit);
        parcel.writeString(this.arbitragePnl);
        parcel.writeString(this.totalCycleProfitRate);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.ordSource);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.failCode);
        parcel.writeString(this.failCodeReason);
        List<TradeOrderStopParam> list2 = this.attachAlgoOrds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<TradeOrderStopParam> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.triggerLast);
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.avgPx);
        LinkedOrd linkedOrd = this.linkedOrd;
        if (linkedOrd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedOrd.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ruleType);
        parcel.writeString(this.source);
        parcel.writeString(this.chaseType);
        parcel.writeString(this.chaseVal);
        parcel.writeString(this.arbitrageProfitRate);
        parcel.writeString(this.stopChasePrice);
        parcel.writeString(this.pTime);
        List<StrategyProfitResponse> list3 = this.profitSnapshots;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<StrategyProfitResponse> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        StrategyProfitResponse strategyProfitResponse = this.latestProfit;
        if (strategyProfitResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyProfitResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeQuoteCcy);
        Float f = this.leveragePrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        SmartEarnParam smartEarnParam = this.simpleEarn;
        if (smartEarnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.displayId);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.advanceOrdType);
        parcel.writeString(this.noClosePositionId);
        StrategyDcaEditResp strategyDcaEditResp = this.effectiveEditParametersDetails;
        if (strategyDcaEditResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyDcaEditResp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.isDex);
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        if (dexOrderDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexOrderDetail.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TradeStrategyOrderData(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List list, Boolean bool, String str34, String str35, String str36, ArrayList arrayList, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, List list2, String str52, String str53, String str54, LinkedOrd linkedOrd, String str55, String str56, String str57, String str58, String str59, String str60, String str61, List list3, StrategyProfitResponse strategyProfitResponse, String str62, Float f, SmartEarnParam smartEarnParam, String str63, String str64, String str65, String str66, String str67, StrategyDcaEditResp strategyDcaEditResp, String str68, DexOrderDetail dexOrderDetail, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.ctVal = null;
        } else {
            this.ctVal = str6;
        }
        if ((i & 64) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str7;
        }
        if ((i & 128) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str8;
        }
        if ((i & 256) == 0) {
            this.sz = "";
        } else {
            this.sz = str9;
        }
        if ((i & 512) == 0) {
            this.last = "";
        } else {
            this.last = str10;
        }
        if ((i & 1024) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str11;
        }
        if ((i & 2048) == 0) {
            this.side = "";
        } else {
            this.side = str12;
        }
        if ((i & 4096) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str13;
        }
        if ((i & 8192) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str14;
        }
        if ((i & 16384) == 0) {
            this.state = "";
        } else {
            this.state = str15;
        }
        if ((i & 32768) == 0) {
            this.lever = "";
        } else {
            this.lever = str16;
        }
        this.tpslTriggerParam = (i & 65536) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((i & 131072) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str17;
        }
        if ((i & 262144) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str18;
        }
        if ((i & 524288) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str19;
        }
        if ((1048576 & i) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str20;
        }
        if ((2097152 & i) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str21;
        }
        if ((4194304 & i) == 0) {
            this.ordPx = "";
        } else {
            this.ordPx = str22;
        }
        if ((8388608 & i) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str23;
        }
        if ((16777216 & i) == 0) {
            this.actualPx = "";
        } else {
            this.actualPx = str24;
        }
        if ((33554432 & i) == 0) {
            this.actualSide = "";
        } else {
            this.actualSide = str25;
        }
        if ((67108864 & i) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str26;
        }
        if ((134217728 & i) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str27;
        }
        if ((268435456 & i) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str28;
        }
        if ((536870912 & i) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str29;
        }
        if ((1073741824 & i) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str31;
        }
        if ((i2 & 1) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str32;
        }
        if ((i2 & 2) == 0) {
            this.triggerPxType = null;
        } else {
            this.triggerPxType = str33;
        }
        if ((i2 & 4) == 0) {
            this.instList = null;
        } else {
            this.instList = list;
        }
        this.associate = (i2 & 8) == 0 ? Boolean.FALSE : bool;
        if ((i2 & 16) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str34;
        }
        if ((i2 & 32) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str35;
        }
        if ((i2 & 64) == 0) {
            this.amt = "";
        } else {
            this.amt = str36;
        }
        this.recurringList = (i2 & 128) == 0 ? new ArrayList() : arrayList;
        if ((i2 & 256) == 0) {
            this.period = "";
        } else {
            this.period = str37;
        }
        if ((i2 & 512) == 0) {
            this.recurringDay = "";
        } else {
            this.recurringDay = str38;
        }
        if ((i2 & 1024) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str39;
        }
        if ((i2 & 2048) == 0) {
            this.recurringTime = "";
        } else {
            this.recurringTime = str40;
        }
        if ((i2 & 4096) == 0) {
            this.investAmt = "";
        } else {
            this.investAmt = str41;
        }
        if ((i2 & 8192) == 0) {
            this.quickMgnType = "";
        } else {
            this.quickMgnType = str42;
        }
        if ((i2 & 16384) == 0) {
            this.cancelSourceReason = "";
        } else {
            this.cancelSourceReason = str43;
        }
        if ((i2 & 32768) == 0) {
            this.totalCycleProfit = "";
        } else {
            this.totalCycleProfit = str44;
        }
        if ((i2 & 65536) == 0) {
            this.arbitragePnl = "";
        } else {
            this.arbitragePnl = str45;
        }
        if ((i2 & 131072) == 0) {
            this.totalCycleProfitRate = "";
        } else {
            this.totalCycleProfitRate = str46;
        }
        if ((i2 & 262144) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str47;
        }
        if ((i2 & 524288) == 0) {
            this.ordSource = null;
        } else {
            this.ordSource = str48;
        }
        if ((1048576 & i2) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str49;
        }
        if ((2097152 & i2) == 0) {
            this.failCode = "";
        } else {
            this.failCode = str50;
        }
        if ((4194304 & i2) == 0) {
            this.failCodeReason = "";
        } else {
            this.failCodeReason = str51;
        }
        if ((8388608 & i2) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = list2;
        }
        if ((16777216 & i2) == 0) {
            this.triggerLast = "";
        } else {
            this.triggerLast = str52;
        }
        if ((33554432 & i2) == 0) {
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str53;
        }
        if ((67108864 & i2) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str54;
        }
        if ((134217728 & i2) == 0) {
            this.linkedOrd = null;
        } else {
            this.linkedOrd = linkedOrd;
        }
        if ((268435456 & i2) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str55;
        }
        if ((536870912 & i2) == 0) {
            this.source = null;
        } else {
            this.source = str56;
        }
        if ((1073741824 & i2) == 0) {
            this.chaseType = null;
        } else {
            this.chaseType = str57;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.chaseVal = null;
        } else {
            this.chaseVal = str58;
        }
        if ((i3 & 1) == 0) {
            this.arbitrageProfitRate = null;
        } else {
            this.arbitrageProfitRate = str59;
        }
        if ((i3 & 2) == 0) {
            this.stopChasePrice = null;
        } else {
            this.stopChasePrice = str60;
        }
        if ((i3 & 4) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str61;
        }
        if ((i3 & 8) == 0) {
            this.profitSnapshots = null;
        } else {
            this.profitSnapshots = list3;
        }
        if ((i3 & 16) == 0) {
            this.latestProfit = null;
        } else {
            this.latestProfit = strategyProfitResponse;
        }
        if ((i3 & 32) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str62;
        }
        if ((i3 & 64) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((i3 & 128) == 0) {
            this.simpleEarn = null;
        } else {
            this.simpleEarn = smartEarnParam;
        }
        if ((i3 & 256) == 0) {
            this.displayId = null;
        } else {
            this.displayId = str63;
        }
        if ((i3 & 512) == 0) {
            this.initOrdAmt = "";
        } else {
            this.initOrdAmt = str64;
        }
        if ((i3 & 1024) == 0) {
            this.safetyOrdAmt = "";
        } else {
            this.safetyOrdAmt = str65;
        }
        if ((i3 & 2048) == 0) {
            this.advanceOrdType = "";
        } else {
            this.advanceOrdType = str66;
        }
        if ((i3 & 4096) == 0) {
            this.noClosePositionId = "";
        } else {
            this.noClosePositionId = str67;
        }
        if ((i3 & 8192) == 0) {
            this.effectiveEditParametersDetails = null;
        } else {
            this.effectiveEditParametersDetails = strategyDcaEditResp;
        }
        if ((i3 & 16384) == 0) {
            this.isDex = "";
        } else {
            this.isDex = str68;
        }
        if ((i3 & 32768) == 0) {
            this.dexOrderDetail = null;
        } else {
            this.dexOrderDetail = dexOrderDetail;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeStrategyOrderData tradeStrategyOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeStrategyOrderData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeStrategyOrderData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeStrategyOrderData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeStrategyOrderData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeStrategyOrderData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeStrategyOrderData.ctVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeStrategyOrderData.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeStrategyOrderData.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeStrategyOrderData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeStrategyOrderData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeStrategyOrderData.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeStrategyOrderData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeStrategyOrderData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeStrategyOrderData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeStrategyOrderData.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeStrategyOrderData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeStrategyOrderData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(tradeStrategyOrderData.tpslTriggerParam, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, TpSlTriggerParamReqResp$$serializer.INSTANCE, tradeStrategyOrderData.tpslTriggerParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeStrategyOrderData.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeStrategyOrderData.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeStrategyOrderData.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeStrategyOrderData.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.triggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeStrategyOrderData.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.ordPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeStrategyOrderData.ordPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeStrategyOrderData.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.actualPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeStrategyOrderData.actualPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.actualSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradeStrategyOrderData.actualSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeStrategyOrderData.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeStrategyOrderData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeStrategyOrderData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || tradeStrategyOrderData.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, tradeStrategyOrderData.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || tradeStrategyOrderData.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, tradeStrategyOrderData.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || tradeStrategyOrderData.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, tradeStrategyOrderData.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradeStrategyOrderData.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || tradeStrategyOrderData.triggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, tradeStrategyOrderData.triggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || tradeStrategyOrderData.instList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, kSerializerArr[34], tradeStrategyOrderData.instList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd(tradeStrategyOrderData.associate, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, BooleanSerializer.INSTANCE, tradeStrategyOrderData.associate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, tradeStrategyOrderData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, tradeStrategyOrderData.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, tradeStrategyOrderData.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd(tradeStrategyOrderData.recurringList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], tradeStrategyOrderData.recurringList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, tradeStrategyOrderData.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.recurringDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, tradeStrategyOrderData.recurringDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, tradeStrategyOrderData.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.recurringTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, tradeStrategyOrderData.recurringTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.investAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, tradeStrategyOrderData.investAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.quickMgnType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, tradeStrategyOrderData.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.cancelSourceReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, tradeStrategyOrderData.cancelSourceReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.totalCycleProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, tradeStrategyOrderData.totalCycleProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.arbitragePnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, tradeStrategyOrderData.arbitragePnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.totalCycleProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, tradeStrategyOrderData.totalCycleProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, tradeStrategyOrderData.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || tradeStrategyOrderData.ordSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, tradeStrategyOrderData.ordSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, tradeStrategyOrderData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.failCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, tradeStrategyOrderData.failCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.failCodeReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, tradeStrategyOrderData.failCodeReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || tradeStrategyOrderData.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, kSerializerArr[55], tradeStrategyOrderData.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.triggerLast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, tradeStrategyOrderData.triggerLast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || tradeStrategyOrderData.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, tradeStrategyOrderData.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, tradeStrategyOrderData.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || tradeStrategyOrderData.linkedOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, LinkedOrd$$serializer.INSTANCE, tradeStrategyOrderData.linkedOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, tradeStrategyOrderData.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || tradeStrategyOrderData.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, StringSerializer.INSTANCE, tradeStrategyOrderData.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || tradeStrategyOrderData.chaseType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, tradeStrategyOrderData.chaseType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || tradeStrategyOrderData.chaseVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, tradeStrategyOrderData.chaseVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || tradeStrategyOrderData.arbitrageProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, tradeStrategyOrderData.arbitrageProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || tradeStrategyOrderData.stopChasePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, tradeStrategyOrderData.stopChasePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.pTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, tradeStrategyOrderData.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || tradeStrategyOrderData.profitSnapshots != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, kSerializerArr[67], tradeStrategyOrderData.profitSnapshots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || tradeStrategyOrderData.latestProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StrategyProfitResponse$$serializer.INSTANCE, tradeStrategyOrderData.latestProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || tradeStrategyOrderData.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, tradeStrategyOrderData.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || tradeStrategyOrderData.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, FloatSerializer.INSTANCE, tradeStrategyOrderData.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || tradeStrategyOrderData.simpleEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, SmartEarnParam$$serializer.INSTANCE, tradeStrategyOrderData.simpleEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || tradeStrategyOrderData.displayId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, tradeStrategyOrderData.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.initOrdAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, StringSerializer.INSTANCE, tradeStrategyOrderData.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.safetyOrdAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, tradeStrategyOrderData.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.advanceOrdType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, tradeStrategyOrderData.advanceOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.noClosePositionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, tradeStrategyOrderData.noClosePositionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || tradeStrategyOrderData.effectiveEditParametersDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StrategyDcaEditResp$$serializer.INSTANCE, tradeStrategyOrderData.effectiveEditParametersDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) tradeStrategyOrderData.isDex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, tradeStrategyOrderData.isDex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) && tradeStrategyOrderData.dexOrderDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, DexOrderDetail$$serializer.INSTANCE, tradeStrategyOrderData.dexOrderDetail);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String getAutoMarginMaxAmount() {
        return (String) m7133getAutoMarginMaxAmount();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ BotVo getBotVo() {
        return (BotVo) m7134getBotVo();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String pxSteps() {
        return (String) m7135pxSteps();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String pxStepsMult() {
        return (String) m7136pxStepsMult();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ Boolean reserveFunds() {
        return (Boolean) m7137reserveFunds();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String slPct() {
        return (String) m7138slPct();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String tpPct() {
        return (String) m7139tpPct();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public /* bridge */ /* synthetic */ String volMult() {
        return (String) m7140volMult();
    }

    public TradeStrategyOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, String str29, String str30, String str31, @NotNull String str32, String str33, List<ArbitrageOrderBean> list, Boolean bool, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull ArrayList<RecurringListItem> arrayList, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, List<TradeOrderStopParam> list2, @NotNull String str52, String str53, @NotNull String str54, LinkedOrd linkedOrd, @NotNull String str55, String str56, String str57, String str58, String str59, String str60, String str61, List<StrategyProfitResponse> list3, StrategyProfitResponse strategyProfitResponse, String str62, Float f, SmartEarnParam smartEarnParam, String str63, String str64, String str65, String str66, @NotNull String str67, StrategyDcaEditResp strategyDcaEditResp, @NotNull String str68, DexOrderDetail dexOrderDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
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
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.instFamily = str4;
        this.ccy = str5;
        this.ctVal = str6;
        this.ordId = str7;
        this.algoId = str8;
        this.sz = str9;
        this.last = str10;
        this.ordType = str11;
        this.side = str12;
        this.posSide = str13;
        this.tdMode = str14;
        this.state = str15;
        this.lever = str16;
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
        this.tpTriggerPx = str17;
        this.tpOrdPx = str18;
        this.slTriggerPx = str19;
        this.slOrdPx = str20;
        this.triggerPx = str21;
        this.ordPx = str22;
        this.actualSz = str23;
        this.actualPx = str24;
        this.actualSide = str25;
        this.triggerTime = str26;
        this.cTime = str27;
        this.notionalUsd = str28;
        this.tgtCcy = str29;
        this.tpTriggerPxType = str30;
        this.slTriggerPxType = str31;
        this.reduceOnly = str32;
        this.triggerPxType = str33;
        this.instList = list;
        this.associate = bool;
        this.uTime = str34;
        this.stgyName = str35;
        this.amt = str36;
        this.recurringList = arrayList;
        this.period = str37;
        this.recurringDay = str38;
        this.investCcy = str39;
        this.recurringTime = str40;
        this.investAmt = str41;
        this.quickMgnType = str42;
        this.cancelSourceReason = str43;
        this.totalCycleProfit = str44;
        this.arbitragePnl = str45;
        this.totalCycleProfitRate = str46;
        this.closeFraction = str47;
        this.ordSource = str48;
        this.bizRefType = str49;
        this.failCode = str50;
        this.failCodeReason = str51;
        this.attachAlgoOrds = list2;
        this.triggerLast = str52;
        this.amendPxOnTriggerType = str53;
        this.avgPx = str54;
        this.linkedOrd = linkedOrd;
        this.ruleType = str55;
        this.source = str56;
        this.chaseType = str57;
        this.chaseVal = str58;
        this.arbitrageProfitRate = str59;
        this.stopChasePrice = str60;
        this.pTime = str61;
        this.profitSnapshots = list3;
        this.latestProfit = strategyProfitResponse;
        this.tradeQuoteCcy = str62;
        this.leveragePrincipal = f;
        this.simpleEarn = smartEarnParam;
        this.displayId = str63;
        this.initOrdAmt = str64;
        this.safetyOrdAmt = str65;
        this.advanceOrdType = str66;
        this.noClosePositionId = str67;
        this.effectiveEditParametersDetails = strategyDcaEditResp;
        this.isDex = str68;
        this.dexOrderDetail = dexOrderDetail;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TradeStrategyOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List list, Boolean bool, String str34, String str35, String str36, ArrayList arrayList, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, List list2, String str52, String str53, String str54, LinkedOrd linkedOrd, String str55, String str56, String str57, String str58, String str59, String str60, String str61, List list3, StrategyProfitResponse strategyProfitResponse, String str62, Float f, SmartEarnParam smartEarnParam, String str63, String str64, String str65, String str66, String str67, StrategyDcaEditResp strategyDcaEditResp, String str68, DexOrderDetail dexOrderDetail, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str69 = (i & 1) != 0 ? "" : str;
        String str70 = (i & 2) != 0 ? "" : str2;
        String str71 = (i & 4) != 0 ? "" : str3;
        String str72 = (i & 8) != 0 ? "" : str4;
        String str73 = (i & 16) != 0 ? "" : str5;
        String str74 = (i & 32) != 0 ? null : str6;
        String str75 = (i & 64) != 0 ? "" : str7;
        String str76 = (i & 128) != 0 ? "" : str8;
        String str77 = (i & 256) != 0 ? "" : str9;
        String str78 = (i & 512) != 0 ? "" : str10;
        String str79 = (i & 1024) != 0 ? "" : str11;
        String str80 = (i & 2048) != 0 ? "" : str12;
        String str81 = (i & 4096) != 0 ? "" : str13;
        String str82 = (i & 8192) != 0 ? "" : str14;
        String str83 = (i & 16384) != 0 ? "" : str15;
        String str84 = (i & 32768) != 0 ? "" : str16;
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp2 = (i & 65536) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        String str85 = (i & 131072) != 0 ? "" : str17;
        String str86 = (i & 262144) != 0 ? "" : str18;
        String str87 = (i & 524288) != 0 ? "" : str19;
        String str88 = (i & 1048576) != 0 ? "" : str20;
        String str89 = (i & 2097152) != 0 ? "" : str21;
        String str90 = (i & 4194304) != 0 ? "" : str22;
        String str91 = (i & 8388608) != 0 ? "" : str23;
        String str92 = (i & 16777216) != 0 ? "" : str24;
        String str93 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str25;
        String str94 = (i & 67108864) != 0 ? "" : str26;
        String str95 = (i & 134217728) != 0 ? "" : str27;
        String str96 = (i & 268435456) != 0 ? "" : str28;
        String str97 = (i & 536870912) != 0 ? null : str29;
        String str98 = (i & 1073741824) != 0 ? null : str30;
        String str99 = (i & Integer.MIN_VALUE) != 0 ? null : str31;
        this(str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, tpSlTriggerParamReqResp2, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? null : str33, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? Boolean.FALSE : bool, (i2 & 16) != 0 ? "" : str34, (i2 & 32) != 0 ? "" : str35, (i2 & 64) != 0 ? "" : str36, (i2 & 128) != 0 ? new ArrayList() : arrayList, (i2 & 256) != 0 ? "" : str37, (i2 & 512) != 0 ? "" : str38, (i2 & 1024) != 0 ? "" : str39, (i2 & 2048) != 0 ? "" : str40, (i2 & 4096) != 0 ? "" : str41, (i2 & 8192) != 0 ? "" : str42, (i2 & 16384) != 0 ? "" : str43, (i2 & 32768) != 0 ? "" : str44, (i2 & 65536) != 0 ? "" : str45, (i2 & 131072) != 0 ? "" : str46, (i2 & 262144) != 0 ? "" : str47, (i2 & 524288) != 0 ? null : str48, (i2 & 1048576) != 0 ? "" : str49, (i2 & 2097152) != 0 ? "" : str50, (i2 & 4194304) != 0 ? "" : str51, (i2 & 8388608) != 0 ? null : list2, (i2 & 16777216) != 0 ? "" : str52, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str53, (i2 & 67108864) != 0 ? "" : str54, (i2 & 134217728) != 0 ? null : linkedOrd, (i2 & 268435456) != 0 ? "" : str55, (i2 & 536870912) != 0 ? null : str56, (i2 & 1073741824) != 0 ? null : str57, (i2 & Integer.MIN_VALUE) != 0 ? null : str58, (i3 & 1) != 0 ? null : str59, (i3 & 2) != 0 ? null : str60, (i3 & 4) != 0 ? "" : str61, (i3 & 8) != 0 ? null : list3, (i3 & 16) != 0 ? null : strategyProfitResponse, (i3 & 32) != 0 ? null : str62, (i3 & 64) != 0 ? null : f, (i3 & 128) != 0 ? null : smartEarnParam, (i3 & 256) != 0 ? null : str63, (i3 & 512) != 0 ? "" : str64, (i3 & 1024) != 0 ? "" : str65, (i3 & 2048) != 0 ? "" : str66, (i3 & 4096) != 0 ? "" : str67, (i3 & 8192) != 0 ? null : strategyDcaEditResp, (i3 & 16384) != 0 ? "" : str68, (i3 & 32768) != 0 ? null : dexOrderDetail);
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<List<? extends TradeStrategyOrderData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeStrategyOrderData> serializer() {
            return TradeStrategyOrderData$$serializer.INSTANCE;
        }

        public final List<BizTradeStrategyInfo> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Activity().getType());
                if (list != null && !list.isEmpty()) {
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "TradeStrategyOrderData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }

    public final boolean isReduceOnly() {
        return Intrinsics.EZpvd((Object) getOrderReduceOnly(), (Object) "true");
    }

    public final boolean isHistory() {
        return Intrinsics.EZpvd((Object) this.state, (Object) "filled") || Intrinsics.EZpvd((Object) this.state, (Object) "canceled");
    }

    public final boolean isOpenPxSl() {
        return Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) "1");
    }

    public final boolean isChaseOrder() {
        return Intrinsics.EZpvd((Object) this.source, (Object) "34");
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public boolean isHistoryOrder() {
        return Intrinsics.EZpvd((Object) this.state, (Object) "filled") || Intrinsics.EZpvd((Object) this.state, (Object) "canceled");
    }

    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoIdAll() {
        String orderId;
        if (!isDexOrder()) {
            return this.algoId;
        }
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (dexOrderDetail == null || (orderId = dexOrderDetail.getOrderId()) == null) ? "" : orderId;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public String getCancelTime() {
        return (Intrinsics.EZpvd((Object) this.ordType, (Object) "conditional") || Intrinsics.EZpvd((Object) this.ordType, (Object) "oco") || Intrinsics.EZpvd((Object) this.ordType, (Object) "trigger") || Intrinsics.EZpvd((Object) this.ordType, (Object) "move_order_stop")) ? (Intrinsics.EZpvd((Object) this.state, (Object) "canceled") || Intrinsics.EZpvd((Object) this.state, (Object) "canceled")) ? this.uTime : "" : "";
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo, o.InterfaceC55847xrf
    public ArrayList<SmartPortfolioListItem> getSmartPortfolioList() {
        return new ArrayList<>();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<DcaTriggerParam> getDcaTriggerParams() {
        return yDY.AhwBna();
    }

    public String getValidOrderId() {
        return C33129mqd.OLrzqt((CharSequence) this.ordId) ? this.ordId : this.algoId;
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<String> getForbiddenFunctions() {
        return new ArrayList<>();
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public ArrayList<String> getHiddenFeaturesData() {
        return new ArrayList<>();
    }

    @Override // o.InterfaceC55726xpQ
    public boolean isDexOrder() {
        return Intrinsics.EZpvd((Object) this.isDex, (Object) "1");
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public Float getLeverPrincipal() {
        return C55770xqH.Activity.copydefault.EZpvd(this.leveragePrincipal);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public SmartArbProfitsInfo getSmartArbProfitsInfo() {
        return new SmartArbProfitsInfo(null, null, null, null, null, null, null, null, null, null, null, 1792, null);
    }

    @Override // com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo
    public List<String> getVipProfitState() {
        return yDY.AhwBna();
    }

    public String getOrderTpTriggerRatio() {
        TradeOrderStopParam tradeOrderStopParam;
        List<TradeOrderStopParam> list = this.attachAlgoOrds;
        if (list == null || (tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) {
            return null;
        }
        return tradeOrderStopParam.getTpTriggerRatio();
    }

    public String getOrderSlTriggerRatio() {
        TradeOrderStopParam tradeOrderStopParam;
        List<TradeOrderStopParam> list = this.attachAlgoOrds;
        if (list == null || (tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) {
            return null;
        }
        return tradeOrderStopParam.getSlTriggerRatio();
    }

    public boolean isTpTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) getOrderTpTriggerRatio()) && C33129mqd.AhwBna(getOrderTpTriggerRatio(), 0);
    }

    public boolean isSlTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) getOrderSlTriggerRatio()) && C33129mqd.AhwBna(getOrderSlTriggerRatio(), 0);
    }
}
