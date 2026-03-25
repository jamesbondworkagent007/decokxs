package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FederatedToken {
    public static final Companion Companion = new Companion(null);
    private final String providerName;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FederatedToken copy$default(FederatedToken federatedToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federatedToken.token;
        }
        if ((i & 2) != 0) {
            str2 = federatedToken.providerName;
        }
        return federatedToken.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.providerName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FederatedToken copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FederatedToken(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederatedToken)) {
            return false;
        }
        FederatedToken federatedToken = (FederatedToken) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) federatedToken.token) && Intrinsics.EZpvd((Object) this.providerName, (Object) federatedToken.providerName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.token.hashCode() * 31) + this.providerName.hashCode();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.FederatedToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FederatedToken> serializer() {
            return FederatedToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FederatedToken(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FederatedToken$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.providerName = str2;
    }

    public FederatedToken(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.token = str;
        this.providerName = str2;
    }

    public static final /* synthetic */ void write$Self(FederatedToken federatedToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, federatedToken.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, federatedToken.providerName);
    }

    public String toString() {
        return "FederatedToken(token = " + StringsKt__StringsKt.KWHzl(this.token, new IntRange(0, 4)) + "***, providerName = " + this.providerName + ")";
    }
}
