package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ContractDcaExtendInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String actualLever;
    public final String estAvgPx;
    public final String estPositionValue;
    public final String liqPx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractDcaExtendInfo() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractDcaExtendInfo copy$default(ContractDcaExtendInfo contractDcaExtendInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractDcaExtendInfo.liqPx;
        }
        if ((i & 2) != 0) {
            str2 = contractDcaExtendInfo.actualLever;
        }
        if ((i & 4) != 0) {
            str3 = contractDcaExtendInfo.estPositionValue;
        }
        if ((i & 8) != 0) {
            str4 = contractDcaExtendInfo.estAvgPx;
        }
        return contractDcaExtendInfo.copydefault(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.actualLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.estAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.estPositionValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractDcaExtendInfo copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ContractDcaExtendInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractDcaExtendInfo)) {
            return false;
        }
        ContractDcaExtendInfo contractDcaExtendInfo = (ContractDcaExtendInfo) obj;
        return Intrinsics.EZpvd((Object) this.liqPx, (Object) contractDcaExtendInfo.liqPx) && Intrinsics.EZpvd((Object) this.actualLever, (Object) contractDcaExtendInfo.actualLever) && Intrinsics.EZpvd((Object) this.estPositionValue, (Object) contractDcaExtendInfo.estPositionValue) && Intrinsics.EZpvd((Object) this.estAvgPx, (Object) contractDcaExtendInfo.estAvgPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.liqPx.hashCode() * 31) + this.actualLever.hashCode()) * 31) + this.estPositionValue.hashCode()) * 31) + this.estAvgPx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractDcaExtendInfo(liqPx=" + this.liqPx + ", actualLever=" + this.actualLever + ", estPositionValue=" + this.estPositionValue + ", estAvgPx=" + this.estAvgPx + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractDcaExtendInfo> serializer() {
            return ContractDcaExtendInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractDcaExtendInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str;
        }
        if ((i & 2) == 0) {
            this.actualLever = "";
        } else {
            this.actualLever = str2;
        }
        if ((i & 4) == 0) {
            this.estPositionValue = "";
        } else {
            this.estPositionValue = str3;
        }
        if ((i & 8) == 0) {
            this.estAvgPx = "";
        } else {
            this.estAvgPx = str4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(ContractDcaExtendInfo contractDcaExtendInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractDcaExtendInfo.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractDcaExtendInfo.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractDcaExtendInfo.actualLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractDcaExtendInfo.actualLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractDcaExtendInfo.estPositionValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contractDcaExtendInfo.estPositionValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) contractDcaExtendInfo.estAvgPx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, contractDcaExtendInfo.estAvgPx);
    }

    public ContractDcaExtendInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.liqPx = str;
        this.actualLever = str2;
        this.estPositionValue = str3;
        this.estAvgPx = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:64) call: com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContractDcaExtendInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
