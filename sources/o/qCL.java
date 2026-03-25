package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.InvestCurrency;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.recommend.history.data.model.ProductType;
import com.okinc.market.search.features.main.recommend.history.domain.usecase.GetSearchHistoryUseCase$invoke$1;
import com.okinc.market.search.features.main.recommend.history.domain.usecase.GetSearchHistoryUseCase$onExecute$1;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCL extends AbstractC49400uno<Unit, java.util.List<? extends qCU>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher EZpvd;
    public final C39928qCz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC49400uno
    public /* bridge */ /* synthetic */ java.lang.Object EZpvd(Unit unit, Continuation<? super java.util.List<? extends qCU>> continuation) {
        return EZpvd2(unit, (Continuation<? super java.util.List<qCU>>) continuation);
    }

    @yCM
    public qCL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39928qCz c39928qCz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39928qCz, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c39928qCz;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<qCU>> continuation) throws java.lang.Throwable {
        GetSearchHistoryUseCase$invoke$1 getSearchHistoryUseCase$invoke$1;
        long j;
        if (continuation instanceof GetSearchHistoryUseCase$invoke$1) {
            getSearchHistoryUseCase$invoke$1 = (GetSearchHistoryUseCase$invoke$1) continuation;
            int i = getSearchHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSearchHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSearchHistoryUseCase$invoke$1 = new GetSearchHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getSearchHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSearchHistoryUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            getSearchHistoryUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            getSearchHistoryUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(unit, (Continuation) getSearchHistoryUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getSearchHistoryUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("GetSearchHistoryUseCase", "getSearchHistoryUseCase [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<qCU>> continuation) throws java.lang.Throwable {
        GetSearchHistoryUseCase$onExecute$1 getSearchHistoryUseCase$onExecute$1;
        java.lang.String historyName;
        java.lang.String currencyName;
        java.lang.String name;
        if (continuation instanceof GetSearchHistoryUseCase$onExecute$1) {
            getSearchHistoryUseCase$onExecute$1 = (GetSearchHistoryUseCase$onExecute$1) continuation;
            int i = getSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSearchHistoryUseCase$onExecute$1 = new GetSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C39928qCz c39928qCz = this.copydefault;
            getSearchHistoryUseCase$onExecute$1.label = 1;
            objKWHzl = c39928qCz.KWHzl(getSearchHistoryUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) objKWHzl, 20);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (java.lang.Object obj : listAhwBna) {
            if (obj instanceof BizInstrument) {
                historyName = C40384qTw.copydefault((BizInstrument) obj);
            } else if (obj instanceof SearchTrader) {
                historyName = qGG.OLrzqt((SearchTrader) obj);
            } else {
                java.lang.String str = "";
                if (obj instanceof Product) {
                    Product product = (Product) obj;
                    InvestCurrency investCurrency = product.getInvestCurrency();
                    if (investCurrency == null || (currencyName = investCurrency.getCurrencyName()) == null) {
                        currencyName = "";
                    }
                    ProductType productType = product.getProductType();
                    if (productType != null && (name = productType.getName()) != null) {
                        str = name;
                    }
                    historyName = currencyName + " " + str;
                } else if (obj instanceof TradingStrategy) {
                    historyName = qGH.AEQbTJ((TradingStrategy) obj);
                } else if (obj instanceof DefiWebCoins) {
                    historyName = pWR.OLrzqt((DefiWebCoins) obj);
                } else {
                    historyName = obj instanceof P2pAndDepositHistory ? ((P2pAndDepositHistory) obj).getHistoryName() : "";
                }
            }
            arrayList.add(new qCU(historyName, obj));
        }
        return arrayList;
    }
}
