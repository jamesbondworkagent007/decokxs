package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.account.api.model.account.KycCombineAccountRequest;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.account.api.model.mpcwallet.LoginType;
import com.okinc.account.api.model.register.RegisterRoute;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8104awT extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity);

    void AEQbTJ(@NotNull android.content.Context context);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str);

    android.content.Intent EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2);

    java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull android.os.Bundle bundle);

    void KWHzl(@NotNull android.app.Activity activity);

    void KWHzl(@NotNull android.app.Activity activity, boolean z, @NotNull KycCombineAccountRequest kycCombineAccountRequest);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str);

    void OLrzqt(@NotNull android.content.Context context, @NotNull LoginRoute loginRoute);

    void OLrzqt(@NotNull android.content.Context context, @NotNull RegisterRoute registerRoute, boolean z);

    void OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, LoginType loginType, java.lang.Integer num);

    ActivityResultContract<java.lang.String, java.lang.Boolean> copydefault();

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull android.content.Context context, java.lang.String str);

    /* JADX INFO: renamed from: o.awT$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void routeLogin$default(InterfaceC8104awT interfaceC8104awT, android.content.Context context, LoginRoute loginRoute, int i, java.lang.Object obj) {
            android.content.Context context2;
            LoginRoute loginRoute2;
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeLogin");
            }
            if ((i & 2) != 0) {
                loginRoute2 = new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null);
                context2 = context;
            } else {
                context2 = context;
                loginRoute2 = loginRoute;
            }
            interfaceC8104awT.OLrzqt(context2, loginRoute2);
        }

        public static /* synthetic */ void routeLoginFromMpcWallet$default(InterfaceC8104awT interfaceC8104awT, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, LoginType loginType, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeLoginFromMpcWallet");
            }
            interfaceC8104awT.OLrzqt(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : loginType, (i & 32) == 0 ? num : null);
        }

        public static /* synthetic */ void routeRegister$default(InterfaceC8104awT interfaceC8104awT, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeRegister");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC8104awT.copydefault(context, str);
        }

        public static /* synthetic */ void routeRegisterV2$default(InterfaceC8104awT interfaceC8104awT, android.content.Context context, RegisterRoute registerRoute, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeRegisterV2");
            }
            if ((i & 2) != 0) {
                registerRoute = new RegisterRoute(null, null, false, 7, null);
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC8104awT.OLrzqt(context, registerRoute, z);
        }

        public static /* synthetic */ void routeLoginOrRegister$default(InterfaceC8104awT interfaceC8104awT, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeLoginOrRegister");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC8104awT.EZpvd(context, str);
        }

        public static /* synthetic */ java.lang.Object fetchBoundAccountStatus$default(InterfaceC8104awT interfaceC8104awT, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBoundAccountStatus");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC8104awT.EZpvd(z, (Continuation<? super java.lang.Boolean>) continuation);
        }
    }
}
