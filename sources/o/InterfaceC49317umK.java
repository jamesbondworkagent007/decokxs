package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.biz.TacticsType;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.social_trade_api.data.ChartPeriod;
import com.okinc.social_trade_api.data.SocialTradingSource;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49317umK extends InterfaceC43217rlC {
    InterfaceC49321umO AEQbTJ(@NotNull android.content.Context context, @NotNull Function2<? super InterfaceC49320umN, ? super java.lang.Integer, Unit> function2, @NotNull Function2<? super InterfaceC49320umN, ? super java.lang.Integer, Unit> function22, @NotNull Function2<? super InterfaceC49320umN, ? super java.lang.Integer, Unit> function23, float f, float f2, boolean z);

    void AEQbTJ(@NotNull android.content.Context context, AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull BusinessLine businessLine, @NotNull java.lang.String str2, @NotNull ChartPeriod chartPeriod);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02);

    boolean AEQbTJ();

    boolean AEQbTJ(@NotNull java.lang.String str);

    androidx.fragment.app.Fragment EZpvd();

    java.lang.String EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7);

    void EZpvd(boolean z);

    android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull SocialTradingSource socialTradingSource);

    androidx.fragment.app.Fragment KWHzl(java.lang.String str);

    java.lang.Object KWHzl(@NotNull Continuation<? super Result<AffiliatePartnerBeanForPlanet>> continuation);

    void KWHzl(@NotNull android.content.Context context, @NotNull android.view.View view, int i);

    void KWHzl(@NotNull android.content.Context context, @NotNull TacticsVoucherInfo tacticsVoucherInfo, boolean z, TacticsType tacticsType, boolean z2);

    void KWHzl(LifecycleOwner lifecycleOwner, androidx.fragment.app.FragmentManager fragmentManager);

    boolean KWHzl();

    java.lang.Object OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, boolean z2, @NotNull java.lang.String str10, @NotNull Continuation<? super Unit> continuation);

    java.lang.String OLrzqt(@NotNull java.lang.String str);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    boolean OLrzqt();

    int copydefault();

    androidx.fragment.app.Fragment copydefault(boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    void copydefault(@NotNull android.content.Context context, @NotNull android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull BusinessLine businessLine, @NotNull java.lang.String str2, @NotNull ChartPeriod chartPeriod);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    boolean copydefault(@NotNull java.lang.String str);

    boolean djBIcL();

    void gEmmrt();

    boolean valueOf();

    /* JADX INFO: renamed from: o.umK$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static /* synthetic */ android.content.Intent getCopyTradingLandingPageIntent$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, SocialTradingSource socialTradingSource, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCopyTradingLandingPageIntent");
            }
            if ((i & 2) != 0) {
                socialTradingSource = SocialTradingSource.DEFAULT;
            }
            return interfaceC49317umK.KWHzl(context, socialTradingSource);
        }

        public static /* synthetic */ java.lang.String getCommunityName$default(InterfaceC49317umK interfaceC49317umK, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommunityName");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return interfaceC49317umK.OLrzqt(str);
        }

        public static /* synthetic */ void showUserCenterPage$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showUserCenterPage");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            interfaceC49317umK.copydefault(context, str, str2, str3);
        }

        public static /* synthetic */ void showSocialUserCenterPage$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSocialUserCenterPage");
            }
            interfaceC49317umK.EZpvd(context, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
        }

        public static /* synthetic */ void jumpMyLeadOrderPage$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpMyLeadOrderPage");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            interfaceC49317umK.EZpvd(context, str, str2);
        }

        public static /* synthetic */ void navigateToCopyTradingSettingHome$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToCopyTradingSettingHome");
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            interfaceC49317umK.OLrzqt(context, str, str2, str3);
        }

        public static /* synthetic */ void navigateToTraderBusinessLinePage$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, BusinessLine businessLine, java.lang.String str2, ChartPeriod chartPeriod, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToTraderBusinessLinePage");
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                chartPeriod = ChartPeriod.Companion.KWHzl();
            }
            interfaceC49317umK.AEQbTJ(context, str, businessLine, str3, chartPeriod);
        }

        public static /* synthetic */ void navigateToTraderPage$default(InterfaceC49317umK interfaceC49317umK, android.content.Context context, java.lang.String str, BusinessLine businessLine, java.lang.String str2, ChartPeriod chartPeriod, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToTraderPage");
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                chartPeriod = ChartPeriod.Companion.KWHzl();
            }
            interfaceC49317umK.copydefault(context, str, businessLine, str3, chartPeriod);
        }
    }
}
