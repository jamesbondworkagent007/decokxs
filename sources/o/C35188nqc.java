package o;

import android.os.Build;
import com.okinc.find_ui.widgetprovider.util.FiveWidgetUpdateUtilsKt$updateFiveWidget$1;
import com.okinc.find_ui.widgetprovider.util.FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1;
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

/* JADX INFO: renamed from: o.nqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35188nqc {
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0186 -> B:42:0x0193). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(android.content.Context context, int i, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, BizFindApiService bizFindApiService, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1 fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1;
        android.app.PendingIntent activity;
        java.util.Iterator it;
        int i2;
        android.widget.RemoteViews remoteViews;
        android.appwidget.AppWidgetManager appWidgetManager2;
        BizFindApiService bizFindApiService2;
        FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1 fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12;
        C35191nqf c35191nqf2;
        android.content.Context context2 = context;
        int i3 = i;
        if (continuation instanceof FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1) {
            fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1 = (FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1) continuation;
            int i4 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.label = i4 - Integer.MIN_VALUE;
            } else {
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1 = new FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1(continuation);
            }
        }
        java.lang.Object obj = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.label;
        int i6 = 1;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<java.lang.String> listCopydefault = C35192nqg.copydefault(context2, "FIVE_INST_PREFS_KEY_STRING");
            java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(context2, "FIVE_INST_PREFS_KEY_STRING_" + i3);
            if (!(!listEZpvd.isEmpty())) {
                listEZpvd = null;
            }
            if (listEZpvd != null) {
                listCopydefault = listEZpvd;
            }
            android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), qZH.ActionBar.aQtmcU);
            C35200nqo.KWHzl(remoteViews2, i3, context2, "FIVE_INST_PREFS_KEY_STRING");
            remoteViews2.setTextViewText(qZH.StateListAnimator.DTwDnp, C33070mpX.AYXKKw(qZH.PendingIntent.ORrpqH));
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) C35132npZ.class);
            pUU.KWHzl("CryptoWidgetProvider", "appWidgetId " + i3);
            intent.putExtra("widgetId", i3);
            intent.setData(android.net.Uri.fromParts("com.okinc.app.market.widget", java.lang.String.valueOf(i), null));
            remoteViews2.setRemoteAdapter(qZH.StateListAnimator.AuCTelauCTel, intent);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            intent2.addFlags(335544320);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                activity = android.app.PendingIntent.getActivity(context2, 2, intent2, 184549376);
            } else {
                activity = android.app.PendingIntent.getActivity(context2, 2, intent2, i7 >= 31 ? 167772160 : 134217728);
            }
            remoteViews2.setPendingIntentTemplate(qZH.StateListAnimator.AuCTelauCTel, activity);
            it = listCopydefault.iterator();
            i2 = 0;
            remoteViews = remoteViews2;
            appWidgetManager2 = appWidgetManager;
            bizFindApiService2 = bizFindApiService;
            fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1;
            c35191nqf2 = c35191nqf;
            if (it.hasNext()) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.I$1;
            i3 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.I$0;
            java.util.Map<java.lang.String, C35201nqp> map = (java.util.Map) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$7;
            java.lang.String str = (java.lang.String) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$6;
            java.util.Iterator it2 = (java.util.Iterator) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$5;
            android.widget.RemoteViews remoteViews3 = (android.widget.RemoteViews) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$4;
            BizFindApiService bizFindApiService3 = (BizFindApiService) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$3;
            C35191nqf c35191nqf3 = (C35191nqf) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$2;
            android.appwidget.AppWidgetManager appWidgetManager3 = (android.appwidget.AppWidgetManager) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$1;
            android.content.Context context3 = (android.content.Context) fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1.L$0;
            C56391yDq.AEQbTJ(obj);
            FiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1 fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$13 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$1;
            it = it2;
            c35191nqf2 = c35191nqf3;
            i2 = i8;
            context2 = context3;
            remoteViews = remoteViews3;
            C35201nqp c35201nqp = (C35201nqp) obj;
            if (c35201nqp != null) {
                map.put(str, c35201nqp);
            }
            fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$13;
            bizFindApiService2 = bizFindApiService3;
            appWidgetManager2 = appWidgetManager3;
            i6 = 1;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                int i9 = i2 + 1;
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str2 = (java.lang.String) next;
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, C35201nqp>> mapAEQbTJ = C35186nqa.AEQbTJ.AEQbTJ();
                java.lang.String str3 = "FIVE_INST_PREFS_KEY_STRING_" + i3;
                java.util.Map<java.lang.String, C35201nqp> linkedHashMap = mapAEQbTJ.get(str3);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    mapAEQbTJ.put(str3, linkedHashMap);
                }
                java.util.Map<java.lang.String, C35201nqp> map2 = linkedHashMap;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$0 = context2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$1 = appWidgetManager2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$2 = c35191nqf2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$3 = bizFindApiService2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$4 = remoteViews;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$5 = it;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$6 = str2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.L$7 = map2;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.I$0 = i3;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.I$1 = i9;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12.label = i6;
                android.widget.RemoteViews remoteViews4 = remoteViews;
                java.util.Iterator it3 = it;
                java.lang.Object objUpdateItemDataWidget$default = C35198nqm.updateItemDataWidget$default(str2, bizFindApiService2, context2, c35191nqf2, false, fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12, 16, null);
                if (objUpdateItemDataWidget$default == objCopydefault) {
                    return objCopydefault;
                }
                appWidgetManager3 = appWidgetManager2;
                bizFindApiService3 = bizFindApiService2;
                remoteViews = remoteViews4;
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$13 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12;
                obj = objUpdateItemDataWidget$default;
                map = map2;
                str = str2;
                i2 = i9;
                it = it3;
                C35201nqp c35201nqp2 = (C35201nqp) obj;
                if (c35201nqp2 != null) {
                }
                fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$12 = fiveWidgetUpdateUtilsKt$updateFiveWidgetIconImpl$13;
                bizFindApiService2 = bizFindApiService3;
                appWidgetManager2 = appWidgetManager3;
                i6 = 1;
                if (it.hasNext()) {
                    appWidgetManager2.notifyAppWidgetViewDataChanged(i3, qZH.StateListAnimator.AuCTelauCTel);
                    appWidgetManager2.updateAppWidget(i3, remoteViews);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Job updateFiveWidget$default(int[] iArr, android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            c35191nqf = new C35191nqf();
        }
        return OLrzqt(iArr, context, appWidgetManager, c35191nqf);
    }

    public static final Job OLrzqt(int[] iArr, @NotNull android.content.Context context, @NotNull android.appwidget.AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(c35191nqf, "");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(completableJobJob$default)), null, null, new FiveWidgetUpdateUtilsKt$updateFiveWidget$1(iArr, context, appWidgetManager, c35191nqf, completableJobJob$default, null), 3, null);
        return completableJobJob$default;
    }
}
