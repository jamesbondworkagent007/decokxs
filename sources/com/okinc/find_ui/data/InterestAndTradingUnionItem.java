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
public final class InterestAndTradingUnionItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String oiCrypto;
    private final String oiUsds;
    private final String ts;
    private final String volCrypto;
    private final String volUsds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterestAndTradingUnionItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InterestAndTradingUnionItem copy$default(InterestAndTradingUnionItem interestAndTradingUnionItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestAndTradingUnionItem.oiCrypto;
        }
        if ((i & 2) != 0) {
            str2 = interestAndTradingUnionItem.oiUsds;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = interestAndTradingUnionItem.ts;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = interestAndTradingUnionItem.volCrypto;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = interestAndTradingUnionItem.volUsds;
        }
        return interestAndTradingUnionItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.oiCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.oiUsds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.volCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.volUsds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterestAndTradingUnionItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new InterestAndTradingUnionItem(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestAndTradingUnionItem)) {
            return false;
        }
        InterestAndTradingUnionItem interestAndTradingUnionItem = (InterestAndTradingUnionItem) obj;
        return Intrinsics.EZpvd((Object) this.oiCrypto, (Object) interestAndTradingUnionItem.oiCrypto) && Intrinsics.EZpvd((Object) this.oiUsds, (Object) interestAndTradingUnionItem.oiUsds) && Intrinsics.EZpvd((Object) this.ts, (Object) interestAndTradingUnionItem.ts) && Intrinsics.EZpvd((Object) this.volCrypto, (Object) interestAndTradingUnionItem.volCrypto) && Intrinsics.EZpvd((Object) this.volUsds, (Object) interestAndTradingUnionItem.volUsds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOiCrypto() {
        return this.oiCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOiUsds() {
        return this.oiUsds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolCrypto() {
        return this.volCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolUsds() {
        return this.volUsds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.oiCrypto.hashCode() * 31) + this.oiUsds.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.volCrypto.hashCode()) * 31) + this.volUsds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InterestAndTradingUnionItem(oiCrypto=" + this.oiCrypto + ", oiUsds=" + this.oiUsds + ", ts=" + this.ts + ", volCrypto=" + this.volCrypto + ", volUsds=" + this.volUsds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.data.InterestAndTradingUnionItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InterestAndTradingUnionItem> serializer() {
            return InterestAndTradingUnionItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InterestAndTradingUnionItem(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.oiCrypto = "";
        } else {
            this.oiCrypto = str;
        }
        if ((i & 2) == 0) {
            this.oiUsds = "";
        } else {
            this.oiUsds = str2;
        }
        if ((i & 4) == 0) {
            this.ts = "";
        } else {
            this.ts = str3;
        }
        if ((i & 8) == 0) {
            this.volCrypto = "";
        } else {
            this.volCrypto = str4;
        }
        if ((i & 16) == 0) {
            this.volUsds = "";
        } else {
            this.volUsds = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(InterestAndTradingUnionItem interestAndTradingUnionItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) interestAndTradingUnionItem.oiCrypto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, interestAndTradingUnionItem.oiCrypto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) interestAndTradingUnionItem.oiUsds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, interestAndTradingUnionItem.oiUsds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) interestAndTradingUnionItem.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, interestAndTradingUnionItem.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) interestAndTradingUnionItem.volCrypto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, interestAndTradingUnionItem.volCrypto);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) interestAndTradingUnionItem.volUsds, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, interestAndTradingUnionItem.volUsds);
    }

    public InterestAndTradingUnionItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.oiCrypto = str;
        this.oiUsds = str2;
        this.ts = str3;
        this.volCrypto = str4;
        this.volUsds = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:83) call: com.okinc.find_ui.data.InterestAndTradingUnionItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InterestAndTradingUnionItem(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
