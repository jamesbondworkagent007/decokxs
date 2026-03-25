package com.amplifyframework.auth.cognito.options;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FederateToIdentityPoolOptions {
    public static final Companion Companion = new Companion(null);
    private final String developerProvidedIdentityId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FederateToIdentityPoolOptions copy$default(FederateToIdentityPoolOptions federateToIdentityPoolOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federateToIdentityPoolOptions.developerProvidedIdentityId;
        }
        return federateToIdentityPoolOptions.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.developerProvidedIdentityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FederateToIdentityPoolOptions copy(String str) {
        return new FederateToIdentityPoolOptions(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FederateToIdentityPoolOptions) && Intrinsics.EZpvd((Object) this.developerProvidedIdentityId, (Object) ((FederateToIdentityPoolOptions) obj).developerProvidedIdentityId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeveloperProvidedIdentityId() {
        return this.developerProvidedIdentityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.developerProvidedIdentityId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FederateToIdentityPoolOptions(developerProvidedIdentityId=" + this.developerProvidedIdentityId + ")";
    }

    public FederateToIdentityPoolOptions(String str) {
        this.developerProvidedIdentityId = str;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CognitoBuilder {
        private String developerProvidedIdentityId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder developerProvidedIdentityId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.developerProvidedIdentityId = str;
            return this;
        }

        public final FederateToIdentityPoolOptions build() {
            return new FederateToIdentityPoolOptions(this.developerProvidedIdentityId);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final FederateToIdentityPoolOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }
}
