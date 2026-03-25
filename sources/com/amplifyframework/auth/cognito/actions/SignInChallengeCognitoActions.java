package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.GrantCredentialsPermissionActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInChallengeCognitoActions implements SignInChallengeActions {
    public static final SignInChallengeCognitoActions INSTANCE = new SignInChallengeCognitoActions();
    private static final String KEY_PREFIX_USER_ATTRIBUTE = "userAttributes.";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInChallengeCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions
    public Action verifyChallengeAuthAction(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, @NotNull AuthChallenge authChallenge) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(authChallenge, "");
        Action.Companion companion = Action.Companion;
        return new SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1("VerifySignInChallenge", authChallenge, list, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getChallengeResponseKey(String str) {
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivityEZpvd = GrantCredentialsPermissionActivity.copydefault.EZpvd(str);
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.VoiceInteractor) {
            return "SMS_MFA_CODE";
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.Dialog) {
            return "NEW_PASSWORD";
        }
        if ((grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.Application) || Intrinsics.EZpvd(grantCredentialsPermissionActivityEZpvd, GrantCredentialsPermissionActivity.PendingIntent.OLrzqt)) {
            return "ANSWER";
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.SharedElementCallback) {
            return "SOFTWARE_TOKEN_MFA_CODE";
        }
        return null;
    }
}
