package com.okinc.find_ui.widgetprovider.feed;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FourNewsWidgetUpdateWorker extends Worker {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FourNewsWidgetUpdateWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(getApplicationContext());
        int[] appWidgetIds = AppWidgetManager.getInstance(getApplicationContext()).getAppWidgetIds(new ComponentName(getApplicationContext(), (Class<?>) FourNewsWidget.class));
        FourNewsWidget fourNewsWidget = new FourNewsWidget();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        Intrinsics.copydefault(appWidgetManager);
        Intrinsics.copydefault(appWidgetIds);
        fourNewsWidget.onUpdate(applicationContext, appWidgetManager, appWidgetIds);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.widgetprovider.feed.FourNewsWidgetUpdateWorker.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void schedulePeriodicWork$default(TaskDescription taskDescription, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            taskDescription.AEQbTJ(context, z);
        }

        public final void AEQbTJ(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) FourNewsWidgetUpdateWorker.class, 15L, TimeUnit.SECONDS).build();
            WorkManager workManager = WorkManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(workManager, "");
            workManager.enqueueUniquePeriodicWork("NewsWidgetUpdateWork", ExistingPeriodicWorkPolicy.KEEP, periodicWorkRequestBuild);
            if (z) {
                workManager.enqueue(new OneTimeWorkRequest.Builder(FourNewsWidgetUpdateWorker.class).build());
            }
        }
    }
}
