package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23258huo {
    public C23183htS AEQbTJ;
    public Function1<? super MarketTradeRealTimeBean, Unit> AYXKKw;
    public final java.lang.String EZpvd;
    public final Activity KWHzl;
    public Function1<? super MarketTxWsInfoItemBean, Unit> OLrzqt;
    public final StateListAnimator copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public C23257hun valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23183htS AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23257hun EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super MarketTxWsInfoItemBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super MarketTradeRealTimeBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    public C23258huo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL = str;
        this.gEmmrt = str2;
        this.EZpvd = str3;
        Activity activity = new Activity();
        this.KWHzl = activity;
        this.valueOf = new C23257hun(str, str2, str3, activity);
        this.AEQbTJ = new C23183htS(str, str2, str3, activity);
        this.copydefault = new StateListAnimator(str3, str2);
    }

    /* JADX INFO: renamed from: o.huo$Activity */
    public static final class Activity implements InterfaceC23251huh {
        public Activity() {
        }

        @Override // o.InterfaceC23251huh
        public void AEQbTJ(MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
            Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
            Function1 function1 = C23258huo.this.OLrzqt;
            if (function1 != null) {
                function1.invoke(marketTxWsInfoItemBean);
            }
        }
    }

    /* JADX INFO: renamed from: o.huo$StateListAnimator */
    public static final class StateListAnimator extends AbstractC23260huq {
        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC23260huq
        public void OLrzqt(MarketTradeRealTimeBean marketTradeRealTimeBean) {
            Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
            Function1 function1 = C23258huo.this.AYXKKw;
            if (function1 != null) {
                function1.invoke(marketTradeRealTimeBean);
            }
        }
    }

    public final void KWHzl(boolean z) {
        if (C22416heu.ejfBZ()) {
            return;
        }
        if (z) {
            EZpvd().EZpvd();
        } else {
            AEQbTJ().EZpvd();
        }
    }

    public final void copydefault() {
        if (C22416heu.ejfBZ()) {
            return;
        }
        this.copydefault.EZpvd();
    }

    public final void KWHzl() {
        this.AYXKKw = null;
        this.copydefault.AEQbTJ();
    }

    public final void OLrzqt() {
        this.OLrzqt = null;
        EZpvd().AEQbTJ();
        AEQbTJ().AEQbTJ();
    }
}
