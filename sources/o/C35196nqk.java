package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.find_ui.widgetprovider.util.SingleWidgetUpdateUtilsKt$updateSingleWidget$1;
import com.okinc.find_ui.widgetprovider.util.SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1;
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

/* JADX INFO: renamed from: o.nqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35196nqk {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(android.content.Context context, int i, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, BizFindApiService bizFindApiService, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1 singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1;
        java.lang.String str;
        android.appwidget.AppWidgetManager appWidgetManager2;
        int i2;
        android.widget.RemoteViews remoteViews;
        if (continuation instanceof SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1) {
            singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1 = (SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1) continuation;
            int i3 = singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1.label = i3 - Integer.MIN_VALUE;
            } else {
                singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1 = new SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1(continuation);
            }
        }
        SingleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1 singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12 = singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$1;
        java.lang.Object obj = singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<java.lang.String> listCopydefault = C35192nqg.copydefault(context, "SINGLE_COIN_PREFS_KEY_STRING");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
            java.lang.String str2 = "SINGLE_COIN_PREFS_KEY_STRING_" + i;
            java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String string = sharedPreferences.getString(str2, str3);
            if (string == null) {
                str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
                if (str == null) {
                    str = "";
                }
            } else {
                str = string;
            }
            android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), qZH.ActionBar.Dfv);
            C35200nqo.KWHzl(remoteViews2, i, context, "SINGLE_COIN_PREFS_KEY_STRING");
            C35194nqi c35194nqi = new C35194nqi(qZH.StateListAnimator.hDKMBd, qZH.StateListAnimator.fJNWhG, qZH.StateListAnimator.gHZMYf, qZH.StateListAnimator.AuCTel, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            remoteViews2.setTextViewText(qZH.StateListAnimator.DTwDnp, C33070mpX.AYXKKw(qZH.PendingIntent.fGT));
            appWidgetManager2 = appWidgetManager;
            singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.L$0 = appWidgetManager2;
            singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.L$1 = remoteViews2;
            singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.I$0 = i;
            singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.label = 1;
            if (C35198nqm.OLrzqt(i, str, bizFindApiService, context, c35191nqf, remoteViews2, c35194nqi, true, singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12) == objCopydefault) {
                return objCopydefault;
            }
            i2 = i;
            remoteViews = remoteViews2;
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.I$0;
            remoteViews = (android.widget.RemoteViews) singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.L$1;
            android.appwidget.AppWidgetManager appWidgetManager3 = (android.appwidget.AppWidgetManager) singleWidgetUpdateUtilsKt$updateSingleWidgetIconImpl$12.L$0;
            C56391yDq.AEQbTJ(obj);
            appWidgetManager2 = appWidgetManager3;
        }
        appWidgetManager2.updateAppWidget(i2, remoteViews);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Job updateSingleWidget$default(int[] iArr, android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, C35191nqf c35191nqf, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            c35191nqf = new C35191nqf();
        }
        return EZpvd(iArr, context, appWidgetManager, c35191nqf);
    }

    public static final Job EZpvd(int[] iArr, @NotNull android.content.Context context, @NotNull android.appwidget.AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(c35191nqf, "");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(completableJobJob$default)), null, null, new SingleWidgetUpdateUtilsKt$updateSingleWidget$1(iArr, context, appWidgetManager, c35191nqf, completableJobJob$default, null), 3, null);
        return completableJobJob$default;
    }
}
