package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.assets.api.model.AssetsValuationPeriod;
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.assets.api.model.RechargeFromType;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.assets.api.model.WithdrawDisabledReason;
import com.okinc.assets.api.model.satoshitest.SatoshiTestPageArgs;
import com.okinc.assets.api.utils.CacheLevel;
import com.okinc.assets.backend.api.WithdrawEntryPoint;
import com.okinc.assets.backend.api.model.AssetMaxApyEarnInfo;
import com.okinc.assets.backend.api.model.GetDepositSupportResponse;
import com.okinc.assets.backend.api.model.HomePageAssetTrend;
import com.okinc.assets.backend.api.model.SupportCurrency;
import com.okinc.assets.backend.api.model.WithdrawHis;
import com.okinc.network.okg.cache.CacheStrategy;
import kotlin.coroutines.Continuation;
import o.InterfaceC8223ayg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8224ayh extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SupportCurrency>, ? extends java.lang.Throwable>> continuation);

    InterfaceC8223ayg AEQbTJ(@NotNull InterfaceC8223ayg.ActionBar actionBar);

    void AEQbTJ(@NotNull android.content.Context context, java.lang.Integer num, java.lang.Integer num2);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull DepositEntryPoint depositEntryPoint, android.os.Bundle bundle, @NotNull RechargeFromType rechargeFromType, @NotNull java.util.List<? extends CacheLevel> list, java.lang.String str);

    void EZpvd(@NotNull android.app.Activity activity, @NotNull WithdrawEntryPoint withdrawEntryPoint, @NotNull java.util.List<? extends CacheLevel> list, java.lang.String str);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    wXX KWHzl();

    void KWHzl(@NotNull android.content.Context context, @NotNull SatoshiTestPageArgs satoshiTestPageArgs, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void KWHzl(@NotNull android.content.Context context, WithdrawHis withdrawHis, java.lang.String str, java.lang.Boolean bool, java.lang.String str2);

    java.lang.Object OLrzqt(@NotNull AssetsValuationPeriod assetsValuationPeriod, @NotNull java.lang.String str, boolean z, CacheStrategy cacheStrategy, int i, boolean z2, boolean z3, boolean z4, @NotNull Continuation<? super AbstractC43419rot<HomePageAssetTrend, ? extends java.lang.Throwable>> continuation);

    java.lang.Object OLrzqt(java.lang.Integer num, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<GetDepositSupportResponse, ? extends java.lang.Throwable>> continuation);

    void OLrzqt(@NotNull android.app.Activity activity, @NotNull TransferDetail transferDetail, @NotNull java.util.List<? extends CacheLevel> list);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str);

    java.lang.Object copydefault(int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AssetMaxApyEarnInfo>, ? extends java.lang.Throwable>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super WithdrawDisabledReason> continuation);

    void copydefault(@NotNull android.content.Context context);

    /* JADX INFO: renamed from: o.ayh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ayh */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToWithdraw$default(InterfaceC8224ayh interfaceC8224ayh, android.app.Activity activity, WithdrawEntryPoint withdrawEntryPoint, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToWithdraw");
            }
            if ((i & 4) != 0) {
                list = C56402yEa.EZpvd(CacheLevel.Network);
            }
            if ((i & 8) != 0) {
                str = "";
            }
            interfaceC8224ayh.EZpvd(activity, withdrawEntryPoint, list, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ayh */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToTransfer$default(InterfaceC8224ayh interfaceC8224ayh, android.app.Activity activity, TransferDetail transferDetail, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToTransfer");
            }
            if ((i & 4) != 0) {
                list = C56402yEa.EZpvd(CacheLevel.Network);
            }
            interfaceC8224ayh.OLrzqt(activity, transferDetail, (java.util.List<? extends CacheLevel>) list);
        }

        public static /* synthetic */ java.lang.Object getExchangeSupportedAddressForWallet$default(InterfaceC8224ayh interfaceC8224ayh, java.lang.Integer num, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExchangeSupportedAddressForWallet");
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.TRUE;
            }
            return interfaceC8224ayh.OLrzqt(num, bool, (Continuation<? super AbstractC43419rot<GetDepositSupportResponse, ? extends java.lang.Throwable>>) continuation);
        }

        public static /* synthetic */ void goToWithdrawHistoryDetails$default(InterfaceC8224ayh interfaceC8224ayh, android.content.Context context, WithdrawHis withdrawHis, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToWithdrawHistoryDetails");
            }
            WithdrawHis withdrawHis2 = (i & 2) != 0 ? null : withdrawHis;
            java.lang.String str3 = (i & 4) != 0 ? null : str;
            if ((i & 8) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            interfaceC8224ayh.KWHzl(context, withdrawHis2, str3, bool, (i & 16) != 0 ? null : str2);
        }

        public static /* synthetic */ void goToDepositHistoryDetails$default(InterfaceC8224ayh interfaceC8224ayh, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDepositHistoryDetails");
            }
            interfaceC8224ayh.EZpvd(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null);
        }

        public static /* synthetic */ void goToFundingHistory$default(InterfaceC8224ayh interfaceC8224ayh, android.content.Context context, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToFundingHistory");
            }
            if ((i & 2) != 0) {
                num = -1;
            }
            if ((i & 4) != 0) {
                num2 = 0;
            }
            interfaceC8224ayh.AEQbTJ(context, num, num2);
        }

        public static /* synthetic */ java.lang.Object getAssetTrendHomePage$default(InterfaceC8224ayh interfaceC8224ayh, AssetsValuationPeriod assetsValuationPeriod, java.lang.String str, boolean z, CacheStrategy cacheStrategy, int i, boolean z2, boolean z3, boolean z4, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC8224ayh.OLrzqt(assetsValuationPeriod, str, z, (i2 & 8) != 0 ? null : cacheStrategy, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? true : z4, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetTrendHomePage");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ayh */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToDeposit$default(InterfaceC8224ayh interfaceC8224ayh, FragmentActivity fragmentActivity, DepositEntryPoint depositEntryPoint, android.os.Bundle bundle, RechargeFromType rechargeFromType, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDeposit");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            android.os.Bundle bundle2 = bundle;
            if ((i & 8) != 0) {
                rechargeFromType = RechargeFromType.OTHER;
            }
            RechargeFromType rechargeFromType2 = rechargeFromType;
            if ((i & 16) != 0) {
                list = C56402yEa.EZpvd(CacheLevel.Network);
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                str = "";
            }
            interfaceC8224ayh.AEQbTJ(fragmentActivity, depositEntryPoint, bundle2, rechargeFromType2, list2, str);
        }
    }
}
