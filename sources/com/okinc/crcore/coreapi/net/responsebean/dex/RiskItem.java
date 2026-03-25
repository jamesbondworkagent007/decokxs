package com.okinc.crcore.coreapi.net.responsebean.dex;

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
public final class RiskItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String newRiskDesc;
    private final String newRiskLabel;
    private final String newRiskName;
    private final String riskControlLevel;
    private final String riskDesc;
    private final String riskName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskItem copy$default(RiskItem riskItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskItem.newRiskDesc;
        }
        if ((i & 2) != 0) {
            str2 = riskItem.newRiskLabel;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = riskItem.newRiskName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = riskItem.riskControlLevel;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = riskItem.riskDesc;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = riskItem.riskName;
        }
        return riskItem.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newRiskDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.newRiskLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newRiskName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.riskDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.riskName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new RiskItem(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskItem)) {
            return false;
        }
        RiskItem riskItem = (RiskItem) obj;
        return Intrinsics.EZpvd((Object) this.newRiskDesc, (Object) riskItem.newRiskDesc) && Intrinsics.EZpvd((Object) this.newRiskLabel, (Object) riskItem.newRiskLabel) && Intrinsics.EZpvd((Object) this.newRiskName, (Object) riskItem.newRiskName) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) riskItem.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskDesc, (Object) riskItem.riskDesc) && Intrinsics.EZpvd((Object) this.riskName, (Object) riskItem.riskName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewRiskDesc() {
        return this.newRiskDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewRiskLabel() {
        return this.newRiskLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewRiskName() {
        return this.newRiskName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskDesc() {
        return this.riskDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskName() {
        return this.riskName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.newRiskDesc.hashCode() * 31) + this.newRiskLabel.hashCode()) * 31) + this.newRiskName.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskDesc.hashCode()) * 31) + this.riskName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskItem(newRiskDesc=" + this.newRiskDesc + ", newRiskLabel=" + this.newRiskLabel + ", newRiskName=" + this.newRiskName + ", riskControlLevel=" + this.riskControlLevel + ", riskDesc=" + this.riskDesc + ", riskName=" + this.riskName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.RiskItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskItem> serializer() {
            return RiskItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RiskItem(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.newRiskDesc = "";
        } else {
            this.newRiskDesc = str;
        }
        if ((i & 2) == 0) {
            this.newRiskLabel = "";
        } else {
            this.newRiskLabel = str2;
        }
        if ((i & 4) == 0) {
            this.newRiskName = "";
        } else {
            this.newRiskName = str3;
        }
        if ((i & 8) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str4;
        }
        if ((i & 16) == 0) {
            this.riskDesc = "";
        } else {
            this.riskDesc = str5;
        }
        if ((i & 32) == 0) {
            this.riskName = "";
        } else {
            this.riskName = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RiskItem riskItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) riskItem.newRiskDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, riskItem.newRiskDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) riskItem.newRiskLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, riskItem.newRiskLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) riskItem.newRiskName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, riskItem.newRiskName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) riskItem.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, riskItem.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) riskItem.riskDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, riskItem.riskDesc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) riskItem.riskName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, riskItem.riskName);
    }

    public RiskItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.newRiskDesc = str;
        this.newRiskLabel = str2;
        this.newRiskName = str3;
        this.riskControlLevel = str4;
        this.riskDesc = str5;
        this.riskName = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:57) call: com.okinc.crcore.coreapi.net.responsebean.dex.RiskItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RiskItem(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
