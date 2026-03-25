package o;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32158mRq {
    public mQY AEQbTJ;
    public final java.lang.String AYXKKw;
    public final Activity EZpvd;
    public Function1<? super MarketTxWsInfoItemBean, Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public final StateListAnimator copydefault;
    public final java.lang.String djBIcL;
    public C32159mRr gEmmrt;
    public Function1<? super MarketTradeRealTimeBean, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32159mRr KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super MarketTradeRealTimeBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mQY OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super MarketTxWsInfoItemBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    public C32158mRq(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = str;
        this.djBIcL = str2;
        this.OLrzqt = str3;
        Activity activity = new Activity();
        this.EZpvd = activity;
        this.gEmmrt = new C32159mRr(str, str2, str3, activity);
        this.AEQbTJ = new mQY(str, str2, str3, activity);
        this.copydefault = new StateListAnimator(str3, str2);
    }

    /* JADX INFO: renamed from: o.mRq$Activity */
    public static final class Activity implements InterfaceC32156mRo {
        public Activity() {
        }

        @Override // o.InterfaceC32156mRo
        public void KWHzl(MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
            Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
            Function1 function1 = C32158mRq.this.KWHzl;
            if (function1 != null) {
                function1.invoke(marketTxWsInfoItemBean);
            }
        }
    }

    /* JADX INFO: renamed from: o.mRq$StateListAnimator */
    public static final class StateListAnimator extends AbstractC32155mRn {
        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC32155mRn
        public void KWHzl(MarketTradeRealTimeBean marketTradeRealTimeBean) {
            Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
            Function1 function1 = C32158mRq.this.valueOf;
            if (function1 != null) {
                function1.invoke(marketTradeRealTimeBean);
            }
        }
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            KWHzl().EZpvd();
        } else {
            OLrzqt().EZpvd();
        }
    }

    public final void copydefault() {
        this.copydefault.OLrzqt();
    }

    public final void AEQbTJ() {
        this.valueOf = null;
        this.copydefault.AEQbTJ();
    }

    public final void EZpvd() {
        this.KWHzl = null;
        KWHzl().OLrzqt();
        OLrzqt().OLrzqt();
    }
}
