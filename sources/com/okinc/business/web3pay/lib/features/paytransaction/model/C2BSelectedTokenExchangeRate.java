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
public final class C2BSelectedTokenExchangeRate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fromAmount;
    private final String price;
    private final long quoteExpireTime;
    private final String quoteId;
    private final String toAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2BSelectedTokenExchangeRate copy$default(C2BSelectedTokenExchangeRate c2BSelectedTokenExchangeRate, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2BSelectedTokenExchangeRate.fromAmount;
        }
        if ((i & 2) != 0) {
            str2 = c2BSelectedTokenExchangeRate.price;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c2BSelectedTokenExchangeRate.quoteId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            j = c2BSelectedTokenExchangeRate.quoteExpireTime;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = c2BSelectedTokenExchangeRate.toAmount;
        }
        return c2BSelectedTokenExchangeRate.copy(str, str5, str6, j2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.quoteExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2BSelectedTokenExchangeRate copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C2BSelectedTokenExchangeRate(str, str2, str3, j, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2BSelectedTokenExchangeRate)) {
            return false;
        }
        C2BSelectedTokenExchangeRate c2BSelectedTokenExchangeRate = (C2BSelectedTokenExchangeRate) obj;
        return Intrinsics.EZpvd((Object) this.fromAmount, (Object) c2BSelectedTokenExchangeRate.fromAmount) && Intrinsics.EZpvd((Object) this.price, (Object) c2BSelectedTokenExchangeRate.price) && Intrinsics.EZpvd((Object) this.quoteId, (Object) c2BSelectedTokenExchangeRate.quoteId) && this.quoteExpireTime == c2BSelectedTokenExchangeRate.quoteExpireTime && Intrinsics.EZpvd((Object) this.toAmount, (Object) c2BSelectedTokenExchangeRate.toAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getQuoteExpireTime() {
        return this.quoteExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.fromAmount.hashCode() * 31) + this.price.hashCode()) * 31) + this.quoteId.hashCode()) * 31) + Long.hashCode(this.quoteExpireTime)) * 31) + this.toAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "C2BSelectedTokenExchangeRate(fromAmount=" + this.fromAmount + ", price=" + this.price + ", quoteId=" + this.quoteId + ", quoteExpireTime=" + this.quoteExpireTime + ", toAmount=" + this.toAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.C2BSelectedTokenExchangeRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C2BSelectedTokenExchangeRate> serializer() {
            return C2BSelectedTokenExchangeRate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ C2BSelectedTokenExchangeRate(int i, String str, String str2, String str3, long j, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, C2BSelectedTokenExchangeRate$$serializer.INSTANCE.getDescriptor());
        }
        this.fromAmount = str;
        this.price = str2;
        this.quoteId = str3;
        this.quoteExpireTime = j;
        this.toAmount = str4;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(C2BSelectedTokenExchangeRate c2BSelectedTokenExchangeRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, c2BSelectedTokenExchangeRate.fromAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, c2BSelectedTokenExchangeRate.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, c2BSelectedTokenExchangeRate.quoteId);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, c2BSelectedTokenExchangeRate.quoteExpireTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, c2BSelectedTokenExchangeRate.toAmount);
    }

    public C2BSelectedTokenExchangeRate(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.fromAmount = str;
        this.price = str2;
        this.quoteId = str3;
        this.quoteExpireTime = j;
        this.toAmount = str4;
    }
}
