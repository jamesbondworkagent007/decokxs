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
public final class ManualTradeIsolateData {
    private String availEq;
    private String ccy;
    private String eq;
    private String frozenBal;
    private String liab;
    private String upl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ManualTradeIsolateData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ManualTradeIsolateData copy$default(ManualTradeIsolateData manualTradeIsolateData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manualTradeIsolateData.eq;
        }
        if ((i & 2) != 0) {
            str2 = manualTradeIsolateData.availEq;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = manualTradeIsolateData.frozenBal;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = manualTradeIsolateData.upl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = manualTradeIsolateData.liab;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = manualTradeIsolateData.ccy;
        }
        return manualTradeIsolateData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ManualTradeIsolateData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ManualTradeIsolateData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualTradeIsolateData)) {
            return false;
        }
        ManualTradeIsolateData manualTradeIsolateData = (ManualTradeIsolateData) obj;
        return Intrinsics.EZpvd((Object) this.eq, (Object) manualTradeIsolateData.eq) && Intrinsics.EZpvd((Object) this.availEq, (Object) manualTradeIsolateData.availEq) && Intrinsics.EZpvd((Object) this.frozenBal, (Object) manualTradeIsolateData.frozenBal) && Intrinsics.EZpvd((Object) this.upl, (Object) manualTradeIsolateData.upl) && Intrinsics.EZpvd((Object) this.liab, (Object) manualTradeIsolateData.liab) && Intrinsics.EZpvd((Object) this.ccy, (Object) manualTradeIsolateData.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
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
    public final String getLiab() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.eq.hashCode() * 31) + this.availEq.hashCode()) * 31) + this.frozenBal.hashCode()) * 31) + this.upl.hashCode()) * 31) + this.liab.hashCode()) * 31) + this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozenBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frozenBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ManualTradeIsolateData(eq=" + this.eq + ", availEq=" + this.availEq + ", frozenBal=" + this.frozenBal + ", upl=" + this.upl + ", liab=" + this.liab + ", ccy=" + this.ccy + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ManualTradeIsolateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ManualTradeIsolateData> serializer() {
            return ManualTradeIsolateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ManualTradeIsolateData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eq = "";
        } else {
            this.eq = str;
        }
        if ((i & 2) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str2;
        }
        if ((i & 4) == 0) {
            this.frozenBal = "";
        } else {
            this.frozenBal = str3;
        }
        if ((i & 8) == 0) {
            this.upl = "";
        } else {
            this.upl = str4;
        }
        if ((i & 16) == 0) {
            this.liab = "";
        } else {
            this.liab = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ManualTradeIsolateData manualTradeIsolateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) manualTradeIsolateData.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, manualTradeIsolateData.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) manualTradeIsolateData.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, manualTradeIsolateData.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) manualTradeIsolateData.frozenBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, manualTradeIsolateData.frozenBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) manualTradeIsolateData.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, manualTradeIsolateData.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) manualTradeIsolateData.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, manualTradeIsolateData.liab);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) manualTradeIsolateData.ccy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, manualTradeIsolateData.ccy);
    }

    public ManualTradeIsolateData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.eq = str;
        this.availEq = str2;
        this.frozenBal = str3;
        this.upl = str4;
        this.liab = str5;
        this.ccy = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:311) call: com.okinc.unify_trade.biz.subscribe.ManualTradeIsolateData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ManualTradeIsolateData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
