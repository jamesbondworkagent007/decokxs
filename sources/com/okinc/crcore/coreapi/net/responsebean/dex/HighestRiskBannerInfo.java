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
public final class HighestRiskBannerInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String riskBannerDesc;
    private final String riskBannerName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HighestRiskBannerInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HighestRiskBannerInfo copy$default(HighestRiskBannerInfo highestRiskBannerInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highestRiskBannerInfo.riskBannerDesc;
        }
        if ((i & 2) != 0) {
            str2 = highestRiskBannerInfo.riskBannerName;
        }
        return highestRiskBannerInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.riskBannerDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.riskBannerName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestRiskBannerInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HighestRiskBannerInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighestRiskBannerInfo)) {
            return false;
        }
        HighestRiskBannerInfo highestRiskBannerInfo = (HighestRiskBannerInfo) obj;
        return Intrinsics.EZpvd((Object) this.riskBannerDesc, (Object) highestRiskBannerInfo.riskBannerDesc) && Intrinsics.EZpvd((Object) this.riskBannerName, (Object) highestRiskBannerInfo.riskBannerName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskBannerDesc() {
        return this.riskBannerDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskBannerName() {
        return this.riskBannerName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.riskBannerDesc.hashCode() * 31) + this.riskBannerName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HighestRiskBannerInfo(riskBannerDesc=" + this.riskBannerDesc + ", riskBannerName=" + this.riskBannerName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.HighestRiskBannerInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HighestRiskBannerInfo> serializer() {
            return HighestRiskBannerInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HighestRiskBannerInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.riskBannerDesc = "";
        } else {
            this.riskBannerDesc = str;
        }
        if ((i & 2) == 0) {
            this.riskBannerName = "";
        } else {
            this.riskBannerName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(HighestRiskBannerInfo highestRiskBannerInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) highestRiskBannerInfo.riskBannerDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, highestRiskBannerInfo.riskBannerDesc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) highestRiskBannerInfo.riskBannerName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, highestRiskBannerInfo.riskBannerName);
    }

    public HighestRiskBannerInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.riskBannerDesc = str;
        this.riskBannerName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:68) call: com.okinc.crcore.coreapi.net.responsebean.dex.HighestRiskBannerInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HighestRiskBannerInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
