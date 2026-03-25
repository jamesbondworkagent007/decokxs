package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyCanLinkExistingToCedefiWalletState;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyRebindRequest;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8196ayF extends InterfaceC43217rlC {
    ActivityResultContract<android.app.PendingIntent, PasskeySdkResult> AEQbTJ();

    java.lang.Object AEQbTJ(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull Continuation<? super PasskeyVersionState> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation);

    ActivityResultContract<PasskeyRebindRequest, PasskeyRebindState> AYXKKw();

    ActivityResultContract<Unit, PasskeyState> AhwBna();

    ActivityResultContract<PasskeyLinkScenarioRequest, PasskeyLinkState> EZpvd();

    ActivityResultContract<PasskeyRegisterScenarioRequest, PasskeyRegisterState> EZpvd(Function0<Unit> function0, Function1<? super android.app.Activity, Unit> function1);

    java.lang.Object EZpvd(@NotNull Continuation<? super PasskeyCanLinkExistingToCedefiWalletState> continuation);

    ActivityResultContract<PasskeyAuthenticateRequest, PasskeyState> KWHzl();

    ActivityResultContract<PasskeyResetRemoveRequest, PasskeyResetRemoveState> KWHzl(@NotNull android.content.Context context);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    ActivityResultContract<PasskeyAuthenticateScenarioRequest, PasskeyAuthenticateState> OLrzqt();

    java.lang.Object OLrzqt(@NotNull Continuation<? super PasskeyState> continuation);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z);

    ActivityResultContract<java.lang.String, PasskeySdkResult> copydefault();

    ActivityResultContract<Unit, PasskeyRegisterState> copydefault(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, Function0<Unit> function0, boolean z2, boolean z3, Function1<? super android.app.Activity, Unit> function1);

    ActivityResultContract<Unit, PasskeyState> copydefault(boolean z);

    java.lang.Object copydefault(@NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super PasskeyState> continuation);

    ActivityResultContract<Unit, PasskeyAuthenticateState> djBIcL();

    ActivityResultContract<Unit, PasskeyRecoverState> gEmmrt();

    ActivityResultContract<PasskeyManagementRequest, PasskeyManagementState> valueOf();

    java.lang.Object valueOf(@NotNull Continuation<? super java.lang.Boolean> continuation);

    /* JADX INFO: renamed from: o.ayF$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static /* synthetic */ ActivityResultContract authenticatePasskey$default(InterfaceC8196ayF interfaceC8196ayF, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticatePasskey");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC8196ayF.copydefault(z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.ayF */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityResultContract registerPasskey$default(InterfaceC8196ayF interfaceC8196ayF, PasskeyScenario passkeyScenario, boolean z, java.lang.String str, java.lang.String str2, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyPromotionSource passkeyPromotionSource, Function0 function0, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC8196ayF.copydefault((i & 1) != 0 ? PasskeyScenario.Account.AEQbTJ : passkeyScenario, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? PasskeyPromotionAuthenticator.All.KWHzl : passkeyPromotionAuthenticator, (i & 32) != 0 ? PasskeyPromotionSource.SECURITY_CENTER : passkeyPromotionSource, (i & 64) != 0 ? null : function0, (i & 128) != 0 ? true : z2, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? function1 : null);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerPasskey");
        }

        public static /* synthetic */ java.lang.Object checkPasskeyCompatible$default(InterfaceC8196ayF interfaceC8196ayF, PasskeyScenario passkeyScenario, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPasskeyCompatible");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC8196ayF.copydefault(passkeyScenario, z, continuation);
        }

        public static /* synthetic */ java.lang.Object checkPasskeyCompatibleForPasskeyVersionState$default(InterfaceC8196ayF interfaceC8196ayF, PasskeyScenario passkeyScenario, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPasskeyCompatibleForPasskeyVersionState");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC8196ayF.AEQbTJ(passkeyScenario, z, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ayF */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityResultContract registerPasskey$default(InterfaceC8196ayF interfaceC8196ayF, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerPasskey");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return interfaceC8196ayF.EZpvd(function0, function1);
        }
    }
}
