package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedNetworkInfoResponseBean;
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
public final class LocalizedNetworkInfoBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String networkIcon;
    private final String networkNightIcon;
    private final String networkTitle;
    private final String networkValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizedNetworkInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizedNetworkInfoBean copy$default(LocalizedNetworkInfoBean localizedNetworkInfoBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizedNetworkInfoBean.networkTitle;
        }
        if ((i & 2) != 0) {
            str2 = localizedNetworkInfoBean.networkValue;
        }
        if ((i & 4) != 0) {
            str3 = localizedNetworkInfoBean.networkIcon;
        }
        if ((i & 8) != 0) {
            str4 = localizedNetworkInfoBean.networkNightIcon;
        }
        return localizedNetworkInfoBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.networkValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.networkNightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedNetworkInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LocalizedNetworkInfoBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizedNetworkInfoBean)) {
            return false;
        }
        LocalizedNetworkInfoBean localizedNetworkInfoBean = (LocalizedNetworkInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.networkTitle, (Object) localizedNetworkInfoBean.networkTitle) && Intrinsics.EZpvd((Object) this.networkValue, (Object) localizedNetworkInfoBean.networkValue) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) localizedNetworkInfoBean.networkIcon) && Intrinsics.EZpvd((Object) this.networkNightIcon, (Object) localizedNetworkInfoBean.networkNightIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkNightIcon() {
        return this.networkNightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkTitle() {
        return this.networkTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkValue() {
        return this.networkValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.networkTitle.hashCode() * 31) + this.networkValue.hashCode()) * 31) + this.networkIcon.hashCode()) * 31) + this.networkNightIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizedNetworkInfoBean(networkTitle=" + this.networkTitle + ", networkValue=" + this.networkValue + ", networkIcon=" + this.networkIcon + ", networkNightIcon=" + this.networkNightIcon + ")";
    }

    public /* synthetic */ LocalizedNetworkInfoBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.networkTitle = "";
        } else {
            this.networkTitle = str;
        }
        if ((i & 2) == 0) {
            this.networkValue = "";
        } else {
            this.networkValue = str2;
        }
        if ((i & 4) == 0) {
            this.networkIcon = "";
        } else {
            this.networkIcon = str3;
        }
        if ((i & 8) == 0) {
            this.networkNightIcon = "";
        } else {
            this.networkNightIcon = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LocalizedNetworkInfoBean localizedNetworkInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) localizedNetworkInfoBean.networkTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, localizedNetworkInfoBean.networkTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) localizedNetworkInfoBean.networkValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, localizedNetworkInfoBean.networkValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) localizedNetworkInfoBean.networkIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, localizedNetworkInfoBean.networkIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) localizedNetworkInfoBean.networkNightIcon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, localizedNetworkInfoBean.networkNightIcon);
    }

    public LocalizedNetworkInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.networkTitle = str;
        this.networkValue = str2;
        this.networkIcon = str3;
        this.networkNightIcon = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:299) call: com.okinc.crcore.shared.net.responsebean.bsc.LocalizedNetworkInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizedNetworkInfoBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.LocalizedNetworkInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalizedNetworkInfoBean> serializer() {
            return LocalizedNetworkInfoBean$$serializer.INSTANCE;
        }

        public final LocalizedNetworkInfoBean copydefault(@NotNull LocalizedNetworkInfoResponseBean localizedNetworkInfoResponseBean) {
            Intrinsics.checkNotNullParameter(localizedNetworkInfoResponseBean, "");
            return new LocalizedNetworkInfoBean(localizedNetworkInfoResponseBean.getNetworkTitle(), localizedNetworkInfoResponseBean.getNetworkValue(), localizedNetworkInfoResponseBean.getNetworkIcon(), localizedNetworkInfoResponseBean.getNetworkNightIcon());
        }
    }
}
