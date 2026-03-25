package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3SubscribeInputToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String inputAmount;
    private final String inputTokenAddress;
    private final String tokenDecimal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3SubscribeInputToken copy$default(InvestUniv3SubscribeInputToken investUniv3SubscribeInputToken, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investUniv3SubscribeInputToken.inputAmount;
        }
        if ((i & 2) != 0) {
            str2 = investUniv3SubscribeInputToken.inputTokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = investUniv3SubscribeInputToken.tokenDecimal;
        }
        return investUniv3SubscribeInputToken.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inputAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeInputToken copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestUniv3SubscribeInputToken(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestUniv3SubscribeInputToken)) {
            return false;
        }
        InvestUniv3SubscribeInputToken investUniv3SubscribeInputToken = (InvestUniv3SubscribeInputToken) obj;
        return Intrinsics.EZpvd((Object) this.inputAmount, (Object) investUniv3SubscribeInputToken.inputAmount) && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) investUniv3SubscribeInputToken.inputTokenAddress) && Intrinsics.EZpvd((Object) this.tokenDecimal, (Object) investUniv3SubscribeInputToken.tokenDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputAmount() {
        return this.inputAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputTokenAddress() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.inputAmount.hashCode() * 31) + this.inputTokenAddress.hashCode()) * 31) + this.tokenDecimal.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribeInputToken(inputAmount=" + this.inputAmount + ", inputTokenAddress=" + this.inputTokenAddress + ", tokenDecimal=" + this.tokenDecimal + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInputToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribeInputToken> serializer() {
            return InvestUniv3SubscribeInputToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3SubscribeInputToken(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InvestUniv3SubscribeInputToken$$serializer.INSTANCE.getDescriptor());
        }
        this.inputAmount = str;
        this.inputTokenAddress = str2;
        this.tokenDecimal = str3;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribeInputToken investUniv3SubscribeInputToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUniv3SubscribeInputToken.inputAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3SubscribeInputToken.inputTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3SubscribeInputToken.tokenDecimal);
    }

    public InvestUniv3SubscribeInputToken(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.inputAmount = str;
        this.inputTokenAddress = str2;
        this.tokenDecimal = str3;
    }
}
