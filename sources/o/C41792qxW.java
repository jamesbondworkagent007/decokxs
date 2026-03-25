package o;

import com.okinc.market.search.features.favorite.domain.usecase.FavoriteSearchInstrumentUseCase$onExecute$1;
import com.okinc.unify_trade.biz.FavoriteCoinWatchInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41792qxW extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, java.util.List<? extends TradeSearchGroup>> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher KWHzl;
    public final C41788qxS OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public static final boolean KWHzl() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41792qxW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41788qxS c41788qxS) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41788qxS, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c41788qxS;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C41792qxW.KWHzl());
            }
        });
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o.qxW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super java.util.List<TradeSearchGroup>> continuation) throws java.lang.Throwable {
        FavoriteSearchInstrumentUseCase$onExecute$1 favoriteSearchInstrumentUseCase$onExecute$1;
        boolean zBooleanValue;
        C41792qxW c41792qxW;
        java.lang.String str;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<TradeCoinInfo> arrayList;
        C41788qxS c41788qxS;
        java.lang.String str2;
        C41792qxW c41792qxW2;
        java.util.ArrayList<TradeCoinInfo> arrayList2;
        C56084xwD fieldNames;
        java.util.List<TradeCoinInfo> listKWHzl;
        java.util.Collection collectionAhwBna;
        if (continuation instanceof FavoriteSearchInstrumentUseCase$onExecute$1) {
            favoriteSearchInstrumentUseCase$onExecute$1 = (FavoriteSearchInstrumentUseCase$onExecute$1) continuation;
            int i = favoriteSearchInstrumentUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteSearchInstrumentUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteSearchInstrumentUseCase$onExecute$1 = new FavoriteSearchInstrumentUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = favoriteSearchInstrumentUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteSearchInstrumentUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strComponent1 = pair.component1();
            zBooleanValue = pair.component2().booleanValue();
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            favoriteSearchInstrumentUseCase$onExecute$1.L$0 = this;
            favoriteSearchInstrumentUseCase$onExecute$1.L$1 = strComponent1;
            favoriteSearchInstrumentUseCase$onExecute$1.Z$0 = zBooleanValue;
            favoriteSearchInstrumentUseCase$onExecute$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, favoriteSearchInstrumentUseCase$onExecute$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
            c41792qxW = this;
            str = strComponent1;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    zBooleanValue = favoriteSearchInstrumentUseCase$onExecute$1.Z$0;
                    str = (java.lang.String) favoriteSearchInstrumentUseCase$onExecute$1.L$1;
                    c41792qxW = (C41792qxW) favoriteSearchInstrumentUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null || (arrayList = fieldNames.KWHzl()) == null) {
                        arrayList = new java.util.ArrayList<>();
                    }
                    c41788qxS = c41792qxW.OLrzqt;
                    favoriteSearchInstrumentUseCase$onExecute$1.L$0 = c41792qxW;
                    favoriteSearchInstrumentUseCase$onExecute$1.L$1 = str;
                    favoriteSearchInstrumentUseCase$onExecute$1.L$2 = arrayList;
                    favoriteSearchInstrumentUseCase$onExecute$1.Z$0 = zBooleanValue;
                    favoriteSearchInstrumentUseCase$onExecute$1.label = 3;
                    if (c41788qxS.AEQbTJ(zBooleanValue, favoriteSearchInstrumentUseCase$onExecute$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    str2 = str;
                    c41792qxW2 = c41792qxW;
                    arrayList2 = arrayList;
                    listKWHzl = C41428qqd.OLrzqt.KWHzl(arrayList2);
                    if (listKWHzl == null) {
                    }
                    C40375qTn.AEQbTJ.copydefault("FavoriteSearchInstrumentUseCase", "search instruments [keyword: " + str2 + ", forceRefresh: " + zBooleanValue + ", fuzzySearchEnable: " + c41792qxW2.copydefault() + "]");
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C54704xSf.matchingV2$default(C54704xSf.OLrzqt, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c41792qxW2.OLrzqt.copydefault(), (java.lang.Iterable) collectionAhwBna), str2, null, c41792qxW2.copydefault(), true, 4, null));
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zBooleanValue = favoriteSearchInstrumentUseCase$onExecute$1.Z$0;
                arrayList2 = (java.util.ArrayList) favoriteSearchInstrumentUseCase$onExecute$1.L$2;
                java.lang.String str3 = (java.lang.String) favoriteSearchInstrumentUseCase$onExecute$1.L$1;
                c41792qxW2 = (C41792qxW) favoriteSearchInstrumentUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str3;
                listKWHzl = C41428qqd.OLrzqt.KWHzl(arrayList2);
                if (listKWHzl == null) {
                    collectionAhwBna = yDY.AhwBna();
                } else {
                    java.util.ArrayList<TradeCoinInfo> arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listKWHzl) {
                        TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) obj2;
                        if (!Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getTradeCoin(), (java.lang.Object) "0") && !Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getSymbol(), (java.lang.Object) "USDT")) {
                            arrayList3.add(obj2);
                        }
                    }
                    collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                    for (TradeCoinInfo tradeCoinInfo2 : arrayList3) {
                        collectionAhwBna.add(new FavoriteCoinWatchInstrument(tradeCoinInfo2.getName(), tradeCoinInfo2.getSymbol(), "COIN"));
                    }
                }
                C40375qTn.AEQbTJ.copydefault("FavoriteSearchInstrumentUseCase", "search instruments [keyword: " + str2 + ", forceRefresh: " + zBooleanValue + ", fuzzySearchEnable: " + c41792qxW2.copydefault() + "]");
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C54704xSf.matchingV2$default(C54704xSf.OLrzqt, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c41792qxW2.OLrzqt.copydefault(), (java.lang.Iterable) collectionAhwBna), str2, null, c41792qxW2.copydefault(), true, 4, null));
            }
            zBooleanValue = favoriteSearchInstrumentUseCase$onExecute$1.Z$0;
            str = (java.lang.String) favoriteSearchInstrumentUseCase$onExecute$1.L$1;
            c41792qxW = (C41792qxW) favoriteSearchInstrumentUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            favoriteSearchInstrumentUseCase$onExecute$1.L$0 = c41792qxW;
            favoriteSearchInstrumentUseCase$onExecute$1.L$1 = str;
            favoriteSearchInstrumentUseCase$onExecute$1.Z$0 = zBooleanValue;
            favoriteSearchInstrumentUseCase$onExecute$1.label = 2;
            if (C55608xnE.tryToInitTradeGroupList$default(interfaceC54581xNrOLrzqt2, false, favoriteSearchInstrumentUseCase$onExecute$1, 1, null) == objCopydefault) {
                return objCopydefault;
            }
        }
        interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            arrayList = new java.util.ArrayList<>();
            c41788qxS = c41792qxW.OLrzqt;
            favoriteSearchInstrumentUseCase$onExecute$1.L$0 = c41792qxW;
            favoriteSearchInstrumentUseCase$onExecute$1.L$1 = str;
            favoriteSearchInstrumentUseCase$onExecute$1.L$2 = arrayList;
            favoriteSearchInstrumentUseCase$onExecute$1.Z$0 = zBooleanValue;
            favoriteSearchInstrumentUseCase$onExecute$1.label = 3;
            if (c41788qxS.AEQbTJ(zBooleanValue, favoriteSearchInstrumentUseCase$onExecute$1) != objCopydefault) {
            }
        }
        listKWHzl = C41428qqd.OLrzqt.KWHzl(arrayList2);
        if (listKWHzl == null) {
        }
        C40375qTn.AEQbTJ.copydefault("FavoriteSearchInstrumentUseCase", "search instruments [keyword: " + str2 + ", forceRefresh: " + zBooleanValue + ", fuzzySearchEnable: " + c41792qxW2.copydefault() + "]");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C54704xSf.matchingV2$default(C54704xSf.OLrzqt, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c41792qxW2.OLrzqt.copydefault(), (java.lang.Iterable) collectionAhwBna), str2, null, c41792qxW2.copydefault(), true, 4, null));
    }
}
