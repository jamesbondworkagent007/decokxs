package o;

import android.content.SharedPreferences;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsPriceInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import com.okinc.find_ui.widgetprovider.p2p.utils.P2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1;
import com.okinc.find_ui.widgetprovider.p2p.utils.P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35127npU {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Triple<java.lang.String, java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.util.List listSplit$default;
        Triple triple;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (listSplit$default.size() == 2) {
            java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
            java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
            java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default2.size() == 2) {
                triple = new Triple((java.lang.String) listSplit$default2.get(0), (java.lang.String) listSplit$default2.get(1), str3);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(triple);
            return (Triple) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        triple = null;
        objM7377constructorimpl = Result.m7377constructorimpl(triple);
        return (Triple) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull BizFindApiService bizFindApiService, int i, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        P2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1 p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1;
        java.lang.String str;
        if (continuation instanceof P2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1) {
            p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1 = (P2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1) continuation;
            int i2 = p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.label = i2 - Integer.MIN_VALUE;
            } else {
                p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1 = new P2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1(continuation);
            }
        }
        java.lang.Object obj = p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.L$0 = context;
            p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.L$1 = "USDT";
            p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.I$0 = i;
            p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.label = 1;
            java.lang.Object p2PWidgetDefaultFiat = bizFindApiService.getP2PWidgetDefaultFiat(p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1);
            if (p2PWidgetDefaultFiat == objCopydefault) {
                return objCopydefault;
            }
            obj = p2PWidgetDefaultFiat;
            str = "USDT";
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.I$0;
            str = (java.lang.String) p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.L$1;
            context = (android.content.Context) p2PCurrencyUtilsKt$fetchDefaultP2PCurrencyPair$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.String str2 = (java.lang.String) ((ResponseData) obj).getData();
        if (str2 == null) {
            str2 = "USD";
        }
        java.lang.String str3 = str + "-" + str2 + "," + P2PTradeSide.BUY.getValue();
        OLrzqt(context, i, str3);
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull BizFindApiService bizFindApiService, int i, @NotNull android.content.Context context, @NotNull Continuation<? super P2PPairsPriceInfo> continuation) throws java.lang.Throwable {
        P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1 p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1;
        java.lang.Object objM7377constructorimpl;
        P2PPairsPriceInfo p2PPairsPriceInfoCopy$default;
        P2PPairsPriceInfo p2PPairsPriceInfo;
        java.lang.String str;
        if (continuation instanceof P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1) {
            p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1 = (P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1) continuation;
            int i2 = p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1.label = i2 - Integer.MIN_VALUE;
            } else {
                p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1 = new P2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1(continuation);
            }
        }
        java.lang.Object p2PWidgetCurrencyPairsPrice = p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(p2PWidgetCurrencyPairsPrice);
            Result.Application application2 = Result.Companion;
            Triple<java.lang.String, java.lang.String, java.lang.String> tripleKWHzl = KWHzl(KWHzl(context, i));
            if (tripleKWHzl == null) {
                p2PPairsPriceInfoCopy$default = null;
                objM7377constructorimpl = Result.m7377constructorimpl(p2PPairsPriceInfoCopy$default);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    return objM7377constructorimpl;
                }
                return null;
            }
            java.lang.String first = tripleKWHzl.getFirst();
            java.lang.String second = tripleKWHzl.getSecond();
            java.lang.String third = tripleKWHzl.getThird();
            p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1.label = 1;
            p2PWidgetCurrencyPairsPrice = bizFindApiService.getP2PWidgetCurrencyPairsPrice(third, second, first, p2PCurrencyUtilsKt$getP2PCurrencyPairPrice$1);
            if (p2PWidgetCurrencyPairsPrice == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(p2PWidgetCurrencyPairsPrice);
        }
        java.util.List list = (java.util.List) ((ResponseData) p2PWidgetCurrencyPairsPrice).getData();
        if (list == null || (p2PPairsPriceInfo = (P2PPairsPriceInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null) {
            p2PPairsPriceInfoCopy$default = null;
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) p2PPairsPriceInfo.getPrice(), (java.lang.Object) "0")) {
                str = "";
            } else {
                str = p2PPairsPriceInfo.getFiatGraphicSymbol() + pTB.formatLocalized$default(p2PPairsPriceInfo.getPrice(), null, 1, null);
            }
            p2PPairsPriceInfoCopy$default = P2PPairsPriceInfo.copy$default(p2PPairsPriceInfo, str, null, null, null, null, null, 62, null);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(p2PPairsPriceInfoCopy$default);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    public static final java.lang.String EZpvd(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Triple<java.lang.String, java.lang.String, java.lang.String> tripleKWHzl = KWHzl(KWHzl(context, i));
        return (tripleKWHzl != null ? tripleKWHzl.getFirst() : null) + "-" + (tripleKWHzl != null ? tripleKWHzl.getSecond() : null);
    }

    public static final java.lang.String copydefault(@NotNull android.content.Context context, int i) {
        java.lang.String third;
        Intrinsics.checkNotNullParameter(context, "");
        Triple<java.lang.String, java.lang.String, java.lang.String> tripleKWHzl = KWHzl(KWHzl(context, i));
        return (tripleKWHzl == null || (third = tripleKWHzl.getThird()) == null) ? "" : third;
    }

    public static final void OLrzqt(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putString("P2P_MARKET_PREFS_KEY_STRING_" + i, str);
        editorEdit.apply();
    }

    public static final java.lang.String KWHzl(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0).getString("P2P_MARKET_PREFS_KEY_STRING_" + i, "");
        return string == null ? "" : string;
    }
}
