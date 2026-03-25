package com.okinc.find_ui.widgetprovider.p2p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o.C35124npR;
import o.C43296rmc;
import o.C43453rpa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class P2PCryptoWidgetWorker extends CoroutineWorker {
    public static final Activity Companion = new Activity(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PCryptoWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) {
        C43296rmc.AEQbTJ("P2PCryptoWidgetProvider", "doWork() P2PCryptoWidgetWorker called");
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (!c43453rpa.KWHzl(applicationContext)) {
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNullExpressionValue(resultRetry, "");
            return resultRetry;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(getApplicationContext());
        if (appWidgetManager == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure, "");
            return resultFailure;
        }
        Activity activity = Companion;
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        Activity.updateP2P$default(activity, appWidgetManager, applicationContext2, false, 4, null);
        boolean z = getInputData().getBoolean("CREATE_REPEAT_WORK", true);
        C43296rmc.AEQbTJ("P2PCryptoWidgetProvider", "shouldCreateWork " + z);
        if (z) {
            EZpvd();
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.widgetprovider.p2p.P2PCryptoWidgetWorker.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ Job updateP2P$default(Activity activity, AppWidgetManager appWidgetManager, Context context, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return activity.AEQbTJ(appWidgetManager, context, z);
        }

        public final Job AEQbTJ(@NotNull AppWidgetManager appWidgetManager, @NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(appWidgetManager, "");
            Intrinsics.checkNotNullParameter(context, "");
            return C35124npR.EZpvd(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) P2PCryptoWidgetProvider.class)), context, appWidgetManager, z);
        }
    }

    private final void EZpvd() {
        C43296rmc.EZpvd("P2PCryptoWidgetProvider", "scheduleNextWork() called");
        WorkManager workManager = WorkManager.getInstance(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(workManager, "");
        workManager.enqueueUniqueWork("p2p_widget_work", ExistingWorkPolicy.APPEND_OR_REPLACE, new OneTimeWorkRequest.Builder(P2PCryptoWidgetWorker.class).setInitialDelay(3L, TimeUnit.MINUTES).build());
    }
}
