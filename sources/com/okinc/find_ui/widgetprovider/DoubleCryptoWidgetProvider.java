package com.okinc.find_ui.widgetprovider;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.find_ui.widgetprovider.DoubleCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.logic.DoubleCryptoWidgetWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C35192nqg;
import o.C35197nql;
import o.C43296rmc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class DoubleCryptoWidgetProvider extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        C43296rmc.AEQbTJ("CryptoWidgetProvider", " DoubleCryptoWidgetProvider onUpdate() called with: context = " + context + ", appWidgetManager = " + appWidgetManager + ", appWidgetIds = " + iArr);
        WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(DoubleCryptoWidgetWorker.class).build());
        C43296rmc.AEQbTJ("CryptoWidgetProvider", "onUpdate() end");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        C43296rmc.AEQbTJ("CryptoWidgetProvider", " DoubleCryptoWidgetProvider onDeleted() called with: context = " + context + ", appWidgetIds = " + iArr);
        for (int i : iArr) {
            C35192nqg.EZpvd(context, i, "TWO_INST_PREFS_KEY_STRING");
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        C32866mlf.onEvent$default("MobileWidget_Initialize_AddWidget_Click", (TrackChannel[]) null, new Function1() { // from class: o.npF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DoubleCryptoWidgetProvider.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        C43296rmc.AEQbTJ("CryptoWidgetProvider", "DoubleCryptoWidgetProvider onEnabled() called with: context = " + context);
        C35197nql.ensureWorkStart$default(context, 0L, 2, null);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43296rmc.AEQbTJ("CryptoWidgetProvider", "DoubleCryptoWidgetProvider onDisabled() called with: context = " + context);
        if (C35197nql.KWHzl(context)) {
            return;
        }
        WorkManager.getInstance(context).cancelUniqueWork("crypto_widget_work_periodic");
        WorkManager.getInstance(context).cancelUniqueWork("crypto_widget_work");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
