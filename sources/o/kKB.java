package o;

import QfgSZK.AEQbTJ;
import androidx.camera.video.AudioStats;
import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kKB {
    public static final kKB KWHzl = new kKB();

    private kKB() {
    }

    public static final MarketDataSource EZpvd(java.lang.Object obj) {
        Intrinsics.copydefault(obj, "");
        return (MarketDataSource) obj;
    }

    public static /* synthetic */ java.util.List filterBySearchKeyword$default(kKB kkb, java.lang.String str, java.util.List list, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.kKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return kKB.EZpvd(obj2);
                }
            };
        }
        return kkb.OLrzqt(str, list, z, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.util.List<T> OLrzqt(java.lang.String str, @NotNull java.util.List<? extends T> list, boolean z, @NotNull Function1<? super T, ? extends MarketDataSource> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || list.isEmpty()) {
            return list;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AEQbTJ aEQbTJ = (java.lang.Object) it.next();
            MarketDataSource marketDataSourceInvoke = function1.invoke(aEQbTJ);
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) "DAI", (java.lang.CharSequence) str, true) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) marketDataSourceInvoke.getBizInstId(), (java.lang.CharSequence) str, true)) {
                arrayList3.add(aEQbTJ);
            } else if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) marketDataSourceInvoke.getBizInstId(), (java.lang.CharSequence) str, true)) {
                arrayList3.add(aEQbTJ);
            } else {
                java.lang.String baseSymbol = marketDataSourceInvoke.getBaseSymbol();
                if (baseSymbol != null) {
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    java.lang.String lowerCase = baseSymbol.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.String str2 = lowerCase == null ? "" : lowerCase;
                    java.lang.String mSymbolName = marketDataSourceInvoke.getMSymbolName();
                    if (mSymbolName != null) {
                        java.util.Locale locale3 = java.util.Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale3, "");
                        java.lang.String lowerCase2 = mSymbolName.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        java.lang.String str3 = lowerCase2 == null ? "" : lowerCase2;
                        if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(marketDataSourceInvoke.getIndex(), "-", "", false, 4, (java.lang.Object) null), (java.lang.Object) upperCase)) {
                            arrayList3.add(aEQbTJ);
                        } else if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(marketDataSourceInvoke.getIndex(), "-", "/", false, 4, (java.lang.Object) null), (java.lang.Object) upperCase)) {
                            arrayList3.add(aEQbTJ);
                        } else {
                            java.util.Locale locale4 = java.util.Locale.ROOT;
                            Intrinsics.checkNotNullExpressionValue(locale4, "");
                            java.lang.String lowerCase3 = upperCase.toLowerCase(locale4);
                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                            if (!C59449zhJ.startsWith$default(str2, lowerCase3, false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(locale4, "");
                                java.lang.String lowerCase4 = upperCase.toLowerCase(locale4);
                                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                                if (!C59449zhJ.startsWith$default(str3, lowerCase4, false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(locale4, "");
                                    java.lang.String lowerCase5 = upperCase.toLowerCase(locale4);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                                    if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) lowerCase5, false, 2, (java.lang.Object) null)) {
                                        Intrinsics.checkNotNullExpressionValue(locale4, "");
                                        java.lang.String lowerCase6 = upperCase.toLowerCase(locale4);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "");
                                        if (!C59449zhJ.startsWith$default(str3, lowerCase6, false, 2, null)) {
                                            try {
                                                Result.Application application = Result.Companion;
                                                if (Intrinsics.EZpvd((java.lang.Object) marketDataSourceInvoke.getInstType(), (java.lang.Object) "OPTION") || C54704xSf.calFuzzyRatio$default(C54704xSf.OLrzqt, upperCase, str2, str3, AudioStats.AUDIO_AMPLITUDE_NONE, 8, null) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                                                    Result.m7377constructorimpl(Unit.INSTANCE);
                                                } else {
                                                    arrayList3.add(aEQbTJ);
                                                }
                                            } catch (java.lang.Throwable th) {
                                                Result.Application application2 = Result.Companion;
                                                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                            }
                                        }
                                    }
                                    arrayList2.add(aEQbTJ);
                                }
                            }
                            arrayList.add(aEQbTJ);
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList4.addAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            arrayList4.addAll(arrayList3);
        }
        if (!z) {
            return arrayList4;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (T t : arrayList4) {
            if (!Intrinsics.EZpvd((java.lang.Object) function1.invoke(t).getInstType(), (java.lang.Object) "COIN")) {
                arrayList5.add(t);
            }
        }
        return arrayList5;
    }
}
