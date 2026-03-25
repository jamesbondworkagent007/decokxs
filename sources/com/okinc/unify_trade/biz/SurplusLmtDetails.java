package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SurplusLmtDetails implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String allAcctRemainingQuota;
    private final String curAcctRemainingQuota;
    private final String platRemainingQuota;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurplusLmtDetails() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SurplusLmtDetails copy$default(SurplusLmtDetails surplusLmtDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surplusLmtDetails.allAcctRemainingQuota;
        }
        if ((i & 2) != 0) {
            str2 = surplusLmtDetails.curAcctRemainingQuota;
        }
        if ((i & 4) != 0) {
            str3 = surplusLmtDetails.platRemainingQuota;
        }
        return surplusLmtDetails.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.allAcctRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.curAcctRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.platRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurplusLmtDetails copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SurplusLmtDetails(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurplusLmtDetails)) {
            return false;
        }
        SurplusLmtDetails surplusLmtDetails = (SurplusLmtDetails) obj;
        return Intrinsics.EZpvd((Object) this.allAcctRemainingQuota, (Object) surplusLmtDetails.allAcctRemainingQuota) && Intrinsics.EZpvd((Object) this.curAcctRemainingQuota, (Object) surplusLmtDetails.curAcctRemainingQuota) && Intrinsics.EZpvd((Object) this.platRemainingQuota, (Object) surplusLmtDetails.platRemainingQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAllAcctRemainingQuota() {
        return this.allAcctRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurAcctRemainingQuota() {
        return this.curAcctRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatRemainingQuota() {
        return this.platRemainingQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.allAcctRemainingQuota.hashCode() * 31) + this.curAcctRemainingQuota.hashCode()) * 31) + this.platRemainingQuota.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SurplusLmtDetails(allAcctRemainingQuota=" + this.allAcctRemainingQuota + ", curAcctRemainingQuota=" + this.curAcctRemainingQuota + ", platRemainingQuota=" + this.platRemainingQuota + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SurplusLmtDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SurplusLmtDetails> serializer() {
            return SurplusLmtDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SurplusLmtDetails(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.allAcctRemainingQuota = "";
        } else {
            this.allAcctRemainingQuota = str;
        }
        if ((i & 2) == 0) {
            this.curAcctRemainingQuota = "";
        } else {
            this.curAcctRemainingQuota = str2;
        }
        if ((i & 4) == 0) {
            this.platRemainingQuota = "";
        } else {
            this.platRemainingQuota = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SurplusLmtDetails surplusLmtDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) surplusLmtDetails.allAcctRemainingQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, surplusLmtDetails.allAcctRemainingQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) surplusLmtDetails.curAcctRemainingQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, surplusLmtDetails.curAcctRemainingQuota);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) surplusLmtDetails.platRemainingQuota, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, surplusLmtDetails.platRemainingQuota);
    }

    public SurplusLmtDetails(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.allAcctRemainingQuota = str;
        this.curAcctRemainingQuota = str2;
        this.platRemainingQuota = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:143) call: com.okinc.unify_trade.biz.SurplusLmtDetails.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SurplusLmtDetails(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
