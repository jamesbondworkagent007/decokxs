package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletTickerSubManager;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46550tYm;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20814gnw extends AbstractC20809gnr {
    public WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> AkhnZx;
    public java.lang.String AYXKKw = "0";
    public java.lang.String fetchVPNInfo = "0";
    public final C13934dbu isConnected = new C13934dbu();
    public final java.util.HashMap<java.lang.Long, WalletTickerManager.CoinPrice> values = new java.util.HashMap<>();
    public WalletCurrencyBean DbNXlk = C54864xYd.AEQbTJ.copydefault();
    public boolean gEmmrt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public void AEQbTJ(@NotNull WalletCurrencyBean walletCurrencyBean) {
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        this.DbNXlk = walletCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public java.lang.String AuCTel() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public boolean AuCTelauCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public void copydefault(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public java.lang.String fARcdN() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20809gnr
    public void valueOf(java.lang.String str) {
        if (str == null) {
            str = "0";
        }
        this.fetchVPNInfo = str;
    }

    @Override // o.AbstractC20809gnr
    public int values() {
        return 2;
    }

    @Override // o.AbstractC20809gnr
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        C10854bwM c10854bwMValueOf = valueOf();
        if (c10854bwMValueOf == null) {
            return;
        }
        java.util.List<C10854bwM> listEZpvd = C56402yEa.EZpvd(c10854bwMValueOf);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (C10854bwM c10854bwM : listEZpvd) {
            arrayList.add(new WalletTickerSubManager.TaskDescription(c10854bwM.fetchVPNInfo(), c10854bwM.OLrzqt()));
        }
        this.AkhnZx = new TaskDescription(arrayList, this);
        WalletTickerSubManager walletTickerSubManagerGHZMYf = C11205cFp.EZpvd.gHZMYf();
        WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> application = this.AkhnZx;
        Intrinsics.copydefault(application);
        walletTickerSubManagerGHZMYf.copydefault(application);
    }

    /* JADX INFO: renamed from: o.gnw$TaskDescription */
    public static final class TaskDescription extends WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> {
        public final /* synthetic */ C20814gnw copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.util.List<WalletTickerSubManager.TaskDescription> list, C20814gnw c20814gnw) {
            super("subTicker-receiveCoin", null, list, 2, null);
            this.copydefault = c20814gnw;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTickerSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C20814gnw c20814gnw = this.copydefault;
            for (WalletTickerSubManager.SubResponse subResponse : list) {
                long jValueOf = C33129mqd.valueOf(subResponse.getCoinId());
                java.util.HashMap map = c20814gnw.values;
                java.lang.String price = subResponse.getPrice();
                boolean z = price == null || price.length() == 0;
                java.lang.String price2 = subResponse.getPrice();
                if (price2 == null) {
                    price2 = "";
                }
                java.lang.Boolean hasPercent = subResponse.getHasPercent();
                boolean zBooleanValue = hasPercent != null ? hasPercent.booleanValue() : false;
                java.lang.String priceChangePercent24h = subResponse.getPriceChangePercent24h();
                if (priceChangePercent24h == null) {
                    priceChangePercent24h = "";
                }
                map.put(java.lang.Long.valueOf(jValueOf), new WalletTickerManager.CoinPrice(jValueOf, !z, price2, zBooleanValue, priceChangePercent24h, false));
            }
        }
    }

    @Override // o.AbstractC20809gnr
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TransactionInfo transactionInfo, @NotNull java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, int i2, @NotNull java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.Integer num, java.lang.Long l, java.lang.String str11, boolean z, java.util.ArrayList<java.lang.Integer> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        InterfaceC58217yxC interfaceC58217yxCAkhnZx = AkhnZx();
        if (interfaceC58217yxCAkhnZx != null) {
            interfaceC58217yxCAkhnZx.dispose();
        }
        AYXKKw(str);
        copydefault(str2);
        copydefault(transactionInfo);
        OLrzqt(arrayList);
        copydefault(true ^ (transactionInfo != null && transactionInfo.hasCurrency()));
        AbstractC58185ywX<C20863gos> abstractC58185ywXAhwBna = AhwBna(transactionInfo != null ? transactionInfo.getCurrency() : null);
        final Function1 function1 = new Function1() { // from class: o.gnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.copydefault(this.EZpvd, (C20863gos) obj);
            }
        };
        InterfaceC58227yxM<? super C20863gos> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20814gnw.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        EZpvd(abstractC58185ywXAhwBna.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20814gnw.AhwBna(function12, obj);
            }
        }));
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20814gnw c20814gnw, C20863gos c20863gos) {
        c20814gnw.ejfBZ().setValue(c20863gos);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20814gnw c20814gnw, java.lang.Throwable th) {
        MutableLiveData<C20863gos> mutableLiveDataEjfBZ = c20814gnw.ejfBZ();
        C20863gos c20863gos = new C20863gos();
        c20863gos.KWHzl(null);
        c20863gos.OLrzqt(th.getMessage());
        c20863gos.EZpvd(true);
        mutableLiveDataEjfBZ.setValue(c20863gos);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20809gnr
    public void EZpvd(java.lang.String str) {
        if (str == null) {
            str = "0";
        }
        this.AYXKKw = str;
        AEQbTJ(3, false, -1);
    }

    @Override // o.AbstractC20809gnr
    public int fetchVPNInfo() {
        C10854bwM c10854bwMValueOf = valueOf();
        if (c10854bwMValueOf != null) {
            return c10854bwMValueOf.DTwDnp();
        }
        return 0;
    }

    public java.lang.String wlaJM() {
        return this.DbNXlk.getSign();
    }

    @Override // o.AbstractC20809gnr
    public boolean iwGUEr() {
        WalletTickerManager.CoinPrice coinPriceAubY = AubY();
        return coinPriceAubY != null && coinPriceAubY.getHasPrice();
    }

    public WalletTickerManager.CoinPrice AubY() {
        return this.values.get(java.lang.Long.valueOf(C33129mqd.valueOf(djBIcL())));
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String isConnected() {
        WalletTickerManager.CoinPrice coinPriceAubY = AubY();
        if (coinPriceAubY != null) {
            return coinPriceAubY.getRealPrice();
        }
        return null;
    }

    @Override // o.AbstractC20809gnr
    public java.lang.Double getFieldNames() {
        return java.lang.Double.valueOf(this.DbNXlk.getUsdToThisRate());
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String DbNXlk() {
        return this.DbNXlk.getIsoCode();
    }

    @Override // o.AbstractC20809gnr
    public C10854bwM valueOf() {
        return C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(C33129mqd.valueOf(djBIcL())), true);
    }

    public static final C10854bwM isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10854bwM) function1.invoke(obj);
    }

    public final AbstractC58185ywX<C20863gos> AhwBna(final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.gnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEnsureInitialized$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20814gnw.isConnected(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.KWHzl(this.AEQbTJ, str, (C10854bwM) obj);
            }
        };
        AbstractC58185ywX<C20863gos> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.gnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20814gnw.fetchVPNInfo(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final C10854bwM KWHzl(C20814gnw c20814gnw, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c20814gnw.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final C20814gnw c20814gnw, java.lang.String str, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = c20814gnw.copydefault(c10854bwM);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXDjBIcL = c20814gnw.djBIcL(str);
        final Function2 function2 = new Function2() { // from class: o.gnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20814gnw.copydefault(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXCopydefault, abstractC58185ywXDjBIcL, new InterfaceC58223yxI() { // from class: o.gnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C20814gnw.copydefault(function2, obj, obj2);
            }
        });
    }

    public static final C20863gos copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (C20863gos) function2.invoke(obj, obj2);
    }

    public static final C20863gos copydefault(C20814gnw c20814gnw, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        C20863gos c20863gos = new C20863gos();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            if (pair2.getSecond() != null) {
                java.lang.Object second = pair2.getSecond();
                Intrinsics.copydefault(second);
                c20814gnw.AEQbTJ((WalletCurrencyBean) second);
            }
        } else if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c20863gos.EZpvd(true);
            c20863gos.OLrzqt((java.lang.String) pair.getSecond());
        } else if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            c20863gos.EZpvd(true);
            c20863gos.OLrzqt("Currency bean is null");
        } else {
            c20863gos.EZpvd(true);
            c20863gos.OLrzqt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
        return c20863gos;
    }

    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(C10854bwM c10854bwM) {
        AbstractC58185ywX<ResponseData<java.util.List<CoinPrice>>> abstractC58185ywXCopydefault = this.isConnected.copydefault(C56402yEa.EZpvd(java.lang.Long.valueOf(c10854bwM.AhwBna())), (java.util.List<java.lang.Long>) null);
        final Function1 function1 = new Function1() { // from class: o.gnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20814gnw.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> djBIcL(final java.lang.String str) {
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(InterfaceC46550tYm.ActionBar.getCurrencyList$default((InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class), false, 1, null), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.gnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20814gnw.OLrzqt(str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl2 = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.gnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20814gnw.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC20809gnr
    public void AhwBna() {
        super.AhwBna();
        WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> application = this.AkhnZx;
        if (application != null) {
            C11205cFp.EZpvd.gHZMYf().OLrzqt(application);
        }
    }

    public static final kotlin.Pair copydefault(C20814gnw c20814gnw, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<CoinPrice> list = (java.util.List) responseData.getData();
            if (list != null) {
                for (CoinPrice coinPrice : list) {
                    java.util.HashMap<java.lang.Long, WalletTickerManager.CoinPrice> map = c20814gnw.values;
                    long coinId = coinPrice.getCoinId();
                    long coinId2 = coinPrice.getCoinId();
                    boolean hasPrice = coinPrice.getHasPrice();
                    java.lang.String price = coinPrice.getPrice();
                    java.lang.String str = price == null ? "" : price;
                    boolean hasPercent = coinPrice.getHasPercent();
                    java.lang.String priceChangePercent24h = coinPrice.getPriceChangePercent24h();
                    map.put(java.lang.Long.valueOf(coinId), new WalletTickerManager.CoinPrice(coinId2, hasPrice, str, hasPercent, priceChangePercent24h == null ? "" : priceChangePercent24h, coinPrice.isAnchoredCoin()));
                }
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.Object next;
        java.lang.String symbol;
        java.lang.String isoCode;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.String isoCode2 = ((ValuationCurrencyBean) next).getIsoCode();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = isoCode2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2)) {
                break;
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(valuationCurrencyBean != null), new WalletCurrencyBean((valuationCurrencyBean == null || (isoCode = valuationCurrencyBean.getIsoCode()) == null) ? str : isoCode, (valuationCurrencyBean == null || (symbol = valuationCurrencyBean.getSymbol()) == null) ? "" : symbol, valuationCurrencyBean != null ? valuationCurrencyBean.getUsdToThisRate() : 1.0d, valuationCurrencyBean != null ? valuationCurrencyBean.getPrecision() : 2, 12)));
    }
}
