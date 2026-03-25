package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FiatAmountDTO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String currencyCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FiatAmountDTO copy$default(FiatAmountDTO fiatAmountDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fiatAmountDTO.amount;
        }
        if ((i & 2) != 0) {
            str2 = fiatAmountDTO.currencyCode;
        }
        return fiatAmountDTO.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatAmountDTO copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FiatAmountDTO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiatAmountDTO)) {
            return false;
        }
        FiatAmountDTO fiatAmountDTO = (FiatAmountDTO) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) fiatAmountDTO.amount) && Intrinsics.EZpvd((Object) this.currencyCode, (Object) fiatAmountDTO.currencyCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.amount.hashCode() * 31) + this.currencyCode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatAmountDTO(amount=" + this.amount + ", currencyCode=" + this.currencyCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatAmountDTO> serializer() {
            return FiatAmountDTO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FiatAmountDTO(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FiatAmountDTO$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.currencyCode = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(FiatAmountDTO fiatAmountDTO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatAmountDTO.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatAmountDTO.currencyCode);
    }

    public FiatAmountDTO(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currencyCode = str2;
    }
}
