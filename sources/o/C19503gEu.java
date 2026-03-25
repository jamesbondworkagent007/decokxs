package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19503gEu extends AbstractC33073mpa {
    public C10854bwM copydefault;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.gEs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19503gEu.valueOf();
        }
    });
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>();
    public final java.util.HashMap<java.lang.Long, WalletTickerManager.CoinPrice> EZpvd = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.Long, java.lang.Boolean> gEmmrt = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.Long, NewCurvePrice> OLrzqt = new java.util.HashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C10854bwM c10854bwM) {
        this.copydefault = c10854bwM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM copydefault() {
        return this.copydefault;
    }

    private final C13934dbu djBIcL() {
        return (C13934dbu) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13934dbu valueOf() {
        return new C13934dbu();
    }

    public final void KWHzl(@NotNull WalletTickerManager.CoinPrice coinPrice) {
        Intrinsics.checkNotNullParameter(coinPrice, "");
        this.EZpvd.put(java.lang.Long.valueOf(coinPrice.getCoinId()), coinPrice);
        C10854bwM c10854bwM = this.copydefault;
        if (c10854bwM == null || c10854bwM.AhwBna() != coinPrice.getCoinId()) {
            return;
        }
        this.AEQbTJ.setValue(java.lang.Boolean.TRUE);
    }

    public final WalletTickerManager.CoinPrice AEQbTJ() {
        java.util.HashMap<java.lang.Long, WalletTickerManager.CoinPrice> map = this.EZpvd;
        C10854bwM c10854bwM = this.copydefault;
        return map.get(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
    }

    public final NewCurvePrice AYXKKw() {
        java.util.HashMap<java.lang.Long, NewCurvePrice> map = this.OLrzqt;
        C10854bwM c10854bwM = this.copydefault;
        return map.get(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
    }

    public final void copydefault(final C10854bwM c10854bwM) {
        if ((c10854bwM != null && c10854bwM.getNewProxyInstance() && c10854bwM.giSNqX()) || c10854bwM == null || c10854bwM.DarRvM()) {
            return;
        }
        C10854bwM c10854bwMCopydefault = copydefault();
        final long jCopydefault = C11600cUg.copydefault(c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()) : null);
        call().AEQbTJ(yBI.subscribeBy$default(djBIcL().AEQbTJ(c10854bwM.AhwBna(), "1"), new Function1() { // from class: o.gEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19503gEu.copydefault(c10854bwM, jCopydefault, this, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.gEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19503gEu.copydefault(this.copydefault, c10854bwM, jCopydefault, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null));
    }

    public static final Unit copydefault(C10854bwM c10854bwM, long j, C19503gEu c19503gEu, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (c10854bwM.AhwBna() == j) {
            c19503gEu.AEQbTJ.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19503gEu c19503gEu, C10854bwM c10854bwM, long j, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c19503gEu.OLrzqt.put(java.lang.Long.valueOf(c10854bwM.AhwBna()), (NewCurvePrice) responseData.getData());
        if (c10854bwM.AhwBna() == j) {
            c19503gEu.AEQbTJ.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final C10854bwM c10854bwMCopydefault = copydefault();
        if (EZpvd() == null) {
            call().AEQbTJ(yBI.subscribeBy$default(djBIcL().KWHzl(j, str), new Function1() { // from class: o.gEt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19503gEu.EZpvd(j, c10854bwMCopydefault, this, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.gEy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19503gEu.EZpvd(this.copydefault, j, c10854bwMCopydefault, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null));
        } else {
            if (c10854bwMCopydefault == null || j != c10854bwMCopydefault.fetchVPNInfo()) {
                return;
            }
            this.KWHzl.setValue(java.lang.Boolean.TRUE);
        }
    }

    public static final Unit EZpvd(long j, C10854bwM c10854bwM, C19503gEu c19503gEu, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (c10854bwM != null && j == c10854bwM.fetchVPNInfo()) {
            c19503gEu.KWHzl.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19503gEu c19503gEu, long j, C10854bwM c10854bwM, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.HashMap<java.lang.Long, java.lang.Boolean> map = c19503gEu.gEmmrt;
        java.lang.Boolean bool = (java.lang.Boolean) responseData.getData();
        map.put(java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        if (c10854bwM != null && j == c10854bwM.fetchVPNInfo()) {
            c19503gEu.KWHzl.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Boolean EZpvd() {
        java.util.HashMap<java.lang.Long, java.lang.Boolean> map = this.gEmmrt;
        C10854bwM c10854bwM = this.copydefault;
        return map.get(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null);
    }
}
