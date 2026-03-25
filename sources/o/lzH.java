package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCProConvertEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.OKBuySellSource;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity;
import com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet;
import com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity;
import com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean;
import com.okinc.crcore.shared.di.RepositoryModule;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.uv.LandingPageType;
import com.okinc.okx.paymentapi.uv.UnifiedVerificationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lzH extends AbstractC43215rlA implements InterfaceC31422lti {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC31422lti
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC31422lti
    public void OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        OKPaymentSource oKPaymentSourceKWHzl = OKPaymentSource.Companion.KWHzl(str5 == null ? "" : str5);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43248rlh.KWHzl.AEQbTJ(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        TargetTab targetTab = TargetTab.CONVERT;
        java.lang.String str6 = C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? str2 : null;
        InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX, fragmentActivity, new BuySellConvertParameters(oKPaymentSourceKWHzl, targetTab, str6 == null ? str == null ? "" : str : str6, null, null, null, null, str3 == null ? "" : str3, null, 376, null), null, 4, null);
    }

    @Override // o.InterfaceC31422lti
    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) BuySellOrderListPageActivity.class));
    }

    @Override // o.InterfaceC31422lti
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull OKBuySellSource oKBuySellSource, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, OKPaymentSourceLegacy oKPaymentSourceLegacy) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(oKBuySellSource, "");
        C31661lzi.KWHzl(BSCSelectorBottomSheet.Companion.EZpvd(bSCBuySellBaseCurrencyInfo, oKBuySellSource, oKPaymentSourceLegacy), fragmentManager, "javaClass");
    }

    @Override // o.InterfaceC31422lti
    public androidx.fragment.app.Fragment copydefault(@NotNull FragmentActivity fragmentActivity, android.os.Bundle bundle, BSCProConvertEntranceParameters bSCProConvertEntranceParameters) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        return lOH.Companion.copydefault(BSCLevel.LEVEL1, bSCProConvertEntranceParameters);
    }

    @Override // o.InterfaceC31422lti
    public void EZpvd(@NotNull android.content.Context context, @NotNull BSCEntranceParameters bSCEntranceParameters, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bSCEntranceParameters, "");
        lAG.Companion.KWHzl(context, lzI.EZpvd.OLrzqt(bSCEntranceParameters), z);
    }

    @Override // o.InterfaceC31422lti
    public void KWHzl(@NotNull final FragmentActivity fragmentActivity, @NotNull final BSCEntranceParameters bSCEntranceParameters, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(bSCEntranceParameters, "");
        if (z2) {
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43248rlh.KWHzl.AEQbTJ(InterfaceC47251tmX.class);
            LandingPageType landingPageType = LandingPageType.SIMPLE_TRADE_LEVEL2_PAGE;
            C47313tng c47313tng = new C47313tng(bSCEntranceParameters.fetchVPNInfo() == BSCTargetTab.SELL ? TradeType.SELL : TradeType.BUY, bSCEntranceParameters.isConnected(), bSCEntranceParameters.copydefault(), bSCEntranceParameters.fJNWhG(), lzI.EZpvd.KWHzl(bSCEntranceParameters.fetchVPNInfo()), bSCEntranceParameters.EZpvd() != null);
            ActivityResultRegistry activityResultRegistry = fragmentActivity.getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "");
            InterfaceC47251tmX.StateListAnimator.verifyForLandingPage$default(interfaceC47251tmX, fragmentActivity, fragmentActivity, landingPageType, activityResultRegistry, c47313tng, false, null, false, new Function1() { // from class: o.lzG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lzH.EZpvd(bSCEntranceParameters, this, fragmentActivity, z, (UnifiedVerificationStatus) obj);
                }
            }, 224, null);
            return;
        }
        EZpvd(fragmentActivity, bSCEntranceParameters, z);
    }

    public static final Unit EZpvd(BSCEntranceParameters bSCEntranceParameters, lzH lzh, FragmentActivity fragmentActivity, boolean z, UnifiedVerificationStatus unifiedVerificationStatus) {
        Intrinsics.checkNotNullParameter(unifiedVerificationStatus, "");
        if (unifiedVerificationStatus instanceof UnifiedVerificationStatus.UnifiedVerificationSuccess) {
            bSCEntranceParameters.KWHzl(((UnifiedVerificationStatus.UnifiedVerificationSuccess) unifiedVerificationStatus).OLrzqt().EZpvd());
            lzh.EZpvd(fragmentActivity, bSCEntranceParameters, z);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31422lti
    public boolean OLrzqt() {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        return ((InterfaceC6804aWL) c43248rlh.AEQbTJ(InterfaceC6804aWL.class)).copydefault("otc_agent") && !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.OTC_AGENT);
    }

    @Override // o.InterfaceC31422lti
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = ((RepositoryModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf().getApplicationContext(), RepositoryModule.Activity.class)).giSNqX().KWHzl(new SubmitOrderForOtcAgentRequestBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (java.lang.String) null, 8192, (DefaultConstructorMarker) null), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // o.InterfaceC31422lti
    public void KWHzl(@NotNull android.content.Context context, @NotNull BSCTargetTab bSCTargetTab) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bSCTargetTab, "");
        ((InterfaceC31670lzr) C43248rlh.KWHzl.AEQbTJ(InterfaceC31670lzr.class)).AEQbTJ(context, bSCTargetTab);
    }

    @Override // o.InterfaceC31422lti
    public void AEQbTJ(@NotNull android.content.Context context, ActivityResultLauncher<android.content.Intent> activityResultLauncher, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            BuySellEnableDexTradingActivity.Companion.copydefault(context, z);
        } else if (activityResultLauncher != null) {
            activityResultLauncher.launch(new android.content.Intent(context, (java.lang.Class<?>) BuySellEnableDexTradingActivity.class));
        }
    }
}
