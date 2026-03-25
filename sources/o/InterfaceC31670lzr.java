package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.SmartBotParams;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC31670lzr extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends LiteUserResidenceType>> continuation);

    Flow<SupportService> AEQbTJ(@NotNull java.lang.String str, @NotNull SmartBotParams smartBotParams);

    sxC AEQbTJ();

    void AEQbTJ(@NotNull android.content.Context context);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull BSCTargetTab bSCTargetTab);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull UKBannerType uKBannerType);

    boolean AYXKKw();

    boolean AhwBna();

    java.lang.Object EZpvd(@NotNull Continuation<? super LiteUserResidenceType> continuation);

    java.lang.String EZpvd();

    void EZpvd(@NotNull android.content.Context context);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull BSCLevel bSCLevel, java.lang.Boolean bool, java.lang.Boolean bool2, @NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12, @NotNull Function0<Unit> function02);

    StateFlow<AbstractC33244msm> KWHzl();

    void KWHzl(@NotNull android.app.Activity activity, @NotNull UKBannerType uKBannerType);

    void KWHzl(@NotNull android.content.Context context);

    java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, FairPriceTickerData>>> continuation);

    java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation);

    sxD OLrzqt();

    void OLrzqt(@NotNull android.content.Context context, int i, java.lang.String str, boolean z);

    boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature);

    java.lang.String copydefault();

    void copydefault(@NotNull android.app.Activity activity, @NotNull TransferDetail transferDetail);

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1);

    /* JADX INFO: renamed from: o.lzr$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public static /* synthetic */ void goToSubKycOnboarding$default(InterfaceC31670lzr interfaceC31670lzr, FragmentActivity fragmentActivity, BSCLevel bSCLevel, java.lang.Boolean bool, java.lang.Boolean bool2, Function0 function0, Function1 function1, Function1 function12, Function0 function02, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToSubKycOnboarding");
            }
            interfaceC31670lzr.EZpvd(fragmentActivity, bSCLevel, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool2, function0, function1, function12, function02);
        }

        public static /* synthetic */ java.lang.Object httpThenSubscribeTickerData$default(InterfaceC31670lzr interfaceC31670lzr, LifecycleOwner lifecycleOwner, java.util.List list, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpThenSubscribeTickerData");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return interfaceC31670lzr.OLrzqt(lifecycleOwner, (java.util.List<java.lang.String>) list, z, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
        }

        public static /* synthetic */ void setUKBannerType$default(InterfaceC31670lzr interfaceC31670lzr, android.app.Activity activity, UKBannerType uKBannerType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUKBannerType");
            }
            if ((i & 2) != 0) {
                uKBannerType = UKBannerType.NOT_APPROVED;
            }
            interfaceC31670lzr.KWHzl(activity, uKBannerType);
        }

        public static /* synthetic */ void insertInlineUkBanner$default(InterfaceC31670lzr interfaceC31670lzr, androidx.fragment.app.FragmentManager fragmentManager, android.view.ViewGroup viewGroup, UKBannerType uKBannerType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertInlineUkBanner");
            }
            if ((i & 4) != 0) {
                uKBannerType = UKBannerType.APPROVED_6OCT23;
            }
            interfaceC31670lzr.AEQbTJ(fragmentManager, viewGroup, uKBannerType);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lzr */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void processDeeplink$default(InterfaceC31670lzr interfaceC31670lzr, android.content.Context context, java.lang.String str, java.util.Map map, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processDeeplink");
            }
            if ((i & 4) != 0) {
                map = C56424yEw.KWHzl();
            }
            interfaceC31670lzr.copydefault(context, str, map, function1);
        }

        public static /* synthetic */ void gotoFinanceMyCryptoPage$default(InterfaceC31670lzr interfaceC31670lzr, android.content.Context context, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoFinanceMyCryptoPage");
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            interfaceC31670lzr.OLrzqt(context, i, str, z);
        }
    }
}
