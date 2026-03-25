package o;

import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.root.data.po.SearchResultBotsTradersWeb3Po;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$onExecute$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$searchBotTradersWeb3$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$searchEarnProducts$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$searchImChats$1;
import com.okinc.market.search.features.main.root.domain.usecase.AggregateSearchUseCase$searchInstrumentCollection$1;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC49403unr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGN implements InterfaceC49403unr<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, qGI> {
    public final qGV EZpvd;
    public final qGW KWHzl;
    public final qGT OLrzqt;
    public final C41784qxO copydefault;
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return true;
    }

    @yCM
    public qGN(@NotNull C41784qxO c41784qxO, @NotNull qGT qgt, @NotNull qGV qgv, @NotNull qGW qgw) {
        Intrinsics.checkNotNullParameter(c41784qxO, "");
        Intrinsics.checkNotNullParameter(qgt, "");
        Intrinsics.checkNotNullParameter(qgv, "");
        Intrinsics.checkNotNullParameter(qgw, "");
        this.copydefault = c41784qxO;
        this.OLrzqt = qgt;
        this.EZpvd = qgv;
        this.KWHzl = qgw;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49403unr.Application.EZpvd(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49403unr.Application.copydefault(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean> pair, Continuation<? super qGI> continuation) {
        return KWHzl2((kotlin.Pair<java.lang.String, java.lang.Boolean>) pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49403unr.Application.KWHzl(this, input, function2, continuation);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super qGI> continuation) {
        AggregateSearchUseCase$invoke$1 aggregateSearchUseCase$invoke$1;
        long j;
        if (continuation instanceof AggregateSearchUseCase$invoke$1) {
            aggregateSearchUseCase$invoke$1 = (AggregateSearchUseCase$invoke$1) continuation;
            int i = aggregateSearchUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$invoke$1 = new AggregateSearchUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = aggregateSearchUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            aggregateSearchUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            aggregateSearchUseCase$invoke$1.label = 1;
            objKWHzl = InterfaceC49403unr.Application.KWHzl(this, pair, aggregateSearchUseCase$invoke$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aggregateSearchUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((qGI) objKWHzl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "AggregateSearchUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl2(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super qGI> continuation) throws java.lang.Throwable {
        AggregateSearchUseCase$onExecute$1 aggregateSearchUseCase$onExecute$1;
        if (continuation instanceof AggregateSearchUseCase$onExecute$1) {
            aggregateSearchUseCase$onExecute$1 = (AggregateSearchUseCase$onExecute$1) continuation;
            int i = aggregateSearchUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$onExecute$1 = new AggregateSearchUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = aggregateSearchUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            java.lang.String strComponent1 = pair.component1();
            java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            AggregateSearchUseCase$onExecute$$inlined$executeAsyncTasks$1 aggregateSearchUseCase$onExecute$$inlined$executeAsyncTasks$1 = new AggregateSearchUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, pair, this, lowerCase, this, strComponent1, this, strComponent1);
            aggregateSearchUseCase$onExecute$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(aggregateSearchUseCase$onExecute$$inlined$executeAsyncTasks$1, aggregateSearchUseCase$onExecute$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        Quartet quartet = (Quartet) objCoroutineScope;
        Triple triple = (Triple) quartet.component1();
        java.util.List list = (java.util.List) quartet.component2();
        SearchResultBotsTradersWeb3Po searchResultBotsTradersWeb3Po = (SearchResultBotsTradersWeb3Po) quartet.component3();
        return new qGI(triple, list, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getSocial() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getTradingBot() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getDefiCoins() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getP2pAndDeposit() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getCampaign() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getAnnouncement() : null, searchResultBotsTradersWeb3Po != null ? searchResultBotsTradersWeb3Po.getContent() : null, (java.util.List) quartet.component4());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(kotlin.Pair<java.lang.String, java.lang.Boolean> pair, Continuation<? super Triple<? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>>> continuation) throws java.lang.Throwable {
        AggregateSearchUseCase$searchInstrumentCollection$1 aggregateSearchUseCase$searchInstrumentCollection$1;
        long j;
        if (continuation instanceof AggregateSearchUseCase$searchInstrumentCollection$1) {
            aggregateSearchUseCase$searchInstrumentCollection$1 = (AggregateSearchUseCase$searchInstrumentCollection$1) continuation;
            int i = aggregateSearchUseCase$searchInstrumentCollection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$searchInstrumentCollection$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$searchInstrumentCollection$1 = new AggregateSearchUseCase$searchInstrumentCollection$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = aggregateSearchUseCase$searchInstrumentCollection$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$searchInstrumentCollection$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            C41784qxO c41784qxO = this.copydefault;
            Triple tripleCopydefault = C49380unU.copydefault(pair, new Function1() { // from class: o.qGK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(qGN.copydefault((BizInstrument) obj));
                }
            });
            aggregateSearchUseCase$searchInstrumentCollection$1.L$0 = pair;
            aggregateSearchUseCase$searchInstrumentCollection$1.J$0 = jCurrentTimeMillis;
            aggregateSearchUseCase$searchInstrumentCollection$1.label = 1;
            objEZpvd = c41784qxO.EZpvd(tripleCopydefault, (Continuation) aggregateSearchUseCase$searchInstrumentCollection$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aggregateSearchUseCase$searchInstrumentCollection$1.J$0;
            pair = (kotlin.Pair) aggregateSearchUseCase$searchInstrumentCollection$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : (java.util.List) objEZpvd) {
            java.lang.String strEZpvd = ((C54716xSr) obj).EZpvd();
            java.lang.Object arrayList = linkedHashMap.get(strEZpvd);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strEZpvd, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            C54716xSr c54716xSr = (C54716xSr) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) entry.getValue());
            if (c54716xSr != null) {
                objAEQbTJ = c54716xSr.AEQbTJ();
            }
            linkedHashMap2.put(key, objAEQbTJ);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(linkedHashMap2, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("AggregateSearchUseCase", "searchInstrumentCollection [cost: " + pairOLrzqt.getSecond() + " ms, keyword: " + pair + "], group: " + ((java.util.Map) pairOLrzqt.getFirst()).keySet());
        java.util.Map map = (java.util.Map) pairOLrzqt.component1();
        java.util.List list = (java.util.List) map.get("SPOT");
        java.util.List list2 = (java.util.List) map.get("SWAP");
        java.util.List list3 = (java.util.List) map.get("OPTION");
        c40375qTn.copydefault("AggregateSearchUseCase", "searchInstrumentCollection [spot: " + (list != null ? C56443yFo.AEQbTJ(list.size()) : null) + ", future: " + (list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null) + ", options: " + (list3 != null ? C56443yFo.AEQbTJ(list3.size()) : null) + "]");
        return C49380unU.copydefault(C49380unU.OLrzqt(list, list2), list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super java.util.List<Product>> continuation) throws java.lang.Throwable {
        AggregateSearchUseCase$searchEarnProducts$1 aggregateSearchUseCase$searchEarnProducts$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof AggregateSearchUseCase$searchEarnProducts$1) {
            aggregateSearchUseCase$searchEarnProducts$1 = (AggregateSearchUseCase$searchEarnProducts$1) continuation;
            int i = aggregateSearchUseCase$searchEarnProducts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$searchEarnProducts$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$searchEarnProducts$1 = new AggregateSearchUseCase$searchEarnProducts$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = aggregateSearchUseCase$searchEarnProducts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$searchEarnProducts$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                qGT qgt = this.OLrzqt;
                aggregateSearchUseCase$searchEarnProducts$1.L$0 = str;
                aggregateSearchUseCase$searchEarnProducts$1.J$0 = jCurrentTimeMillis;
                aggregateSearchUseCase$searchEarnProducts$1.label = 1;
                objEZpvd = qgt.EZpvd(str, aggregateSearchUseCase$searchEarnProducts$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aggregateSearchUseCase$searchEarnProducts$1.J$0;
            str = (java.lang.String) aggregateSearchUseCase$searchEarnProducts$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "searchEarnProducts error", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "searchEarnProducts [cost: " + pairOLrzqt.getSecond() + " ms, keyword: " + str + "]");
        return (java.util.List) pairOLrzqt.component1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, Continuation<? super SearchResultBotsTradersWeb3Po> continuation) throws java.lang.Throwable {
        AggregateSearchUseCase$searchBotTradersWeb3$1 aggregateSearchUseCase$searchBotTradersWeb3$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof AggregateSearchUseCase$searchBotTradersWeb3$1) {
            aggregateSearchUseCase$searchBotTradersWeb3$1 = (AggregateSearchUseCase$searchBotTradersWeb3$1) continuation;
            int i = aggregateSearchUseCase$searchBotTradersWeb3$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$searchBotTradersWeb3$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$searchBotTradersWeb3$1 = new AggregateSearchUseCase$searchBotTradersWeb3$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = aggregateSearchUseCase$searchBotTradersWeb3$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$searchBotTradersWeb3$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                qGV qgv = this.EZpvd;
                aggregateSearchUseCase$searchBotTradersWeb3$1.L$0 = str;
                aggregateSearchUseCase$searchBotTradersWeb3$1.J$0 = jCurrentTimeMillis;
                aggregateSearchUseCase$searchBotTradersWeb3$1.label = 1;
                objEZpvd = qgv.EZpvd(str, aggregateSearchUseCase$searchBotTradersWeb3$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aggregateSearchUseCase$searchBotTradersWeb3$1.J$0;
            str = (java.lang.String) aggregateSearchUseCase$searchBotTradersWeb3$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((SearchResultBotsTradersWeb3Po) objEZpvd);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "searchBotTradersWeb3 error", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((SearchResultBotsTradersWeb3Po) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "searchBotTradersWeb3 [cost: " + pairOLrzqt.getSecond() + " ms, keyword: " + str + "]");
        return (SearchResultBotsTradersWeb3Po) pairOLrzqt.component1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super java.util.List<qGF>> continuation) throws java.lang.Throwable {
        AggregateSearchUseCase$searchImChats$1 aggregateSearchUseCase$searchImChats$1;
        long jCurrentTimeMillis;
        long j;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof AggregateSearchUseCase$searchImChats$1) {
            aggregateSearchUseCase$searchImChats$1 = (AggregateSearchUseCase$searchImChats$1) continuation;
            int i = aggregateSearchUseCase$searchImChats$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateSearchUseCase$searchImChats$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateSearchUseCase$searchImChats$1 = new AggregateSearchUseCase$searchImChats$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = aggregateSearchUseCase$searchImChats$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateSearchUseCase$searchImChats$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                qGW qgw = this.KWHzl;
                aggregateSearchUseCase$searchImChats$1.L$0 = str;
                aggregateSearchUseCase$searchImChats$1.J$0 = jCurrentTimeMillis;
                aggregateSearchUseCase$searchImChats$1.label = 1;
                objEZpvd = qgw.EZpvd(str, aggregateSearchUseCase$searchImChats$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (java.lang.Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aggregateSearchUseCase$searchImChats$1.J$0;
            str = (java.lang.String) aggregateSearchUseCase$searchImChats$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C40375qTn.AEQbTJ.copydefault("AggregateSearchUseCase", "searchImChats error", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objM7377constructorimpl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        java.lang.Object second = pairOLrzqt.getSecond();
        java.util.List list = (java.util.List) pairOLrzqt.getFirst();
        c40375qTn.copydefault("AggregateSearchUseCase", "searchImChats [cost: " + second + " ms, keyword: " + str + ", result size: " + (list != null ? C56443yFo.AEQbTJ(list.size()) : null) + "]");
        return (java.util.List) pairOLrzqt.component1();
    }
}
