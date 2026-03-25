package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface FetchAuthSessionActions {
    Action fetchAWSCredentialsAction(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider);

    Action fetchIdentityAction(@NotNull LoginsMapProvider loginsMapProvider);

    Action notifySessionEstablishedAction(@NotNull String str, @NotNull AWSCredentials aWSCredentials);

    Action notifySessionRefreshedAction(@NotNull AmplifyCredential amplifyCredential);

    Action refreshAuthSessionAction(@NotNull LoginsMapProvider loginsMapProvider);

    Action refreshUserPoolTokensAction(@NotNull SignedInData signedInData);
}
