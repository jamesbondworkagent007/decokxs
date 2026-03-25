package o;

import android.widget.RemoteViewsService;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35115npI implements RemoteViewsService.RemoteViewsFactory {
    public java.util.List<java.lang.String> AEQbTJ;
    public final android.content.Intent AYXKKw;
    public final android.content.Context EZpvd;
    public java.util.ArrayList<C35201nqp> KWHzl;
    public int OLrzqt;
    public final java.util.List<java.lang.String> copydefault;

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

    public C35115npI(@NotNull android.content.Context context, android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.KWHzl = new java.util.ArrayList<>();
        this.AYXKKw = intent;
        this.AEQbTJ = yDY.AhwBna();
        this.copydefault = C35192nqg.copydefault(context, "TWO_INST_PREFS_KEY_STRING");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        android.content.Intent intent = this.AYXKKw;
        int intExtra = intent != null ? intent.getIntExtra("doubleWidgetId", 0) : 0;
        this.OLrzqt = intExtra;
        java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(this.EZpvd, "TWO_INST_PREFS_KEY_STRING_" + intExtra);
        if (!(!listEZpvd.isEmpty())) {
            listEZpvd = null;
        }
        if (listEZpvd == null) {
            listEZpvd = this.copydefault;
        }
        this.AEQbTJ = listEZpvd;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(this.EZpvd, "TWO_INST_PREFS_KEY_STRING_" + this.OLrzqt);
        if (!(!listEZpvd.isEmpty())) {
            listEZpvd = null;
        }
        if (listEZpvd == null) {
            listEZpvd = this.copydefault;
        }
        this.AEQbTJ = listEZpvd;
        this.KWHzl.clear();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, C35201nqp>> mapAEQbTJ = C35186nqa.AEQbTJ.AEQbTJ();
        java.lang.String str = "TWO_INST_PREFS_KEY_STRING_" + this.OLrzqt;
        java.util.Map<java.lang.String, C35201nqp> linkedHashMap = mapAEQbTJ.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            mapAEQbTJ.put(str, linkedHashMap);
        }
        int i = 0;
        for (java.lang.Object obj : this.AEQbTJ) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.ArrayList<C35201nqp> arrayList = this.KWHzl;
            C35201nqp c35201nqpEZpvd = C35186nqa.AEQbTJ.EZpvd("TWO_INST_PREFS_KEY_STRING_" + this.OLrzqt, (java.lang.String) obj);
            if (c35201nqpEZpvd == null) {
                c35201nqpEZpvd = C35199nqn.AEQbTJ();
            }
            arrayList.add(c35201nqpEZpvd);
            i++;
        }
        C35186nqa.AEQbTJ.EZpvd("TWO_INST_PREFS_KEY_STRING_" + this.OLrzqt);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.KWHzl.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getViewAt(int i) {
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.EZpvd.getPackageName(), qZH.ActionBar.GGlJim);
        if (this.KWHzl.size() > i && CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i) != null && !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i), C35199nqn.AEQbTJ())) {
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
        }
        return remoteViews;
    }
}
