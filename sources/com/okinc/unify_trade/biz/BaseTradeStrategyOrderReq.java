package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BaseTradeStrategyOrderReq implements Parcelable {
    private String _last;
    private String advanceOrdType;
    private String banAmend;
    private String ccy;
    private String closeFraction;
    private Boolean cxlOnClosePos;
    private String instId;
    private String instType;
    private Boolean isTradeBorrowMode;
    private String orderType;
    private String posSide;
    private String proposedPx;
    private String quickMgnType;
    private Boolean reduceOnly;
    private String side;
    private String slTriggerPxType;
    private String sz;
    private String tdMode;
    private String tgtCcy;
    private String tpTriggerPxType;
    private String tradeQuoteCcy;
    private String triggerPxType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BaseTradeStrategyOrderReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<BaseTradeStrategyOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseTradeStrategyOrderReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseTradeStrategyOrderReq(string, string2, string3, string4, string5, string6, string7, string8, boolValueOf, string9, string10, string11, string12, string13, string14, string15, string16, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseTradeStrategyOrderReq[] newArray(int i) {
            return new BaseTradeStrategyOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseTradeStrategyOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, @NotNull String str16, Boolean bool2, Boolean bool3, String str17, String str18, String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new BaseTradeStrategyOrderReq(str, str2, str3, str4, str5, str6, str7, str8, bool, str9, str10, str11, str12, str13, str14, str15, str16, bool2, bool3, str17, str18, str19);
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
        if (!(obj instanceof BaseTradeStrategyOrderReq)) {
            return false;
        }
        BaseTradeStrategyOrderReq baseTradeStrategyOrderReq = (BaseTradeStrategyOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) baseTradeStrategyOrderReq.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) baseTradeStrategyOrderReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) baseTradeStrategyOrderReq.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) baseTradeStrategyOrderReq.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) baseTradeStrategyOrderReq.ccy) && Intrinsics.EZpvd((Object) this.orderType, (Object) baseTradeStrategyOrderReq.orderType) && Intrinsics.EZpvd((Object) this.sz, (Object) baseTradeStrategyOrderReq.sz) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) baseTradeStrategyOrderReq.closeFraction) && Intrinsics.EZpvd(this.reduceOnly, baseTradeStrategyOrderReq.reduceOnly) && Intrinsics.EZpvd((Object) this._last, (Object) baseTradeStrategyOrderReq._last) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) baseTradeStrategyOrderReq.tgtCcy) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) baseTradeStrategyOrderReq.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) baseTradeStrategyOrderReq.slTriggerPxType) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) baseTradeStrategyOrderReq.triggerPxType) && Intrinsics.EZpvd((Object) this.proposedPx, (Object) baseTradeStrategyOrderReq.proposedPx) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) baseTradeStrategyOrderReq.quickMgnType) && Intrinsics.EZpvd((Object) this.instType, (Object) baseTradeStrategyOrderReq.instType) && Intrinsics.EZpvd(this.cxlOnClosePos, baseTradeStrategyOrderReq.cxlOnClosePos) && Intrinsics.EZpvd(this.isTradeBorrowMode, baseTradeStrategyOrderReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.banAmend, (Object) baseTradeStrategyOrderReq.banAmend) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) baseTradeStrategyOrderReq.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) baseTradeStrategyOrderReq.advanceOrdType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBanAmend() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCxlOnClosePos() {
        return this.cxlOnClosePos;
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
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposedPx() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
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
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_last() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        int iHashCode3 = this.side.hashCode();
        String str = this.posSide;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.ccy;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.orderType.hashCode();
        int iHashCode7 = this.sz.hashCode();
        String str3 = this.closeFraction;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str4 = this._last;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tgtCcy;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tpTriggerPxType;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slTriggerPxType;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.triggerPxType;
        int iHashCode14 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.proposedPx;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.quickMgnType;
        int iHashCode16 = str10 == null ? 0 : str10.hashCode();
        int iHashCode17 = this.instType.hashCode();
        Boolean bool2 = this.cxlOnClosePos;
        int iHashCode18 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isTradeBorrowMode;
        int iHashCode19 = bool3 == null ? 0 : bool3.hashCode();
        String str11 = this.banAmend;
        int iHashCode20 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tradeQuoteCcy;
        int iHashCode21 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.advanceOrdType;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str13 == null ? 0 : str13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdvanceOrdType(String str) {
        this.advanceOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBanAmend(String str) {
        this.banAmend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFraction(String str) {
        this.closeFraction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCxlOnClosePos(Boolean bool) {
        this.cxlOnClosePos = bool;
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
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposedPx(String str) {
        this.proposedPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(String str) {
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
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
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_last(String str) {
        this._last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BaseTradeStrategyOrderReq(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", orderType=" + this.orderType + ", sz=" + this.sz + ", closeFraction=" + this.closeFraction + ", reduceOnly=" + this.reduceOnly + ", _last=" + this._last + ", tgtCcy=" + this.tgtCcy + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", triggerPxType=" + this.triggerPxType + ", proposedPx=" + this.proposedPx + ", quickMgnType=" + this.quickMgnType + ", instType=" + this.instType + ", cxlOnClosePos=" + this.cxlOnClosePos + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", banAmend=" + this.banAmend + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", advanceOrdType=" + this.advanceOrdType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.ccy);
        parcel.writeString(this.orderType);
        parcel.writeString(this.sz);
        parcel.writeString(this.closeFraction);
        Boolean bool = this.reduceOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this._last);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.proposedPx);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.instType);
        Boolean bool2 = this.cxlOnClosePos;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isTradeBorrowMode;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.banAmend);
        parcel.writeString(this.tradeQuoteCcy);
        parcel.writeString(this.advanceOrdType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BaseTradeStrategyOrderReq> serializer() {
            return BaseTradeStrategyOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BaseTradeStrategyOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, Boolean bool3, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if (74599 != (i & 74599)) {
            PluginExceptionsKt.throwMissingFieldException(i, 74599, BaseTradeStrategyOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        if ((i & 8) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str5;
        }
        this.orderType = str6;
        this.sz = str7;
        if ((i & 128) == 0) {
            this.closeFraction = null;
        } else {
            this.closeFraction = str8;
        }
        this.reduceOnly = bool;
        this._last = str9;
        if ((i & 1024) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str10;
        }
        if ((i & 2048) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str11;
        }
        if ((i & 4096) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str12;
        }
        this.triggerPxType = str13;
        if ((i & 16384) == 0) {
            this.proposedPx = null;
        } else {
            this.proposedPx = str14;
        }
        if ((32768 & i) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str15;
        }
        this.instType = str16;
        if ((131072 & i) == 0) {
            this.cxlOnClosePos = null;
        } else {
            this.cxlOnClosePos = bool2;
        }
        if ((262144 & i) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool3;
        }
        if ((524288 & i) == 0) {
            this.banAmend = null;
        } else {
            this.banAmend = str17;
        }
        if ((1048576 & i) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str18;
        }
        if ((i & 2097152) == 0) {
            this.advanceOrdType = null;
        } else {
            this.advanceOrdType = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, baseTradeStrategyOrderReq.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, baseTradeStrategyOrderReq.tdMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, baseTradeStrategyOrderReq.side);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || baseTradeStrategyOrderReq.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, baseTradeStrategyOrderReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || baseTradeStrategyOrderReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, baseTradeStrategyOrderReq.ccy);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, baseTradeStrategyOrderReq.orderType);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, baseTradeStrategyOrderReq.sz);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || baseTradeStrategyOrderReq.closeFraction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, baseTradeStrategyOrderReq.closeFraction);
        }
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, baseTradeStrategyOrderReq.reduceOnly);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, baseTradeStrategyOrderReq._last);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || baseTradeStrategyOrderReq.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, baseTradeStrategyOrderReq.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || baseTradeStrategyOrderReq.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, baseTradeStrategyOrderReq.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || baseTradeStrategyOrderReq.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, baseTradeStrategyOrderReq.slTriggerPxType);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, baseTradeStrategyOrderReq.triggerPxType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || baseTradeStrategyOrderReq.proposedPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, baseTradeStrategyOrderReq.proposedPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || baseTradeStrategyOrderReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, baseTradeStrategyOrderReq.quickMgnType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, baseTradeStrategyOrderReq.instType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || baseTradeStrategyOrderReq.cxlOnClosePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, baseTradeStrategyOrderReq.cxlOnClosePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || baseTradeStrategyOrderReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, baseTradeStrategyOrderReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || baseTradeStrategyOrderReq.banAmend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, baseTradeStrategyOrderReq.banAmend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || baseTradeStrategyOrderReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, baseTradeStrategyOrderReq.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && baseTradeStrategyOrderReq.advanceOrdType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, baseTradeStrategyOrderReq.advanceOrdType);
    }

    public BaseTradeStrategyOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, @NotNull String str16, Boolean bool2, Boolean bool3, String str17, String str18, String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.posSide = str4;
        this.ccy = str5;
        this.orderType = str6;
        this.sz = str7;
        this.closeFraction = str8;
        this.reduceOnly = bool;
        this._last = str9;
        this.tgtCcy = str10;
        this.tpTriggerPxType = str11;
        this.slTriggerPxType = str12;
        this.triggerPxType = str13;
        this.proposedPx = str14;
        this.quickMgnType = str15;
        this.instType = str16;
        this.cxlOnClosePos = bool2;
        this.isTradeBorrowMode = bool3;
        this.banAmend = str17;
        this.tradeQuoteCcy = str18;
        this.advanceOrdType = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008e: CONSTRUCTOR 
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (r35v0 java.lang.Boolean)
  (r36v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (r40v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (r43v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r45v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (1048576 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:619) call: com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BaseTradeStrategyOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, Boolean bool3, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, str7, (i & 128) != 0 ? null : str8, bool, str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, str16, (131072 & i) != 0 ? null : bool2, (262144 & i) != 0 ? null : bool3, (524288 & i) != 0 ? null : str17, (1048576 & i) != 0 ? null : str18, (i & 2097152) != 0 ? null : str19);
    }
}
