package o;

import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaNextStepResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6658aTW {
    public final C6655aTT KWHzl;

    @yCM
    public C6658aTW(@NotNull C6655aTT c6655aTT) {
        Intrinsics.checkNotNullParameter(c6655aTT, "");
        this.KWHzl = c6655aTT;
    }

    public final TwoFactorAuth<java.lang.Object> AEQbTJ(@NotNull ResponseData<java.lang.Object> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            int code = responseData.getCode();
            java.lang.Object data = responseData.getData();
            ResetMfaNextStepResponse resetMfaNextStepResponseKWHzl = KWHzl(data instanceof java.util.Map ? (java.util.Map) data : null);
            Intrinsics.copydefault(resetMfaNextStepResponseKWHzl, "");
            return new TwoFactorAuth<>(code, resetMfaNextStepResponseKWHzl);
        }
        return this.KWHzl.copydefault(responseData);
    }

    public final ResetMfaNextStepResponse KWHzl(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj;
        java.lang.String string = (map == null || (obj = map.get("nextStep")) == null) ? null : obj.toString();
        if (string == null) {
            string = "";
        }
        return new ResetMfaNextStepResponse(string);
    }
}
