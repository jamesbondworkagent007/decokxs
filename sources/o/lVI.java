package o;

import com.okinc.captcha.impl.geetest.GeetestCaptchaDeepknowException;
import com.okinc.captcha.impl.geetest.GeetestCaptchaVerificationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lVI {
    public static final lVI EZpvd = new lVI();

    private lVI() {
    }

    public final void copydefault(@NotNull GeetestCaptchaDeepknowException geetestCaptchaDeepknowException, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(geetestCaptchaDeepknowException, "");
        Intrinsics.checkNotNullParameter(str, "");
        lWA.addEventOfSdkError$default(lWA.EZpvd, "geetest_deepknow", str, geetestCaptchaDeepknowException.getCode(), geetestCaptchaDeepknowException.getMessage(), null, 16, null);
    }

    public final void EZpvd(@NotNull GeetestCaptchaVerificationException geetestCaptchaVerificationException, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(geetestCaptchaVerificationException, "");
        Intrinsics.checkNotNullParameter(str, "");
        lWA.addEventOfSdkError$default(lWA.EZpvd, "geetest_captcha", str, geetestCaptchaVerificationException.getCode(), geetestCaptchaVerificationException.getMessage(), null, 16, null);
    }
}
