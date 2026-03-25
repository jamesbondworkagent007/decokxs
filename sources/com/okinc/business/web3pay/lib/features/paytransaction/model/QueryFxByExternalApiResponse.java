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
public final class QueryFxByExternalApiResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String exchangeRate;
    private final long expiryTime;
    private final RateObj rateObj;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryFxByExternalApiResponse copy$default(QueryFxByExternalApiResponse queryFxByExternalApiResponse, String str, RateObj rateObj, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryFxByExternalApiResponse.exchangeRate;
        }
        if ((i & 2) != 0) {
            rateObj = queryFxByExternalApiResponse.rateObj;
        }
        if ((i & 4) != 0) {
            j = queryFxByExternalApiResponse.expiryTime;
        }
        return queryFxByExternalApiResponse.copy(str, rateObj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateObj component2() {
        return this.rateObj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryFxByExternalApiResponse copy(@NotNull String str, @NotNull RateObj rateObj, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rateObj, "");
        return new QueryFxByExternalApiResponse(str, rateObj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryFxByExternalApiResponse)) {
            return false;
        }
        QueryFxByExternalApiResponse queryFxByExternalApiResponse = (QueryFxByExternalApiResponse) obj;
        return Intrinsics.EZpvd((Object) this.exchangeRate, (Object) queryFxByExternalApiResponse.exchangeRate) && Intrinsics.EZpvd(this.rateObj, queryFxByExternalApiResponse.rateObj) && this.expiryTime == queryFxByExternalApiResponse.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateObj getRateObj() {
        return this.rateObj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.exchangeRate.hashCode() * 31) + this.rateObj.hashCode()) * 31) + Long.hashCode(this.expiryTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryFxByExternalApiResponse(exchangeRate=" + this.exchangeRate + ", rateObj=" + this.rateObj + ", expiryTime=" + this.expiryTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QueryFxByExternalApiResponse> serializer() {
            return QueryFxByExternalApiResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QueryFxByExternalApiResponse(int i, String str, RateObj rateObj, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, QueryFxByExternalApiResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.exchangeRate = str;
        this.rateObj = rateObj;
        this.expiryTime = j;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(QueryFxByExternalApiResponse queryFxByExternalApiResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, queryFxByExternalApiResponse.exchangeRate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, RateObj$$serializer.INSTANCE, queryFxByExternalApiResponse.rateObj);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, queryFxByExternalApiResponse.expiryTime);
    }

    public QueryFxByExternalApiResponse(@NotNull String str, @NotNull RateObj rateObj, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rateObj, "");
        this.exchangeRate = str;
        this.rateObj = rateObj;
        this.expiryTime = j;
    }
}
