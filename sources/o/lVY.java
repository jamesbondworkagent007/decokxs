package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lVY {
    public static final lVY EZpvd = new lVY();

    private lVY() {
    }

    public static /* synthetic */ void trackView$default(lVY lvy, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lvy.OLrzqt(str, z, function1);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.copydefault.EZpvd(str, CaptchaVendor.RECAPTCHA, z ? "sensitive_verification" : "insensitive_verification", function1);
    }

    public static /* synthetic */ void trackSuccess$default(lVY lvy, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lvy.EZpvd(str, j, function1);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.copydefault.KWHzl(str, CaptchaVendor.RECAPTCHA, j, function1);
    }

    public static /* synthetic */ void trackFail$default(lVY lvy, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lvy.AEQbTJ(str, j);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.copydefault.OLrzqt(str, CaptchaVendor.RECAPTCHA, j, "", "timeout");
    }
}
