package com.okinc.social_trade_api.data;

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
public final class LeadCurrentPosSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String detailsPosSize;
    private final String summaryPosSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeadCurrentPosSize() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LeadCurrentPosSize copy$default(LeadCurrentPosSize leadCurrentPosSize, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadCurrentPosSize.detailsPosSize;
        }
        if ((i & 2) != 0) {
            str2 = leadCurrentPosSize.summaryPosSize;
        }
        return leadCurrentPosSize.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.detailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.summaryPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeadCurrentPosSize copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LeadCurrentPosSize(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCurrentPosSize)) {
            return false;
        }
        LeadCurrentPosSize leadCurrentPosSize = (LeadCurrentPosSize) obj;
        return Intrinsics.EZpvd((Object) this.detailsPosSize, (Object) leadCurrentPosSize.detailsPosSize) && Intrinsics.EZpvd((Object) this.summaryPosSize, (Object) leadCurrentPosSize.summaryPosSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailsPosSize() {
        return this.detailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummaryPosSize() {
        return this.summaryPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.detailsPosSize.hashCode() * 31) + this.summaryPosSize.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeadCurrentPosSize(detailsPosSize=" + this.detailsPosSize + ", summaryPosSize=" + this.summaryPosSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.LeadCurrentPosSize.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LeadCurrentPosSize> serializer() {
            return LeadCurrentPosSize$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LeadCurrentPosSize(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.detailsPosSize = "";
        } else {
            this.detailsPosSize = str;
        }
        if ((i & 2) == 0) {
            this.summaryPosSize = "";
        } else {
            this.summaryPosSize = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LeadCurrentPosSize leadCurrentPosSize, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) leadCurrentPosSize.detailsPosSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, leadCurrentPosSize.detailsPosSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) leadCurrentPosSize.summaryPosSize, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, leadCurrentPosSize.summaryPosSize);
    }

    public LeadCurrentPosSize(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.detailsPosSize = str;
        this.summaryPosSize = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:59) call: com.okinc.social_trade_api.data.LeadCurrentPosSize.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LeadCurrentPosSize(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
