package com.okinc.business.invest_biz.ui.screens.network_fee.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.DisplayText$$serializer;
import com.okinc.business.invest_biz.data.bean.NetworkGear;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C27569jxf;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestNetworkFeeItem implements Parcelable {
    private final String calculateGasPrice;
    private final String customGasPrice;
    private final String estimatedTime;
    private final String gasPrice;
    private final String gasPriceUnit;
    private final int iconRes;
    private final boolean isCustom;
    private final boolean isExpand;
    private final String maxGasPrice;
    private final String minGasPrice;
    private final String priorityFee;
    private final boolean selected;
    private final DisplayText title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestNetworkFeeItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestNetworkFeeItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestNetworkFeeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestNetworkFeeItem(DisplayText.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestNetworkFeeItem[] newArray(int i) {
            return new InvestNetworkFeeItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestNetworkFeeItem() {
        this((DisplayText) null, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.customGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.calculateGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestNetworkFeeItem copy(@NotNull DisplayText displayText, @DrawableRes int i, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, boolean z3, String str8) {
        Intrinsics.checkNotNullParameter(displayText, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InvestNetworkFeeItem(displayText, i, z, str, str2, str3, str4, str5, str6, str7, z2, z3, str8);
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
        if (!(obj instanceof InvestNetworkFeeItem)) {
            return false;
        }
        InvestNetworkFeeItem investNetworkFeeItem = (InvestNetworkFeeItem) obj;
        return Intrinsics.EZpvd(this.title, investNetworkFeeItem.title) && this.iconRes == investNetworkFeeItem.iconRes && this.isCustom == investNetworkFeeItem.isCustom && Intrinsics.EZpvd((Object) this.calculateGasPrice, (Object) investNetworkFeeItem.calculateGasPrice) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) investNetworkFeeItem.estimatedTime) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) investNetworkFeeItem.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) investNetworkFeeItem.priorityFee) && Intrinsics.EZpvd((Object) this.gasPriceUnit, (Object) investNetworkFeeItem.gasPriceUnit) && Intrinsics.EZpvd((Object) this.minGasPrice, (Object) investNetworkFeeItem.minGasPrice) && Intrinsics.EZpvd((Object) this.maxGasPrice, (Object) investNetworkFeeItem.maxGasPrice) && this.isExpand == investNetworkFeeItem.isExpand && this.selected == investNetworkFeeItem.selected && Intrinsics.EZpvd((Object) this.customGasPrice, (Object) investNetworkFeeItem.customGasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalculateGasPrice() {
        return this.calculateGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomGasPrice() {
        return this.customGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnit() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasPrice() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = Integer.hashCode(this.iconRes);
        int iHashCode3 = Boolean.hashCode(this.isCustom);
        int iHashCode4 = this.calculateGasPrice.hashCode();
        int iHashCode5 = this.estimatedTime.hashCode();
        int iHashCode6 = this.gasPrice.hashCode();
        int iHashCode7 = this.priorityFee.hashCode();
        int iHashCode8 = this.gasPriceUnit.hashCode();
        int iHashCode9 = this.minGasPrice.hashCode();
        int iHashCode10 = this.maxGasPrice.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isExpand);
        int iHashCode12 = Boolean.hashCode(this.selected);
        String str = this.customGasPrice;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustom() {
        return this.isCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpand() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestNetworkFeeItem(title=" + this.title + ", iconRes=" + this.iconRes + ", isCustom=" + this.isCustom + ", calculateGasPrice=" + this.calculateGasPrice + ", estimatedTime=" + this.estimatedTime + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", gasPriceUnit=" + this.gasPriceUnit + ", minGasPrice=" + this.minGasPrice + ", maxGasPrice=" + this.maxGasPrice + ", isExpand=" + this.isExpand + ", selected=" + this.selected + ", customGasPrice=" + this.customGasPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.title.writeToParcel(parcel, i);
        parcel.writeInt(this.iconRes);
        parcel.writeInt(this.isCustom ? 1 : 0);
        parcel.writeString(this.calculateGasPrice);
        parcel.writeString(this.estimatedTime);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.gasPriceUnit);
        parcel.writeString(this.minGasPrice);
        parcel.writeString(this.maxGasPrice);
        parcel.writeInt(this.isExpand ? 1 : 0);
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeString(this.customGasPrice);
    }

    public /* synthetic */ InvestNetworkFeeItem(int i, DisplayText displayText, int i2, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? DisplayText.Companion.OLrzqt("Default") : displayText;
        if ((i & 2) == 0) {
            this.iconRes = 0;
        } else {
            this.iconRes = i2;
        }
        if ((i & 4) == 0) {
            this.isCustom = false;
        } else {
            this.isCustom = z;
        }
        if ((i & 8) == 0) {
            this.calculateGasPrice = "";
        } else {
            this.calculateGasPrice = str;
        }
        if ((i & 16) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str2;
        }
        if ((i & 32) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str3;
        }
        if ((i & 64) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str4;
        }
        if ((i & 128) == 0) {
            this.gasPriceUnit = "";
        } else {
            this.gasPriceUnit = str5;
        }
        if ((i & 256) == 0) {
            this.minGasPrice = "";
        } else {
            this.minGasPrice = str6;
        }
        if ((i & 512) == 0) {
            this.maxGasPrice = "";
        } else {
            this.maxGasPrice = str7;
        }
        if ((i & 1024) == 0) {
            this.isExpand = false;
        } else {
            this.isExpand = z2;
        }
        if ((i & 2048) == 0) {
            this.selected = false;
        } else {
            this.selected = z3;
        }
        if ((i & 4096) == 0) {
            this.customGasPrice = null;
        } else {
            this.customGasPrice = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestNetworkFeeItem investNetworkFeeItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investNetworkFeeItem.title, DisplayText.Companion.OLrzqt("Default"))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DisplayText$$serializer.INSTANCE, investNetworkFeeItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investNetworkFeeItem.iconRes != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, investNetworkFeeItem.iconRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investNetworkFeeItem.isCustom) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, investNetworkFeeItem.isCustom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.calculateGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investNetworkFeeItem.calculateGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investNetworkFeeItem.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investNetworkFeeItem.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investNetworkFeeItem.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.gasPriceUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investNetworkFeeItem.gasPriceUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.minGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investNetworkFeeItem.minGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investNetworkFeeItem.maxGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investNetworkFeeItem.maxGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investNetworkFeeItem.isExpand) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, investNetworkFeeItem.isExpand);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investNetworkFeeItem.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, investNetworkFeeItem.selected);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && investNetworkFeeItem.customGasPrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investNetworkFeeItem.customGasPrice);
    }

    public InvestNetworkFeeItem(@NotNull DisplayText displayText, @DrawableRes int i, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, boolean z3, String str8) {
        Intrinsics.checkNotNullParameter(displayText, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.title = displayText;
        this.iconRes = i;
        this.isCustom = z;
        this.calculateGasPrice = str;
        this.estimatedTime = str2;
        this.gasPrice = str3;
        this.priorityFee = str4;
        this.gasPriceUnit = str5;
        this.minGasPrice = str6;
        this.maxGasPrice = str7;
        this.isExpand = z2;
        this.selected = z3;
        this.customGasPrice = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008c: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.DisplayText:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE 
  (wrap:com.okinc.business.invest_biz.data.bean.DisplayText$Companion:0x0006: SGET  A[WRAPPED] (LINE:18) com.okinc.business.invest_biz.data.bean.DisplayText.Companion com.okinc.business.invest_biz.data.bean.DisplayText$Companion)
  ("Default")
 VIRTUAL call: com.okinc.business.invest_biz.data.bean.DisplayText.Companion.OLrzqt(java.lang.String):com.okinc.business.invest_biz.data.bean.DisplayText A[MD:(java.lang.String):com.okinc.business.invest_biz.data.bean.DisplayText (m), WRAPPED] (LINE:18)) : (r15v0 com.okinc.business.invest_biz.data.bean.DisplayText))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.bean.DisplayText, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:17) call: com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem.<init>(com.okinc.business.invest_biz.data.bean.DisplayText, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ InvestNetworkFeeItem(DisplayText displayText, int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DisplayText.Companion.OLrzqt("Default") : displayText, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "", (i2 & 1024) != 0 ? false : z2, (i2 & 2048) == 0 ? z3 : false, (i2 & 4096) != 0 ? null : str8);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestNetworkFeeItem> serializer() {
            return InvestNetworkFeeItem$$serializer.INSTANCE;
        }

        public static /* synthetic */ InvestNetworkFeeItem mapFromNetworkGear$default(Companion companion, int i, NetworkGear networkGear, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            return companion.copydefault(i, networkGear, z, z2);
        }

        public final InvestNetworkFeeItem copydefault(int i, @NotNull NetworkGear networkGear, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(networkGear, "");
            return new InvestNetworkFeeItem(DisplayText.Companion.fromStringResource$default(DisplayText.Companion, i, null, 2, null), C27569jxf.OLrzqt.copydefault(i), z, networkGear.getCalculateGasPrice(), networkGear.getEstimatedTime(), networkGear.getGasPrice(), networkGear.getPriorityFee(), (String) null, (String) null, (String) null, false, z2, (String) null, 6016, (DefaultConstructorMarker) null);
        }
    }

    public final boolean isCustomGasPriceOK() {
        return !this.isCustom || (C33129mqd.valueOf(this.gasPrice, this.maxGasPrice) && C33129mqd.copydefault(this.gasPrice, this.minGasPrice));
    }
}
