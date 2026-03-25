package com.okinc.business.invest_biz.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C23580iBq;
import o.C23597iCg;
import o.C25592izd;
import o.C27549jxL;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestBatchClaimViewModel extends ViewModel {
    public final SavedStateHandle AEQbTJ;
    public final C23580iBq KWHzl;
    public final C25592izd OLrzqt;
    public final StateFlow<InvestUserClaimInfoResponse> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestUserClaimInfoResponse> OLrzqt() {
        return this.copydefault;
    }

    public InvestBatchClaimViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C23597iCg c23597iCg, @NotNull C23580iBq c23580iBq, @NotNull C25592izd c25592izd) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(c25592izd, "");
        this.AEQbTJ = savedStateHandle;
        this.KWHzl = c23580iBq;
        this.OLrzqt = c25592izd;
        this.copydefault = FlowKt.stateIn(new Activity(c23597iCg.AEQbTJ(), this), ViewModelKt.getViewModelScope(this), C27549jxL.AEQbTJ, savedStateHandle.get("data"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public InvestBatchClaimViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C23597iCg c23597iCg) {
        this(savedStateHandle, c23597iCg, C23580iBq.AEQbTJ, C25592izd.OLrzqt);
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
    }

    public final Integer KWHzl() {
        return (Integer) this.AEQbTJ.get("pageType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long copydefault() {
        return (Long) this.AEQbTJ.get("chain_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long EZpvd() {
        return (Long) this.AEQbTJ.get("product_id");
    }

    public static final class Activity implements Flow<InvestUserClaimInfoResponse> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ InvestBatchClaimViewModel EZpvd;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.viewmodel.InvestBatchClaimViewModel$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ InvestBatchClaimViewModel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InvestBatchClaimViewModel investBatchClaimViewModel) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = investBatchClaimViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1 investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1;
                FlowCollector flowCollector;
                List<Long> investmentIdList;
                T next;
                String walletAddress;
                Throwable th;
                FlowCollector flowCollector2;
                Object objM7377constructorimpl;
                InvestUserClaimInfoResponse investUserClaimInfoResponse;
                if (continuation instanceof InvestBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1) {
                    investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1 = (InvestBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1) continuation;
                    int i = investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1 = new InvestBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.label;
                try {
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        flowCollector = this.AEQbTJ;
                        InvestTransactionModel investTransactionModel = (InvestTransactionModel) obj;
                        Integer numKWHzl = this.EZpvd.KWHzl();
                        if (numKWHzl != null) {
                            int iIntValue = numKWHzl.intValue();
                            Long lEZpvd = this.EZpvd.EZpvd();
                            if (lEZpvd != null) {
                                long jLongValue = lEZpvd.longValue();
                                InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
                                if (routerParams != null && (investmentIdList = routerParams.getInvestmentIdList()) != null && investmentIdList.contains(C56443yFo.KWHzl(jLongValue)) && this.EZpvd.AEQbTJ(investTransactionModel.getPushToastCode())) {
                                    Iterator<T> it = this.EZpvd.KWHzl.AEQbTJ().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = (T) null;
                                            break;
                                        }
                                        next = it.next();
                                        if (Intrinsics.EZpvd(((InvestWalletAddressInfo) next).getChainId(), this.EZpvd.copydefault())) {
                                            break;
                                        }
                                    }
                                    InvestWalletAddressInfo investWalletAddressInfo = next;
                                    if (investWalletAddressInfo != null && (walletAddress = investWalletAddressInfo.getWalletAddress()) != null) {
                                        try {
                                            Result.Application application = Result.Companion;
                                            C25592izd c25592izd = this.EZpvd.OLrzqt;
                                            InvestUserUnstakeInfoParam investUserUnstakeInfoParam = new InvestUserUnstakeInfoParam(walletAddress, jLongValue, iIntValue);
                                            investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.L$0 = flowCollector;
                                            investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.label = 1;
                                            Object objAEQbTJ = c25592izd.AEQbTJ(investUserUnstakeInfoParam, investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1);
                                            if (objAEQbTJ == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            obj2 = objAEQbTJ;
                                            flowCollector2 = flowCollector;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            flowCollector2 = flowCollector;
                                            Result.Application application2 = Result.Companion;
                                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                        }
                                    }
                                }
                            }
                        }
                        flowCollector2 = flowCollector;
                        investUserClaimInfoResponse = null;
                        if (investUserClaimInfoResponse != null) {
                            investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                            investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.label = 2;
                            if (flowCollector2.emit(investUserClaimInfoResponse, investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) investBatchClaimViewModel$special$$inlined$mapNotNull$1$2$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) obj2);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    ResponseData responseData = (ResponseData) objM7377constructorimpl;
                    if (responseData != null) {
                        investUserClaimInfoResponse = (InvestUserClaimInfoResponse) responseData.getData();
                        if (investUserClaimInfoResponse != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    flowCollector = flowCollector2;
                    flowCollector2 = flowCollector;
                    investUserClaimInfoResponse = null;
                    if (investUserClaimInfoResponse != null) {
                    }
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            }
        }

        public Activity(Flow flow, InvestBatchClaimViewModel investBatchClaimViewModel) {
            this.AEQbTJ = flow;
            this.EZpvd = investBatchClaimViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InvestUserClaimInfoResponse> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final boolean AEQbTJ(Integer num) {
        return (num != null && num.intValue() == 7) || (num != null && num.intValue() == 8) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 14)));
    }
}
