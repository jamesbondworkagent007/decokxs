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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionalTradeOrderReq implements Parcelable {
    private String assetNeedTransfer;
    private String banAmend;
    private String bboType;
    private String ccy;
    private String cost;
    private Boolean disableSlLiqTip;
    private Boolean isTradeBorrowMode;
    private String orderValue;
    private String posSide;
    private String probablyValue;
    private String px;
    private String pxUsd;
    private String pxVol;
    private String quickMgnType;
    private Boolean reduceOnly;
    private String simpleEarnNeedTransfer;
    private String tgtCcy;
    private String tradeAvail;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionalTradeOrderReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OptionalTradeOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionalTradeOrderReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
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
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OptionalTradeOrderReq(string, string2, boolValueOf, string3, string4, string5, string6, string7, string8, string9, string10, boolValueOf2, string11, string12, string13, string14, string15, boolValueOf3, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionalTradeOrderReq[] newArray(int i) {
            return new OptionalTradeOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionalTradeOrderReq() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.assetNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.simpleEarnNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tradeAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.disableSlLiqTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.probablyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionalTradeOrderReq copy(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16) {
        return new OptionalTradeOrderReq(str, str2, bool, str3, str4, str5, str6, str7, str8, str9, str10, bool2, str11, str12, str13, str14, str15, bool3, str16);
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
        if (!(obj instanceof OptionalTradeOrderReq)) {
            return false;
        }
        OptionalTradeOrderReq optionalTradeOrderReq = (OptionalTradeOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.posSide, (Object) optionalTradeOrderReq.posSide) && Intrinsics.EZpvd((Object) this.px, (Object) optionalTradeOrderReq.px) && Intrinsics.EZpvd(this.reduceOnly, optionalTradeOrderReq.reduceOnly) && Intrinsics.EZpvd((Object) this.bboType, (Object) optionalTradeOrderReq.bboType) && Intrinsics.EZpvd((Object) this.ccy, (Object) optionalTradeOrderReq.ccy) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) optionalTradeOrderReq.tgtCcy) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) optionalTradeOrderReq.quickMgnType) && Intrinsics.EZpvd((Object) this.cost, (Object) optionalTradeOrderReq.cost) && Intrinsics.EZpvd((Object) this.probablyValue, (Object) optionalTradeOrderReq.probablyValue) && Intrinsics.EZpvd((Object) this.pxUsd, (Object) optionalTradeOrderReq.pxUsd) && Intrinsics.EZpvd((Object) this.pxVol, (Object) optionalTradeOrderReq.pxVol) && Intrinsics.EZpvd(this.isTradeBorrowMode, optionalTradeOrderReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.banAmend, (Object) optionalTradeOrderReq.banAmend) && Intrinsics.EZpvd((Object) this.assetNeedTransfer, (Object) optionalTradeOrderReq.assetNeedTransfer) && Intrinsics.EZpvd((Object) this.simpleEarnNeedTransfer, (Object) optionalTradeOrderReq.simpleEarnNeedTransfer) && Intrinsics.EZpvd((Object) this.tradeAvail, (Object) optionalTradeOrderReq.tradeAvail) && Intrinsics.EZpvd((Object) this.orderValue, (Object) optionalTradeOrderReq.orderValue) && Intrinsics.EZpvd(this.disableSlLiqTip, optionalTradeOrderReq.disableSlLiqTip) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) optionalTradeOrderReq.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetNeedTransfer() {
        return this.assetNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBanAmend() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBboType() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCost() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisableSlLiqTip() {
        return this.disableSlLiqTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProbablyValue() {
        return this.probablyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
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
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnNeedTransfer() {
        return this.simpleEarnNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeAvail() {
        return this.tradeAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.posSide;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.px;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.bboType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ccy;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tgtCcy;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.quickMgnType;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.cost;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.probablyValue;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.pxUsd;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.pxVol;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        Boolean bool2 = this.isTradeBorrowMode;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        String str11 = this.banAmend;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.assetNeedTransfer;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.simpleEarnNeedTransfer;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tradeAvail;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.orderValue;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        Boolean bool3 = this.disableSlLiqTip;
        int iHashCode18 = bool3 == null ? 0 : bool3.hashCode();
        String str16 = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str16 == null ? 0 : str16.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetNeedTransfer(String str) {
        this.assetNeedTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBanAmend(String str) {
        this.banAmend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBboType(String str) {
        this.bboType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCost(String str) {
        this.cost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisableSlLiqTip(Boolean bool) {
        this.disableSlLiqTip = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(String str) {
        this.orderValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProbablyValue(String str) {
        this.probablyValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
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
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleEarnNeedTransfer(String str) {
        this.simpleEarnNeedTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTgtCcy(String str) {
        this.tgtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeAvail(String str) {
        this.tradeAvail = str;
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
    public String toString() {
        return "OptionalTradeOrderReq(posSide=" + this.posSide + ", px=" + this.px + ", reduceOnly=" + this.reduceOnly + ", bboType=" + this.bboType + ", ccy=" + this.ccy + ", tgtCcy=" + this.tgtCcy + ", quickMgnType=" + this.quickMgnType + ", cost=" + this.cost + ", probablyValue=" + this.probablyValue + ", pxUsd=" + this.pxUsd + ", pxVol=" + this.pxVol + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", banAmend=" + this.banAmend + ", assetNeedTransfer=" + this.assetNeedTransfer + ", simpleEarnNeedTransfer=" + this.simpleEarnNeedTransfer + ", tradeAvail=" + this.tradeAvail + ", orderValue=" + this.orderValue + ", disableSlLiqTip=" + this.disableSlLiqTip + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posSide);
        parcel.writeString(this.px);
        Boolean bool = this.reduceOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.bboType);
        parcel.writeString(this.ccy);
        parcel.writeString(this.tgtCcy);
        parcel.writeString(this.quickMgnType);
        parcel.writeString(this.cost);
        parcel.writeString(this.probablyValue);
        parcel.writeString(this.pxUsd);
        parcel.writeString(this.pxVol);
        Boolean bool2 = this.isTradeBorrowMode;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.banAmend);
        parcel.writeString(this.assetNeedTransfer);
        parcel.writeString(this.simpleEarnNeedTransfer);
        parcel.writeString(this.tradeAvail);
        parcel.writeString(this.orderValue);
        Boolean bool3 = this.disableSlLiqTip;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.tradeQuoteCcy);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionalTradeOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionalTradeOrderReq> serializer() {
            return OptionalTradeOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionalTradeOrderReq(int i, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str;
        }
        if ((i & 2) == 0) {
            this.px = null;
        } else {
            this.px = str2;
        }
        if ((i & 4) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 8) == 0) {
            this.bboType = null;
        } else {
            this.bboType = str3;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str4;
        }
        if ((i & 32) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str5;
        }
        if ((i & 64) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str6;
        }
        if ((i & 128) == 0) {
            this.cost = null;
        } else {
            this.cost = str7;
        }
        if ((i & 256) == 0) {
            this.probablyValue = null;
        } else {
            this.probablyValue = str8;
        }
        if ((i & 512) == 0) {
            this.pxUsd = null;
        } else {
            this.pxUsd = str9;
        }
        if ((i & 1024) == 0) {
            this.pxVol = null;
        } else {
            this.pxVol = str10;
        }
        if ((i & 2048) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool2;
        }
        if ((i & 4096) == 0) {
            this.banAmend = null;
        } else {
            this.banAmend = str11;
        }
        if ((i & 8192) == 0) {
            this.assetNeedTransfer = null;
        } else {
            this.assetNeedTransfer = str12;
        }
        if ((i & 16384) == 0) {
            this.simpleEarnNeedTransfer = null;
        } else {
            this.simpleEarnNeedTransfer = str13;
        }
        if ((32768 & i) == 0) {
            this.tradeAvail = null;
        } else {
            this.tradeAvail = str14;
        }
        if ((65536 & i) == 0) {
            this.orderValue = null;
        } else {
            this.orderValue = str15;
        }
        this.disableSlLiqTip = (131072 & i) == 0 ? Boolean.FALSE : bool3;
        if ((i & 262144) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionalTradeOrderReq optionalTradeOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || optionalTradeOrderReq.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, optionalTradeOrderReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || optionalTradeOrderReq.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, optionalTradeOrderReq.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || optionalTradeOrderReq.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, optionalTradeOrderReq.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || optionalTradeOrderReq.bboType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, optionalTradeOrderReq.bboType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || optionalTradeOrderReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, optionalTradeOrderReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || optionalTradeOrderReq.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, optionalTradeOrderReq.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || optionalTradeOrderReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, optionalTradeOrderReq.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || optionalTradeOrderReq.cost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, optionalTradeOrderReq.cost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || optionalTradeOrderReq.probablyValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, optionalTradeOrderReq.probablyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || optionalTradeOrderReq.pxUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, optionalTradeOrderReq.pxUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || optionalTradeOrderReq.pxVol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, optionalTradeOrderReq.pxVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || optionalTradeOrderReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, optionalTradeOrderReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || optionalTradeOrderReq.banAmend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, optionalTradeOrderReq.banAmend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || optionalTradeOrderReq.assetNeedTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, optionalTradeOrderReq.assetNeedTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || optionalTradeOrderReq.simpleEarnNeedTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, optionalTradeOrderReq.simpleEarnNeedTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || optionalTradeOrderReq.tradeAvail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, optionalTradeOrderReq.tradeAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || optionalTradeOrderReq.orderValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, optionalTradeOrderReq.orderValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(optionalTradeOrderReq.disableSlLiqTip, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, optionalTradeOrderReq.disableSlLiqTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && optionalTradeOrderReq.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, optionalTradeOrderReq.tradeQuoteCcy);
    }

    public OptionalTradeOrderReq(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16) {
        this.posSide = str;
        this.px = str2;
        this.reduceOnly = bool;
        this.bboType = str3;
        this.ccy = str4;
        this.tgtCcy = str5;
        this.quickMgnType = str6;
        this.cost = str7;
        this.probablyValue = str8;
        this.pxUsd = str9;
        this.pxVol = str10;
        this.isTradeBorrowMode = bool2;
        this.banAmend = str11;
        this.assetNeedTransfer = str12;
        this.simpleEarnNeedTransfer = str13;
        this.tradeAvail = str14;
        this.orderValue = str15;
        this.disableSlLiqTip = bool3;
        this.tradeQuoteCcy = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ce: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0097: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:296) call: com.okinc.unify_trade.biz.OptionalTradeOrderReq.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ OptionalTradeOrderReq(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? Boolean.FALSE : bool3, (i & 262144) != 0 ? null : str16);
    }
}
