package com.okinc.find_ui.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineCapitalFlowData {
    private String closePrice;
    private final String netVol;
    private String netVolTitle;
    private final String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineCapitalFlowData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineCapitalFlowData copy$default(KlineCapitalFlowData klineCapitalFlowData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineCapitalFlowData.ts;
        }
        if ((i & 2) != 0) {
            str2 = klineCapitalFlowData.netVol;
        }
        if ((i & 4) != 0) {
            str3 = klineCapitalFlowData.netVolTitle;
        }
        if ((i & 8) != 0) {
            str4 = klineCapitalFlowData.closePrice;
        }
        return klineCapitalFlowData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.netVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.netVolTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.closePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineCapitalFlowData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new KlineCapitalFlowData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineCapitalFlowData)) {
            return false;
        }
        KlineCapitalFlowData klineCapitalFlowData = (KlineCapitalFlowData) obj;
        return Intrinsics.EZpvd((Object) this.ts, (Object) klineCapitalFlowData.ts) && Intrinsics.EZpvd((Object) this.netVol, (Object) klineCapitalFlowData.netVol) && Intrinsics.EZpvd((Object) this.netVolTitle, (Object) klineCapitalFlowData.netVolTitle) && Intrinsics.EZpvd((Object) this.closePrice, (Object) klineCapitalFlowData.closePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClosePrice() {
        return this.closePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetVol() {
        return this.netVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetVolTitle() {
        return this.netVolTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ts.hashCode() * 31) + this.netVol.hashCode()) * 31) + this.netVolTitle.hashCode()) * 31) + this.closePrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClosePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetVolTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netVolTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineCapitalFlowData(ts=" + this.ts + ", netVol=" + this.netVol + ", netVolTitle=" + this.netVolTitle + ", closePrice=" + this.closePrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.data.KlineCapitalFlowData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineCapitalFlowData> serializer() {
            return KlineCapitalFlowData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KlineCapitalFlowData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
        if ((i & 2) == 0) {
            this.netVol = "";
        } else {
            this.netVol = str2;
        }
        if ((i & 4) == 0) {
            this.netVolTitle = "";
        } else {
            this.netVolTitle = str3;
        }
        if ((i & 8) == 0) {
            this.closePrice = "";
        } else {
            this.closePrice = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(KlineCapitalFlowData klineCapitalFlowData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) klineCapitalFlowData.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, klineCapitalFlowData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) klineCapitalFlowData.netVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, klineCapitalFlowData.netVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) klineCapitalFlowData.netVolTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, klineCapitalFlowData.netVolTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) klineCapitalFlowData.closePrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, klineCapitalFlowData.closePrice);
    }

    public KlineCapitalFlowData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.ts = str;
        this.netVol = str2;
        this.netVolTitle = str3;
        this.closePrice = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:114) call: com.okinc.find_ui.data.KlineCapitalFlowData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KlineCapitalFlowData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
