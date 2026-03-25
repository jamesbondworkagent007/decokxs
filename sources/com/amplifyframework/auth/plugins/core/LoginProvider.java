package com.amplifyframework.auth.plugins.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Serializable
public final class LoginProvider {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final String userIdentifier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoginProvider copy$default(LoginProvider loginProvider, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginProvider.name;
        }
        if ((i & 2) != 0) {
            str2 = loginProvider.userIdentifier;
        }
        return loginProvider.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoginProvider copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LoginProvider(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginProvider)) {
            return false;
        }
        LoginProvider loginProvider = (LoginProvider) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) loginProvider.name) && Intrinsics.EZpvd((Object) this.userIdentifier, (Object) loginProvider.userIdentifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserIdentifier() {
        return this.userIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + this.userIdentifier.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoginProvider(name=" + this.name + ", userIdentifier=" + this.userIdentifier + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.plugins.core.LoginProvider.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoginProvider> serializer() {
            return LoginProvider$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoginProvider(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, LoginProvider$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.userIdentifier = str2;
    }

    public LoginProvider(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.userIdentifier = str2;
    }

    public static final /* synthetic */ void write$Self(LoginProvider loginProvider, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, loginProvider.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, loginProvider.userIdentifier);
    }
}
