package com.okinc.business.invest_biz.data.bean.response;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NetworkTotal {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long chainId;
    public final String chainLogo;
    public final String chainName;
    public final String totalCurrencyAmount;
    public final String totalEarnings;
    public final String yesterdayProfit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkTotal() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkTotal OLrzqt(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new NetworkTotal(j, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.totalCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTotal)) {
            return false;
        }
        NetworkTotal networkTotal = (NetworkTotal) obj;
        return this.chainId == networkTotal.chainId && Intrinsics.EZpvd((Object) this.chainLogo, (Object) networkTotal.chainLogo) && Intrinsics.EZpvd((Object) this.chainName, (Object) networkTotal.chainName) && Intrinsics.EZpvd((Object) this.totalCurrencyAmount, (Object) networkTotal.totalCurrencyAmount) && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) networkTotal.yesterdayProfit) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) networkTotal.totalEarnings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.chainId) * 31) + this.chainLogo.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.totalCurrencyAmount.hashCode()) * 31) + this.yesterdayProfit.hashCode()) * 31) + this.totalEarnings.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkTotal(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", chainName=" + this.chainName + ", totalCurrencyAmount=" + this.totalCurrencyAmount + ", yesterdayProfit=" + this.yesterdayProfit + ", totalEarnings=" + this.totalEarnings + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.NetworkTotal.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkTotal> serializer() {
            return NetworkTotal$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkTotal(int i, long j, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 8) == 0) {
            this.totalCurrencyAmount = "";
        } else {
            this.totalCurrencyAmount = str3;
        }
        if ((i & 16) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str4;
        }
        if ((i & 32) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str5;
        }
    }

    public static final /* synthetic */ void AEQbTJ(NetworkTotal networkTotal, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || networkTotal.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, networkTotal.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) networkTotal.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, networkTotal.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) networkTotal.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, networkTotal.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) networkTotal.totalCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, networkTotal.totalCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) networkTotal.yesterdayProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, networkTotal.yesterdayProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) networkTotal.totalEarnings, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, networkTotal.totalEarnings);
    }

    public NetworkTotal(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = j;
        this.chainLogo = str;
        this.chainName = str2;
        this.totalCurrencyAmount = str3;
        this.yesterdayProfit = str4;
        this.totalEarnings = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r16v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:160) call: com.okinc.business.invest_biz.data.bean.response.NetworkTotal.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkTotal(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "");
    }
}
