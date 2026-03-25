package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchAuthSessionCognitoActions implements FetchAuthSessionActions {
    public static final FetchAuthSessionCognitoActions INSTANCE = new FetchAuthSessionCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_REFRESH_TOKEN = "REFRESH_TOKEN";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";

    private FetchAuthSessionCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshUserPoolTokensAction(@NotNull SignedInData signedInData) {
        Intrinsics.checkNotNullParameter(signedInData, "");
        Action.Companion companion = Action.Companion;
        return new FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1("RefreshUserPoolTokens", signedInData);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshAuthSessionAction(@NotNull final LoginsMapProvider loginsMapProvider) {
        Intrinsics.checkNotNullParameter(loginsMapProvider, "");
        Action.Companion companion = Action.Companion;
        final String str = "RefreshAuthSession";
        return new Action(str, loginsMapProvider) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshAuthSessionAction$$inlined$invoke$1
            final /* synthetic */ LoginsMapProvider $logins$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$logins$inlined = loginsMapProvider;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                FetchAuthSessionEvent fetchAuthSessionEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(this.$logins$inlined), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + fetchAuthSessionEvent.getType());
                eventDispatcher.send(fetchAuthSessionEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchIdentityAction(@NotNull LoginsMapProvider loginsMapProvider) {
        Intrinsics.checkNotNullParameter(loginsMapProvider, "");
        Action.Companion companion = Action.Companion;
        return new FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1("FetchIdentity", loginsMapProvider);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchAWSCredentialsAction(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(loginsMapProvider, "");
        Action.Companion companion = Action.Companion;
        return new FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1("FetchAWSCredentials", str, loginsMapProvider);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionEstablishedAction(@NotNull final String str, @NotNull final AWSCredentials aWSCredentials) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aWSCredentials, "");
        Action.Companion companion = Action.Companion;
        final String str2 = "NotifySessionEstablished";
        return new Action(str2, str, aWSCredentials) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionEstablishedAction$$inlined$invoke$1
            final /* synthetic */ AWSCredentials $awsCredentials$inlined;
            final /* synthetic */ String $identityId$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$identityId$inlined = str;
                this.$awsCredentials$inlined = aWSCredentials;
                this.id = str2 == null ? Action.DefaultImpls.getId(this) : str2;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Fetched(this.$identityId$inlined, this.$awsCredentials$inlined), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher.send(authorizationEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionRefreshedAction(@NotNull final AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        Action.Companion companion = Action.Companion;
        final String str = "NotifySessionRefreshed";
        return new Action(str, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionRefreshedAction$$inlined$invoke$1
            final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$amplifyCredential$inlined = amplifyCredential;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Refreshed(this.$amplifyCredential$inlined), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher.send(authorizationEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
