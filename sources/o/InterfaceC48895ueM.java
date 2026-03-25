package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.share.view.FootViewTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48895ueM {
    java.lang.String AEQbTJ();

    boolean EZpvd();

    void KWHzl(LifecycleOwner lifecycleOwner, java.lang.String str, @NotNull C48891ueI c48891ueI, @NotNull Function1<? super C48887ueE, Unit> function1);

    boolean KWHzl();

    java.lang.String OLrzqt();

    FootViewTheme copydefault();

    void setFrom(@NotNull java.lang.String str);

    void setIcon(android.graphics.drawable.Drawable drawable);

    void setQRCode(java.lang.String str);

    void setSrcFrom(@NotNull java.lang.String str, @NotNull Function0<Unit> function0);

    void setSubTitle(java.lang.CharSequence charSequence);

    void setTheme(@NotNull FootViewTheme footViewTheme);

    void setTitle(java.lang.CharSequence charSequence);

    /* JADX INFO: renamed from: o.ueM$Application */
    public static final class Application {
        public static /* synthetic */ void setSrcFrom$default(InterfaceC48895ueM interfaceC48895ueM, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSrcFrom");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            interfaceC48895ueM.setSrcFrom(str, function0);
        }

        public static /* synthetic */ void createAndSetShortLinkToQRCode$default(InterfaceC48895ueM interfaceC48895ueM, LifecycleOwner lifecycleOwner, java.lang.String str, C48891ueI c48891ueI, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAndSetShortLinkToQRCode");
            }
            if ((i & 1) != 0) {
                lifecycleOwner = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC48895ueM.KWHzl(lifecycleOwner, str, c48891ueI, function1);
        }
    }
}
