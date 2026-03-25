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
public final class ManualTradeCrossData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String availEq;
    private final String ccy;
    private final String eq;
    private final String frozenBal;
    private final String liab;
    private final PotentialBorrowingData potentialBorrowingData;
    private final String upl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ManualTradeCrossData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (PotentialBorrowingData) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ManualTradeCrossData copy$default(ManualTradeCrossData manualTradeCrossData, String str, String str2, String str3, String str4, String str5, String str6, PotentialBorrowingData potentialBorrowingData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manualTradeCrossData.eq;
        }
        if ((i & 2) != 0) {
            str2 = manualTradeCrossData.availEq;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = manualTradeCrossData.frozenBal;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = manualTradeCrossData.upl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = manualTradeCrossData.liab;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = manualTradeCrossData.ccy;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            potentialBorrowingData = manualTradeCrossData.potentialBorrowingData;
        }
        return manualTradeCrossData.copy(str, str7, str8, str9, str10, str11, potentialBorrowingData);
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
    public final PotentialBorrowingData component7() {
        return this.potentialBorrowingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ManualTradeCrossData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull PotentialBorrowingData potentialBorrowingData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(potentialBorrowingData, "");
        return new ManualTradeCrossData(str, str2, str3, str4, str5, str6, potentialBorrowingData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualTradeCrossData)) {
            return false;
        }
        ManualTradeCrossData manualTradeCrossData = (ManualTradeCrossData) obj;
        return Intrinsics.EZpvd((Object) this.eq, (Object) manualTradeCrossData.eq) && Intrinsics.EZpvd((Object) this.availEq, (Object) manualTradeCrossData.availEq) && Intrinsics.EZpvd((Object) this.frozenBal, (Object) manualTradeCrossData.frozenBal) && Intrinsics.EZpvd((Object) this.upl, (Object) manualTradeCrossData.upl) && Intrinsics.EZpvd((Object) this.liab, (Object) manualTradeCrossData.liab) && Intrinsics.EZpvd((Object) this.ccy, (Object) manualTradeCrossData.ccy) && Intrinsics.EZpvd(this.potentialBorrowingData, manualTradeCrossData.potentialBorrowingData);
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
    public final PotentialBorrowingData getPotentialBorrowingData() {
        return this.potentialBorrowingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.eq.hashCode() * 31) + this.availEq.hashCode()) * 31) + this.frozenBal.hashCode()) * 31) + this.upl.hashCode()) * 31) + this.liab.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.potentialBorrowingData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ManualTradeCrossData(eq=" + this.eq + ", availEq=" + this.availEq + ", frozenBal=" + this.frozenBal + ", upl=" + this.upl + ", liab=" + this.liab + ", ccy=" + this.ccy + ", potentialBorrowingData=" + this.potentialBorrowingData + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ManualTradeCrossData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ManualTradeCrossData> serializer() {
            return ManualTradeCrossData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ManualTradeCrossData(int i, String str, String str2, String str3, String str4, String str5, String str6, PotentialBorrowingData potentialBorrowingData, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 64) == 0) {
            this.potentialBorrowingData = new PotentialBorrowingData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        } else {
            this.potentialBorrowingData = potentialBorrowingData;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ManualTradeCrossData manualTradeCrossData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) manualTradeCrossData.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, manualTradeCrossData.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) manualTradeCrossData.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, manualTradeCrossData.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) manualTradeCrossData.frozenBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, manualTradeCrossData.frozenBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) manualTradeCrossData.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, manualTradeCrossData.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) manualTradeCrossData.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, manualTradeCrossData.liab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) manualTradeCrossData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, manualTradeCrossData.ccy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(manualTradeCrossData.potentialBorrowingData, new PotentialBorrowingData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, PotentialBorrowingData$$serializer.INSTANCE, manualTradeCrossData.potentialBorrowingData);
    }

    public ManualTradeCrossData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull PotentialBorrowingData potentialBorrowingData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(potentialBorrowingData, "");
        this.eq = str;
        this.availEq = str2;
        this.frozenBal = str3;
        this.upl = str4;
        this.liab = str5;
        this.ccy = str6;
        this.potentialBorrowingData = potentialBorrowingData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:256) call: com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData):void (m)] (LINE:249) call: com.okinc.unify_trade.biz.subscribe.ManualTradeCrossData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData):void type: THIS */
    public /* synthetic */ ManualTradeCrossData(String str, String str2, String str3, String str4, String str5, String str6, PotentialBorrowingData potentialBorrowingData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? new PotentialBorrowingData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : potentialBorrowingData);
    }
}
