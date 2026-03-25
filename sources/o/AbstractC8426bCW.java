package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.FeeType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.localization.util.format.DisplaySign;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C8486bDd;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bCW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8426bCW<FeeItem extends C8486bDd> {
    public final AbstractC8564bFB<?, ?> AEQbTJ;
    public long EZpvd;
    public final java.util.ArrayList<InterfaceC58181ywT<FeeItem>> KWHzl;
    public final java.util.ArrayList<InterfaceC58181ywT<java.util.List<FeeItem>>> copydefault;

    public abstract java.lang.String AEQbTJ();

    public abstract FeeItem KWHzl();

    public abstract java.util.List<FeeItem> OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.EZpvd = j;
    }

    public abstract FeeType copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.EZpvd;
    }

    public AbstractC8426bCW(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.AEQbTJ = abstractC8564bFB;
        this.EZpvd = abstractC8564bFB.dHguZz().AhwBna();
        this.KWHzl = new java.util.ArrayList<>();
        this.copydefault = new java.util.ArrayList<>();
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gEmmrt() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public C10854bwM AYXKKw() throws CoinMetaError {
        C10854bwM c10854bwMCopydefault = this.AEQbTJ.DarRvM().copydefault(this.EZpvd);
        if (c10854bwMCopydefault != null) {
            return c10854bwMCopydefault;
        }
        CoinMetaError coinMetaError = new CoinMetaError("getFeeCoinMeta is null");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("feeCoinId", java.lang.String.valueOf(this.EZpvd));
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("generalChainId", java.lang.String.valueOf(this.AEQbTJ.OJuSTm().getGeneralChainId()));
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("txSource", java.lang.String.valueOf(this.AEQbTJ.QwvEab()));
        C10954byG c10954byG = C10954byG.EZpvd;
        java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt("enabledCoinsCount", java.lang.String.valueOf(c10954byG.valueOf().values().size())), C56390yDp.OLrzqt("initStatus", java.lang.String.valueOf(c10954byG.AhwBna())), C56390yDp.OLrzqt("signData", new Gson().toJson(this.AEQbTJ.QVsKAR())), C56390yDp.OLrzqt("tickerInit", java.lang.String.valueOf(this.AEQbTJ.DarRvM().fIwbmz())), C56390yDp.OLrzqt("tickerData", new Gson().toJson(this.AEQbTJ.DarRvM().fetchVPNInfo())));
        C6777aVl.Companion.OLrzqt(coinMetaError, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "TXFeeBaseHandler");
        throw coinMetaError;
    }

    public java.lang.String valueOf() {
        WalletTickerManager.CoinPrice coinPriceCopydefault = this.AEQbTJ.DarRvM().copydefault(java.lang.Long.valueOf(this.EZpvd));
        if (coinPriceCopydefault != null) {
            return coinPriceCopydefault.getRealPrice();
        }
        CoinMetaError coinMetaError = new CoinMetaError("getFeeCoinUSDPrice is null");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("feeCoinId", java.lang.String.valueOf(this.EZpvd));
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("generalChainId", java.lang.String.valueOf(this.AEQbTJ.OJuSTm().getGeneralChainId()));
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("txSource", java.lang.String.valueOf(this.AEQbTJ.QwvEab()));
        C10954byG c10954byG = C10954byG.EZpvd;
        java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt("enabledCoinsCount", java.lang.String.valueOf(c10954byG.valueOf().values().size())), C56390yDp.OLrzqt("initStatus", java.lang.String.valueOf(c10954byG.AhwBna())), C56390yDp.OLrzqt("signData", new Gson().toJson(this.AEQbTJ.QVsKAR())), C56390yDp.OLrzqt("tickerInit", java.lang.String.valueOf(this.AEQbTJ.DarRvM().fIwbmz())), C56390yDp.OLrzqt("tickerData", new Gson().toJson(this.AEQbTJ.DarRvM().fetchVPNInfo())));
        C6777aVl.Companion.OLrzqt(coinMetaError, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "TXFeeBaseHandler");
        return "0";
    }

    public static /* synthetic */ java.lang.String formatToFeeCoinAmount$default(AbstractC8426bCW abstractC8426bCW, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatToFeeCoinAmount");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return abstractC8426bCW.AEQbTJ(str, z, z2, z3);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return C54870xYj.KWHzl(str, AYXKKw().valueOf(), AYXKKw().AkhnZx(), z2 ? AYXKKw().fJNWhG() : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : java.lang.Boolean.valueOf(AYXKKw().getNewProxyInstance()), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : z3, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return C54870xYj.AEQbTJ(str, AYXKKw().valueOf());
    }

    public static /* synthetic */ java.lang.String formatToFeeCurrencyAmount$default(AbstractC8426bCW abstractC8426bCW, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatToFeeCurrencyAmount");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        return abstractC8426bCW.copydefault(str, z, z2, z3);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, AYXKKw().valueOf()), valueOf());
        if (z) {
            return KWHzl(bigDecimalOLrzqt, z2, z3);
        }
        return C54862xYb.convertToString$default(C54862xYb.OLrzqt(bigDecimalOLrzqt, java.lang.Double.valueOf(this.AEQbTJ.zuWLRA().KWHzl().getUsdToThisRate())), false, null, null, 7, null);
    }

    public static /* synthetic */ java.lang.String formatToFeeCurrencyAmount$default(AbstractC8426bCW abstractC8426bCW, BigDecimal bigDecimal, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatToFeeCurrencyAmount");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return abstractC8426bCW.KWHzl(bigDecimal, z, z2);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String valuationFromFee$default = C54880xYt.formatValuationFromFee$default(C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null), this.AEQbTJ.zuWLRA().KWHzl(), z, false, 4, null);
        if (!z2) {
            return valuationFromFee$default;
        }
        return "(" + valuationFromFee$default + ")";
    }

    public final AbstractC58185ywX<FeeItem> isConnected() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<FeeItem> abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                AbstractC8426bCW.EZpvd(objectRef, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).EZpvd(new InterfaceC58222yxH() { // from class: o.bCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                AbstractC8426bCW.EZpvd(this.OLrzqt, objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.ObjectRef objectRef, AbstractC8426bCW abstractC8426bCW, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        abstractC8426bCW.KWHzl.add(interfaceC58184ywW);
        abstractC8426bCW.KWHzl(2);
    }

    public static final void EZpvd(AbstractC8426bCW abstractC8426bCW, Ref.ObjectRef objectRef) {
        java.util.ArrayList<InterfaceC58181ywT<FeeItem>> arrayList = abstractC8426bCW.KWHzl;
        C56532yIw.EZpvd(arrayList).remove(objectRef.element);
    }

    public final AbstractC58185ywX<java.util.List<FeeItem>> values() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.util.List<FeeItem>> abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                AbstractC8426bCW.KWHzl(objectRef, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).EZpvd(new InterfaceC58222yxH() { // from class: o.bCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                AbstractC8426bCW.AEQbTJ(this.AEQbTJ, objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.ObjectRef objectRef, AbstractC8426bCW abstractC8426bCW, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        abstractC8426bCW.copydefault.add(interfaceC58184ywW);
        abstractC8426bCW.KWHzl(2);
    }

    public static final void AEQbTJ(AbstractC8426bCW abstractC8426bCW, Ref.ObjectRef objectRef) {
        java.util.ArrayList<InterfaceC58181ywT<java.util.List<FeeItem>>> arrayList = abstractC8426bCW.copydefault;
        C56532yIw.EZpvd(arrayList).remove(objectRef.element);
    }

    public void KWHzl(int i) {
        if (!this.KWHzl.isEmpty()) {
            C8486bDd c8486bDdKWHzl = KWHzl();
            c8486bDdKWHzl.setFeeChangeType(i);
            java.util.Iterator<T> it = this.KWHzl.iterator();
            while (it.hasNext()) {
                ((InterfaceC58181ywT) it.next()).onNext(c8486bDdKWHzl);
            }
        }
        if (!this.copydefault.isEmpty()) {
            java.util.List<FeeItem> listOLrzqt = OLrzqt();
            java.util.Iterator<T> it2 = listOLrzqt.iterator();
            while (it2.hasNext()) {
                ((C8486bDd) it2.next()).setFeeChangeType(i);
            }
            java.util.Iterator<T> it3 = this.copydefault.iterator();
            while (it3.hasNext()) {
                ((InterfaceC58181ywT) it3.next()).onNext(listOLrzqt);
            }
        }
    }

    public final void AkhnZx() {
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            ((InterfaceC58181ywT) it.next()).onComplete();
        }
        java.util.Iterator<T> it2 = this.copydefault.iterator();
        while (it2.hasNext()) {
            ((InterfaceC58181ywT) it2.next()).onComplete();
        }
        this.KWHzl.clear();
        this.copydefault.clear();
    }
}
