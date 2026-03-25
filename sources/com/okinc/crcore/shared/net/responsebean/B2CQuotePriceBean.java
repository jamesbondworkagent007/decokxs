package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuotePriceResponseBean;
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
public final class B2CQuotePriceBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean bestOption;
    private final String depositName;
    private final String payment;
    private final String price;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<B2CQuotePriceBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<B2CQuotePriceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuotePriceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new B2CQuotePriceBean(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuotePriceBean[] newArray(int i) {
            return new B2CQuotePriceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CQuotePriceBean() {
        this(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ B2CQuotePriceBean copy$default(B2CQuotePriceBean b2CQuotePriceBean, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = b2CQuotePriceBean.bestOption;
        }
        if ((i & 2) != 0) {
            str = b2CQuotePriceBean.depositName;
        }
        if ((i & 4) != 0) {
            str2 = b2CQuotePriceBean.price;
        }
        if ((i & 8) != 0) {
            str3 = b2CQuotePriceBean.payment;
        }
        return b2CQuotePriceBean.copy(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CQuotePriceBean copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new B2CQuotePriceBean(z, str, str2, str3);
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
        if (!(obj instanceof B2CQuotePriceBean)) {
            return false;
        }
        B2CQuotePriceBean b2CQuotePriceBean = (B2CQuotePriceBean) obj;
        return this.bestOption == b2CQuotePriceBean.bestOption && Intrinsics.EZpvd((Object) this.depositName, (Object) b2CQuotePriceBean.depositName) && Intrinsics.EZpvd((Object) this.price, (Object) b2CQuotePriceBean.price) && Intrinsics.EZpvd((Object) this.payment, (Object) b2CQuotePriceBean.payment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestOption() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayment() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.bestOption) * 31) + this.depositName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.payment.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CQuotePriceBean(bestOption=" + this.bestOption + ", depositName=" + this.depositName + ", price=" + this.price + ", payment=" + this.payment + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.bestOption ? 1 : 0);
        parcel.writeString(this.depositName);
        parcel.writeString(this.price);
        parcel.writeString(this.payment);
    }

    public /* synthetic */ B2CQuotePriceBean(int i, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.bestOption = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 8) == 0) {
            this.payment = "";
        } else {
            this.payment = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(B2CQuotePriceBean b2CQuotePriceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || b2CQuotePriceBean.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, b2CQuotePriceBean.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CQuotePriceBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CQuotePriceBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CQuotePriceBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CQuotePriceBean.price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) b2CQuotePriceBean.payment, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CQuotePriceBean.payment);
    }

    public B2CQuotePriceBean(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.bestOption = z;
        this.depositName = str;
        this.price = str2;
        this.payment = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CQuotePriceBean(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<B2CQuotePriceBean> serializer() {
            return B2CQuotePriceBean$$serializer.INSTANCE;
        }

        public final B2CQuotePriceBean EZpvd(@NotNull B2CQuotePriceResponseBean b2CQuotePriceResponseBean) {
            Intrinsics.checkNotNullParameter(b2CQuotePriceResponseBean, "");
            return new B2CQuotePriceBean(b2CQuotePriceResponseBean.getBestOption(), b2CQuotePriceResponseBean.getDepositName(), b2CQuotePriceResponseBean.getPrice(), b2CQuotePriceResponseBean.getPayment());
        }
    }
}
