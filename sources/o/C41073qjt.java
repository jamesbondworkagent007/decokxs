package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.MarketDiscoverOverviewTrendingCategoriesDetailPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.domain.usecase.MarketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1;
import com.okinc.market.ext.UpDownColor;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41073qjt extends AbstractC49400uno<java.lang.String, C41119qkm> {
    public final C34941nlu AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C41069qjp KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41073qjt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41069qjp c41069qjp, @NotNull C34941nlu c34941nlu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41069qjp, "");
        Intrinsics.checkNotNullParameter(c34941nlu, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c41069qjp;
        this.AEQbTJ = c34941nlu;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41073qjt.KWHzl();
            }
        });
    }

    private final C54536xML OLrzqt() {
        return (C54536xML) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C54536xML KWHzl() {
        return new C54536xML();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super C41119qkm> continuation) throws java.lang.Throwable {
        MarketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1 marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1;
        C41073qjt c41073qjt;
        java.lang.Object objM7377constructorimpl;
        MarketDiscoverOverviewTrendingCategoriesDetailPo marketDiscoverOverviewTrendingCategoriesDetailPo;
        java.lang.Object objEZpvd;
        MarketDiscoverOverviewTrendingCategoriesDetailPo marketDiscoverOverviewTrendingCategoriesDetailPo2;
        java.lang.String str2;
        java.lang.String str3;
        C41073qjt c41073qjt2;
        java.util.List<java.util.List<java.lang.String>> chart;
        java.util.List listAhwBna;
        java.lang.Boolean boolKWHzl;
        java.util.List<java.util.List<java.lang.String>> chart2;
        java.util.List listAhwBna2;
        if (continuation instanceof MarketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1) {
            marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1 = (MarketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1) continuation;
            int i = marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1 = new MarketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label;
        java.lang.Boolean boolKWHzl2 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                Result.Application application = Result.Companion;
                C41069qjp c41069qjp = this.KWHzl;
                marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0 = this;
                marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label = 1;
                objKWHzl = c41069qjp.KWHzl(str, marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c41073qjt = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c41073qjt = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    MarketDiscoverOverviewTrendingCategoriesDetailPo marketDiscoverOverviewTrendingCategoriesDetailPo3 = (MarketDiscoverOverviewTrendingCategoriesDetailPo) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$1;
                    C41073qjt c41073qjt3 = (C41073qjt) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    marketDiscoverOverviewTrendingCategoriesDetailPo = marketDiscoverOverviewTrendingCategoriesDetailPo3;
                    c41073qjt = c41073qjt3;
                    java.lang.String str4 = (java.lang.String) objKWHzl;
                    java.lang.String strAEQbTJ = c41073qjt.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo.getMarketCap().getChangePercent());
                    C34941nlu c34941nlu = c41073qjt.AEQbTJ;
                    java.lang.String volume = marketDiscoverOverviewTrendingCategoriesDetailPo.getVolume24h().getVolume();
                    marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0 = c41073qjt;
                    marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$1 = marketDiscoverOverviewTrendingCategoriesDetailPo;
                    marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$2 = str4;
                    marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$3 = strAEQbTJ;
                    marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label = 3;
                    objEZpvd = c34941nlu.EZpvd(volume, marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    marketDiscoverOverviewTrendingCategoriesDetailPo2 = marketDiscoverOverviewTrendingCategoriesDetailPo;
                    str2 = strAEQbTJ;
                    str3 = str4;
                    objKWHzl = objEZpvd;
                    c41073qjt2 = c41073qjt;
                    java.lang.String str5 = (java.lang.String) objKWHzl;
                    java.lang.String strAEQbTJ2 = c41073qjt2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent());
                    java.lang.String changePercent = marketDiscoverOverviewTrendingCategoriesDetailPo2.getChangePercent();
                    java.lang.String strCopydefault = c41073qjt2.copydefault(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getVolume());
                    java.lang.String strAEQbTJ3 = c41073qjt2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getChangePercent());
                    UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChangePercent());
                    chart = marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChart();
                    if (chart != null) {
                    }
                    if (marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChangePercent().length() != 0) {
                    }
                    UpDownColor upDownColorAEQbTJ2 = UpDownColor.Companion.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent());
                    chart2 = marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChart();
                    if (chart2 != null) {
                    }
                    UpDownColor.StateListAnimator stateListAnimator = UpDownColor.Companion;
                    UpDownColor upDownColorAEQbTJ3 = stateListAnimator.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getChangePercent());
                    UpDownColor upDownColorAEQbTJ4 = stateListAnimator.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getChangePercent());
                    if (marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent().length() != 0) {
                    }
                    return new C41119qkm(str3, str2, upDownColorAEQbTJ, listAhwBna, boolKWHzl, str5, strAEQbTJ2, upDownColorAEQbTJ2, listAhwBna2, boolKWHzl2, changePercent, upDownColorAEQbTJ3, strCopydefault, strAEQbTJ3, upDownColorAEQbTJ4, marketDiscoverOverviewTrendingCategoriesDetailPo2.getCategoryDesc());
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str6 = (java.lang.String) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$3;
                java.lang.String str7 = (java.lang.String) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$2;
                marketDiscoverOverviewTrendingCategoriesDetailPo2 = (MarketDiscoverOverviewTrendingCategoriesDetailPo) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$1;
                c41073qjt2 = (C41073qjt) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                str2 = str6;
                str3 = str7;
                java.lang.String str52 = (java.lang.String) objKWHzl;
                java.lang.String strAEQbTJ22 = c41073qjt2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent());
                java.lang.String changePercent2 = marketDiscoverOverviewTrendingCategoriesDetailPo2.getChangePercent();
                java.lang.String strCopydefault2 = c41073qjt2.copydefault(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getVolume());
                java.lang.String strAEQbTJ32 = c41073qjt2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getChangePercent());
                UpDownColor upDownColorAEQbTJ5 = UpDownColor.Companion.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChangePercent());
                chart = marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChart();
                if (chart != null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = chart.iterator();
                    while (it.hasNext()) {
                        java.util.List list = (java.util.List) it.next();
                        java.lang.String str8 = list.size() >= 2 ? (java.lang.String) list.get(1) : null;
                        if (str8 != null) {
                            arrayList.add(str8);
                        }
                    }
                    listAhwBna = arrayList;
                }
                if (marketDiscoverOverviewTrendingCategoriesDetailPo2.getMarketCap().getChangePercent().length() != 0) {
                    boolKWHzl = null;
                } else {
                    boolKWHzl = C56443yFo.KWHzl(UpDownColor.Companion.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getChangePercent()) == UpDownColor.DOWN);
                }
                UpDownColor upDownColorAEQbTJ22 = UpDownColor.Companion.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent());
                chart2 = marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChart();
                if (chart2 != null) {
                    listAhwBna2 = yDY.AhwBna();
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it2 = chart2.iterator();
                    while (it2.hasNext()) {
                        java.util.List list2 = (java.util.List) it2.next();
                        java.lang.String str9 = list2.size() >= 2 ? (java.lang.String) list2.get(1) : null;
                        if (str9 != null) {
                            arrayList2.add(str9);
                        }
                    }
                    listAhwBna2 = arrayList2;
                }
                UpDownColor.StateListAnimator stateListAnimator2 = UpDownColor.Companion;
                UpDownColor upDownColorAEQbTJ32 = stateListAnimator2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getChangePercent());
                UpDownColor upDownColorAEQbTJ42 = stateListAnimator2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getTotalMentions().getChangePercent());
                if (marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent().length() != 0) {
                    boolKWHzl2 = C56443yFo.KWHzl(stateListAnimator2.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo2.getVolume24h().getChangePercent()) == UpDownColor.DOWN);
                }
                return new C41119qkm(str3, str2, upDownColorAEQbTJ5, listAhwBna, boolKWHzl, str52, strAEQbTJ22, upDownColorAEQbTJ22, listAhwBna2, boolKWHzl2, changePercent2, upDownColorAEQbTJ32, strCopydefault2, strAEQbTJ32, upDownColorAEQbTJ42, marketDiscoverOverviewTrendingCategoriesDetailPo2.getCategoryDesc());
            }
            c41073qjt = (C41073qjt) marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((MarketDiscoverOverviewTrendingCategoriesDetailPo) objKWHzl);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        MarketDiscoverOverviewTrendingCategoriesDetailPo marketDiscoverOverviewTrendingCategoriesDetailPo4 = (MarketDiscoverOverviewTrendingCategoriesDetailPo) objM7377constructorimpl;
        if (marketDiscoverOverviewTrendingCategoriesDetailPo4 == null) {
            return new C41119qkm(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }
        C34941nlu c34941nlu2 = c41073qjt.AEQbTJ;
        java.lang.String volume2 = marketDiscoverOverviewTrendingCategoriesDetailPo4.getMarketCap().getVolume();
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0 = c41073qjt;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$1 = marketDiscoverOverviewTrendingCategoriesDetailPo4;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c34941nlu2.EZpvd(volume2, marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        marketDiscoverOverviewTrendingCategoriesDetailPo = marketDiscoverOverviewTrendingCategoriesDetailPo4;
        objKWHzl = objEZpvd2;
        java.lang.String str42 = (java.lang.String) objKWHzl;
        java.lang.String strAEQbTJ4 = c41073qjt.AEQbTJ(marketDiscoverOverviewTrendingCategoriesDetailPo.getMarketCap().getChangePercent());
        C34941nlu c34941nlu3 = c41073qjt.AEQbTJ;
        java.lang.String volume3 = marketDiscoverOverviewTrendingCategoriesDetailPo.getVolume24h().getVolume();
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$0 = c41073qjt;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$1 = marketDiscoverOverviewTrendingCategoriesDetailPo;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$2 = str42;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.L$3 = strAEQbTJ4;
        marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1.label = 3;
        objEZpvd = c34941nlu3.EZpvd(volume3, marketDiscoverOverviewTrendingCategoryDetailUseCase$onExecute$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : OLrzqt().OLrzqt(str);
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 38, null);
    }
}
