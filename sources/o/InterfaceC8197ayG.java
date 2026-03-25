package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.auth.api.service.MfaServiceRequest;
import com.okinc.auth.api.service.MfaServiceResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.ayG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8197ayG extends InterfaceC43217rlC {
    ActivityResultContract<MfaServiceRequest, MfaServiceResult> OLrzqt(Function0<Unit> function0, Function0<Unit> function02);

    ActivityResultContract<java.lang.String, MfaServiceResult> copydefault(Function0<Unit> function0);

    /* JADX INFO: renamed from: o.ayG$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ayG */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityResultContract startMfaForResult$default(InterfaceC8197ayG interfaceC8197ayG, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMfaForResult");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            return interfaceC8197ayG.copydefault(function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ayG */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityResultContract startNonAuthMfaForResult$default(InterfaceC8197ayG interfaceC8197ayG, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNonAuthMfaForResult");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return interfaceC8197ayG.OLrzqt(function0, function02);
        }
    }
}
