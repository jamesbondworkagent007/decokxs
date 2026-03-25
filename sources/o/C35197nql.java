package o;

import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.okinc.find_ui.widgetprovider.CryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.DoubleCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.FiveCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.logic.CryptoWidgetWorker;
import com.okinc.find_ui.widgetprovider.logic.TripleCryptoWidgetWorker;
import com.okinc.find_ui.widgetprovider.p2p.P2PCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.p2p.P2PCryptoWidgetWorker;
import com.okinc.unify_trade.biz.InstrumentInfo;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35197nql {
    public static final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget() called with: context = " + context);
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        if (appWidgetManager == null) {
            return true;
        }
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) CryptoWidgetProvider.class));
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) DoubleCryptoWidgetProvider.class));
        int[] appWidgetIds3 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) TripleCryptoWidgetWorker.class));
        int[] appWidgetIds4 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) FiveCryptoWidgetProvider.class));
        int[] appWidgetIds5 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) P2PCryptoWidgetProvider.class));
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget singleWidgetIds:  " + (appWidgetIds != null ? java.lang.Integer.valueOf(appWidgetIds.length) : null));
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget twoWidgetIds:  " + appWidgetIds2 + "?.size");
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget threeWidgetIds:  " + appWidgetIds3 + "?.size");
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget FiveWidgetIds:  " + appWidgetIds4 + "?.size");
        pUU.KWHzl("CryptoWidgetProvider", "isValidAppWidget P2pWidgetIds:  " + (appWidgetIds5 != null ? java.lang.Integer.valueOf(appWidgetIds5.length) : null));
        if (appWidgetIds != null) {
            if (!(appWidgetIds.length == 0)) {
                return true;
            }
        }
        if (appWidgetIds2 != null) {
            if (!(appWidgetIds2.length == 0)) {
                return true;
            }
        }
        if (appWidgetIds3 != null) {
            if (!(appWidgetIds3.length == 0)) {
                return true;
            }
        }
        if (appWidgetIds4 != null) {
            if (!(appWidgetIds4.length == 0)) {
                return true;
            }
        }
        if (appWidgetIds5 != null) {
            if (!(appWidgetIds5.length == 0)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String AEQbTJ(@NotNull InstrumentInfo instrumentInfo) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(instrumentInfo, "");
        if (instrumentInfo.getBaseCcy().length() > 0) {
            return instrumentInfo.getBaseCcy();
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) instrumentInfo.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "-" : objM7377constructorimpl);
    }

    public static final java.lang.String KWHzl(@NotNull InstrumentInfo instrumentInfo) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(instrumentInfo, "");
        if (instrumentInfo.getQuoteCcy().length() > 0) {
            return instrumentInfo.getQuoteCcy();
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) instrumentInfo.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "-" : objM7377constructorimpl);
    }

    public static final java.lang.String OLrzqt(@NotNull InstrumentInfo instrumentInfo) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(instrumentInfo, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.String displayId = instrumentInfo.getDisplayId();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
                displayId = null;
            }
            if (displayId == null) {
                displayId = instrumentInfo.getInstId();
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) displayId, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "-" : objM7377constructorimpl);
    }

    public static /* synthetic */ void ensureWorkStart$default(android.content.Context context, long j, int i, java.lang.Object obj) throws java.lang.Throwable {
        if ((i & 2) != 0) {
            j = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        }
        OLrzqt(context, j);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, long j) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("CryptoWidgetProvider", "ensureWorkStart() called ");
        PeriodicWorkRequest.Builder builder = new PeriodicWorkRequest.Builder((java.lang.Class<? extends ListenableWorker>) CryptoWidgetWorker.class, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        kotlin.Pair[] pairArr = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.FALSE)};
        Data.Builder builder2 = new Data.Builder();
        kotlin.Pair pair = pairArr[0];
        builder2.put((java.lang.String) pair.getFirst(), pair.getSecond());
        Data dataBuild = builder2.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        WorkManager.getInstance(context).enqueueUniquePeriodicWork("crypto_widget_work_periodic", ExistingPeriodicWorkPolicy.KEEP, builder.setInputData(dataBuild).build());
        OneTimeWorkRequest.Builder initialDelay = new OneTimeWorkRequest.Builder(CryptoWidgetWorker.class).setInitialDelay(3L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.Pair[] pairArr2 = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.TRUE)};
        Data.Builder builder3 = new Data.Builder();
        kotlin.Pair pair2 = pairArr2[0];
        builder3.put((java.lang.String) pair2.getFirst(), pair2.getSecond());
        Data dataBuild2 = builder3.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild2, "");
        WorkManager.getInstance(context).enqueueUniqueWork("crypto_widget_work", ExistingWorkPolicy.KEEP, initialDelay.setInputData(dataBuild2).build());
    }

    public static final void EZpvd(@NotNull android.content.Context context) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("CryptoWidgetProvider", "forceRefresh() called");
        OneTimeWorkRequest.Builder initialDelay = new OneTimeWorkRequest.Builder(CryptoWidgetWorker.class).setInitialDelay(3L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.Pair[] pairArr = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.FALSE)};
        Data.Builder builder = new Data.Builder();
        kotlin.Pair pair = pairArr[0];
        builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
        Data dataBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        WorkManager.getInstance(context).enqueue(initialDelay.setInputData(dataBuild).build());
    }

    public static /* synthetic */ void ensureP2PWorkStart$default(android.content.Context context, long j, int i, java.lang.Object obj) throws java.lang.Throwable {
        if ((i & 2) != 0) {
            j = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        }
        KWHzl(context, j);
    }

    public static final void KWHzl(@NotNull android.content.Context context, long j) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("P2PCryptoWidgetProvider", "ensureP2PWorkStart() called ");
        PeriodicWorkRequest.Builder builder = new PeriodicWorkRequest.Builder((java.lang.Class<? extends ListenableWorker>) P2PCryptoWidgetWorker.class, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        kotlin.Pair[] pairArr = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.FALSE)};
        Data.Builder builder2 = new Data.Builder();
        kotlin.Pair pair = pairArr[0];
        builder2.put((java.lang.String) pair.getFirst(), pair.getSecond());
        Data dataBuild = builder2.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        WorkManager.getInstance(context).enqueueUniquePeriodicWork("p2p_widget_work_periodic", ExistingPeriodicWorkPolicy.KEEP, builder.setInputData(dataBuild).build());
        OneTimeWorkRequest.Builder initialDelay = new OneTimeWorkRequest.Builder(P2PCryptoWidgetWorker.class).setInitialDelay(3L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.Pair[] pairArr2 = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.TRUE)};
        Data.Builder builder3 = new Data.Builder();
        kotlin.Pair pair2 = pairArr2[0];
        builder3.put((java.lang.String) pair2.getFirst(), pair2.getSecond());
        Data dataBuild2 = builder3.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild2, "");
        WorkManager.getInstance(context).enqueueUniqueWork("p2p_widget_work", ExistingWorkPolicy.KEEP, initialDelay.setInputData(dataBuild2).build());
    }

    public static final void AEQbTJ(@NotNull android.content.Context context) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("P2PCryptoWidgetProvider", "forceP2PRefresh() called");
        OneTimeWorkRequest.Builder initialDelay = new OneTimeWorkRequest.Builder(P2PCryptoWidgetWorker.class).setInitialDelay(3L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.Pair[] pairArr = {C56390yDp.OLrzqt("CREATE_REPEAT_WORK", java.lang.Boolean.FALSE)};
        Data.Builder builder = new Data.Builder();
        kotlin.Pair pair = pairArr[0];
        builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
        Data dataBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        WorkManager.getInstance(context).enqueue(initialDelay.setInputData(dataBuild).build());
    }
}
