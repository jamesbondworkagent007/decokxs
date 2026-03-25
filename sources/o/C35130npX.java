package o;

import android.content.SharedPreferences;
import com.okinc.find_ui.widgetprovider.util.CoinUtilsKt$getTopCoins$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35130npX {
    public static final java.lang.String OLrzqt() {
        return C55633xnd.getStableText$default(null, 1, null);
    }

    public static final Triple<java.lang.String, java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() == 2) {
            return new Triple<>(listSplit$default.get(0), listSplit$default.get(1), str);
        }
        return new Triple<>(str, OLrzqt(), str);
    }

    public static final boolean OLrzqt(@NotNull Triple<java.lang.String, java.lang.String, java.lang.String> triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        return Intrinsics.EZpvd((java.lang.Object) triple.getFirst(), (java.lang.Object) triple.getThird());
    }

    public static final void EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putString("TOP_MAIN_COINS_STRING", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        editorEdit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull BizFindApiService bizFindApiService, @NotNull android.content.Context context, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CoinUtilsKt$getTopCoins$1 coinUtilsKt$getTopCoins$1;
        if (continuation instanceof CoinUtilsKt$getTopCoins$1) {
            coinUtilsKt$getTopCoins$1 = (CoinUtilsKt$getTopCoins$1) continuation;
            int i = coinUtilsKt$getTopCoins$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinUtilsKt$getTopCoins$1.label = i - Integer.MIN_VALUE;
            } else {
                coinUtilsKt$getTopCoins$1 = new CoinUtilsKt$getTopCoins$1(continuation);
            }
        }
        java.lang.Object widgetTopCoins = coinUtilsKt$getTopCoins$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinUtilsKt$getTopCoins$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(widgetTopCoins);
                Result.Application application = Result.Companion;
                java.lang.String strOLrzqt = kKA.EZpvd.OLrzqt(context) ? OLrzqt() : "";
                coinUtilsKt$getTopCoins$1.L$0 = context;
                coinUtilsKt$getTopCoins$1.label = 1;
                widgetTopCoins = bizFindApiService.getWidgetTopCoins(strOLrzqt, "1", coinUtilsKt$getTopCoins$1);
                if (widgetTopCoins == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (android.content.Context) coinUtilsKt$getTopCoins$1.L$0;
                C56391yDq.AEQbTJ(widgetTopCoins);
            }
            java.util.List list = (java.util.List) ((ResponseData) widgetTopCoins).getData();
            if (list != null) {
                EZpvd(context, list);
            } else {
                list = null;
            }
            Result.m7377constructorimpl(list);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
