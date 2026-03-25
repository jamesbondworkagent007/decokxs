package o;

import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.account.api.model.security.otp.TwoFactorAuthError;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6655aTT {
    private static final Activity Companion = new Activity(null);

    @yCM
    public C6655aTT() {
    }

    public final <T> TwoFactorAuth<T> copydefault(@NotNull ResponseData<T> responseData) throws TwoFactorAuthError.Unknown, TwoFactorAuthError.InvalidAuthCode, TwoFactorAuthError.MaxAttemptReached {
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        if (code == 0) {
            return new TwoFactorAuth<>(responseData.getCode(), responseData.getData());
        }
        if (code == 3112) {
            throw new TwoFactorAuthError.MaxAttemptReached(responseData.getMsg());
        }
        if (code == 3944) {
            T data = responseData.getData();
            throw new TwoFactorAuthError.InvalidAuthCode(data instanceof java.util.Map ? (java.util.Map) data : null, responseData.getMsg());
        }
        throw new TwoFactorAuthError.Unknown(responseData.getCode(), responseData.getMsg());
    }

    /* JADX INFO: renamed from: o.aTT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aTT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
