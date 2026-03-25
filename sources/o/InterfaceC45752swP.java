package o;

import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.uilab.banner.OKAlertBanner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC45752swP extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity, @NotNull UKBannerType uKBannerType);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull UKBannerType uKBannerType);

    OKAlertBanner copydefault(@NotNull android.content.Context context, @NotNull UKBannerType uKBannerType);

    /* JADX INFO: renamed from: o.swP$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ OKAlertBanner getUKWarningBannerView$default(InterfaceC45752swP interfaceC45752swP, android.content.Context context, UKBannerType uKBannerType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUKWarningBannerView");
            }
            if ((i & 2) != 0) {
                uKBannerType = UKBannerType.NOT_APPROVED;
            }
            return interfaceC45752swP.copydefault(context, uKBannerType);
        }

        public static /* synthetic */ void handleInlineUKBanner$default(InterfaceC45752swP interfaceC45752swP, androidx.fragment.app.FragmentManager fragmentManager, android.view.ViewGroup viewGroup, UKBannerType uKBannerType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleInlineUKBanner");
            }
            if ((i & 4) != 0) {
                uKBannerType = UKBannerType.APPROVED_6OCT23;
            }
            interfaceC45752swP.EZpvd(fragmentManager, viewGroup, uKBannerType);
        }

        public static /* synthetic */ void setUKBannerType$default(InterfaceC45752swP interfaceC45752swP, android.app.Activity activity, UKBannerType uKBannerType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUKBannerType");
            }
            if ((i & 2) != 0) {
                uKBannerType = UKBannerType.NOT_APPROVED;
            }
            interfaceC45752swP.AEQbTJ(activity, uKBannerType);
        }
    }
}
