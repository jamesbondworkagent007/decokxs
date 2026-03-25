package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okex.lite_market_api.bean.MarketItemQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sxI extends InterfaceC43217rlC {
    androidx.fragment.app.Fragment AEQbTJ(@NotNull java.lang.String str);

    StateFlow<java.util.Map<java.lang.String, FairPriceTickerData>> AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, java.lang.String str, long j);

    void AEQbTJ(@NotNull android.app.Activity activity, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, MarketItemQuote marketItemQuote);

    boolean AEQbTJ();

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull sxH sxh, boolean z);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

    androidx.fragment.app.Fragment KWHzl();

    androidx.fragment.app.Fragment KWHzl(boolean z);

    sxC OLrzqt();

    void OLrzqt(@NotNull android.content.Context context);

    sxD copydefault();

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function1<? super wXX, Unit> function12);

    public static final class ActionBar {
        public static /* synthetic */ void enterLiteMarketAsset$default(sxI sxi, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, MarketItemQuote marketItemQuote, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterLiteMarketAsset");
            }
            if ((i & 16) != 0) {
                marketItemQuote = null;
            }
            sxi.AEQbTJ(context, str, str2, str3, marketItemQuote);
        }

        public static /* synthetic */ void goToCRSearch$default(sxI sxi, android.content.Context context, java.lang.String str, sxH sxh, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToCRSearch");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            sxi.EZpvd(context, str, sxh, z);
        }

        public static /* synthetic */ void showLiteMarketPriceAlertAddDialog$default(sxI sxi, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLiteMarketPriceAlertAddDialog");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            sxi.EZpvd(fragmentManager, str, str2, str3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.sxI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setWatchList$default(sxI sxi, android.app.Activity activity, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWatchList");
            }
            if ((i & 32) != 0) {
                function0 = null;
            }
            sxi.AEQbTJ(activity, z, str, str2, str3, function0);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment getLiteDiscoverFragment$default(sxI sxi, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiteDiscoverFragment");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return sxi.KWHzl(z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.sxI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToTradingPairSelectionBottomSheet$default(sxI sxi, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, Function0 function0, ActivityResultLauncher activityResultLauncher, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToTradingPairSelectionBottomSheet");
            }
            sxi.copydefault(fragmentManager, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : activityResultLauncher, (i & 16) != 0 ? null : function12);
        }

        public static /* synthetic */ StateFlow httpThenSubscribeFairPriceData$default(sxI sxi, LifecycleOwner lifecycleOwner, java.util.List list, boolean z, java.lang.String str, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpThenSubscribeFairPriceData");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str = null;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                j = 1000;
            }
            return sxi.AEQbTJ(lifecycleOwner, (java.util.List<java.lang.String>) list, z2, str2, j);
        }
    }
}
