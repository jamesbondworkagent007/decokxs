package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareData;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48893ueK extends InterfaceC43217rlC {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.app.Activity activity);

    AbstractC58185ywX<C48887ueE> AEQbTJ(@NotNull java.lang.String str, @NotNull C48891ueI c48891ueI);

    void AEQbTJ(@NotNull InterfaceC49001ugM interfaceC49001ugM);

    void AEQbTJ(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    boolean AEQbTJ(@NotNull SharePlatform sharePlatform);

    java.lang.String AubY();

    InterfaceC49000ugL DTwDnp();

    <T extends AbstractActivityC33041mov> InterfaceC48892ueJ EZpvd(@NotNull T t, @NotNull MultiShareConfig multiShareConfig, InterfaceC49097uiC interfaceC49097uiC);

    void EZpvd(@NotNull android.app.Activity activity);

    void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo);

    void EZpvd(@NotNull InterfaceC49121uia interfaceC49121uia);

    ISharePreviewConfig KWHzl(@NotNull IShareParams iShareParams);

    SharePlatform KWHzl(int i);

    InterfaceC48895ueM KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet);

    void KWHzl(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, @NotNull SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2);

    void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC48970ufi interfaceC48970ufi);

    <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull MultiShareConfig multiShareConfig);

    <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull ShareConfig shareConfig, InterfaceC49097uiC interfaceC49097uiC);

    AbstractC49065uhX OLrzqt(@NotNull ShareConfig shareConfig);

    void OLrzqt(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh);

    ShareFooterInfo ORxRYg();

    boolean UeEOUB();

    boolean aKErDB();

    <T extends AbstractActivityC33041mov> InterfaceC48892ueJ copydefault(@NotNull T t, @NotNull ShareConfig shareConfig);

    InterfaceC48901ueS copydefault(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.Integer num, java.lang.Float f, boolean z);

    InterfaceC49121uia copydefault(@NotNull SharePlatform sharePlatform);

    void copydefault(IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo);

    void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC49002ugN interfaceC49002ugN);

    boolean fZBcTu();

    java.lang.String iwGUEr();

    java.lang.CharSequence sSMYrx();

    boolean uzCIH();

    ShareData zuBGHE();

    /* JADX INFO: renamed from: o.ueK$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ueK$Application */
    public static final class Application {
        public static /* synthetic */ void performShareAction$default(InterfaceC48893ueK interfaceC48893ueK, android.app.Activity activity, IShareParams iShareParams, SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performShareAction");
            }
            if ((i & 8) != 0) {
                activity2 = null;
            }
            interfaceC48893ueK.KWHzl(activity, iShareParams, sharePlatform, activity2);
        }

        public static /* synthetic */ InterfaceC48901ueS createWatermarkEditMenuItem$default(InterfaceC48893ueK interfaceC48893ueK, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.Integer num, java.lang.Float f, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWatermarkEditMenuItem");
            }
            if ((i & 1) != 0) {
                charSequence = null;
            }
            if ((i & 2) != 0) {
                drawable = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                f = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            return interfaceC48893ueK.copydefault(charSequence, drawable, num, f, z);
        }
    }
}
