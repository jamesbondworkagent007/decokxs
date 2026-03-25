package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
    public static final Companion Companion = new Companion(null);
    private final String friendlyDeviceName;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AWSCognitoAuthVerifyTOTPSetupOptions(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFriendlyDeviceName() {
        return this.friendlyDeviceName;
    }

    private AWSCognitoAuthVerifyTOTPSetupOptions(String str) {
        this.friendlyDeviceName = str;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthVerifyTOTPSetupOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public static final class CognitoBuilder extends AuthVerifyTOTPSetupOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder friendlyDeviceName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.friendlyDeviceName = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthVerifyTOTPSetupOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthVerifyTOTPSetupOptions; */
        @Override // com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions.Builder
        public AWSCognitoAuthVerifyTOTPSetupOptions build() {
            return new AWSCognitoAuthVerifyTOTPSetupOptions(this.friendlyDeviceName, null);
        }
    }
}
