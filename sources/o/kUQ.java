package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetMarketChainListBehavior$getMarketChainBeanList$1;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetMarketChainListBehavior$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUQ implements kUJ {
    public java.util.List<DefiChainInfo> OLrzqt;
    public final C25983jNp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public kUQ(@NotNull C25983jNp c25983jNp) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        this.copydefault = c25983jNp;
        this.OLrzqt = yDY.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kUJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetMarketChainListBehavior$invoke$1 getMarketChainListBehavior$invoke$1;
        java.lang.Object objOLrzqt;
        kUQ kuq;
        java.lang.Object objM7377constructorimpl;
        kUQ kuq2;
        java.util.List<DefiChainInfo> listAhwBna;
        OKServerException oKServerException;
        if (continuation instanceof GetMarketChainListBehavior$invoke$1) {
            getMarketChainListBehavior$invoke$1 = (GetMarketChainListBehavior$invoke$1) continuation;
            int i = getMarketChainListBehavior$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketChainListBehavior$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketChainListBehavior$invoke$1 = new GetMarketChainListBehavior$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getMarketChainListBehavior$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getMarketChainListBehavior$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C25983jNp c25983jNp = this.copydefault;
            getMarketChainListBehavior$invoke$1.L$0 = this;
            getMarketChainListBehavior$invoke$1.label = 1;
            objOLrzqt = c25983jNp.OLrzqt(getMarketChainListBehavior$invoke$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            kuq = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kuq2 = (kUQ) getMarketChainListBehavior$invoke$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objCopydefault);
                kuq = kuq2;
                listAhwBna = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
                if (oKServerException == null) {
                    kuq.OLrzqt = listAhwBna;
                    return new AbstractC43419rot.StateListAnimator(listAhwBna);
                }
                return new AbstractC43419rot.ActionBar(oKServerException);
            }
            kuq = (kUQ) getMarketChainListBehavior$invoke$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application = Result.Companion;
            getMarketChainListBehavior$invoke$1.L$0 = kuq;
            getMarketChainListBehavior$invoke$1.label = 2;
            objCopydefault = kuq.copydefault(getMarketChainListBehavior$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            kuq2 = kuq;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objCopydefault);
            kuq = kuq2;
            listAhwBna = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (listAhwBna == null) {
            }
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl2 instanceof OKServerException) {
            }
            if (oKServerException == null) {
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt);
            listAhwBna = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (listAhwBna == null) {
            }
            java.lang.Throwable thM7380exceptionOrNullimpl22 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl22 instanceof OKServerException) {
            }
            if (oKServerException == null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super java.util.List<DefiChainInfo>> continuation) throws java.lang.Throwable {
        GetMarketChainListBehavior$getMarketChainBeanList$1 getMarketChainListBehavior$getMarketChainBeanList$1;
        if (continuation instanceof GetMarketChainListBehavior$getMarketChainBeanList$1) {
            getMarketChainListBehavior$getMarketChainBeanList$1 = (GetMarketChainListBehavior$getMarketChainBeanList$1) continuation;
            int i = getMarketChainListBehavior$getMarketChainBeanList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketChainListBehavior$getMarketChainBeanList$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketChainListBehavior$getMarketChainBeanList$1 = new GetMarketChainListBehavior$getMarketChainBeanList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getMarketChainListBehavior$getMarketChainBeanList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketChainListBehavior$getMarketChainBeanList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C25983jNp c25983jNp = this.copydefault;
            getMarketChainListBehavior$getMarketChainBeanList$1.label = 1;
            objKWHzl = c25983jNp.KWHzl(getMarketChainListBehavior$getMarketChainBeanList$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.lang.Iterable<MarketChainBean> iterable = (java.lang.Iterable) objKWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (MarketChainBean marketChainBean : iterable) {
            java.lang.String chainId = marketChainBean.getChainId();
            arrayList.add(new DefiChainInfo((java.lang.String) null, marketChainBean.getChainName(), chainId, (java.lang.String) null, (java.lang.String) null, marketChainBean.getChainLogo(), marketChainBean.getResourceId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, (DexDefaultFromToTokenShowVO) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, marketChainBean.getPopularChain(), marketChainBean.getPopularWeight(), (java.lang.String) null, (java.lang.String) null, false, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, marketChainBean.getNativeTokenSymbol(), false, false, false, false, false, false, false, (java.lang.String) null, marketChainBean.getNeedTop(), -103, 2093049, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        TradeMode tradeModeKWHzl = c28243kUe.KWHzl();
        if (tradeModeKWHzl != null && tradeModeKWHzl.isCopyTrading() && !c28243kUe.copydefault().getSupportCopyTradeCreate()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        return InterfaceC28245kUg.Activity.copydefault;
    }
}
