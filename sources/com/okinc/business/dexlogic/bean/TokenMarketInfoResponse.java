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
public final class TokenMarketInfoResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String circulatingSupply;
    public final String marketCap;
    public final String tokenContractAddress;
    public final String totalLiquidity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenMarketInfoResponse copy$default(TokenMarketInfoResponse tokenMarketInfoResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenMarketInfoResponse.chainId;
        }
        if ((i & 2) != 0) {
            str2 = tokenMarketInfoResponse.tokenContractAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tokenMarketInfoResponse.marketCap;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tokenMarketInfoResponse.totalLiquidity;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tokenMarketInfoResponse.circulatingSupply;
        }
        return tokenMarketInfoResponse.copydefault(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenMarketInfoResponse copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenMarketInfoResponse(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenMarketInfoResponse)) {
            return false;
        }
        TokenMarketInfoResponse tokenMarketInfoResponse = (TokenMarketInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenMarketInfoResponse.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenMarketInfoResponse.tokenContractAddress) && Intrinsics.EZpvd((Object) this.marketCap, (Object) tokenMarketInfoResponse.marketCap) && Intrinsics.EZpvd((Object) this.totalLiquidity, (Object) tokenMarketInfoResponse.totalLiquidity) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) tokenMarketInfoResponse.circulatingSupply);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.totalLiquidity.hashCode()) * 31) + this.circulatingSupply.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenMarketInfoResponse(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", marketCap=" + this.marketCap + ", totalLiquidity=" + this.totalLiquidity + ", circulatingSupply=" + this.circulatingSupply + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TokenMarketInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenMarketInfoResponse> serializer() {
            return TokenMarketInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenMarketInfoResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TokenMarketInfoResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.marketCap = str3;
        this.totalLiquidity = str4;
        this.circulatingSupply = str5;
    }

    public static final /* synthetic */ void OLrzqt(TokenMarketInfoResponse tokenMarketInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenMarketInfoResponse.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenMarketInfoResponse.tokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenMarketInfoResponse.marketCap);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenMarketInfoResponse.totalLiquidity);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenMarketInfoResponse.circulatingSupply);
    }

    public TokenMarketInfoResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.marketCap = str3;
        this.totalLiquidity = str4;
        this.circulatingSupply = str5;
    }
}
