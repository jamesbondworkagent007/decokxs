package o;

import android.os.Build;
import com.okinc.find_ui.widgetprovider.util.DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1;
import com.okinc.find_ui.widgetprovider.util.DoubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1;
import com.okinc.unify_find.net.BizFindApiService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35131npY {
    /* JADX DEBUG: Class process forced to load method for inline: o.nqm.updateItemDataWidget$default(java.lang.String, com.okinc.unify_find.net.BizFindApiService, android.content.Context, o.nqf, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x019b -> B:42:0x01a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(android.content.Context context, int i, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, BizFindApiService bizFindApiService, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DoubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1 doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1;
        android.appwidget.AppWidgetManager appWidgetManager2;
        C35191nqf c35191nqf2;
        BizFindApiService bizFindApiService2;
        android.app.PendingIntent activity;
        java.util.Map<java.lang.String, C35201nqp> map;
        java.util.Iterator it;
        int i2;
        android.widget.RemoteViews remoteViews;
        android.content.Context context2 = context;
        int i3 = i;
        if (continuation instanceof DoubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1) {
            doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1 = (DoubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1) continuation;
            int i4 = doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.label = i4 - Integer.MIN_VALUE;
            } else {
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1 = new DoubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1(continuation);
            }
        }
        java.lang.Object obj = doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("updateDoubleWidgetIconImpl() called with: context = ");
            sb.append(context2);
            sb.append(", appWidgetId = ");
            sb.append(i3);
            sb.append(", appWidgetManager = ");
            appWidgetManager2 = appWidgetManager;
            sb.append(appWidgetManager2);
            sb.append(", onceCache = ");
            c35191nqf2 = c35191nqf;
            sb.append(c35191nqf2);
            sb.append(", api = ");
            bizFindApiService2 = bizFindApiService;
            sb.append(bizFindApiService2);
            pUU.EZpvd("CryptoWidgetProvider", sb.toString());
            java.util.List<java.lang.String> listCopydefault = C35192nqg.copydefault(context2, "TWO_INST_PREFS_KEY_STRING");
            java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(context2, "TWO_INST_PREFS_KEY_STRING_" + i3);
            if (!(!listEZpvd.isEmpty())) {
                listEZpvd = null;
            }
            if (listEZpvd != null) {
                listCopydefault = listEZpvd;
            }
            android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), qZH.ActionBar.OAhWiU);
            C35200nqo.KWHzl(remoteViews2, i3, context2, "TWO_INST_PREFS_KEY_STRING");
            remoteViews2.setTextViewText(qZH.StateListAnimator.DTwDnp, C33070mpX.AYXKKw(qZH.PendingIntent.ORrpqH));
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) C35125npS.class);
            intent.putExtra("doubleWidgetId", i3);
            remoteViews2.setRemoteAdapter(qZH.StateListAnimator.zsXlph, intent);
            intent.setData(android.net.Uri.fromParts("com.okinc.app.market.widget", java.lang.String.valueOf(i), null));
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            intent2.addFlags(335544320);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                activity = android.app.PendingIntent.getActivity(context2, 1, intent2, 184549376);
            } else {
                activity = android.app.PendingIntent.getActivity(context2, 1, intent2, i6 >= 31 ? 167772160 : 134217728);
            }
            remoteViews2.setPendingIntentTemplate(qZH.StateListAnimator.zsXlph, activity);
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, C35201nqp>> mapAEQbTJ = C35186nqa.AEQbTJ.AEQbTJ();
            java.lang.String str = "TWO_INST_PREFS_KEY_STRING_" + i3;
            java.util.Map<java.lang.String, C35201nqp> linkedHashMap = mapAEQbTJ.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                mapAEQbTJ.put(str, linkedHashMap);
            }
            map = linkedHashMap;
            it = listCopydefault.iterator();
            i2 = 0;
            remoteViews = remoteViews2;
            if (it.hasNext()) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.I$1;
            i3 = doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.I$0;
            java.lang.String str2 = (java.lang.String) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$7;
            java.util.Iterator it2 = (java.util.Iterator) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$6;
            java.util.Map<java.lang.String, C35201nqp> map2 = (java.util.Map) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$5;
            remoteViews = (android.widget.RemoteViews) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$4;
            BizFindApiService bizFindApiService3 = (BizFindApiService) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$3;
            C35191nqf c35191nqf3 = (C35191nqf) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$2;
            android.appwidget.AppWidgetManager appWidgetManager3 = (android.appwidget.AppWidgetManager) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$1;
            android.content.Context context3 = (android.content.Context) doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$0;
            C56391yDq.AEQbTJ(obj);
            i2 = i7;
            context2 = context3;
            java.util.Map<java.lang.String, C35201nqp> map3 = map2;
            bizFindApiService2 = bizFindApiService3;
            C35201nqp c35201nqp = (C35201nqp) obj;
            if (c35201nqp != null) {
                map3.put(str2, c35201nqp);
            }
            it = it2;
            c35191nqf2 = c35191nqf3;
            appWidgetManager2 = appWidgetManager3;
            map = map3;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                int i8 = i2 + 1;
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str3 = (java.lang.String) next;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$0 = context2;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$1 = appWidgetManager2;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$2 = c35191nqf2;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$3 = bizFindApiService2;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$4 = remoteViews;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$5 = map;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$6 = it;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.L$7 = str3;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.I$0 = i3;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.I$1 = i8;
                doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1.label = 1;
                java.lang.Object objUpdateItemDataWidget$default = C35198nqm.updateItemDataWidget$default(str3, bizFindApiService2, context2, c35191nqf2, false, doubleWidgetUpdateUtilsKt$updateDoubleWidgetIconImpl$1, 16, null);
                if (objUpdateItemDataWidget$default == objCopydefault) {
                    return objCopydefault;
                }
                C35191nqf c35191nqf4 = c35191nqf2;
                it2 = it;
                obj = objUpdateItemDataWidget$default;
                map3 = map;
                appWidgetManager3 = appWidgetManager2;
                str2 = str3;
                i2 = i8;
                c35191nqf3 = c35191nqf4;
                C35201nqp c35201nqp2 = (C35201nqp) obj;
                if (c35201nqp2 != null) {
                }
                it = it2;
                c35191nqf2 = c35191nqf3;
                appWidgetManager2 = appWidgetManager3;
                map = map3;
                if (it.hasNext()) {
                    appWidgetManager2.notifyAppWidgetViewDataChanged(i3, qZH.StateListAnimator.zsXlph);
                    appWidgetManager2.updateAppWidget(i3, remoteViews);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Job updateDoubleWidget$default(int[] iArr, android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            c35191nqf = new C35191nqf();
        }
        return OLrzqt(iArr, context, appWidgetManager, c35191nqf);
    }

    public static final Job OLrzqt(int[] iArr, @NotNull android.content.Context context, @NotNull android.appwidget.AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(c35191nqf, "");
        pUU.EZpvd("CryptoWidgetProvider", "updateDoubleWidget() called with: appWidgetIds = " + iArr + ", context = " + context + ", appWidgetManager = " + appWidgetManager + ", onceCache = " + c35191nqf);
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(completableJobJob$default)), null, null, new DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1(iArr, context, appWidgetManager, c35191nqf, completableJobJob$default, null), 3, null);
        return completableJobJob$default;
    }
}
