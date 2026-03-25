package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35200nqo {
    public static final void KWHzl(@NotNull android.widget.RemoteViews remoteViews, int i, @NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC35107npA.class);
        intent.putExtra("WIDGET_TYPE_STRING", str);
        intent.putExtra("appWidgetId", i);
        remoteViews.setOnClickPendingIntent(qZH.StateListAnimator.OcIXYQ, android.app.PendingIntent.getActivity(context, i, intent, 67108864));
    }

    public static final void AEQbTJ(@NotNull android.widget.RemoteViews remoteViews, int i, @NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC35107npA.class);
        intent.putExtra("WIDGET_TYPE_STRING", str);
        intent.putExtra("appWidgetId", i);
        remoteViews.setOnClickPendingIntent(qZH.StateListAnimator.ORxRYg, android.app.PendingIntent.getActivity(context, i, intent, 67108864));
    }
}
