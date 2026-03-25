package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.data.RecaptchaActionScene;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface lWe extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull CaptchaScene captchaScene, @NotNull java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, java.lang.String str3, @NotNull SubdomainStrategy subdomainStrategy, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC30369lVv> continuation);

    void KWHzl(@NotNull java.util.List<? extends CaptchaVendor> list);

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: o.lWe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object startCaptcha$default(lWe lwe, FragmentActivity fragmentActivity, CaptchaScene captchaScene, java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, Function1 function1, Function1 function12, Function1 function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return lwe.AEQbTJ(fragmentActivity, captchaScene, str, (i & 8) != 0 ? null : captchaVendor, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? SubdomainStrategy.Auto.KWHzl : subdomainStrategy, (i & 128) != 0 ? null : function1, (i & 256) != 0 ? null : function12, (i & 512) != 0 ? null : function13, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : recaptchaActionScene, (i & 4096) != 0 ? java.lang.Boolean.FALSE : bool, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCaptcha");
        }
    }
}
