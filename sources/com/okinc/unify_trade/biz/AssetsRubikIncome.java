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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AssetsRubikIncome implements Parcelable {
    private String calcTime;
    private String coinFullName;
    private String coinIcon;
    private String coinName;
    private String holdingPer;
    private String holdingQuantity;
    private String holdingValue;
    private String pnlPer;
    private String pnlValue;
    private String unitCost;
    private String unitPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetsRubikIncome> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AssetsRubikIncome> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsRubikIncome createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetsRubikIncome(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsRubikIncome[] newArray(int i) {
            return new AssetsRubikIncome[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsRubikIncome() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalcTime() {
        return this.calcTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinFullName() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingPer() {
        return this.holdingPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingQuantity() {
        return this.holdingQuantity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingValue() {
        return this.holdingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlPer() {
        return this.pnlPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlValue() {
        return this.pnlValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitCost() {
        return this.unitCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitPrice() {
        return this.unitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalcTime(String str) {
        this.calcTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingPer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.holdingPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingQuantity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.holdingQuantity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.holdingValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlPer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unitCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinIcon);
        parcel.writeString(this.coinName);
        parcel.writeString(this.coinFullName);
        parcel.writeString(this.holdingQuantity);
        parcel.writeString(this.holdingValue);
        parcel.writeString(this.holdingPer);
        parcel.writeString(this.unitPrice);
        parcel.writeString(this.unitCost);
        parcel.writeString(this.pnlValue);
        parcel.writeString(this.pnlPer);
        parcel.writeString(this.calcTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AssetsRubikIncome.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetsRubikIncome> serializer() {
            return AssetsRubikIncome$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetsRubikIncome(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinIcon = "";
        } else {
            this.coinIcon = str;
        }
        if ((i & 2) == 0) {
            this.coinName = "";
        } else {
            this.coinName = str2;
        }
        if ((i & 4) == 0) {
            this.coinFullName = "";
        } else {
            this.coinFullName = str3;
        }
        if ((i & 8) == 0) {
            this.holdingQuantity = "";
        } else {
            this.holdingQuantity = str4;
        }
        if ((i & 16) == 0) {
            this.holdingValue = "";
        } else {
            this.holdingValue = str5;
        }
        if ((i & 32) == 0) {
            this.holdingPer = "";
        } else {
            this.holdingPer = str6;
        }
        if ((i & 64) == 0) {
            this.unitPrice = "";
        } else {
            this.unitPrice = str7;
        }
        if ((i & 128) == 0) {
            this.unitCost = "";
        } else {
            this.unitCost = str8;
        }
        if ((i & 256) == 0) {
            this.pnlValue = "";
        } else {
            this.pnlValue = str9;
        }
        if ((i & 512) == 0) {
            this.pnlPer = "";
        } else {
            this.pnlPer = str10;
        }
        if ((i & 1024) == 0) {
            this.calcTime = null;
        } else {
            this.calcTime = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AssetsRubikIncome assetsRubikIncome, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetsRubikIncome.coinIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetsRubikIncome.coinIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetsRubikIncome.coinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetsRubikIncome.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetsRubikIncome.coinFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, assetsRubikIncome.coinFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) assetsRubikIncome.holdingQuantity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, assetsRubikIncome.holdingQuantity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetsRubikIncome.holdingValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, assetsRubikIncome.holdingValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) assetsRubikIncome.holdingPer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, assetsRubikIncome.holdingPer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) assetsRubikIncome.unitPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, assetsRubikIncome.unitPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) assetsRubikIncome.unitCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, assetsRubikIncome.unitCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) assetsRubikIncome.pnlValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, assetsRubikIncome.pnlValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) assetsRubikIncome.pnlPer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, assetsRubikIncome.pnlPer);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && assetsRubikIncome.calcTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, assetsRubikIncome.calcTime);
    }

    public AssetsRubikIncome(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11) {
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
        this.coinIcon = str;
        this.coinName = str2;
        this.coinFullName = str3;
        this.holdingQuantity = str4;
        this.holdingValue = str5;
        this.holdingPer = str6;
        this.unitPrice = str7;
        this.unitCost = str8;
        this.pnlValue = str9;
        this.pnlPer = str10;
        this.calcTime = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.AssetsRubikIncome.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetsRubikIncome(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? null : str11);
    }
}
