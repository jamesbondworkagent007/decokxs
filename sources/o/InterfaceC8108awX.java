package o;

import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.UserProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8108awX extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, Function0<Unit> function0, Function0<Unit> function02, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super com.okinc.okuser.data.UserInfo> continuation);

    java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super com.okinc.okuser.data.UserInfo> continuation);

    void AEQbTJ(@NotNull android.app.Activity activity);

    java.lang.Object EZpvd(Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation);

    boolean EZpvd();

    java.lang.Object KWHzl(boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super Token> continuation);

    StateFlow<java.lang.Boolean> OLrzqt();

    java.lang.Object copydefault(boolean z, @NotNull Continuation<? super UserProfile> continuation);

    boolean copydefault();

    /* JADX INFO: renamed from: o.awX$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static /* synthetic */ java.lang.Object forceLoadRemoteUserInfo$default(InterfaceC8108awX interfaceC8108awX, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceLoadRemoteUserInfo");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC8108awX.AEQbTJ(z, continuation);
        }

        public static /* synthetic */ java.lang.Object forceLoadRemoteUserProfile$default(InterfaceC8108awX interfaceC8108awX, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceLoadRemoteUserProfile");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC8108awX.copydefault(z, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.awX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object logoutCurrentUser$default(InterfaceC8108awX interfaceC8108awX, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logoutCurrentUser");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            return interfaceC8108awX.EZpvd(function0, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.awX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object switchCurrentUserToUid$default(InterfaceC8108awX interfaceC8108awX, java.lang.String str, Function0 function0, Function0 function02, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchCurrentUserToUid");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function02 = null;
            }
            return interfaceC8108awX.AEQbTJ(str, function0, function02, continuation);
        }
    }
}
