package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SupportCurrencyInfo implements Parcelable {
    public static final int $stable = 0;
    private final String peggedCurrency;
    private final int peggedCurrencyScale;
    private final String peggedCurrencySymbol;
    private final boolean peggedCurrencyTradeable;
    private final String pricingType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportCurrencyInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SupportCurrencyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrencyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportCurrencyInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrencyInfo[] newArray(int i) {
            return new SupportCurrencyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrencyInfo() {
        this((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportCurrencyInfo copy$default(SupportCurrencyInfo supportCurrencyInfo, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportCurrencyInfo.pricingType;
        }
        if ((i2 & 2) != 0) {
            str2 = supportCurrencyInfo.peggedCurrency;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = supportCurrencyInfo.peggedCurrencySymbol;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = supportCurrencyInfo.peggedCurrencyScale;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = supportCurrencyInfo.peggedCurrencyTradeable;
        }
        return supportCurrencyInfo.copy(str, str4, str5, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pricingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.peggedCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.peggedCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.peggedCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.peggedCurrencyTradeable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportCurrencyInfo(str, str2, str3, i, z);
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
        if (!(obj instanceof SupportCurrencyInfo)) {
            return false;
        }
        SupportCurrencyInfo supportCurrencyInfo = (SupportCurrencyInfo) obj;
        return Intrinsics.EZpvd((Object) this.pricingType, (Object) supportCurrencyInfo.pricingType) && Intrinsics.EZpvd((Object) this.peggedCurrency, (Object) supportCurrencyInfo.peggedCurrency) && Intrinsics.EZpvd((Object) this.peggedCurrencySymbol, (Object) supportCurrencyInfo.peggedCurrencySymbol) && this.peggedCurrencyScale == supportCurrencyInfo.peggedCurrencyScale && this.peggedCurrencyTradeable == supportCurrencyInfo.peggedCurrencyTradeable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeggedCurrency() {
        return this.peggedCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPeggedCurrencyScale() {
        return this.peggedCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeggedCurrencySymbol() {
        return this.peggedCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPeggedCurrencyTradeable() {
        return this.peggedCurrencyTradeable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPricingType() {
        return this.pricingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.pricingType.hashCode() * 31) + this.peggedCurrency.hashCode()) * 31) + this.peggedCurrencySymbol.hashCode()) * 31) + Integer.hashCode(this.peggedCurrencyScale)) * 31) + Boolean.hashCode(this.peggedCurrencyTradeable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCurrencyInfo(pricingType=" + this.pricingType + ", peggedCurrency=" + this.peggedCurrency + ", peggedCurrencySymbol=" + this.peggedCurrencySymbol + ", peggedCurrencyScale=" + this.peggedCurrencyScale + ", peggedCurrencyTradeable=" + this.peggedCurrencyTradeable + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pricingType);
        parcel.writeString(this.peggedCurrency);
        parcel.writeString(this.peggedCurrencySymbol);
        parcel.writeInt(this.peggedCurrencyScale);
        parcel.writeInt(this.peggedCurrencyTradeable ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportCurrencyInfo> serializer() {
            return SupportCurrencyInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportCurrencyInfo(int i, String str, String str2, String str3, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pricingType = "";
        } else {
            this.pricingType = str;
        }
        if ((i & 2) == 0) {
            this.peggedCurrency = "";
        } else {
            this.peggedCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.peggedCurrencySymbol = "$";
        } else {
            this.peggedCurrencySymbol = str3;
        }
        if ((i & 8) == 0) {
            this.peggedCurrencyScale = 2;
        } else {
            this.peggedCurrencyScale = i2;
        }
        if ((i & 16) == 0) {
            this.peggedCurrencyTradeable = false;
        } else {
            this.peggedCurrencyTradeable = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SupportCurrencyInfo supportCurrencyInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportCurrencyInfo.pricingType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportCurrencyInfo.pricingType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) supportCurrencyInfo.peggedCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, supportCurrencyInfo.peggedCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) supportCurrencyInfo.peggedCurrencySymbol, (Object) "$")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, supportCurrencyInfo.peggedCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportCurrencyInfo.peggedCurrencyScale != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, supportCurrencyInfo.peggedCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportCurrencyInfo.peggedCurrencyTradeable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, supportCurrencyInfo.peggedCurrencyTradeable);
        }
    }

    public SupportCurrencyInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pricingType = str;
        this.peggedCurrency = str2;
        this.peggedCurrencySymbol = str3;
        this.peggedCurrencyScale = i;
        this.peggedCurrencyTradeable = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("$") : (r6v0 java.lang.String))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:243) call: com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ SupportCurrencyInfo(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? "$" : str3, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? false : z);
    }
}
