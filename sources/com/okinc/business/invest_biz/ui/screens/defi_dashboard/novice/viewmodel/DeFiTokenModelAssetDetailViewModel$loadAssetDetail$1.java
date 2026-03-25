package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.viewmodel;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.iEC;
import o.iZF;
import o.iZT;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DashboardTokenDetailReq> $investmentInfos;
    int label;
    final /* synthetic */ DeFiTokenModelAssetDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1(DeFiTokenModelAssetDetailViewModel deFiTokenModelAssetDetailViewModel, List<DashboardTokenDetailReq> list, Continuation<? super DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiTokenModelAssetDetailViewModel;
        this.$investmentInfos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1(this.this$0, this.$investmentInfos, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(iZT.Application.OLrzqt);
            iZF izf = this.this$0.KWHzl;
            List<DashboardTokenDetailReq> list = this.$investmentInfos;
            this.label = 1;
            objKWHzl = izf.KWHzl(list, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        DeFiTokenModelAssetDetailViewModel deFiTokenModelAssetDetailViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            deFiTokenModelAssetDetailViewModel.copydefault.setValue(new iZT.TaskDescription(deFiTokenModelAssetDetailViewModel.AEQbTJ.copydefault((iEC) objKWHzl)));
        }
        DeFiTokenModelAssetDetailViewModel deFiTokenModelAssetDetailViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            MutableStateFlow mutableStateFlow = deFiTokenModelAssetDetailViewModel2.copydefault;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            mutableStateFlow.setValue(new iZT.StateListAnimator(message));
        }
        return Unit.INSTANCE;
    }
}
