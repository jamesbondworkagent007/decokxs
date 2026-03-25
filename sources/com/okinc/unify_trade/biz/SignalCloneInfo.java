package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SignalCloneInfo implements Parcelable {
    public static final String TYPE_CLONE_TRADE_SETTING = "2";
    public static final String TYPE_SIGNAL_CLONE = "1";
    private String advanceOrdType;
    private List<AttachAlgoOrder> attachAlgoOrds;
    private String bizType;
    private String bsType;
    private String ccy;
    private String from;
    private String instId;
    private String instType;
    private String level;
    private String ordPx;
    private String ordType;
    private String policyType;
    private String posSide;
    private String px;
    private String side;
    private String sz;
    private String triggerPx;
    private String triggerPxType;
    private final String type;
    private final UploadSettingConfigBean value;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalCloneInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SignalCloneInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCloneInfo createFromParcel(Parcel parcel) {
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
            if (parcel.readInt() == 0) {
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(AttachAlgoOrder.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new SignalCloneInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UploadSettingConfigBean.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCloneInfo[] newArray(int i) {
            return new SignalCloneInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalCloneInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AttachAlgoOrder> component14() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.policyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigBean component19() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalCloneInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, List<AttachAlgoOrder> list, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, UploadSettingConfigBean uploadSettingConfigBean, String str18) {
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
        return new SignalCloneInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, str14, str15, str16, str17, uploadSettingConfigBean, str18);
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
        if (!(obj instanceof SignalCloneInfo)) {
            return false;
        }
        SignalCloneInfo signalCloneInfo = (SignalCloneInfo) obj;
        return Intrinsics.EZpvd((Object) this.px, (Object) signalCloneInfo.px) && Intrinsics.EZpvd((Object) this.side, (Object) signalCloneInfo.side) && Intrinsics.EZpvd((Object) this.instId, (Object) signalCloneInfo.instId) && Intrinsics.EZpvd((Object) this.bizType, (Object) signalCloneInfo.bizType) && Intrinsics.EZpvd((Object) this.instType, (Object) signalCloneInfo.instType) && Intrinsics.EZpvd((Object) this.bsType, (Object) signalCloneInfo.bsType) && Intrinsics.EZpvd((Object) this.ordType, (Object) signalCloneInfo.ordType) && Intrinsics.EZpvd((Object) this.posSide, (Object) signalCloneInfo.posSide) && Intrinsics.EZpvd((Object) this.from, (Object) signalCloneInfo.from) && Intrinsics.EZpvd((Object) this.sz, (Object) signalCloneInfo.sz) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) signalCloneInfo.triggerPx) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) signalCloneInfo.triggerPxType) && Intrinsics.EZpvd((Object) this.ordPx, (Object) signalCloneInfo.ordPx) && Intrinsics.EZpvd(this.attachAlgoOrds, signalCloneInfo.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.level, (Object) signalCloneInfo.level) && Intrinsics.EZpvd((Object) this.ccy, (Object) signalCloneInfo.ccy) && Intrinsics.EZpvd((Object) this.policyType, (Object) signalCloneInfo.policyType) && Intrinsics.EZpvd((Object) this.type, (Object) signalCloneInfo.type) && Intrinsics.EZpvd(this.value, signalCloneInfo.value) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) signalCloneInfo.advanceOrdType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AttachAlgoOrder> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBsType() {
        return this.bsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
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
    public final String getLevel() {
        return this.level;
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
    public final String getPolicyType() {
        return this.policyType;
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
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
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
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigBean getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.px.hashCode();
        int iHashCode2 = this.side.hashCode();
        int iHashCode3 = this.instId.hashCode();
        int iHashCode4 = this.bizType.hashCode();
        int iHashCode5 = this.instType.hashCode();
        int iHashCode6 = this.bsType.hashCode();
        int iHashCode7 = this.ordType.hashCode();
        int iHashCode8 = this.posSide.hashCode();
        int iHashCode9 = this.from.hashCode();
        int iHashCode10 = this.sz.hashCode();
        int iHashCode11 = this.triggerPx.hashCode();
        int iHashCode12 = this.triggerPxType.hashCode();
        int iHashCode13 = this.ordPx.hashCode();
        List<AttachAlgoOrder> list = this.attachAlgoOrds;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        int iHashCode15 = this.level.hashCode();
        int iHashCode16 = this.ccy.hashCode();
        int iHashCode17 = this.policyType.hashCode();
        int iHashCode18 = this.type.hashCode();
        UploadSettingConfigBean uploadSettingConfigBean = this.value;
        int iHashCode19 = uploadSettingConfigBean == null ? 0 : uploadSettingConfigBean.hashCode();
        String str = this.advanceOrdType;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdvanceOrdType(String str) {
        this.advanceOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(List<AttachAlgoOrder> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bsType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
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
    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.level = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPolicyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.policyType = str;
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
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalCloneInfo(px=" + this.px + ", side=" + this.side + ", instId=" + this.instId + ", bizType=" + this.bizType + ", instType=" + this.instType + ", bsType=" + this.bsType + ", ordType=" + this.ordType + ", posSide=" + this.posSide + ", from=" + this.from + ", sz=" + this.sz + ", triggerPx=" + this.triggerPx + ", triggerPxType=" + this.triggerPxType + ", ordPx=" + this.ordPx + ", attachAlgoOrds=" + this.attachAlgoOrds + ", level=" + this.level + ", ccy=" + this.ccy + ", policyType=" + this.policyType + ", type=" + this.type + ", value=" + this.value + ", advanceOrdType=" + this.advanceOrdType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.px);
        parcel.writeString(this.side);
        parcel.writeString(this.instId);
        parcel.writeString(this.bizType);
        parcel.writeString(this.instType);
        parcel.writeString(this.bsType);
        parcel.writeString(this.ordType);
        parcel.writeString(this.posSide);
        parcel.writeString(this.from);
        parcel.writeString(this.sz);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.ordPx);
        List<AttachAlgoOrder> list = this.attachAlgoOrds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AttachAlgoOrder> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.level);
        parcel.writeString(this.ccy);
        parcel.writeString(this.policyType);
        parcel.writeString(this.type);
        UploadSettingConfigBean uploadSettingConfigBean = this.value;
        if (uploadSettingConfigBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uploadSettingConfigBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.advanceOrdType);
    }

    public SignalCloneInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, List<AttachAlgoOrder> list, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, UploadSettingConfigBean uploadSettingConfigBean, String str18) {
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
        this.px = str;
        this.side = str2;
        this.instId = str3;
        this.bizType = str4;
        this.instType = str5;
        this.bsType = str6;
        this.ordType = str7;
        this.posSide = str8;
        this.from = str9;
        this.sz = str10;
        this.triggerPx = str11;
        this.triggerPxType = str12;
        this.ordPx = str13;
        this.attachAlgoOrds = list;
        this.level = str14;
        this.ccy = str15;
        this.policyType = str16;
        this.type = str17;
        this.value = uploadSettingConfigBean;
        this.advanceOrdType = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006c: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r36v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r43v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r43v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("0") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r43v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.UploadSettingConfigBean:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.UploadSettingConfigBean) : (r41v0 com.okinc.unify_trade.biz.UploadSettingConfigBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r43v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r42v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.UploadSettingConfigBean, java.lang.String):void (m)] (LINE:4622) call: com.okinc.unify_trade.biz.SignalCloneInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.UploadSettingConfigBean, java.lang.String):void type: THIS */
    public /* synthetic */ SignalCloneInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, String str16, String str17, UploadSettingConfigBean uploadSettingConfigBean, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "0" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? null : uploadSettingConfigBean, (i & 524288) == 0 ? str18 : null);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalCloneInfo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
