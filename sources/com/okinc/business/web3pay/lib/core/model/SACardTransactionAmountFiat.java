package com.okinc.business.web3pay.lib.core.model;

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
public final class SACardTransactionAmountFiat {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String amount;
    public final String currency;
    public final String currencySymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SACardTransactionAmountFiat copy$default(SACardTransactionAmountFiat sACardTransactionAmountFiat, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sACardTransactionAmountFiat.amount;
        }
        if ((i & 2) != 0) {
            str2 = sACardTransactionAmountFiat.currency;
        }
        if ((i & 4) != 0) {
            str3 = sACardTransactionAmountFiat.currencySymbol;
        }
        return sACardTransactionAmountFiat.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SACardTransactionAmountFiat OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SACardTransactionAmountFiat(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SACardTransactionAmountFiat)) {
            return false;
        }
        SACardTransactionAmountFiat sACardTransactionAmountFiat = (SACardTransactionAmountFiat) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) sACardTransactionAmountFiat.amount) && Intrinsics.EZpvd((Object) this.currency, (Object) sACardTransactionAmountFiat.currency) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) sACardTransactionAmountFiat.currencySymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.amount.hashCode() * 31) + this.currency.hashCode()) * 31) + this.currencySymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SACardTransactionAmountFiat(amount=" + this.amount + ", currency=" + this.currency + ", currencySymbol=" + this.currencySymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.SACardTransactionAmountFiat.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SACardTransactionAmountFiat> serializer() {
            return SACardTransactionAmountFiat$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SACardTransactionAmountFiat(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SACardTransactionAmountFiat$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.currency = str2;
        this.currencySymbol = str3;
    }

    public static final /* synthetic */ void copydefault(SACardTransactionAmountFiat sACardTransactionAmountFiat, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sACardTransactionAmountFiat.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sACardTransactionAmountFiat.currency);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, sACardTransactionAmountFiat.currencySymbol);
    }

    public SACardTransactionAmountFiat(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.currency = str2;
        this.currencySymbol = str3;
    }
}
