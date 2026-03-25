package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatCommonUiFlowResponseBean;
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
public final class FiatCommonUiFlowBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String depositName;
    private final String depositPlatformCode;
    private final String uiFlow;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatCommonUiFlowBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FiatCommonUiFlowBean copy$default(FiatCommonUiFlowBean fiatCommonUiFlowBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fiatCommonUiFlowBean.uiFlow;
        }
        if ((i & 2) != 0) {
            str2 = fiatCommonUiFlowBean.depositPlatformCode;
        }
        if ((i & 4) != 0) {
            str3 = fiatCommonUiFlowBean.depositName;
        }
        return fiatCommonUiFlowBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uiFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatCommonUiFlowBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FiatCommonUiFlowBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiatCommonUiFlowBean)) {
            return false;
        }
        FiatCommonUiFlowBean fiatCommonUiFlowBean = (FiatCommonUiFlowBean) obj;
        return Intrinsics.EZpvd((Object) this.uiFlow, (Object) fiatCommonUiFlowBean.uiFlow) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) fiatCommonUiFlowBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.depositName, (Object) fiatCommonUiFlowBean.depositName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUiFlow() {
        return this.uiFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uiFlow.hashCode() * 31) + this.depositPlatformCode.hashCode()) * 31) + this.depositName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatCommonUiFlowBean(uiFlow=" + this.uiFlow + ", depositPlatformCode=" + this.depositPlatformCode + ", depositName=" + this.depositName + ")";
    }

    public /* synthetic */ FiatCommonUiFlowBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uiFlow = "";
        } else {
            this.uiFlow = str;
        }
        if ((i & 2) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str2;
        }
        if ((i & 4) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatCommonUiFlowBean fiatCommonUiFlowBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatCommonUiFlowBean.uiFlow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatCommonUiFlowBean.uiFlow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatCommonUiFlowBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatCommonUiFlowBean.depositPlatformCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) fiatCommonUiFlowBean.depositName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, fiatCommonUiFlowBean.depositName);
    }

    public FiatCommonUiFlowBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.uiFlow = str;
        this.depositPlatformCode = str2;
        this.depositName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.bsc.FiatCommonUiFlowBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FiatCommonUiFlowBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.FiatCommonUiFlowBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FiatCommonUiFlowBean> serializer() {
            return FiatCommonUiFlowBean$$serializer.INSTANCE;
        }

        public final FiatCommonUiFlowBean KWHzl(@NotNull FiatCommonUiFlowResponseBean fiatCommonUiFlowResponseBean) {
            Intrinsics.checkNotNullParameter(fiatCommonUiFlowResponseBean, "");
            return new FiatCommonUiFlowBean(fiatCommonUiFlowResponseBean.getUiFlow(), fiatCommonUiFlowResponseBean.getDepositPlatformCode(), fiatCommonUiFlowResponseBean.getDepositName());
        }
    }
}
