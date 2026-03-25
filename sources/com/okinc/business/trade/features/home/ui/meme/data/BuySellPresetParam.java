package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23313hvq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class BuySellPresetParam implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BuySellPresetParam> CREATOR = new Creator();
    private String dynamicMaxSlippageValue;
    private int feeLevel;
    private String feeValue;
    private int routerModeType;
    private Integer slippageLevel;
    private int slippageType;
    private String slippageValue;

    public static final class Creator implements Parcelable.Creator<BuySellPresetParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellPresetParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellPresetParam(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellPresetParam[] newArray(int i) {
            return new BuySellPresetParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellPresetParam() {
        this(0, null, 0, null, null, 0, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellPresetParam copy$default(BuySellPresetParam buySellPresetParam, int i, String str, int i2, Integer num, String str2, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = buySellPresetParam.feeLevel;
        }
        if ((i4 & 2) != 0) {
            str = buySellPresetParam.feeValue;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            i2 = buySellPresetParam.routerModeType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            num = buySellPresetParam.slippageLevel;
        }
        Integer num2 = num;
        if ((i4 & 16) != 0) {
            str2 = buySellPresetParam.slippageValue;
        }
        String str5 = str2;
        if ((i4 & 32) != 0) {
            i3 = buySellPresetParam.slippageType;
        }
        int i6 = i3;
        if ((i4 & 64) != 0) {
            str3 = buySellPresetParam.dynamicMaxSlippageValue;
        }
        return buySellPresetParam.copy(i, str4, i5, num2, str5, i6, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPresetParam copy(int i, @NotNull String str, int i2, Integer num, @NotNull String str2, int i3, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BuySellPresetParam(i, str, i2, num, str2, i3, str3);
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
        if (!(obj instanceof BuySellPresetParam)) {
            return false;
        }
        BuySellPresetParam buySellPresetParam = (BuySellPresetParam) obj;
        return this.feeLevel == buySellPresetParam.feeLevel && Intrinsics.EZpvd((Object) this.feeValue, (Object) buySellPresetParam.feeValue) && this.routerModeType == buySellPresetParam.routerModeType && Intrinsics.EZpvd(this.slippageLevel, buySellPresetParam.slippageLevel) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) buySellPresetParam.slippageValue) && this.slippageType == buySellPresetParam.slippageType && Intrinsics.EZpvd((Object) this.dynamicMaxSlippageValue, (Object) buySellPresetParam.dynamicMaxSlippageValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMaxSlippageValue() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeLevel() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSlippageLevel() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.feeLevel);
        int iHashCode2 = this.feeValue.hashCode();
        int iHashCode3 = Integer.hashCode(this.routerModeType);
        Integer num = this.slippageLevel;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.slippageValue.hashCode()) * 31) + Integer.hashCode(this.slippageType)) * 31) + this.dynamicMaxSlippageValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDynamicMaxSlippageValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dynamicMaxSlippageValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeLevel(int i) {
        this.feeLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRouterModeType(int i) {
        this.routerModeType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageLevel(Integer num) {
        this.slippageLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(int i) {
        this.slippageType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippageValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellPresetParam(feeLevel=" + this.feeLevel + ", feeValue=" + this.feeValue + ", routerModeType=" + this.routerModeType + ", slippageLevel=" + this.slippageLevel + ", slippageValue=" + this.slippageValue + ", slippageType=" + this.slippageType + ", dynamicMaxSlippageValue=" + this.dynamicMaxSlippageValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.feeLevel);
        parcel.writeString(this.feeValue);
        parcel.writeInt(this.routerModeType);
        Integer num = this.slippageLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.slippageValue);
        parcel.writeInt(this.slippageType);
        parcel.writeString(this.dynamicMaxSlippageValue);
    }

    public BuySellPresetParam(int i, @NotNull String str, int i2, Integer num, @NotNull String str2, int i3, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.feeLevel = i;
        this.feeValue = str;
        this.routerModeType = i2;
        this.slippageLevel = num;
        this.slippageValue = str2;
        this.slippageType = i3;
        this.dynamicMaxSlippageValue = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.Integer:0x001d: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String):void (m)] (LINE:68) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam.<init>(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ BuySellPresetParam(int i, String str, int i2, Integer num, String str2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? "" : str2, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? "" : str3);
    }

    public final boolean isInvalid(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return isDynamicSlippageInvalid(str, str2) || isFixedSlippageInvalid(str3, str4) || isFeeValueInvalid(str5, str6);
    }

    private final boolean isDynamicSlippageInvalid(String str, String str2) {
        if (this.slippageType == SlippageMode.Dynamic.getType()) {
            return (C23313hvq.OLrzqt(this.dynamicMaxSlippageValue, 0) && C23313hvq.KWHzl(this.dynamicMaxSlippageValue, str)) || C23313hvq.OLrzqt(this.dynamicMaxSlippageValue, str2);
        }
        return false;
    }

    private final boolean isFixedSlippageInvalid(String str, String str2) {
        return this.slippageType == SlippageMode.Fixed.getType() && (C23313hvq.KWHzl(this.slippageValue, str) || C23313hvq.OLrzqt(this.slippageValue, str2));
    }

    private final boolean isFeeValueInvalid(String str, String str2) {
        if (this.feeLevel != PriorityFeeType.PriorityCustom.getValue()) {
            return false;
        }
        return StringsKt__StringsKt.fARcdN((CharSequence) this.feeValue) || C23313hvq.KWHzl(this.feeValue, str2) || C23313hvq.OLrzqt(this.feeValue, str);
    }
}
