package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mQP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC32155mRn extends mQV {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final java.lang.String AEQbTJ;
    public AbstractC57556yke EZpvd;
    public final java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX INFO: renamed from: o.mRn$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.List<? extends MarketTradeRealTimeBean>> {
    }

    public abstract void KWHzl(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean);

    public AbstractC32155mRn(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = "";
    }

    /* JADX INFO: renamed from: o.mRn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mRn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public void OLrzqt() {
        AbstractC57556yke abstractC57556ykeAEQbTJ = AEQbTJ("dex-market-tradeRealTime", new WsArgV5ForWeb3("dex-market-tradeRealTime", null, this.AEQbTJ, this.OLrzqt, null, 18, null));
        this.EZpvd = abstractC57556ykeAEQbTJ;
        abstractC57556ykeAEQbTJ.AhwBna();
        mQP.StateListAnimator.startCheckCacheValid$default(this, 0L, 1, null);
    }

    public void AEQbTJ() {
        AbstractC57556yke abstractC57556yke = this.EZpvd;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCAhwBna = AhwBna();
        if (interfaceC58217yxCAhwBna != null) {
            interfaceC58217yxCAhwBna.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.EZpvd;
        if (abstractC57556yke2 != null) {
            C32152mRk.Companion.EZpvd("dex-market-tradeRealTime", abstractC57556yke2);
            this.EZpvd = null;
        }
    }

    @Override // o.mQP
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(true);
        this.copydefault = str;
    }

    @Override // o.mQP
    public void copydefault() {
        java.lang.Object objM7377constructorimpl;
        MarketTradeRealTimeBean marketTradeRealTimeBean;
        java.lang.String str = this.copydefault;
        if (str == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(mRB.EZpvd().fromJson(str, new StateListAnimator().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        java.util.List list = (java.util.List) objM7377constructorimpl;
        if (list == null || (marketTradeRealTimeBean = (MarketTradeRealTimeBean) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) {
            return;
        }
        KWHzl(marketTradeRealTimeBean);
    }
}
