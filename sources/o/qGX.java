package o;

import androidx.camera.video.AudioStats;
import androidx.core.view.InputDeviceCompat;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.search.features.main.recommend.history.data.model.InvestCurrency;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.recommend.history.data.model.ProductType;
import com.okinc.market.search.features.main.recommend.history.data.model.Rate;
import com.okinc.market.search.features.main.result.ui.model.AnnouncementPo;
import com.okinc.market.search.features.main.result.ui.model.CampaignPo;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.market.search.features.main.root.domain.usecase.MainSearchUseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.MainSearchUseCase$onExecute$1;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGX extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, C40078qIn> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final qGN AEQbTJ;
    public final qGJ AYXKKw;
    public final InterfaceC54577xNn AhwBna;
    public final qGL EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final gKO copydefault;
    public final qGQ djBIcL;
    public final InterfaceC46557tYt gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC49400uno
    public /* synthetic */ java.lang.Object EZpvd(kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean> pair, Continuation<? super C40078qIn> continuation) {
        return AEQbTJ((kotlin.Pair<java.lang.String, java.lang.Boolean>) pair, continuation);
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<java.lang.String, java.lang.Boolean>) obj, (Continuation<? super C40078qIn>) continuation);
    }

    @yCM
    public qGX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qGN qgn, @NotNull qGQ qgq, @NotNull qGL qgl, @NotNull qGJ qgj, InterfaceC54577xNn interfaceC54577xNn, @NotNull gKO gko, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qgn, "");
        Intrinsics.checkNotNullParameter(qgq, "");
        Intrinsics.checkNotNullParameter(qgl, "");
        Intrinsics.checkNotNullParameter(qgj, "");
        Intrinsics.checkNotNullParameter(gko, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = qgn;
        this.djBIcL = qgq;
        this.EZpvd = qgl;
        this.AYXKKw = qgj;
        this.AhwBna = interfaceC54577xNn;
        this.copydefault = gko;
        this.gEmmrt = interfaceC46557tYt;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        MainSearchUseCase$invoke$1 mainSearchUseCase$invoke$1;
        long j;
        if (continuation instanceof MainSearchUseCase$invoke$1) {
            mainSearchUseCase$invoke$1 = (MainSearchUseCase$invoke$1) continuation;
            int i = mainSearchUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchUseCase$invoke$1 = new MainSearchUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = mainSearchUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            mainSearchUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            mainSearchUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(pair, mainSearchUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = mainSearchUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((C40078qIn) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "MainSearchUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        MainSearchUseCase$onExecute$1 mainSearchUseCase$onExecute$1;
        java.lang.String str;
        java.lang.String str2;
        qGX qgx;
        java.lang.String str3;
        java.util.List<C39994qFk> listEZpvd;
        java.util.List<C39994qFk> list;
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMapAEQbTJ;
        if (continuation instanceof MainSearchUseCase$onExecute$1) {
            mainSearchUseCase$onExecute$1 = (MainSearchUseCase$onExecute$1) continuation;
            int i = mainSearchUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchUseCase$onExecute$1 = new MainSearchUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = mainSearchUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strComponent1 = pair.component1();
            java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "do search [keyword: " + lowerCase + "]");
            qGN qgn = this.AEQbTJ;
            mainSearchUseCase$onExecute$1.L$0 = this;
            mainSearchUseCase$onExecute$1.L$1 = strComponent1;
            mainSearchUseCase$onExecute$1.L$2 = lowerCase;
            mainSearchUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = qgn.EZpvd(pair, mainSearchUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str = lowerCase;
            obj = objEZpvd;
            str2 = strComponent1;
            qgx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) mainSearchUseCase$onExecute$1.L$2;
            java.lang.String str4 = (java.lang.String) mainSearchUseCase$onExecute$1.L$1;
            qgx = (qGX) mainSearchUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str4;
        }
        qGI qgi = (qGI) obj;
        Triple<java.util.List<C54713xSo>, java.util.List<C54713xSo>, java.util.List<C54713xSo>> tripleEZpvd = qgi.EZpvd();
        java.util.List<Product> listCopydefault = qgi.copydefault();
        java.util.List<SearchTrader> listAEQbTJ = qgi.AEQbTJ();
        java.util.List<TradingStrategy> listKWHzl = qgi.KWHzl();
        java.util.List<DefiWebCoins> listAhwBna = qgi.AhwBna();
        P2pAndDeposit p2pAndDepositAYXKKw = qgi.AYXKKw();
        java.util.List<CampaignPo> listValueOf = qgi.valueOf();
        java.util.List<AnnouncementPo> listGEmmrt = qgi.gEmmrt();
        SearchResultContentPo searchResultContentPoDjBIcL = qgi.djBIcL();
        java.util.List<qGF> listOLrzqt = qgi.OLrzqt();
        java.util.List<C54713xSo> listComponent1 = tripleEZpvd.component1();
        java.util.List<C54713xSo> listComponent2 = tripleEZpvd.component2();
        java.util.List<C54713xSo> listComponent3 = tripleEZpvd.component3();
        if (listComponent1 != null) {
            str3 = "MainSearchUseCase";
            listEZpvd = qgx.EZpvd(listComponent1, "SPOT");
        } else {
            str3 = "MainSearchUseCase";
            listEZpvd = null;
        }
        java.util.List<C39994qFk> listEZpvd2 = listComponent2 != null ? qgx.EZpvd(listComponent2, "SWAP") : null;
        if (listComponent3 != null) {
            list = listEZpvd2;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent3, 10));
            java.util.Iterator<T> it = listComponent3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C54713xSo) it.next()).copydefault());
            }
            InterfaceC54577xNn interfaceC54577xNn = qgx.AhwBna;
            sortedMapAEQbTJ = qgx.AEQbTJ(arrayList, interfaceC54577xNn != null && interfaceC54577xNn.EZpvd());
        } else {
            list = listEZpvd2;
            sortedMapAEQbTJ = null;
        }
        C40078qIn c40078qIn = new C40078qIn(str2, null, listEZpvd, list, sortedMapAEQbTJ, listCopydefault != null ? qgx.AEQbTJ(listCopydefault) : null, listAEQbTJ != null ? qgx.EZpvd(listAEQbTJ) : null, listKWHzl != null ? qgx.KWHzl(listKWHzl) : null, listAhwBna != null ? qgx.AEQbTJ(listAhwBna, str) : null, p2pAndDepositAYXKKw != null ? qgx.copydefault(p2pAndDepositAYXKKw) : null, listValueOf != null ? qgx.OLrzqt(listValueOf) : null, listGEmmrt != null ? qgx.copydefault(listGEmmrt) : null, searchResultContentPoDjBIcL != null ? qgx.EZpvd.KWHzl(searchResultContentPoDjBIcL) : null, listOLrzqt != null ? qgx.AYXKKw.EZpvd(listOLrzqt) : null, null, InputDeviceCompat.SOURCE_STYLUS, null);
        C40375qTn.AEQbTJ.copydefault(str3, "main search result: " + c40078qIn);
        return c40078qIn;
    }

    private static final java.util.List<C40005qFv> EZpvd(java.util.List<OptionInstrument> list, boolean z) {
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C39995qFl> KWHzl(java.util.List<TradingStrategy> list) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String tradeSymbol;
        InterfaceC54577xNn interfaceC54577xNn = this.AhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = interfaceC54577xNn != null ? interfaceC54577xNn.OLrzqt() : null;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TradingStrategy tradingStrategy : list) {
            java.lang.String icon = tradingStrategy.getIcon();
            if (icon == null) {
                java.lang.String strOLrzqt = qGH.OLrzqt(java.lang.Integer.valueOf(C33129mqd.AhwBna(tradingStrategy.getBizType())));
                if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strOLrzqt)) == null) {
                    icon = null;
                } else {
                    java.lang.String instName = tradingStrategy.getInstName();
                    if (instName == null) {
                        instName = "";
                    }
                    BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instName);
                    if (bizInstrumentValueOf != null && (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) != null) {
                        icon = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol);
                    }
                }
            } else {
                if (icon.length() <= 0) {
                    icon = null;
                }
                if (icon == null) {
                }
            }
            arrayList.add(new C39995qFl(tradingStrategy, icon == null ? "" : icon, qGH.bizInstName$default(tradingStrategy, null, 1, null), qGH.OLrzqt(tradingStrategy), pTF.KWHzl.AEQbTJ(pTB.formatPercentWithSymbol$default(C33129mqd.EZpvd(tradingStrategy.getApy()), 0, 0, null, null, 15, null)), UpDownColor.Companion.AEQbTJ(tradingStrategy.getApy()), C33129mqd.OLrzqt((java.lang.CharSequence) tradingStrategy.getApy())));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toBotVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    public final java.lang.String OLrzqt(DefiWebCoins defiWebCoins) {
        int iEZpvd = this.gEmmrt.EZpvd();
        if (iEZpvd == 1) {
            return defiWebCoins.getPriceChangeUtc0();
        }
        if (iEZpvd == 2) {
            return defiWebCoins.getPriceChangeUtc8();
        }
        return defiWebCoins.getPriceChange24H();
    }

    public final C40009qFz copydefault(P2pAndDeposit p2pAndDeposit) {
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
        InterfaceC54577xNn interfaceC54577xNn = this.AhwBna;
        boolean z = false;
        if (interfaceC54577xNn != null && interfaceC54577xNn.EZpvd()) {
            return new C40009qFz(new P2pAndDeposit(), false, false);
        }
        boolean z2 = (Intrinsics.EZpvd((java.lang.Object) p2pAndDeposit.getSupportP2P(), (java.lang.Object) "none") || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.P2P)) ? false : true;
        if (Intrinsics.EZpvd(p2pAndDeposit.getDepositRechargeable(), java.lang.Boolean.TRUE) && !oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.DEPOSIT)) {
            z = true;
        }
        return new C40009qFz(p2pAndDeposit, z2, z);
    }

    private final java.util.List<C39994qFk> EZpvd(java.util.List<C54713xSo> list, java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C54713xSo c54713xSo : list) {
            C39994qFk c39994qFk = (C39994qFk) this.djBIcL.copydefault((java.lang.Object) c54713xSo.copydefault());
            c39994qFk.copydefault(false);
            c39994qFk.OLrzqt(false);
            c39994qFk.EZpvd(c54713xSo.AEQbTJ() / 100.0f);
            arrayList.add(c39994qFk);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toCoinVoList [cost: " + pairOLrzqt.getSecond() + "ms, bizType: " + str + "]");
        return (java.util.List) pairOLrzqt.component1();
    }

    private final SortedMap<java.lang.Long, java.util.List<C40005qFv>> AEQbTJ(java.util.List<? extends BizInstrument> list, boolean z) {
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
            treeMap.put(java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) entry.getKey())), EZpvd((java.util.List<OptionInstrument>) entry.getValue(), z));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(treeMap, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toOptionsVoMap [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (TreeMap) pairOLrzqt.component1();
    }

    public final java.util.List<C39996qFm> AEQbTJ(java.util.List<Product> list) {
        java.lang.String currencyIcon;
        java.lang.String strEZpvd;
        java.lang.String name;
        java.lang.String currencyName;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (Product product : list) {
            InvestCurrency investCurrency = product.getInvestCurrency();
            if (investCurrency == null || (currencyIcon = investCurrency.getCurrencyIcon()) == null) {
                currencyIcon = "";
            }
            java.lang.String str = currencyIcon;
            InvestCurrency investCurrency2 = product.getInvestCurrency();
            java.lang.String str2 = (investCurrency2 == null || (currencyName = investCurrency2.getCurrencyName()) == null) ? "--" : currencyName;
            ProductType productType = product.getProductType();
            java.lang.String str3 = (productType == null || (name = productType.getName()) == null) ? "--" : name;
            Rate rate = product.getRate();
            arrayList.add(new C39996qFm(product, str, str2, str3, (rate == null || (strEZpvd = qIP.EZpvd(rate)) == null) ? "--" : strEZpvd));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toEarnVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    public final java.util.List<C40006qFw> EZpvd(java.util.List<SearchTrader> list) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SearchTrader searchTrader : list) {
            arrayList.add(new C40006qFw(searchTrader, searchTrader.getHeadPicture(), searchTrader.getDefaultHeadPictureId(), qGG.OLrzqt(searchTrader), "$" + pTB.formatDownToFixed$default(C33129mqd.EZpvd(searchTrader.getAum()), 2, null, 2, null), (Intrinsics.EZpvd((java.lang.Object) searchTrader.getType(), (java.lang.Object) "5") || Intrinsics.EZpvd((java.lang.Object) searchTrader.getType(), (java.lang.Object) OrderDetailListItem.SLIP_OUT)) ? false : true));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toTraderVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C39999qFp> AEQbTJ(java.util.List<DefiWebCoins> list, java.lang.String str) {
        java.lang.String tokenContractAddress;
        java.lang.String str2;
        java.lang.String strEZpvd;
        java.lang.String strValueOf;
        qGX qgx = this;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DefiWebCoins defiWebCoins : list) {
            java.lang.String tokenContractAddress2 = defiWebCoins.getTokenContractAddress();
            if (tokenContractAddress2 != null && tokenContractAddress2.length() > 8) {
                java.lang.String tokenContractAddress3 = defiWebCoins.getTokenContractAddress();
                java.lang.String strAkhnZx = tokenContractAddress3 != null ? C59454zhO.AkhnZx(tokenContractAddress3, 4) : null;
                java.lang.String tokenContractAddress4 = defiWebCoins.getTokenContractAddress();
                tokenContractAddress = strAkhnZx + "..." + (tokenContractAddress4 != null ? C59454zhO.isConnected(tokenContractAddress4, 4) : null);
            } else {
                tokenContractAddress = defiWebCoins.getTokenContractAddress();
            }
            java.lang.String price = defiWebCoins.getPrice();
            if (price == null) {
                str2 = "--";
            } else {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) price)) {
                    price = null;
                }
                if (price != null && (strValueOf = qgx.copydefault.valueOf(price)) != null) {
                    str2 = strValueOf;
                }
            }
            java.lang.String strOLrzqt = qgx.OLrzqt(defiWebCoins);
            java.lang.String str3 = C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) ? strOLrzqt : null;
            java.lang.String str4 = (str3 == null || (strEZpvd = qgx.copydefault.EZpvd(str3, 2, false)) == null) ? "--" : strEZpvd;
            java.lang.String liquidity = defiWebCoins.getLiquidity();
            java.lang.String strAYXKKw = liquidity != null ? qgx.copydefault.AYXKKw(liquidity) : null;
            java.lang.String str5 = C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPdIKEqB) + " " + strAYXKKw;
            java.lang.String turnOver24 = defiWebCoins.getTurnOver24();
            java.lang.String strAYXKKw2 = turnOver24 != null ? qgx.copydefault.AYXKKw(turnOver24) : null;
            java.lang.String str6 = C33070mpX.AYXKKw(qZH.PendingIntent.QSAYLr) + " " + strAYXKKw2;
            java.lang.String str7 = str5 + "  |  " + str6;
            java.lang.String tokenSymbol = defiWebCoins.getTokenSymbol();
            java.lang.String str8 = tokenSymbol == null ? "" : tokenSymbol;
            java.lang.String tokenLogo = defiWebCoins.getTokenLogo();
            java.lang.String chainLogo = defiWebCoins.getChainLogo();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(strOLrzqt);
            C54704xSf c54704xSf = C54704xSf.OLrzqt;
            java.lang.String tokenSymbol2 = defiWebCoins.getTokenSymbol();
            java.lang.String str9 = tokenSymbol2 == null ? "" : tokenSymbol2;
            java.lang.String tokenName = defiWebCoins.getTokenName();
            arrayList.add(new C39999qFp(defiWebCoins, tokenLogo, chainLogo, str8, tokenContractAddress, str5, str6, str7, str2, str4, upDownColorAEQbTJ, 0, (float) C54704xSf.calFuzzyRatio$default(c54704xSf, str, str9, tokenName == null ? "" : tokenName, AudioStats.AUDIO_AMPLITUDE_NONE, 8, null), 2048, null));
            qgx = this;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toBotVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    public final java.util.List<C39992qFi> OLrzqt(java.util.List<CampaignPo> list) {
        java.lang.String simpleDateTime$default;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CampaignPo campaignPo : list) {
            java.lang.Long openDate = campaignPo.getOpenDate();
            if (openDate == null || (simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(openDate.longValue()), null, 1, null)) == null) {
                simpleDateTime$default = "--";
            }
            arrayList.add(new C39992qFi(campaignPo, simpleDateTime$default));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toCampaignVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }

    public final java.util.List<C39993qFj> copydefault(java.util.List<AnnouncementPo> list) {
        java.lang.String simpleDateTime$default;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AnnouncementPo announcementPo : list) {
            java.lang.Long publishDate = announcementPo.getPublishDate();
            if (publishDate == null || (simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(publishDate.longValue()), null, 1, null)) == null) {
                simpleDateTime$default = "--";
            }
            arrayList.add(new C39993qFj(announcementPo, simpleDateTime$default));
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        C40375qTn.AEQbTJ.copydefault("MainSearchUseCase", "toAnnouncementVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt.component1();
    }
}
