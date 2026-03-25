package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C54589xNz;
import o.C56084xwD;
import o.C56444yFp;
import o.InterfaceC54581xNr;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeOrderData implements Parcelable, TradeAllOrderApi {
    private String accFillSz;
    private String algoId;
    private String amendPxOnTriggerType;
    private String amendResult;
    private String amendSource;
    private ArrayList<TradeOrderStopParam> attachAlgoOrds;
    private String avgCost;
    private String avgPx;
    private String bankruptcyPx;
    private String bizRefType;
    private String cTime;
    private String cancelSourceReason;
    private String category;
    private String ccy;
    private String chaseType;
    private String chaseVal;
    private String closeFraction;
    private String code;
    private String ctVal;
    public DexOrderDetail dexOrderDetail;
    private String displayId;
    private String expendSz;
    private String fee;
    private String feeCcy;
    private String feeRate;
    private String fillNotionalUsd;
    private String fillPx;
    private String fillSz;
    private String fillTime;
    private final String instFamily;
    private String instId;
    private String instType;
    private String isDex;
    private String isTpLimit;
    private String lastPx;
    private String lever;
    private LinkedAlgoOrd linkedAlgoOrd;
    private String multiplier;
    private String notionalUsd;
    private String obtainedSz;
    private String ordId;
    private String ordSource;
    private String ordType;
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
    private String state;
    private String stopChasePrice;
    private String sz;
    private String tdMode;
    private String tgtCcy;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tradeId;
    private String tradeQuoteCcy;
    private String triggerPx;
    private String uTime;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeOrderData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TradeOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderData createFromParcel(Parcel parcel) {
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
            return new TradeOrderData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LinkedAlgoOrd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexOrderDetail.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderData[] newArray(int i) {
            return new TradeOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeOrderData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (LinkedAlgoOrd) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexOrderDetail) null, -1, -1, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.expendSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.obtainedSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.bankruptcyPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.fillNotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.reduceOnly;
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
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.sideMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.amendResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.amendSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> component59() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.lastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedAlgoOrd component63() {
        return this.linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.pxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.isDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetail component75() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, String str42, String str43, String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, String str56, String str57, String str58, ArrayList<TradeOrderStopParam> arrayList, String str59, @NotNull String str60, @NotNull String str61, LinkedAlgoOrd linkedAlgoOrd, String str62, String str63, String str64, String str65, @NotNull String str66, String str67, String str68, String str69, @NotNull String str70, String str71, @NotNull String str72, DexOrderDetail dexOrderDetail) {
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
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str72, "");
        return new TradeOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, arrayList, str59, str60, str61, linkedAlgoOrd, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, dexOrderDetail);
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
        if (!(obj instanceof TradeOrderData)) {
            return false;
        }
        TradeOrderData tradeOrderData = (TradeOrderData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) tradeOrderData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) tradeOrderData.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) tradeOrderData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) tradeOrderData.instFamily) && Intrinsics.EZpvd((Object) this.ordId, (Object) tradeOrderData.ordId) && Intrinsics.EZpvd((Object) this.px, (Object) tradeOrderData.px) && Intrinsics.EZpvd((Object) this.sz, (Object) tradeOrderData.sz) && Intrinsics.EZpvd((Object) this.ordType, (Object) tradeOrderData.ordType) && Intrinsics.EZpvd((Object) this.side, (Object) tradeOrderData.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradeOrderData.posSide) && Intrinsics.EZpvd((Object) this.tdMode, (Object) tradeOrderData.tdMode) && Intrinsics.EZpvd((Object) this.fillPx, (Object) tradeOrderData.fillPx) && Intrinsics.EZpvd((Object) this.expendSz, (Object) tradeOrderData.expendSz) && Intrinsics.EZpvd((Object) this.obtainedSz, (Object) tradeOrderData.obtainedSz) && Intrinsics.EZpvd((Object) this.tradeId, (Object) tradeOrderData.tradeId) && Intrinsics.EZpvd((Object) this.fillSz, (Object) tradeOrderData.fillSz) && Intrinsics.EZpvd((Object) this.fillTime, (Object) tradeOrderData.fillTime) && Intrinsics.EZpvd((Object) this.accFillSz, (Object) tradeOrderData.accFillSz) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tradeOrderData.avgPx) && Intrinsics.EZpvd((Object) this.state, (Object) tradeOrderData.state) && Intrinsics.EZpvd((Object) this.lever, (Object) tradeOrderData.lever) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) tradeOrderData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) tradeOrderData.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tradeOrderData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) tradeOrderData.slOrdPx) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) tradeOrderData.feeCcy) && Intrinsics.EZpvd((Object) this.fee, (Object) tradeOrderData.fee) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) tradeOrderData.rebateCcy) && Intrinsics.EZpvd((Object) this.rebate, (Object) tradeOrderData.rebate) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) tradeOrderData.pnlCcy) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradeOrderData.pnl) && Intrinsics.EZpvd((Object) this.category, (Object) tradeOrderData.category) && Intrinsics.EZpvd((Object) this.uTime, (Object) tradeOrderData.uTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) tradeOrderData.cTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) tradeOrderData.pnlRatio) && Intrinsics.EZpvd((Object) this.ctVal, (Object) tradeOrderData.ctVal) && Intrinsics.EZpvd((Object) this.avgCost, (Object) tradeOrderData.avgCost) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) tradeOrderData.triggerPx) && Intrinsics.EZpvd((Object) this.bankruptcyPx, (Object) tradeOrderData.bankruptcyPx) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) tradeOrderData.notionalUsd) && Intrinsics.EZpvd((Object) this.fillNotionalUsd, (Object) tradeOrderData.fillNotionalUsd) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) tradeOrderData.tgtCcy) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) tradeOrderData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) tradeOrderData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) tradeOrderData.reduceOnly) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) tradeOrderData.quickMgnType) && Intrinsics.EZpvd((Object) this.cancelSourceReason, (Object) tradeOrderData.cancelSourceReason) && Intrinsics.EZpvd((Object) this.source, (Object) tradeOrderData.source) && Intrinsics.EZpvd((Object) this.sideMsg, (Object) tradeOrderData.sideMsg) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) tradeOrderData.closeFraction) && Intrinsics.EZpvd((Object) this.ordSource, (Object) tradeOrderData.ordSource) && Intrinsics.EZpvd((Object) this.algoId, (Object) tradeOrderData.algoId) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) tradeOrderData.bizRefType) && Intrinsics.EZpvd((Object) this.feeRate, (Object) tradeOrderData.feeRate) && Intrinsics.EZpvd((Object) this.multiplier, (Object) tradeOrderData.multiplier) && Intrinsics.EZpvd((Object) this.amendResult, (Object) tradeOrderData.amendResult) && Intrinsics.EZpvd((Object) this.amendSource, (Object) tradeOrderData.amendSource) && Intrinsics.EZpvd((Object) this.code, (Object) tradeOrderData.code) && Intrinsics.EZpvd(this.attachAlgoOrds, tradeOrderData.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) tradeOrderData.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.lastPx, (Object) tradeOrderData.lastPx) && Intrinsics.EZpvd((Object) this.isTpLimit, (Object) tradeOrderData.isTpLimit) && Intrinsics.EZpvd(this.linkedAlgoOrd, tradeOrderData.linkedAlgoOrd) && Intrinsics.EZpvd((Object) this.pxType, (Object) tradeOrderData.pxType) && Intrinsics.EZpvd((Object) this.pxUsd, (Object) tradeOrderData.pxUsd) && Intrinsics.EZpvd((Object) this.pxVol, (Object) tradeOrderData.pxVol) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeOrderData.ccy) && Intrinsics.EZpvd((Object) this.ruleType, (Object) tradeOrderData.ruleType) && Intrinsics.EZpvd((Object) this.chaseType, (Object) tradeOrderData.chaseType) && Intrinsics.EZpvd((Object) this.chaseVal, (Object) tradeOrderData.chaseVal) && Intrinsics.EZpvd((Object) this.stopChasePrice, (Object) tradeOrderData.stopChasePrice) && Intrinsics.EZpvd((Object) this.displayId, (Object) tradeOrderData.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tradeOrderData.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.isDex, (Object) tradeOrderData.isDex) && Intrinsics.EZpvd(this.dexOrderDetail, tradeOrderData.dexOrderDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccFillSz() {
        return this.accFillSz;
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
    public final String getAmendResult() {
        return this.amendResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendSource() {
        return this.amendSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public List<TradeOrderStopParam> getAttachAlgoOrders() {
        return this.attachAlgoOrds;
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
    public final String getBizRefType() {
        return this.bizRefType;
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
    public final String getCategory() {
        return this.category;
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
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
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
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getInstIdByALl() {
        return this.instId;
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
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getMarkByPage() {
        return this.ordId;
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
    public final String getOrdSource() {
        return this.ordSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderAlgoIdAll() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderCcy() {
        String str = this.ccy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderLastPx() {
        return this.lastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55726xpQ
    public String getOrderSide() {
        return this.side;
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
    @Override // o.InterfaceC55726xpQ
    public String getOrderSz() {
        return this.sz;
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
    @Override // o.InterfaceC55726xpQ
    public String getOrderTpOrderPx() {
        return this.tpOrdPx;
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
    @Override // o.InterfaceC55726xpQ
    public String getOrderTradeQuoteCcy() {
        return this.tradeQuoteCcy;
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
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getStateByAll() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopChasePrice() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
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
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
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
        int iHashCode5 = this.ordId.hashCode();
        int iHashCode6 = this.px.hashCode();
        int iHashCode7 = this.sz.hashCode();
        int iHashCode8 = this.ordType.hashCode();
        int iHashCode9 = this.side.hashCode();
        int iHashCode10 = this.posSide.hashCode();
        int iHashCode11 = this.tdMode.hashCode();
        int iHashCode12 = this.fillPx.hashCode();
        int iHashCode13 = this.expendSz.hashCode();
        int iHashCode14 = this.obtainedSz.hashCode();
        int iHashCode15 = this.tradeId.hashCode();
        int iHashCode16 = this.fillSz.hashCode();
        int iHashCode17 = this.fillTime.hashCode();
        int iHashCode18 = this.accFillSz.hashCode();
        int iHashCode19 = this.avgPx.hashCode();
        int iHashCode20 = this.state.hashCode();
        int iHashCode21 = this.lever.hashCode();
        int iHashCode22 = this.tpTriggerPx.hashCode();
        int iHashCode23 = this.tpOrdPx.hashCode();
        int iHashCode24 = this.slTriggerPx.hashCode();
        int iHashCode25 = this.slOrdPx.hashCode();
        int iHashCode26 = this.feeCcy.hashCode();
        int iHashCode27 = this.fee.hashCode();
        int iHashCode28 = this.rebateCcy.hashCode();
        int iHashCode29 = this.rebate.hashCode();
        int iHashCode30 = this.pnlCcy.hashCode();
        int iHashCode31 = this.pnl.hashCode();
        int iHashCode32 = this.category.hashCode();
        int iHashCode33 = this.uTime.hashCode();
        int iHashCode34 = this.cTime.hashCode();
        int iHashCode35 = this.pnlRatio.hashCode();
        String str = this.ctVal;
        int iHashCode36 = str == null ? 0 : str.hashCode();
        int iHashCode37 = this.avgCost.hashCode();
        int iHashCode38 = this.triggerPx.hashCode();
        int iHashCode39 = this.bankruptcyPx.hashCode();
        int iHashCode40 = this.notionalUsd.hashCode();
        int iHashCode41 = this.fillNotionalUsd.hashCode();
        String str2 = this.tgtCcy;
        int iHashCode42 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tpTriggerPxType;
        int iHashCode43 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slTriggerPxType;
        int iHashCode44 = str4 == null ? 0 : str4.hashCode();
        int iHashCode45 = this.reduceOnly.hashCode();
        int iHashCode46 = this.quickMgnType.hashCode();
        int iHashCode47 = this.cancelSourceReason.hashCode();
        int iHashCode48 = this.source.hashCode();
        int iHashCode49 = this.sideMsg.hashCode();
        int iHashCode50 = this.closeFraction.hashCode();
        String str5 = this.ordSource;
        int iHashCode51 = str5 == null ? 0 : str5.hashCode();
        int iHashCode52 = this.algoId.hashCode();
        int iHashCode53 = this.bizRefType.hashCode();
        int iHashCode54 = this.feeRate.hashCode();
        int iHashCode55 = this.multiplier.hashCode();
        String str6 = this.amendResult;
        int iHashCode56 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.amendSource;
        int iHashCode57 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.code;
        int iHashCode58 = str8 == null ? 0 : str8.hashCode();
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        int iHashCode59 = arrayList == null ? 0 : arrayList.hashCode();
        String str9 = this.amendPxOnTriggerType;
        int iHashCode60 = str9 == null ? 0 : str9.hashCode();
        int iHashCode61 = this.lastPx.hashCode();
        int iHashCode62 = this.isTpLimit.hashCode();
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        int iHashCode63 = linkedAlgoOrd == null ? 0 : linkedAlgoOrd.hashCode();
        String str10 = this.pxType;
        int iHashCode64 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pxUsd;
        int iHashCode65 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.pxVol;
        int iHashCode66 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.ccy;
        int iHashCode67 = str13 == null ? 0 : str13.hashCode();
        int iHashCode68 = this.ruleType.hashCode();
        String str14 = this.chaseType;
        int iHashCode69 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.chaseVal;
        int iHashCode70 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.stopChasePrice;
        int iHashCode71 = str16 == null ? 0 : str16.hashCode();
        int iHashCode72 = this.displayId.hashCode();
        String str17 = this.tradeQuoteCcy;
        int iHashCode73 = str17 == null ? 0 : str17.hashCode();
        int iHashCode74 = this.isDex.hashCode();
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + (dexOrderDetail != null ? dexOrderDetail.hashCode() : 0);
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
    public final void setAccFillSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accFillSz = str;
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
    public final void setAvgCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankruptcyPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankruptcyPx = str;
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
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
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
    public final void setCode(String str) {
        this.code = str;
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
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpendSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expendSz = str;
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
    public final void setFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillNotionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillTime = str;
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
    public final void setLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedAlgoOrd(LinkedAlgoOrd linkedAlgoOrd) {
        this.linkedAlgoOrd = linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiplier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.multiplier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObtainedSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.obtainedSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
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
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
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
    public final void setQuickMgnType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rebate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebateCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rebateCcy = str;
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
    public final void setSideMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sideMsg = str;
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
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
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
    public final void setTpLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isTpLimit = str;
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
    public final void setTradeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPx = str;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeOrderData(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", ordId=" + this.ordId + ", px=" + this.px + ", sz=" + this.sz + ", ordType=" + this.ordType + ", side=" + this.side + ", posSide=" + this.posSide + ", tdMode=" + this.tdMode + ", fillPx=" + this.fillPx + ", expendSz=" + this.expendSz + ", obtainedSz=" + this.obtainedSz + ", tradeId=" + this.tradeId + ", fillSz=" + this.fillSz + ", fillTime=" + this.fillTime + ", accFillSz=" + this.accFillSz + ", avgPx=" + this.avgPx + ", state=" + this.state + ", lever=" + this.lever + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", feeCcy=" + this.feeCcy + ", fee=" + this.fee + ", rebateCcy=" + this.rebateCcy + ", rebate=" + this.rebate + ", pnlCcy=" + this.pnlCcy + ", pnl=" + this.pnl + ", category=" + this.category + ", uTime=" + this.uTime + ", cTime=" + this.cTime + ", pnlRatio=" + this.pnlRatio + ", ctVal=" + this.ctVal + ", avgCost=" + this.avgCost + ", triggerPx=" + this.triggerPx + ", bankruptcyPx=" + this.bankruptcyPx + ", notionalUsd=" + this.notionalUsd + ", fillNotionalUsd=" + this.fillNotionalUsd + ", tgtCcy=" + this.tgtCcy + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", reduceOnly=" + this.reduceOnly + ", quickMgnType=" + this.quickMgnType + ", cancelSourceReason=" + this.cancelSourceReason + ", source=" + this.source + ", sideMsg=" + this.sideMsg + ", closeFraction=" + this.closeFraction + ", ordSource=" + this.ordSource + ", algoId=" + this.algoId + ", bizRefType=" + this.bizRefType + ", feeRate=" + this.feeRate + ", multiplier=" + this.multiplier + ", amendResult=" + this.amendResult + ", amendSource=" + this.amendSource + ", code=" + this.code + ", attachAlgoOrds=" + this.attachAlgoOrds + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", lastPx=" + this.lastPx + ", isTpLimit=" + this.isTpLimit + ", linkedAlgoOrd=" + this.linkedAlgoOrd + ", pxType=" + this.pxType + ", pxUsd=" + this.pxUsd + ", pxVol=" + this.pxVol + ", ccy=" + this.ccy + ", ruleType=" + this.ruleType + ", chaseType=" + this.chaseType + ", chaseVal=" + this.chaseVal + ", stopChasePrice=" + this.stopChasePrice + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", isDex=" + this.isDex + ", dexOrderDetail=" + this.dexOrderDetail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.uly);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.ordId);
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
        parcel.writeString(this.ordType);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.fillPx);
        parcel.writeString(this.expendSz);
        parcel.writeString(this.obtainedSz);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.fillSz);
        parcel.writeString(this.fillTime);
        parcel.writeString(this.accFillSz);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.state);
        parcel.writeString(this.lever);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.fee);
        parcel.writeString(this.rebateCcy);
        parcel.writeString(this.rebate);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.pnl);
        parcel.writeString(this.category);
        parcel.writeString(this.uTime);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.bankruptcyPx);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.fillNotionalUsd);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.cancelSourceReason);
        parcel.writeString(this.source);
        parcel.writeString(this.sideMsg);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.ordSource);
        parcel.writeString(this.algoId);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.multiplier);
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
        parcel.writeString(this.lastPx);
        parcel.writeString(this.isTpLimit);
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
        parcel.writeString(this.ccy);
        parcel.writeString(this.ruleType);
        parcel.writeString(this.chaseType);
        parcel.writeString(this.chaseVal);
        parcel.writeString(this.stopChasePrice);
        parcel.writeString(this.displayId);
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.isDex);
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        if (dexOrderDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexOrderDetail.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TradeOrderData(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, ArrayList arrayList, String str59, String str60, String str61, LinkedAlgoOrd linkedAlgoOrd, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, DexOrderDetail dexOrderDetail, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.ordId = "";
        } else {
            this.ordId = str5;
        }
        if ((i & 32) == 0) {
            this.px = "";
        } else {
            this.px = str6;
        }
        if ((i & 64) == 0) {
            this.sz = "";
        } else {
            this.sz = str7;
        }
        if ((i & 128) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str8;
        }
        if ((i & 256) == 0) {
            this.side = "";
        } else {
            this.side = str9;
        }
        if ((i & 512) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str10;
        }
        if ((i & 1024) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str11;
        }
        if ((i & 2048) == 0) {
            this.fillPx = "";
        } else {
            this.fillPx = str12;
        }
        if ((i & 4096) == 0) {
            this.expendSz = "";
        } else {
            this.expendSz = str13;
        }
        if ((i & 8192) == 0) {
            this.obtainedSz = "";
        } else {
            this.obtainedSz = str14;
        }
        if ((i & 16384) == 0) {
            this.tradeId = "";
        } else {
            this.tradeId = str15;
        }
        if ((i & 32768) == 0) {
            this.fillSz = "";
        } else {
            this.fillSz = str16;
        }
        if ((i & 65536) == 0) {
            this.fillTime = "";
        } else {
            this.fillTime = str17;
        }
        if ((i & 131072) == 0) {
            this.accFillSz = "";
        } else {
            this.accFillSz = str18;
        }
        if ((i & 262144) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str19;
        }
        if ((i & 524288) == 0) {
            this.state = "";
        } else {
            this.state = str20;
        }
        if ((1048576 & i) == 0) {
            this.lever = "";
        } else {
            this.lever = str21;
        }
        if ((2097152 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str22;
        }
        if ((4194304 & i) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str23;
        }
        if ((8388608 & i) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str24;
        }
        if ((16777216 & i) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str25;
        }
        if ((33554432 & i) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str26;
        }
        if ((67108864 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str27;
        }
        if ((134217728 & i) == 0) {
            this.rebateCcy = "";
        } else {
            this.rebateCcy = str28;
        }
        if ((268435456 & i) == 0) {
            this.rebate = "";
        } else {
            this.rebate = str29;
        }
        if ((536870912 & i) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str30;
        }
        if ((1073741824 & i) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.category = "";
        } else {
            this.category = str32;
        }
        if ((i2 & 1) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str33;
        }
        if ((i2 & 2) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str34;
        }
        if ((i2 & 4) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str35;
        }
        if ((i2 & 8) == 0) {
            this.ctVal = null;
        } else {
            this.ctVal = str36;
        }
        if ((i2 & 16) == 0) {
            this.avgCost = "";
        } else {
            this.avgCost = str37;
        }
        if ((i2 & 32) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str38;
        }
        if ((i2 & 64) == 0) {
            this.bankruptcyPx = "";
        } else {
            this.bankruptcyPx = str39;
        }
        if ((i2 & 128) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str40;
        }
        if ((i2 & 256) == 0) {
            this.fillNotionalUsd = "";
        } else {
            this.fillNotionalUsd = str41;
        }
        if ((i2 & 512) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str42;
        }
        if ((i2 & 1024) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str43;
        }
        if ((i2 & 2048) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str44;
        }
        if ((i2 & 4096) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str45;
        }
        if ((i2 & 8192) == 0) {
            this.quickMgnType = "";
        } else {
            this.quickMgnType = str46;
        }
        if ((i2 & 16384) == 0) {
            this.cancelSourceReason = "";
        } else {
            this.cancelSourceReason = str47;
        }
        if ((i2 & 32768) == 0) {
            this.source = "";
        } else {
            this.source = str48;
        }
        if ((i2 & 65536) == 0) {
            this.sideMsg = "";
        } else {
            this.sideMsg = str49;
        }
        if ((i2 & 131072) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str50;
        }
        if ((i2 & 262144) == 0) {
            this.ordSource = null;
        } else {
            this.ordSource = str51;
        }
        if ((i2 & 524288) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str52;
        }
        if ((1048576 & i2) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str53;
        }
        if ((2097152 & i2) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str54;
        }
        if ((4194304 & i2) == 0) {
            this.multiplier = "";
        } else {
            this.multiplier = str55;
        }
        if ((8388608 & i2) == 0) {
            this.amendResult = null;
        } else {
            this.amendResult = str56;
        }
        if ((16777216 & i2) == 0) {
            this.amendSource = null;
        } else {
            this.amendSource = str57;
        }
        if ((33554432 & i2) == 0) {
            this.code = null;
        } else {
            this.code = str58;
        }
        if ((67108864 & i2) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = arrayList;
        }
        if ((134217728 & i2) == 0) {
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str59;
        }
        if ((268435456 & i2) == 0) {
            this.lastPx = "";
        } else {
            this.lastPx = str60;
        }
        if ((536870912 & i2) == 0) {
            this.isTpLimit = "";
        } else {
            this.isTpLimit = str61;
        }
        if ((1073741824 & i2) == 0) {
            this.linkedAlgoOrd = null;
        } else {
            this.linkedAlgoOrd = linkedAlgoOrd;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.pxType = null;
        } else {
            this.pxType = str62;
        }
        if ((i3 & 1) == 0) {
            this.pxUsd = null;
        } else {
            this.pxUsd = str63;
        }
        if ((i3 & 2) == 0) {
            this.pxVol = null;
        } else {
            this.pxVol = str64;
        }
        if ((i3 & 4) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str65;
        }
        if ((i3 & 8) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str66;
        }
        if ((i3 & 16) == 0) {
            this.chaseType = null;
        } else {
            this.chaseType = str67;
        }
        if ((i3 & 32) == 0) {
            this.chaseVal = null;
        } else {
            this.chaseVal = str68;
        }
        if ((i3 & 64) == 0) {
            this.stopChasePrice = null;
        } else {
            this.stopChasePrice = str69;
        }
        if ((i3 & 128) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str70;
        }
        if ((i3 & 256) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str71;
        }
        if ((i3 & 512) == 0) {
            this.isDex = "";
        } else {
            this.isDex = str72;
        }
        if ((i3 & 1024) == 0) {
            this.dexOrderDetail = null;
        } else {
            this.dexOrderDetail = dexOrderDetail;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeOrderData tradeOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeOrderData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeOrderData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeOrderData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeOrderData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeOrderData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeOrderData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeOrderData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeOrderData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeOrderData.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeOrderData.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeOrderData.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeOrderData.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeOrderData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeOrderData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeOrderData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeOrderData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeOrderData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeOrderData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeOrderData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeOrderData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeOrderData.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeOrderData.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeOrderData.fillPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeOrderData.fillPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeOrderData.expendSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeOrderData.expendSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeOrderData.obtainedSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeOrderData.obtainedSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeOrderData.tradeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeOrderData.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeOrderData.fillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeOrderData.fillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeOrderData.fillTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeOrderData.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeOrderData.accFillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeOrderData.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeOrderData.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeOrderData.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeOrderData.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeOrderData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeOrderData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeOrderData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeOrderData.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeOrderData.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeOrderData.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeOrderData.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeOrderData.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeOrderData.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeOrderData.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeOrderData.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradeOrderData.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradeOrderData.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeOrderData.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeOrderData.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeOrderData.rebateCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeOrderData.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeOrderData.rebate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeOrderData.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) tradeOrderData.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, tradeOrderData.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradeOrderData.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, tradeOrderData.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) tradeOrderData.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, tradeOrderData.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradeOrderData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradeOrderData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) tradeOrderData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, tradeOrderData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) tradeOrderData.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, tradeOrderData.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || tradeOrderData.ctVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, tradeOrderData.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) tradeOrderData.avgCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, tradeOrderData.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) tradeOrderData.triggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, tradeOrderData.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) tradeOrderData.bankruptcyPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, tradeOrderData.bankruptcyPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) tradeOrderData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, tradeOrderData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) tradeOrderData.fillNotionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, tradeOrderData.fillNotionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || tradeOrderData.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, tradeOrderData.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || tradeOrderData.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, tradeOrderData.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || tradeOrderData.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, tradeOrderData.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) tradeOrderData.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, tradeOrderData.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) tradeOrderData.quickMgnType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, tradeOrderData.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) tradeOrderData.cancelSourceReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, tradeOrderData.cancelSourceReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) tradeOrderData.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, tradeOrderData.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) tradeOrderData.sideMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, tradeOrderData.sideMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) tradeOrderData.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, tradeOrderData.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || tradeOrderData.ordSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, tradeOrderData.ordSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) tradeOrderData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, tradeOrderData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) tradeOrderData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, tradeOrderData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) tradeOrderData.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, tradeOrderData.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) tradeOrderData.multiplier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, tradeOrderData.multiplier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || tradeOrderData.amendResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, tradeOrderData.amendResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || tradeOrderData.amendSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, tradeOrderData.amendSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || tradeOrderData.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, tradeOrderData.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || tradeOrderData.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, kSerializerArr[58], tradeOrderData.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || tradeOrderData.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, StringSerializer.INSTANCE, tradeOrderData.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) tradeOrderData.lastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, tradeOrderData.lastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) tradeOrderData.isTpLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, tradeOrderData.isTpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || tradeOrderData.linkedAlgoOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, LinkedAlgoOrd$$serializer.INSTANCE, tradeOrderData.linkedAlgoOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || tradeOrderData.pxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, tradeOrderData.pxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || tradeOrderData.pxUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, tradeOrderData.pxUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || tradeOrderData.pxVol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, tradeOrderData.pxVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || tradeOrderData.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, tradeOrderData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) tradeOrderData.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, tradeOrderData.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || tradeOrderData.chaseType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, tradeOrderData.chaseType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || tradeOrderData.chaseVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, tradeOrderData.chaseVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || tradeOrderData.stopChasePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, StringSerializer.INSTANCE, tradeOrderData.stopChasePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd((Object) tradeOrderData.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 71, tradeOrderData.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || tradeOrderData.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, tradeOrderData.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) tradeOrderData.isDex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 73, tradeOrderData.isDex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) && tradeOrderData.dexOrderDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, DexOrderDetail$$serializer.INSTANCE, tradeOrderData.dexOrderDetail);
    }

    public TradeOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, String str42, String str43, String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, String str56, String str57, String str58, ArrayList<TradeOrderStopParam> arrayList, String str59, @NotNull String str60, @NotNull String str61, LinkedAlgoOrd linkedAlgoOrd, String str62, String str63, String str64, String str65, @NotNull String str66, String str67, String str68, String str69, @NotNull String str70, String str71, @NotNull String str72, DexOrderDetail dexOrderDetail) {
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
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str72, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.instFamily = str4;
        this.ordId = str5;
        this.px = str6;
        this.sz = str7;
        this.ordType = str8;
        this.side = str9;
        this.posSide = str10;
        this.tdMode = str11;
        this.fillPx = str12;
        this.expendSz = str13;
        this.obtainedSz = str14;
        this.tradeId = str15;
        this.fillSz = str16;
        this.fillTime = str17;
        this.accFillSz = str18;
        this.avgPx = str19;
        this.state = str20;
        this.lever = str21;
        this.tpTriggerPx = str22;
        this.tpOrdPx = str23;
        this.slTriggerPx = str24;
        this.slOrdPx = str25;
        this.feeCcy = str26;
        this.fee = str27;
        this.rebateCcy = str28;
        this.rebate = str29;
        this.pnlCcy = str30;
        this.pnl = str31;
        this.category = str32;
        this.uTime = str33;
        this.cTime = str34;
        this.pnlRatio = str35;
        this.ctVal = str36;
        this.avgCost = str37;
        this.triggerPx = str38;
        this.bankruptcyPx = str39;
        this.notionalUsd = str40;
        this.fillNotionalUsd = str41;
        this.tgtCcy = str42;
        this.tpTriggerPxType = str43;
        this.slTriggerPxType = str44;
        this.reduceOnly = str45;
        this.quickMgnType = str46;
        this.cancelSourceReason = str47;
        this.source = str48;
        this.sideMsg = str49;
        this.closeFraction = str50;
        this.ordSource = str51;
        this.algoId = str52;
        this.bizRefType = str53;
        this.feeRate = str54;
        this.multiplier = str55;
        this.amendResult = str56;
        this.amendSource = str57;
        this.code = str58;
        this.attachAlgoOrds = arrayList;
        this.amendPxOnTriggerType = str59;
        this.lastPx = str60;
        this.isTpLimit = str61;
        this.linkedAlgoOrd = linkedAlgoOrd;
        this.pxType = str62;
        this.pxUsd = str63;
        this.pxVol = str64;
        this.ccy = str65;
        this.ruleType = str66;
        this.chaseType = str67;
        this.chaseVal = str68;
        this.stopChasePrice = str69;
        this.displayId = str70;
        this.tradeQuoteCcy = str71;
        this.isDex = str72;
        this.dexOrderDetail = dexOrderDetail;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TradeOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, ArrayList arrayList, String str59, String str60, String str61, LinkedAlgoOrd linkedAlgoOrd, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, DexOrderDetail dexOrderDetail, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str73 = (i & 1) != 0 ? "" : str;
        String str74 = (i & 2) != 0 ? "" : str2;
        String str75 = (i & 4) != 0 ? "" : str3;
        String str76 = (i & 8) != 0 ? "" : str4;
        String str77 = (i & 16) != 0 ? "" : str5;
        String str78 = (i & 32) != 0 ? "" : str6;
        String str79 = (i & 64) != 0 ? "" : str7;
        String str80 = (i & 128) != 0 ? "" : str8;
        String str81 = (i & 256) != 0 ? "" : str9;
        String str82 = (i & 512) != 0 ? "" : str10;
        String str83 = (i & 1024) != 0 ? "" : str11;
        String str84 = (i & 2048) != 0 ? "" : str12;
        String str85 = (i & 4096) != 0 ? "" : str13;
        String str86 = (i & 8192) != 0 ? "" : str14;
        String str87 = (i & 16384) != 0 ? "" : str15;
        String str88 = (i & 32768) != 0 ? "" : str16;
        String str89 = (i & 65536) != 0 ? "" : str17;
        String str90 = (i & 131072) != 0 ? "" : str18;
        String str91 = (i & 262144) != 0 ? "" : str19;
        String str92 = (i & 524288) != 0 ? "" : str20;
        String str93 = (i & 1048576) != 0 ? "" : str21;
        String str94 = (i & 2097152) != 0 ? "" : str22;
        String str95 = (i & 4194304) != 0 ? "" : str23;
        String str96 = (i & 8388608) != 0 ? "" : str24;
        String str97 = (i & 16777216) != 0 ? "" : str25;
        String str98 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str99 = (i & 67108864) != 0 ? "" : str27;
        String str100 = (i & 134217728) != 0 ? "" : str28;
        String str101 = (i & 268435456) != 0 ? "" : str29;
        String str102 = (i & 536870912) != 0 ? "" : str30;
        String str103 = (i & 1073741824) != 0 ? "" : str31;
        String str104 = (i & Integer.MIN_VALUE) != 0 ? "" : str32;
        this(str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? null : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, (i2 & 256) != 0 ? "" : str41, (i2 & 512) != 0 ? null : str42, (i2 & 1024) != 0 ? null : str43, (i2 & 2048) != 0 ? null : str44, (i2 & 4096) != 0 ? "" : str45, (i2 & 8192) != 0 ? "" : str46, (i2 & 16384) != 0 ? "" : str47, (i2 & 32768) != 0 ? "" : str48, (i2 & 65536) != 0 ? "" : str49, (i2 & 131072) != 0 ? "" : str50, (i2 & 262144) != 0 ? null : str51, (i2 & 524288) != 0 ? "" : str52, (i2 & 1048576) != 0 ? "" : str53, (i2 & 2097152) != 0 ? "" : str54, (i2 & 4194304) != 0 ? "" : str55, (i2 & 8388608) != 0 ? null : str56, (i2 & 16777216) != 0 ? null : str57, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str58, (i2 & 67108864) != 0 ? null : arrayList, (i2 & 134217728) != 0 ? null : str59, (i2 & 268435456) != 0 ? "" : str60, (i2 & 536870912) != 0 ? "" : str61, (i2 & 1073741824) != 0 ? null : linkedAlgoOrd, (i2 & Integer.MIN_VALUE) != 0 ? null : str62, (i3 & 1) != 0 ? null : str63, (i3 & 2) != 0 ? null : str64, (i3 & 4) != 0 ? null : str65, (i3 & 8) != 0 ? "" : str66, (i3 & 16) != 0 ? null : str67, (i3 & 32) != 0 ? null : str68, (i3 & 64) != 0 ? null : str69, (i3 & 128) != 0 ? "" : str70, (i3 & 256) != 0 ? null : str71, (i3 & 512) != 0 ? "" : str72, (i3 & 1024) == 0 ? dexOrderDetail : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class PXTYPE {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PXTYPE[] $VALUES;
        private final String str;
        public static final PXTYPE PX = new PXTYPE("PX", 0, "px");
        public static final PXTYPE PXVOL = new PXTYPE("PXVOL", 1, "pxVol");
        public static final PXTYPE PXUSD = new PXTYPE("PXUSD", 2, "pxUsd");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PXTYPE[] $values() {
            return new PXTYPE[]{PX, PXVOL, PXUSD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PXTYPE> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStr() {
            return this.str;
        }

        private PXTYPE(String str, int i, String str2) {
            this.str = str2;
        }

        static {
            PXTYPE[] pxtypeArr$values = $values();
            $VALUES = pxtypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pxtypeArr$values);
        }

        public static PXTYPE valueOf(String str) {
            return (PXTYPE) Enum.valueOf(PXTYPE.class, str);
        }

        public static PXTYPE[] values() {
            return (PXTYPE[]) $VALUES.clone();
        }
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends TradeOrderData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeOrderData> serializer() {
            return TradeOrderData$$serializer.INSTANCE;
        }

        public final List<TradeOrderData> AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Application().getType());
                if (list != null && !list.isEmpty()) {
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "TradeOrderData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }

    public final boolean isHistory() {
        return Intrinsics.EZpvd((Object) this.state, (Object) "filled") || Intrinsics.EZpvd((Object) this.state, (Object) "canceled");
    }

    public final boolean isSupportMultipleTpsl() {
        C56084xwD fieldNames;
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        if (!C33129mqd.AEQbTJ(arrayList != null ? Integer.valueOf(arrayList.size()) : null, 0)) {
            ArrayList<TradeOrderStopParam> arrayList2 = this.attachAlgoOrds;
            if (!C33129mqd.valueOf(arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null, 0) || !C33129mqd.valueOf(this.tpTriggerPx, 0) || !C33129mqd.valueOf(this.slTriggerPx, 0)) {
                return false;
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null || fieldNames.djBIcL() || Intrinsics.EZpvd((Object) this.ordType, (Object) "trigger")) ? false : true;
    }

    public final boolean isChaseOrder() {
        return Intrinsics.EZpvd((Object) this.source, (Object) "34");
    }

    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrderIdByAll() {
        String orderId;
        if (!isDexOrder()) {
            return this.ordId;
        }
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (dexOrderDetail == null || (orderId = dexOrderDetail.getOrderId()) == null) ? "" : orderId;
    }

    @Override // com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi
    public String getOrtType() {
        String orderType;
        if (!isDexOrder()) {
            return this.ordType;
        }
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (dexOrderDetail == null || (orderType = dexOrderDetail.getOrderType()) == null) ? "" : orderType;
    }

    @Override // o.InterfaceC55726xpQ, o.InterfaceC55847xrf
    public String getOrderType() {
        String orderType;
        if (!isDexOrder()) {
            return this.ordType;
        }
        DexOrderDetail dexOrderDetail = this.dexOrderDetail;
        return (dexOrderDetail == null || (orderType = dexOrderDetail.getOrderType()) == null) ? "" : orderType;
    }

    public final String getDisplayInstId() {
        String str = this.displayId;
        return str.length() == 0 ? this.instId : str;
    }

    @Override // o.InterfaceC55726xpQ
    public boolean isDexOrder() {
        return Intrinsics.EZpvd((Object) this.isDex, (Object) "1");
    }

    public String getOrderTpTriggerRatio() {
        TradeOrderStopParam tradeOrderStopParam;
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        if (arrayList == null || (tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0)) == null) {
            return null;
        }
        return tradeOrderStopParam.getTpTriggerRatio();
    }

    public String getOrderSlTriggerRatio() {
        TradeOrderStopParam tradeOrderStopParam;
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        if (arrayList == null || (tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0)) == null) {
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
