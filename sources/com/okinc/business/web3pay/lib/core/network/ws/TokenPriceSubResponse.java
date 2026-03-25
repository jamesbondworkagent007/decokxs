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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenPriceSubResponse extends C31270lqp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String price;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenPriceSubResponse copy$default(TokenPriceSubResponse tokenPriceSubResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenPriceSubResponse.tokenCoinTypeNo;
        }
        if ((i & 2) != 0) {
            str2 = tokenPriceSubResponse.price;
        }
        return tokenPriceSubResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPriceSubResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TokenPriceSubResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenPriceSubResponse)) {
            return false;
        }
        TokenPriceSubResponse tokenPriceSubResponse = (TokenPriceSubResponse) obj;
        return Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) tokenPriceSubResponse.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.price, (Object) tokenPriceSubResponse.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tokenCoinTypeNo.hashCode() * 31) + this.price.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenPriceSubResponse(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", price=" + this.price + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.network.ws.TokenPriceSubResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenPriceSubResponse> serializer() {
            return TokenPriceSubResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenPriceSubResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TokenPriceSubResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNo = str;
        this.price = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenPriceSubResponse tokenPriceSubResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenPriceSubResponse.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenPriceSubResponse.price);
    }

    public TokenPriceSubResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenCoinTypeNo = str;
        this.price = str2;
    }
}
