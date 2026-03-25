package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class YieldHunterPositionsResp implements Parcelable {
    private String aplRatio;
    private String availPos;
    private String cTime;
    private String ccy;
    private String clRefId;
    private String clRefType;
    private String cost;
    private String costCcy;
    private String estApl;
    private String estAplRatio;
    private String estPnl;
    private String estPnlPlusCost;
    private String estPnlRatio;
    private String expTime;
    private String idxPx;
    private String instId;
    private String instType;
    private String lever;
    private String liqPx;
    private String optType;
    private String pnl;
    private String pnlPlusCost;
    private String pnlRatio;
    private String state;
    private String stk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterPositionsResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<YieldHunterPositionsResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPositionsResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterPositionsResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPositionsResp[] newArray(int i) {
            return new YieldHunterPositionsResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterPositionsResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.clRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.clRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estApl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.costCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.estPnlPlusCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.pnlPlusCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.aplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estAplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterPositionsResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        return new YieldHunterPositionsResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25);
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
        if (!(obj instanceof YieldHunterPositionsResp)) {
            return false;
        }
        YieldHunterPositionsResp yieldHunterPositionsResp = (YieldHunterPositionsResp) obj;
        return Intrinsics.EZpvd((Object) this.availPos, (Object) yieldHunterPositionsResp.availPos) && Intrinsics.EZpvd((Object) this.estApl, (Object) yieldHunterPositionsResp.estApl) && Intrinsics.EZpvd((Object) this.estAplRatio, (Object) yieldHunterPositionsResp.estAplRatio) && Intrinsics.EZpvd((Object) this.estPnl, (Object) yieldHunterPositionsResp.estPnl) && Intrinsics.EZpvd((Object) this.estPnlRatio, (Object) yieldHunterPositionsResp.estPnlRatio) && Intrinsics.EZpvd((Object) this.cTime, (Object) yieldHunterPositionsResp.cTime) && Intrinsics.EZpvd((Object) this.ccy, (Object) yieldHunterPositionsResp.ccy) && Intrinsics.EZpvd((Object) this.instId, (Object) yieldHunterPositionsResp.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) yieldHunterPositionsResp.instType) && Intrinsics.EZpvd((Object) this.idxPx, (Object) yieldHunterPositionsResp.idxPx) && Intrinsics.EZpvd((Object) this.lever, (Object) yieldHunterPositionsResp.lever) && Intrinsics.EZpvd((Object) this.liqPx, (Object) yieldHunterPositionsResp.liqPx) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) yieldHunterPositionsResp.pnlRatio) && Intrinsics.EZpvd((Object) this.pnl, (Object) yieldHunterPositionsResp.pnl) && Intrinsics.EZpvd((Object) this.expTime, (Object) yieldHunterPositionsResp.expTime) && Intrinsics.EZpvd((Object) this.stk, (Object) yieldHunterPositionsResp.stk) && Intrinsics.EZpvd((Object) this.clRefId, (Object) yieldHunterPositionsResp.clRefId) && Intrinsics.EZpvd((Object) this.clRefType, (Object) yieldHunterPositionsResp.clRefType) && Intrinsics.EZpvd((Object) this.optType, (Object) yieldHunterPositionsResp.optType) && Intrinsics.EZpvd((Object) this.state, (Object) yieldHunterPositionsResp.state) && Intrinsics.EZpvd((Object) this.cost, (Object) yieldHunterPositionsResp.cost) && Intrinsics.EZpvd((Object) this.costCcy, (Object) yieldHunterPositionsResp.costCcy) && Intrinsics.EZpvd((Object) this.estPnlPlusCost, (Object) yieldHunterPositionsResp.estPnlPlusCost) && Intrinsics.EZpvd((Object) this.pnlPlusCost, (Object) yieldHunterPositionsResp.pnlPlusCost) && Intrinsics.EZpvd((Object) this.aplRatio, (Object) yieldHunterPositionsResp.aplRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAplRatio() {
        return this.aplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailPos() {
        return this.availPos;
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
    public final String getCost() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostCcy() {
        return this.costCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstApl() {
        return this.estApl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatio() {
        return this.estAplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnl() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlPlusCost() {
        return this.estPnlPlusCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlRatio() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdxPx() {
        return this.idxPx;
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
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
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
    public final String getPnlPlusCost() {
        return this.pnlPlusCost;
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
    public int hashCode() {
        String str = this.availPos;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.estApl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estAplRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estPnl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estPnlRatio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.cTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ccy;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.instId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.instType;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.idxPx;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.lever;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.liqPx;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.pnlRatio;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.pnl;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.expTime;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.stk;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.clRefId;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.clRefType;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.optType;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.state;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.cost;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.costCcy;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.estPnlPlusCost;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.pnlPlusCost;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.aplRatio;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (str25 == null ? 0 : str25.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAplRatio(String str) {
        this.aplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailPos(String str) {
        this.availPos = str;
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
    public final void setCost(String str) {
        this.cost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostCcy(String str) {
        this.costCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstApl(String str) {
        this.estApl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatio(String str) {
        this.estAplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnl(String str) {
        this.estPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlPlusCost(String str) {
        this.estPnlPlusCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlRatio(String str) {
        this.estPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(String str) {
        this.expTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdxPx(String str) {
        this.idxPx = str;
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
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPx(String str) {
        this.liqPx = str;
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
    public final void setPnlPlusCost(String str) {
        this.pnlPlusCost = str;
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
    public String toString() {
        return "YieldHunterPositionsResp(availPos=" + this.availPos + ", estApl=" + this.estApl + ", estAplRatio=" + this.estAplRatio + ", estPnl=" + this.estPnl + ", estPnlRatio=" + this.estPnlRatio + ", cTime=" + this.cTime + ", ccy=" + this.ccy + ", instId=" + this.instId + ", instType=" + this.instType + ", idxPx=" + this.idxPx + ", lever=" + this.lever + ", liqPx=" + this.liqPx + ", pnlRatio=" + this.pnlRatio + ", pnl=" + this.pnl + ", expTime=" + this.expTime + ", stk=" + this.stk + ", clRefId=" + this.clRefId + ", clRefType=" + this.clRefType + ", optType=" + this.optType + ", state=" + this.state + ", cost=" + this.cost + ", costCcy=" + this.costCcy + ", estPnlPlusCost=" + this.estPnlPlusCost + ", pnlPlusCost=" + this.pnlPlusCost + ", aplRatio=" + this.aplRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.availPos);
        parcel.writeString(this.estApl);
        parcel.writeString(this.estAplRatio);
        parcel.writeString(this.estPnl);
        parcel.writeString(this.estPnlRatio);
        parcel.writeString(this.cTime);
        parcel.writeString(this.ccy);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.idxPx);
        parcel.writeString(this.lever);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.pnl);
        parcel.writeString(this.expTime);
        parcel.writeString(this.stk);
        parcel.writeString(this.clRefId);
        parcel.writeString(this.clRefType);
        parcel.writeString(this.optType);
        parcel.writeString(this.state);
        parcel.writeString(this.cost);
        parcel.writeString(this.costCcy);
        parcel.writeString(this.estPnlPlusCost);
        parcel.writeString(this.pnlPlusCost);
        parcel.writeString(this.aplRatio);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterPositionsResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterPositionsResp> serializer() {
            return YieldHunterPositionsResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterPositionsResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availPos = null;
        } else {
            this.availPos = str;
        }
        if ((i & 2) == 0) {
            this.estApl = null;
        } else {
            this.estApl = str2;
        }
        if ((i & 4) == 0) {
            this.estAplRatio = null;
        } else {
            this.estAplRatio = str3;
        }
        if ((i & 8) == 0) {
            this.estPnl = null;
        } else {
            this.estPnl = str4;
        }
        if ((i & 16) == 0) {
            this.estPnlRatio = null;
        } else {
            this.estPnlRatio = str5;
        }
        if ((i & 32) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str6;
        }
        if ((i & 64) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str7;
        }
        if ((i & 128) == 0) {
            this.instId = null;
        } else {
            this.instId = str8;
        }
        if ((i & 256) == 0) {
            this.instType = null;
        } else {
            this.instType = str9;
        }
        if ((i & 512) == 0) {
            this.idxPx = null;
        } else {
            this.idxPx = str10;
        }
        if ((i & 1024) == 0) {
            this.lever = null;
        } else {
            this.lever = str11;
        }
        if ((i & 2048) == 0) {
            this.liqPx = null;
        } else {
            this.liqPx = str12;
        }
        if ((i & 4096) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str13;
        }
        if ((i & 8192) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str14;
        }
        if ((i & 16384) == 0) {
            this.expTime = null;
        } else {
            this.expTime = str15;
        }
        if ((32768 & i) == 0) {
            this.stk = null;
        } else {
            this.stk = str16;
        }
        if ((65536 & i) == 0) {
            this.clRefId = null;
        } else {
            this.clRefId = str17;
        }
        if ((131072 & i) == 0) {
            this.clRefType = null;
        } else {
            this.clRefType = str18;
        }
        if ((262144 & i) == 0) {
            this.optType = null;
        } else {
            this.optType = str19;
        }
        if ((524288 & i) == 0) {
            this.state = null;
        } else {
            this.state = str20;
        }
        if ((1048576 & i) == 0) {
            this.cost = null;
        } else {
            this.cost = str21;
        }
        if ((2097152 & i) == 0) {
            this.costCcy = null;
        } else {
            this.costCcy = str22;
        }
        if ((4194304 & i) == 0) {
            this.estPnlPlusCost = null;
        } else {
            this.estPnlPlusCost = str23;
        }
        if ((8388608 & i) == 0) {
            this.pnlPlusCost = null;
        } else {
            this.pnlPlusCost = str24;
        }
        if ((i & 16777216) == 0) {
            this.aplRatio = null;
        } else {
            this.aplRatio = str25;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterPositionsResp yieldHunterPositionsResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterPositionsResp.availPos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterPositionsResp.availPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterPositionsResp.estApl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterPositionsResp.estApl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterPositionsResp.estAplRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterPositionsResp.estAplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterPositionsResp.estPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, yieldHunterPositionsResp.estPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterPositionsResp.estPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterPositionsResp.estPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || yieldHunterPositionsResp.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterPositionsResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || yieldHunterPositionsResp.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, yieldHunterPositionsResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || yieldHunterPositionsResp.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, yieldHunterPositionsResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || yieldHunterPositionsResp.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, yieldHunterPositionsResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || yieldHunterPositionsResp.idxPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, yieldHunterPositionsResp.idxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || yieldHunterPositionsResp.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, yieldHunterPositionsResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || yieldHunterPositionsResp.liqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, yieldHunterPositionsResp.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || yieldHunterPositionsResp.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, yieldHunterPositionsResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || yieldHunterPositionsResp.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, yieldHunterPositionsResp.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || yieldHunterPositionsResp.expTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, yieldHunterPositionsResp.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || yieldHunterPositionsResp.stk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, yieldHunterPositionsResp.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || yieldHunterPositionsResp.clRefId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, yieldHunterPositionsResp.clRefId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || yieldHunterPositionsResp.clRefType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, yieldHunterPositionsResp.clRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || yieldHunterPositionsResp.optType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, yieldHunterPositionsResp.optType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || yieldHunterPositionsResp.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, yieldHunterPositionsResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || yieldHunterPositionsResp.cost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, yieldHunterPositionsResp.cost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || yieldHunterPositionsResp.costCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, yieldHunterPositionsResp.costCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || yieldHunterPositionsResp.estPnlPlusCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, yieldHunterPositionsResp.estPnlPlusCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || yieldHunterPositionsResp.pnlPlusCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, yieldHunterPositionsResp.pnlPlusCost);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && yieldHunterPositionsResp.aplRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, yieldHunterPositionsResp.aplRatio);
    }

    public YieldHunterPositionsResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        this.availPos = str;
        this.estApl = str2;
        this.estAplRatio = str3;
        this.estPnl = str4;
        this.estPnlRatio = str5;
        this.cTime = str6;
        this.ccy = str7;
        this.instId = str8;
        this.instType = str9;
        this.idxPx = str10;
        this.lever = str11;
        this.liqPx = str12;
        this.pnlRatio = str13;
        this.pnl = str14;
        this.expTime = str15;
        this.stk = str16;
        this.clRefId = str17;
        this.clRefType = str18;
        this.optType = str19;
        this.state = str20;
        this.cost = str21;
        this.costCcy = str22;
        this.estPnlPlusCost = str23;
        this.pnlPlusCost = str24;
        this.aplRatio = str25;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x011c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.unify_trade.biz.YieldHunterPositionsResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterPositionsResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25);
    }
}
