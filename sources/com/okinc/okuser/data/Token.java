package com.okinc.okuser.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Token {
    public static final int $stable = 0;
    private final TokenType type;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, TokenType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Token copy$default(Token token, String str, TokenType tokenType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.value;
        }
        if ((i & 2) != 0) {
            tokenType = token.type;
        }
        return token.copy(str, tokenType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Token copy(@NotNull String str, @NotNull TokenType tokenType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        return new Token(str, tokenType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) token.value) && this.type == token.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.value.hashCode() * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Token(value=" + this.value + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.Token.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Token> serializer() {
            return Token$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Token(int i, String str, TokenType tokenType, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Token$$serializer.INSTANCE.getDescriptor());
        }
        this.value = str;
        this.type = tokenType;
    }

    public static final /* synthetic */ void write$Self$OKUser_okuser(Token token, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, token.value);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], token.type);
    }

    public Token(@NotNull String str, @NotNull TokenType tokenType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        this.value = str;
        this.type = tokenType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Token(@NotNull String str, String str2) {
        this(str, str2 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str2) : null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Token(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        TokenType tokenType = TokenType.DEMO_TRADING;
        this(str, (num == null || num.intValue() != tokenType.getHeaderValue()) ? TokenType.LIVE_TRADING : tokenType);
    }
}
