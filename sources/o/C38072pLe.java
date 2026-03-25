package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import com.okinc.lifecycle.impl.business.recommend.viewmodel.TokenRecommendViewModel$observePriceUpdated$1;
import com.okinc.lifecycle.impl.business.recommend.viewmodel.TokenRecommendViewModel$observePriceUpdated$2;
import com.okinc.lifecycle.impl.business.recommend.viewmodel.TokenRecommendViewModel$setup$2;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.sxI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38072pLe extends ViewModel {
    public final LifecycleApiRetrofitService AEQbTJ;
    public TokenRecommendTotalBean AYXKKw;
    public final pKY AhwBna;
    public final java.lang.String EZpvd;
    public TokenRecommendInfoBean KWHzl;
    public final C38068pLa OLrzqt;
    public final MutableStateFlow<pKZ> copydefault;
    public final StateFlow<pKZ> djBIcL;
    public final C38069pLb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<pKZ> KWHzl() {
        return this.djBIcL;
    }

    public C38072pLe(@NotNull LifecycleApiRetrofitService lifecycleApiRetrofitService, @NotNull C38069pLb c38069pLb, @NotNull C38068pLa c38068pLa, @NotNull pKY pky) {
        Intrinsics.checkNotNullParameter(lifecycleApiRetrofitService, "");
        Intrinsics.checkNotNullParameter(c38069pLb, "");
        Intrinsics.checkNotNullParameter(c38068pLa, "");
        Intrinsics.checkNotNullParameter(pky, "");
        this.AEQbTJ = lifecycleApiRetrofitService;
        this.valueOf = c38069pLb;
        this.OLrzqt = c38068pLa;
        this.AhwBna = pky;
        this.EZpvd = "TokenRecommendViewModel";
        MutableStateFlow<pKZ> MutableStateFlow = StateFlowKt.MutableStateFlow(new pKZ(null, null, 3, null));
        this.copydefault = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final java.lang.Object OLrzqt(@NotNull TokenRecommendInfoBean tokenRecommendInfoBean, @NotNull LifecycleOwner lifecycleOwner, @NotNull Continuation<? super Unit> continuation) {
        this.KWHzl = tokenRecommendInfoBean;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenRecommendViewModel$setup$2(this, tokenRecommendInfoBean, lifecycleOwner, null), 3, null);
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(TokenRecommendTotalBean tokenRecommendTotalBean, LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        this.AYXKKw = tokenRecommendTotalBean;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = tokenRecommendTotalBean.KWHzl().iterator();
        while (it.hasNext()) {
            arrayList.add(C38070pLc.AEQbTJ((TokenRecommendItemBean) it.next(), this.AhwBna));
        }
        this.copydefault.setValue(new pKZ(arrayList, tokenRecommendTotalBean.AEQbTJ()));
        TokenRecommendInfoBean tokenRecommendInfoBean = this.KWHzl;
        if ((tokenRecommendInfoBean != null ? tokenRecommendInfoBean.getContentStyleType() : null) == TokenRecommendContentStyle.HORIZONTAL_SCROLL) {
            java.util.List<TokenRecommendItemBean> listKWHzl = tokenRecommendTotalBean.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            java.util.Iterator<T> it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TokenRecommendItemBean) it2.next()).AYXKKw());
            }
            java.lang.Object objOLrzqt = OLrzqt(lifecycleOwner, arrayList2, continuation);
            return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(LifecycleOwner lifecycleOwner, java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TokenRecommendViewModel$observePriceUpdated$1 tokenRecommendViewModel$observePriceUpdated$1;
        C38072pLe c38072pLe;
        if (continuation instanceof TokenRecommendViewModel$observePriceUpdated$1) {
            tokenRecommendViewModel$observePriceUpdated$1 = (TokenRecommendViewModel$observePriceUpdated$1) continuation;
            int i = tokenRecommendViewModel$observePriceUpdated$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenRecommendViewModel$observePriceUpdated$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenRecommendViewModel$observePriceUpdated$1 = new TokenRecommendViewModel$observePriceUpdated$1(this, continuation);
            }
        }
        java.lang.Object obj = tokenRecommendViewModel$observePriceUpdated$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenRecommendViewModel$observePriceUpdated$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                StateFlow stateFlowHttpThenSubscribeFairPriceData$default = sxI.ActionBar.httpThenSubscribeFairPriceData$default((sxI) C43251rlk.copydefault(sxI.class), lifecycleOwner, list, false, null, 0L, 28, null);
                if (stateFlowHttpThenSubscribeFairPriceData$default != null) {
                    TokenRecommendViewModel$observePriceUpdated$2 tokenRecommendViewModel$observePriceUpdated$2 = new TokenRecommendViewModel$observePriceUpdated$2(this, null);
                    tokenRecommendViewModel$observePriceUpdated$1.L$0 = this;
                    tokenRecommendViewModel$observePriceUpdated$1.label = 1;
                    if (FlowKt.collectLatest(stateFlowHttpThenSubscribeFairPriceData$default, tokenRecommendViewModel$observePriceUpdated$2, tokenRecommendViewModel$observePriceUpdated$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } catch (java.lang.Exception e) {
                e = e;
                c38072pLe = this;
                pUU.copydefault(c38072pLe.EZpvd, "observePriceUpdated error: " + e);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38072pLe = (C38072pLe) tokenRecommendViewModel$observePriceUpdated$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Exception e2) {
                e = e2;
                pUU.copydefault(c38072pLe.EZpvd, "observePriceUpdated error: " + e);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull pKX pkx) {
        java.util.List<TokenRecommendItemBean> listKWHzl;
        java.lang.Object next;
        TokenRecommendInfoBean tokenRecommendInfoBean;
        Intrinsics.checkNotNullParameter(pkx, "");
        TokenRecommendTotalBean tokenRecommendTotalBean = this.AYXKKw;
        if (tokenRecommendTotalBean == null || (listKWHzl = tokenRecommendTotalBean.KWHzl()) == null) {
            return;
        }
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TokenRecommendItemBean) next).AYXKKw(), (java.lang.Object) pkx.gEmmrt())) {
                    break;
                }
            }
        }
        TokenRecommendItemBean tokenRecommendItemBean = (TokenRecommendItemBean) next;
        if (tokenRecommendItemBean == null || (tokenRecommendInfoBean = this.KWHzl) == null || this.AYXKKw == null) {
            return;
        }
        C38068pLa c38068pLa = this.OLrzqt;
        Intrinsics.copydefault(tokenRecommendInfoBean);
        TokenRecommendTotalBean tokenRecommendTotalBean2 = this.AYXKKw;
        Intrinsics.copydefault(tokenRecommendTotalBean2);
        c38068pLa.EZpvd(tokenRecommendInfoBean, tokenRecommendItemBean, tokenRecommendTotalBean2);
    }

    public final void OLrzqt() {
        TokenRecommendInfoBean tokenRecommendInfoBean = this.KWHzl;
        if (tokenRecommendInfoBean == null || this.AYXKKw == null) {
            return;
        }
        C38068pLa c38068pLa = this.OLrzqt;
        Intrinsics.copydefault(tokenRecommendInfoBean);
        TokenRecommendTotalBean tokenRecommendTotalBean = this.AYXKKw;
        Intrinsics.copydefault(tokenRecommendTotalBean);
        c38068pLa.EZpvd(tokenRecommendInfoBean, tokenRecommendTotalBean);
    }

    public final void EZpvd() {
        TokenRecommendInfoBean tokenRecommendInfoBean = this.KWHzl;
        if (tokenRecommendInfoBean != null) {
            C38068pLa c38068pLa = this.OLrzqt;
            Intrinsics.copydefault(tokenRecommendInfoBean);
            c38068pLa.copydefault(tokenRecommendInfoBean);
        }
    }
}
