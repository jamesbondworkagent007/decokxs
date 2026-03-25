package o;

import com.okinc.find_ui.widgetprovider.feed.FourNewsWidget;
import com.okinc.find_ui.widgetprovider.feed.FourNewsWidgetUpdateWorker;
import com.okinc.find_ui.widgetprovider.feed.SingleNewsWidget;
import com.okinc.find_ui.widgetprovider.feed.SingleNewsWidgetUpdateWorker;
import com.okinc.find_ui.widgetprovider.feed.TwoNewsWidget;
import com.okinc.find_ui.widgetprovider.feed.TwoNewsWidgetUpdateWorker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35117npK {
    public static final C35117npK EZpvd = new C35117npK();

    private C35117npK() {
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) FourNewsWidget.class));
        Intrinsics.copydefault(appWidgetIds);
        if (!(!(appWidgetIds.length == 0))) {
            appWidgetIds = null;
        }
        if (appWidgetIds != null) {
            FourNewsWidgetUpdateWorker.Companion.AEQbTJ(context, true);
        }
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) TwoNewsWidget.class));
        Intrinsics.copydefault(appWidgetIds2);
        if (!(!(appWidgetIds2.length == 0))) {
            appWidgetIds2 = null;
        }
        if (appWidgetIds2 != null) {
            TwoNewsWidgetUpdateWorker.Companion.KWHzl(context, true);
        }
        int[] appWidgetIds3 = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) SingleNewsWidget.class));
        Intrinsics.copydefault(appWidgetIds3);
        if (((appWidgetIds3.length == 0) ^ true ? appWidgetIds3 : null) != null) {
            SingleNewsWidgetUpdateWorker.Companion.copydefault(context, true);
        }
    }
}
