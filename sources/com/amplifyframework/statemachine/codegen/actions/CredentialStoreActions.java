package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CredentialStoreActions {
    Action clearCredentialStoreAction(@NotNull CredentialType credentialType);

    Action loadCredentialStoreAction(@NotNull CredentialType credentialType);

    Action migrateLegacyCredentialStoreAction();

    Action moveToIdleStateAction();

    Action storeCredentialsAction(@NotNull CredentialType credentialType, @NotNull AmplifyCredential amplifyCredential);
}
