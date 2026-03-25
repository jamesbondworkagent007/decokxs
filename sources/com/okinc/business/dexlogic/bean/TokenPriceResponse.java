package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenPriceResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final double change24H;
    public final double price;
    public final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenPriceResponse copy$default(TokenPriceResponse tokenPriceResponse, String str, String str2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenPriceResponse.chainId;
        }
        if ((i & 2) != 0) {
            str2 = tokenPriceResponse.tokenContractAddress;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = tokenPriceResponse.price;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = tokenPriceResponse.change24H;
        }
        return tokenPriceResponse.KWHzl(str, str3, d3, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPriceResponse KWHzl(@NotNull String str, @NotNull String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TokenPriceResponse(str, str2, d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenPriceResponse)) {
            return false;
        }
        TokenPriceResponse tokenPriceResponse = (TokenPriceResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenPriceResponse.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenPriceResponse.tokenContractAddress) && Double.compare(this.price, tokenPriceResponse.price) == 0 && Double.compare(this.change24H, tokenPriceResponse.change24H) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.change24H);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenPriceResponse(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", price=" + this.price + ", change24H=" + this.change24H + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TokenPriceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenPriceResponse> serializer() {
            return TokenPriceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenPriceResponse(int i, String str, String str2, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TokenPriceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.price = d;
        this.change24H = d2;
    }

    public static final /* synthetic */ void EZpvd(TokenPriceResponse tokenPriceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenPriceResponse.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenPriceResponse.tokenContractAddress);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 2, tokenPriceResponse.price);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 3, tokenPriceResponse.change24H);
    }

    public TokenPriceResponse(@NotNull String str, @NotNull String str2, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.price = d;
        this.change24H = d2;
    }
}
