package com.okinc.find_ui.widgetprovider.p2p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import kotlin.jvm.internal.Intrinsics;
import o.C35192nqg;
import o.C35197nql;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class P2PCryptoWidgetProvider extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        pUU.EZpvd("P2PCryptoWidgetProvider", "P2PCryptoWidgetProvider onUpdate() called with: context = " + context + ", appWidgetManager = " + appWidgetManager + ", appWidgetIds = " + iArr);
        WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(P2PCryptoWidgetWorker.class).build());
        pUU.EZpvd("P2PCryptoWidgetProvider", "onUpdate() end");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i : iArr) {
            C35192nqg.EZpvd(context, i, "P2P_MARKET_PREFS_KEY_STRING");
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        C35197nql.ensureP2PWorkStart$default(context, 0L, 2, null);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (C35197nql.KWHzl(context)) {
            return;
        }
        WorkManager.getInstance(context).cancelUniqueWork("p2p_widget_work");
        WorkManager.getInstance(context).cancelUniqueWork("p2p_widget_work_periodic");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        super.onReceive(context, intent);
        pUU.EZpvd("P2PCryptoWidgetProvider", "Received intent: " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -689938766) {
                if (iHashCode == 1619576947 && action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                    pUU.EZpvd("P2PCryptoWidgetProvider", "Skipping widget update in onReceive, will be handled by onUpdate");
                    return;
                }
                return;
            }
            if (action.equals("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS")) {
                WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(P2PCryptoWidgetWorker.class).build());
                pUU.EZpvd("P2PCryptoWidgetProvider", "Enqueued worker for intent action: " + intent.getAction());
            }
        }
    }
}
