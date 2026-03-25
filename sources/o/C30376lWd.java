package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.service.CaptchaServiceJavaAdapter$startCaptchaAsync$1;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.future.FutureKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30376lWd {
    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.future.FutureKt.future$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):java.util.concurrent.CompletableFuture */
    public static final CompletableFuture<AbstractC30369lVv> copydefault(@NotNull lWe lwe, @NotNull FragmentActivity fragmentActivity, @NotNull CaptchaScene captchaScene, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull SubdomainStrategy subdomainStrategy, CaptchaVendor captchaVendor) {
        Intrinsics.checkNotNullParameter(lwe, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(captchaScene, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subdomainStrategy, "");
        return FutureKt.future$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new CaptchaServiceJavaAdapter$startCaptchaAsync$1(lwe, fragmentActivity, captchaScene, str, captchaVendor, str2, str3, subdomainStrategy, null), 2, null);
    }
}
