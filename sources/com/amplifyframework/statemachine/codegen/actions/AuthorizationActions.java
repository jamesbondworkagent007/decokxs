package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthorizationActions {
    Action configureAuthorizationAction();

    Action initializeFederationToIdentityPool(@NotNull FederatedToken federatedToken, String str);

    Action initializeFetchAuthSession(@NotNull SignedInData signedInData);

    Action initializeFetchUnAuthSession();

    Action initiateDeleteUser(@NotNull DeleteUserEvent.EventType.DeleteUser deleteUser);

    Action initiateRefreshSessionAction(@NotNull AmplifyCredential amplifyCredential);

    Action persistCredentials(@NotNull AmplifyCredential amplifyCredential);
}
