package com.okinc.buysell.ui.paymentmethod.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class BuySellParameter implements Parcelable {
    public static final int $stable = 0;
    public final String baseAmount;
    public final String baseCurrency;
    public final String paymentCurrency;
    public final String quoteAmount;
    public final String quoteCurrency;
    public final Integer standard;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BuySellParameter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BuySellParameter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellParameter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellParameter[] newArray(int i) {
            return new BuySellParameter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellParameter() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellParameter copy$default(BuySellParameter buySellParameter, String str, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buySellParameter.baseCurrency;
        }
        if ((i & 2) != 0) {
            str2 = buySellParameter.quoteCurrency;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = buySellParameter.baseAmount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = buySellParameter.quoteAmount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = buySellParameter.paymentCurrency;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            num = buySellParameter.standard;
        }
        return buySellParameter.copydefault(str, str6, str7, str8, str9, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.standard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellParameter copydefault(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new BuySellParameter(str, str2, str3, str4, str5, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.baseAmount;
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
        if (!(obj instanceof BuySellParameter)) {
            return false;
        }
        BuySellParameter buySellParameter = (BuySellParameter) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) buySellParameter.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) buySellParameter.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) buySellParameter.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) buySellParameter.quoteAmount) && Intrinsics.EZpvd((Object) this.paymentCurrency, (Object) buySellParameter.paymentCurrency) && Intrinsics.EZpvd(this.standard, buySellParameter.standard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteCurrency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.baseAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.quoteAmount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.paymentCurrency;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.standard;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellParameter(baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", paymentCurrency=" + this.paymentCurrency + ", standard=" + this.standard + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.paymentCurrency);
        Integer num = this.standard;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.paymentmethod.data.BuySellParameter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuySellParameter> serializer() {
            return BuySellParameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuySellParameter(int i, String str, String str2, String str3, String str4, String str5, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCurrency = null;
        } else {
            this.baseCurrency = str;
        }
        if ((i & 2) == 0) {
            this.quoteCurrency = null;
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = null;
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = null;
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 16) == 0) {
            this.paymentCurrency = null;
        } else {
            this.paymentCurrency = str5;
        }
        if ((i & 32) == 0) {
            this.standard = null;
        } else {
            this.standard = num;
        }
    }

    public static final /* synthetic */ void EZpvd(BuySellParameter buySellParameter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buySellParameter.baseCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, buySellParameter.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buySellParameter.quoteCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buySellParameter.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || buySellParameter.baseAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, buySellParameter.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || buySellParameter.quoteAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, buySellParameter.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || buySellParameter.paymentCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, buySellParameter.paymentCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && buySellParameter.standard == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, buySellParameter.standard);
    }

    public BuySellParameter(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.baseCurrency = str;
        this.quoteCurrency = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
        this.paymentCurrency = str5;
        this.standard = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:53) call: com.okinc.buysell.ui.paymentmethod.data.BuySellParameter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ BuySellParameter(String str, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num);
    }
}
