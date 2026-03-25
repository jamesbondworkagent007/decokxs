package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreEnvironment implements Environment {
    private final AWSCognitoAuthCredentialStore credentialStore;
    private final AWSCognitoLegacyCredentialStore legacyCredentialStore;
    private final Logger logger;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthCredentialStore getCredentialStore() {
        return this.credentialStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoLegacyCredentialStore getLegacyCredentialStore() {
        return this.legacyCredentialStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger getLogger() {
        return this.logger;
    }

    public CredentialStoreEnvironment(@NotNull AWSCognitoAuthCredentialStore aWSCognitoAuthCredentialStore, @NotNull AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(aWSCognitoAuthCredentialStore, "");
        Intrinsics.checkNotNullParameter(aWSCognitoLegacyCredentialStore, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.credentialStore = aWSCognitoAuthCredentialStore;
        this.legacyCredentialStore = aWSCognitoLegacyCredentialStore;
        this.logger = logger;
    }
}
