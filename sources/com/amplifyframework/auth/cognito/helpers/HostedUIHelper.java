package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIProviderInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HostedUIHelper {
    public static final HostedUIHelper INSTANCE = new HostedUIHelper();

    private HostedUIHelper() {
    }

    public final HostedUIOptions createHostedUIOptions(@NotNull Activity activity, AuthProvider authProvider, @NotNull AuthWebUISignInOptions authWebUISignInOptions) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(authWebUISignInOptions, "");
        List<String> scopes = authWebUISignInOptions.getScopes();
        boolean z = authWebUISignInOptions instanceof AWSCognitoAuthWebUISignInOptions;
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = z ? (AWSCognitoAuthWebUISignInOptions) authWebUISignInOptions : null;
        HostedUIProviderInfo hostedUIProviderInfo = new HostedUIProviderInfo(authProvider, aWSCognitoAuthWebUISignInOptions != null ? aWSCognitoAuthWebUISignInOptions.getIdpIdentifier() : null);
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions2 = z ? (AWSCognitoAuthWebUISignInOptions) authWebUISignInOptions : null;
        return new HostedUIOptions(activity, scopes, hostedUIProviderInfo, aWSCognitoAuthWebUISignInOptions2 != null ? aWSCognitoAuthWebUISignInOptions2.getBrowserPackage() : null);
    }
}
