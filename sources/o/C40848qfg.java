package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.domain.MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.TrendingCategoriesPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.ColumnKey;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C41093qkM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qfg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40848qfg extends AbstractC49400uno<Unit, C41093qkM> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41067qjn KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C40848qfg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41067qjn c41067qjn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41067qjn, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c41067qjn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super C41093qkM> continuation) throws java.lang.Throwable {
        MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1 marketDiscoverTrendingCategorySummaryUseCase$onExecute$1;
        C40848qfg c40848qfg;
        C41093qkM c41093qkMEZpvd;
        if (continuation instanceof MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1) {
            marketDiscoverTrendingCategorySummaryUseCase$onExecute$1 = (MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1) continuation;
            int i = marketDiscoverTrendingCategorySummaryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverTrendingCategorySummaryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverTrendingCategorySummaryUseCase$onExecute$1 = new MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1(this, continuation);
            }
        }
        MarketDiscoverTrendingCategorySummaryUseCase$onExecute$1 marketDiscoverTrendingCategorySummaryUseCase$onExecute$12 = marketDiscoverTrendingCategorySummaryUseCase$onExecute$1;
        java.lang.Object objKWHzl = marketDiscoverTrendingCategorySummaryUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverTrendingCategorySummaryUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.String stableText$default = C55633xnd.getStableText$default(null, 1, null);
            C41067qjn c41067qjn = this.KWHzl;
            marketDiscoverTrendingCategorySummaryUseCase$onExecute$12.L$0 = this;
            marketDiscoverTrendingCategorySummaryUseCase$onExecute$12.label = 1;
            objKWHzl = c41067qjn.KWHzl(null, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : "top", (2 & 8) != 0 ? null : stableText$default, marketDiscoverTrendingCategorySummaryUseCase$onExecute$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c40848qfg = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40848qfg = (C40848qfg) marketDiscoverTrendingCategorySummaryUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List<TrendingCategoriesPo> list = (java.util.List) objKWHzl;
        return (list == null || (c41093qkMEZpvd = c40848qfg.EZpvd(list)) == null) ? new C41093qkM(0, null, 3, null) : c41093qkMEZpvd;
    }

    public final C41093qkM EZpvd(java.util.List<TrendingCategoriesPo> list) {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 2)) {
            return new C41093qkM(0, null, 3, null);
        }
        LinkedHashMap<java.lang.String, java.util.List<TrendingCategoriesPo>> linkedHashMap = new LinkedHashMap<>();
        int size = list.size();
        if (size == 3) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 2));
            linkedHashMap.put("COLUMN_3", list.subList(2, 3));
        } else if (size == 4) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 2));
            linkedHashMap.put("COLUMN_3", list.subList(2, 4));
        } else if (new android.util.Range(5, Integer.MAX_VALUE).contains(java.lang.Integer.valueOf(size))) {
            linkedHashMap.put("COLUMN_1", list.subList(0, 1));
            linkedHashMap.put("COLUMN_2", list.subList(1, 3));
            linkedHashMap.put("COLUMN_3", list.subList(3, 5));
        }
        LinkedHashMap<java.lang.String, java.util.List<C41093qkM.ActionBar>> linkedHashMap2 = new LinkedHashMap<>();
        int size2 = 0;
        for (ColumnKey columnKey : ColumnKey.values()) {
            copydefault(columnKey.name(), size2, linkedHashMap, linkedHashMap2);
            java.util.List<TrendingCategoriesPo> list2 = linkedHashMap.get(columnKey.name());
            size2 += list2 != null ? list2.size() : 0;
        }
        return new C41093qkM(list.size(), linkedHashMap2);
    }

    public final void copydefault(java.lang.String str, int i, LinkedHashMap<java.lang.String, java.util.List<TrendingCategoriesPo>> linkedHashMap, LinkedHashMap<java.lang.String, java.util.List<C41093qkM.ActionBar>> linkedHashMap2) {
        java.util.List listAhwBna;
        java.util.List<TrendingCategoriesPo> list = linkedHashMap.get(str);
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                TrendingCategoriesPo trendingCategoriesPo = (TrendingCategoriesPo) obj;
                java.lang.String categoryId = trendingCategoriesPo.getCategoryId();
                java.lang.String str2 = categoryId == null ? "" : categoryId;
                java.lang.String categoryName = trendingCategoriesPo.getCategoryName();
                java.lang.String str3 = categoryName == null ? "" : categoryName;
                java.lang.String changePercent = trendingCategoriesPo.getChangePercent();
                java.lang.String str4 = changePercent == null ? "" : changePercent;
                UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(trendingCategoriesPo.getChangePercent());
                java.lang.String strOLrzqt = OLrzqt(trendingCategoriesPo.getOtherIconSize());
                java.util.List<TrendingCategoriesPo.CoinList> coinList = trendingCategoriesPo.getCoinList();
                if (coinList == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it = coinList.iterator();
                    while (it.hasNext()) {
                        java.lang.String icon = ((TrendingCategoriesPo.CoinList) it.next()).getIcon();
                        if (icon != null) {
                            arrayList2.add(icon);
                        }
                    }
                    listAhwBna = arrayList2;
                }
                arrayList.add(new C41093qkM.ActionBar(i + i2, str2, str3, str4, upDownColorAEQbTJ, listAhwBna, strOLrzqt, KWHzl(str), EZpvd(str), EZpvd(str, i2), 0.0f, 0, false, false, 0, 30720, null));
                i2++;
            }
            linkedHashMap2.put(str, arrayList);
        }
    }

    public final float KWHzl(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_1") ? 8.0f : 0.0f;
    }

    public final float EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_1") ? 8.0f : 0.0f;
    }

    public final float EZpvd(java.lang.String str, int i) {
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COLUMN_3") && i == 0) ? 8.0f : 0.0f;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        if (C33129mqd.OLrzqt(bigDecimalEZpvd, "0")) {
            return null;
        }
        return pTB.formatICUNumber$default(bigDecimalEZpvd, null, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.EXCEPT_ZERO, null, 9, null);
    }
}
