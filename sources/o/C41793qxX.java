package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.market.search.features.favorite.domain.usecase.FavoriteSearchUseCase$invoke$1;
import com.okinc.market.search.features.favorite.domain.usecase.FavoriteSearchUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.search.features.favorite.domain.usecase.FavoriteSearchUseCase$onExecute$1;
import com.okinc.market.search.features.favorite.domain.usecase.FavoriteSearchUseCase$searchInstrumentCollection$1;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41793qxX extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, C40078qIn> {
    public final CoroutineDispatcher EZpvd;
    public final qGQ KWHzl;
    public final C41607qtx OLrzqt;
    public final C41501qrx copydefault;
    public final InterfaceC54577xNn djBIcL;
    public final C41580qtW gEmmrt;
    public final C41792qxW valueOf;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC49400uno
    public /* bridge */ /* synthetic */ java.lang.Object EZpvd(kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean> pair, Continuation<? super C40078qIn> continuation) {
        return EZpvd2((kotlin.Pair<java.lang.String, java.lang.Boolean>) pair, continuation);
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((kotlin.Pair<java.lang.String, java.lang.Boolean>) obj, (Continuation<? super C40078qIn>) continuation);
    }

    @yCM
    public C41793qxX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41792qxW c41792qxW, @NotNull qGQ qgq, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41580qtW c41580qtW, @NotNull C41501qrx c41501qrx, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41792qxW, "");
        Intrinsics.checkNotNullParameter(qgq, "");
        Intrinsics.checkNotNullParameter(c41580qtW, "");
        Intrinsics.checkNotNullParameter(c41501qrx, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.EZpvd = coroutineDispatcher;
        this.valueOf = c41792qxW;
        this.KWHzl = qgq;
        this.djBIcL = interfaceC54577xNn;
        this.gEmmrt = c41580qtW;
        this.copydefault = c41501qrx;
        this.OLrzqt = c41607qtx;
    }

    /* JADX INFO: renamed from: o.qxX$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        FavoriteSearchUseCase$invoke$1 favoriteSearchUseCase$invoke$1;
        long j;
        if (continuation instanceof FavoriteSearchUseCase$invoke$1) {
            favoriteSearchUseCase$invoke$1 = (FavoriteSearchUseCase$invoke$1) continuation;
            int i = favoriteSearchUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteSearchUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteSearchUseCase$invoke$1 = new FavoriteSearchUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = favoriteSearchUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteSearchUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            favoriteSearchUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            favoriteSearchUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(pair, (Continuation) favoriteSearchUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = favoriteSearchUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((C40078qIn) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("FavoriteSearchUseCase", "FavoriteSearchUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        FavoriteSearchUseCase$onExecute$1 favoriteSearchUseCase$onExecute$1;
        C41793qxX c41793qxX;
        java.lang.String str;
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMapAEQbTJ;
        if (continuation instanceof FavoriteSearchUseCase$onExecute$1) {
            favoriteSearchUseCase$onExecute$1 = (FavoriteSearchUseCase$onExecute$1) continuation;
            int i = favoriteSearchUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteSearchUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteSearchUseCase$onExecute$1 = new FavoriteSearchUseCase$onExecute$1(this, continuation);
            }
        }
        FavoriteSearchUseCase$onExecute$1 favoriteSearchUseCase$onExecute$12 = favoriteSearchUseCase$onExecute$1;
        java.lang.Object objCoroutineScope = favoriteSearchUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteSearchUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            java.lang.String strComponent1 = pair.component1();
            java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            C40375qTn.AEQbTJ.copydefault("FavoriteSearchUseCase", "do search [keyword: " + lowerCase + "]");
            FavoriteSearchUseCase$onExecute$$inlined$executeAsyncTasks$1 favoriteSearchUseCase$onExecute$$inlined$executeAsyncTasks$1 = new FavoriteSearchUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, pair, this, new Triple(lowerCase, C41876qzA.Companion.OLrzqt(), null));
            favoriteSearchUseCase$onExecute$12.L$0 = this;
            favoriteSearchUseCase$onExecute$12.L$1 = strComponent1;
            favoriteSearchUseCase$onExecute$12.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(favoriteSearchUseCase$onExecute$$inlined$executeAsyncTasks$1, favoriteSearchUseCase$onExecute$12);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41793qxX = this;
            str = strComponent1;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) favoriteSearchUseCase$onExecute$12.L$1;
            c41793qxX = (C41793qxX) favoriteSearchUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            str = str2;
        }
        kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
        Quartet quartet = (Quartet) pair2.component1();
        Triple triple = (Triple) pair2.component2();
        java.util.List<? extends BizInstrument> list = (java.util.List) quartet.component1();
        java.util.List<? extends BizInstrument> list2 = (java.util.List) quartet.component2();
        java.util.List<? extends BizInstrument> list3 = (java.util.List) quartet.component3();
        java.util.List<? extends BizInstrument> list4 = (java.util.List) quartet.component4();
        java.util.List<C39994qFk> listOLrzqt = list != null ? c41793qxX.OLrzqt(list, "SPOT") : null;
        java.util.List<C39994qFk> listOLrzqt2 = list2 != null ? c41793qxX.OLrzqt(list2, "SWAP") : null;
        if (list3 != null) {
            InterfaceC54577xNn interfaceC54577xNn = c41793qxX.djBIcL;
            sortedMapAEQbTJ = c41793qxX.AEQbTJ(list3, interfaceC54577xNn != null && interfaceC54577xNn.EZpvd());
        } else {
            sortedMapAEQbTJ = null;
        }
        return new C40078qIn(str, list4 != null ? c41793qxX.OLrzqt(list4, "COIN") : null, listOLrzqt, listOLrzqt2, sortedMapAEQbTJ, null, null, null, null, null, null, null, null, null, triple, 15872, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(kotlin.Pair<java.lang.String, java.lang.Boolean> pair, Continuation<? super Quartet<? extends java.util.List<? extends BizInstrument>, ? extends java.util.List<? extends BizInstrument>, ? extends java.util.List<? extends BizInstrument>, ? extends java.util.List<? extends BizInstrument>>> continuation) throws java.lang.Throwable {
        FavoriteSearchUseCase$searchInstrumentCollection$1 favoriteSearchUseCase$searchInstrumentCollection$1;
        java.lang.String strComponent1;
        long jCurrentTimeMillis;
        java.lang.Object objEZpvd;
        C41793qxX c41793qxX;
        if (continuation instanceof FavoriteSearchUseCase$searchInstrumentCollection$1) {
            favoriteSearchUseCase$searchInstrumentCollection$1 = (FavoriteSearchUseCase$searchInstrumentCollection$1) continuation;
            int i = favoriteSearchUseCase$searchInstrumentCollection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteSearchUseCase$searchInstrumentCollection$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteSearchUseCase$searchInstrumentCollection$1 = new FavoriteSearchUseCase$searchInstrumentCollection$1(this, continuation);
            }
        }
        java.lang.Object obj = favoriteSearchUseCase$searchInstrumentCollection$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteSearchUseCase$searchInstrumentCollection$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            strComponent1 = pair.component1();
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            C41792qxW c41792qxW = this.valueOf;
            favoriteSearchUseCase$searchInstrumentCollection$1.L$0 = this;
            favoriteSearchUseCase$searchInstrumentCollection$1.L$1 = pair;
            favoriteSearchUseCase$searchInstrumentCollection$1.L$2 = strComponent1;
            favoriteSearchUseCase$searchInstrumentCollection$1.J$0 = jCurrentTimeMillis;
            favoriteSearchUseCase$searchInstrumentCollection$1.label = 1;
            objEZpvd = c41792qxW.EZpvd(pair, favoriteSearchUseCase$searchInstrumentCollection$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41793qxX = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = favoriteSearchUseCase$searchInstrumentCollection$1.J$0;
            java.lang.String str = (java.lang.String) favoriteSearchUseCase$searchInstrumentCollection$1.L$2;
            kotlin.Pair<java.lang.String, java.lang.Boolean> pair2 = (kotlin.Pair) favoriteSearchUseCase$searchInstrumentCollection$1.L$1;
            C41793qxX c41793qxX2 = (C41793qxX) favoriteSearchUseCase$searchInstrumentCollection$1.L$0;
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = j;
            c41793qxX = c41793qxX2;
            objEZpvd = obj;
            strComponent1 = str;
            pair = pair2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : (java.util.List) objEZpvd) {
            java.lang.String bizType = ((TradeSearchGroup) obj2).getBizType();
            java.lang.Object arrayList = linkedHashMap.get(bizType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(bizType, arrayList);
            }
            ((java.util.List) arrayList).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            TradeSearchGroup tradeSearchGroup = (TradeSearchGroup) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) entry.getValue());
            if (tradeSearchGroup != null) {
                bizInstList = tradeSearchGroup.getBizInstList();
            }
            linkedHashMap2.put(key, bizInstList);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(linkedHashMap2, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("FavoriteSearchUseCase", "searchInstrumentCollection [cost: " + pairOLrzqt.getSecond() + " ms, keyword: " + pair + "], group: " + ((java.util.Map) pairOLrzqt.getFirst()).keySet());
        java.util.Map map = (java.util.Map) pairOLrzqt.component1();
        java.util.List list = (java.util.ArrayList) map.get("SPOT");
        if (list == null) {
            list = null;
        } else if (!C33129mqd.OLrzqt((java.lang.CharSequence) strComponent1)) {
            list = (java.util.List) c41793qxX.gEmmrt.KWHzl(list);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) map.get("SWAP");
        java.util.List list2 = arrayList2 != null ? (java.util.List) c41793qxX.gEmmrt.KWHzl(arrayList2) : null;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) map.get("OPTION");
        java.util.ArrayList arrayList4 = (java.util.ArrayList) map.get("COIN");
        c40375qTn.copydefault("FavoriteSearchUseCase", "searchInstrumentCollection [spot: " + (list != null ? C56443yFo.AEQbTJ(list.size()) : null) + ", future: " + (list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null) + ", options: " + (arrayList3 != null ? C56443yFo.AEQbTJ(arrayList3.size()) : null) + "]");
        return C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(list, list2), arrayList3), arrayList4);
    }

    public static final java.util.List<C40005qFv> KWHzl(java.util.List<OptionInstrument> list, boolean z) {
        LinkedHashMap<java.lang.String, java.lang.String> linkedHashMapKWHzl = C40377qTp.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (OptionInstrument optionInstrument : list) {
            java.lang.String localized$default = pTB.formatLocalized$default(optionInstrument.getOptionStk(), null, 1, null);
            java.lang.String str = linkedHashMapKWHzl.get(optionInstrument.getOptionOptType());
            if (str == null) {
                str = "";
            }
            arrayList.add(new C40005qFv(optionInstrument, null, localized$default, str, "--", "--", UpDownColor.NEUTRAL, false, !z, null, false, 1536, null));
        }
        return arrayList;
    }

    public final java.util.List<C39994qFk> OLrzqt(java.util.List<? extends BizInstrument> list, java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C39994qFk c39994qFk = (C39994qFk) this.KWHzl.copydefault(it.next());
            c39994qFk.copydefault(false);
            c39994qFk.OLrzqt(false);
            arrayList.add(c39994qFk);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("FavoriteSearchUseCase", "toCoinVoList [cost: " + pairOLrzqt.getSecond() + "ms, bizType: " + str + "]");
        return (java.util.List) pairOLrzqt.component1();
    }

    public final SortedMap<java.lang.Long, java.util.List<C40005qFv>> AEQbTJ(java.util.List<? extends BizInstrument> list, boolean z) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        TreeMap treeMap = new TreeMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof OptionInstrument) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList) {
            java.lang.String expTime = ((OptionInstrument) obj2).getExpTime();
            java.lang.Object arrayList2 = linkedHashMap.get(expTime);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(expTime, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            treeMap.put(java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) entry.getKey())), KWHzl((java.util.List<OptionInstrument>) entry.getValue(), z));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(treeMap, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("FavoriteSearchUseCase", "toOptionsVoMap [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (TreeMap) pairOLrzqt.component1();
    }
}
