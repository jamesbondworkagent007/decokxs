package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.domain.crypto.GetMarketFavoritesCryptosByGroupUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26115jSm extends AbstractC49400uno<java.lang.String, kotlin.Pair<? extends C26170jUn, ? extends java.util.List<? extends C26175jUs>>> {
    public final C41607qtx AEQbTJ;
    public final InterfaceC54577xNn AhwBna;
    public final CoroutineDispatcher EZpvd;
    public final C26125jSw KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.lang.String) obj, (Continuation<? super kotlin.Pair<C26170jUn, ? extends java.util.List<C26175jUs>>>) continuation);
    }

    @yCM
    public C26115jSm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26125jSw c26125jSw, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26125jSw, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c26125jSw;
        this.AhwBna = interfaceC54577xNn;
        this.AEQbTJ = c41607qtx;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26115jSm.OLrzqt());
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26115jSm.djBIcL());
            }
        });
    }

    private final boolean valueOf() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean OLrzqt() {
        return C55608xnE.OLrzqt();
    }

    private final boolean gEmmrt() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean djBIcL() {
        return C55608xnE.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<C26170jUn, ? extends java.util.List<C26175jUs>>> continuation) throws java.lang.Throwable {
        GetMarketFavoritesCryptosByGroupUseCase$onExecute$1 getMarketFavoritesCryptosByGroupUseCase$onExecute$1;
        java.lang.String str2;
        C26115jSm c26115jSm;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        java.util.Iterator it;
        java.lang.String str3;
        GetMarketFavoritesCryptosByGroupUseCase$onExecute$1 getMarketFavoritesCryptosByGroupUseCase$onExecute$12;
        C26115jSm c26115jSm2;
        java.lang.String str4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.Iterator it2;
        java.lang.Object next;
        C26170jUn c26170jUn;
        MarketFavoritesGroupPo marketFavoritesGroupPoAEQbTJ;
        java.util.List<MarketFavoritesGroupPo.FavoritesPo> favouriteList;
        if (continuation instanceof GetMarketFavoritesCryptosByGroupUseCase$onExecute$1) {
            getMarketFavoritesCryptosByGroupUseCase$onExecute$1 = (GetMarketFavoritesCryptosByGroupUseCase$onExecute$1) continuation;
            int i = getMarketFavoritesCryptosByGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketFavoritesCryptosByGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketFavoritesCryptosByGroupUseCase$onExecute$1 = new GetMarketFavoritesCryptosByGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getMarketFavoritesCryptosByGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketFavoritesCryptosByGroupUseCase$onExecute$1.label;
        java.util.List listAhwBna = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54577xNn interfaceC54577xNn = this.AhwBna;
            if (interfaceC54577xNn != null) {
                getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$0 = this;
                str2 = str;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$1 = str2;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getMarketFavoritesCryptosByGroupUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c26115jSm = this;
            } else {
                str2 = str;
                c26115jSm = this;
                it = yDY.gEmmrt("SPOT", "FUTURES", "SWAP", "OPTION").iterator();
                C26115jSm c26115jSm3 = c26115jSm;
                str3 = str2;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12 = getMarketFavoritesCryptosByGroupUseCase$onExecute$1;
                c26115jSm2 = c26115jSm3;
                while (it.hasNext()) {
                }
                C26125jSw c26125jSw = c26115jSm2.KWHzl;
                Unit unit = Unit.INSTANCE;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$0 = c26115jSm2;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$1 = str3;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$2 = null;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.label = 3;
                objEZpvd = c26125jSw.EZpvd(unit, (Continuation) getMarketFavoritesCryptosByGroupUseCase$onExecute$12);
                if (objEZpvd == objCopydefault) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$1;
                    c26115jSm2 = (C26115jSm) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    kotlin.Pair pair = (kotlin.Pair) objEZpvd;
                    it2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) pair.component1(), (java.lang.Iterable) pair.component2()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((C26170jUn) next).copydefault(), (java.lang.Object) str4)) {
                            break;
                        }
                    }
                    c26170jUn = (C26170jUn) next;
                    if (c26170jUn != null && (marketFavoritesGroupPoAEQbTJ = c26170jUn.AEQbTJ()) != null && (favouriteList = marketFavoritesGroupPoAEQbTJ.getFavouriteList()) != null) {
                        if (!((java.lang.Boolean) c26115jSm2.AEQbTJ.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue()) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : favouriteList) {
                                if (!Intrinsics.EZpvd((java.lang.Object) ((MarketFavoritesGroupPo.FavoritesPo) obj).getInstType(), (java.lang.Object) "CEDEFI")) {
                                    arrayList.add(obj);
                                }
                            }
                            favouriteList = arrayList;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (MarketFavoritesGroupPo.FavoritesPo favoritesPo : favouriteList) {
                            InterfaceC55797xqi interfaceC55797xqiAEQbTJ = c26115jSm2.AEQbTJ(favoritesPo);
                            C26175jUs c26175jUsEZpvd = interfaceC55797xqiAEQbTJ == null ? null : c26115jSm2.EZpvd(interfaceC55797xqiAEQbTJ, favoritesPo);
                            if (c26175jUsEZpvd != null) {
                                arrayList2.add(c26175jUsEZpvd);
                            }
                        }
                        listAhwBna = arrayList2;
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    return C56390yDp.OLrzqt(c26170jUn, listAhwBna);
                }
                it = (java.util.Iterator) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$2;
                str3 = (java.lang.String) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$1;
                C26115jSm c26115jSm4 = (C26115jSm) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12 = getMarketFavoritesCryptosByGroupUseCase$onExecute$1;
                c26115jSm2 = c26115jSm4;
                while (it.hasNext()) {
                    java.lang.String str5 = (java.lang.String) it.next();
                    InterfaceC54577xNn interfaceC54577xNn2 = c26115jSm2.AhwBna;
                    if (interfaceC54577xNn2 != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str5)) != null) {
                        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$0 = c26115jSm2;
                        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$1 = str3;
                        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$2 = it;
                        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.label = 2;
                        if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, getMarketFavoritesCryptosByGroupUseCase$onExecute$12) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                C26125jSw c26125jSw2 = c26115jSm2.KWHzl;
                Unit unit2 = Unit.INSTANCE;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$0 = c26115jSm2;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$1 = str3;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$2 = null;
                getMarketFavoritesCryptosByGroupUseCase$onExecute$12.label = 3;
                objEZpvd = c26125jSw2.EZpvd(unit2, (Continuation) getMarketFavoritesCryptosByGroupUseCase$onExecute$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str3;
                kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
                it2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) pair2.component1(), (java.lang.Iterable) pair2.component2()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                c26170jUn = (C26170jUn) next;
                if (c26170jUn != null) {
                    if (!((java.lang.Boolean) c26115jSm2.AEQbTJ.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue()) {
                    }
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    while (r1.hasNext()) {
                    }
                    listAhwBna = arrayList22;
                }
                if (listAhwBna == null) {
                }
                return C56390yDp.OLrzqt(c26170jUn, listAhwBna);
            }
            java.lang.String str6 = (java.lang.String) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$1;
            c26115jSm = (C26115jSm) getMarketFavoritesCryptosByGroupUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objEZpvd).m7386unboximpl();
            str2 = str6;
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        it = yDY.gEmmrt("SPOT", "FUTURES", "SWAP", "OPTION").iterator();
        C26115jSm c26115jSm32 = c26115jSm;
        str3 = str2;
        getMarketFavoritesCryptosByGroupUseCase$onExecute$12 = getMarketFavoritesCryptosByGroupUseCase$onExecute$1;
        c26115jSm2 = c26115jSm32;
        while (it.hasNext()) {
        }
        C26125jSw c26125jSw22 = c26115jSm2.KWHzl;
        Unit unit22 = Unit.INSTANCE;
        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$0 = c26115jSm2;
        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$1 = str3;
        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.L$2 = null;
        getMarketFavoritesCryptosByGroupUseCase$onExecute$12.label = 3;
        objEZpvd = c26125jSw22.EZpvd(unit22, (Continuation) getMarketFavoritesCryptosByGroupUseCase$onExecute$12);
        if (objEZpvd == objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C26175jUs EZpvd(InterfaceC55797xqi interfaceC55797xqi, MarketFavoritesGroupPo.FavoritesPo favoritesPo) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.String str;
        java.lang.String instId;
        if (interfaceC55797xqi instanceof BizInstrument) {
            BizInstrument bizInstrument = (BizInstrument) interfaceC55797xqi;
            java.lang.String tradeSymbol = bizInstrument.getTradeSymbol();
            if (bizInstrument instanceof CoinWatchInstrument) {
                instId = ((CoinWatchInstrument) interfaceC55797xqi).getInstId();
            } else {
                z = true;
                if (bizInstrument instanceof SwapInstrument) {
                    SwapInstrument swapInstrument = (SwapInstrument) interfaceC55797xqi;
                    if (swapInstrument.isPreMarketPair()) {
                        tradeSymbol = C40381qTt.copydefault.copydefault(swapInstrument.getInstId());
                        if (tradeSymbol == null) {
                            tradeSymbol = swapInstrument.getInstId();
                        }
                    } else {
                        tradeSymbol = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, swapInstrument.getInstId(), swapInstrument.getInstType(), false, false, false, 8, null);
                    }
                    z2 = false;
                    str = null;
                    z3 = true;
                    z = false;
                } else if (bizInstrument instanceof FutureInstrument) {
                    FutureInstrument futureInstrument = (FutureInstrument) interfaceC55797xqi;
                    if (futureInstrument.isPreMarketPair()) {
                        java.lang.String strCopydefault = C40381qTt.copydefault.copydefault(futureInstrument.getInstId());
                        instId = strCopydefault == null ? futureInstrument.getInstId() : strCopydefault;
                    } else {
                        instId = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, futureInstrument.getInstId(), futureInstrument.getInstType(), false, false, false, 28, null);
                    }
                } else if (bizInstrument instanceof OptionInstrument) {
                    instId = ((OptionInstrument) interfaceC55797xqi).getInstId();
                } else {
                    java.lang.String str2 = " / " + bizInstrument.getDisplayQuoteSymbol();
                    boolean z4 = interfaceC55797xqi instanceof SpotInstrument;
                    SpotInstrument spotInstrument = z4 ? (SpotInstrument) interfaceC55797xqi : null;
                    java.lang.String level = spotInstrument != null ? spotInstrument.getLevel() : null;
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
                        level = null;
                    }
                    if (level == null) {
                        SpotInstrument spotInstrument2 = z4 ? (SpotInstrument) interfaceC55797xqi : null;
                        coinLever = spotInstrument2 != null ? spotInstrument2.getCoinLever() : null;
                        level = coinLever == null ? "" : coinLever;
                    }
                    z2 = !valueOf() && gEmmrt() && C33129mqd.OLrzqt((java.lang.CharSequence) level);
                    z3 = false;
                    str = level + "x";
                    coinLever = str2;
                }
                java.lang.String str3 = coinLever != null ? "" : coinLever;
                if (str == null) {
                    str = "";
                }
                return new C26175jUs(tradeSymbol, str3, z, str, z2, z3, favoritesPo, bizInstrument, false, 256, null);
            }
            tradeSymbol = instId;
            z = false;
            z2 = false;
            z3 = false;
            str = null;
            if (coinLever != null) {
            }
            if (str == null) {
            }
            return new C26175jUs(tradeSymbol, str3, z, str, z2, z3, favoritesPo, bizInstrument, false, 256, null);
        }
        if (!(interfaceC55797xqi instanceof DexInstrument)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C26175jUs("", "", false, "", false, false, favoritesPo, (DexInstrument) interfaceC55797xqi, false, 256, null);
    }

    public final InterfaceC55797xqi AEQbTJ(MarketFavoritesGroupPo.FavoritesPo favoritesPo) {
        java.lang.String instType = favoritesPo.getInstType();
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "COIN")) {
            return new CoinWatchInstrument(favoritesPo.getInstId(), favoritesPo.getInstType());
        }
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "CEDEFI")) {
            return new DexInstrument(favoritesPo.getChainId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, favoritesPo.getTokenSymbol(), favoritesPo.getTokenContractAddress(), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 16286, (DefaultConstructorMarker) null);
        }
        return xUD.getWatchMarketInstrument$default(favoritesPo.getInstType(), favoritesPo.getInstId(), favoritesPo.getInstId(), favoritesPo.getAlias(), false, 16, null);
    }
}
