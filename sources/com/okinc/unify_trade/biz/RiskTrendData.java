package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RiskTrendData {
    public static final String ADL_END = "adl_end";
    public static final String BAL_ADL_START = "bal_adl_start";
    public static final String POS_ADL_START = "pos_adl_start";
    public static final String RATE_ADL_START = "rate_adl_start";
    private String adlType;
    private String amount;
    private String date;
    private String maxEquity;
    private String maxEquityTime;
    private int segment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskTrendData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskTrendData copy$default(RiskTrendData riskTrendData, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = riskTrendData.amount;
        }
        if ((i2 & 2) != 0) {
            str2 = riskTrendData.date;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = riskTrendData.adlType;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = riskTrendData.maxEquity;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = riskTrendData.maxEquityTime;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = riskTrendData.segment;
        }
        return riskTrendData.copy(str, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.adlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxEquityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskTrendData copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RiskTrendData(str, str2, str3, str4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskTrendData)) {
            return false;
        }
        RiskTrendData riskTrendData = (RiskTrendData) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) riskTrendData.amount) && Intrinsics.EZpvd((Object) this.date, (Object) riskTrendData.date) && Intrinsics.EZpvd((Object) this.adlType, (Object) riskTrendData.adlType) && Intrinsics.EZpvd((Object) this.maxEquity, (Object) riskTrendData.maxEquity) && Intrinsics.EZpvd((Object) this.maxEquityTime, (Object) riskTrendData.maxEquityTime) && this.segment == riskTrendData.segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdlType() {
        return this.adlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDate() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxEquity() {
        return this.maxEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxEquityTime() {
        return this.maxEquityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSegment() {
        return this.segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.date.hashCode();
        String str = this.adlType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.maxEquity;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxEquityTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.segment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdlType(String str) {
        this.adlType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.date = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxEquity(String str) {
        this.maxEquity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxEquityTime(String str) {
        this.maxEquityTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSegment(int i) {
        this.segment = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskTrendData(amount=" + this.amount + ", date=" + this.date + ", adlType=" + this.adlType + ", maxEquity=" + this.maxEquity + ", maxEquityTime=" + this.maxEquityTime + ", segment=" + this.segment + ")";
    }

    public /* synthetic */ RiskTrendData(int i, String str, String str2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.date = "";
        } else {
            this.date = str2;
        }
        if ((i & 4) == 0) {
            this.adlType = null;
        } else {
            this.adlType = str3;
        }
        if ((i & 8) == 0) {
            this.maxEquity = null;
        } else {
            this.maxEquity = str4;
        }
        if ((i & 16) == 0) {
            this.maxEquityTime = null;
        } else {
            this.maxEquityTime = str5;
        }
        if ((i & 32) == 0) {
            this.segment = 1;
        } else {
            this.segment = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RiskTrendData riskTrendData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) riskTrendData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, riskTrendData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) riskTrendData.date, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, riskTrendData.date);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || riskTrendData.adlType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, riskTrendData.adlType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || riskTrendData.maxEquity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, riskTrendData.maxEquity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || riskTrendData.maxEquityTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, riskTrendData.maxEquityTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && riskTrendData.segment == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, riskTrendData.segment);
    }

    public RiskTrendData(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.date = str2;
        this.adlType = str3;
        this.maxEquity = str4;
        this.maxEquityTime = str5;
        this.segment = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:67) call: com.okinc.unify_trade.biz.RiskTrendData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RiskTrendData(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 1 : i);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RiskTrendData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RiskTrendData> serializer() {
            return RiskTrendData$$serializer.INSTANCE;
        }
    }

    public final boolean isAdlStart() {
        return C59449zhJ.equals$default(this.adlType, RATE_ADL_START, false, 2, null) || C59449zhJ.equals$default(this.adlType, BAL_ADL_START, false, 2, null) || C59449zhJ.equals$default(this.adlType, POS_ADL_START, false, 2, null);
    }

    public final boolean isAdlStop() {
        return C59449zhJ.equals$default(this.adlType, ADL_END, false, 2, null);
    }

    public final boolean isHighest() {
        return C33129mqd.OLrzqt((CharSequence) this.maxEquity) || C33129mqd.OLrzqt((CharSequence) this.maxEquityTime);
    }

    public final boolean isNormalPoint() {
        return (isAdlStop() || isAdlStart() || isHighest()) ? false : true;
    }
}
