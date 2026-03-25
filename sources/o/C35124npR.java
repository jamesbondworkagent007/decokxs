package o;

import android.icu.text.SimpleDateFormat;
import com.okinc.find_ui.widgetprovider.p2p.utils.P2PWidgetUpdateUtilsKt$updateP2PWidget$1;
import com.okinc.find_ui.widgetprovider.p2p.utils.P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1;
import com.okinc.unify_find.net.BizFindApiService;
import java.util.Date;
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

/* JADX INFO: renamed from: o.npR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35124npR {
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(6:12|64|13|46|58|59)(2:17|18))(4:19|68|20|21))(9:24|70|25|(5:27|28|66|29|(1:31)(1:32))(6:37|60|38|(1:40)(1:41)|42|(1:44)(4:45|46|58|59))|53|62|54|58|59)|33|34|60|38|(0)(0)|42|(0)(0)|(1:(1:63))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r4 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(android.content.Context context, int i, android.appwidget.AppWidgetManager appWidgetManager, BizFindApiService bizFindApiService, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1 p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1;
        android.appwidget.AppWidgetManager appWidgetManager2;
        android.widget.RemoteViews remoteViews;
        java.lang.String strKWHzl;
        android.widget.RemoteViews remoteViews2;
        java.lang.String str;
        android.appwidget.AppWidgetManager appWidgetManager3;
        BizFindApiService bizFindApiService2;
        ?? r0;
        java.lang.Object obj;
        android.widget.RemoteViews remoteViews3;
        int i2;
        android.content.Context context2;
        int i3;
        android.appwidget.AppWidgetManager appWidgetManager4;
        C35193nqh c35193nqh;
        boolean z2;
        android.widget.RemoteViews remoteViews4;
        android.content.Context context3 = context;
        int i4 = i;
        BizFindApiService bizFindApiService3 = bizFindApiService;
        if (continuation instanceof P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1) {
            p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1 = (P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1) continuation;
            int i5 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1.label = i5 - Integer.MIN_VALUE;
            } else {
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1 = new P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1(continuation);
            }
        }
        P2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1 p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$1;
        java.lang.Object obj2 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(obj2);
            try {
                remoteViews = new android.widget.RemoteViews(context.getPackageName(), qZH.ActionBar.fTEjYi);
                strKWHzl = C35127npU.KWHzl(context, i);
            } catch (java.lang.Exception e) {
                e = e;
                appWidgetManager2 = appWidgetManager;
                context2 = context3;
                i3 = i4;
                appWidgetManager4 = appWidgetManager2;
            }
            if (strKWHzl.length() == 0) {
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$0 = context3;
                appWidgetManager2 = appWidgetManager;
                try {
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$1 = appWidgetManager2;
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$2 = bizFindApiService3;
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$3 = remoteViews;
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$0 = i4;
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$1 = 1;
                    p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.label = 1;
                    java.lang.Object objEZpvd = C35127npU.EZpvd(bizFindApiService3, i4, context3, p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objEZpvd;
                    remoteViews3 = remoteViews;
                    i2 = 1;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    context2 = context3;
                    i3 = i4;
                    appWidgetManager4 = appWidgetManager2;
                }
            } else {
                remoteViews2 = remoteViews;
                str = strKWHzl;
                appWidgetManager3 = appWidgetManager;
                bizFindApiService2 = bizFindApiService3;
                r0 = z;
                C35200nqo.AEQbTJ(remoteViews2, i4, context3, "P2P_MARKET_PREFS_KEY_STRING");
                c35193nqh = new C35193nqh(qZH.StateListAnimator.BVXAa, qZH.StateListAnimator.ikIEnW, qZH.StateListAnimator.DuR, qZH.StateListAnimator.HJWChPdIKEqB, qZH.StateListAnimator.dNxZaP, C56443yFo.AEQbTJ(qZH.StateListAnimator.HJWChPURsaBn), C56443yFo.AEQbTJ(qZH.StateListAnimator.HJWChPUUMfbK));
                remoteViews2.setTextViewText(qZH.StateListAnimator.HJWChPdNQGVJ, C33070mpX.AYXKKw(qZH.PendingIntent.OuxcSI));
                remoteViews2.setTextViewText(qZH.StateListAnimator.isElapsedRealtimeNanosAvailable, KWHzl(java.lang.System.currentTimeMillis()));
                z2 = r0 == 0;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$0 = context3;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$1 = appWidgetManager3;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$2 = remoteViews2;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$3 = null;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$0 = i4;
                p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.label = 2;
                if (C35126npT.KWHzl(i4, str, bizFindApiService2, context3, remoteViews2, c35193nqh, z2, p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12) != objCopydefault) {
                    return objCopydefault;
                }
                context2 = context3;
                i3 = i4;
                appWidgetManager4 = appWidgetManager3;
                remoteViews4 = remoteViews2;
                appWidgetManager4.updateAppWidget(i3, remoteViews4);
                return Unit.INSTANCE;
            }
            pUU.AEQbTJ("CryptoWidgetProvider", "updateP2PWidgetImpl failed", e);
            android.widget.RemoteViews remoteViews5 = new android.widget.RemoteViews(context2.getPackageName(), qZH.ActionBar.fTEjYi);
            C35200nqo.AEQbTJ(remoteViews5, i3, context2, "P2P_MARKET_PREFS_KEY_STRING");
            remoteViews5.setViewVisibility(qZH.StateListAnimator.BVXAa, 8);
            remoteViews5.setViewVisibility(qZH.StateListAnimator.iqeXgQ, 0);
            appWidgetManager4.updateAppWidget(i3, remoteViews5);
            return Unit.INSTANCE;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$0;
            remoteViews4 = (android.widget.RemoteViews) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$2;
            appWidgetManager4 = (android.appwidget.AppWidgetManager) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$1;
            context2 = (android.content.Context) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                appWidgetManager4.updateAppWidget(i3, remoteViews4);
            } catch (java.lang.Exception e3) {
                e = e3;
                pUU.AEQbTJ("CryptoWidgetProvider", "updateP2PWidgetImpl failed", e);
                try {
                    android.widget.RemoteViews remoteViews52 = new android.widget.RemoteViews(context2.getPackageName(), qZH.ActionBar.fTEjYi);
                    C35200nqo.AEQbTJ(remoteViews52, i3, context2, "P2P_MARKET_PREFS_KEY_STRING");
                    remoteViews52.setViewVisibility(qZH.StateListAnimator.BVXAa, 8);
                    remoteViews52.setViewVisibility(qZH.StateListAnimator.iqeXgQ, 0);
                    appWidgetManager4.updateAppWidget(i3, remoteViews52);
                } catch (java.lang.Exception e4) {
                    pUU.AEQbTJ("CryptoWidgetProvider", "Failed to show empty state", e4);
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$1;
        i3 = p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$0;
        android.widget.RemoteViews remoteViews6 = (android.widget.RemoteViews) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$3;
        BizFindApiService bizFindApiService4 = (BizFindApiService) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$2;
        appWidgetManager2 = (android.appwidget.AppWidgetManager) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$1;
        android.content.Context context4 = (android.content.Context) p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$0;
        try {
            C56391yDq.AEQbTJ(obj2);
            i2 = i7;
            bizFindApiService3 = bizFindApiService4;
            remoteViews3 = remoteViews6;
            i4 = i3;
            context3 = context4;
            obj = obj2;
        } catch (java.lang.Exception e5) {
            e = e5;
            appWidgetManager4 = appWidgetManager2;
            context2 = context4;
        }
        str = (java.lang.String) obj;
        remoteViews2 = remoteViews3;
        android.appwidget.AppWidgetManager appWidgetManager5 = appWidgetManager2;
        bizFindApiService2 = bizFindApiService3;
        r0 = i2;
        appWidgetManager3 = appWidgetManager5;
        C35200nqo.AEQbTJ(remoteViews2, i4, context3, "P2P_MARKET_PREFS_KEY_STRING");
        c35193nqh = new C35193nqh(qZH.StateListAnimator.BVXAa, qZH.StateListAnimator.ikIEnW, qZH.StateListAnimator.DuR, qZH.StateListAnimator.HJWChPdIKEqB, qZH.StateListAnimator.dNxZaP, C56443yFo.AEQbTJ(qZH.StateListAnimator.HJWChPURsaBn), C56443yFo.AEQbTJ(qZH.StateListAnimator.HJWChPUUMfbK));
        remoteViews2.setTextViewText(qZH.StateListAnimator.HJWChPdNQGVJ, C33070mpX.AYXKKw(qZH.PendingIntent.OuxcSI));
        remoteViews2.setTextViewText(qZH.StateListAnimator.isElapsedRealtimeNanosAvailable, KWHzl(java.lang.System.currentTimeMillis()));
        if (r0 == 0) {
        }
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$0 = context3;
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$1 = appWidgetManager3;
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$2 = remoteViews2;
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.L$3 = null;
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.I$0 = i4;
        p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12.label = 2;
        if (C35126npT.KWHzl(i4, str, bizFindApiService2, context3, remoteViews2, c35193nqh, z2, p2PWidgetUpdateUtilsKt$updateP2PWidgetImpl$12) != objCopydefault) {
        }
    }

    public static final Job EZpvd(int[] iArr, @NotNull android.content.Context context, @NotNull android.appwidget.AppWidgetManager appWidgetManager, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(completableJobJob$default)), null, null, new P2PWidgetUpdateUtilsKt$updateP2PWidget$1(iArr, context, appWidgetManager, z, completableJobJob$default, null), 3, null);
        return completableJobJob$default;
    }

    public static final java.lang.String KWHzl(long j) {
        java.lang.String str = new SimpleDateFormat("MM/dd HH:mm", java.util.Locale.getDefault()).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
