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
public final class QueryC2BExchangeRateResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fromAmount;
    private final String price;
    private final long quoteExpireTime;
    private final String quoteId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryC2BExchangeRateResponse copy$default(QueryC2BExchangeRateResponse queryC2BExchangeRateResponse, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryC2BExchangeRateResponse.fromAmount;
        }
        if ((i & 2) != 0) {
            str2 = queryC2BExchangeRateResponse.price;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = queryC2BExchangeRateResponse.quoteId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = queryC2BExchangeRateResponse.quoteExpireTime;
        }
        return queryC2BExchangeRateResponse.copy(str, str4, str5, j);
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
    public final QueryC2BExchangeRateResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new QueryC2BExchangeRateResponse(str, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryC2BExchangeRateResponse)) {
            return false;
        }
        QueryC2BExchangeRateResponse queryC2BExchangeRateResponse = (QueryC2BExchangeRateResponse) obj;
        return Intrinsics.EZpvd((Object) this.fromAmount, (Object) queryC2BExchangeRateResponse.fromAmount) && Intrinsics.EZpvd((Object) this.price, (Object) queryC2BExchangeRateResponse.price) && Intrinsics.EZpvd((Object) this.quoteId, (Object) queryC2BExchangeRateResponse.quoteId) && this.quoteExpireTime == queryC2BExchangeRateResponse.quoteExpireTime;
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
    public int hashCode() {
        return (((((this.fromAmount.hashCode() * 31) + this.price.hashCode()) * 31) + this.quoteId.hashCode()) * 31) + Long.hashCode(this.quoteExpireTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryC2BExchangeRateResponse(fromAmount=" + this.fromAmount + ", price=" + this.price + ", quoteId=" + this.quoteId + ", quoteExpireTime=" + this.quoteExpireTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.QueryC2BExchangeRateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QueryC2BExchangeRateResponse> serializer() {
            return QueryC2BExchangeRateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QueryC2BExchangeRateResponse(int i, String str, String str2, String str3, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, QueryC2BExchangeRateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.fromAmount = str;
        this.price = str2;
        this.quoteId = str3;
        this.quoteExpireTime = j;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(QueryC2BExchangeRateResponse queryC2BExchangeRateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, queryC2BExchangeRateResponse.fromAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, queryC2BExchangeRateResponse.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, queryC2BExchangeRateResponse.quoteId);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, queryC2BExchangeRateResponse.quoteExpireTime);
    }

    public QueryC2BExchangeRateResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fromAmount = str;
        this.price = str2;
        this.quoteId = str3;
        this.quoteExpireTime = j;
    }
}
