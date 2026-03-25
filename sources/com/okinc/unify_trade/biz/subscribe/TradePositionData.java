package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.reflect.TypeToken;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradePositionData implements Parcelable {
    private String adl;
    private String availPos;
    private String avgPx;
    private String baseBal;
    private String baseBorrowed;
    private String baseInterest;
    private String bePx;
    private String bestSlTriggerPx;
    private String bestTpTriggerPx;
    private String bizRefId;
    private String bizRefType;
    private String cTime;
    private String ccy;
    private List<TpslAllInfo> closeOrderAlgo;
    private String deltaBS;
    private String deltaPA;
    private String fee;
    private String fundingFee;
    private String hedgedPos;
    private String imr;
    private String instFamily;
    private String instId;
    private String instType;
    private String interest;
    private String last;
    private String lever;
    private String liab;
    private String liabCcy;
    private String liqPenalty;
    private String liqPx;
    private String margin;
    private String markPx;
    private String mgnMode;
    private String mgnRatio;
    private String mmr;
    private String nonSettleAvgPx;
    private String notionalUsd;
    private String optVal;
    private String pendingCloseOrdLiabVal;
    private String pnl;
    private String pos;
    private String posCcy;
    private String posId;
    private String posRelationAlgoOrdCount;
    private String posSide;
    private TradeUserPositionInfo posUserInfo;
    private String quoteBal;
    private String quoteBorrowed;
    private String quoteInterest;
    private String realizedPnl;
    private String riskUnitCcy;
    private String settledPnl;
    private String spotInUseAmt;
    private String spotInUseCcy;
    private String thetaBS;
    private String thetaPA;
    private String tradeId;
    private String uTime;
    private String uly;
    private String upl;
    private String uplLastPx;
    private String uplRatio;
    private String uplRatioLastPx;
    private String usdPx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradePositionData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TpslAllInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TradePositionData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradePositionData createFromParcel(Parcel parcel) {
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
            TradeUserPositionInfo tradeUserPositionInfoCreateFromParcel = parcel.readInt() == 0 ? null : TradeUserPositionInfo.CREATOR.createFromParcel(parcel);
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string13;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(TpslAllInfo.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new TradePositionData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, tradeUserPositionInfoCreateFromParcel, string30, string31, string32, string33, string34, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradePositionData[] newArray(int i) {
            return new TradePositionData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradePositionData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.optVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.uplLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.uplRatioLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.availPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeUserPositionInfo component30() {
        return this.posUserInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.usdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TpslAllInfo> component36() {
        return this.closeOrderAlgo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.baseBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.baseInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.quoteBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.quoteInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.spotInUseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.pendingCloseOrdLiabVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.bizRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.riskUnitCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.liqPenalty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.bestSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.bestTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.posRelationAlgoOrdCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.bePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.nonSettleAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.settledPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.hedgedPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.deltaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.deltaPA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.thetaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.thetaPA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradePositionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, TradeUserPositionInfo tradeUserPositionInfo, @NotNull String str30, String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, List<TpslAllInfo> list, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, String str52, String str53, String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62) {
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
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
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        return new TradePositionData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, tradeUserPositionInfo, str30, str31, str32, str33, str34, list, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62);
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
        if (!(obj instanceof TradePositionData)) {
            return false;
        }
        TradePositionData tradePositionData = (TradePositionData) obj;
        return Intrinsics.EZpvd((Object) this.posId, (Object) tradePositionData.posId) && Intrinsics.EZpvd((Object) this.adl, (Object) tradePositionData.adl) && Intrinsics.EZpvd((Object) this.availPos, (Object) tradePositionData.availPos) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tradePositionData.avgPx) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradePositionData.ccy) && Intrinsics.EZpvd((Object) this.cTime, (Object) tradePositionData.cTime) && Intrinsics.EZpvd((Object) this.tradeId, (Object) tradePositionData.tradeId) && Intrinsics.EZpvd((Object) this.imr, (Object) tradePositionData.imr) && Intrinsics.EZpvd((Object) this.instId, (Object) tradePositionData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradePositionData.instType) && Intrinsics.EZpvd((Object) this.interest, (Object) tradePositionData.interest) && Intrinsics.EZpvd((Object) this.lever, (Object) tradePositionData.lever) && Intrinsics.EZpvd((Object) this.liab, (Object) tradePositionData.liab) && Intrinsics.EZpvd((Object) this.liabCcy, (Object) tradePositionData.liabCcy) && Intrinsics.EZpvd((Object) this.liqPx, (Object) tradePositionData.liqPx) && Intrinsics.EZpvd((Object) this.margin, (Object) tradePositionData.margin) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) tradePositionData.mgnMode) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) tradePositionData.mgnRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) tradePositionData.mmr) && Intrinsics.EZpvd((Object) this.optVal, (Object) tradePositionData.optVal) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradePositionData.posSide) && Intrinsics.EZpvd((Object) this.pos, (Object) tradePositionData.pos) && Intrinsics.EZpvd((Object) this.posCcy, (Object) tradePositionData.posCcy) && Intrinsics.EZpvd((Object) this.upl, (Object) tradePositionData.upl) && Intrinsics.EZpvd((Object) this.uplRatio, (Object) tradePositionData.uplRatio) && Intrinsics.EZpvd((Object) this.uplLastPx, (Object) tradePositionData.uplLastPx) && Intrinsics.EZpvd((Object) this.uplRatioLastPx, (Object) tradePositionData.uplRatioLastPx) && Intrinsics.EZpvd((Object) this.last, (Object) tradePositionData.last) && Intrinsics.EZpvd((Object) this.uTime, (Object) tradePositionData.uTime) && Intrinsics.EZpvd(this.posUserInfo, tradePositionData.posUserInfo) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) tradePositionData.notionalUsd) && Intrinsics.EZpvd((Object) this.usdPx, (Object) tradePositionData.usdPx) && Intrinsics.EZpvd((Object) this.markPx, (Object) tradePositionData.markPx) && Intrinsics.EZpvd((Object) this.baseBal, (Object) tradePositionData.baseBal) && Intrinsics.EZpvd((Object) this.quoteBal, (Object) tradePositionData.quoteBal) && Intrinsics.EZpvd(this.closeOrderAlgo, tradePositionData.closeOrderAlgo) && Intrinsics.EZpvd((Object) this.baseBorrowed, (Object) tradePositionData.baseBorrowed) && Intrinsics.EZpvd((Object) this.baseInterest, (Object) tradePositionData.baseInterest) && Intrinsics.EZpvd((Object) this.quoteBorrowed, (Object) tradePositionData.quoteBorrowed) && Intrinsics.EZpvd((Object) this.quoteInterest, (Object) tradePositionData.quoteInterest) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) tradePositionData.spotInUseAmt) && Intrinsics.EZpvd((Object) this.spotInUseCcy, (Object) tradePositionData.spotInUseCcy) && Intrinsics.EZpvd((Object) this.pendingCloseOrdLiabVal, (Object) tradePositionData.pendingCloseOrdLiabVal) && Intrinsics.EZpvd((Object) this.bizRefId, (Object) tradePositionData.bizRefId) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) tradePositionData.bizRefType) && Intrinsics.EZpvd((Object) this.riskUnitCcy, (Object) tradePositionData.riskUnitCcy) && Intrinsics.EZpvd((Object) this.instFamily, (Object) tradePositionData.instFamily) && Intrinsics.EZpvd((Object) this.uly, (Object) tradePositionData.uly) && Intrinsics.EZpvd((Object) this.realizedPnl, (Object) tradePositionData.realizedPnl) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradePositionData.pnl) && Intrinsics.EZpvd((Object) this.fee, (Object) tradePositionData.fee) && Intrinsics.EZpvd((Object) this.fundingFee, (Object) tradePositionData.fundingFee) && Intrinsics.EZpvd((Object) this.liqPenalty, (Object) tradePositionData.liqPenalty) && Intrinsics.EZpvd((Object) this.bestSlTriggerPx, (Object) tradePositionData.bestSlTriggerPx) && Intrinsics.EZpvd((Object) this.bestTpTriggerPx, (Object) tradePositionData.bestTpTriggerPx) && Intrinsics.EZpvd((Object) this.posRelationAlgoOrdCount, (Object) tradePositionData.posRelationAlgoOrdCount) && Intrinsics.EZpvd((Object) this.bePx, (Object) tradePositionData.bePx) && Intrinsics.EZpvd((Object) this.nonSettleAvgPx, (Object) tradePositionData.nonSettleAvgPx) && Intrinsics.EZpvd((Object) this.settledPnl, (Object) tradePositionData.settledPnl) && Intrinsics.EZpvd((Object) this.hedgedPos, (Object) tradePositionData.hedgedPos) && Intrinsics.EZpvd((Object) this.deltaBS, (Object) tradePositionData.deltaBS) && Intrinsics.EZpvd((Object) this.deltaPA, (Object) tradePositionData.deltaPA) && Intrinsics.EZpvd((Object) this.thetaBS, (Object) tradePositionData.thetaBS) && Intrinsics.EZpvd((Object) this.thetaPA, (Object) tradePositionData.thetaPA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdl() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailPos() {
        return this.availPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseBal() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseBorrowed() {
        return this.baseBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseInterest() {
        return this.baseInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBePx() {
        return this.bePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBestSlTriggerPx() {
        return this.bestSlTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBestTpTriggerPx() {
        return this.bestTpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefId() {
        return this.bizRefId;
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
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TpslAllInfo> getCloseOrderAlgo() {
        return this.closeOrderAlgo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaBS() {
        return this.deltaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaPA() {
        return this.deltaPA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHedgedPos() {
        return this.hedgedPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
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
    public final String getInterest() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiab() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabCcy() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPenalty() {
        return this.liqPenalty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarkPx() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
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
    public final String getNonSettleAvgPx() {
        return this.nonSettleAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptVal() {
        return this.optVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingCloseOrdLiabVal() {
        return this.pendingCloseOrdLiabVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosCcy() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosRelationAlgoOrdCount() {
        return this.posRelationAlgoOrdCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeUserPositionInfo getPosUserInfo() {
        return this.posUserInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBal() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBorrowed() {
        return this.quoteBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteInterest() {
        return this.quoteInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskUnitCcy() {
        return this.riskUnitCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettledPnl() {
        return this.settledPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmt() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseCcy() {
        return this.spotInUseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThetaBS() {
        return this.thetaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThetaPA() {
        return this.thetaPA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
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
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplLastPx() {
        return this.uplLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplRatio() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplRatioLastPx() {
        return this.uplRatioLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdPx() {
        return this.usdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.posId.hashCode();
        int iHashCode2 = this.adl.hashCode();
        int iHashCode3 = this.availPos.hashCode();
        int iHashCode4 = this.avgPx.hashCode();
        int iHashCode5 = this.ccy.hashCode();
        int iHashCode6 = this.cTime.hashCode();
        int iHashCode7 = this.tradeId.hashCode();
        int iHashCode8 = this.imr.hashCode();
        int iHashCode9 = this.instId.hashCode();
        int iHashCode10 = this.instType.hashCode();
        int iHashCode11 = this.interest.hashCode();
        int iHashCode12 = this.lever.hashCode();
        int iHashCode13 = this.liab.hashCode();
        int iHashCode14 = this.liabCcy.hashCode();
        int iHashCode15 = this.liqPx.hashCode();
        int iHashCode16 = this.margin.hashCode();
        int iHashCode17 = this.mgnMode.hashCode();
        int iHashCode18 = this.mgnRatio.hashCode();
        int iHashCode19 = this.mmr.hashCode();
        int iHashCode20 = this.optVal.hashCode();
        int iHashCode21 = this.posSide.hashCode();
        int iHashCode22 = this.pos.hashCode();
        int iHashCode23 = this.posCcy.hashCode();
        int iHashCode24 = this.upl.hashCode();
        int iHashCode25 = this.uplRatio.hashCode();
        int iHashCode26 = this.uplLastPx.hashCode();
        int iHashCode27 = this.uplRatioLastPx.hashCode();
        int iHashCode28 = this.last.hashCode();
        int iHashCode29 = this.uTime.hashCode();
        TradeUserPositionInfo tradeUserPositionInfo = this.posUserInfo;
        int iHashCode30 = tradeUserPositionInfo == null ? 0 : tradeUserPositionInfo.hashCode();
        int iHashCode31 = this.notionalUsd.hashCode();
        String str = this.usdPx;
        int iHashCode32 = str == null ? 0 : str.hashCode();
        int iHashCode33 = this.markPx.hashCode();
        int iHashCode34 = this.baseBal.hashCode();
        int iHashCode35 = this.quoteBal.hashCode();
        List<TpslAllInfo> list = this.closeOrderAlgo;
        int iHashCode36 = list == null ? 0 : list.hashCode();
        int iHashCode37 = this.baseBorrowed.hashCode();
        int iHashCode38 = this.baseInterest.hashCode();
        int iHashCode39 = this.quoteBorrowed.hashCode();
        int iHashCode40 = this.quoteInterest.hashCode();
        int iHashCode41 = this.spotInUseAmt.hashCode();
        int iHashCode42 = this.spotInUseCcy.hashCode();
        int iHashCode43 = this.pendingCloseOrdLiabVal.hashCode();
        int iHashCode44 = this.bizRefId.hashCode();
        int iHashCode45 = this.bizRefType.hashCode();
        int iHashCode46 = this.riskUnitCcy.hashCode();
        int iHashCode47 = this.instFamily.hashCode();
        int iHashCode48 = this.uly.hashCode();
        int iHashCode49 = this.realizedPnl.hashCode();
        int iHashCode50 = this.pnl.hashCode();
        int iHashCode51 = this.fee.hashCode();
        int iHashCode52 = this.fundingFee.hashCode();
        int iHashCode53 = this.liqPenalty.hashCode();
        String str2 = this.bestSlTriggerPx;
        int iHashCode54 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bestTpTriggerPx;
        int iHashCode55 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.posRelationAlgoOrdCount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.bePx.hashCode()) * 31) + this.nonSettleAvgPx.hashCode()) * 31) + this.settledPnl.hashCode()) * 31) + this.hedgedPos.hashCode()) * 31) + this.deltaBS.hashCode()) * 31) + this.deltaPA.hashCode()) * 31) + this.thetaBS.hashCode()) * 31) + this.thetaPA.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.adl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availPos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseBorrowed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseBorrowed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseInterest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseInterest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBePx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBestSlTriggerPx(String str) {
        this.bestSlTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBestTpTriggerPx(String str) {
        this.bestTpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizRefId = str;
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
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseOrderAlgo(List<TpslAllInfo> list) {
        this.closeOrderAlgo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaBS = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaPA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaPA = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHedgedPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hedgedPos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imr = str;
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
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liabCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPenalty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPenalty = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.margin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarkPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.markPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
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
    public final void setNonSettleAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonSettleAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.optVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingCloseOrdLiabVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingCloseOrdLiabVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosRelationAlgoOrdCount(String str) {
        this.posRelationAlgoOrdCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosUserInfo(TradeUserPositionInfo tradeUserPositionInfo) {
        this.posUserInfo = tradeUserPositionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteBorrowed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteBorrowed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteInterest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteInterest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealizedPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.realizedPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskUnitCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskUnitCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettledPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settledPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotInUseCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThetaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.thetaBS = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThetaPA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.thetaPA = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeId = str;
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
    public final void setUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUplLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uplLastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUplRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUplRatioLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uplRatioLastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdPx(String str) {
        this.usdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posId);
        parcel.writeString(this.adl);
        parcel.writeString(this.availPos);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.ccy);
        parcel.writeString(this.cTime);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.imr);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.interest);
        parcel.writeString(this.lever);
        parcel.writeString(this.liab);
        parcel.writeString(this.liabCcy);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.margin);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.mmr);
        parcel.writeString(this.optVal);
        parcel.writeString(this.posSide);
        parcel.writeString(this.pos);
        parcel.writeString(this.posCcy);
        parcel.writeString(this.upl);
        parcel.writeString(this.uplRatio);
        parcel.writeString(this.uplLastPx);
        parcel.writeString(this.uplRatioLastPx);
        parcel.writeString(this.last);
        parcel.writeString(this.uTime);
        TradeUserPositionInfo tradeUserPositionInfo = this.posUserInfo;
        if (tradeUserPositionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeUserPositionInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.usdPx);
        parcel.writeString(this.markPx);
        parcel.writeString(this.baseBal);
        parcel.writeString(this.quoteBal);
        List<TpslAllInfo> list = this.closeOrderAlgo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TpslAllInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.baseBorrowed);
        parcel.writeString(this.baseInterest);
        parcel.writeString(this.quoteBorrowed);
        parcel.writeString(this.quoteInterest);
        parcel.writeString(this.spotInUseAmt);
        parcel.writeString(this.spotInUseCcy);
        parcel.writeString(this.pendingCloseOrdLiabVal);
        parcel.writeString(this.bizRefId);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.riskUnitCcy);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.uly);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.pnl);
        parcel.writeString(this.fee);
        parcel.writeString(this.fundingFee);
        parcel.writeString(this.liqPenalty);
        parcel.writeString(this.bestSlTriggerPx);
        parcel.writeString(this.bestTpTriggerPx);
        parcel.writeString(this.posRelationAlgoOrdCount);
        parcel.writeString(this.bePx);
        parcel.writeString(this.nonSettleAvgPx);
        parcel.writeString(this.settledPnl);
        parcel.writeString(this.hedgedPos);
        parcel.writeString(this.deltaBS);
        parcel.writeString(this.deltaPA);
        parcel.writeString(this.thetaBS);
        parcel.writeString(this.thetaPA);
    }

    public /* synthetic */ TradePositionData(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, TradeUserPositionInfo tradeUserPositionInfo, String str30, String str31, String str32, String str33, String str34, List list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posId = "";
        } else {
            this.posId = str;
        }
        if ((i & 2) == 0) {
            this.adl = "";
        } else {
            this.adl = str2;
        }
        if ((i & 4) == 0) {
            this.availPos = "";
        } else {
            this.availPos = str3;
        }
        if ((i & 8) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str6;
        }
        if ((i & 64) == 0) {
            this.tradeId = "";
        } else {
            this.tradeId = str7;
        }
        if ((i & 128) == 0) {
            this.imr = "";
        } else {
            this.imr = str8;
        }
        if ((i & 256) == 0) {
            this.instId = "";
        } else {
            this.instId = str9;
        }
        if ((i & 512) == 0) {
            this.instType = "";
        } else {
            this.instType = str10;
        }
        if ((i & 1024) == 0) {
            this.interest = "";
        } else {
            this.interest = str11;
        }
        if ((i & 2048) == 0) {
            this.lever = "";
        } else {
            this.lever = str12;
        }
        if ((i & 4096) == 0) {
            this.liab = "";
        } else {
            this.liab = str13;
        }
        if ((i & 8192) == 0) {
            this.liabCcy = "";
        } else {
            this.liabCcy = str14;
        }
        if ((i & 16384) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str15;
        }
        if ((i & 32768) == 0) {
            this.margin = "";
        } else {
            this.margin = str16;
        }
        if ((i & 65536) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str17;
        }
        if ((i & 131072) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str18;
        }
        if ((i & 262144) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str19;
        }
        if ((i & 524288) == 0) {
            this.optVal = "";
        } else {
            this.optVal = str20;
        }
        if ((1048576 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str21;
        }
        if ((2097152 & i) == 0) {
            this.pos = "";
        } else {
            this.pos = str22;
        }
        if ((4194304 & i) == 0) {
            this.posCcy = "";
        } else {
            this.posCcy = str23;
        }
        if ((8388608 & i) == 0) {
            this.upl = "";
        } else {
            this.upl = str24;
        }
        if ((16777216 & i) == 0) {
            this.uplRatio = "";
        } else {
            this.uplRatio = str25;
        }
        if ((33554432 & i) == 0) {
            this.uplLastPx = "";
        } else {
            this.uplLastPx = str26;
        }
        if ((67108864 & i) == 0) {
            this.uplRatioLastPx = "";
        } else {
            this.uplRatioLastPx = str27;
        }
        if ((134217728 & i) == 0) {
            this.last = "";
        } else {
            this.last = str28;
        }
        if ((268435456 & i) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str29;
        }
        if ((536870912 & i) == 0) {
            this.posUserInfo = null;
        } else {
            this.posUserInfo = tradeUserPositionInfo;
        }
        if ((1073741824 & i) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.usdPx = null;
        } else {
            this.usdPx = str31;
        }
        if ((i2 & 1) == 0) {
            this.markPx = "";
        } else {
            this.markPx = str32;
        }
        if ((i2 & 2) == 0) {
            this.baseBal = "";
        } else {
            this.baseBal = str33;
        }
        if ((i2 & 4) == 0) {
            this.quoteBal = "";
        } else {
            this.quoteBal = str34;
        }
        if ((i2 & 8) == 0) {
            this.closeOrderAlgo = null;
        } else {
            this.closeOrderAlgo = list;
        }
        if ((i2 & 16) == 0) {
            this.baseBorrowed = "";
        } else {
            this.baseBorrowed = str35;
        }
        if ((i2 & 32) == 0) {
            this.baseInterest = "";
        } else {
            this.baseInterest = str36;
        }
        if ((i2 & 64) == 0) {
            this.quoteBorrowed = "";
        } else {
            this.quoteBorrowed = str37;
        }
        if ((i2 & 128) == 0) {
            this.quoteInterest = "";
        } else {
            this.quoteInterest = str38;
        }
        if ((i2 & 256) == 0) {
            this.spotInUseAmt = "";
        } else {
            this.spotInUseAmt = str39;
        }
        if ((i2 & 512) == 0) {
            this.spotInUseCcy = "";
        } else {
            this.spotInUseCcy = str40;
        }
        if ((i2 & 1024) == 0) {
            this.pendingCloseOrdLiabVal = "";
        } else {
            this.pendingCloseOrdLiabVal = str41;
        }
        if ((i2 & 2048) == 0) {
            this.bizRefId = "";
        } else {
            this.bizRefId = str42;
        }
        if ((i2 & 4096) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str43;
        }
        if ((i2 & 8192) == 0) {
            this.riskUnitCcy = "";
        } else {
            this.riskUnitCcy = str44;
        }
        if ((i2 & 16384) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str45;
        }
        if ((i2 & 32768) == 0) {
            this.uly = "";
        } else {
            this.uly = str46;
        }
        if ((i2 & 65536) == 0) {
            this.realizedPnl = "";
        } else {
            this.realizedPnl = str47;
        }
        if ((i2 & 131072) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str48;
        }
        if ((i2 & 262144) == 0) {
            this.fee = "";
        } else {
            this.fee = str49;
        }
        if ((i2 & 524288) == 0) {
            this.fundingFee = "";
        } else {
            this.fundingFee = str50;
        }
        if ((1048576 & i2) == 0) {
            this.liqPenalty = "";
        } else {
            this.liqPenalty = str51;
        }
        if ((2097152 & i2) == 0) {
            this.bestSlTriggerPx = "";
        } else {
            this.bestSlTriggerPx = str52;
        }
        if ((4194304 & i2) == 0) {
            this.bestTpTriggerPx = "";
        } else {
            this.bestTpTriggerPx = str53;
        }
        if ((8388608 & i2) == 0) {
            this.posRelationAlgoOrdCount = "";
        } else {
            this.posRelationAlgoOrdCount = str54;
        }
        if ((16777216 & i2) == 0) {
            this.bePx = "";
        } else {
            this.bePx = str55;
        }
        if ((33554432 & i2) == 0) {
            this.nonSettleAvgPx = "";
        } else {
            this.nonSettleAvgPx = str56;
        }
        if ((67108864 & i2) == 0) {
            this.settledPnl = "";
        } else {
            this.settledPnl = str57;
        }
        if ((134217728 & i2) == 0) {
            this.hedgedPos = "";
        } else {
            this.hedgedPos = str58;
        }
        if ((268435456 & i2) == 0) {
            this.deltaBS = "";
        } else {
            this.deltaBS = str59;
        }
        if ((536870912 & i2) == 0) {
            this.deltaPA = "";
        } else {
            this.deltaPA = str60;
        }
        if ((1073741824 & i2) == 0) {
            this.thetaBS = "";
        } else {
            this.thetaBS = str61;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.thetaPA = "";
        } else {
            this.thetaPA = str62;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradePositionData tradePositionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradePositionData.posId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradePositionData.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradePositionData.adl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradePositionData.adl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradePositionData.availPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradePositionData.availPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradePositionData.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradePositionData.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradePositionData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradePositionData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradePositionData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradePositionData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradePositionData.tradeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradePositionData.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradePositionData.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradePositionData.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradePositionData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradePositionData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradePositionData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradePositionData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradePositionData.interest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradePositionData.interest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradePositionData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradePositionData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradePositionData.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradePositionData.liab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradePositionData.liabCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradePositionData.liabCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradePositionData.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradePositionData.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradePositionData.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradePositionData.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradePositionData.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradePositionData.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradePositionData.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradePositionData.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradePositionData.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradePositionData.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradePositionData.optVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradePositionData.optVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradePositionData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradePositionData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradePositionData.pos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradePositionData.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradePositionData.posCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradePositionData.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradePositionData.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradePositionData.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradePositionData.uplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradePositionData.uplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradePositionData.uplLastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradePositionData.uplLastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradePositionData.uplRatioLastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradePositionData.uplRatioLastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradePositionData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradePositionData.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradePositionData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradePositionData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || tradePositionData.posUserInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, TradeUserPositionInfo$$serializer.INSTANCE, tradePositionData.posUserInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradePositionData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, tradePositionData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || tradePositionData.usdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, tradePositionData.usdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradePositionData.markPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradePositionData.markPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) tradePositionData.baseBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, tradePositionData.baseBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) tradePositionData.quoteBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, tradePositionData.quoteBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || tradePositionData.closeOrderAlgo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], tradePositionData.closeOrderAlgo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) tradePositionData.baseBorrowed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, tradePositionData.baseBorrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) tradePositionData.baseInterest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, tradePositionData.baseInterest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) tradePositionData.quoteBorrowed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, tradePositionData.quoteBorrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) tradePositionData.quoteInterest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, tradePositionData.quoteInterest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) tradePositionData.spotInUseAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, tradePositionData.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) tradePositionData.spotInUseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, tradePositionData.spotInUseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) tradePositionData.pendingCloseOrdLiabVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, tradePositionData.pendingCloseOrdLiabVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) tradePositionData.bizRefId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, tradePositionData.bizRefId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) tradePositionData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, tradePositionData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) tradePositionData.riskUnitCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, tradePositionData.riskUnitCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) tradePositionData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, tradePositionData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) tradePositionData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, tradePositionData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) tradePositionData.realizedPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, tradePositionData.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) tradePositionData.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, tradePositionData.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) tradePositionData.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, tradePositionData.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) tradePositionData.fundingFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, tradePositionData.fundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) tradePositionData.liqPenalty, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, tradePositionData.liqPenalty);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) tradePositionData.bestSlTriggerPx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, tradePositionData.bestSlTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) tradePositionData.bestTpTriggerPx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, tradePositionData.bestTpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) tradePositionData.posRelationAlgoOrdCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, tradePositionData.posRelationAlgoOrdCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) tradePositionData.bePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, tradePositionData.bePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) tradePositionData.nonSettleAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, tradePositionData.nonSettleAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) tradePositionData.settledPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, tradePositionData.settledPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) tradePositionData.hedgedPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, tradePositionData.hedgedPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) tradePositionData.deltaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, tradePositionData.deltaBS);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) tradePositionData.deltaPA, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, tradePositionData.deltaPA);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) tradePositionData.thetaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, tradePositionData.thetaBS);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) && Intrinsics.EZpvd((Object) tradePositionData.thetaPA, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 63, tradePositionData.thetaPA);
    }

    public TradePositionData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, TradeUserPositionInfo tradeUserPositionInfo, @NotNull String str30, String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, List<TpslAllInfo> list, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, String str52, String str53, String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62) {
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
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
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
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        this.posId = str;
        this.adl = str2;
        this.availPos = str3;
        this.avgPx = str4;
        this.ccy = str5;
        this.cTime = str6;
        this.tradeId = str7;
        this.imr = str8;
        this.instId = str9;
        this.instType = str10;
        this.interest = str11;
        this.lever = str12;
        this.liab = str13;
        this.liabCcy = str14;
        this.liqPx = str15;
        this.margin = str16;
        this.mgnMode = str17;
        this.mgnRatio = str18;
        this.mmr = str19;
        this.optVal = str20;
        this.posSide = str21;
        this.pos = str22;
        this.posCcy = str23;
        this.upl = str24;
        this.uplRatio = str25;
        this.uplLastPx = str26;
        this.uplRatioLastPx = str27;
        this.last = str28;
        this.uTime = str29;
        this.posUserInfo = tradeUserPositionInfo;
        this.notionalUsd = str30;
        this.usdPx = str31;
        this.markPx = str32;
        this.baseBal = str33;
        this.quoteBal = str34;
        this.closeOrderAlgo = list;
        this.baseBorrowed = str35;
        this.baseInterest = str36;
        this.quoteBorrowed = str37;
        this.quoteInterest = str38;
        this.spotInUseAmt = str39;
        this.spotInUseCcy = str40;
        this.pendingCloseOrdLiabVal = str41;
        this.bizRefId = str42;
        this.bizRefType = str43;
        this.riskUnitCcy = str44;
        this.instFamily = str45;
        this.uly = str46;
        this.realizedPnl = str47;
        this.pnl = str48;
        this.fee = str49;
        this.fundingFee = str50;
        this.liqPenalty = str51;
        this.bestSlTriggerPx = str52;
        this.bestTpTriggerPx = str53;
        this.posRelationAlgoOrdCount = str54;
        this.bePx = str55;
        this.nonSettleAvgPx = str56;
        this.settledPnl = str57;
        this.hedgedPos = str58;
        this.deltaBS = str59;
        this.deltaPA = str60;
        this.thetaBS = str61;
        this.thetaPA = str62;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x030a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r129v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r129v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r129v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r129v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r129v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r129v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r129v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r129v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r129v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r129v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r129v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r129v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r129v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r129v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r129v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r129v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r129v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r129v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r129v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r129v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r129v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r129v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r129v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r129v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r129v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r129v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r129v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r129v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r129v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo:?: TERNARY null = ((wrap:int:0x0121: ARITH (r129v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo) : (r94v0 com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012e: ARITH (r129v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0139: ARITH (r129v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0142: ARITH (r130v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014b: ARITH (r130v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0154: ARITH (r130v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x015d: ARITH (r130v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r100v0 java.util.List) : (null java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r130v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r130v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r130v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r130v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r104v0 java.lang.String))
  (wrap:java.lang.String:0x0195: TERNARY null = ((wrap:int:0x018c: ARITH (r130v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0197: ARITH (r130v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r130v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r107v0 java.lang.String))
  (wrap:java.lang.String:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r130v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.lang.String:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r130v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:0x01cc: TERNARY null = ((wrap:int:0x01c3: ARITH (r130v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ce: ARITH (r130v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r111v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d7: ARITH (r130v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e0: ARITH (r130v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e9: ARITH (r130v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f2: ARITH (r130v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01fb: ARITH (r130v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0206: ARITH (r130v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0211: ARITH (r130v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x021c: ARITH (r130v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0227: ARITH (r130v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0232: ARITH (r130v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023d: ARITH (r130v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0248: ARITH (r130v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0253: ARITH (r130v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025e: ARITH (r130v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0269: ARITH (r130v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0274: ARITH (r130v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x027f: ARITH (r130v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r128v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.TpslAllInfo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.subscribe.TradePositionData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradePositionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, TradeUserPositionInfo tradeUserPositionInfo, String str30, String str31, String str32, String str33, String str34, List list, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? null : tradeUserPositionInfo, (i & 1073741824) != 0 ? "" : str30, (i & Integer.MIN_VALUE) != 0 ? null : str31, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) == 0 ? list : null, (i2 & 16) != 0 ? "" : str35, (i2 & 32) != 0 ? "" : str36, (i2 & 64) != 0 ? "" : str37, (i2 & 128) != 0 ? "" : str38, (i2 & 256) != 0 ? "" : str39, (i2 & 512) != 0 ? "" : str40, (i2 & 1024) != 0 ? "" : str41, (i2 & 2048) != 0 ? "" : str42, (i2 & 4096) != 0 ? "" : str43, (i2 & 8192) != 0 ? "" : str44, (i2 & 16384) != 0 ? "" : str45, (i2 & 32768) != 0 ? "" : str46, (i2 & 65536) != 0 ? "" : str47, (i2 & 131072) != 0 ? "" : str48, (i2 & 262144) != 0 ? "" : str49, (i2 & 524288) != 0 ? "" : str50, (i2 & 1048576) != 0 ? "" : str51, (i2 & 2097152) != 0 ? "" : str52, (i2 & 4194304) != 0 ? "" : str53, (i2 & 8388608) != 0 ? "" : str54, (i2 & 16777216) != 0 ? "" : str55, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str56, (i2 & 67108864) != 0 ? "" : str57, (i2 & 134217728) != 0 ? "" : str58, (i2 & 268435456) != 0 ? "" : str59, (i2 & 536870912) != 0 ? "" : str60, (i2 & 1073741824) != 0 ? "" : str61, (i2 & Integer.MIN_VALUE) != 0 ? "" : str62);
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends TradePositionData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradePositionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradePositionData> serializer() {
            return TradePositionData$$serializer.INSTANCE;
        }

        public final List<TradePositionData> AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new TaskDescription().getType();
            Intrinsics.copydefault(type);
            return (List) xvj.OLrzqt(str, type, false);
        }
    }

    public String toString() {
        return "TradePositionData(posId=" + this.posId + ", instId=" + this.instId + ", instType=" + this.instType + ", pos=" + this.pos + ", posSide=" + this.posSide + ", lever=" + this.lever + ", availPos=" + this.availPos + ", avgPx=" + this.avgPx + "liqPx=" + this.liqPx + ", margin=" + this.margin + ", mgnMode=" + this.mgnMode + ", tradeId=" + this.tradeId + ", markPx=" + this.markPx + ", notionalUsd=" + this.notionalUsd + ")";
    }
}
