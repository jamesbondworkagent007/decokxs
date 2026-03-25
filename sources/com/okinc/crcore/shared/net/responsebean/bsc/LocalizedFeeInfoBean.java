package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedFeeInfoResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LocalizedFeeInfoBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeTitle;
    private final String feeValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizedFeeInfoBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizedFeeInfoBean copy$default(LocalizedFeeInfoBean localizedFeeInfoBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizedFeeInfoBean.feeTitle;
        }
        if ((i & 2) != 0) {
            str2 = localizedFeeInfoBean.feeValue;
        }
        return localizedFeeInfoBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedFeeInfoBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LocalizedFeeInfoBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizedFeeInfoBean)) {
            return false;
        }
        LocalizedFeeInfoBean localizedFeeInfoBean = (LocalizedFeeInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.feeTitle, (Object) localizedFeeInfoBean.feeTitle) && Intrinsics.EZpvd((Object) this.feeValue, (Object) localizedFeeInfoBean.feeValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTitle() {
        return this.feeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.feeTitle.hashCode() * 31) + this.feeValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizedFeeInfoBean(feeTitle=" + this.feeTitle + ", feeValue=" + this.feeValue + ")";
    }

    public /* synthetic */ LocalizedFeeInfoBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.feeTitle = "";
        } else {
            this.feeTitle = str;
        }
        if ((i & 2) == 0) {
            this.feeValue = "";
        } else {
            this.feeValue = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LocalizedFeeInfoBean localizedFeeInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) localizedFeeInfoBean.feeTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, localizedFeeInfoBean.feeTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) localizedFeeInfoBean.feeValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, localizedFeeInfoBean.feeValue);
    }

    public LocalizedFeeInfoBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.feeTitle = str;
        this.feeValue = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:181) call: com.okinc.crcore.shared.net.responsebean.bsc.LocalizedFeeInfoBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizedFeeInfoBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.LocalizedFeeInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalizedFeeInfoBean> serializer() {
            return LocalizedFeeInfoBean$$serializer.INSTANCE;
        }

        public final LocalizedFeeInfoBean copydefault(@NotNull LocalizedFeeInfoResponseBean localizedFeeInfoResponseBean) {
            Intrinsics.checkNotNullParameter(localizedFeeInfoResponseBean, "");
            return new LocalizedFeeInfoBean(localizedFeeInfoResponseBean.getFeeTitle(), localizedFeeInfoResponseBean.getFeeValue());
        }
    }
}
