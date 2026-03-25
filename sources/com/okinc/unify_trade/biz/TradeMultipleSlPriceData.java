package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeMultipleSlPriceData implements Parcelable {
    public static final String AMEND_PX_ON_TRIGGER_TYPE_NORMAL = "0";
    public static final String AMEND_PX_ON_TRIGGER_TYPE_OPEN_PRICE = "1";
    private String amendPxOnTriggerType;
    private final String direction;
    private String failCode;
    private String failReason;
    private Boolean isSlLimitCbChecked;
    private String slOrdPx;
    private String slPnl;
    private String slPnlRate;
    private String slTriggerPx;
    private InputSelectData slTriggerType;
    private final int type;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeMultipleSlPriceData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeMultipleSlPriceData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipleSlPriceData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            InputSelectData inputSelectDataCreateFromParcel = parcel.readInt() == 0 ? null : InputSelectData.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            int i = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeMultipleSlPriceData(string, string2, string3, string4, inputSelectDataCreateFromParcel, string5, i, string6, string7, string8, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipleSlPriceData[] newArray(int i) {
            return new TradeMultipleSlPriceData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeMultipleSlPriceData() {
        this(null, null, null, null, null, null, 0, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isSlLimitCbChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputSelectData component5() {
        return this.slTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMultipleSlPriceData copy(@NotNull String str, @NotNull String str2, String str3, String str4, InputSelectData inputSelectData, String str5, int i, @NotNull String str6, String str7, String str8, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TradeMultipleSlPriceData(str, str2, str3, str4, inputSelectData, str5, i, str6, str7, str8, bool);
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
        if (!(obj instanceof TradeMultipleSlPriceData)) {
            return false;
        }
        TradeMultipleSlPriceData tradeMultipleSlPriceData = (TradeMultipleSlPriceData) obj;
        return Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tradeMultipleSlPriceData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) tradeMultipleSlPriceData.slOrdPx) && Intrinsics.EZpvd((Object) this.slPnlRate, (Object) tradeMultipleSlPriceData.slPnlRate) && Intrinsics.EZpvd((Object) this.slPnl, (Object) tradeMultipleSlPriceData.slPnl) && Intrinsics.EZpvd(this.slTriggerType, tradeMultipleSlPriceData.slTriggerType) && Intrinsics.EZpvd((Object) this.direction, (Object) tradeMultipleSlPriceData.direction) && this.type == tradeMultipleSlPriceData.type && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) tradeMultipleSlPriceData.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.failCode, (Object) tradeMultipleSlPriceData.failCode) && Intrinsics.EZpvd((Object) this.failReason, (Object) tradeMultipleSlPriceData.failReason) && Intrinsics.EZpvd(this.isSlLimitCbChecked, tradeMultipleSlPriceData.isSlLimitCbChecked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCode() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPnl() {
        return this.slPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPnlRate() {
        return this.slPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputSelectData getSlTriggerType() {
        return this.slTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.slTriggerPx.hashCode();
        int iHashCode2 = this.slOrdPx.hashCode();
        String str = this.slPnlRate;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.slPnl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        InputSelectData inputSelectData = this.slTriggerType;
        int iHashCode5 = inputSelectData == null ? 0 : inputSelectData.hashCode();
        String str3 = this.direction;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = Integer.hashCode(this.type);
        int iHashCode8 = this.amendPxOnTriggerType.hashCode();
        String str4 = this.failCode;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.failReason;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.isSlLimitCbChecked;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSlLimitCbChecked() {
        return this.isSlLimitCbChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCode(String str) {
        this.failCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(String str) {
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlLimitCbChecked(Boolean bool) {
        this.isSlLimitCbChecked = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPnl(String str) {
        this.slPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPnlRate(String str) {
        this.slPnlRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerType(InputSelectData inputSelectData) {
        this.slTriggerType = inputSelectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeMultipleSlPriceData(slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", slPnlRate=" + this.slPnlRate + ", slPnl=" + this.slPnl + ", slTriggerType=" + this.slTriggerType + ", direction=" + this.direction + ", type=" + this.type + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", failCode=" + this.failCode + ", failReason=" + this.failReason + ", isSlLimitCbChecked=" + this.isSlLimitCbChecked + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.slPnlRate);
        parcel.writeString(this.slPnl);
        InputSelectData inputSelectData = this.slTriggerType;
        if (inputSelectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.direction);
        parcel.writeInt(this.type);
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.failCode);
        parcel.writeString(this.failReason);
        Boolean bool = this.isSlLimitCbChecked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public TradeMultipleSlPriceData(@NotNull String str, @NotNull String str2, String str3, String str4, InputSelectData inputSelectData, String str5, int i, @NotNull String str6, String str7, String str8, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.slTriggerPx = str;
        this.slOrdPx = str2;
        this.slPnlRate = str3;
        this.slPnl = str4;
        this.slTriggerType = inputSelectData;
        this.direction = str5;
        this.type = i;
        this.amendPxOnTriggerType = str6;
        this.failCode = str7;
        this.failReason = str8;
        this.isSlLimitCbChecked = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.InputSelectData:?: TERNARY null = ((wrap:int:0x0022: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.InputSelectData) : (r17v0 com.okinc.unify_trade.biz.InputSelectData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.InputSelectData, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.unify_trade.biz.TradeMultipleSlPriceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.InputSelectData, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeMultipleSlPriceData(String str, String str2, String str3, String str4, InputSelectData inputSelectData, String str5, int i, String str6, String str7, String str8, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : inputSelectData, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "0" : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) == 0 ? str8 : null, (i2 & 1024) != 0 ? Boolean.FALSE : bool);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeMultipleSlPriceData.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final boolean isOpenPriceSl() {
        return Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) "1");
    }

    public final boolean isValid() {
        int i = this.type;
        if (i == 0) {
            return C33129mqd.OLrzqt((CharSequence) this.slTriggerPx) && C33129mqd.OLrzqt((CharSequence) this.slOrdPx);
        }
        if (i == 1) {
            return C33129mqd.OLrzqt((CharSequence) this.slPnlRate);
        }
        if (i != 2) {
            return true;
        }
        return C33129mqd.OLrzqt((CharSequence) this.slPnl);
    }
}
