package o;

import com.okinc.business.defi.biz.net.bean.MarketDetail;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC12793ctg;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.ctr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12804ctr implements InterfaceC12793ctg {
    public MarketDetail AEQbTJ;
    public C10854bwM AhwBna;
    public C10854bwM KWHzl;
    public MarketDetail gEmmrt;
    public C13934dbu valueOf = new C13934dbu();
    public TreeMap<java.lang.Long, C10854bwM> copydefault = new TreeMap<>();
    public java.util.Map<java.lang.Long, MarketDetail> EZpvd = new LinkedHashMap();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ctu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12804ctr.copydefault();
        }
    });

    public final InterfaceC57023yab EZpvd() {
        return (InterfaceC57023yab) this.OLrzqt.getValue();
    }

    public static final InterfaceC57023yab copydefault() {
        return (InterfaceC57023yab) C43251rlk.OLrzqt(InterfaceC57023yab.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ctr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX init$default(C12804ctr c12804ctr, C10854bwM c10854bwM, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return c12804ctr.AEQbTJ(c10854bwM, (java.util.List<C10854bwM>) list);
    }

    /* JADX DEBUG: Type inference failed for r5v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(C10854bwM c10854bwM, java.util.List<C10854bwM> list) {
        java.lang.String strAYXKKw;
        this.KWHzl = c10854bwM;
        this.AhwBna = c10854bwM;
        this.copydefault.clear();
        if (c10854bwM != null) {
            this.copydefault.put(java.lang.Long.valueOf(c10854bwM.AhwBna()), c10854bwM);
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            Intrinsics.copydefault(list);
            for (C10854bwM c10854bwM2 : list) {
                this.copydefault.put(java.lang.Long.valueOf(c10854bwM2.AhwBna()), c10854bwM2);
            }
        }
        if (c10854bwM != null && c10854bwM.DarRvM()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.util.Set<java.lang.Long> setKeySet = this.copydefault.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        java.util.List<java.lang.Long> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setKeySet);
        C13934dbu c13934dbu = this.valueOf;
        InterfaceC57023yab interfaceC57023yabEZpvd = EZpvd();
        if (interfaceC57023yabEZpvd == null || (strAYXKKw = interfaceC57023yabEZpvd.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        AbstractC58185ywX<ResponseData<java.util.List<MarketDetail>>> abstractC58185ywXKWHzl2 = c13934dbu.KWHzl(strAYXKKw, listAxsJAYsNCnLh);
        final Function1 function1 = new Function1() { // from class: o.cts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12804ctr.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ctw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12804ctr.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final long KWHzl() {
        C10854bwM c10854bwM = this.KWHzl;
        if (c10854bwM != null) {
            return c10854bwM.AhwBna();
        }
        return -1L;
    }

    public static /* synthetic */ java.lang.String convertFeeAmtWithSymbol$default(C12804ctr c12804ctr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12804ctr.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C10854bwM c10854bwM = this.AhwBna;
            str = InterfaceC12793ctg.ActionBar.convertChainAmountToCoinAmount$default(this, str, c10854bwM != null ? c10854bwM.AhwBna() : -1L, false, 4, null);
        }
        java.lang.String str2 = str;
        C10854bwM c10854bwM2 = this.AhwBna;
        int iValueOf = c10854bwM2 != null ? c10854bwM2.valueOf() : 0;
        C10854bwM c10854bwM3 = this.AhwBna;
        int iAkhnZx = c10854bwM3 != null ? c10854bwM3.AkhnZx() : 0;
        C10854bwM c10854bwM4 = this.AhwBna;
        java.lang.String strFJNWhG = c10854bwM4 != null ? c10854bwM4.fJNWhG() : null;
        C10854bwM c10854bwM5 = this.AhwBna;
        return C54870xYj.KWHzl(str2, iValueOf, iAkhnZx, strFJNWhG, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : c10854bwM5 != null ? java.lang.Boolean.valueOf(c10854bwM5.getNewProxyInstance()) : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : true, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static /* synthetic */ java.lang.String convertCoinAmt$default(C12804ctr c12804ctr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12804ctr.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C10854bwM c10854bwM = this.AhwBna;
            str = InterfaceC12793ctg.ActionBar.convertChainAmountToCoinAmount$default(this, str, c10854bwM != null ? c10854bwM.AhwBna() : -1L, false, 4, null);
        }
        C10854bwM c10854bwM2 = this.AhwBna;
        return C54870xYj.AEQbTJ(str, c10854bwM2 != null ? c10854bwM2.valueOf() : 0);
    }

    public static /* synthetic */ java.lang.String convertFeeAmount$default(C12804ctr c12804ctr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12804ctr.KWHzl(str, z);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C10854bwM c10854bwM = this.AhwBna;
            str = InterfaceC12793ctg.ActionBar.convertChainAmountToCoinAmount$default(this, str, c10854bwM != null ? c10854bwM.AhwBna() : -1L, false, 4, null);
        }
        java.lang.String str2 = str;
        C10854bwM c10854bwM2 = this.AhwBna;
        int iValueOf = c10854bwM2 != null ? c10854bwM2.valueOf() : 0;
        C10854bwM c10854bwM3 = this.AhwBna;
        return C54870xYj.KWHzl(str2, iValueOf, c10854bwM3 != null ? c10854bwM3.fZBcTu() : 0, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public final java.lang.String OLrzqt() {
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM != null) {
            return c10854bwM.fJNWhG();
        }
        return null;
    }

    public static /* synthetic */ java.lang.String convertFeeAmtToCurrency$default(C12804ctr c12804ctr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12804ctr.copydefault(str, z);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.AhwBna;
        java.lang.String strConvertChainAmountToCoinAmount$default = InterfaceC12793ctg.ActionBar.convertChainAmountToCoinAmount$default(this, str, c10854bwM != null ? c10854bwM.AhwBna() : -1L, false, 4, null);
        C10854bwM c10854bwM2 = this.AhwBna;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(strConvertChainAmountToCoinAmount$default, c10854bwM2 != null ? c10854bwM2.valueOf() : 0);
        MarketDetail marketDetail = this.gEmmrt;
        return C54880xYt.formatValuationFromFee$default(C33129mqd.mulS$default(strAEQbTJ, marketDetail != null ? marketDetail.getCurrencyAmount() : null, null, null, null, 14, null), null, z, false, 5, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strConvertFeeAmtToCurrency$default = convertFeeAmtToCurrency$default(this, str, false, 2, null);
        if (C59449zhJ.startsWith$default(strConvertFeeAmtToCurrency$default, "<", false, 2, null)) {
            return strConvertFeeAmtToCurrency$default;
        }
        return "≈ " + strConvertFeeAmtToCurrency$default;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.KWHzl;
        if (c10854bwM != null && c10854bwM.DarRvM()) {
            return convertFeeAmtWithSymbol$default(this, str, false, 2, null);
        }
        return pTF.KWHzl.EZpvd(convertFeeAmtWithSymbol$default(this, str, false, 2, null) + " ≈ " + convertFeeAmtToCurrency$default(this, str, false, 2, null));
    }

    @Override // o.InterfaceC12793ctg
    public java.lang.String copydefault(@NotNull java.lang.String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwM = this.KWHzl;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwM != null ? c10854bwM.valueOf() : 0);
        C10854bwM c10854bwM2 = this.KWHzl;
        if (c10854bwM2 == null || j != c10854bwM2.AhwBna()) {
            MarketDetail marketDetail = this.EZpvd.get(java.lang.Long.valueOf(j));
            MarketDetail marketDetail2 = this.AEQbTJ;
            strAEQbTJ = C33129mqd.divS$default(C33129mqd.mulS$default(strAEQbTJ, marketDetail2 != null ? marketDetail2.getCurrencyAmount() : null, null, null, null, 14, null), marketDetail != null ? marketDetail.getCurrencyAmount() : null, null, null, null, 14, null);
        }
        java.lang.String str2 = strAEQbTJ;
        C10854bwM c10854bwM3 = this.copydefault.get(java.lang.Long.valueOf(j));
        if (z) {
            return C54870xYj.formatCoinFromFee$default(str2, c10854bwM3 != null ? c10854bwM3.DTwDnp() : 0, null, null, false, null, false, 60, null);
        }
        return C54870xYj.KWHzl(str2, c10854bwM3 != null ? c10854bwM3.valueOf() : 0);
    }

    public static final java.lang.String copydefault(C12804ctr c12804ctr, java.lang.String str) {
        C10854bwM c10854bwM = c12804ctr.KWHzl;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwM != null ? c10854bwM.valueOf() : 0);
        MarketDetail marketDetail = c12804ctr.AEQbTJ;
        return C54880xYt.formatValuationFromFee$default(C33129mqd.mulS$default(strAEQbTJ, marketDetail != null ? marketDetail.getCurrencyAmount() : null, null, null, null, 14, null), null, false, false, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[PHI: r6
  0x0019: PHI (r6v1 java.lang.Long) = (r6v0 java.lang.Long), (r6v6 java.lang.Long) binds: [B:3:0x0006, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC12793ctg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, java.lang.Long l) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            C10854bwM c10854bwM = this.AhwBna;
            l = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null;
            jLongValue = l != null ? l.longValue() : 0L;
        }
        java.lang.String strCopydefault = copydefault(str, jLongValue, true);
        java.lang.String strCopydefault2 = copydefault(this, str);
        if (!C59449zhJ.startsWith$default(strCopydefault2, "<", false, 2, null)) {
            strCopydefault2 = "≈ " + strCopydefault2;
        }
        return C56390yDp.OLrzqt(strCopydefault, strCopydefault2);
    }

    public static final kotlin.Pair AEQbTJ(C12804ctr c12804ctr, ResponseData responseData) {
        java.util.Collection collection;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (collection = (java.util.Collection) responseData.getData()) != null && !collection.isEmpty()) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            for (MarketDetail marketDetail : (java.lang.Iterable) data) {
                if (marketDetail.getCoinId() == c12804ctr.KWHzl()) {
                    c12804ctr.AEQbTJ = marketDetail;
                }
                C10854bwM c10854bwM = c12804ctr.AhwBna;
                if (c10854bwM != null && marketDetail.getCoinId() == c10854bwM.AhwBna()) {
                    c12804ctr.gEmmrt = marketDetail;
                }
                c12804ctr.EZpvd.put(java.lang.Long.valueOf(marketDetail.getCoinId()), marketDetail);
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
