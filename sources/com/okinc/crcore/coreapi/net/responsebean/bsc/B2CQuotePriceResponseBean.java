package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
public final class B2CQuotePriceResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean bestOption;
    private final String depositName;
    private final String payment;
    private final String price;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CQuotePriceResponseBean() {
        this(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ B2CQuotePriceResponseBean copy$default(B2CQuotePriceResponseBean b2CQuotePriceResponseBean, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = b2CQuotePriceResponseBean.bestOption;
        }
        if ((i & 2) != 0) {
            str = b2CQuotePriceResponseBean.depositName;
        }
        if ((i & 4) != 0) {
            str2 = b2CQuotePriceResponseBean.price;
        }
        if ((i & 8) != 0) {
            str3 = b2CQuotePriceResponseBean.payment;
        }
        return b2CQuotePriceResponseBean.copy(z, str, str2, str3);
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
    public final B2CQuotePriceResponseBean copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new B2CQuotePriceResponseBean(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B2CQuotePriceResponseBean)) {
            return false;
        }
        B2CQuotePriceResponseBean b2CQuotePriceResponseBean = (B2CQuotePriceResponseBean) obj;
        return this.bestOption == b2CQuotePriceResponseBean.bestOption && Intrinsics.EZpvd((Object) this.depositName, (Object) b2CQuotePriceResponseBean.depositName) && Intrinsics.EZpvd((Object) this.price, (Object) b2CQuotePriceResponseBean.price) && Intrinsics.EZpvd((Object) this.payment, (Object) b2CQuotePriceResponseBean.payment);
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
        return "B2CQuotePriceResponseBean(bestOption=" + this.bestOption + ", depositName=" + this.depositName + ", price=" + this.price + ", payment=" + this.payment + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuotePriceResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CQuotePriceResponseBean> serializer() {
            return B2CQuotePriceResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CQuotePriceResponseBean(int i, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(B2CQuotePriceResponseBean b2CQuotePriceResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || b2CQuotePriceResponseBean.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, b2CQuotePriceResponseBean.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CQuotePriceResponseBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CQuotePriceResponseBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CQuotePriceResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CQuotePriceResponseBean.price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) b2CQuotePriceResponseBean.payment, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CQuotePriceResponseBean.payment);
    }

    public B2CQuotePriceResponseBean(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
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
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuotePriceResponseBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CQuotePriceResponseBean(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
