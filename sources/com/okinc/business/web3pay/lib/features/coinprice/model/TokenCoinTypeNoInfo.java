package com.okinc.business.web3pay.lib.features.coinprice.model;

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
public final class TokenCoinTypeNoInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String price;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenCoinTypeNoInfo copy$default(TokenCoinTypeNoInfo tokenCoinTypeNoInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenCoinTypeNoInfo.tokenCoinTypeNo;
        }
        if ((i & 2) != 0) {
            str2 = tokenCoinTypeNoInfo.price;
        }
        return tokenCoinTypeNoInfo.copy(str, str2);
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
    public final TokenCoinTypeNoInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TokenCoinTypeNoInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCoinTypeNoInfo)) {
            return false;
        }
        TokenCoinTypeNoInfo tokenCoinTypeNoInfo = (TokenCoinTypeNoInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) tokenCoinTypeNoInfo.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.price, (Object) tokenCoinTypeNoInfo.price);
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
        return "TokenCoinTypeNoInfo(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", price=" + this.price + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.coinprice.model.TokenCoinTypeNoInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenCoinTypeNoInfo> serializer() {
            return TokenCoinTypeNoInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenCoinTypeNoInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TokenCoinTypeNoInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNo = str;
        this.price = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenCoinTypeNoInfo tokenCoinTypeNoInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenCoinTypeNoInfo.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenCoinTypeNoInfo.price);
    }

    public TokenCoinTypeNoInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenCoinTypeNo = str;
        this.price = str2;
    }
}
