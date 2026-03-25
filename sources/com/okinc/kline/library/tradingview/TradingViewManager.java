package com.okinc.kline.library.tradingview;

import android.app.ActivityManager;
import android.content.Context;
import android.webkit.WebChromeClient;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36327oXr;
import o.C38352pVp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TradingViewManager {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private static TradingViewManager instance;
    private static C36327oXr mTradingView;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.library.tradingview.TradingViewManager.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TradingViewManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TradingViewManager() {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.library.tradingview.TradingViewManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean KWHzl(Context context) throws Throwable {
            String packageName = context.getPackageName();
            String strEZpvd = C38352pVp.EZpvd(context);
            return strEZpvd == null || Intrinsics.EZpvd((Object) strEZpvd, (Object) packageName);
        }

        public final boolean OLrzqt(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return KWHzl(context);
        }

        public final TradingViewManager copydefault(@NotNull Context context) {
            TradingViewManager tradingViewManager;
            synchronized (this) {
                Intrinsics.checkNotNullParameter(context, "");
                if (TradingViewManager.instance == null) {
                    if (!KWHzl(context)) {
                        String strEZpvd = C38352pVp.EZpvd(context);
                        if (strEZpvd == null) {
                            strEZpvd = "unknown";
                        }
                        throw new IllegalStateException("TradingView (WebView) can only be used in the main process. Current process: " + strEZpvd + ". ");
                    }
                    TradingViewManager.instance = new TradingViewManager(null);
                    TradingViewManager.mTradingView = new C36327oXr(context);
                }
                tradingViewManager = TradingViewManager.instance;
                Intrinsics.copydefault(tradingViewManager);
            }
            return tradingViewManager;
        }

        public final TradingViewManager OLrzqt() {
            TradingViewManager tradingViewManager;
            synchronized (this) {
                tradingViewManager = TradingViewManager.instance;
            }
            return tradingViewManager;
        }
    }

    public final C36327oXr getTradingView(@NotNull WebChromeClient webChromeClient) {
        Intrinsics.checkNotNullParameter(webChromeClient, "");
        C36327oXr c36327oXr = mTradingView;
        if (c36327oXr != null) {
            c36327oXr.setWebChromeClient(webChromeClient);
        }
        initTheme();
        return mTradingView;
    }

    public final void initTheme() {
        C36327oXr c36327oXr = mTradingView;
        if (c36327oXr != null) {
            c36327oXr.KWHzl();
        }
    }

    public final void removeTradingView() {
        C36327oXr c36327oXr = mTradingView;
        if (c36327oXr != null) {
            if (c36327oXr != null) {
                c36327oXr.clearCache(true);
            }
            mTradingView = null;
            instance = null;
        }
    }

    public final void clearCache() {
        C36327oXr c36327oXr = mTradingView;
        if (c36327oXr != null) {
            c36327oXr.clearCache(true);
        }
    }

    public final boolean isServiceRunning(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return isServiceRunning(context, "com.okinc.kline.server.HttpService");
    }

    public final boolean isServiceRunning(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = false;
        if (str.length() == 0) {
            return false;
        }
        Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(30);
        Intrinsics.checkNotNullExpressionValue(runningServices, "");
        if (runningServices.isEmpty()) {
            return false;
        }
        Iterator<T> it = runningServices.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((Object) ((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), (Object) str)) {
                z = true;
            }
        }
        return z;
    }
}
