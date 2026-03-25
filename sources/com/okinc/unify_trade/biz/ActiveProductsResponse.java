package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ActiveProductsResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String meta;
    private final String product;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActiveProductsResponse copy$default(ActiveProductsResponse activeProductsResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeProductsResponse.product;
        }
        if ((i & 2) != 0) {
            str2 = activeProductsResponse.meta;
        }
        return activeProductsResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.product;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActiveProductsResponse copy(String str, String str2) {
        return new ActiveProductsResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveProductsResponse)) {
            return false;
        }
        ActiveProductsResponse activeProductsResponse = (ActiveProductsResponse) obj;
        return Intrinsics.EZpvd((Object) this.product, (Object) activeProductsResponse.product) && Intrinsics.EZpvd((Object) this.meta, (Object) activeProductsResponse.meta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProduct() {
        return this.product;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.product;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.meta;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActiveProductsResponse(product=" + this.product + ", meta=" + this.meta + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ActiveProductsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActiveProductsResponse> serializer() {
            return ActiveProductsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActiveProductsResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ActiveProductsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.product = str;
        this.meta = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ActiveProductsResponse activeProductsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, activeProductsResponse.product);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, activeProductsResponse.meta);
    }

    public ActiveProductsResponse(String str, String str2) {
        this.product = str;
        this.meta = str2;
    }
}
