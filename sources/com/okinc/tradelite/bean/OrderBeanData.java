package com.okinc.tradelite.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
public final class OrderBeanData implements Parcelable {
    private final String accFillSz;
    private final String activePx;
    private final String actualPx;
    private final String actualSide;
    private final String actualSz;
    private final String algoClOrdId;
    private final String algoId;
    private final String avgCost;
    private final String avgPx;
    private final String bankruptcyPx;
    private final String bizRefType;
    private final String cTime;
    private final String callbackRatio;
    private final String callbackSpread;
    private final String cancelSource;
    private final String cancelSourceReason;
    private final String cancelType;
    private final String category;
    private final String ccy;
    private final String clOrdId;
    private final String clientOid;
    private final String closeFraction;
    private final String ctVal;
    private final String errCode;
    private final String errMsg;
    private final String fee;
    private final String feeCcy;
    private final String feeRate;
    private final String fillNotionalUsd;
    private final String fillPx;
    private final String fillSz;
    private final String fillTime;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String last;
    private final String lever;
    private final String moveTriggerPx;
    private final String multiplier;
    private final String notionalUsd;
    private final String ordId;
    private final List<String> ordIdList;
    private final String ordPx;
    private final String ordType;
    private final String pTime;
    private final String pnl;
    private final String pnlCcy;
    private final String pnlRatio;
    private final String posSide;
    private final double preFilledLimitPrice;
    private String px;
    private final String quickMgnType;
    private final String rebate;
    private final String rebateCcy;
    private final String reduceOnly;
    private final String side;
    private final String sideMsg;
    private final String slOrdPx;
    private final String slTriggerPx;
    private final String slTriggerPxType;
    private final String source;
    private final String sourceAlgoId;
    private final String sourceIntValue;
    private final String state;
    private final String stpId;
    private final String stpMode;
    private String sz;
    private final String tag;
    private final String tdMode;
    private final String tgtCcy;
    private final String tpOrdPx;
    private final String tpTriggerPx;
    private final String tpTriggerPxType;
    private final String tradeId;
    private String tradeQuoteCcy;
    private final String triggerPx;
    private final String triggerPxType;
    private final String triggerTime;
    private final String uTime;
    private final String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderBeanData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<OrderBeanData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderBeanData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderBeanData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderBeanData[] newArray(int i) {
            return new OrderBeanData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderBeanData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, -1, -1, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bankruptcyPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.cancelSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cancelSourceReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.clientOid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.fillNotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.actualPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.actualSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component42() {
        return this.ordIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.sideMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.sourceIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.stpId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.stpMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component79() {
        return this.preFilledLimitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderBeanData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull List<String> list, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, double d, String str78) {
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
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        return new OrderBeanData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, list, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, d, str78);
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
        if (!(obj instanceof OrderBeanData)) {
            return false;
        }
        OrderBeanData orderBeanData = (OrderBeanData) obj;
        return Intrinsics.EZpvd((Object) this.accFillSz, (Object) orderBeanData.accFillSz) && Intrinsics.EZpvd((Object) this.activePx, (Object) orderBeanData.activePx) && Intrinsics.EZpvd((Object) this.actualPx, (Object) orderBeanData.actualPx) && Intrinsics.EZpvd((Object) this.actualSide, (Object) orderBeanData.actualSide) && Intrinsics.EZpvd((Object) this.actualSz, (Object) orderBeanData.actualSz) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) orderBeanData.algoClOrdId) && Intrinsics.EZpvd((Object) this.algoId, (Object) orderBeanData.algoId) && Intrinsics.EZpvd((Object) this.avgCost, (Object) orderBeanData.avgCost) && Intrinsics.EZpvd((Object) this.avgPx, (Object) orderBeanData.avgPx) && Intrinsics.EZpvd((Object) this.bankruptcyPx, (Object) orderBeanData.bankruptcyPx) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) orderBeanData.bizRefType) && Intrinsics.EZpvd((Object) this.cTime, (Object) orderBeanData.cTime) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) orderBeanData.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) orderBeanData.callbackSpread) && Intrinsics.EZpvd((Object) this.cancelSource, (Object) orderBeanData.cancelSource) && Intrinsics.EZpvd((Object) this.cancelSourceReason, (Object) orderBeanData.cancelSourceReason) && Intrinsics.EZpvd((Object) this.cancelType, (Object) orderBeanData.cancelType) && Intrinsics.EZpvd((Object) this.category, (Object) orderBeanData.category) && Intrinsics.EZpvd((Object) this.ccy, (Object) orderBeanData.ccy) && Intrinsics.EZpvd((Object) this.clOrdId, (Object) orderBeanData.clOrdId) && Intrinsics.EZpvd((Object) this.clientOid, (Object) orderBeanData.clientOid) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) orderBeanData.closeFraction) && Intrinsics.EZpvd((Object) this.ctVal, (Object) orderBeanData.ctVal) && Intrinsics.EZpvd((Object) this.errCode, (Object) orderBeanData.errCode) && Intrinsics.EZpvd((Object) this.errMsg, (Object) orderBeanData.errMsg) && Intrinsics.EZpvd((Object) this.fee, (Object) orderBeanData.fee) && Intrinsics.EZpvd((Object) this.feeRate, (Object) orderBeanData.feeRate) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) orderBeanData.feeCcy) && Intrinsics.EZpvd((Object) this.fillNotionalUsd, (Object) orderBeanData.fillNotionalUsd) && Intrinsics.EZpvd((Object) this.fillPx, (Object) orderBeanData.fillPx) && Intrinsics.EZpvd((Object) this.fillSz, (Object) orderBeanData.fillSz) && Intrinsics.EZpvd((Object) this.fillTime, (Object) orderBeanData.fillTime) && Intrinsics.EZpvd((Object) this.instFamily, (Object) orderBeanData.instFamily) && Intrinsics.EZpvd((Object) this.instId, (Object) orderBeanData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) orderBeanData.instType) && Intrinsics.EZpvd((Object) this.last, (Object) orderBeanData.last) && Intrinsics.EZpvd((Object) this.lever, (Object) orderBeanData.lever) && Intrinsics.EZpvd((Object) this.moveTriggerPx, (Object) orderBeanData.moveTriggerPx) && Intrinsics.EZpvd((Object) this.multiplier, (Object) orderBeanData.multiplier) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) orderBeanData.notionalUsd) && Intrinsics.EZpvd((Object) this.ordId, (Object) orderBeanData.ordId) && Intrinsics.EZpvd(this.ordIdList, orderBeanData.ordIdList) && Intrinsics.EZpvd((Object) this.ordPx, (Object) orderBeanData.ordPx) && Intrinsics.EZpvd((Object) this.ordType, (Object) orderBeanData.ordType) && Intrinsics.EZpvd((Object) this.pTime, (Object) orderBeanData.pTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) orderBeanData.pnl) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) orderBeanData.pnlCcy) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) orderBeanData.pnlRatio) && Intrinsics.EZpvd((Object) this.posSide, (Object) orderBeanData.posSide) && Intrinsics.EZpvd((Object) this.px, (Object) orderBeanData.px) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) orderBeanData.quickMgnType) && Intrinsics.EZpvd((Object) this.rebate, (Object) orderBeanData.rebate) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) orderBeanData.rebateCcy) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) orderBeanData.reduceOnly) && Intrinsics.EZpvd((Object) this.side, (Object) orderBeanData.side) && Intrinsics.EZpvd((Object) this.sideMsg, (Object) orderBeanData.sideMsg) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) orderBeanData.slOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) orderBeanData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) orderBeanData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.source, (Object) orderBeanData.source) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) orderBeanData.sourceAlgoId) && Intrinsics.EZpvd((Object) this.sourceIntValue, (Object) orderBeanData.sourceIntValue) && Intrinsics.EZpvd((Object) this.state, (Object) orderBeanData.state) && Intrinsics.EZpvd((Object) this.stpId, (Object) orderBeanData.stpId) && Intrinsics.EZpvd((Object) this.stpMode, (Object) orderBeanData.stpMode) && Intrinsics.EZpvd((Object) this.sz, (Object) orderBeanData.sz) && Intrinsics.EZpvd((Object) this.tag, (Object) orderBeanData.tag) && Intrinsics.EZpvd((Object) this.tdMode, (Object) orderBeanData.tdMode) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) orderBeanData.tgtCcy) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) orderBeanData.tpOrdPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) orderBeanData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) orderBeanData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.tradeId, (Object) orderBeanData.tradeId) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) orderBeanData.triggerPx) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) orderBeanData.triggerPxType) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) orderBeanData.triggerTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) orderBeanData.uTime) && Intrinsics.EZpvd((Object) this.uly, (Object) orderBeanData.uly) && Double.compare(this.preFilledLimitPrice, orderBeanData.preFilledLimitPrice) == 0 && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) orderBeanData.tradeQuoteCcy);
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
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
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
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
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
    public final String getClOrdId() {
        return this.clOrdId;
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
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrCode() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrMsg() {
        return this.errMsg;
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
    public final String getLever() {
        return this.lever;
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
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOrdIdList() {
        return this.ordIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdPx() {
        return this.ordPx;
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
    public final double getPreFilledLimitPrice() {
        return this.preFilledLimitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
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
    public final String getStpId() {
        return this.stpId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStpMode() {
        return this.stpMode;
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
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accFillSz.hashCode();
        int iHashCode2 = this.activePx.hashCode();
        int iHashCode3 = this.actualPx.hashCode();
        int iHashCode4 = this.actualSide.hashCode();
        int iHashCode5 = this.actualSz.hashCode();
        int iHashCode6 = this.algoClOrdId.hashCode();
        int iHashCode7 = this.algoId.hashCode();
        int iHashCode8 = this.avgCost.hashCode();
        int iHashCode9 = this.avgPx.hashCode();
        int iHashCode10 = this.bankruptcyPx.hashCode();
        int iHashCode11 = this.bizRefType.hashCode();
        int iHashCode12 = this.cTime.hashCode();
        int iHashCode13 = this.callbackRatio.hashCode();
        int iHashCode14 = this.callbackSpread.hashCode();
        int iHashCode15 = this.cancelSource.hashCode();
        int iHashCode16 = this.cancelSourceReason.hashCode();
        int iHashCode17 = this.cancelType.hashCode();
        int iHashCode18 = this.category.hashCode();
        int iHashCode19 = this.ccy.hashCode();
        int iHashCode20 = this.clOrdId.hashCode();
        int iHashCode21 = this.clientOid.hashCode();
        int iHashCode22 = this.closeFraction.hashCode();
        int iHashCode23 = this.ctVal.hashCode();
        int iHashCode24 = this.errCode.hashCode();
        int iHashCode25 = this.errMsg.hashCode();
        int iHashCode26 = this.fee.hashCode();
        int iHashCode27 = this.feeRate.hashCode();
        int iHashCode28 = this.feeCcy.hashCode();
        int iHashCode29 = this.fillNotionalUsd.hashCode();
        int iHashCode30 = this.fillPx.hashCode();
        int iHashCode31 = this.fillSz.hashCode();
        int iHashCode32 = this.fillTime.hashCode();
        int iHashCode33 = this.instFamily.hashCode();
        int iHashCode34 = this.instId.hashCode();
        int iHashCode35 = this.instType.hashCode();
        int iHashCode36 = this.last.hashCode();
        int iHashCode37 = this.lever.hashCode();
        int iHashCode38 = this.moveTriggerPx.hashCode();
        int iHashCode39 = this.multiplier.hashCode();
        int iHashCode40 = this.notionalUsd.hashCode();
        int iHashCode41 = this.ordId.hashCode();
        int iHashCode42 = this.ordIdList.hashCode();
        int iHashCode43 = this.ordPx.hashCode();
        int iHashCode44 = this.ordType.hashCode();
        int iHashCode45 = this.pTime.hashCode();
        int iHashCode46 = this.pnl.hashCode();
        int iHashCode47 = this.pnlCcy.hashCode();
        int iHashCode48 = this.pnlRatio.hashCode();
        int iHashCode49 = this.posSide.hashCode();
        int iHashCode50 = this.px.hashCode();
        int iHashCode51 = this.quickMgnType.hashCode();
        int iHashCode52 = this.rebate.hashCode();
        int iHashCode53 = this.rebateCcy.hashCode();
        int iHashCode54 = this.reduceOnly.hashCode();
        int iHashCode55 = this.side.hashCode();
        int iHashCode56 = this.sideMsg.hashCode();
        int iHashCode57 = this.slOrdPx.hashCode();
        int iHashCode58 = this.slTriggerPx.hashCode();
        int iHashCode59 = this.slTriggerPxType.hashCode();
        int iHashCode60 = this.source.hashCode();
        int iHashCode61 = this.sourceAlgoId.hashCode();
        int iHashCode62 = this.sourceIntValue.hashCode();
        int iHashCode63 = this.state.hashCode();
        int iHashCode64 = this.stpId.hashCode();
        int iHashCode65 = this.stpMode.hashCode();
        int iHashCode66 = this.sz.hashCode();
        int iHashCode67 = this.tag.hashCode();
        int iHashCode68 = this.tdMode.hashCode();
        int iHashCode69 = this.tgtCcy.hashCode();
        int iHashCode70 = this.tpOrdPx.hashCode();
        int iHashCode71 = this.tpTriggerPx.hashCode();
        int iHashCode72 = this.tpTriggerPxType.hashCode();
        int iHashCode73 = this.tradeId.hashCode();
        int iHashCode74 = this.triggerPx.hashCode();
        int iHashCode75 = this.triggerPxType.hashCode();
        int iHashCode76 = this.triggerTime.hashCode();
        int iHashCode77 = this.uTime.hashCode();
        int iHashCode78 = this.uly.hashCode();
        int iHashCode79 = Double.hashCode(this.preFilledLimitPrice);
        String str = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderBeanData(accFillSz=" + this.accFillSz + ", activePx=" + this.activePx + ", actualPx=" + this.actualPx + ", actualSide=" + this.actualSide + ", actualSz=" + this.actualSz + ", algoClOrdId=" + this.algoClOrdId + ", algoId=" + this.algoId + ", avgCost=" + this.avgCost + ", avgPx=" + this.avgPx + ", bankruptcyPx=" + this.bankruptcyPx + ", bizRefType=" + this.bizRefType + ", cTime=" + this.cTime + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", cancelSource=" + this.cancelSource + ", cancelSourceReason=" + this.cancelSourceReason + ", cancelType=" + this.cancelType + ", category=" + this.category + ", ccy=" + this.ccy + ", clOrdId=" + this.clOrdId + ", clientOid=" + this.clientOid + ", closeFraction=" + this.closeFraction + ", ctVal=" + this.ctVal + ", errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", fee=" + this.fee + ", feeRate=" + this.feeRate + ", feeCcy=" + this.feeCcy + ", fillNotionalUsd=" + this.fillNotionalUsd + ", fillPx=" + this.fillPx + ", fillSz=" + this.fillSz + ", fillTime=" + this.fillTime + ", instFamily=" + this.instFamily + ", instId=" + this.instId + ", instType=" + this.instType + ", last=" + this.last + ", lever=" + this.lever + ", moveTriggerPx=" + this.moveTriggerPx + ", multiplier=" + this.multiplier + ", notionalUsd=" + this.notionalUsd + ", ordId=" + this.ordId + ", ordIdList=" + this.ordIdList + ", ordPx=" + this.ordPx + ", ordType=" + this.ordType + ", pTime=" + this.pTime + ", pnl=" + this.pnl + ", pnlCcy=" + this.pnlCcy + ", pnlRatio=" + this.pnlRatio + ", posSide=" + this.posSide + ", px=" + this.px + ", quickMgnType=" + this.quickMgnType + ", rebate=" + this.rebate + ", rebateCcy=" + this.rebateCcy + ", reduceOnly=" + this.reduceOnly + ", side=" + this.side + ", sideMsg=" + this.sideMsg + ", slOrdPx=" + this.slOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slTriggerPxType=" + this.slTriggerPxType + ", source=" + this.source + ", sourceAlgoId=" + this.sourceAlgoId + ", sourceIntValue=" + this.sourceIntValue + ", state=" + this.state + ", stpId=" + this.stpId + ", stpMode=" + this.stpMode + ", sz=" + this.sz + ", tag=" + this.tag + ", tdMode=" + this.tdMode + ", tgtCcy=" + this.tgtCcy + ", tpOrdPx=" + this.tpOrdPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", tradeId=" + this.tradeId + ", triggerPx=" + this.triggerPx + ", triggerPxType=" + this.triggerPxType + ", triggerTime=" + this.triggerTime + ", uTime=" + this.uTime + ", uly=" + this.uly + ", preFilledLimitPrice=" + this.preFilledLimitPrice + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accFillSz);
        parcel.writeString(this.activePx);
        parcel.writeString(this.actualPx);
        parcel.writeString(this.actualSide);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.algoClOrdId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.bankruptcyPx);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.callbackRatio);
        parcel.writeString(this.callbackSpread);
        parcel.writeString(this.cancelSource);
        parcel.writeString(this.cancelSourceReason);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.category);
        parcel.writeString(this.ccy);
        parcel.writeString(this.clOrdId);
        parcel.writeString(this.clientOid);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.errCode);
        parcel.writeString(this.errMsg);
        parcel.writeString(this.fee);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.fillNotionalUsd);
        parcel.writeString(this.fillPx);
        parcel.writeString(this.fillSz);
        parcel.writeString(this.fillTime);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.last);
        parcel.writeString(this.lever);
        parcel.writeString(this.moveTriggerPx);
        parcel.writeString(this.multiplier);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.ordId);
        parcel.writeStringList(this.ordIdList);
        parcel.writeString(this.ordPx);
        parcel.writeString(this.ordType);
        parcel.writeString(this.pTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.posSide);
        parcel.writeString(this.px);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.rebate);
        parcel.writeString(this.rebateCcy);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.side);
        parcel.writeString(this.sideMsg);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.source);
        parcel.writeString(this.sourceAlgoId);
        parcel.writeString(this.sourceIntValue);
        parcel.writeString(this.state);
        parcel.writeString(this.stpId);
        parcel.writeString(this.stpMode);
        parcel.writeString(this.sz);
        parcel.writeString(this.tag);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.uly);
        parcel.writeDouble(this.preFilledLimitPrice);
        parcel.writeString(this.tradeQuoteCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.bean.OrderBeanData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderBeanData> serializer() {
            return OrderBeanData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderBeanData(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, List list, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, double d, String str78, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accFillSz = "";
        } else {
            this.accFillSz = str;
        }
        if ((i & 2) == 0) {
            this.activePx = "";
        } else {
            this.activePx = str2;
        }
        if ((i & 4) == 0) {
            this.actualPx = "";
        } else {
            this.actualPx = str3;
        }
        if ((i & 8) == 0) {
            this.actualSide = "";
        } else {
            this.actualSide = str4;
        }
        if ((i & 16) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str5;
        }
        if ((i & 32) == 0) {
            this.algoClOrdId = "";
        } else {
            this.algoClOrdId = str6;
        }
        if ((i & 64) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str7;
        }
        if ((i & 128) == 0) {
            this.avgCost = "";
        } else {
            this.avgCost = str8;
        }
        if ((i & 256) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str9;
        }
        if ((i & 512) == 0) {
            this.bankruptcyPx = "";
        } else {
            this.bankruptcyPx = str10;
        }
        if ((i & 1024) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str11;
        }
        if ((i & 2048) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str12;
        }
        if ((i & 4096) == 0) {
            this.callbackRatio = "";
        } else {
            this.callbackRatio = str13;
        }
        if ((i & 8192) == 0) {
            this.callbackSpread = "";
        } else {
            this.callbackSpread = str14;
        }
        if ((i & 16384) == 0) {
            this.cancelSource = "";
        } else {
            this.cancelSource = str15;
        }
        if ((i & 32768) == 0) {
            this.cancelSourceReason = "";
        } else {
            this.cancelSourceReason = str16;
        }
        if ((i & 65536) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str17;
        }
        if ((i & 131072) == 0) {
            this.category = "";
        } else {
            this.category = str18;
        }
        if ((i & 262144) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str19;
        }
        if ((i & 524288) == 0) {
            this.clOrdId = "";
        } else {
            this.clOrdId = str20;
        }
        if ((i & 1048576) == 0) {
            this.clientOid = "";
        } else {
            this.clientOid = str21;
        }
        if ((2097152 & i) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str22;
        }
        if ((4194304 & i) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str23;
        }
        if ((8388608 & i) == 0) {
            this.errCode = "";
        } else {
            this.errCode = str24;
        }
        if ((16777216 & i) == 0) {
            this.errMsg = "";
        } else {
            this.errMsg = str25;
        }
        if ((33554432 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str26;
        }
        if ((67108864 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str27;
        }
        if ((134217728 & i) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str28;
        }
        if ((268435456 & i) == 0) {
            this.fillNotionalUsd = "";
        } else {
            this.fillNotionalUsd = str29;
        }
        if ((536870912 & i) == 0) {
            this.fillPx = "";
        } else {
            this.fillPx = str30;
        }
        if ((1073741824 & i) == 0) {
            this.fillSz = "";
        } else {
            this.fillSz = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.fillTime = "";
        } else {
            this.fillTime = str32;
        }
        if ((i2 & 1) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str33;
        }
        if ((i2 & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str34;
        }
        if ((i2 & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str35;
        }
        if ((i2 & 8) == 0) {
            this.last = "";
        } else {
            this.last = str36;
        }
        if ((i2 & 16) == 0) {
            this.lever = "";
        } else {
            this.lever = str37;
        }
        if ((i2 & 32) == 0) {
            this.moveTriggerPx = "";
        } else {
            this.moveTriggerPx = str38;
        }
        if ((i2 & 64) == 0) {
            this.multiplier = "";
        } else {
            this.multiplier = str39;
        }
        if ((i2 & 128) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str40;
        }
        if ((i2 & 256) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str41;
        }
        this.ordIdList = (i2 & 512) == 0 ? yDY.AhwBna() : list;
        if ((i2 & 1024) == 0) {
            this.ordPx = "";
        } else {
            this.ordPx = str42;
        }
        if ((i2 & 2048) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str43;
        }
        if ((i2 & 4096) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str44;
        }
        if ((i2 & 8192) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str45;
        }
        if ((i2 & 16384) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str46;
        }
        if ((i2 & 32768) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str47;
        }
        if ((i2 & 65536) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str48;
        }
        if ((i2 & 131072) == 0) {
            this.px = "";
        } else {
            this.px = str49;
        }
        if ((i2 & 262144) == 0) {
            this.quickMgnType = "";
        } else {
            this.quickMgnType = str50;
        }
        if ((i2 & 524288) == 0) {
            this.rebate = "";
        } else {
            this.rebate = str51;
        }
        if ((i2 & 1048576) == 0) {
            this.rebateCcy = "";
        } else {
            this.rebateCcy = str52;
        }
        if ((2097152 & i2) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str53;
        }
        if ((4194304 & i2) == 0) {
            this.side = "";
        } else {
            this.side = str54;
        }
        if ((8388608 & i2) == 0) {
            this.sideMsg = "";
        } else {
            this.sideMsg = str55;
        }
        if ((16777216 & i2) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str56;
        }
        if ((33554432 & i2) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str57;
        }
        if ((67108864 & i2) == 0) {
            this.slTriggerPxType = "";
        } else {
            this.slTriggerPxType = str58;
        }
        if ((134217728 & i2) == 0) {
            this.source = "";
        } else {
            this.source = str59;
        }
        if ((268435456 & i2) == 0) {
            this.sourceAlgoId = "";
        } else {
            this.sourceAlgoId = str60;
        }
        if ((536870912 & i2) == 0) {
            this.sourceIntValue = "";
        } else {
            this.sourceIntValue = str61;
        }
        if ((1073741824 & i2) == 0) {
            this.state = "";
        } else {
            this.state = str62;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.stpId = "";
        } else {
            this.stpId = str63;
        }
        if ((i3 & 1) == 0) {
            this.stpMode = "";
        } else {
            this.stpMode = str64;
        }
        if ((i3 & 2) == 0) {
            this.sz = "";
        } else {
            this.sz = str65;
        }
        if ((i3 & 4) == 0) {
            this.tag = "";
        } else {
            this.tag = str66;
        }
        if ((i3 & 8) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str67;
        }
        if ((i3 & 16) == 0) {
            this.tgtCcy = "";
        } else {
            this.tgtCcy = str68;
        }
        if ((i3 & 32) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str69;
        }
        if ((i3 & 64) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str70;
        }
        if ((i3 & 128) == 0) {
            this.tpTriggerPxType = "";
        } else {
            this.tpTriggerPxType = str71;
        }
        if ((i3 & 256) == 0) {
            this.tradeId = "";
        } else {
            this.tradeId = str72;
        }
        if ((i3 & 512) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str73;
        }
        if ((i3 & 1024) == 0) {
            this.triggerPxType = "";
        } else {
            this.triggerPxType = str74;
        }
        if ((i3 & 2048) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str75;
        }
        if ((i3 & 4096) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str76;
        }
        if ((i3 & 8192) == 0) {
            this.uly = "";
        } else {
            this.uly = str77;
        }
        this.preFilledLimitPrice = (i3 & 16384) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i3 & 32768) == 0) {
            this.tradeQuoteCcy = "";
        } else {
            this.tradeQuoteCcy = str78;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeLite_tradelite_api(OrderBeanData orderBeanData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderBeanData.accFillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderBeanData.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderBeanData.activePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderBeanData.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderBeanData.actualPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderBeanData.actualPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderBeanData.actualSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderBeanData.actualSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderBeanData.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderBeanData.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderBeanData.algoClOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderBeanData.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderBeanData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderBeanData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderBeanData.avgCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderBeanData.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderBeanData.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderBeanData.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderBeanData.bankruptcyPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderBeanData.bankruptcyPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderBeanData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderBeanData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderBeanData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderBeanData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderBeanData.callbackRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderBeanData.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderBeanData.callbackSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderBeanData.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderBeanData.cancelSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderBeanData.cancelSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderBeanData.cancelSourceReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderBeanData.cancelSourceReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderBeanData.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderBeanData.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderBeanData.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderBeanData.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderBeanData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderBeanData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderBeanData.clOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderBeanData.clOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderBeanData.clientOid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderBeanData.clientOid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderBeanData.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderBeanData.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderBeanData.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderBeanData.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderBeanData.errCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderBeanData.errCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderBeanData.errMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderBeanData.errMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderBeanData.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderBeanData.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderBeanData.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderBeanData.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) orderBeanData.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, orderBeanData.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) orderBeanData.fillNotionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, orderBeanData.fillNotionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) orderBeanData.fillPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, orderBeanData.fillPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) orderBeanData.fillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, orderBeanData.fillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) orderBeanData.fillTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, orderBeanData.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) orderBeanData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, orderBeanData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) orderBeanData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, orderBeanData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) orderBeanData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, orderBeanData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) orderBeanData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, orderBeanData.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) orderBeanData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, orderBeanData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) orderBeanData.moveTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, orderBeanData.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) orderBeanData.multiplier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, orderBeanData.multiplier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) orderBeanData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, orderBeanData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) orderBeanData.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, orderBeanData.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd(orderBeanData.ordIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 41, kSerializerArr[41], orderBeanData.ordIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) orderBeanData.ordPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, orderBeanData.ordPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) orderBeanData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, orderBeanData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) orderBeanData.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, orderBeanData.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) orderBeanData.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, orderBeanData.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) orderBeanData.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, orderBeanData.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) orderBeanData.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, orderBeanData.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) orderBeanData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, orderBeanData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) orderBeanData.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, orderBeanData.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) orderBeanData.quickMgnType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, orderBeanData.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) orderBeanData.rebate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, orderBeanData.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) orderBeanData.rebateCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, orderBeanData.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) orderBeanData.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, orderBeanData.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) orderBeanData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, orderBeanData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) orderBeanData.sideMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, orderBeanData.sideMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) orderBeanData.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, orderBeanData.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) orderBeanData.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, orderBeanData.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) orderBeanData.slTriggerPxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, orderBeanData.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) orderBeanData.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, orderBeanData.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) orderBeanData.sourceAlgoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, orderBeanData.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) orderBeanData.sourceIntValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, orderBeanData.sourceIntValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) orderBeanData.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, orderBeanData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) orderBeanData.stpId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, orderBeanData.stpId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) orderBeanData.stpMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, orderBeanData.stpMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) orderBeanData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, orderBeanData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) orderBeanData.tag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, orderBeanData.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) orderBeanData.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, orderBeanData.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) orderBeanData.tgtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, orderBeanData.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) orderBeanData.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, orderBeanData.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) orderBeanData.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, orderBeanData.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd((Object) orderBeanData.tpTriggerPxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 71, orderBeanData.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || !Intrinsics.EZpvd((Object) orderBeanData.tradeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 72, orderBeanData.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) orderBeanData.triggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 73, orderBeanData.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) orderBeanData.triggerPxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, orderBeanData.triggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) orderBeanData.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, orderBeanData.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) orderBeanData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, orderBeanData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd((Object) orderBeanData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 77, orderBeanData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || Double.compare(orderBeanData.preFilledLimitPrice, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 78, orderBeanData.preFilledLimitPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) && Intrinsics.EZpvd((Object) orderBeanData.tradeQuoteCcy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, StringSerializer.INSTANCE, orderBeanData.tradeQuoteCcy);
    }

    public OrderBeanData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull List<String> list, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, @NotNull String str76, @NotNull String str77, double d, String str78) {
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
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        this.accFillSz = str;
        this.activePx = str2;
        this.actualPx = str3;
        this.actualSide = str4;
        this.actualSz = str5;
        this.algoClOrdId = str6;
        this.algoId = str7;
        this.avgCost = str8;
        this.avgPx = str9;
        this.bankruptcyPx = str10;
        this.bizRefType = str11;
        this.cTime = str12;
        this.callbackRatio = str13;
        this.callbackSpread = str14;
        this.cancelSource = str15;
        this.cancelSourceReason = str16;
        this.cancelType = str17;
        this.category = str18;
        this.ccy = str19;
        this.clOrdId = str20;
        this.clientOid = str21;
        this.closeFraction = str22;
        this.ctVal = str23;
        this.errCode = str24;
        this.errMsg = str25;
        this.fee = str26;
        this.feeRate = str27;
        this.feeCcy = str28;
        this.fillNotionalUsd = str29;
        this.fillPx = str30;
        this.fillSz = str31;
        this.fillTime = str32;
        this.instFamily = str33;
        this.instId = str34;
        this.instType = str35;
        this.last = str36;
        this.lever = str37;
        this.moveTriggerPx = str38;
        this.multiplier = str39;
        this.notionalUsd = str40;
        this.ordId = str41;
        this.ordIdList = list;
        this.ordPx = str42;
        this.ordType = str43;
        this.pTime = str44;
        this.pnl = str45;
        this.pnlCcy = str46;
        this.pnlRatio = str47;
        this.posSide = str48;
        this.px = str49;
        this.quickMgnType = str50;
        this.rebate = str51;
        this.rebateCcy = str52;
        this.reduceOnly = str53;
        this.side = str54;
        this.sideMsg = str55;
        this.slOrdPx = str56;
        this.slTriggerPx = str57;
        this.slTriggerPxType = str58;
        this.source = str59;
        this.sourceAlgoId = str60;
        this.sourceIntValue = str61;
        this.state = str62;
        this.stpId = str63;
        this.stpMode = str64;
        this.sz = str65;
        this.tag = str66;
        this.tdMode = str67;
        this.tgtCcy = str68;
        this.tpOrdPx = str69;
        this.tpTriggerPx = str70;
        this.tpTriggerPxType = str71;
        this.tradeId = str72;
        this.triggerPx = str73;
        this.triggerPxType = str74;
        this.triggerTime = str75;
        this.uTime = str76;
        this.uly = str77;
        this.preFilledLimitPrice = d;
        this.tradeQuoteCcy = str78;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderBeanData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, List list, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, double d, String str78, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str79 = (i & 1) != 0 ? "" : str;
        String str80 = (i & 2) != 0 ? "" : str2;
        String str81 = (i & 4) != 0 ? "" : str3;
        String str82 = (i & 8) != 0 ? "" : str4;
        String str83 = (i & 16) != 0 ? "" : str5;
        String str84 = (i & 32) != 0 ? "" : str6;
        String str85 = (i & 64) != 0 ? "" : str7;
        String str86 = (i & 128) != 0 ? "" : str8;
        String str87 = (i & 256) != 0 ? "" : str9;
        String str88 = (i & 512) != 0 ? "" : str10;
        String str89 = (i & 1024) != 0 ? "" : str11;
        String str90 = (i & 2048) != 0 ? "" : str12;
        String str91 = (i & 4096) != 0 ? "" : str13;
        String str92 = (i & 8192) != 0 ? "" : str14;
        String str93 = (i & 16384) != 0 ? "" : str15;
        String str94 = (i & 32768) != 0 ? "" : str16;
        String str95 = (i & 65536) != 0 ? "" : str17;
        String str96 = (i & 131072) != 0 ? "" : str18;
        String str97 = (i & 262144) != 0 ? "" : str19;
        String str98 = (i & 524288) != 0 ? "" : str20;
        String str99 = (i & 1048576) != 0 ? "" : str21;
        String str100 = (i & 2097152) != 0 ? "" : str22;
        String str101 = (i & 4194304) != 0 ? "" : str23;
        String str102 = (i & 8388608) != 0 ? "" : str24;
        String str103 = (i & 16777216) != 0 ? "" : str25;
        String str104 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str105 = (i & 67108864) != 0 ? "" : str27;
        String str106 = (i & 134217728) != 0 ? "" : str28;
        String str107 = (i & 268435456) != 0 ? "" : str29;
        String str108 = (i & 536870912) != 0 ? "" : str30;
        String str109 = (i & 1073741824) != 0 ? "" : str31;
        String str110 = (i & Integer.MIN_VALUE) != 0 ? "" : str32;
        this(str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, (i2 & 256) != 0 ? "" : str41, (i2 & 512) != 0 ? yDY.AhwBna() : list, (i2 & 1024) != 0 ? "" : str42, (i2 & 2048) != 0 ? "" : str43, (i2 & 4096) != 0 ? "" : str44, (i2 & 8192) != 0 ? "" : str45, (i2 & 16384) != 0 ? "" : str46, (i2 & 32768) != 0 ? "" : str47, (i2 & 65536) != 0 ? "" : str48, (i2 & 131072) != 0 ? "" : str49, (i2 & 262144) != 0 ? "" : str50, (i2 & 524288) != 0 ? "" : str51, (i2 & 1048576) != 0 ? "" : str52, (i2 & 2097152) != 0 ? "" : str53, (i2 & 4194304) != 0 ? "" : str54, (i2 & 8388608) != 0 ? "" : str55, (i2 & 16777216) != 0 ? "" : str56, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str57, (i2 & 67108864) != 0 ? "" : str58, (i2 & 134217728) != 0 ? "" : str59, (i2 & 268435456) != 0 ? "" : str60, (i2 & 536870912) != 0 ? "" : str61, (i2 & 1073741824) != 0 ? "" : str62, (i2 & Integer.MIN_VALUE) != 0 ? "" : str63, (i3 & 1) != 0 ? "" : str64, (i3 & 2) != 0 ? "" : str65, (i3 & 4) != 0 ? "" : str66, (i3 & 8) != 0 ? "" : str67, (i3 & 16) != 0 ? "" : str68, (i3 & 32) != 0 ? "" : str69, (i3 & 64) != 0 ? "" : str70, (i3 & 128) != 0 ? "" : str71, (i3 & 256) != 0 ? "" : str72, (i3 & 512) != 0 ? "" : str73, (i3 & 1024) != 0 ? "" : str74, (i3 & 2048) != 0 ? "" : str75, (i3 & 4096) != 0 ? "" : str76, (i3 & 8192) != 0 ? "" : str77, (i3 & 16384) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i3 & 32768) != 0 ? "" : str78);
    }
}
