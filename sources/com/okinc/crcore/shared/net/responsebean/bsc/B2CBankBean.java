package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CBankResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class B2CBankBean {
    private String bankId;
    private String bankLogo;
    private String bankName;
    private String bankNumber;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CBankBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ B2CBankBean copy$default(B2CBankBean b2CBankBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b2CBankBean.bankId;
        }
        if ((i & 2) != 0) {
            str2 = b2CBankBean.bankName;
        }
        if ((i & 4) != 0) {
            str3 = b2CBankBean.bankLogo;
        }
        if ((i & 8) != 0) {
            str4 = b2CBankBean.bankNumber;
        }
        return b2CBankBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bankId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bankLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bankNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CBankBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new B2CBankBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B2CBankBean)) {
            return false;
        }
        B2CBankBean b2CBankBean = (B2CBankBean) obj;
        return Intrinsics.EZpvd((Object) this.bankId, (Object) b2CBankBean.bankId) && Intrinsics.EZpvd((Object) this.bankName, (Object) b2CBankBean.bankName) && Intrinsics.EZpvd((Object) this.bankLogo, (Object) b2CBankBean.bankLogo) && Intrinsics.EZpvd((Object) this.bankNumber, (Object) b2CBankBean.bankNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankId() {
        return this.bankId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankNumber() {
        return this.bankNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.bankId.hashCode() * 31) + this.bankName.hashCode()) * 31) + this.bankLogo.hashCode()) * 31) + this.bankNumber.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CBankBean(bankId=" + this.bankId + ", bankName=" + this.bankName + ", bankLogo=" + this.bankLogo + ", bankNumber=" + this.bankNumber + ")";
    }

    public /* synthetic */ B2CBankBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bankId = "";
        } else {
            this.bankId = str;
        }
        if ((i & 2) == 0) {
            this.bankName = "";
        } else {
            this.bankName = str2;
        }
        if ((i & 4) == 0) {
            this.bankLogo = "";
        } else {
            this.bankLogo = str3;
        }
        if ((i & 8) == 0) {
            this.bankNumber = "";
        } else {
            this.bankNumber = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(B2CBankBean b2CBankBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CBankBean.bankId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CBankBean.bankId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CBankBean.bankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CBankBean.bankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CBankBean.bankLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CBankBean.bankLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) b2CBankBean.bankNumber, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CBankBean.bankNumber);
    }

    public B2CBankBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.bankId = str;
        this.bankName = str2;
        this.bankLogo = str3;
        this.bankNumber = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:91) call: com.okinc.crcore.shared.net.responsebean.bsc.B2CBankBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CBankBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.B2CBankBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<B2CBankBean> serializer() {
            return B2CBankBean$$serializer.INSTANCE;
        }

        public final B2CBankBean copydefault(@NotNull B2CBankResponseBean b2CBankResponseBean) {
            Intrinsics.checkNotNullParameter(b2CBankResponseBean, "");
            return new B2CBankBean(b2CBankResponseBean.getBankId(), b2CBankResponseBean.getBankName(), b2CBankResponseBean.getBankLogo(), b2CBankResponseBean.getBankNumber());
        }
    }
}
