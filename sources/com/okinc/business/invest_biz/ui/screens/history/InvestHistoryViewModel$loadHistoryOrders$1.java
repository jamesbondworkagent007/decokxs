package com.okinc.business.invest_biz.ui.screens.history;

import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC26383jbL;
import o.AbstractC26387jbP;
import o.AbstractC43419rot;
import o.C23580iBq;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC23641iDx;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHistoryViewModel$loadHistoryOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ LoadHistoryType $loadHistoryType;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ boolean $showLoading;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHistoryViewModel$loadHistoryOrders$1(boolean z, InvestHistoryViewModel investHistoryViewModel, long j, long j2, int i, LoadHistoryType loadHistoryType, Continuation<? super InvestHistoryViewModel$loadHistoryOrders$1> continuation) {
        super(2, continuation);
        this.$showLoading = z;
        this.this$0 = investHistoryViewModel;
        this.$chainId = j;
        this.$investmentId = j2;
        this.$pageSize = i;
        this.$loadHistoryType = loadHistoryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHistoryViewModel$loadHistoryOrders$1(this.$showLoading, this.this$0, this.$chainId, this.$investmentId, this.$pageSize, this.$loadHistoryType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHistoryViewModel$loadHistoryOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestHistoryViewModel investHistoryViewModel;
        LoadHistoryType loadHistoryType;
        Object objAEQbTJ;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showLoading) {
                this.this$0.AEQbTJ.setValue(AbstractC26383jbL.TaskDescription.EZpvd);
            }
            int unused = this.this$0.AYXKKw;
            C23580iBq c23580iBq = C23580iBq.AEQbTJ;
            if (c23580iBq.OLrzqt() == null) {
                this.this$0.AEQbTJ.setValue(AbstractC26383jbL.ActionBar.copydefault);
                return Unit.INSTANCE;
            }
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = c23580iBq.OLrzqt();
            if (interfaceC9738bbJOLrzqt != null) {
                investHistoryViewModel = this.this$0;
                long j = this.$chainId;
                long j2 = this.$investmentId;
                int i2 = this.$pageSize;
                loadHistoryType = this.$loadHistoryType;
                InterfaceC23641iDx interfaceC23641iDx = investHistoryViewModel.AhwBna;
                String strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk();
                DetailOrderParam detailOrderParam = new DetailOrderParam(j, j2, C56402yEa.EZpvd(interfaceC9738bbJOLrzqt.EZpvd(j)), i2, investHistoryViewModel.AYXKKw);
                this.L$0 = investHistoryViewModel;
                this.L$1 = loadHistoryType;
                this.label = 1;
                objAEQbTJ = interfaceC23641iDx.AEQbTJ(strDbNXlk, detailOrderParam, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
            }
        } else if (i == 1) {
            LoadHistoryType loadHistoryType2 = (LoadHistoryType) this.L$1;
            investHistoryViewModel = (InvestHistoryViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            loadHistoryType = loadHistoryType2;
            objAEQbTJ = obj;
            abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                InvestHomeOrderVo investHomeOrderVo = (InvestHomeOrderVo) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                if (loadHistoryType != LoadHistoryType.LOAD_MORE || !investHomeOrderVo.getDetailOrderInfoVoList().isEmpty()) {
                    investHistoryViewModel.AYXKKw++;
                    if (loadHistoryType == LoadHistoryType.REFRESH_PAGE) {
                        investHistoryViewModel.EZpvd.clear();
                    }
                    investHistoryViewModel.EZpvd.addAll(investHomeOrderVo.getDetailOrderInfoVoList());
                    investHistoryViewModel.AEQbTJ.setValue(new AbstractC26383jbL.Application(new ArrayList(investHistoryViewModel.EZpvd)));
                } else {
                    investHistoryViewModel.AEQbTJ.setValue(AbstractC26383jbL.Activity.OLrzqt);
                }
            }
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                if (!investHistoryViewModel.EZpvd.isEmpty()) {
                    MutableSharedFlow mutableSharedFlow = investHistoryViewModel.KWHzl;
                    AbstractC26387jbP.StateListAnimator stateListAnimator = AbstractC26387jbP.StateListAnimator.EZpvd;
                    this.L$0 = abstractC43419rot;
                    this.L$1 = null;
                    this.label = 2;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    investHistoryViewModel.AEQbTJ.setValue(AbstractC26383jbL.ActionBar.copydefault);
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
