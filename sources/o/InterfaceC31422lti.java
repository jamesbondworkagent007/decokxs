package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCProConvertEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.OKBuySellSource;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC31422lti extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, ActivityResultLauncher<android.content.Intent> activityResultLauncher, boolean z);

    void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void EZpvd(@NotNull android.content.Context context);

    void EZpvd(@NotNull android.content.Context context, @NotNull BSCEntranceParameters bSCEntranceParameters, boolean z);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull OKBuySellSource oKBuySellSource, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, OKPaymentSourceLegacy oKPaymentSourceLegacy);

    void KWHzl(@NotNull android.content.Context context, @NotNull BSCTargetTab bSCTargetTab);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull BSCEntranceParameters bSCEntranceParameters, boolean z, boolean z2);

    void OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    boolean OLrzqt();

    androidx.fragment.app.Fragment copydefault(@NotNull FragmentActivity fragmentActivity, android.os.Bundle bundle, BSCProConvertEntranceParameters bSCProConvertEntranceParameters);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.lti$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public static /* synthetic */ void openConvert$default(InterfaceC31422lti interfaceC31422lti, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openConvert");
            }
            java.lang.String str5 = (i & 2) != 0 ? null : str;
            java.lang.String str6 = (i & 4) != 0 ? null : str2;
            java.lang.String str7 = (i & 8) != 0 ? null : str3;
            if ((i & 16) != 0) {
                str4 = "";
            }
            interfaceC31422lti.AEQbTJ(context, str5, str6, str7, str4);
        }

        public static /* synthetic */ void openConvertWithoutKyc$default(InterfaceC31422lti interfaceC31422lti, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openConvertWithoutKyc");
            }
            interfaceC31422lti.OLrzqt(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null, (i & 32) != 0 ? "" : str5);
        }

        public static /* synthetic */ void goToBuySellConvertBottomSheet$default(InterfaceC31422lti interfaceC31422lti, androidx.fragment.app.FragmentManager fragmentManager, OKBuySellSource oKBuySellSource, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, OKPaymentSourceLegacy oKPaymentSourceLegacy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellConvertBottomSheet");
            }
            if ((i & 4) != 0) {
                bSCBuySellBaseCurrencyInfo = null;
            }
            if ((i & 8) != 0) {
                oKPaymentSourceLegacy = null;
            }
            interfaceC31422lti.EZpvd(fragmentManager, oKBuySellSource, bSCBuySellBaseCurrencyInfo, oKPaymentSourceLegacy);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment getProBuySellConvertWidget$default(InterfaceC31422lti interfaceC31422lti, FragmentActivity fragmentActivity, android.os.Bundle bundle, BSCProConvertEntranceParameters bSCProConvertEntranceParameters, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProBuySellConvertWidget");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                bSCProConvertEntranceParameters = null;
            }
            return interfaceC31422lti.copydefault(fragmentActivity, bundle, bSCProConvertEntranceParameters);
        }

        public static /* synthetic */ void goToBuySellConvertPage$default(InterfaceC31422lti interfaceC31422lti, android.content.Context context, BSCEntranceParameters bSCEntranceParameters, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellConvertPage");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC31422lti.EZpvd(context, bSCEntranceParameters, z);
        }

        public static /* synthetic */ void goToBuySellConvertPageWithCheck$default(InterfaceC31422lti interfaceC31422lti, FragmentActivity fragmentActivity, BSCEntranceParameters bSCEntranceParameters, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellConvertPageWithCheck");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            interfaceC31422lti.KWHzl(fragmentActivity, bSCEntranceParameters, z, z2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lti */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToCreateWalletPage$default(InterfaceC31422lti interfaceC31422lti, android.content.Context context, ActivityResultLauncher activityResultLauncher, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToCreateWalletPage");
            }
            if ((i & 2) != 0) {
                activityResultLauncher = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC31422lti.AEQbTJ(context, activityResultLauncher, z);
        }
    }
}
