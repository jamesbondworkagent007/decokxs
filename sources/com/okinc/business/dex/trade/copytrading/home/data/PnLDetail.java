package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PnLDetail {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String pnLPercent;
    private final String pnLUsdValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLDetail() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PnLDetail copy$default(PnLDetail pnLDetail, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnLDetail.pnLUsdValue;
        }
        if ((i & 2) != 0) {
            str2 = pnLDetail.pnLPercent;
        }
        return pnLDetail.copy(str, str2);
    }

    @SerialName("pnLPercent")
    public static /* synthetic */ void getPnLPercent$annotations() {
    }

    @SerialName("pnlUsdValue")
    public static /* synthetic */ void getPnLUsdValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnLPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PnLDetail(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnLDetail)) {
            return false;
        }
        PnLDetail pnLDetail = (PnLDetail) obj;
        return Intrinsics.EZpvd((Object) this.pnLUsdValue, (Object) pnLDetail.pnLUsdValue) && Intrinsics.EZpvd((Object) this.pnLPercent, (Object) pnLDetail.pnLPercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnLPercent() {
        return this.pnLPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnLUsdValue() {
        return this.pnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.pnLUsdValue.hashCode() * 31) + this.pnLPercent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLDetail(pnLUsdValue=" + this.pnLUsdValue + ", pnLPercent=" + this.pnLPercent + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.PnLDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PnLDetail> serializer() {
            return PnLDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PnLDetail(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pnLUsdValue = "";
        } else {
            this.pnLUsdValue = str;
        }
        if ((i & 2) == 0) {
            this.pnLPercent = "";
        } else {
            this.pnLPercent = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PnLDetail pnLDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pnLDetail.pnLUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pnLDetail.pnLUsdValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) pnLDetail.pnLPercent, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pnLDetail.pnLPercent);
    }

    public PnLDetail(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pnLUsdValue = str;
        this.pnLPercent = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:75) call: com.okinc.business.dex.trade.copytrading.home.data.PnLDetail.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PnLDetail(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
