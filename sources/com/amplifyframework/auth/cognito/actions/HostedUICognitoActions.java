package com.amplifyframework.auth.cognito.actions;

import androidx.autofill.HintConstants;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.auth.cognito.helpers.JWTParser;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.HostedUIActions;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUICognitoActions implements HostedUIActions {
    public static final HostedUICognitoActions INSTANCE = new HostedUICognitoActions();

    private HostedUICognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action showHostedUI(@NotNull final HostedUIEvent.EventType.ShowHostedUI showHostedUI) {
        Intrinsics.checkNotNullParameter(showHostedUI, "");
        Action.Companion companion = Action.Companion;
        final String str = "InitHostedUIAuth";
        return new Action(str, showHostedUI) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$showHostedUI$$inlined$invoke$1
            final /* synthetic */ HostedUIEvent.EventType.ShowHostedUI $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = showHostedUI;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                } catch (Exception e) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                    eventDispatcher.send(hostedUIEvent);
                    AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher.send(authenticationEvent);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                authEnvironment.getHostedUIClient().launchCustomTabsSignIn(this.$event$inlined.getHostedUISignInData().getHostedUIOptions());
                return Unit.INSTANCE;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action fetchHostedUISignInToken(@NotNull final HostedUIEvent.EventType.FetchToken fetchToken, final String str) {
        Intrinsics.checkNotNullParameter(fetchToken, "");
        Action.Companion companion = Action.Companion;
        final String str2 = "InitHostedUITokenFetch";
        return new Action(str2, fetchToken, str) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$fetchHostedUISignInToken$$inlined$invoke$1
            final /* synthetic */ String $browserPackage$inlined;
            final /* synthetic */ HostedUIEvent.EventType.FetchToken $event$inlined;
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.$event$inlined = fetchToken;
                this.$browserPackage$inlined = str;
                this.id = str2 == null ? Action.DefaultImpls.getId(this) : str2;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                AuthenticationEvent authenticationEvent;
                String claim;
                String claim2;
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                int i = 2;
                Date date = null;
                byte b = 0;
                byte b2 = 0;
                byte b3 = 0;
                byte b4 = 0;
                byte b5 = 0;
                try {
                } catch (Exception e) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                    eventDispatcher.send(hostedUIEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(b4 == true ? 1 : 0, 1, b3 == true ? 1 : 0), b2 == true ? 1 : 0, i, b == true ? 1 : 0);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                CognitoUserPoolTokens cognitoUserPoolTokensFetchToken = authEnvironment.getHostedUIClient().fetchToken(this.$event$inlined.getUri());
                String accessToken = cognitoUserPoolTokensFetchToken.getAccessToken();
                String str3 = (accessToken == null || (claim2 = JWTParser.INSTANCE.getClaim(accessToken, "sub")) == null) ? "" : claim2;
                String accessToken2 = cognitoUserPoolTokensFetchToken.getAccessToken();
                SignedInData signedInData = new SignedInData(str3, (accessToken2 == null || (claim = JWTParser.INSTANCE.getClaim(accessToken2, HintConstants.AUTOFILL_HINT_USERNAME)) == null) ? "" : claim, new Date(), new SignInMethod.HostedUI(this.$browserPackage$inlined), cognitoUserPoolTokensFetchToken);
                HostedUIEvent hostedUIEvent2 = new HostedUIEvent(HostedUIEvent.EventType.TokenFetched.INSTANCE, null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent2.getType());
                eventDispatcher.send(hostedUIEvent2);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), date, i, b5 == true ? 1 : 0);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
