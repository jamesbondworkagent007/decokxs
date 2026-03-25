package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface StoreClientBehavior {
    Object clearCredentials(@NotNull CredentialType credentialType, @NotNull Continuation<? super Unit> continuation);

    Object loadCredentials(@NotNull CredentialType credentialType, @NotNull Continuation<? super AmplifyCredential> continuation);

    Object storeCredentials(@NotNull CredentialType credentialType, @NotNull AmplifyCredential amplifyCredential, @NotNull Continuation<? super Unit> continuation);
}
