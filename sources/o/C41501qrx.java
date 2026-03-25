package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.SearchDexVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.dex.SearchDexVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41501qrx extends AbstractC49400uno<Triple<? extends java.lang.String, ? extends InterfaceC41652qup, ? extends Function1<? super InterfaceC41655qus, ? extends java.lang.Boolean>>, Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> {
    public final C41498qru AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC46557tYt OLrzqt;
    public final C41489qrl copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41501qrx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41489qrl c41489qrl, @NotNull C41498qru c41498qru, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41489qrl, "");
        Intrinsics.checkNotNullParameter(c41498qru, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c41489qrl;
        this.AEQbTJ = c41498qru;
        this.OLrzqt = interfaceC46557tYt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<java.lang.String, ? extends InterfaceC41652qup, ? extends Function1<? super InterfaceC41655qus, java.lang.Boolean>> triple, @NotNull Continuation<? super Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        SearchDexVosUseCase$onExecute$1 searchDexVosUseCase$onExecute$1;
        java.lang.String strComponent1;
        final C41501qrx c41501qrx;
        final InterfaceC41652qup interfaceC41652qup;
        Function1<? super InterfaceC41655qus, java.lang.Boolean> function1;
        java.util.ArrayList arrayList;
        java.util.List listEZpvd;
        if (continuation instanceof SearchDexVosUseCase$onExecute$1) {
            searchDexVosUseCase$onExecute$1 = (SearchDexVosUseCase$onExecute$1) continuation;
            int i = searchDexVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchDexVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchDexVosUseCase$onExecute$1 = new SearchDexVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = searchDexVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchDexVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            strComponent1 = triple.component1();
            InterfaceC41652qup interfaceC41652qupComponent2 = triple.component2();
            Function1<? super InterfaceC41655qus, java.lang.Boolean> function1Component3 = triple.component3();
            C41434qqj.KWHzl.KWHzl("SearchDexVosUseCase", "search dex vos, [input: " + triple + "]");
            SearchDexVosUseCase$onExecute$$inlined$executeAsyncTasks$1 searchDexVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new SearchDexVosUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, this, strComponent1);
            searchDexVosUseCase$onExecute$1.L$0 = this;
            searchDexVosUseCase$onExecute$1.L$1 = strComponent1;
            searchDexVosUseCase$onExecute$1.L$2 = interfaceC41652qupComponent2;
            searchDexVosUseCase$onExecute$1.L$3 = function1Component3;
            searchDexVosUseCase$onExecute$1.label = 1;
            java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(searchDexVosUseCase$onExecute$$inlined$executeAsyncTasks$1, searchDexVosUseCase$onExecute$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41501qrx = this;
            interfaceC41652qup = interfaceC41652qupComponent2;
            obj = objCoroutineScope;
            function1 = function1Component3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) searchDexVosUseCase$onExecute$1.L$3;
            interfaceC41652qup = (InterfaceC41652qup) searchDexVosUseCase$onExecute$1.L$2;
            strComponent1 = (java.lang.String) searchDexVosUseCase$onExecute$1.L$1;
            c41501qrx = (C41501qrx) searchDexVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        kotlin.Pair pair = (kotlin.Pair) obj;
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        if (list2 == null || (listEZpvd = C41389qpr.EZpvd(list2, new Function1() { // from class: o.qrB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C41501qrx.copydefault(interfaceC41652qup, c41501qrx, (DexTokenPo) obj2);
            }
        })) == null) {
            arrayList = null;
        } else {
            if (function1 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listEZpvd) {
                    if (function1.invoke(obj2).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                listEZpvd = arrayList2;
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC41655qus) it.next()).copydefault(strComponent1));
            }
        }
        C41434qqj.KWHzl.KWHzl("SearchDexVosUseCase", "search dex vos, [result size: " + (arrayList != null ? C56443yFo.AEQbTJ(arrayList.size()) : null) + "]");
        return new Triple(strComponent1, list, arrayList);
    }

    public static final java.lang.String OLrzqt(DexTokenPo dexTokenPo, C41501qrx c41501qrx) {
        int iEZpvd = c41501qrx.OLrzqt.EZpvd();
        if (iEZpvd == 1) {
            return dexTokenPo.getPriceChangeUtc0();
        }
        if (iEZpvd == 2) {
            return dexTokenPo.getPriceChangeUtc8();
        }
        return dexTokenPo.getPriceChange();
    }

    public static final InterfaceC41655qus copydefault(InterfaceC41652qup interfaceC41652qup, C41501qrx c41501qrx, DexTokenPo dexTokenPo) {
        Intrinsics.checkNotNullParameter(dexTokenPo, "");
        DexInstrument dexInstrumentCopydefault = DexTokenPo.Companion.copydefault(dexTokenPo);
        double dAEQbTJ = C33129mqd.AEQbTJ(OLrzqt(dexTokenPo, c41501qrx));
        double dAEQbTJ2 = C33129mqd.AEQbTJ(dexTokenPo.getPrice());
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(dexTokenPo.getTurnOver());
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(dexTokenPo.getMarketCap());
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(dexTokenPo.getLiquidity());
        boolean zEZpvd = Intrinsics.EZpvd(dexTokenPo.getVerified(), java.lang.Boolean.TRUE);
        boolean boosted = dexTokenPo.getBoosted();
        return interfaceC41652qup.OLrzqt(dexInstrumentCopydefault, java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(dAEQbTJ2), bigDecimalEZpvd, bigDecimalEZpvd2, bigDecimalEZpvd3, zEZpvd, java.lang.Boolean.valueOf(boosted), dexTokenPo.getBoostPercentage(), dexTokenPo.getBoostRate());
    }
}
