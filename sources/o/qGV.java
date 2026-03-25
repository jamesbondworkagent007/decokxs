package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.SearchResultBotsTradersWeb3Po;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.market.search.features.main.root.domain.usecase.SearchBotTraderWeb3UseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.SearchBotTraderWeb3UseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGV extends AbstractC49400uno<java.lang.String, SearchResultBotsTradersWeb3Po> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C41607qtx AEQbTJ;
    public final InterfaceC54577xNn AYXKKw;
    public final InterfaceC49317umK AhwBna;
    public final CoroutineDispatcher EZpvd;
    public final OKComplianceRestrictionService KWHzl;
    public final qGE OLrzqt;
    public final InterfaceC49497upf valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((java.lang.String) obj, (Continuation<? super SearchResultBotsTradersWeb3Po>) continuation);
    }

    @yCM
    public qGV(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC49497upf interfaceC49497upf, InterfaceC49317umK interfaceC49317umK, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41607qtx c41607qtx, @NotNull qGE qge) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        Intrinsics.checkNotNullParameter(qge, "");
        this.EZpvd = coroutineDispatcher;
        this.valueOf = interfaceC49497upf;
        this.AhwBna = interfaceC49317umK;
        this.KWHzl = oKComplianceRestrictionService;
        this.AYXKKw = interfaceC54577xNn;
        this.AEQbTJ = c41607qtx;
        this.OLrzqt = qge;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super SearchResultBotsTradersWeb3Po> continuation) throws java.lang.Throwable {
        SearchBotTraderWeb3UseCase$invoke$1 searchBotTraderWeb3UseCase$invoke$1;
        long j;
        if (continuation instanceof SearchBotTraderWeb3UseCase$invoke$1) {
            searchBotTraderWeb3UseCase$invoke$1 = (SearchBotTraderWeb3UseCase$invoke$1) continuation;
            int i = searchBotTraderWeb3UseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchBotTraderWeb3UseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchBotTraderWeb3UseCase$invoke$1 = new SearchBotTraderWeb3UseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchBotTraderWeb3UseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchBotTraderWeb3UseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            searchBotTraderWeb3UseCase$invoke$1.J$0 = jCurrentTimeMillis;
            searchBotTraderWeb3UseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(str, (Continuation) searchBotTraderWeb3UseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = searchBotTraderWeb3UseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((SearchResultBotsTradersWeb3Po) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("SearchBotTraderWeb3UseCase", "SearchBotTraderWeb3UseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX DEBUG: Type inference failed for r3v7. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull java.lang.String str, @NotNull Continuation<? super SearchResultBotsTradersWeb3Po> continuation) throws java.lang.Throwable {
        SearchBotTraderWeb3UseCase$onExecute$1 searchBotTraderWeb3UseCase$onExecute$1;
        qGV qgv;
        long j;
        ?? r11;
        ?? r10;
        ?? r9;
        ?? r8;
        java.util.ArrayList arrayList;
        java.util.List<DefiWebCoins> defiCoins;
        if (continuation instanceof SearchBotTraderWeb3UseCase$onExecute$1) {
            searchBotTraderWeb3UseCase$onExecute$1 = (SearchBotTraderWeb3UseCase$onExecute$1) continuation;
            int i = searchBotTraderWeb3UseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchBotTraderWeb3UseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchBotTraderWeb3UseCase$onExecute$1 = new SearchBotTraderWeb3UseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchBotTraderWeb3UseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchBotTraderWeb3UseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54577xNn interfaceC54577xNn = this.AYXKKw;
            char c = (interfaceC54577xNn == null || !interfaceC54577xNn.EZpvd()) ? (char) 0 : (char) 1;
            InterfaceC49497upf interfaceC49497upf = this.valueOf;
            xND xndAEQbTJ = interfaceC49497upf != null ? interfaceC49497upf.AEQbTJ() : null;
            ?? EZpvd = xndAEQbTJ != null ? Intrinsics.EZpvd(xndAEQbTJ.gEmmrt(), C56443yFo.KWHzl(true)) : 0;
            InterfaceC49317umK interfaceC49317umK = this.AhwBna;
            ?? r102 = (interfaceC49317umK == null || !interfaceC49317umK.djBIcL() || xndAEQbTJ == null || !Intrinsics.EZpvd(xndAEQbTJ.AYXKKw(), C56443yFo.KWHzl(true))) ? 0 : 1;
            ?? r92 = (this.KWHzl.AEQbTJ(OKComplianceRestrictionService.Feature.CEFI_DEX) || c != 0) ? 0 : 1;
            ?? r82 = c ^ 1;
            C40375qTn.AEQbTJ.copydefault("SearchBotTraderWeb3UseCase", "restriction config [isSupportBot: " + EZpvd + ", isSupportTrader: " + r102 + ", isSupportWeb3Defi: " + r92 + ", isSupportContent: " + r82 + "]");
            if (EZpvd == 0 && r102 == 0 && r92 == 0) {
                return null;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            qGE qge = this.OLrzqt;
            searchBotTraderWeb3UseCase$onExecute$1.L$0 = this;
            searchBotTraderWeb3UseCase$onExecute$1.I$0 = EZpvd;
            searchBotTraderWeb3UseCase$onExecute$1.I$1 = r102;
            searchBotTraderWeb3UseCase$onExecute$1.I$2 = r92;
            searchBotTraderWeb3UseCase$onExecute$1.I$3 = r82;
            searchBotTraderWeb3UseCase$onExecute$1.J$0 = jCurrentTimeMillis;
            searchBotTraderWeb3UseCase$onExecute$1.label = 1;
            objEZpvd = qge.EZpvd(str, searchBotTraderWeb3UseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            qgv = this;
            j = jCurrentTimeMillis;
            r8 = r82;
            r9 = r92;
            r10 = r102;
            r11 = EZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = searchBotTraderWeb3UseCase$onExecute$1.J$0;
            int i3 = searchBotTraderWeb3UseCase$onExecute$1.I$3;
            int i4 = searchBotTraderWeb3UseCase$onExecute$1.I$2;
            int i5 = searchBotTraderWeb3UseCase$onExecute$1.I$1;
            int i6 = searchBotTraderWeb3UseCase$onExecute$1.I$0;
            qgv = (qGV) searchBotTraderWeb3UseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            r8 = i3;
            r9 = i4;
            r10 = i5;
            r11 = i6;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((SearchResultBotsTradersWeb3Po) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("SearchBotTraderWeb3UseCase", "searchBotsTradersWeb3 [cost: " + pairOLrzqt.getSecond() + "ms]");
        SearchResultBotsTradersWeb3Po searchResultBotsTradersWeb3Po = (SearchResultBotsTradersWeb3Po) pairOLrzqt.component1();
        boolean zBooleanValue = ((java.lang.Boolean) qgv.AEQbTJ.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue();
        if (searchResultBotsTradersWeb3Po == null) {
            return null;
        }
        java.util.List<SearchTrader> social = r10 != 0 ? searchResultBotsTradersWeb3Po.getSocial() : null;
        java.util.List<TradingStrategy> tradingBot = r11 != 0 ? searchResultBotsTradersWeb3Po.getTradingBot() : null;
        if (r9 == 0 || (defiCoins = searchResultBotsTradersWeb3Po.getDefiCoins()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : defiCoins) {
                DefiWebCoins defiWebCoins = (DefiWebCoins) obj;
                if (zBooleanValue || !Intrinsics.EZpvd(defiWebCoins.getCedefiSupport(), C56443yFo.KWHzl(true))) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return searchResultBotsTradersWeb3Po.copy(social, tradingBot, arrayList, qgv.AEQbTJ(searchResultBotsTradersWeb3Po) ? searchResultBotsTradersWeb3Po.getP2pAndDeposit() : null, searchResultBotsTradersWeb3Po.getCampaign(), searchResultBotsTradersWeb3Po.getAnnouncement(), r8 != 0 ? searchResultBotsTradersWeb3Po.getContent() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(SearchResultBotsTradersWeb3Po searchResultBotsTradersWeb3Po) {
        P2pAndDeposit p2pAndDeposit;
        if (this.KWHzl.AEQbTJ(OKComplianceRestrictionService.Feature.P2P)) {
            if (this.KWHzl.AEQbTJ(OKComplianceRestrictionService.Feature.DEPOSIT) || (p2pAndDeposit = searchResultBotsTradersWeb3Po.getP2pAndDeposit()) == null || !Intrinsics.EZpvd(p2pAndDeposit.getDepositRechargeable(), java.lang.Boolean.TRUE)) {
                return false;
            }
        } else {
            P2pAndDeposit p2pAndDeposit2 = searchResultBotsTradersWeb3Po.getP2pAndDeposit();
            if (Intrinsics.EZpvd((java.lang.Object) (p2pAndDeposit2 != null ? p2pAndDeposit2.getSupportP2P() : null), (java.lang.Object) "none")) {
            }
        }
        return true;
    }
}
