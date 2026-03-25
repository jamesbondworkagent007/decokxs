package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SupportCurrencyInfoResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String peggedCurrency;
    private final int peggedCurrencyScale;
    private final String peggedCurrencySymbol;
    private final boolean peggedCurrencyTradeable;
    private final String pricingType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportCurrencyInfoResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SupportCurrencyInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrencyInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportCurrencyInfoResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrencyInfoResponseBean[] newArray(int i) {
            return new SupportCurrencyInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrencyInfoResponseBean() {
        this((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportCurrencyInfoResponseBean copy$default(SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportCurrencyInfoResponseBean.pricingType;
        }
        if ((i2 & 2) != 0) {
            str2 = supportCurrencyInfoResponseBean.peggedCurrency;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = supportCurrencyInfoResponseBean.peggedCurrencySymbol;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = supportCurrencyInfoResponseBean.peggedCurrencyScale;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = supportCurrencyInfoResponseBean.peggedCurrencyTradeable;
        }
        return supportCurrencyInfoResponseBean.copy(str, str4, str5, i3, z);
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
    public final SupportCurrencyInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportCurrencyInfoResponseBean(str, str2, str3, i, z);
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
        if (!(obj instanceof SupportCurrencyInfoResponseBean)) {
            return false;
        }
        SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean = (SupportCurrencyInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.pricingType, (Object) supportCurrencyInfoResponseBean.pricingType) && Intrinsics.EZpvd((Object) this.peggedCurrency, (Object) supportCurrencyInfoResponseBean.peggedCurrency) && Intrinsics.EZpvd((Object) this.peggedCurrencySymbol, (Object) supportCurrencyInfoResponseBean.peggedCurrencySymbol) && this.peggedCurrencyScale == supportCurrencyInfoResponseBean.peggedCurrencyScale && this.peggedCurrencyTradeable == supportCurrencyInfoResponseBean.peggedCurrencyTradeable;
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
        return "SupportCurrencyInfoResponseBean(pricingType=" + this.pricingType + ", peggedCurrency=" + this.peggedCurrency + ", peggedCurrencySymbol=" + this.peggedCurrencySymbol + ", peggedCurrencyScale=" + this.peggedCurrencyScale + ", peggedCurrencyTradeable=" + this.peggedCurrencyTradeable + ")";
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrencyInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportCurrencyInfoResponseBean> serializer() {
            return SupportCurrencyInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportCurrencyInfoResponseBean(int i, String str, String str2, String str3, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportCurrencyInfoResponseBean.pricingType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportCurrencyInfoResponseBean.pricingType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) supportCurrencyInfoResponseBean.peggedCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, supportCurrencyInfoResponseBean.peggedCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) supportCurrencyInfoResponseBean.peggedCurrencySymbol, (Object) "$")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, supportCurrencyInfoResponseBean.peggedCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportCurrencyInfoResponseBean.peggedCurrencyScale != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, supportCurrencyInfoResponseBean.peggedCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportCurrencyInfoResponseBean.peggedCurrencyTradeable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, supportCurrencyInfoResponseBean.peggedCurrencyTradeable);
        }
    }

    public SupportCurrencyInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrencyInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ SupportCurrencyInfoResponseBean(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? "$" : str3, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? false : z);
    }
}
