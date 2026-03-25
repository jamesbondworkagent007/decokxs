package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C26658jgV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23643iDz;
import o.InterfaceC23916iOb;
import o.InterfaceC9738bbJ;
import o.iDD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionProtocolViewModel extends ViewModel {
    public final StateFlow<C26658jgV> AEQbTJ;
    public final InterfaceC23916iOb EZpvd;
    public final InterfaceC23643iDz KWHzl;
    public final MutableStateFlow<C26658jgV> OLrzqt;
    public final MutableLiveData<TransactionConfig> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TransactionConfig> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26658jgV> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public InvestSubscriptionProtocolViewModel(@NotNull InterfaceC23643iDz interfaceC23643iDz, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(interfaceC23643iDz, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.KWHzl = interfaceC23643iDz;
        this.EZpvd = interfaceC23916iOb;
        MutableStateFlow<C26658jgV> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26658jgV(null, null, 3, null));
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = new MutableLiveData<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(long j, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        InvestSubscriptionProtocolViewModel$fetchProtocolsList$1 investSubscriptionProtocolViewModel$fetchProtocolsList$1;
        InvestSubscriptionProtocolViewModel investSubscriptionProtocolViewModel;
        Object objM7377constructorimpl;
        String strDbNXlk;
        Object objAEQbTJ;
        InvestSubscriptionProtocolViewModel investSubscriptionProtocolViewModel2;
        if (continuation instanceof InvestSubscriptionProtocolViewModel$fetchProtocolsList$1) {
            investSubscriptionProtocolViewModel$fetchProtocolsList$1 = (InvestSubscriptionProtocolViewModel$fetchProtocolsList$1) continuation;
            int i = investSubscriptionProtocolViewModel$fetchProtocolsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSubscriptionProtocolViewModel$fetchProtocolsList$1.label = i - Integer.MIN_VALUE;
            } else {
                investSubscriptionProtocolViewModel$fetchProtocolsList$1 = new InvestSubscriptionProtocolViewModel$fetchProtocolsList$1(this, continuation);
            }
        }
        Object objAwait = investSubscriptionProtocolViewModel$fetchProtocolsList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSubscriptionProtocolViewModel$fetchProtocolsList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                try {
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.EZpvd.gEmmrt().KWHzl();
                    investSubscriptionProtocolViewModel$fetchProtocolsList$1.L$0 = this;
                    investSubscriptionProtocolViewModel$fetchProtocolsList$1.J$0 = j;
                    investSubscriptionProtocolViewModel$fetchProtocolsList$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, investSubscriptionProtocolViewModel$fetchProtocolsList$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    investSubscriptionProtocolViewModel = this;
                } catch (Throwable th) {
                    th = th;
                    investSubscriptionProtocolViewModel = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    investSubscriptionProtocolViewModel2 = (InvestSubscriptionProtocolViewModel) investSubscriptionProtocolViewModel$fetchProtocolsList$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    objAEQbTJ = ((Result) objAwait).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                        investSubscriptionProtocolViewModel2.OLrzqt.setValue(new C26658jgV(null, InvestSubscriptionState.Error, 1, null));
                    }
                    if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                        investSubscriptionProtocolViewModel2.OLrzqt.setValue(new C26658jgV((InvestSubscriptionProtocolModel) objAEQbTJ, InvestSubscriptionState.Success));
                    }
                    return Unit.INSTANCE;
                }
                j = investSubscriptionProtocolViewModel$fetchProtocolsList$1.J$0;
                investSubscriptionProtocolViewModel = (InvestSubscriptionProtocolViewModel) investSubscriptionProtocolViewModel$fetchProtocolsList$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
            if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            InterfaceC23643iDz interfaceC23643iDz = investSubscriptionProtocolViewModel.KWHzl;
            InvestSubscriptionProtocolsReq investSubscriptionProtocolsReqOLrzqt = iDD.Companion.OLrzqt(strDbNXlk, j);
            investSubscriptionProtocolViewModel$fetchProtocolsList$1.L$0 = investSubscriptionProtocolViewModel;
            investSubscriptionProtocolViewModel$fetchProtocolsList$1.label = 2;
            objAEQbTJ = interfaceC23643iDz.AEQbTJ(investSubscriptionProtocolsReqOLrzqt, investSubscriptionProtocolViewModel$fetchProtocolsList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            investSubscriptionProtocolViewModel2 = investSubscriptionProtocolViewModel;
            if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            }
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final void copydefault(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        this.copydefault.setValue(transactionConfig);
    }
}
