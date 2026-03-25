package com.okinc.business.web3pay.lib.core.network.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C31270lqp;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ClaimStatusSubResponse extends C31270lqp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String from;
    private final int opType;
    private final String orderId;
    private final String tokenAmount;
    private final String tokenSymbol;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClaimStatusSubResponse copy$default(ClaimStatusSubResponse claimStatusSubResponse, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = claimStatusSubResponse.orderId;
        }
        if ((i2 & 2) != 0) {
            str2 = claimStatusSubResponse.usdAmount;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = claimStatusSubResponse.tokenAmount;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = claimStatusSubResponse.tokenSymbol;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = claimStatusSubResponse.from;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = claimStatusSubResponse.opType;
        }
        return claimStatusSubResponse.copy(str, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimStatusSubResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ClaimStatusSubResponse(str, str2, str3, str4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimStatusSubResponse)) {
            return false;
        }
        ClaimStatusSubResponse claimStatusSubResponse = (ClaimStatusSubResponse) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) claimStatusSubResponse.orderId) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) claimStatusSubResponse.usdAmount) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) claimStatusSubResponse.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) claimStatusSubResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.from, (Object) claimStatusSubResponse.from) && this.opType == claimStatusSubResponse.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOpType() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.orderId.hashCode() * 31) + this.usdAmount.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.from.hashCode()) * 31) + Integer.hashCode(this.opType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClaimStatusSubResponse(orderId=" + this.orderId + ", usdAmount=" + this.usdAmount + ", tokenAmount=" + this.tokenAmount + ", tokenSymbol=" + this.tokenSymbol + ", from=" + this.from + ", opType=" + this.opType + ")";
    }

    public /* synthetic */ ClaimStatusSubResponse(int i, String str, String str2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ClaimStatusSubResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.usdAmount = str2;
        this.tokenAmount = str3;
        this.tokenSymbol = str4;
        this.from = str5;
        this.opType = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ClaimStatusSubResponse claimStatusSubResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, claimStatusSubResponse.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, claimStatusSubResponse.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, claimStatusSubResponse.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, claimStatusSubResponse.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, claimStatusSubResponse.from);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, claimStatusSubResponse.opType);
    }

    public ClaimStatusSubResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.orderId = str;
        this.usdAmount = str2;
        this.tokenAmount = str3;
        this.tokenSymbol = str4;
        this.from = str5;
        this.opType = i;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OPType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OPType[] $VALUES;
        private final int value;
        public static final OPType CLAIM_INCREASED = new OPType("CLAIM_INCREASED", 0, 1);
        public static final OPType CLAIM_DECREASED = new OPType("CLAIM_DECREASED", 1, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OPType[] $values() {
            return new OPType[]{CLAIM_INCREASED, CLAIM_DECREASED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OPType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private OPType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            OPType[] oPTypeArr$values = $values();
            $VALUES = oPTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oPTypeArr$values);
        }

        public static OPType valueOf(String str) {
            return (OPType) Enum.valueOf(OPType.class, str);
        }

        public static OPType[] values() {
            return (OPType[]) $VALUES.clone();
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.network.ws.ClaimStatusSubResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClaimStatusSubResponse> serializer() {
            return ClaimStatusSubResponse$$serializer.INSTANCE;
        }

        public final OPType copydefault(int i) {
            for (OPType oPType : OPType.values()) {
                if (oPType.getValue() == i) {
                    return oPType;
                }
            }
            return null;
        }
    }
}
