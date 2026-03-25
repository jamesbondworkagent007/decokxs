package o;

import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.biz.core.ws.channel.WalletTickerSubManager;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC12793ctg;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.cqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12623cqV implements InterfaceC12793ctg {
    public CoinPrice AEQbTJ;
    public C10854bwM AYXKKw;
    public C10854bwM OLrzqt;
    public C10854bwM djBIcL;
    public CoinPrice gEmmrt;
    public CoinPrice valueOf;
    public WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> values;
    public final C13934dbu AhwBna = new C13934dbu();
    public java.util.HashMap<java.lang.Long, C10854bwM> EZpvd = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.Long, CoinPrice> KWHzl = new java.util.HashMap<>();
    public java.util.ArrayList<Activity> AkhnZx = new java.util.ArrayList<>();
    public WalletCurrencyBean copydefault = C54864xYd.AEQbTJ.copydefault();

    /* JADX INFO: renamed from: o.cqV$Activity */
    public static abstract class Activity {
        public abstract void OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull WalletCurrencyBean walletCurrencyBean) {
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        this.copydefault = walletCurrencyBean;
    }

    public final java.lang.String AEQbTJ() {
        C10854bwM c10854bwM = this.AYXKKw;
        if (c10854bwM != null) {
            return c10854bwM.fJNWhG();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cqV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX loadWithCoinMeta$default(C12623cqV c12623cqV, C10854bwM c10854bwM, C10854bwM c10854bwM2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return c12623cqV.copydefault(c10854bwM, c10854bwM2, (java.util.List<C10854bwM>) list);
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull final C10854bwM c10854bwM, final C10854bwM c10854bwM2, java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        this.AYXKKw = c10854bwM;
        this.OLrzqt = c10854bwM.KWHzl();
        this.djBIcL = c10854bwM2;
        this.EZpvd.clear();
        this.EZpvd.put(java.lang.Long.valueOf(c10854bwM.AhwBna()), c10854bwM);
        if (c10854bwM2 != null) {
            this.EZpvd.put(java.lang.Long.valueOf(c10854bwM2.AhwBna()), c10854bwM2);
        }
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null) {
            this.EZpvd.put(java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()), c10854bwMKWHzl);
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            Intrinsics.copydefault(list);
            for (C10854bwM c10854bwM3 : list) {
                this.EZpvd.put(java.lang.Long.valueOf(c10854bwM3.AhwBna()), c10854bwM3);
            }
        }
        if (c10854bwM.DarRvM()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.util.Set<java.lang.Long> setKeySet = this.EZpvd.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        AbstractC58185ywX<ResponseData<java.util.List<CoinPrice>>> abstractC58185ywXCopydefault = this.AhwBna.copydefault(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setKeySet), (java.util.List<java.lang.Long>) null);
        final Function1 function1 = new Function1() { // from class: o.cqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12623cqV.OLrzqt(this.EZpvd, c10854bwM, c10854bwM2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12623cqV.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final void valueOf() {
        java.util.Collection<C10854bwM> collectionValues = this.EZpvd.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Collection<C10854bwM> collection = collectionValues;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        for (C10854bwM c10854bwM : collection) {
            arrayList.add(new WalletTickerSubManager.TaskDescription(c10854bwM.fetchVPNInfo(), c10854bwM.OLrzqt()));
        }
        this.values = new Application(arrayList, this);
    }

    /* JADX INFO: renamed from: o.cqV$Application */
    public static final class Application extends WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> {
        public final /* synthetic */ C12623cqV copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.util.List<WalletTickerSubManager.TaskDescription> list, C12623cqV c12623cqV) {
            super("subTicker-sendCoin", null, list, 2, null);
            this.copydefault = c12623cqV;
        }

        public final void OLrzqt(CoinPrice coinPrice, WalletTickerSubManager.SubResponse subResponse) {
            if (coinPrice == null) {
                return;
            }
            coinPrice.setPrice(subResponse.getPrice());
            coinPrice.setHasPrice(true);
            coinPrice.setPriceChangePercent24h(subResponse.getPriceChangePercent24h());
            java.util.Iterator it = this.copydefault.AkhnZx.iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).OLrzqt();
            }
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTickerSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C12623cqV c12623cqV = this.copydefault;
            for (WalletTickerSubManager.SubResponse subResponse : list) {
                long jValueOf = C33129mqd.valueOf(subResponse.getCoinId());
                C10854bwM c10854bwM = c12623cqV.AYXKKw;
                if (c10854bwM != null && jValueOf == c10854bwM.AhwBna()) {
                    OLrzqt(c12623cqV.gEmmrt, subResponse);
                }
                C10854bwM c10854bwM2 = c12623cqV.OLrzqt;
                if (c10854bwM2 != null && jValueOf == c10854bwM2.AhwBna()) {
                    OLrzqt(c12623cqV.AEQbTJ, subResponse);
                }
                C10854bwM c10854bwM3 = c12623cqV.djBIcL;
                if (c10854bwM3 != null && jValueOf == c10854bwM3.AhwBna()) {
                    OLrzqt(c12623cqV.valueOf, subResponse);
                }
                OLrzqt((CoinPrice) c12623cqV.KWHzl.get(java.lang.Long.valueOf(jValueOf)), subResponse);
            }
        }
    }

    public final void AhwBna() {
        if (this.values == null) {
            return;
        }
        WalletTickerSubManager walletTickerSubManagerGHZMYf = C11205cFp.EZpvd.gHZMYf();
        WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> application = this.values;
        Intrinsics.copydefault(application);
        walletTickerSubManagerGHZMYf.copydefault(application);
    }

    public final void gEmmrt() {
        if (this.values == null) {
            return;
        }
        WalletTickerSubManager walletTickerSubManagerGHZMYf = C11205cFp.EZpvd.gHZMYf();
        WalletWSBaseArgsChannel.Application<WalletTickerSubManager.TaskDescription, WalletTickerSubManager.SubResponse> application = this.values;
        Intrinsics.copydefault(application);
        walletTickerSubManagerGHZMYf.OLrzqt(application);
    }

    public final void KWHzl(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AkhnZx.add(activity);
    }

    public final void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AkhnZx.remove(activity);
    }

    public final java.lang.String copydefault() {
        return this.copydefault.getIsoCode();
    }

    public final java.lang.String EZpvd() {
        return this.copydefault.getSign();
    }

    public final int OLrzqt() {
        C10854bwM c10854bwM = this.AYXKKw;
        if (c10854bwM != null) {
            return c10854bwM.DTwDnp();
        }
        return 0;
    }

    public final int KWHzl() {
        return this.copydefault.getMinPrecision();
    }

    public final boolean AYXKKw() {
        CoinPrice coinPrice = this.gEmmrt;
        return coinPrice != null && coinPrice.getHasPrice();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strDivS$default = C33129mqd.divS$default(str, java.lang.Double.valueOf(this.copydefault.getUsdToThisRate()), null, null, null, 14, null);
        CoinPrice coinPrice = this.gEmmrt;
        return C33129mqd.divS$default(strDivS$default, coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CoinPrice coinPrice = this.gEmmrt;
        return C33129mqd.mulS$default(C33129mqd.mulS$default(str, coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null), java.lang.Double.valueOf(this.copydefault.getUsdToThisRate()), null, null, null, 14, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.KWHzl(pTB.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, false, java.lang.Integer.valueOf(this.copydefault.getMinPrecision()));
    }

    public static /* synthetic */ java.lang.String displayCoinAmount$default(C12623cqV c12623cqV, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c12623cqV.AEQbTJ(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.AYXKKw;
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, c10854bwM != null ? c10854bwM.DTwDnp() : 0, str2, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static /* synthetic */ java.lang.String feeCurrencyAmount$default(C12623cqV c12623cqV, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        return c12623cqV.EZpvd(str, z, z2, z3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        java.lang.String strConvertChainAmountToCoinAmount$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (z3) {
            C10854bwM c10854bwM = this.djBIcL;
            strConvertChainAmountToCoinAmount$default = InterfaceC12793ctg.ActionBar.convertChainAmountToCoinAmount$default(this, str, c10854bwM != null ? c10854bwM.AhwBna() : -1L, false, 4, null);
        } else {
            strConvertChainAmountToCoinAmount$default = str;
        }
        C10854bwM c10854bwM2 = this.djBIcL;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(strConvertChainAmountToCoinAmount$default, c10854bwM2 != null ? c10854bwM2.valueOf() : 0);
        CoinPrice coinPrice = this.valueOf;
        java.lang.String strMulS$default = C33129mqd.mulS$default(strAEQbTJ, coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null);
        return z ? C54880xYt.formatValuationFromFee$default(strMulS$default, this.copydefault, z2, false, 4, null) : strMulS$default;
    }

    public static /* synthetic */ java.lang.String feeCurrencyAmountWithSignAndComparisonSymbol$default(C12623cqV c12623cqV, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12623cqV.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strFeeCurrencyAmount$default = feeCurrencyAmount$default(this, str, false, false, z, 6, null);
        if (C59449zhJ.startsWith$default(strFeeCurrencyAmount$default, "<", false, 2, null)) {
            return C59449zhJ.replaceFirst$default(strFeeCurrencyAmount$default, "<", "< ", false, 4, (java.lang.Object) null);
        }
        return "≈ " + strFeeCurrencyAmount$default;
    }

    public static /* synthetic */ java.lang.String displayFeeValueWithFeeAmount$default(C12623cqV c12623cqV, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return c12623cqV.OLrzqt(str, z, z2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2) {
        int iValueOf;
        int i;
        C10854bwM c10854bwM;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strFJNWhG = (!z || (c10854bwM = this.djBIcL) == null) ? null : c10854bwM.fJNWhG();
        C10854bwM c10854bwM2 = this.djBIcL;
        int iValueOf2 = c10854bwM2 != null ? c10854bwM2.valueOf() : 0;
        C10854bwM c10854bwM3 = this.djBIcL;
        if (z2) {
            if (c10854bwM3 != null) {
                iValueOf = c10854bwM3.fZBcTu();
                i = iValueOf;
            }
            i = 0;
        } else {
            if (c10854bwM3 != null) {
                iValueOf = c10854bwM3.valueOf();
                i = iValueOf;
            }
            i = 0;
        }
        return C54870xYj.KWHzl(str, iValueOf2, i, strFJNWhG, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String OLrzqt(C12623cqV c12623cqV, java.lang.String str) {
        C10854bwM c10854bwM = c12623cqV.OLrzqt;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwM != null ? c10854bwM.valueOf() : 0);
        CoinPrice coinPrice = c12623cqV.AEQbTJ;
        return C54880xYt.formatValuationFromFee$default(C33129mqd.mulS$default(strAEQbTJ, coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null), c12623cqV.copydefault, false, false, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[PHI: r9
  0x0019: PHI (r9v1 java.lang.Long) = (r9v0 java.lang.Long), (r9v6 java.lang.Long) binds: [B:3:0x0006, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC12793ctg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, java.lang.Long l) {
        long jLongValue;
        java.lang.String strReplaceFirst$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            C10854bwM c10854bwM = this.djBIcL;
            l = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null;
            jLongValue = l != null ? l.longValue() : 0L;
        }
        java.lang.String strCopydefault = copydefault(str, jLongValue, true);
        java.lang.String strOLrzqt = OLrzqt(this, str);
        if (C59449zhJ.startsWith$default(strOLrzqt, "<", false, 2, null)) {
            strReplaceFirst$default = C59449zhJ.replaceFirst$default(strOLrzqt, "<", "< ", false, 4, (java.lang.Object) null);
        } else {
            strReplaceFirst$default = "≈ " + strOLrzqt;
        }
        return C56390yDp.OLrzqt(strCopydefault, strReplaceFirst$default);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.OLrzqt;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwM != null ? c10854bwM.valueOf() : 0);
        CoinPrice coinPrice = this.AEQbTJ;
        return C33129mqd.mulS$default(strAEQbTJ, coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null);
    }

    @Override // o.InterfaceC12793ctg
    public java.lang.String copydefault(@NotNull java.lang.String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.OLrzqt;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwM != null ? c10854bwM.valueOf() : 0);
        C10854bwM c10854bwM2 = this.OLrzqt;
        if (c10854bwM2 == null || j != c10854bwM2.AhwBna()) {
            CoinPrice coinPrice = this.KWHzl.get(java.lang.Long.valueOf(j));
            CoinPrice coinPrice2 = this.AEQbTJ;
            strAEQbTJ = C33129mqd.divS$default(C33129mqd.mulS$default(strAEQbTJ, coinPrice2 != null ? coinPrice2.getRealPrice() : null, null, null, null, 14, null), coinPrice != null ? coinPrice.getRealPrice() : null, null, null, null, 14, null);
        }
        java.lang.String str2 = strAEQbTJ;
        C10854bwM c10854bwM3 = this.EZpvd.get(java.lang.Long.valueOf(j));
        if (z) {
            return C54870xYj.formatCoinFromFee$default(str2, c10854bwM3 != null ? c10854bwM3.DTwDnp() : 0, null, null, false, null, false, 60, null);
        }
        return C54870xYj.KWHzl(str2, c10854bwM3 != null ? c10854bwM3.valueOf() : 0);
    }

    public static final kotlin.Pair OLrzqt(C12623cqV c12623cqV, C10854bwM c10854bwM, C10854bwM c10854bwM2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c12623cqV.KWHzl.clear();
            java.util.List<CoinPrice> list = (java.util.List) responseData.getData();
            if (list != null) {
                for (CoinPrice coinPrice : list) {
                    if (coinPrice.getCoinId() == c10854bwM.AhwBna()) {
                        c12623cqV.gEmmrt = coinPrice;
                    }
                    C10854bwM c10854bwM3 = c12623cqV.OLrzqt;
                    if (c10854bwM3 != null && coinPrice.getCoinId() == c10854bwM3.AhwBna()) {
                        c12623cqV.AEQbTJ = coinPrice;
                    }
                    if (c10854bwM2 != null && coinPrice.getCoinId() == c10854bwM2.AhwBna()) {
                        c12623cqV.valueOf = coinPrice;
                    }
                    c12623cqV.KWHzl.put(java.lang.Long.valueOf(coinPrice.getCoinId()), coinPrice);
                }
            }
            c12623cqV.valueOf();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
