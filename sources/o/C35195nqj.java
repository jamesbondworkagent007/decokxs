package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.find_ui.widgetprovider.util.TripleWidgetUpdateUtilsKt$updateTripleWidget$1;
import com.okinc.find_ui.widgetprovider.util.TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* JADX INFO: renamed from: o.nqj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35195nqj {
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0172 -> B:46:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x018b -> B:48:0x0194). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(android.content.Context context, int i, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, BizFindApiService bizFindApiService, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1 tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1;
        java.util.List<java.lang.String> list;
        android.widget.RemoteViews remoteViews;
        int i2;
        BizFindApiService bizFindApiService2;
        java.util.Iterator it;
        TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1 tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12;
        android.appwidget.AppWidgetManager appWidgetManager2;
        C35191nqf c35191nqf2;
        C35194nqi c35194nqi;
        android.content.Context context2 = context;
        int i3 = i;
        if (continuation instanceof TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1) {
            tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1 = (TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1) continuation;
            int i4 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.label = i4 - Integer.MIN_VALUE;
            } else {
                tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1 = new TripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1(continuation);
            }
        }
        java.lang.Object obj = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.label;
        int i6 = 1;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<java.lang.String> listCopydefault = C35192nqg.copydefault(context2, "TRIPLE_COIN_PREFS_KEY_STRING");
            java.util.List<java.lang.String> listEZpvd = C35192nqg.EZpvd(context2, "TRIPLE_COIN_PREFS_KEY_STRING_" + i3);
            if (!(!listEZpvd.isEmpty())) {
                listEZpvd = null;
            }
            if (listEZpvd != null) {
                listCopydefault = listEZpvd;
            }
            android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), qZH.ActionBar.GPCHlQ);
            C35200nqo.KWHzl(remoteViews2, i3, context2, "TRIPLE_COIN_PREFS_KEY_STRING");
            remoteViews2.setTextViewText(qZH.StateListAnimator.DTwDnp, C33070mpX.AYXKKw(qZH.PendingIntent.ORrpqH));
            java.util.Iterator it2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listCopydefault, 3).iterator();
            list = listCopydefault;
            remoteViews = remoteViews2;
            i2 = 0;
            bizFindApiService2 = bizFindApiService;
            it = it2;
            tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1;
            appWidgetManager2 = appWidgetManager;
            c35191nqf2 = c35191nqf;
            if (!it.hasNext()) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.I$1;
            i3 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.I$0;
            java.util.Iterator it3 = (java.util.Iterator) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$6;
            android.widget.RemoteViews remoteViews3 = (android.widget.RemoteViews) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$5;
            java.util.List<java.lang.String> list2 = (java.util.List) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$4;
            BizFindApiService bizFindApiService3 = (BizFindApiService) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$3;
            C35191nqf c35191nqf3 = (C35191nqf) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$2;
            android.appwidget.AppWidgetManager appWidgetManager3 = (android.appwidget.AppWidgetManager) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$1;
            android.content.Context context3 = (android.content.Context) tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1.L$0;
            C56391yDq.AEQbTJ(obj);
            char c = 3;
            int i8 = 1;
            remoteViews = remoteViews3;
            appWidgetManager2 = appWidgetManager3;
            tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1;
            c35191nqf2 = c35191nqf3;
            BizFindApiService bizFindApiService4 = bizFindApiService3;
            i2 = i7;
            context2 = context3;
            list = list2;
            it = it3;
            bizFindApiService2 = bizFindApiService4;
            i6 = i8;
            if (!it.hasNext()) {
                java.lang.Object next = it.next();
                int i9 = i2 + 1;
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) next;
                if (i2 == 0) {
                    c35194nqi = new C35194nqi(qZH.StateListAnimator.uzCIH, qZH.StateListAnimator.ejfBZ, qZH.StateListAnimator.AwvSrB, qZH.StateListAnimator.wlaJM, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                } else if (i2 == i6) {
                    c35194nqi = new C35194nqi(qZH.StateListAnimator.iwGUEr, qZH.StateListAnimator.fIwbmz, qZH.StateListAnimator.zuBGHE, qZH.StateListAnimator.AxsJAY, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                } else {
                    c35194nqi = i2 != 2 ? null : new C35194nqi(qZH.StateListAnimator.getNewProxyInstance, qZH.StateListAnimator.fARcdN, qZH.StateListAnimator.sSMYrx, qZH.StateListAnimator.AubY, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                }
                if (list.size() < 2) {
                    remoteViews.setViewVisibility(qZH.StateListAnimator.iwGUEr, 4);
                }
                c = 3;
                if (list.size() < 3) {
                    remoteViews.setViewVisibility(qZH.StateListAnimator.getNewProxyInstance, 4);
                }
                if (c35194nqi != null) {
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$0 = context2;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$1 = appWidgetManager2;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$2 = c35191nqf2;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$3 = bizFindApiService2;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$4 = list;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$5 = remoteViews;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$6 = it;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.L$7 = c35194nqi;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.I$0 = i3;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.I$1 = i9;
                    i8 = 1;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12.label = 1;
                    java.util.List<java.lang.String> list3 = list;
                    android.widget.RemoteViews remoteViews4 = remoteViews;
                    if (C35198nqm.OLrzqt(i3, str, bizFindApiService2, context2, c35191nqf2, remoteViews4, c35194nqi, (128 & 128) != 0 ? false : false, tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    context3 = context2;
                    appWidgetManager3 = appWidgetManager2;
                    c35191nqf3 = c35191nqf2;
                    bizFindApiService3 = bizFindApiService2;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12;
                    it3 = it;
                    i7 = i9;
                    list2 = list3;
                    remoteViews3 = remoteViews4;
                    remoteViews = remoteViews3;
                    appWidgetManager2 = appWidgetManager3;
                    tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$12 = tripleWidgetUpdateUtilsKt$updateTripleWidgetIconImpl$1;
                    c35191nqf2 = c35191nqf3;
                    BizFindApiService bizFindApiService42 = bizFindApiService3;
                    i2 = i7;
                    context2 = context3;
                    list = list2;
                    it = it3;
                    bizFindApiService2 = bizFindApiService42;
                    i6 = i8;
                    if (!it.hasNext()) {
                        appWidgetManager2.updateAppWidget(i3, remoteViews);
                        return Unit.INSTANCE;
                    }
                } else {
                    i8 = 1;
                    i2 = i9;
                    i6 = i8;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }

    public static /* synthetic */ Job updateTripleWidget$default(int[] iArr, android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, int i, java.lang.Object obj) {
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
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(completableJobJob$default)), null, null, new TripleWidgetUpdateUtilsKt$updateTripleWidget$1(iArr, context, appWidgetManager, c35191nqf, completableJobJob$default, null), 3, null);
        return completableJobJob$default;
    }
}
