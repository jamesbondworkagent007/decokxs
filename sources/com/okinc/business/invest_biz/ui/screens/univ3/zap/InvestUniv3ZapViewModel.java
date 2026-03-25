package com.okinc.business.invest_biz.ui.screens.univ3.zap;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapPageData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC27023jnP;
import o.C23566iBc;
import o.C25493ixk;
import o.C27022jnO;
import o.C33070mpX;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3ZapViewModel extends ViewModel {
    public final MutableStateFlow<AbstractC27023jnP> AEQbTJ;
    public int AYXKKw;
    public String AhwBna;
    public int EZpvd;
    public final StateFlow<AbstractC27023jnP> KWHzl;
    public long OLrzqt;
    public long copydefault;
    public String gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC27023jnP> AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public InvestUniv3ZapViewModel() {
        MutableStateFlow<AbstractC27023jnP> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC27023jnP.StateListAnimator.OLrzqt);
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        this.AhwBna = "";
        this.gEmmrt = "";
        this.valueOf = "";
    }

    public final void OLrzqt(@NotNull ZapPageData zapPageData) {
        Intrinsics.checkNotNullParameter(zapPageData, "");
        this.AhwBna = zapPageData.djBIcL();
        this.gEmmrt = zapPageData.AhwBna();
        this.copydefault = zapPageData.EZpvd();
        this.valueOf = zapPageData.KWHzl();
        this.OLrzqt = zapPageData.OLrzqt();
        this.EZpvd = zapPageData.copydefault();
        this.AYXKKw = zapPageData.AEQbTJ();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3ZapViewModel$initData$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        InvestUniv3ZapViewModel$getZapInitialData$1 investUniv3ZapViewModel$getZapInitialData$1;
        InvestUniv3ZapViewModel investUniv3ZapViewModel;
        Deferred deferredAsync$default;
        InvestUniv3ZapViewModel investUniv3ZapViewModel2;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo;
        Object objM7377constructorimpl;
        String message;
        if (continuation instanceof InvestUniv3ZapViewModel$getZapInitialData$1) {
            investUniv3ZapViewModel$getZapInitialData$1 = (InvestUniv3ZapViewModel$getZapInitialData$1) continuation;
            int i = investUniv3ZapViewModel$getZapInitialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investUniv3ZapViewModel$getZapInitialData$1.label = i - Integer.MIN_VALUE;
            } else {
                investUniv3ZapViewModel$getZapInitialData$1 = new InvestUniv3ZapViewModel$getZapInitialData$1(this, continuation);
            }
        }
        Object objAwait = investUniv3ZapViewModel$getZapInitialData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investUniv3ZapViewModel$getZapInitialData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                this.AEQbTJ.setValue(AbstractC27023jnP.StateListAnimator.OLrzqt);
                try {
                    Result.Application application = Result.Companion;
                    Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3ZapViewModel$getZapInitialData$result$1$singleDeferred$1(this, null), 3, null);
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1(this, null), 3, null);
                    investUniv3ZapViewModel$getZapInitialData$1.L$0 = this;
                    investUniv3ZapViewModel$getZapInitialData$1.L$1 = deferredAsync$default;
                    investUniv3ZapViewModel$getZapInitialData$1.label = 1;
                    objAwait = deferredAsync$default2.await(investUniv3ZapViewModel$getZapInitialData$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    investUniv3ZapViewModel2 = this;
                } catch (Throwable th) {
                    th = th;
                    investUniv3ZapViewModel = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) investUniv3ZapViewModel$getZapInitialData$1.L$1;
                    investUniv3ZapViewModel = (InvestUniv3ZapViewModel) investUniv3ZapViewModel$getZapInitialData$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objAwait);
                        objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(investUniv3SubscribeInfo, (InvestUniv3SubscribeInfo) objAwait));
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null || (message = thM7380exceptionOrNullimpl.getMessage()) == null) {
                            message = "Unknown error occurred";
                        }
                        investUniv3ZapViewModel.AEQbTJ.setValue(new AbstractC27023jnP.Activity(message));
                    } else {
                        if ((Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl) == null) {
                            investUniv3ZapViewModel.AEQbTJ.setValue(new AbstractC27023jnP.Activity("Failed to load data"));
                        } else {
                            Object obj = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
                            Intrinsics.copydefault(obj);
                            Pair pair = (Pair) obj;
                            investUniv3ZapViewModel.AEQbTJ.setValue(new AbstractC27023jnP.TaskDescription(investUniv3ZapViewModel.copydefault(), (InvestUniv3SubscribeInfo) pair.component1(), (InvestUniv3SubscribeInfo) pair.component2()));
                        }
                    }
                    return Unit.INSTANCE;
                }
                deferredAsync$default = (Deferred) investUniv3ZapViewModel$getZapInitialData$1.L$1;
                investUniv3ZapViewModel2 = (InvestUniv3ZapViewModel) investUniv3ZapViewModel$getZapInitialData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                } catch (Throwable th3) {
                    th = th3;
                    investUniv3ZapViewModel = investUniv3ZapViewModel2;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) objAwait;
            investUniv3ZapViewModel$getZapInitialData$1.L$0 = investUniv3ZapViewModel2;
            investUniv3ZapViewModel$getZapInitialData$1.L$1 = investUniv3SubscribeInfo2;
            investUniv3ZapViewModel$getZapInitialData$1.label = 2;
            Object objAwait2 = deferredAsync$default.await(investUniv3ZapViewModel$getZapInitialData$1);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            investUniv3SubscribeInfo = investUniv3SubscribeInfo2;
            objAwait = objAwait2;
            investUniv3ZapViewModel = investUniv3ZapViewModel2;
            objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(investUniv3SubscribeInfo, (InvestUniv3SubscribeInfo) objAwait));
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final Object AEQbTJ(Continuation<? super InvestUniv3SubscribeInfo> continuation) {
        return AwaitKt.awaitFirst(C23566iBc.EZpvd.AEQbTJ(this.copydefault, this.AhwBna, "", true, this.gEmmrt, this.valueOf, true), continuation);
    }

    public final Object KWHzl(Continuation<? super InvestUniv3SubscribeInfo> continuation) {
        return AwaitKt.awaitFirst(C23566iBc.EZpvd.AEQbTJ(this.copydefault, this.AhwBna, "", false, this.gEmmrt, this.valueOf, true), continuation);
    }

    private final List<C27022jnO> copydefault() {
        return yDY.gEmmrt(new C27022jnO(0, C33070mpX.AYXKKw(C25493ixk.FragmentManager.run), ZapMode.SINGLE_CRYPTO), new C27022jnO(1, C33070mpX.AYXKKw(C25493ixk.FragmentManager.call), ZapMode.DUAL_CRYPTO));
    }
}
