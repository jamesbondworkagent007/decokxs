package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.trade.manager.common.position.TradePositionManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyPositionResponse implements Parcelable {
    public static final int $stable = 0;
    private final String actualLever;
    private final String adl;
    private final String algoId;
    private final String availPos;
    private final String avgPx;
    private final String cTime;
    private final String ccy;
    private final String closeAvgPx;
    private final String closeTotalAmount;
    private final String closeUpl;
    private final String closeUplRatio;
    private final String ctMult;
    private final String ctVal;
    private final String estClosePositionFee;
    private final String imr;
    private final String instId;
    private final String instType;
    private final String interest;
    private final String last;
    private final String lever;
    private final String liab;
    private final String liabCcy;
    private final String liqPx;
    private final String margin;
    private final String markPx;
    private final String mgnCcy;
    private final String mgnMode;
    private final String mgnRatio;
    private final String mmr;
    private final String notionalUsd;
    private final String optVal;
    private final String pos;
    private final String posCcy;
    private final String posId;
    private final String posSide;
    private final String uTime;
    private final String upl;
    private final String uplRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StrategyPositionResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyPositionResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPositionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyPositionResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPositionResponse[] newArray(int i) {
            return new StrategyPositionResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyPositionResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.optVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.mgnCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.closeUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.closeUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.closeTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.estClosePositionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPositionResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38) {
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
        return new StrategyPositionResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38);
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
        if (!(obj instanceof StrategyPositionResponse)) {
            return false;
        }
        StrategyPositionResponse strategyPositionResponse = (StrategyPositionResponse) obj;
        return Intrinsics.EZpvd((Object) this.availPos, (Object) strategyPositionResponse.availPos) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyPositionResponse.avgPx) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyPositionResponse.ccy) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyPositionResponse.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) strategyPositionResponse.uTime) && Intrinsics.EZpvd((Object) this.imr, (Object) strategyPositionResponse.imr) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyPositionResponse.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) strategyPositionResponse.instType) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyPositionResponse.lever) && Intrinsics.EZpvd((Object) this.liab, (Object) strategyPositionResponse.liab) && Intrinsics.EZpvd((Object) this.liabCcy, (Object) strategyPositionResponse.liabCcy) && Intrinsics.EZpvd((Object) this.liqPx, (Object) strategyPositionResponse.liqPx) && Intrinsics.EZpvd((Object) this.margin, (Object) strategyPositionResponse.margin) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) strategyPositionResponse.mgnMode) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) strategyPositionResponse.mgnRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) strategyPositionResponse.mmr) && Intrinsics.EZpvd((Object) this.optVal, (Object) strategyPositionResponse.optVal) && Intrinsics.EZpvd((Object) this.posId, (Object) strategyPositionResponse.posId) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyPositionResponse.posSide) && Intrinsics.EZpvd((Object) this.pos, (Object) strategyPositionResponse.pos) && Intrinsics.EZpvd((Object) this.posCcy, (Object) strategyPositionResponse.posCcy) && Intrinsics.EZpvd((Object) this.upl, (Object) strategyPositionResponse.upl) && Intrinsics.EZpvd((Object) this.uplRatio, (Object) strategyPositionResponse.uplRatio) && Intrinsics.EZpvd((Object) this.last, (Object) strategyPositionResponse.last) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) strategyPositionResponse.notionalUsd) && Intrinsics.EZpvd((Object) this.adl, (Object) strategyPositionResponse.adl) && Intrinsics.EZpvd((Object) this.interest, (Object) strategyPositionResponse.interest) && Intrinsics.EZpvd((Object) this.mgnCcy, (Object) strategyPositionResponse.mgnCcy) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyPositionResponse.algoId) && Intrinsics.EZpvd((Object) this.markPx, (Object) strategyPositionResponse.markPx) && Intrinsics.EZpvd((Object) this.actualLever, (Object) strategyPositionResponse.actualLever) && Intrinsics.EZpvd((Object) this.ctVal, (Object) strategyPositionResponse.ctVal) && Intrinsics.EZpvd((Object) this.ctMult, (Object) strategyPositionResponse.ctMult) && Intrinsics.EZpvd((Object) this.closeAvgPx, (Object) strategyPositionResponse.closeAvgPx) && Intrinsics.EZpvd((Object) this.closeUpl, (Object) strategyPositionResponse.closeUpl) && Intrinsics.EZpvd((Object) this.closeUplRatio, (Object) strategyPositionResponse.closeUplRatio) && Intrinsics.EZpvd((Object) this.closeTotalAmount, (Object) strategyPositionResponse.closeTotalAmount) && Intrinsics.EZpvd((Object) this.estClosePositionFee, (Object) strategyPositionResponse.estClosePositionFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualLever() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdl() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
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
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseAvgPx() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseTotalAmount() {
        return this.closeTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseUpl() {
        return this.closeUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseUplRatio() {
        return this.closeUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtMult() {
        return this.ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstClosePositionFee() {
        return this.estClosePositionFee;
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
    public final String getMgnCcy() {
        return this.mgnCcy;
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
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptVal() {
        return this.optVal;
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
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplRatio() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.availPos.hashCode() * 31) + this.avgPx.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.uTime.hashCode()) * 31) + this.imr.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.liab.hashCode()) * 31) + this.liabCcy.hashCode()) * 31) + this.liqPx.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.mgnRatio.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.optVal.hashCode()) * 31) + this.posId.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.pos.hashCode()) * 31) + this.posCcy.hashCode()) * 31) + this.upl.hashCode()) * 31) + this.uplRatio.hashCode()) * 31) + this.last.hashCode()) * 31) + this.notionalUsd.hashCode()) * 31) + this.adl.hashCode()) * 31) + this.interest.hashCode()) * 31) + this.mgnCcy.hashCode()) * 31) + this.algoId.hashCode()) * 31) + this.markPx.hashCode()) * 31) + this.actualLever.hashCode()) * 31) + this.ctVal.hashCode()) * 31) + this.ctMult.hashCode()) * 31) + this.closeAvgPx.hashCode()) * 31) + this.closeUpl.hashCode()) * 31) + this.closeUplRatio.hashCode()) * 31) + this.closeTotalAmount.hashCode()) * 31) + this.estClosePositionFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyPositionResponse(availPos=" + this.availPos + ", avgPx=" + this.avgPx + ", ccy=" + this.ccy + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", imr=" + this.imr + ", instId=" + this.instId + ", instType=" + this.instType + ", lever=" + this.lever + ", liab=" + this.liab + ", liabCcy=" + this.liabCcy + ", liqPx=" + this.liqPx + ", margin=" + this.margin + ", mgnMode=" + this.mgnMode + ", mgnRatio=" + this.mgnRatio + ", mmr=" + this.mmr + ", optVal=" + this.optVal + ", posId=" + this.posId + ", posSide=" + this.posSide + ", pos=" + this.pos + ", posCcy=" + this.posCcy + ", upl=" + this.upl + ", uplRatio=" + this.uplRatio + ", last=" + this.last + ", notionalUsd=" + this.notionalUsd + ", adl=" + this.adl + ", interest=" + this.interest + ", mgnCcy=" + this.mgnCcy + ", algoId=" + this.algoId + ", markPx=" + this.markPx + ", actualLever=" + this.actualLever + ", ctVal=" + this.ctVal + ", ctMult=" + this.ctMult + ", closeAvgPx=" + this.closeAvgPx + ", closeUpl=" + this.closeUpl + ", closeUplRatio=" + this.closeUplRatio + ", closeTotalAmount=" + this.closeTotalAmount + ", estClosePositionFee=" + this.estClosePositionFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.availPos);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.ccy);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.imr);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.lever);
        parcel.writeString(this.liab);
        parcel.writeString(this.liabCcy);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.margin);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.mmr);
        parcel.writeString(this.optVal);
        parcel.writeString(this.posId);
        parcel.writeString(this.posSide);
        parcel.writeString(this.pos);
        parcel.writeString(this.posCcy);
        parcel.writeString(this.upl);
        parcel.writeString(this.uplRatio);
        parcel.writeString(this.last);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.adl);
        parcel.writeString(this.interest);
        parcel.writeString(this.mgnCcy);
        parcel.writeString(this.algoId);
        parcel.writeString(this.markPx);
        parcel.writeString(this.actualLever);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.ctMult);
        parcel.writeString(this.closeAvgPx);
        parcel.writeString(this.closeUpl);
        parcel.writeString(this.closeUplRatio);
        parcel.writeString(this.closeTotalAmount);
        parcel.writeString(this.estClosePositionFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyPositionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPositionResponse> serializer() {
            return StrategyPositionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyPositionResponse(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availPos = "";
        } else {
            this.availPos = str;
        }
        if ((i & 2) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str2;
        }
        if ((i & 4) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str3;
        }
        if ((i & 8) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str4;
        }
        if ((i & 16) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str5;
        }
        if ((i & 32) == 0) {
            this.imr = "";
        } else {
            this.imr = str6;
        }
        if ((i & 64) == 0) {
            this.instId = "";
        } else {
            this.instId = str7;
        }
        if ((i & 128) == 0) {
            this.instType = "";
        } else {
            this.instType = str8;
        }
        if ((i & 256) == 0) {
            this.lever = "";
        } else {
            this.lever = str9;
        }
        if ((i & 512) == 0) {
            this.liab = "";
        } else {
            this.liab = str10;
        }
        if ((i & 1024) == 0) {
            this.liabCcy = "";
        } else {
            this.liabCcy = str11;
        }
        if ((i & 2048) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str12;
        }
        if ((i & 4096) == 0) {
            this.margin = "";
        } else {
            this.margin = str13;
        }
        if ((i & 8192) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str14;
        }
        if ((i & 16384) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str15;
        }
        if ((32768 & i) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str16;
        }
        if ((65536 & i) == 0) {
            this.optVal = "";
        } else {
            this.optVal = str17;
        }
        if ((131072 & i) == 0) {
            this.posId = "";
        } else {
            this.posId = str18;
        }
        if ((262144 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str19;
        }
        if ((524288 & i) == 0) {
            this.pos = "";
        } else {
            this.pos = str20;
        }
        if ((1048576 & i) == 0) {
            this.posCcy = "";
        } else {
            this.posCcy = str21;
        }
        if ((2097152 & i) == 0) {
            this.upl = "";
        } else {
            this.upl = str22;
        }
        if ((4194304 & i) == 0) {
            this.uplRatio = "";
        } else {
            this.uplRatio = str23;
        }
        if ((8388608 & i) == 0) {
            this.last = "";
        } else {
            this.last = str24;
        }
        if ((16777216 & i) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str25;
        }
        if ((33554432 & i) == 0) {
            this.adl = "";
        } else {
            this.adl = str26;
        }
        if ((67108864 & i) == 0) {
            this.interest = "";
        } else {
            this.interest = str27;
        }
        if ((134217728 & i) == 0) {
            this.mgnCcy = "";
        } else {
            this.mgnCcy = str28;
        }
        if ((268435456 & i) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str29;
        }
        if ((536870912 & i) == 0) {
            this.markPx = "";
        } else {
            this.markPx = str30;
        }
        if ((1073741824 & i) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str32;
        }
        if ((i2 & 1) == 0) {
            this.ctMult = "";
        } else {
            this.ctMult = str33;
        }
        if ((i2 & 2) == 0) {
            this.closeAvgPx = "";
        } else {
            this.closeAvgPx = str34;
        }
        if ((i2 & 4) == 0) {
            this.closeUpl = "";
        } else {
            this.closeUpl = str35;
        }
        if ((i2 & 8) == 0) {
            this.closeUplRatio = "";
        } else {
            this.closeUplRatio = str36;
        }
        if ((i2 & 16) == 0) {
            this.closeTotalAmount = "";
        } else {
            this.closeTotalAmount = str37;
        }
        if ((i2 & 32) == 0) {
            this.estClosePositionFee = "";
        } else {
            this.estClosePositionFee = str38;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyPositionResponse strategyPositionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyPositionResponse.availPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyPositionResponse.availPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyPositionResponse.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyPositionResponse.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyPositionResponse.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyPositionResponse.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyPositionResponse.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyPositionResponse.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyPositionResponse.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyPositionResponse.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyPositionResponse.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyPositionResponse.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyPositionResponse.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyPositionResponse.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyPositionResponse.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyPositionResponse.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyPositionResponse.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyPositionResponse.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyPositionResponse.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyPositionResponse.liab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyPositionResponse.liabCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyPositionResponse.liabCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyPositionResponse.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyPositionResponse.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyPositionResponse.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyPositionResponse.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyPositionResponse.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyPositionResponse.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyPositionResponse.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyPositionResponse.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyPositionResponse.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyPositionResponse.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyPositionResponse.optVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyPositionResponse.optVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyPositionResponse.posId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyPositionResponse.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyPositionResponse.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyPositionResponse.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyPositionResponse.pos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyPositionResponse.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyPositionResponse.posCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyPositionResponse.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyPositionResponse.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyPositionResponse.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyPositionResponse.uplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyPositionResponse.uplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyPositionResponse.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyPositionResponse.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyPositionResponse.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyPositionResponse.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyPositionResponse.adl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyPositionResponse.adl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyPositionResponse.interest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyPositionResponse.interest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyPositionResponse.mgnCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyPositionResponse.mgnCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyPositionResponse.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyPositionResponse.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyPositionResponse.markPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyPositionResponse.markPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyPositionResponse.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyPositionResponse.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyPositionResponse.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyPositionResponse.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyPositionResponse.ctMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyPositionResponse.ctMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyPositionResponse.closeAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyPositionResponse.closeAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyPositionResponse.closeUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyPositionResponse.closeUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyPositionResponse.closeUplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyPositionResponse.closeUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyPositionResponse.closeTotalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyPositionResponse.closeTotalAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) && Intrinsics.EZpvd((Object) strategyPositionResponse.estClosePositionFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyPositionResponse.estClosePositionFee);
    }

    public StrategyPositionResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38) {
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
        this.availPos = str;
        this.avgPx = str2;
        this.ccy = str3;
        this.cTime = str4;
        this.uTime = str5;
        this.imr = str6;
        this.instId = str7;
        this.instType = str8;
        this.lever = str9;
        this.liab = str10;
        this.liabCcy = str11;
        this.liqPx = str12;
        this.margin = str13;
        this.mgnMode = str14;
        this.mgnRatio = str15;
        this.mmr = str16;
        this.optVal = str17;
        this.posId = str18;
        this.posSide = str19;
        this.pos = str20;
        this.posCcy = str21;
        this.upl = str22;
        this.uplRatio = str23;
        this.last = str24;
        this.notionalUsd = str25;
        this.adl = str26;
        this.interest = str27;
        this.mgnCcy = str28;
        this.algoId = str29;
        this.markPx = str30;
        this.actualLever = str31;
        this.ctVal = str32;
        this.ctMult = str33;
        this.closeAvgPx = str34;
        this.closeUpl = str35;
        this.closeUplRatio = str36;
        this.closeTotalAmount = str37;
        this.estClosePositionFee = str38;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01bf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r77v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r77v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r77v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r77v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r77v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r77v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r77v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r77v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r77v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r77v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r77v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r77v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r77v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r77v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r77v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r77v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r77v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r77v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r77v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r77v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r77v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r77v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r77v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0156: ARITH (r78v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015f: ARITH (r78v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0168: ARITH (r78v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.unify_trade.biz.StrategyPositionResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyPositionResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38);
    }

    public final TradePositionManager.PositionItem getPositionItem() {
        TradePositionManager.MarginModeType marginModeType;
        TradePositionManager.PositionItem positionItem = new TradePositionManager.PositionItem();
        positionItem.setAvailPos(this.availPos);
        positionItem.setAvgPx(this.avgPx);
        positionItem.setCcy(this.ccy);
        positionItem.setCTime(this.cTime);
        positionItem.setImr(this.imr);
        positionItem.setInstId(this.instId);
        positionItem.setInstType(this.instType);
        positionItem.setLever(this.lever);
        positionItem.setLiab(this.liab);
        positionItem.setLiabCcy(this.liabCcy);
        positionItem.setLiqPx(this.liqPx);
        positionItem.setMargin(this.margin);
        String str = this.mgnMode;
        if (Intrinsics.EZpvd((Object) str, (Object) "cross")) {
            marginModeType = TradePositionManager.MarginModeType.CROSSED;
        } else {
            marginModeType = Intrinsics.EZpvd((Object) str, (Object) "isolated") ? TradePositionManager.MarginModeType.ISOLATED : TradePositionManager.MarginModeType.CASH;
        }
        positionItem.setMarginMode(marginModeType);
        positionItem.setMgnRatio(this.mgnRatio);
        positionItem.setMmr(this.mmr);
        positionItem.setOptVal(this.optVal);
        positionItem.setPosId(this.posId);
        positionItem.setPosSide(this.posSide);
        positionItem.setPos(this.pos);
        positionItem.setPosCcy(this.posCcy);
        positionItem.setUpl(this.upl);
        positionItem.setUplRatio(this.uplRatio);
        positionItem.setLast(this.last);
        positionItem.setNotionalUsd(this.notionalUsd);
        positionItem.setAdl(this.adl);
        positionItem.setInterest(this.interest);
        positionItem.setAlgoId(this.algoId);
        positionItem.setMarkPx(this.markPx);
        return positionItem;
    }
}
