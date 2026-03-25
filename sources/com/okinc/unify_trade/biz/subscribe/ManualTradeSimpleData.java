package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ManualTradeSimpleData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String availBal;
    private final String ccy;
    private final String eq;
    private final String frozenBal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ManualTradeSimpleData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ManualTradeSimpleData copy$default(ManualTradeSimpleData manualTradeSimpleData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manualTradeSimpleData.eq;
        }
        if ((i & 2) != 0) {
            str2 = manualTradeSimpleData.availBal;
        }
        if ((i & 4) != 0) {
            str3 = manualTradeSimpleData.frozenBal;
        }
        if ((i & 8) != 0) {
            str4 = manualTradeSimpleData.ccy;
        }
        return manualTradeSimpleData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ManualTradeSimpleData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ManualTradeSimpleData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualTradeSimpleData)) {
            return false;
        }
        ManualTradeSimpleData manualTradeSimpleData = (ManualTradeSimpleData) obj;
        return Intrinsics.EZpvd((Object) this.eq, (Object) manualTradeSimpleData.eq) && Intrinsics.EZpvd((Object) this.availBal, (Object) manualTradeSimpleData.availBal) && Intrinsics.EZpvd((Object) this.frozenBal, (Object) manualTradeSimpleData.frozenBal) && Intrinsics.EZpvd((Object) this.ccy, (Object) manualTradeSimpleData.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailBal() {
        return this.availBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrozenBal() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.eq.hashCode() * 31) + this.availBal.hashCode()) * 31) + this.frozenBal.hashCode()) * 31) + this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ManualTradeSimpleData(eq=" + this.eq + ", availBal=" + this.availBal + ", frozenBal=" + this.frozenBal + ", ccy=" + this.ccy + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ManualTradeSimpleData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ManualTradeSimpleData> serializer() {
            return ManualTradeSimpleData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ManualTradeSimpleData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eq = "";
        } else {
            this.eq = str;
        }
        if ((i & 2) == 0) {
            this.availBal = "";
        } else {
            this.availBal = str2;
        }
        if ((i & 4) == 0) {
            this.frozenBal = "";
        } else {
            this.frozenBal = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ManualTradeSimpleData manualTradeSimpleData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) manualTradeSimpleData.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, manualTradeSimpleData.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) manualTradeSimpleData.availBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, manualTradeSimpleData.availBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) manualTradeSimpleData.frozenBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, manualTradeSimpleData.frozenBal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) manualTradeSimpleData.ccy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, manualTradeSimpleData.ccy);
    }

    public ManualTradeSimpleData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.eq = str;
        this.availBal = str2;
        this.frozenBal = str3;
        this.ccy = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:233) call: com.okinc.unify_trade.biz.subscribe.ManualTradeSimpleData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ManualTradeSimpleData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
