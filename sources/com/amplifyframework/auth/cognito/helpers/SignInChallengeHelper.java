package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import o.C5173Hn;
import o.C56424yEw;
import o.C59462zhW;
import o.C59519zia;
import o.GrantCredentialsPermissionActivity;
import o.LocalActivityManager;
import o.OnAccountsUpdateListener;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInChallengeHelper {
    public static final SignInChallengeHelper INSTANCE = new SignInChallengeHelper();

    private SignInChallengeHelper() {
    }

    public static /* synthetic */ StateMachineEvent evaluateNextStep$default(SignInChallengeHelper signInChallengeHelper, String str, GrantCredentialsPermissionActivity grantCredentialsPermissionActivity, String str2, Map map, OnAccountsUpdateListener onAccountsUpdateListener, SignInMethod signInMethod, int i, Object obj) {
        if ((i & 32) != 0) {
            signInMethod = new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH);
        }
        return signInChallengeHelper.evaluateNextStep(str, grantCredentialsPermissionActivity, str2, map, onAccountsUpdateListener, signInMethod);
    }

    public final StateMachineEvent evaluateNextStep(@NotNull String str, GrantCredentialsPermissionActivity grantCredentialsPermissionActivity, String str2, Map<String, String> map, OnAccountsUpdateListener onAccountsUpdateListener, @NotNull SignInMethod signInMethod) {
        SignInEvent signInEvent;
        Set<MFAType> setCopydefault;
        String str3;
        String userSub;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signInMethod, "");
        if (onAccountsUpdateListener != null) {
            String strCopydefault = onAccountsUpdateListener.copydefault();
            String str4 = (strCopydefault == null || (userSub = SessionHelper.INSTANCE.getUserSub(strCopydefault)) == null) ? "" : userSub;
            C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            SignedInData signedInData = new SignedInData(str4, str, new Date(), signInMethod, new CognitoUserPoolTokens(onAccountsUpdateListener.EZpvd(), onAccountsUpdateListener.copydefault(), onAccountsUpdateListener.KWHzl(), Long.valueOf(c5173HnKWHzl.copydefault(C59519zia.EZpvd(onAccountsUpdateListener.OLrzqt(), DurationUnit.SECONDS)).KWHzl())));
            LocalActivityManager localActivityManagerAEQbTJ = onAccountsUpdateListener.AEQbTJ();
            if (localActivityManagerAEQbTJ != null) {
                String strAEQbTJ = localActivityManagerAEQbTJ.AEQbTJ();
                String str5 = strAEQbTJ == null ? "" : strAEQbTJ;
                String strOLrzqt = localActivityManagerAEQbTJ.OLrzqt();
                return new SignInEvent(new SignInEvent.EventType.ConfirmDevice(new DeviceMetadata.Metadata(str5, strOLrzqt == null ? "" : strOLrzqt, (String) null, 4, (DefaultConstructorMarker) null), signedInData), null, 2, null);
            }
            return new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), null, 2, null);
        }
        if ((grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.VoiceInteractor) || (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.Application) || (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.Dialog) || (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.SharedElementCallback) || (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.PendingIntent)) {
            return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(grantCredentialsPermissionActivity.copydefault(), str, str2, map)), null, 2, null);
        }
        if (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.Fragment) {
            if (map == null || (str3 = map.get("MFAS_CAN_SETUP")) == null || (setCopydefault = INSTANCE.getAllowedMFATypes(str3)) == null) {
                setCopydefault = yEE.copydefault();
            }
            if (setCopydefault.contains(MFAType.TOTP)) {
                return new SignInEvent(new SignInEvent.EventType.InitiateTOTPSetup(new SignInTOTPSetupData("", str2, str)), null, 2, null);
            }
            signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Cannot initiate MFA setup from available Types: " + setCopydefault)), null, 2, null);
        } else if (grantCredentialsPermissionActivity instanceof GrantCredentialsPermissionActivity.Activity) {
            signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateSignInWithDeviceSRP(str, C56424yEw.KWHzl()), null, 2, null);
        } else {
            return new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Response did not contain sign in info.")), null, 2, null);
        }
        return signInEvent;
    }

    public final void getNextStep(@NotNull AuthChallenge authChallenge, @NotNull Consumer<AuthSignInResult> consumer, @NotNull Consumer<AuthException> consumer2, SignInTOTPSetupData signInTOTPSetupData, Set<? extends MFAType> set) {
        Map mapKWHzl;
        Unit unit;
        Intrinsics.checkNotNullParameter(authChallenge, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        Map<String, String> parameters = authChallenge.getParameters();
        if (parameters == null || (mapKWHzl = C56424yEw.isConnected(parameters)) == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        Map map = mapKWHzl;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivityEZpvd = GrantCredentialsPermissionActivity.copydefault.EZpvd(authChallenge.getChallengeName());
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.VoiceInteractor) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE, C56424yEw.KWHzl(), new AuthCodeDeliveryDetails((String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) map), "CODE_DELIVERY_DESTINATION"), AuthCodeDeliveryDetails.DeliveryMedium.fromString((String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) map), "CODE_DELIVERY_DELIVERY_MEDIUM"))), null, null)));
            return;
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.Dialog) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD, map, null, null, null)));
            return;
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.Application) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE, map, null, null, null)));
            return;
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.SharedElementCallback) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_TOTP_CODE, C56424yEw.KWHzl(), null, null, null)));
            return;
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.Fragment) {
            if (signInTOTPSetupData != null) {
                consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_TOTP_SETUP, map, null, new TOTPSetupDetails(signInTOTPSetupData.getSecretCode(), signInTOTPSetupData.getUsername()), set)));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                consumer2.accept(new UnknownException(null, new Exception("Challenge type not supported."), 1, null));
                return;
            }
            return;
        }
        if (grantCredentialsPermissionActivityEZpvd instanceof GrantCredentialsPermissionActivity.PendingIntent) {
            AuthSignInStep authSignInStep = AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SELECTION;
            Map mapKWHzl2 = C56424yEw.KWHzl();
            String str = (String) map.get("MFAS_CAN_CHOOSE");
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(authSignInStep, mapKWHzl2, null, null, str != null ? INSTANCE.getAllowedMFATypes(str) : null)));
            return;
        }
        consumer2.accept(new UnknownException(null, new Exception("Challenge type not supported."), 1, null));
    }

    public final Set<MFAType> getAllowedMFATypes(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : StringsKt__StringsKt.split$default((CharSequence) new Regex("\\[|\\]|\"").replace(str, ""), new String[]{","}, false, 0, 6, (Object) null)) {
            if (Intrinsics.EZpvd((Object) str2, (Object) "SMS_MFA")) {
                linkedHashSet.add(MFAType.SMS);
            } else {
                if (!Intrinsics.EZpvd((Object) str2, (Object) "SOFTWARE_TOKEN_MFA")) {
                    throw new UnknownException(null, new Exception("MFA type not supported."), 1, null);
                }
                linkedHashSet.add(MFAType.TOTP);
            }
        }
        return linkedHashSet;
    }
}
