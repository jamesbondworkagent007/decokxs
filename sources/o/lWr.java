package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.tencent.TencentCaptchaVerificationException;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lWr {
    public static final lWr KWHzl = new lWr();

    private lWr() {
    }

    public static /* synthetic */ void trackFail$default(lWr lwr, java.lang.String str, long j, TencentCaptchaVerificationException tencentCaptchaVerificationException, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lwr.copydefault(str, j, tencentCaptchaVerificationException);
    }

    public final void copydefault(@NotNull java.lang.String str, long j, @NotNull TencentCaptchaVerificationException tencentCaptchaVerificationException) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tencentCaptchaVerificationException, "");
        lWv.copydefault.OLrzqt(str, CaptchaVendor.TCAPTCHA, j, tencentCaptchaVerificationException.getCode(), tencentCaptchaVerificationException.getMessage());
    }

    public final void EZpvd(@NotNull java.lang.String str, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.trackView$default(lWv.copydefault, str, CaptchaVendor.TCAPTCHA, null, function1, 4, null);
    }

    public static /* synthetic */ void trackSuccess$default(lWr lwr, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lwr.EZpvd(str, j, function1);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.copydefault.KWHzl(str, CaptchaVendor.TCAPTCHA, j, function1);
    }
}
