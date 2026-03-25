package o;

import android.widget.RemoteViewsService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35116npJ implements RemoteViewsService.RemoteViewsFactory {
    public int AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public java.util.ArrayList<C35201nqp> KWHzl;
    public final android.content.Context OLrzqt;
    public java.util.List<java.lang.String> copydefault;
    public final android.content.Intent gEmmrt;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }

    public C35116npJ(@NotNull android.content.Context context, android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.KWHzl = new java.util.ArrayList<>();
        this.gEmmrt = intent;
        this.copydefault = yDY.AhwBna();
        this.EZpvd = C35192nqg.copydefault(context, "FIVE_INST_PREFS_KEY_STRING");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        android.content.Intent intent = this.gEmmrt;
        int intExtra = intent != null ? intent.getIntExtra("widgetId", 0) : 0;
        this.AEQbTJ = intExtra;
        java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(this.OLrzqt, "FIVE_INST_PREFS_KEY_STRING_" + intExtra);
        if (!(!listEZpvd.isEmpty())) {
            listEZpvd = null;
        }
        if (listEZpvd == null) {
            listEZpvd = this.EZpvd;
        }
        this.copydefault = listEZpvd;
        pUU.KWHzl("CryptoWidgetProvider", "FiveRemoteViewFactory onCreate appWidgetId=" + this.AEQbTJ + ",crypto=" + listEZpvd);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        pUU.KWHzl("CryptoWidgetProvider", "FiveRemoteViewFactory onDataSetChanged appWidgetId=" + this.AEQbTJ + ",crypto=" + this.copydefault);
        java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(this.OLrzqt, "FIVE_INST_PREFS_KEY_STRING_" + this.AEQbTJ);
        if (!(!listEZpvd.isEmpty())) {
            listEZpvd = null;
        }
        if (listEZpvd == null) {
            listEZpvd = this.EZpvd;
        }
        this.copydefault = listEZpvd;
        this.KWHzl.clear();
        int i = 0;
        for (java.lang.Object obj : this.copydefault) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.ArrayList<C35201nqp> arrayList = this.KWHzl;
            C35201nqp c35201nqpEZpvd = C35186nqa.AEQbTJ.EZpvd("FIVE_INST_PREFS_KEY_STRING_" + this.AEQbTJ, (java.lang.String) obj);
            if (c35201nqpEZpvd == null) {
                c35201nqpEZpvd = C35199nqn.AEQbTJ();
            }
            arrayList.add(c35201nqpEZpvd);
            i++;
        }
        C35186nqa.AEQbTJ.EZpvd("FIVE_INST_PREFS_KEY_STRING_" + this.AEQbTJ);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.KWHzl.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getViewAt(int i) {
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.OLrzqt.getPackageName(), qZH.ActionBar.GGlJim);
        pUU.KWHzl("CryptoWidgetProvider", "FiveRemoteViewFactory onDataSetChanged appWidgetId=" + this.AEQbTJ + ",position=" + i);
        if (this.KWHzl.size() > i) {
            if (CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i) != null && !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i), C35199nqn.AEQbTJ())) {
                int i2 = qZH.StateListAnimator.QKVWgx;
                C35201nqp c35201nqp = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setTextViewText(i2, c35201nqp != null ? c35201nqp.AhwBna() : null);
                int i3 = qZH.StateListAnimator.QOLQEE;
                C35201nqp c35201nqp2 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setTextViewText(i3, c35201nqp2 != null ? c35201nqp2.gEmmrt() : null);
                int i4 = qZH.StateListAnimator.AwvSrB;
                C35201nqp c35201nqp3 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setTextViewText(i4, c35201nqp3 != null ? c35201nqp3.valueOf() : null);
                int i5 = qZH.StateListAnimator.wlaJM;
                C35201nqp c35201nqp4 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setTextViewText(i5, c35201nqp4 != null ? c35201nqp4.copydefault() : null);
                int i6 = qZH.StateListAnimator.ejfBZ;
                C35201nqp c35201nqp5 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setImageViewBitmap(i6, c35201nqp5 != null ? c35201nqp5.EZpvd() : null);
                int i7 = qZH.StateListAnimator.zLjUOn;
                C35201nqp c35201nqp6 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setImageViewBitmap(i7, c35201nqp6 != null ? c35201nqp6.OLrzqt() : null);
                int i8 = qZH.StateListAnimator.wlaJM;
                C35201nqp c35201nqp7 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                remoteViews.setTextColor(i8, c35201nqp7 != null ? c35201nqp7.AEQbTJ() : 0);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                C35201nqp c35201nqp8 = (C35201nqp) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
                intent.setData(android.net.Uri.parse("okex://trade_kline?id=" + (c35201nqp8 != null ? c35201nqp8.KWHzl() : null) + "&type=SPOT&refreshWidget=1"));
                remoteViews.setOnClickFillInIntent(qZH.StateListAnimator.getFieldNames, intent);
            } else {
                pUU.KWHzl("CryptoWidgetProvider", "FiveRemoteViewFactory onDataSetChanged item data isEmpty=" + this.AEQbTJ + ",position=" + i);
            }
        }
        return remoteViews;
    }
}
