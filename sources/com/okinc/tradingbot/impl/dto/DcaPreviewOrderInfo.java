package com.okinc.tradingbot.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DcaPreviewOrderInfo implements Parcelable {
    public static final int $stable = 0;
    public final String actualLever;
    public final String amount;
    public final String avgCost;
    public final String displayName;
    public final String liqPx;
    public final String price;
    public final String priceDeviation;
    public final String takeProfitPct;
    public final String takeProfitPrice;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DcaPreviewOrderInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DcaPreviewOrderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaPreviewOrderInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaPreviewOrderInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaPreviewOrderInfo[] newArray(int i) {
            return new DcaPreviewOrderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaPreviewOrderInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.takeProfitPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.takeProfitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.avgCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewOrderInfo copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new DcaPreviewOrderInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.displayName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcaPreviewOrderInfo)) {
            return false;
        }
        DcaPreviewOrderInfo dcaPreviewOrderInfo = (DcaPreviewOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.displayName, (Object) dcaPreviewOrderInfo.displayName) && Intrinsics.EZpvd((Object) this.amount, (Object) dcaPreviewOrderInfo.amount) && Intrinsics.EZpvd((Object) this.price, (Object) dcaPreviewOrderInfo.price) && Intrinsics.EZpvd((Object) this.priceDeviation, (Object) dcaPreviewOrderInfo.priceDeviation) && Intrinsics.EZpvd((Object) this.avgCost, (Object) dcaPreviewOrderInfo.avgCost) && Intrinsics.EZpvd((Object) this.liqPx, (Object) dcaPreviewOrderInfo.liqPx) && Intrinsics.EZpvd((Object) this.actualLever, (Object) dcaPreviewOrderInfo.actualLever) && Intrinsics.EZpvd((Object) this.takeProfitPct, (Object) dcaPreviewOrderInfo.takeProfitPct) && Intrinsics.EZpvd((Object) this.takeProfitPrice, (Object) dcaPreviewOrderInfo.takeProfitPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.displayName.hashCode() * 31) + this.amount.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceDeviation.hashCode()) * 31) + this.avgCost.hashCode()) * 31) + this.liqPx.hashCode()) * 31) + this.actualLever.hashCode()) * 31) + this.takeProfitPct.hashCode()) * 31) + this.takeProfitPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaPreviewOrderInfo(displayName=" + this.displayName + ", amount=" + this.amount + ", price=" + this.price + ", priceDeviation=" + this.priceDeviation + ", avgCost=" + this.avgCost + ", liqPx=" + this.liqPx + ", actualLever=" + this.actualLever + ", takeProfitPct=" + this.takeProfitPct + ", takeProfitPrice=" + this.takeProfitPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.priceDeviation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.displayName);
        parcel.writeString(this.amount);
        parcel.writeString(this.price);
        parcel.writeString(this.priceDeviation);
        parcel.writeString(this.avgCost);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.actualLever);
        parcel.writeString(this.takeProfitPct);
        parcel.writeString(this.takeProfitPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaPreviewOrderInfo> serializer() {
            return DcaPreviewOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaPreviewOrderInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str;
        }
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.priceDeviation = "";
        } else {
            this.priceDeviation = str4;
        }
        if ((i & 16) == 0) {
            this.avgCost = "";
        } else {
            this.avgCost = str5;
        }
        if ((i & 32) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str6;
        }
        if ((i & 64) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str7;
        }
        if ((i & 128) == 0) {
            this.takeProfitPct = "";
        } else {
            this.takeProfitPct = str8;
        }
        if ((i & 256) == 0) {
            this.takeProfitPrice = "";
        } else {
            this.takeProfitPrice = str9;
        }
    }

    public static final /* synthetic */ void AEQbTJ(DcaPreviewOrderInfo dcaPreviewOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dcaPreviewOrderInfo.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dcaPreviewOrderInfo.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dcaPreviewOrderInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.priceDeviation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dcaPreviewOrderInfo.priceDeviation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.avgCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dcaPreviewOrderInfo.avgCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dcaPreviewOrderInfo.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dcaPreviewOrderInfo.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.takeProfitPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dcaPreviewOrderInfo.takeProfitPct);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) dcaPreviewOrderInfo.takeProfitPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dcaPreviewOrderInfo.takeProfitPrice);
    }

    public DcaPreviewOrderInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.displayName = str;
        this.amount = str2;
        this.price = str3;
        this.priceDeviation = str4;
        this.avgCost = str5;
        this.liqPx = str6;
        this.actualLever = str7;
        this.takeProfitPct = str8;
        this.takeProfitPrice = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcaPreviewOrderInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
