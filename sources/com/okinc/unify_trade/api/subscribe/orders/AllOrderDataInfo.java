package com.okinc.unify_trade.api.subscribe.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail$$serializer;
import com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd;
import com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd$$serializer;
import com.okinc.unify_trade.biz.subscribe.LinkedOrd;
import com.okinc.unify_trade.biz.subscribe.LinkedOrd$$serializer;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam$$serializer;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import java.lang.reflect.Type;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AllOrderDataInfo implements Parcelable {
    private String accFillSz;
    private String activePx;
    private String activePxType;
    private String actualPx;
    private String actualSide;
    private String actualSz;
    private final String advanceOrdType;
    private String algoId;
    private Integer algoOrderStatus;
    private String amendPxOnTriggerType;
    private String amendResult;
    private String amendSource;
    private ArrayList<TradeOrderStopParam> attachAlgoOrds;
    private String avgCost;
    private String avgPx;
    private String bankruptcyPx;
    private String bizErrorCodeDesc;
    private String bizRefType;
    private String cTime;
    private String callbackRatio;
    private String callbackSpread;
    private String cancelReason;
    private String cancelSource;
    private String cancelSourceReason;
    private String cancelTime;
    private String cancelType;
    private String category;
    private String ccy;
    private String clOrderId;
    private String clientOid;
    private String closeFraction;
    private String code;
    private String ctVal;
    private DexOrderDetail dexOrderDetail;
    private String expendSz;
    private String fee;
    private String feeCcy;
    private String feeRate;
    private String fillNotionalUsd;
    private String fillPx;
    private String fillSz;
    private String fillTime;
    private String instFamily;
    private String instId;
    private String instType;
    private String isDex;
    private String isTpLimit;
    private String last;
    private String lastPx;
    private String lever;
    private LinkedAlgoOrd linkedAlgoOrd;
    private LinkedOrd linkedOrd;
    private String moveTriggerPx;
    private String multiplier;
    private String notionalUsd;
    private String obtainedSz;
    private String ordId;
    private String ordPx;
    private String ordSource;
    private String ordType;
    private String pTime;
    private String pnl;
    private String pnlCcy;
    private String pnlRatio;
    private String posSide;
    private String px;
    private String pxType;
    private String pxUsd;
    private String pxVol;
    private String quickMgnType;
    private String rebate;
    private String rebateCcy;
    private String reduceOnly;
    private String ruleType;
    private String side;
    private String sideMsg;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String source;
    private String sourceAlgoId;
    private String sourceIntValue;
    private String state;
    private String stopType;
    private String sz;
    private String tag;
    private String tdMode;
    private String tgtCcy;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tradeId;
    private String tradeQuoteCcy;
    private String triggerLast;
    private String triggerPx;
    private String triggerPxType;
    private String triggerTime;
    private String triggerType;
    private String uTime;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AllOrderDataInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AllOrderDataInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AllOrderDataInfo createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
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
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
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
            String string52 = parcel.readString();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            String string55 = parcel.readString();
            String string56 = parcel.readString();
            String string57 = parcel.readString();
            String string58 = parcel.readString();
            String string59 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string60 = parcel.readString();
            String string61 = parcel.readString();
            String string62 = parcel.readString();
            String string63 = parcel.readString();
            String string64 = parcel.readString();
            String string65 = parcel.readString();
            String string66 = parcel.readString();
            String string67 = parcel.readString();
            String string68 = parcel.readString();
            String string69 = parcel.readString();
            String string70 = parcel.readString();
            String string71 = parcel.readString();
            String string72 = parcel.readString();
            String string73 = parcel.readString();
            String string74 = parcel.readString();
            String string75 = parcel.readString();
            String string76 = parcel.readString();
            String string77 = parcel.readString();
            String string78 = parcel.readString();
            String string79 = parcel.readString();
            String string80 = parcel.readString();
            String string81 = parcel.readString();
            String string82 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(TradeOrderStopParam.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new AllOrderDataInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, string59, numValueOf, string60, string61, string62, string63, string64, string65, string66, string67, string68, string69, string70, string71, string72, string73, string74, string75, string76, string77, string78, string79, string80, string81, string82, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LinkedOrd.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkedAlgoOrd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexOrderDetail.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AllOrderDataInfo[] newArray(int i) {
            return new AllOrderDataInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AllOrderDataInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LinkedOrd) null, (LinkedAlgoOrd) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexOrderDetail) null, -1, -1, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetail component100() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.sideMsg;
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
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.expendSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.obtainedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.cancelSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.clOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.cancelReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.cancelTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.bankruptcyPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.fillNotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.bizErrorCodeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component60() {
        return this.algoOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.actualPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.clientOid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.sourceIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.actualSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.amendResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.amendSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component83() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> component84() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.triggerLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.lastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component88() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component89() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd component91() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedAlgoOrd component92() {
        return this.linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component93() {
        return this.pxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.isDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllOrderDataInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, Integer num, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList<TradeOrderStopParam> arrayList, String str83, String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str89, String str90, String str91, @NotNull String str92, String str93, String str94, String str95, DexOrderDetail dexOrderDetail) {
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str92, "");
        return new AllOrderDataInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, num, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, arrayList, str83, str84, str85, str86, str87, str88, linkedOrd, linkedAlgoOrd, str89, str90, str91, str92, str93, str94, str95, dexOrderDetail);
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
        if (!(obj instanceof AllOrderDataInfo)) {
            return false;
        }
        AllOrderDataInfo allOrderDataInfo = (AllOrderDataInfo) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) allOrderDataInfo.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) allOrderDataInfo.instId) && Intrinsics.EZpvd((Object) this.ordId, (Object) allOrderDataInfo.ordId) && Intrinsics.EZpvd((Object) this.clOrderId, (Object) allOrderDataInfo.clOrderId) && Intrinsics.EZpvd((Object) this.tag, (Object) allOrderDataInfo.tag) && Intrinsics.EZpvd((Object) this.px, (Object) allOrderDataInfo.px) && Intrinsics.EZpvd((Object) this.sz, (Object) allOrderDataInfo.sz) && Intrinsics.EZpvd((Object) this.accFillSz, (Object) allOrderDataInfo.accFillSz) && Intrinsics.EZpvd((Object) this.pnl, (Object) allOrderDataInfo.pnl) && Intrinsics.EZpvd((Object) this.ordType, (Object) allOrderDataInfo.ordType) && Intrinsics.EZpvd((Object) this.side, (Object) allOrderDataInfo.side) && Intrinsics.EZpvd((Object) this.sideMsg, (Object) allOrderDataInfo.sideMsg) && Intrinsics.EZpvd((Object) this.posSide, (Object) allOrderDataInfo.posSide) && Intrinsics.EZpvd((Object) this.tdMode, (Object) allOrderDataInfo.tdMode) && Intrinsics.EZpvd((Object) this.fillPx, (Object) allOrderDataInfo.fillPx) && Intrinsics.EZpvd((Object) this.expendSz, (Object) allOrderDataInfo.expendSz) && Intrinsics.EZpvd((Object) this.obtainedSz, (Object) allOrderDataInfo.obtainedSz) && Intrinsics.EZpvd((Object) this.fillSz, (Object) allOrderDataInfo.fillSz) && Intrinsics.EZpvd((Object) this.tradeId, (Object) allOrderDataInfo.tradeId) && Intrinsics.EZpvd((Object) this.fillTime, (Object) allOrderDataInfo.fillTime) && Intrinsics.EZpvd((Object) this.avgPx, (Object) allOrderDataInfo.avgPx) && Intrinsics.EZpvd((Object) this.state, (Object) allOrderDataInfo.state) && Intrinsics.EZpvd((Object) this.lever, (Object) allOrderDataInfo.lever) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) allOrderDataInfo.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) allOrderDataInfo.tpOrdPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) allOrderDataInfo.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) allOrderDataInfo.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) allOrderDataInfo.slOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) allOrderDataInfo.slTriggerPxType) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) allOrderDataInfo.feeCcy) && Intrinsics.EZpvd((Object) this.fee, (Object) allOrderDataInfo.fee) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) allOrderDataInfo.rebateCcy) && Intrinsics.EZpvd((Object) this.rebate, (Object) allOrderDataInfo.rebate) && Intrinsics.EZpvd((Object) this.category, (Object) allOrderDataInfo.category) && Intrinsics.EZpvd((Object) this.uTime, (Object) allOrderDataInfo.uTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) allOrderDataInfo.cTime) && Intrinsics.EZpvd((Object) this.ccy, (Object) allOrderDataInfo.ccy) && Intrinsics.EZpvd((Object) this.cancelSource, (Object) allOrderDataInfo.cancelSource) && Intrinsics.EZpvd((Object) this.cancelSourceReason, (Object) allOrderDataInfo.cancelSourceReason) && Intrinsics.EZpvd((Object) this.cancelReason, (Object) allOrderDataInfo.cancelReason) && Intrinsics.EZpvd((Object) this.cancelTime, (Object) allOrderDataInfo.cancelTime) && Intrinsics.EZpvd((Object) this.ctVal, (Object) allOrderDataInfo.ctVal) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) allOrderDataInfo.pnlCcy) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) allOrderDataInfo.pnlRatio) && Intrinsics.EZpvd((Object) this.uly, (Object) allOrderDataInfo.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) allOrderDataInfo.instFamily) && Intrinsics.EZpvd((Object) this.avgCost, (Object) allOrderDataInfo.avgCost) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) allOrderDataInfo.triggerPx) && Intrinsics.EZpvd((Object) this.bankruptcyPx, (Object) allOrderDataInfo.bankruptcyPx) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) allOrderDataInfo.notionalUsd) && Intrinsics.EZpvd((Object) this.fillNotionalUsd, (Object) allOrderDataInfo.fillNotionalUsd) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) allOrderDataInfo.tgtCcy) && Intrinsics.EZpvd((Object) this.source, (Object) allOrderDataInfo.source) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) allOrderDataInfo.reduceOnly) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) allOrderDataInfo.quickMgnType) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) allOrderDataInfo.bizRefType) && Intrinsics.EZpvd((Object) this.bizErrorCodeDesc, (Object) allOrderDataInfo.bizErrorCodeDesc) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) allOrderDataInfo.closeFraction) && Intrinsics.EZpvd((Object) this.algoId, (Object) allOrderDataInfo.algoId) && Intrinsics.EZpvd(this.algoOrderStatus, allOrderDataInfo.algoOrderStatus) && Intrinsics.EZpvd((Object) this.ordPx, (Object) allOrderDataInfo.ordPx) && Intrinsics.EZpvd((Object) this.actualPx, (Object) allOrderDataInfo.actualPx) && Intrinsics.EZpvd((Object) this.actualSz, (Object) allOrderDataInfo.actualSz) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) allOrderDataInfo.triggerTime) && Intrinsics.EZpvd((Object) this.last, (Object) allOrderDataInfo.last) && Intrinsics.EZpvd((Object) this.activePx, (Object) allOrderDataInfo.activePx) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) allOrderDataInfo.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) allOrderDataInfo.callbackSpread) && Intrinsics.EZpvd((Object) this.cancelType, (Object) allOrderDataInfo.cancelType) && Intrinsics.EZpvd((Object) this.clientOid, (Object) allOrderDataInfo.clientOid) && Intrinsics.EZpvd((Object) this.moveTriggerPx, (Object) allOrderDataInfo.moveTriggerPx) && Intrinsics.EZpvd((Object) this.pTime, (Object) allOrderDataInfo.pTime) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) allOrderDataInfo.sourceAlgoId) && Intrinsics.EZpvd((Object) this.sourceIntValue, (Object) allOrderDataInfo.sourceIntValue) && Intrinsics.EZpvd((Object) this.stopType, (Object) allOrderDataInfo.stopType) && Intrinsics.EZpvd((Object) this.actualSide, (Object) allOrderDataInfo.actualSide) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) allOrderDataInfo.triggerPxType) && Intrinsics.EZpvd((Object) this.activePxType, (Object) allOrderDataInfo.activePxType) && Intrinsics.EZpvd((Object) this.triggerType, (Object) allOrderDataInfo.triggerType) && Intrinsics.EZpvd((Object) this.ordSource, (Object) allOrderDataInfo.ordSource) && Intrinsics.EZpvd((Object) this.amendResult, (Object) allOrderDataInfo.amendResult) && Intrinsics.EZpvd((Object) this.amendSource, (Object) allOrderDataInfo.amendSource) && Intrinsics.EZpvd((Object) this.code, (Object) allOrderDataInfo.code) && Intrinsics.EZpvd(this.attachAlgoOrds, allOrderDataInfo.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) allOrderDataInfo.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.triggerLast, (Object) allOrderDataInfo.triggerLast) && Intrinsics.EZpvd((Object) this.lastPx, (Object) allOrderDataInfo.lastPx) && Intrinsics.EZpvd((Object) this.feeRate, (Object) allOrderDataInfo.feeRate) && Intrinsics.EZpvd((Object) this.multiplier, (Object) allOrderDataInfo.multiplier) && Intrinsics.EZpvd((Object) this.isTpLimit, (Object) allOrderDataInfo.isTpLimit) && Intrinsics.EZpvd(this.linkedOrd, allOrderDataInfo.linkedOrd) && Intrinsics.EZpvd(this.linkedAlgoOrd, allOrderDataInfo.linkedAlgoOrd) && Intrinsics.EZpvd((Object) this.pxType, (Object) allOrderDataInfo.pxType) && Intrinsics.EZpvd((Object) this.pxUsd, (Object) allOrderDataInfo.pxUsd) && Intrinsics.EZpvd((Object) this.pxVol, (Object) allOrderDataInfo.pxVol) && Intrinsics.EZpvd((Object) this.ruleType, (Object) allOrderDataInfo.ruleType) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) allOrderDataInfo.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.isDex, (Object) allOrderDataInfo.isDex) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) allOrderDataInfo.advanceOrdType) && Intrinsics.EZpvd(this.dexOrderDetail, allOrderDataInfo.dexOrderDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccFillSz() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePxType() {
        return this.activePxType;
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
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAlgoOrderStatus() {
        return this.algoOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendResult() {
        return this.amendResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendSource() {
        return this.amendSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgCost() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankruptcyPx() {
        return this.bankruptcyPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizErrorCodeDesc() {
        return this.bizErrorCodeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelSource() {
        return this.cancelSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelSourceReason() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelTime() {
        return this.cancelTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClOrderId() {
        return this.clOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientOid() {
        return this.clientOid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetail getDexOrderDetail() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpendSz() {
        return this.expendSz;
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
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillNotionalUsd() {
        return this.fillNotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillPx() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSz() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillTime() {
        return this.fillTime;
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
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPx() {
        return this.lastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedAlgoOrd getLinkedAlgoOrd() {
        return this.linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd getLinkedOrd() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveTriggerPx() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMultiplier() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getObtainedSz() {
        return this.obtainedSz;
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
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxType() {
        return this.pxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxUsd() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVol() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebate() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebateCcy() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSideMsg() {
        return this.sideMsg;
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
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceIntValue() {
        return this.sourceIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
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
    public final String getTag() {
        return this.tag;
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
    public final String getTpOrdPx() {
        return this.tpOrdPx;
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
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
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
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ordId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.clOrderId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tag;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.px;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sz;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.accFillSz;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.pnl;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.ordType;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.side;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.sideMsg;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.posSide;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tdMode;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.fillPx;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.expendSz;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.obtainedSz;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.fillSz;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.tradeId;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.fillTime;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.avgPx;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.state;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.lever;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.tpTriggerPx;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.tpOrdPx;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.tpTriggerPxType;
        int iHashCode26 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.slTriggerPx;
        int iHashCode27 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.slOrdPx;
        int iHashCode28 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.slTriggerPxType;
        int iHashCode29 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.feeCcy;
        int iHashCode30 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.fee;
        int iHashCode31 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.rebateCcy;
        int iHashCode32 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.rebate;
        int iHashCode33 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.category;
        int iHashCode34 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.uTime;
        int iHashCode35 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.cTime;
        int iHashCode36 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.ccy;
        int iHashCode37 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.cancelSource;
        int iHashCode38 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.cancelSourceReason;
        int iHashCode39 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.cancelReason;
        int iHashCode40 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.cancelTime;
        int iHashCode41 = str41 == null ? 0 : str41.hashCode();
        String str42 = this.ctVal;
        int iHashCode42 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.pnlCcy;
        int iHashCode43 = str43 == null ? 0 : str43.hashCode();
        String str44 = this.pnlRatio;
        int iHashCode44 = str44 == null ? 0 : str44.hashCode();
        String str45 = this.uly;
        int iHashCode45 = str45 == null ? 0 : str45.hashCode();
        String str46 = this.instFamily;
        int iHashCode46 = str46 == null ? 0 : str46.hashCode();
        String str47 = this.avgCost;
        int iHashCode47 = str47 == null ? 0 : str47.hashCode();
        String str48 = this.triggerPx;
        int iHashCode48 = str48 == null ? 0 : str48.hashCode();
        String str49 = this.bankruptcyPx;
        int iHashCode49 = str49 == null ? 0 : str49.hashCode();
        String str50 = this.notionalUsd;
        int iHashCode50 = str50 == null ? 0 : str50.hashCode();
        String str51 = this.fillNotionalUsd;
        int iHashCode51 = str51 == null ? 0 : str51.hashCode();
        String str52 = this.tgtCcy;
        int iHashCode52 = str52 == null ? 0 : str52.hashCode();
        String str53 = this.source;
        int iHashCode53 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.reduceOnly;
        int iHashCode54 = str54 == null ? 0 : str54.hashCode();
        String str55 = this.quickMgnType;
        int iHashCode55 = str55 == null ? 0 : str55.hashCode();
        String str56 = this.bizRefType;
        int iHashCode56 = str56 == null ? 0 : str56.hashCode();
        String str57 = this.bizErrorCodeDesc;
        int iHashCode57 = str57 == null ? 0 : str57.hashCode();
        String str58 = this.closeFraction;
        int iHashCode58 = str58 == null ? 0 : str58.hashCode();
        String str59 = this.algoId;
        int iHashCode59 = str59 == null ? 0 : str59.hashCode();
        Integer num = this.algoOrderStatus;
        int iHashCode60 = num == null ? 0 : num.hashCode();
        String str60 = this.ordPx;
        int iHashCode61 = str60 == null ? 0 : str60.hashCode();
        String str61 = this.actualPx;
        int iHashCode62 = str61 == null ? 0 : str61.hashCode();
        String str62 = this.actualSz;
        int iHashCode63 = str62 == null ? 0 : str62.hashCode();
        String str63 = this.triggerTime;
        int iHashCode64 = str63 == null ? 0 : str63.hashCode();
        String str64 = this.last;
        int iHashCode65 = str64 == null ? 0 : str64.hashCode();
        String str65 = this.activePx;
        int iHashCode66 = str65 == null ? 0 : str65.hashCode();
        String str66 = this.callbackRatio;
        int iHashCode67 = str66 == null ? 0 : str66.hashCode();
        String str67 = this.callbackSpread;
        int iHashCode68 = str67 == null ? 0 : str67.hashCode();
        String str68 = this.cancelType;
        int iHashCode69 = str68 == null ? 0 : str68.hashCode();
        String str69 = this.clientOid;
        int iHashCode70 = str69 == null ? 0 : str69.hashCode();
        String str70 = this.moveTriggerPx;
        int iHashCode71 = str70 == null ? 0 : str70.hashCode();
        String str71 = this.pTime;
        int iHashCode72 = str71 == null ? 0 : str71.hashCode();
        String str72 = this.sourceAlgoId;
        int iHashCode73 = str72 == null ? 0 : str72.hashCode();
        String str73 = this.sourceIntValue;
        int iHashCode74 = str73 == null ? 0 : str73.hashCode();
        String str74 = this.stopType;
        int iHashCode75 = str74 == null ? 0 : str74.hashCode();
        String str75 = this.actualSide;
        int iHashCode76 = str75 == null ? 0 : str75.hashCode();
        String str76 = this.triggerPxType;
        int iHashCode77 = str76 == null ? 0 : str76.hashCode();
        String str77 = this.activePxType;
        int iHashCode78 = str77 == null ? 0 : str77.hashCode();
        String str78 = this.triggerType;
        int iHashCode79 = str78 == null ? 0 : str78.hashCode();
        String str79 = this.ordSource;
        int iHashCode80 = str79 == null ? 0 : str79.hashCode();
        String str80 = this.amendResult;
        int iHashCode81 = str80 == null ? 0 : str80.hashCode();
        String str81 = this.amendSource;
        int iHashCode82 = str81 == null ? 0 : str81.hashCode();
        String str82 = this.code;
        int iHashCode83 = str82 == null ? 0 : str82.hashCode();
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        int iHashCode84 = arrayList == null ? 0 : arrayList.hashCode();
        String str83 = this.amendPxOnTriggerType;
        int iHashCode85 = str83 == null ? 0 : str83.hashCode();
        String str84 = this.triggerLast;
        int iHashCode86 = str84 == null ? 0 : str84.hashCode();
        int iHashCode87 = this.lastPx.hashCode();
        int iHashCode88 = this.feeRate.hashCode();
        int iHashCode89 = this.multiplier.hashCode();
        int iHashCode90 = this.isTpLimit.hashCode();
        LinkedOrd linkedOrd = this.linkedOrd;
        int iHashCode91 = linkedOrd == null ? 0 : linkedOrd.hashCode();
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        int iHashCode92 = linkedAlgoOrd == null ? 0 : linkedAlgoOrd.hashCode();
        String str85 = this.pxType;
        int iHashCode93 = str85 == null ? 0 : str85.hashCode();
        String str86 = this.pxUsd;
        int iHashCode94 = str86 == null ? 0 : str86.hashCode();
        String str87 = this.pxVol;
        int iHashCode95 = str87 == null ? 0 : str87.hashCode();
        int iHashCode96 = this.ruleType.hashCode();
        String str88 = this.tradeQuoteCcy;
        int iHashCode97 = str88 == null ? 0 : str88.hashCode();
        String str89 = this.isDex;
        int iHashCode98 = str89 == null ? 0 : str89.hashCode();
        String str90 = this.advanceOrdType;
        int iHashCode99 = str90 == null ? 0 : str90.hashCode();
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + (dexOrderDetail == null ? 0 : dexOrderDetail.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDex() {
        return this.isDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isTpLimit() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccFillSz(String str) {
        this.accFillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePx(String str) {
        this.activePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePxType(String str) {
        this.activePxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualPx(String str) {
        this.actualPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSide(String str) {
        this.actualSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSz(String str) {
        this.actualSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrderStatus(Integer num) {
        this.algoOrderStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(String str) {
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendResult(String str) {
        this.amendResult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendSource(String str) {
        this.amendSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(ArrayList<TradeOrderStopParam> arrayList) {
        this.attachAlgoOrds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgCost(String str) {
        this.avgCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(String str) {
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankruptcyPx(String str) {
        this.bankruptcyPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizErrorCodeDesc(String str) {
        this.bizErrorCodeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(String str) {
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackRatio(String str) {
        this.callbackRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(String str) {
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelReason(String str) {
        this.cancelReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelSource(String str) {
        this.cancelSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelSourceReason(String str) {
        this.cancelSourceReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelTime(String str) {
        this.cancelTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelType(String str) {
        this.cancelType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(String str) {
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClOrderId(String str) {
        this.clOrderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientOid(String str) {
        this.clientOid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFraction(String str) {
        this.closeFraction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(String str) {
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDex(String str) {
        this.isDex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexOrderDetail(DexOrderDetail dexOrderDetail) {
        this.dexOrderDetail = dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpendSz(String str) {
        this.expendSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(String str) {
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillNotionalUsd(String str) {
        this.fillNotionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillPx(String str) {
        this.fillPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSz(String str) {
        this.fillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillTime(String str) {
        this.fillTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
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
    public final void setLast(String str) {
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedAlgoOrd(LinkedAlgoOrd linkedAlgoOrd) {
        this.linkedAlgoOrd = linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedOrd(LinkedOrd linkedOrd) {
        this.linkedOrd = linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveTriggerPx(String str) {
        this.moveTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiplier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.multiplier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(String str) {
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObtainedSz(String str) {
        this.obtainedSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(String str) {
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdPx(String str) {
        this.ordPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdSource(String str) {
        this.ordSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(String str) {
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlCcy(String str) {
        this.pnlCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxType(String str) {
        this.pxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxUsd(String str) {
        this.pxUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVol(String str) {
        this.pxVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(String str) {
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebate(String str) {
        this.rebate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebateCcy(String str) {
        this.rebateCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(String str) {
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSideMsg(String str) {
        this.sideMsg = str;
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
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(String str) {
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceIntValue(String str) {
        this.sourceIntValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(String str) {
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTgtCcy(String str) {
        this.tgtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isTpLimit = str;
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
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(String str) {
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerLast(String str) {
        this.triggerLast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(String str) {
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(String str) {
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(String str) {
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(String str) {
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AllOrderDataInfo(instType=" + this.instType + ", instId=" + this.instId + ", ordId=" + this.ordId + ", clOrderId=" + this.clOrderId + ", tag=" + this.tag + ", px=" + this.px + ", sz=" + this.sz + ", accFillSz=" + this.accFillSz + ", pnl=" + this.pnl + ", ordType=" + this.ordType + ", side=" + this.side + ", sideMsg=" + this.sideMsg + ", posSide=" + this.posSide + ", tdMode=" + this.tdMode + ", fillPx=" + this.fillPx + ", expendSz=" + this.expendSz + ", obtainedSz=" + this.obtainedSz + ", fillSz=" + this.fillSz + ", tradeId=" + this.tradeId + ", fillTime=" + this.fillTime + ", avgPx=" + this.avgPx + ", state=" + this.state + ", lever=" + this.lever + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", slTriggerPxType=" + this.slTriggerPxType + ", feeCcy=" + this.feeCcy + ", fee=" + this.fee + ", rebateCcy=" + this.rebateCcy + ", rebate=" + this.rebate + ", category=" + this.category + ", uTime=" + this.uTime + ", cTime=" + this.cTime + ", ccy=" + this.ccy + ", cancelSource=" + this.cancelSource + ", cancelSourceReason=" + this.cancelSourceReason + ", cancelReason=" + this.cancelReason + ", cancelTime=" + this.cancelTime + ", ctVal=" + this.ctVal + ", pnlCcy=" + this.pnlCcy + ", pnlRatio=" + this.pnlRatio + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", avgCost=" + this.avgCost + ", triggerPx=" + this.triggerPx + ", bankruptcyPx=" + this.bankruptcyPx + ", notionalUsd=" + this.notionalUsd + ", fillNotionalUsd=" + this.fillNotionalUsd + ", tgtCcy=" + this.tgtCcy + ", source=" + this.source + ", reduceOnly=" + this.reduceOnly + ", quickMgnType=" + this.quickMgnType + ", bizRefType=" + this.bizRefType + ", bizErrorCodeDesc=" + this.bizErrorCodeDesc + ", closeFraction=" + this.closeFraction + ", algoId=" + this.algoId + ", algoOrderStatus=" + this.algoOrderStatus + ", ordPx=" + this.ordPx + ", actualPx=" + this.actualPx + ", actualSz=" + this.actualSz + ", triggerTime=" + this.triggerTime + ", last=" + this.last + ", activePx=" + this.activePx + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", cancelType=" + this.cancelType + ", clientOid=" + this.clientOid + ", moveTriggerPx=" + this.moveTriggerPx + ", pTime=" + this.pTime + ", sourceAlgoId=" + this.sourceAlgoId + ", sourceIntValue=" + this.sourceIntValue + ", stopType=" + this.stopType + ", actualSide=" + this.actualSide + ", triggerPxType=" + this.triggerPxType + ", activePxType=" + this.activePxType + ", triggerType=" + this.triggerType + ", ordSource=" + this.ordSource + ", amendResult=" + this.amendResult + ", amendSource=" + this.amendSource + ", code=" + this.code + ", attachAlgoOrds=" + this.attachAlgoOrds + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", triggerLast=" + this.triggerLast + ", lastPx=" + this.lastPx + ", feeRate=" + this.feeRate + ", multiplier=" + this.multiplier + ", isTpLimit=" + this.isTpLimit + ", linkedOrd=" + this.linkedOrd + ", linkedAlgoOrd=" + this.linkedAlgoOrd + ", pxType=" + this.pxType + ", pxUsd=" + this.pxUsd + ", pxVol=" + this.pxVol + ", ruleType=" + this.ruleType + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", isDex=" + this.isDex + ", advanceOrdType=" + this.advanceOrdType + ", dexOrderDetail=" + this.dexOrderDetail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.ordId);
        parcel.writeString(this.clOrderId);
        parcel.writeString(this.tag);
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
        parcel.writeString(this.accFillSz);
        parcel.writeString(this.pnl);
        parcel.writeString(this.ordType);
        parcel.writeString(this.side);
        parcel.writeString(this.sideMsg);
        parcel.writeString(this.posSide);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.fillPx);
        parcel.writeString(this.expendSz);
        parcel.writeString(this.obtainedSz);
        parcel.writeString(this.fillSz);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.fillTime);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.state);
        parcel.writeString(this.lever);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.fee);
        parcel.writeString(this.rebateCcy);
        parcel.writeString(this.rebate);
        parcel.writeString(this.category);
        parcel.writeString(this.uTime);
        parcel.writeString(this.cTime);
        parcel.writeString(this.ccy);
        parcel.writeString(this.cancelSource);
        parcel.writeString(this.cancelSourceReason);
        parcel.writeString(this.cancelReason);
        parcel.writeString(this.cancelTime);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.uly);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.bankruptcyPx);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.fillNotionalUsd);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.source);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.bizErrorCodeDesc);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.algoId);
        Integer num = this.algoOrderStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.ordPx);
        parcel.writeString(this.actualPx);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.last);
        parcel.writeString(this.activePx);
        parcel.writeString(this.callbackRatio);
        parcel.writeString(this.callbackSpread);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.clientOid);
        parcel.writeString(this.moveTriggerPx);
        parcel.writeString(this.pTime);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.sourceIntValue);
        parcel.writeString(this.stopType);
        parcel.writeString(this.actualSide);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.activePxType);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.ordSource);
        parcel.writeString(this.amendResult);
        parcel.writeString(this.amendSource);
        parcel.writeString(this.code);
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TradeOrderStopParam> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.triggerLast);
        parcel.writeString(this.lastPx);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.multiplier);
        parcel.writeString(this.isTpLimit);
        LinkedOrd linkedOrd = this.linkedOrd;
        if (linkedOrd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedOrd.writeToParcel(parcel, i);
        }
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        if (linkedAlgoOrd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedAlgoOrd.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pxType);
        parcel.writeString(this.pxUsd);
        parcel.writeString(this.pxVol);
        parcel.writeString(this.ruleType);
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.isDex);
        parcel.writeString(this.advanceOrdType);
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        if (dexOrderDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexOrderDetail.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AllOrderDataInfo(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, Integer num, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList arrayList, String str83, String str84, String str85, String str86, String str87, String str88, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str89, String str90, String str91, String str92, String str93, String str94, String str95, DexOrderDetail dexOrderDetail, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = null;
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.ordId = null;
        } else {
            this.ordId = str3;
        }
        if ((i & 8) == 0) {
            this.clOrderId = null;
        } else {
            this.clOrderId = str4;
        }
        if ((i & 16) == 0) {
            this.tag = null;
        } else {
            this.tag = str5;
        }
        if ((i & 32) == 0) {
            this.px = null;
        } else {
            this.px = str6;
        }
        if ((i & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str7;
        }
        if ((i & 128) == 0) {
            this.accFillSz = null;
        } else {
            this.accFillSz = str8;
        }
        if ((i & 256) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str9;
        }
        if ((i & 512) == 0) {
            this.ordType = null;
        } else {
            this.ordType = str10;
        }
        if ((i & 1024) == 0) {
            this.side = null;
        } else {
            this.side = str11;
        }
        if ((i & 2048) == 0) {
            this.sideMsg = null;
        } else {
            this.sideMsg = str12;
        }
        if ((i & 4096) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str13;
        }
        if ((i & 8192) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str14;
        }
        if ((i & 16384) == 0) {
            this.fillPx = null;
        } else {
            this.fillPx = str15;
        }
        if ((i & 32768) == 0) {
            this.expendSz = null;
        } else {
            this.expendSz = str16;
        }
        if ((i & 65536) == 0) {
            this.obtainedSz = null;
        } else {
            this.obtainedSz = str17;
        }
        if ((i & 131072) == 0) {
            this.fillSz = null;
        } else {
            this.fillSz = str18;
        }
        if ((i & 262144) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str19;
        }
        if ((i & 524288) == 0) {
            this.fillTime = null;
        } else {
            this.fillTime = str20;
        }
        if ((1048576 & i) == 0) {
            this.avgPx = null;
        } else {
            this.avgPx = str21;
        }
        if ((2097152 & i) == 0) {
            this.state = null;
        } else {
            this.state = str22;
        }
        if ((4194304 & i) == 0) {
            this.lever = null;
        } else {
            this.lever = str23;
        }
        if ((8388608 & i) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str24;
        }
        if ((16777216 & i) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str25;
        }
        if ((33554432 & i) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str26;
        }
        if ((67108864 & i) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str27;
        }
        if ((134217728 & i) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str28;
        }
        if ((268435456 & i) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str29;
        }
        if ((536870912 & i) == 0) {
            this.feeCcy = null;
        } else {
            this.feeCcy = str30;
        }
        if ((1073741824 & i) == 0) {
            this.fee = null;
        } else {
            this.fee = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.rebateCcy = null;
        } else {
            this.rebateCcy = str32;
        }
        if ((i2 & 1) == 0) {
            this.rebate = null;
        } else {
            this.rebate = str33;
        }
        if ((i2 & 2) == 0) {
            this.category = null;
        } else {
            this.category = str34;
        }
        if ((i2 & 4) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str35;
        }
        if ((i2 & 8) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str36;
        }
        if ((i2 & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str37;
        }
        if ((i2 & 32) == 0) {
            this.cancelSource = null;
        } else {
            this.cancelSource = str38;
        }
        if ((i2 & 64) == 0) {
            this.cancelSourceReason = null;
        } else {
            this.cancelSourceReason = str39;
        }
        if ((i2 & 128) == 0) {
            this.cancelReason = null;
        } else {
            this.cancelReason = str40;
        }
        if ((i2 & 256) == 0) {
            this.cancelTime = null;
        } else {
            this.cancelTime = str41;
        }
        if ((i2 & 512) == 0) {
            this.ctVal = null;
        } else {
            this.ctVal = str42;
        }
        if ((i2 & 1024) == 0) {
            this.pnlCcy = null;
        } else {
            this.pnlCcy = str43;
        }
        if ((i2 & 2048) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str44;
        }
        if ((i2 & 4096) == 0) {
            this.uly = null;
        } else {
            this.uly = str45;
        }
        if ((i2 & 8192) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str46;
        }
        if ((i2 & 16384) == 0) {
            this.avgCost = null;
        } else {
            this.avgCost = str47;
        }
        if ((i2 & 32768) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str48;
        }
        if ((i2 & 65536) == 0) {
            this.bankruptcyPx = null;
        } else {
            this.bankruptcyPx = str49;
        }
        if ((i2 & 131072) == 0) {
            this.notionalUsd = null;
        } else {
            this.notionalUsd = str50;
        }
        if ((i2 & 262144) == 0) {
            this.fillNotionalUsd = null;
        } else {
            this.fillNotionalUsd = str51;
        }
        if ((i2 & 524288) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str52;
        }
        if ((1048576 & i2) == 0) {
            this.source = null;
        } else {
            this.source = str53;
        }
        if ((2097152 & i2) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = str54;
        }
        if ((4194304 & i2) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str55;
        }
        if ((8388608 & i2) == 0) {
            this.bizRefType = null;
        } else {
            this.bizRefType = str56;
        }
        if ((16777216 & i2) == 0) {
            this.bizErrorCodeDesc = null;
        } else {
            this.bizErrorCodeDesc = str57;
        }
        if ((33554432 & i2) == 0) {
            this.closeFraction = null;
        } else {
            this.closeFraction = str58;
        }
        if ((67108864 & i2) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str59;
        }
        if ((134217728 & i2) == 0) {
            this.algoOrderStatus = null;
        } else {
            this.algoOrderStatus = num;
        }
        if ((268435456 & i2) == 0) {
            this.ordPx = null;
        } else {
            this.ordPx = str60;
        }
        if ((536870912 & i2) == 0) {
            this.actualPx = null;
        } else {
            this.actualPx = str61;
        }
        if ((1073741824 & i2) == 0) {
            this.actualSz = null;
        } else {
            this.actualSz = str62;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.triggerTime = null;
        } else {
            this.triggerTime = str63;
        }
        if ((i3 & 1) == 0) {
            this.last = null;
        } else {
            this.last = str64;
        }
        if ((i3 & 2) == 0) {
            this.activePx = null;
        } else {
            this.activePx = str65;
        }
        if ((i3 & 4) == 0) {
            this.callbackRatio = null;
        } else {
            this.callbackRatio = str66;
        }
        if ((i3 & 8) == 0) {
            this.callbackSpread = null;
        } else {
            this.callbackSpread = str67;
        }
        if ((i3 & 16) == 0) {
            this.cancelType = null;
        } else {
            this.cancelType = str68;
        }
        if ((i3 & 32) == 0) {
            this.clientOid = null;
        } else {
            this.clientOid = str69;
        }
        if ((i3 & 64) == 0) {
            this.moveTriggerPx = null;
        } else {
            this.moveTriggerPx = str70;
        }
        if ((i3 & 128) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str71;
        }
        if ((i3 & 256) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str72;
        }
        if ((i3 & 512) == 0) {
            this.sourceIntValue = null;
        } else {
            this.sourceIntValue = str73;
        }
        if ((i3 & 1024) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str74;
        }
        if ((i3 & 2048) == 0) {
            this.actualSide = null;
        } else {
            this.actualSide = str75;
        }
        if ((i3 & 4096) == 0) {
            this.triggerPxType = null;
        } else {
            this.triggerPxType = str76;
        }
        if ((i3 & 8192) == 0) {
            this.activePxType = null;
        } else {
            this.activePxType = str77;
        }
        if ((i3 & 16384) == 0) {
            this.triggerType = null;
        } else {
            this.triggerType = str78;
        }
        if ((i3 & 32768) == 0) {
            this.ordSource = null;
        } else {
            this.ordSource = str79;
        }
        if ((i3 & 65536) == 0) {
            this.amendResult = null;
        } else {
            this.amendResult = str80;
        }
        if ((i3 & 131072) == 0) {
            this.amendSource = null;
        } else {
            this.amendSource = str81;
        }
        if ((i3 & 262144) == 0) {
            this.code = null;
        } else {
            this.code = str82;
        }
        if ((i3 & 524288) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = arrayList;
        }
        if ((1048576 & i3) == 0) {
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str83;
        }
        if ((2097152 & i3) == 0) {
            this.triggerLast = null;
        } else {
            this.triggerLast = str84;
        }
        if ((4194304 & i3) == 0) {
            this.lastPx = "";
        } else {
            this.lastPx = str85;
        }
        if ((8388608 & i3) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str86;
        }
        if ((16777216 & i3) == 0) {
            this.multiplier = "";
        } else {
            this.multiplier = str87;
        }
        if ((33554432 & i3) == 0) {
            this.isTpLimit = "";
        } else {
            this.isTpLimit = str88;
        }
        if ((67108864 & i3) == 0) {
            this.linkedOrd = null;
        } else {
            this.linkedOrd = linkedOrd;
        }
        if ((134217728 & i3) == 0) {
            this.linkedAlgoOrd = null;
        } else {
            this.linkedAlgoOrd = linkedAlgoOrd;
        }
        if ((268435456 & i3) == 0) {
            this.pxType = null;
        } else {
            this.pxType = str89;
        }
        if ((536870912 & i3) == 0) {
            this.pxUsd = null;
        } else {
            this.pxUsd = str90;
        }
        if ((1073741824 & i3) == 0) {
            this.pxVol = null;
        } else {
            this.pxVol = str91;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str92;
        }
        if ((i4 & 1) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str93;
        }
        if ((i4 & 2) == 0) {
            this.isDex = null;
        } else {
            this.isDex = str94;
        }
        if ((i4 & 4) == 0) {
            this.advanceOrdType = "";
        } else {
            this.advanceOrdType = str95;
        }
        if ((i4 & 8) == 0) {
            this.dexOrderDetail = null;
        } else {
            this.dexOrderDetail = dexOrderDetail;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AllOrderDataInfo allOrderDataInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || allOrderDataInfo.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, allOrderDataInfo.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || allOrderDataInfo.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, allOrderDataInfo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || allOrderDataInfo.ordId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, allOrderDataInfo.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || allOrderDataInfo.clOrderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, allOrderDataInfo.clOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || allOrderDataInfo.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, allOrderDataInfo.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || allOrderDataInfo.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, allOrderDataInfo.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || allOrderDataInfo.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, allOrderDataInfo.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || allOrderDataInfo.accFillSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, allOrderDataInfo.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || allOrderDataInfo.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, allOrderDataInfo.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || allOrderDataInfo.ordType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, allOrderDataInfo.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || allOrderDataInfo.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, allOrderDataInfo.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || allOrderDataInfo.sideMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, allOrderDataInfo.sideMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || allOrderDataInfo.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, allOrderDataInfo.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || allOrderDataInfo.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, allOrderDataInfo.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || allOrderDataInfo.fillPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, allOrderDataInfo.fillPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || allOrderDataInfo.expendSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, allOrderDataInfo.expendSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || allOrderDataInfo.obtainedSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, allOrderDataInfo.obtainedSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || allOrderDataInfo.fillSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, allOrderDataInfo.fillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || allOrderDataInfo.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, allOrderDataInfo.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || allOrderDataInfo.fillTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, allOrderDataInfo.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || allOrderDataInfo.avgPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, allOrderDataInfo.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || allOrderDataInfo.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, allOrderDataInfo.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || allOrderDataInfo.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, allOrderDataInfo.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || allOrderDataInfo.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, allOrderDataInfo.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || allOrderDataInfo.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, allOrderDataInfo.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || allOrderDataInfo.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, allOrderDataInfo.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || allOrderDataInfo.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, allOrderDataInfo.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || allOrderDataInfo.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, allOrderDataInfo.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || allOrderDataInfo.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, allOrderDataInfo.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || allOrderDataInfo.feeCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, allOrderDataInfo.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || allOrderDataInfo.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, allOrderDataInfo.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || allOrderDataInfo.rebateCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, allOrderDataInfo.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || allOrderDataInfo.rebate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, allOrderDataInfo.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || allOrderDataInfo.category != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, allOrderDataInfo.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || allOrderDataInfo.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, allOrderDataInfo.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || allOrderDataInfo.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, allOrderDataInfo.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || allOrderDataInfo.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, allOrderDataInfo.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || allOrderDataInfo.cancelSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, allOrderDataInfo.cancelSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || allOrderDataInfo.cancelSourceReason != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, allOrderDataInfo.cancelSourceReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || allOrderDataInfo.cancelReason != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, allOrderDataInfo.cancelReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || allOrderDataInfo.cancelTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, allOrderDataInfo.cancelTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || allOrderDataInfo.ctVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, allOrderDataInfo.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || allOrderDataInfo.pnlCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, allOrderDataInfo.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || allOrderDataInfo.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, allOrderDataInfo.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || allOrderDataInfo.uly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, allOrderDataInfo.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || allOrderDataInfo.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, allOrderDataInfo.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || allOrderDataInfo.avgCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, allOrderDataInfo.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || allOrderDataInfo.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, allOrderDataInfo.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || allOrderDataInfo.bankruptcyPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, allOrderDataInfo.bankruptcyPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || allOrderDataInfo.notionalUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, StringSerializer.INSTANCE, allOrderDataInfo.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || allOrderDataInfo.fillNotionalUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, allOrderDataInfo.fillNotionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || allOrderDataInfo.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, allOrderDataInfo.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || allOrderDataInfo.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, allOrderDataInfo.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || allOrderDataInfo.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, allOrderDataInfo.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || allOrderDataInfo.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, allOrderDataInfo.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || allOrderDataInfo.bizRefType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, allOrderDataInfo.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || allOrderDataInfo.bizErrorCodeDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, allOrderDataInfo.bizErrorCodeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || allOrderDataInfo.closeFraction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, allOrderDataInfo.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || allOrderDataInfo.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, StringSerializer.INSTANCE, allOrderDataInfo.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || allOrderDataInfo.algoOrderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, IntSerializer.INSTANCE, allOrderDataInfo.algoOrderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || allOrderDataInfo.ordPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, allOrderDataInfo.ordPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || allOrderDataInfo.actualPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, StringSerializer.INSTANCE, allOrderDataInfo.actualPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || allOrderDataInfo.actualSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, allOrderDataInfo.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || allOrderDataInfo.triggerTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, allOrderDataInfo.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || allOrderDataInfo.last != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, allOrderDataInfo.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || allOrderDataInfo.activePx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, allOrderDataInfo.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || allOrderDataInfo.callbackRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, allOrderDataInfo.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || allOrderDataInfo.callbackSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, StringSerializer.INSTANCE, allOrderDataInfo.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || allOrderDataInfo.cancelType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, allOrderDataInfo.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || allOrderDataInfo.clientOid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, allOrderDataInfo.clientOid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || allOrderDataInfo.moveTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, StringSerializer.INSTANCE, allOrderDataInfo.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || allOrderDataInfo.pTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, allOrderDataInfo.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || allOrderDataInfo.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, allOrderDataInfo.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || allOrderDataInfo.sourceIntValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, StringSerializer.INSTANCE, allOrderDataInfo.sourceIntValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || allOrderDataInfo.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, allOrderDataInfo.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || allOrderDataInfo.actualSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, allOrderDataInfo.actualSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || allOrderDataInfo.triggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, StringSerializer.INSTANCE, allOrderDataInfo.triggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || allOrderDataInfo.activePxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StringSerializer.INSTANCE, allOrderDataInfo.activePxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || allOrderDataInfo.triggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 78, StringSerializer.INSTANCE, allOrderDataInfo.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || allOrderDataInfo.ordSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, StringSerializer.INSTANCE, allOrderDataInfo.ordSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || allOrderDataInfo.amendResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 80, StringSerializer.INSTANCE, allOrderDataInfo.amendResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || allOrderDataInfo.amendSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 81, StringSerializer.INSTANCE, allOrderDataInfo.amendSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || allOrderDataInfo.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, StringSerializer.INSTANCE, allOrderDataInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || allOrderDataInfo.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 83, kSerializerArr[83], allOrderDataInfo.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || allOrderDataInfo.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 84, StringSerializer.INSTANCE, allOrderDataInfo.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || allOrderDataInfo.triggerLast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 85, StringSerializer.INSTANCE, allOrderDataInfo.triggerLast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd((Object) allOrderDataInfo.lastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 86, allOrderDataInfo.lastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd((Object) allOrderDataInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 87, allOrderDataInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || !Intrinsics.EZpvd((Object) allOrderDataInfo.multiplier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 88, allOrderDataInfo.multiplier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || !Intrinsics.EZpvd((Object) allOrderDataInfo.isTpLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 89, allOrderDataInfo.isTpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || allOrderDataInfo.linkedOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 90, LinkedOrd$$serializer.INSTANCE, allOrderDataInfo.linkedOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || allOrderDataInfo.linkedAlgoOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 91, LinkedAlgoOrd$$serializer.INSTANCE, allOrderDataInfo.linkedAlgoOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || allOrderDataInfo.pxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 92, StringSerializer.INSTANCE, allOrderDataInfo.pxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || allOrderDataInfo.pxUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 93, StringSerializer.INSTANCE, allOrderDataInfo.pxUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || allOrderDataInfo.pxVol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 94, StringSerializer.INSTANCE, allOrderDataInfo.pxVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) || !Intrinsics.EZpvd((Object) allOrderDataInfo.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 95, allOrderDataInfo.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 96) || allOrderDataInfo.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 96, StringSerializer.INSTANCE, allOrderDataInfo.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 97) || allOrderDataInfo.isDex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 97, StringSerializer.INSTANCE, allOrderDataInfo.isDex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 98) || !Intrinsics.EZpvd((Object) allOrderDataInfo.advanceOrdType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 98, StringSerializer.INSTANCE, allOrderDataInfo.advanceOrdType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 99) && allOrderDataInfo.dexOrderDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 99, DexOrderDetail$$serializer.INSTANCE, allOrderDataInfo.dexOrderDetail);
    }

    public AllOrderDataInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, Integer num, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList<TradeOrderStopParam> arrayList, String str83, String str84, @NotNull String str85, @NotNull String str86, @NotNull String str87, @NotNull String str88, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str89, String str90, String str91, @NotNull String str92, String str93, String str94, String str95, DexOrderDetail dexOrderDetail) {
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str92, "");
        this.instType = str;
        this.instId = str2;
        this.ordId = str3;
        this.clOrderId = str4;
        this.tag = str5;
        this.px = str6;
        this.sz = str7;
        this.accFillSz = str8;
        this.pnl = str9;
        this.ordType = str10;
        this.side = str11;
        this.sideMsg = str12;
        this.posSide = str13;
        this.tdMode = str14;
        this.fillPx = str15;
        this.expendSz = str16;
        this.obtainedSz = str17;
        this.fillSz = str18;
        this.tradeId = str19;
        this.fillTime = str20;
        this.avgPx = str21;
        this.state = str22;
        this.lever = str23;
        this.tpTriggerPx = str24;
        this.tpOrdPx = str25;
        this.tpTriggerPxType = str26;
        this.slTriggerPx = str27;
        this.slOrdPx = str28;
        this.slTriggerPxType = str29;
        this.feeCcy = str30;
        this.fee = str31;
        this.rebateCcy = str32;
        this.rebate = str33;
        this.category = str34;
        this.uTime = str35;
        this.cTime = str36;
        this.ccy = str37;
        this.cancelSource = str38;
        this.cancelSourceReason = str39;
        this.cancelReason = str40;
        this.cancelTime = str41;
        this.ctVal = str42;
        this.pnlCcy = str43;
        this.pnlRatio = str44;
        this.uly = str45;
        this.instFamily = str46;
        this.avgCost = str47;
        this.triggerPx = str48;
        this.bankruptcyPx = str49;
        this.notionalUsd = str50;
        this.fillNotionalUsd = str51;
        this.tgtCcy = str52;
        this.source = str53;
        this.reduceOnly = str54;
        this.quickMgnType = str55;
        this.bizRefType = str56;
        this.bizErrorCodeDesc = str57;
        this.closeFraction = str58;
        this.algoId = str59;
        this.algoOrderStatus = num;
        this.ordPx = str60;
        this.actualPx = str61;
        this.actualSz = str62;
        this.triggerTime = str63;
        this.last = str64;
        this.activePx = str65;
        this.callbackRatio = str66;
        this.callbackSpread = str67;
        this.cancelType = str68;
        this.clientOid = str69;
        this.moveTriggerPx = str70;
        this.pTime = str71;
        this.sourceAlgoId = str72;
        this.sourceIntValue = str73;
        this.stopType = str74;
        this.actualSide = str75;
        this.triggerPxType = str76;
        this.activePxType = str77;
        this.triggerType = str78;
        this.ordSource = str79;
        this.amendResult = str80;
        this.amendSource = str81;
        this.code = str82;
        this.attachAlgoOrds = arrayList;
        this.amendPxOnTriggerType = str83;
        this.triggerLast = str84;
        this.lastPx = str85;
        this.feeRate = str86;
        this.multiplier = str87;
        this.isTpLimit = str88;
        this.linkedOrd = linkedOrd;
        this.linkedAlgoOrd = linkedAlgoOrd;
        this.pxType = str89;
        this.pxUsd = str90;
        this.pxVol = str91;
        this.ruleType = str92;
        this.tradeQuoteCcy = str93;
        this.isDex = str94;
        this.advanceOrdType = str95;
        this.dexOrderDetail = dexOrderDetail;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AllOrderDataInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, Integer num, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, ArrayList arrayList, String str83, String str84, String str85, String str86, String str87, String str88, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str89, String str90, String str91, String str92, String str93, String str94, String str95, DexOrderDetail dexOrderDetail, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str96 = (i & 1) != 0 ? null : str;
        String str97 = (i & 2) != 0 ? null : str2;
        String str98 = (i & 4) != 0 ? null : str3;
        String str99 = (i & 8) != 0 ? null : str4;
        String str100 = (i & 16) != 0 ? null : str5;
        String str101 = (i & 32) != 0 ? null : str6;
        String str102 = (i & 64) != 0 ? null : str7;
        String str103 = (i & 128) != 0 ? null : str8;
        String str104 = (i & 256) != 0 ? null : str9;
        String str105 = (i & 512) != 0 ? null : str10;
        String str106 = (i & 1024) != 0 ? null : str11;
        String str107 = (i & 2048) != 0 ? null : str12;
        String str108 = (i & 4096) != 0 ? null : str13;
        String str109 = (i & 8192) != 0 ? null : str14;
        String str110 = (i & 16384) != 0 ? null : str15;
        String str111 = (i & 32768) != 0 ? null : str16;
        String str112 = (i & 65536) != 0 ? null : str17;
        String str113 = (i & 131072) != 0 ? null : str18;
        String str114 = (i & 262144) != 0 ? null : str19;
        String str115 = (i & 524288) != 0 ? null : str20;
        String str116 = (i & 1048576) != 0 ? null : str21;
        String str117 = (i & 2097152) != 0 ? null : str22;
        String str118 = (i & 4194304) != 0 ? null : str23;
        String str119 = (i & 8388608) != 0 ? null : str24;
        String str120 = (i & 16777216) != 0 ? null : str25;
        String str121 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26;
        String str122 = (i & 67108864) != 0 ? null : str27;
        String str123 = (i & 134217728) != 0 ? null : str28;
        String str124 = (i & 268435456) != 0 ? null : str29;
        String str125 = (i & 536870912) != 0 ? null : str30;
        String str126 = (i & 1073741824) != 0 ? null : str31;
        String str127 = (i & Integer.MIN_VALUE) != 0 ? null : str32;
        this(str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? null : str34, (i2 & 4) != 0 ? null : str35, (i2 & 8) != 0 ? null : str36, (i2 & 16) != 0 ? null : str37, (i2 & 32) != 0 ? null : str38, (i2 & 64) != 0 ? null : str39, (i2 & 128) != 0 ? null : str40, (i2 & 256) != 0 ? null : str41, (i2 & 512) != 0 ? null : str42, (i2 & 1024) != 0 ? null : str43, (i2 & 2048) != 0 ? null : str44, (i2 & 4096) != 0 ? null : str45, (i2 & 8192) != 0 ? null : str46, (i2 & 16384) != 0 ? null : str47, (i2 & 32768) != 0 ? null : str48, (i2 & 65536) != 0 ? null : str49, (i2 & 131072) != 0 ? null : str50, (i2 & 262144) != 0 ? null : str51, (i2 & 524288) != 0 ? null : str52, (i2 & 1048576) != 0 ? null : str53, (i2 & 2097152) != 0 ? null : str54, (i2 & 4194304) != 0 ? null : str55, (i2 & 8388608) != 0 ? null : str56, (i2 & 16777216) != 0 ? null : str57, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str58, (i2 & 67108864) != 0 ? null : str59, (i2 & 134217728) != 0 ? null : num, (i2 & 268435456) != 0 ? null : str60, (i2 & 536870912) != 0 ? null : str61, (i2 & 1073741824) != 0 ? null : str62, (i2 & Integer.MIN_VALUE) != 0 ? null : str63, (i3 & 1) != 0 ? null : str64, (i3 & 2) != 0 ? null : str65, (i3 & 4) != 0 ? null : str66, (i3 & 8) != 0 ? null : str67, (i3 & 16) != 0 ? null : str68, (i3 & 32) != 0 ? null : str69, (i3 & 64) != 0 ? null : str70, (i3 & 128) != 0 ? null : str71, (i3 & 256) != 0 ? null : str72, (i3 & 512) != 0 ? null : str73, (i3 & 1024) != 0 ? null : str74, (i3 & 2048) != 0 ? null : str75, (i3 & 4096) != 0 ? null : str76, (i3 & 8192) != 0 ? null : str77, (i3 & 16384) != 0 ? null : str78, (i3 & 32768) != 0 ? null : str79, (i3 & 65536) != 0 ? null : str80, (i3 & 131072) != 0 ? null : str81, (i3 & 262144) != 0 ? null : str82, (i3 & 524288) != 0 ? null : arrayList, (i3 & 1048576) != 0 ? null : str83, (i3 & 2097152) != 0 ? null : str84, (i3 & 4194304) != 0 ? "" : str85, (i3 & 8388608) != 0 ? "" : str86, (i3 & 16777216) != 0 ? "" : str87, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str88, (i3 & 67108864) != 0 ? null : linkedOrd, (i3 & 134217728) != 0 ? null : linkedAlgoOrd, (i3 & 268435456) != 0 ? null : str89, (i3 & 536870912) != 0 ? null : str90, (i3 & 1073741824) != 0 ? null : str91, (i3 & Integer.MIN_VALUE) != 0 ? "" : str92, (i4 & 1) != 0 ? null : str93, (i4 & 2) != 0 ? null : str94, (i4 & 4) == 0 ? str95 : "", (i4 & 8) != 0 ? null : dexOrderDetail);
    }

    public static final class Companion {

        public static final class ActionBar extends TypeToken<List<? extends AllOrderDataInfo>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AllOrderDataInfo> serializer() {
            return AllOrderDataInfo$$serializer.INSTANCE;
        }

        public final List<AllOrderDataInfo> KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new ActionBar().getType();
            Intrinsics.copydefault(type);
            List<AllOrderDataInfo> list = (List) xvj.OLrzqt(str, type, true);
            if (list == null || list.isEmpty()) {
                return null;
            }
            return list;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0.equals("post_only") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0.equals("optimal_limit_ioc") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r0.equals("conditional") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r0.equals("convert") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r0.equals("limit") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r0.equals("oco") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r0.equals("ioc") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r0.equals("fok") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r0.equals("elp") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (r0.equals("op_fok") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r0.equals("trigger") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r0.equals("market") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return convertSpAndTrigger();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return convertNormal();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TradeAllOrderApi convertDataByOrderType(boolean z) {
        if (Intrinsics.EZpvd((Object) this.isDex, (Object) "1")) {
            return convertNormal();
        }
        String str = this.ordType;
        if (str != null) {
            switch (str.hashCode()) {
                case -1727670399:
                    if (str.equals("move_order_stop")) {
                        return convertMsp(z);
                    }
                    break;
                case -1081306052:
                    break;
                case -1059891784:
                    break;
                case -1010765468:
                    break;
                case 100521:
                    break;
                case 101570:
                    break;
                case 104445:
                    break;
                case 109851:
                    break;
                case 102976443:
                    break;
                case 951590323:
                    break;
                case 1208131206:
                    break;
                case 1555020540:
                    break;
                case 2002822123:
                    break;
            }
        }
        return null;
    }

    private final TradeAllOrderApi convertNormal() {
        String str = this.instType;
        String str2 = str == null ? "" : str;
        String str3 = this.instId;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.uly;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.instFamily;
        String str8 = str7 == null ? "" : str7;
        String str9 = this.ordId;
        String str10 = str9 == null ? "" : str9;
        String str11 = this.px;
        String str12 = str11 == null ? "" : str11;
        String str13 = this.sz;
        String str14 = str13 == null ? "" : str13;
        String str15 = this.ordType;
        String str16 = str15 == null ? "" : str15;
        String str17 = this.side;
        String str18 = str17 == null ? "" : str17;
        String str19 = this.posSide;
        String str20 = str19 == null ? "" : str19;
        String str21 = this.tdMode;
        String str22 = str21 == null ? "" : str21;
        String str23 = this.fillPx;
        String str24 = str23 == null ? "" : str23;
        String str25 = this.tradeId;
        String str26 = str25 == null ? "" : str25;
        String str27 = this.expendSz;
        String str28 = str27 == null ? "" : str27;
        String str29 = this.obtainedSz;
        String str30 = str29 == null ? "" : str29;
        String str31 = this.fillSz;
        String str32 = str31 == null ? "" : str31;
        String str33 = this.fillTime;
        String str34 = str33 == null ? "" : str33;
        String str35 = this.accFillSz;
        String str36 = str35 == null ? "" : str35;
        String str37 = this.avgPx;
        String str38 = str37 == null ? "" : str37;
        String str39 = this.state;
        String str40 = str39 == null ? "" : str39;
        String str41 = this.lever;
        String str42 = str41 == null ? "" : str41;
        String str43 = this.tpTriggerPx;
        String str44 = str43 == null ? "" : str43;
        String str45 = this.tpOrdPx;
        String str46 = str45 == null ? "" : str45;
        String str47 = this.slTriggerPx;
        String str48 = str47 == null ? "" : str47;
        String str49 = this.slOrdPx;
        String str50 = str49 == null ? "" : str49;
        String str51 = this.feeCcy;
        String str52 = str51 == null ? "" : str51;
        String str53 = this.fee;
        String str54 = str53 == null ? "" : str53;
        String str55 = this.rebateCcy;
        String str56 = str55 == null ? "" : str55;
        String str57 = this.rebate;
        String str58 = str57 == null ? "" : str57;
        String str59 = this.pnlCcy;
        String str60 = str59 == null ? "" : str59;
        String str61 = this.pnl;
        String str62 = str61 == null ? "" : str61;
        String str63 = this.category;
        String str64 = str63 == null ? "" : str63;
        String str65 = this.uTime;
        String str66 = str65 == null ? "" : str65;
        String str67 = this.cTime;
        String str68 = str67 == null ? "" : str67;
        String str69 = this.pnlRatio;
        String str70 = str69 == null ? "" : str69;
        String str71 = this.ctVal;
        String str72 = this.avgCost;
        String str73 = str72 == null ? "" : str72;
        String str74 = this.triggerPx;
        String str75 = str74 == null ? "" : str74;
        String str76 = this.bankruptcyPx;
        String str77 = str76 == null ? "" : str76;
        String str78 = this.notionalUsd;
        String str79 = str78 == null ? "" : str78;
        String str80 = this.fillNotionalUsd;
        String str81 = str80 == null ? "" : str80;
        String str82 = this.tgtCcy;
        String str83 = this.tpTriggerPxType;
        String str84 = this.slTriggerPxType;
        String str85 = this.reduceOnly;
        String str86 = str85 == null ? "" : str85;
        String str87 = this.quickMgnType;
        String str88 = str87 == null ? "" : str87;
        String str89 = this.cancelSourceReason;
        String str90 = str89 == null ? "" : str89;
        String str91 = this.source;
        String str92 = str91 == null ? "" : str91;
        String str93 = this.sideMsg;
        String str94 = str93 == null ? "" : str93;
        String str95 = this.closeFraction;
        String str96 = str95 == null ? "" : str95;
        String str97 = this.bizRefType;
        String str98 = str97 == null ? "" : str97;
        String str99 = this.amendResult;
        String str100 = this.amendSource;
        String str101 = this.code;
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        String str102 = this.amendPxOnTriggerType;
        String str103 = this.lastPx;
        String str104 = this.feeRate;
        String str105 = this.multiplier;
        String str106 = this.isTpLimit;
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        String str107 = this.pxType;
        String str108 = this.pxUsd;
        String str109 = this.pxVol;
        String str110 = this.ccy;
        String str111 = this.ruleType;
        String str112 = this.algoId;
        String str113 = str112 == null ? "" : str112;
        String str114 = this.tradeQuoteCcy;
        String str115 = this.isDex;
        return new TradeOrderData(str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, str24, str28, str30, str26, str32, str34, str36, str38, str40, str42, str44, str46, str48, str50, str52, str54, str56, str58, str60, str62, str64, str66, str68, str70, str71, str73, str75, str77, str79, str81, str82, str83, str84, str86, str88, str90, str92, str94, str96, (String) null, str113, str98, str104, str105, str99, str100, str101, arrayList, str102, str103, str106, linkedAlgoOrd, str107, str108, str109, str110, str111, (String) null, (String) null, (String) null, (String) null, str114, str115 == null ? "" : str115, this.dexOrderDetail, 0, 262144, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }

    private final TradeAllOrderApi convertSpAndTrigger() {
        String str = this.instType;
        String str2 = str == null ? "" : str;
        String str3 = this.instId;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.uly;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.instFamily;
        String str8 = str7 == null ? "" : str7;
        String str9 = this.ccy;
        String str10 = str9 == null ? "" : str9;
        String str11 = this.ctVal;
        String str12 = this.ordId;
        String str13 = str12 == null ? "" : str12;
        String str14 = this.algoId;
        String str15 = str14 == null ? "" : str14;
        String str16 = this.sz;
        String str17 = str16 == null ? "" : str16;
        String str18 = this.last;
        String str19 = str18 == null ? "" : str18;
        String str20 = this.ordType;
        String str21 = str20 == null ? "" : str20;
        String str22 = this.side;
        String str23 = str22 == null ? "" : str22;
        String str24 = this.posSide;
        String str25 = str24 == null ? "" : str24;
        String str26 = this.tdMode;
        String str27 = str26 == null ? "" : str26;
        String str28 = this.state;
        String str29 = str28 == null ? "" : str28;
        String str30 = this.lever;
        String str31 = str30 == null ? "" : str30;
        String str32 = this.tpTriggerPx;
        String str33 = str32 == null ? "" : str32;
        String str34 = this.tpOrdPx;
        String str35 = str34 == null ? "" : str34;
        String str36 = this.slTriggerPx;
        String str37 = str36 == null ? "" : str36;
        String str38 = this.slOrdPx;
        String str39 = str38 == null ? "" : str38;
        String str40 = this.triggerPx;
        String str41 = str40 == null ? "" : str40;
        String str42 = this.ordPx;
        String str43 = str42 == null ? "" : str42;
        String str44 = this.actualSz;
        String str45 = str44 == null ? "" : str44;
        String str46 = this.actualPx;
        String str47 = str46 == null ? "" : str46;
        String str48 = this.actualSide;
        String str49 = str48 == null ? "" : str48;
        String str50 = this.triggerTime;
        String str51 = str50 == null ? "" : str50;
        String str52 = this.cTime;
        String str53 = str52 == null ? "" : str52;
        String str54 = this.notionalUsd;
        String str55 = str54 == null ? "" : str54;
        String str56 = this.tgtCcy;
        String str57 = this.tpTriggerPxType;
        String str58 = this.slTriggerPxType;
        String str59 = this.reduceOnly;
        String str60 = str59 == null ? "" : str59;
        String str61 = this.triggerPxType;
        String str62 = this.uTime;
        String str63 = str62 == null ? "" : str62;
        String str64 = this.quickMgnType;
        String str65 = str64 == null ? "" : str64;
        String str66 = this.cancelSourceReason;
        String str67 = str66 == null ? "" : str66;
        String str68 = this.closeFraction;
        String str69 = str68 == null ? "" : str68;
        String str70 = this.bizRefType;
        String str71 = str70 == null ? "" : str70;
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        String str72 = this.triggerLast;
        String str73 = str72 == null ? "" : str72;
        String str74 = this.amendPxOnTriggerType;
        String str75 = this.avgPx;
        return new TradeStrategyOrderData(str2, str4, str6, str8, str10, str11, str13, str15, str17, str19, str21, str23, str25, str27, str29, str31, (TpSlTriggerParamReqResp) null, str33, str35, str37, str39, str41, str43, str45, str47, str49, str51, str53, str55, str56, str57, str58, str60, str61, (List) null, (Boolean) null, str63, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, str65, str67, (String) null, (String) null, (String) null, str69, (String) null, str71, (String) null, (String) null, arrayList, str73, str74, str75 == null ? "" : str75, this.linkedOrd, this.ruleType, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (StrategyProfitResponse) null, this.tradeQuoteCcy, (Float) null, (SmartEarnParam) null, (String) null, (String) null, (String) null, this.advanceOrdType, (String) null, (StrategyDcaEditResp) null, (String) null, (DexOrderDetail) null, 65536, -529817620, 63455, (DefaultConstructorMarker) null);
    }

    private final TradeAllOrderApi convertMsp(boolean z) {
        if (!z) {
            String str = this.instType;
            String str2 = str == null ? "" : str;
            String str3 = this.instId;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.uly;
            String str6 = str5 == null ? "" : str5;
            String str7 = this.ccy;
            String str8 = str7 == null ? "" : str7;
            String str9 = this.ordId;
            String str10 = str9 == null ? "" : str9;
            String str11 = this.algoId;
            String str12 = str11 == null ? "" : str11;
            String str13 = this.ordType;
            String str14 = str13 == null ? "" : str13;
            String str15 = this.tdMode;
            String str16 = str15 == null ? "" : str15;
            String str17 = this.lever;
            String str18 = str17 == null ? "" : str17;
            String str19 = this.state;
            String str20 = str19 == null ? "" : str19;
            String str21 = this.triggerTime;
            String str22 = str21 == null ? "" : str21;
            String str23 = this.cTime;
            String str24 = str23 == null ? "" : str23;
            String str25 = this.actualSz;
            String str26 = str25 == null ? "" : str25;
            String str27 = this.sz;
            String str28 = str27 == null ? "" : str27;
            String str29 = this.side;
            String str30 = str29 == null ? "" : str29;
            String str31 = this.posSide;
            String str32 = str31 == null ? "" : str31;
            String str33 = this.pnlRatio;
            String str34 = str33 == null ? "" : str33;
            String str35 = this.cancelType;
            String str36 = str35 == null ? "" : str35;
            String str37 = this.notionalUsd;
            String str38 = str37 == null ? "" : str37;
            String str39 = this.tgtCcy;
            String str40 = this.callbackRatio;
            String str41 = str40 == null ? "" : str40;
            String str42 = this.callbackSpread;
            String str43 = str42 == null ? "" : str42;
            String str44 = this.activePx;
            String str45 = str44 == null ? "" : str44;
            String str46 = this.activePxType;
            String str47 = str46 == null ? "" : str46;
            String str48 = this.moveTriggerPx;
            String str49 = str48 == null ? "" : str48;
            String str50 = this.last;
            String str51 = str50 == null ? "" : str50;
            String str52 = this.uTime;
            String str53 = str52 == null ? "" : str52;
            String str54 = this.quickMgnType;
            String str55 = str54 == null ? "" : str54;
            String str56 = this.triggerType;
            String str57 = str56 == null ? "" : str56;
            String str58 = this.closeFraction;
            String str59 = str58 == null ? "" : str58;
            String str60 = this.reduceOnly;
            return new StrategyPendingListResp(str2, str4, str8, str10, str12, str14, str16, str18, str20, str22, str24, null, null, null, null, str26, null, null, null, null, str28, str30, str32, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str34, null, null, str36, str38, null, null, null, null, null, str39, str41, str43, str45, str47, str49, str51, str53, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str6, str55, null, str57, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str59, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str60 == null ? "" : str60, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, this.tradeQuoteCcy, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.advanceOrdType, -7374848, -8356641, 1342177279, -32769, -2049, -1, -33554433, 262143, null);
        }
        String str61 = this.instType;
        String str62 = str61 == null ? "" : str61;
        String str63 = this.instId;
        String str64 = str63 == null ? "" : str63;
        String str65 = this.uly;
        String str66 = str65 == null ? "" : str65;
        String str67 = this.ccy;
        String str68 = str67 == null ? "" : str67;
        String str69 = this.ctVal;
        String str70 = str69 == null ? "" : str69;
        String str71 = this.ordId;
        String str72 = str71 == null ? "" : str71;
        String str73 = this.algoId;
        String str74 = str73 == null ? "" : str73;
        String str75 = this.ordType;
        String str76 = str75 == null ? "" : str75;
        String str77 = this.tdMode;
        String str78 = str77 == null ? "" : str77;
        String str79 = this.lever;
        String str80 = str79 == null ? "" : str79;
        String str81 = this.state;
        String str82 = str81 == null ? "" : str81;
        String str83 = this.triggerTime;
        String str84 = str83 == null ? "" : str83;
        String str85 = this.cTime;
        String str86 = str85 == null ? "" : str85;
        String str87 = this.actualSz;
        String str88 = str87 == null ? "" : str87;
        String str89 = this.sz;
        String str90 = str89 == null ? "" : str89;
        String str91 = this.side;
        String str92 = str91 == null ? "" : str91;
        String str93 = this.posSide;
        String str94 = str93 == null ? "" : str93;
        String str95 = this.pnlRatio;
        String str96 = str95 == null ? "" : str95;
        String str97 = this.cancelType;
        String str98 = str97 == null ? "" : str97;
        String str99 = this.tgtCcy;
        String str100 = this.callbackRatio;
        String str101 = str100 == null ? "" : str100;
        String str102 = this.callbackSpread;
        String str103 = str102 == null ? "" : str102;
        String str104 = this.activePx;
        String str105 = str104 == null ? "" : str104;
        String str106 = this.activePxType;
        String str107 = str106 == null ? "" : str106;
        String str108 = this.moveTriggerPx;
        String str109 = str108 == null ? "" : str108;
        String str110 = this.last;
        String str111 = str110 == null ? "" : str110;
        String str112 = this.uTime;
        String str113 = str112 == null ? "" : str112;
        String str114 = this.triggerType;
        String str115 = str114 == null ? "" : str114;
        String str116 = this.closeFraction;
        String str117 = str116 == null ? "" : str116;
        String str118 = this.bizRefType;
        String str119 = str118 == null ? "" : str118;
        String str120 = this.triggerLast;
        String str121 = str120 == null ? "" : str120;
        String str122 = this.reduceOnly;
        return new StrategyHistoryListResp(str62, str64, str66, str68, str70, str72, str74, str76, str78, str80, str82, str84, str86, (String) null, (String) null, (String) null, (String) null, str88, str90, str92, str94, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str96, (String) null, (String) null, (String) null, (String) null, str98, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str99, str101, str103, str105, str107, str109, str111, str113, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, str115, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str117, str119, (ArrayList) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str122 == null ? "" : str122, str121, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, this.ruleType, (String) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (StrategyProfitResponse) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this.tradeQuoteCcy, (String) null, (Float) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (BotVo) null, (String) null, (String) null, this.advanceOrdType, -1974272, -133695553, -268435457, -12289, -49153, -134217729, -2097153, 63, (DefaultConstructorMarker) null);
    }
}
