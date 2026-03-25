package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SimpleOptionsPositionVo implements Parcelable {
    private String ableToClose;
    private String breakEvenPx;
    private String cTime;
    private String ccy;
    private String clRefId;
    private String clRefType;
    private String closeAmount;
    private String cost;
    private String estPnl;
    private String estPnlRatio;
    private String expiry;
    private String instId;
    private String instType;
    private String leverage;
    private String openAmount;
    private String optType;
    private String pnl;
    private String pnlRatio;
    private String state;
    private String stk;
    private String sz;
    private String targetPrice;
    private String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleOptionsPositionVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimpleOptionsPositionVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionsPositionVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleOptionsPositionVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionsPositionVo[] newArray(int i) {
            return new SimpleOptionsPositionVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleOptionsPositionVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.openAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.closeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.ableToClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.breakEvenPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.targetPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionsPositionVo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        return new SimpleOptionsPositionVo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
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
        if (!(obj instanceof SimpleOptionsPositionVo)) {
            return false;
        }
        SimpleOptionsPositionVo simpleOptionsPositionVo = (SimpleOptionsPositionVo) obj;
        return Intrinsics.EZpvd((Object) this.clRefType, (Object) simpleOptionsPositionVo.clRefType) && Intrinsics.EZpvd((Object) this.clRefId, (Object) simpleOptionsPositionVo.clRefId) && Intrinsics.EZpvd((Object) this.estPnl, (Object) simpleOptionsPositionVo.estPnl) && Intrinsics.EZpvd((Object) this.estPnlRatio, (Object) simpleOptionsPositionVo.estPnlRatio) && Intrinsics.EZpvd((Object) this.cost, (Object) simpleOptionsPositionVo.cost) && Intrinsics.EZpvd((Object) this.expiry, (Object) simpleOptionsPositionVo.expiry) && Intrinsics.EZpvd((Object) this.sz, (Object) simpleOptionsPositionVo.sz) && Intrinsics.EZpvd((Object) this.instId, (Object) simpleOptionsPositionVo.instId) && Intrinsics.EZpvd((Object) this.targetPrice, (Object) simpleOptionsPositionVo.targetPrice) && Intrinsics.EZpvd((Object) this.stk, (Object) simpleOptionsPositionVo.stk) && Intrinsics.EZpvd((Object) this.optType, (Object) simpleOptionsPositionVo.optType) && Intrinsics.EZpvd((Object) this.ccy, (Object) simpleOptionsPositionVo.ccy) && Intrinsics.EZpvd((Object) this.instType, (Object) simpleOptionsPositionVo.instType) && Intrinsics.EZpvd((Object) this.cTime, (Object) simpleOptionsPositionVo.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) simpleOptionsPositionVo.uTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) simpleOptionsPositionVo.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) simpleOptionsPositionVo.pnlRatio) && Intrinsics.EZpvd((Object) this.openAmount, (Object) simpleOptionsPositionVo.openAmount) && Intrinsics.EZpvd((Object) this.closeAmount, (Object) simpleOptionsPositionVo.closeAmount) && Intrinsics.EZpvd((Object) this.ableToClose, (Object) simpleOptionsPositionVo.ableToClose) && Intrinsics.EZpvd((Object) this.breakEvenPx, (Object) simpleOptionsPositionVo.breakEvenPx) && Intrinsics.EZpvd((Object) this.state, (Object) simpleOptionsPositionVo.state) && Intrinsics.EZpvd((Object) this.leverage, (Object) simpleOptionsPositionVo.leverage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbleToClose() {
        return this.ableToClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBreakEvenPx() {
        return this.breakEvenPx;
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
    public final String getClRefId() {
        return this.clRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClRefType() {
        return this.clRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseAmount() {
        return this.closeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCost() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnl() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlRatio() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiry() {
        return this.expiry;
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
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAmount() {
        return this.openAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetPrice() {
        return this.targetPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.clRefType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clRefId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estPnl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estPnlRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.cost;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.expiry;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sz;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.instId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.targetPrice;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.stk;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.optType;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.ccy;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.instType;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.cTime;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.uTime;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.pnl;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.pnlRatio;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.openAmount;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.closeAmount;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.ableToClose;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.breakEvenPx;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.state;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.leverage;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str23 == null ? 0 : str23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbleToClose(String str) {
        this.ableToClose = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBreakEvenPx(String str) {
        this.breakEvenPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClRefId(String str) {
        this.clRefId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClRefType(String str) {
        this.clRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseAmount(String str) {
        this.closeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCost(String str) {
        this.cost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnl(String str) {
        this.estPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlRatio(String str) {
        this.estPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiry(String str) {
        this.expiry = str;
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
    public final void setLeverage(String str) {
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAmount(String str) {
        this.openAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptType(String str) {
        this.optType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(String str) {
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStk(String str) {
        this.stk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetPrice(String str) {
        this.targetPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(String str) {
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleOptionsPositionVo(clRefType=" + this.clRefType + ", clRefId=" + this.clRefId + ", estPnl=" + this.estPnl + ", estPnlRatio=" + this.estPnlRatio + ", cost=" + this.cost + ", expiry=" + this.expiry + ", sz=" + this.sz + ", instId=" + this.instId + ", targetPrice=" + this.targetPrice + ", stk=" + this.stk + ", optType=" + this.optType + ", ccy=" + this.ccy + ", instType=" + this.instType + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", openAmount=" + this.openAmount + ", closeAmount=" + this.closeAmount + ", ableToClose=" + this.ableToClose + ", breakEvenPx=" + this.breakEvenPx + ", state=" + this.state + ", leverage=" + this.leverage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.clRefType);
        parcel.writeString(this.clRefId);
        parcel.writeString(this.estPnl);
        parcel.writeString(this.estPnlRatio);
        parcel.writeString(this.cost);
        parcel.writeString(this.expiry);
        parcel.writeString(this.sz);
        parcel.writeString(this.instId);
        parcel.writeString(this.targetPrice);
        parcel.writeString(this.stk);
        parcel.writeString(this.optType);
        parcel.writeString(this.ccy);
        parcel.writeString(this.instType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.openAmount);
        parcel.writeString(this.closeAmount);
        parcel.writeString(this.ableToClose);
        parcel.writeString(this.breakEvenPx);
        parcel.writeString(this.state);
        parcel.writeString(this.leverage);
    }

    public /* synthetic */ SimpleOptionsPositionVo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.clRefType = null;
        } else {
            this.clRefType = str;
        }
        if ((i & 2) == 0) {
            this.clRefId = null;
        } else {
            this.clRefId = str2;
        }
        if ((i & 4) == 0) {
            this.estPnl = null;
        } else {
            this.estPnl = str3;
        }
        if ((i & 8) == 0) {
            this.estPnlRatio = null;
        } else {
            this.estPnlRatio = str4;
        }
        if ((i & 16) == 0) {
            this.cost = null;
        } else {
            this.cost = str5;
        }
        if ((i & 32) == 0) {
            this.expiry = null;
        } else {
            this.expiry = str6;
        }
        if ((i & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str7;
        }
        if ((i & 128) == 0) {
            this.instId = null;
        } else {
            this.instId = str8;
        }
        if ((i & 256) == 0) {
            this.targetPrice = null;
        } else {
            this.targetPrice = str9;
        }
        if ((i & 512) == 0) {
            this.stk = null;
        } else {
            this.stk = str10;
        }
        if ((i & 1024) == 0) {
            this.optType = null;
        } else {
            this.optType = str11;
        }
        if ((i & 2048) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str12;
        }
        if ((i & 4096) == 0) {
            this.instType = null;
        } else {
            this.instType = str13;
        }
        if ((i & 8192) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str14;
        }
        if ((i & 16384) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str15;
        }
        if ((32768 & i) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str16;
        }
        if ((65536 & i) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str17;
        }
        if ((131072 & i) == 0) {
            this.openAmount = null;
        } else {
            this.openAmount = str18;
        }
        if ((262144 & i) == 0) {
            this.closeAmount = null;
        } else {
            this.closeAmount = str19;
        }
        if ((524288 & i) == 0) {
            this.ableToClose = null;
        } else {
            this.ableToClose = str20;
        }
        if ((1048576 & i) == 0) {
            this.breakEvenPx = null;
        } else {
            this.breakEvenPx = str21;
        }
        if ((2097152 & i) == 0) {
            this.state = null;
        } else {
            this.state = str22;
        }
        if ((i & 4194304) == 0) {
            this.leverage = null;
        } else {
            this.leverage = str23;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionsPositionVo simpleOptionsPositionVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simpleOptionsPositionVo.clRefType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, simpleOptionsPositionVo.clRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || simpleOptionsPositionVo.clRefId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, simpleOptionsPositionVo.clRefId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || simpleOptionsPositionVo.estPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, simpleOptionsPositionVo.estPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || simpleOptionsPositionVo.estPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, simpleOptionsPositionVo.estPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || simpleOptionsPositionVo.cost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, simpleOptionsPositionVo.cost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || simpleOptionsPositionVo.expiry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, simpleOptionsPositionVo.expiry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || simpleOptionsPositionVo.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, simpleOptionsPositionVo.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || simpleOptionsPositionVo.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, simpleOptionsPositionVo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || simpleOptionsPositionVo.targetPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, simpleOptionsPositionVo.targetPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || simpleOptionsPositionVo.stk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, simpleOptionsPositionVo.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || simpleOptionsPositionVo.optType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, simpleOptionsPositionVo.optType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || simpleOptionsPositionVo.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, simpleOptionsPositionVo.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || simpleOptionsPositionVo.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, simpleOptionsPositionVo.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || simpleOptionsPositionVo.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, simpleOptionsPositionVo.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || simpleOptionsPositionVo.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, simpleOptionsPositionVo.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || simpleOptionsPositionVo.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, simpleOptionsPositionVo.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || simpleOptionsPositionVo.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, simpleOptionsPositionVo.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || simpleOptionsPositionVo.openAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, simpleOptionsPositionVo.openAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || simpleOptionsPositionVo.closeAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, simpleOptionsPositionVo.closeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || simpleOptionsPositionVo.ableToClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, simpleOptionsPositionVo.ableToClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || simpleOptionsPositionVo.breakEvenPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, simpleOptionsPositionVo.breakEvenPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || simpleOptionsPositionVo.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, simpleOptionsPositionVo.state);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && simpleOptionsPositionVo.leverage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, simpleOptionsPositionVo.leverage);
    }

    public SimpleOptionsPositionVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        this.clRefType = str;
        this.clRefId = str2;
        this.estPnl = str3;
        this.estPnlRatio = str4;
        this.cost = str5;
        this.expiry = str6;
        this.sz = str7;
        this.instId = str8;
        this.targetPrice = str9;
        this.stk = str10;
        this.optType = str11;
        this.ccy = str12;
        this.instType = str13;
        this.cTime = str14;
        this.uTime = str15;
        this.pnl = str16;
        this.pnlRatio = str17;
        this.openAmount = str18;
        this.closeAmount = str19;
        this.ableToClose = str20;
        this.breakEvenPx = str21;
        this.state = str22;
        this.leverage = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0102: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5464) call: com.okinc.unify_trade.biz.SimpleOptionsPositionVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleOptionsPositionVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23);
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends SimpleOptionsPositionVo>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionsPositionVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SimpleOptionsPositionVo> serializer() {
            return SimpleOptionsPositionVo$$serializer.INSTANCE;
        }

        public final List<SimpleOptionsPositionVo> OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Application().getType());
                if (list != null && !list.isEmpty()) {
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "SimpleOptionsPositionVo-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}
