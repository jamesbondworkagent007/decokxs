package o;

import com.okinc.captcha.impl.tencent.TencentCaptchaVerificationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lWt {
    public static final lWt EZpvd = new lWt();

    private lWt() {
    }

    public final void EZpvd(@NotNull TencentCaptchaVerificationException tencentCaptchaVerificationException, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tencentCaptchaVerificationException, "");
        Intrinsics.checkNotNullParameter(str, "");
        lWA.addEventOfSdkError$default(lWA.EZpvd, "tencent_captcha", str, tencentCaptchaVerificationException.getCode(), tencentCaptchaVerificationException.getMessage(), null, 16, null);
    }
}
