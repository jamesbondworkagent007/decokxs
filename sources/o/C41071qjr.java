package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.TrendingCategoriesPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.RequestTrendingCategoriesUseCase$onExecute$1;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41071qjr extends AbstractC49400uno<Unit, InterfaceC49371unL<? extends java.util.List<? extends C41122qkp>>> {
    public final C41067qjn KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41071qjr(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41067qjn c41067qjn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41067qjn, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c41067qjn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3.isEmpty() == true) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super InterfaceC49371unL<? extends java.util.List<C41122qkp>>> continuation) throws java.lang.Throwable {
        RequestTrendingCategoriesUseCase$onExecute$1 requestTrendingCategoriesUseCase$onExecute$1;
        C41071qjr c41071qjr;
        java.lang.Object objM7377constructorimpl;
        java.util.List<TrendingCategoriesPo> listQfsBiF;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        if (continuation instanceof RequestTrendingCategoriesUseCase$onExecute$1) {
            requestTrendingCategoriesUseCase$onExecute$1 = (RequestTrendingCategoriesUseCase$onExecute$1) continuation;
            int i = requestTrendingCategoriesUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestTrendingCategoriesUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                requestTrendingCategoriesUseCase$onExecute$1 = new RequestTrendingCategoriesUseCase$onExecute$1(this, continuation);
            }
        }
        RequestTrendingCategoriesUseCase$onExecute$1 requestTrendingCategoriesUseCase$onExecute$12 = requestTrendingCategoriesUseCase$onExecute$1;
        java.lang.Object objKWHzl = requestTrendingCategoriesUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestTrendingCategoriesUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.String stableText$default = C55633xnd.getStableText$default(null, 1, null);
            try {
                Result.Application application = Result.Companion;
                C41067qjn c41067qjn = this.KWHzl;
                requestTrendingCategoriesUseCase$onExecute$12.L$0 = this;
                requestTrendingCategoriesUseCase$onExecute$12.label = 1;
                objKWHzl = c41067qjn.KWHzl(null, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : "all", (2 & 8) != 0 ? null : stableText$default, requestTrendingCategoriesUseCase$onExecute$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c41071qjr = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c41071qjr = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41071qjr = (C41071qjr) requestTrendingCategoriesUseCase$onExecute$12.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objKWHzl);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            Intrinsics.copydefault(thM7380exceptionOrNullimpl);
            return new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            if ((Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl) != null) {
                java.util.List list = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (list != null) {
                }
            }
            return new InterfaceC49371unL.TaskDescription(null, 1, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List list2 = (java.util.List) objM7377constructorimpl;
        if (list2 != null && (listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list2)) != null) {
            for (TrendingCategoriesPo trendingCategoriesPo : listQfsBiF) {
                java.lang.String categoryName = trendingCategoriesPo.getCategoryName();
                java.lang.String categoryName2 = (categoryName == null || categoryName.length() == 0) ? "--" : trendingCategoriesPo.getCategoryName();
                java.lang.String strOLrzqt = c41071qjr.OLrzqt(trendingCategoriesPo.getChangePercent());
                UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(trendingCategoriesPo.getChangePercent());
                java.lang.String changePercent = trendingCategoriesPo.getChangePercent();
                java.util.List<java.util.List<java.lang.String>> categoryChart = trendingCategoriesPo.getCategoryChart();
                if (categoryChart == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it = categoryChart.iterator();
                    while (it.hasNext()) {
                        java.util.List list3 = (java.util.List) it.next();
                        java.lang.String str = list3.size() >= 2 ? (java.lang.String) list3.get(1) : null;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    listAhwBna = arrayList2;
                }
                java.lang.String strAEQbTJ = c41071qjr.AEQbTJ(trendingCategoriesPo.getOtherIconSize());
                java.util.List<TrendingCategoriesPo.CoinList> coinList = trendingCategoriesPo.getCoinList();
                if (coinList == null) {
                    listAhwBna2 = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator<T> it2 = coinList.iterator();
                    while (it2.hasNext()) {
                        java.lang.String icon = ((TrendingCategoriesPo.CoinList) it2.next()).getIcon();
                        if (icon != null) {
                            arrayList3.add(icon);
                        }
                    }
                    listAhwBna2 = arrayList3;
                }
                java.lang.String changePercent2 = trendingCategoriesPo.getChangePercent();
                arrayList.add(new C41122qkp(categoryName2, strOLrzqt, changePercent, upDownColorAEQbTJ, listAhwBna2, strAEQbTJ, listAhwBna, (changePercent2 == null || changePercent2.length() == 0) ? null : C56443yFo.KWHzl(UpDownColor.Companion.AEQbTJ(trendingCategoriesPo.getChangePercent()) == UpDownColor.DOWN), trendingCategoriesPo.getCategoryId(), trendingCategoriesPo.getCategoryName()));
            }
        }
        return new InterfaceC49371unL.Activity(arrayList);
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        if (C33129mqd.OLrzqt(bigDecimalEZpvd, "0")) {
            return null;
        }
        return pTB.formatICUNumber$default(bigDecimalEZpvd, null, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.EXCEPT_ZERO, null, 9, null);
    }

    private final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 38, null);
    }
}
