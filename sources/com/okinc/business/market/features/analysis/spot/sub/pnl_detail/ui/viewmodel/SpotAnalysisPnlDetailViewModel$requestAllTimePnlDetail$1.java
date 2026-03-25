package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jME;
import o.jMF;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $costPriceType;
    final /* synthetic */ String $uid;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SpotAnalysisPnlDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1(SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel, String str, String str2, Continuation<? super SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = spotAnalysisPnlDetailViewModel;
        this.$costPriceType = str;
        this.$uid = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1(this.this$0, this.$costPriceType, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        InterfaceC49371unL interfaceC49371unL;
        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel;
        Object objEZpvd2;
        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jME jmeCopydefault = this.this$0.copydefault();
            jME.Activity activity = new jME.Activity(this.this$0.EZpvd().OLrzqt().getValue().getUnit(), this.$costPriceType, C56443yFo.AEQbTJ(PnlDetailPageType.ALL_TIME.getValue()), null, this.$uid);
            this.label = 1;
            objEZpvd = jmeCopydefault.EZpvd(activity, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    spotAnalysisPnlDetailViewModel2 = this.this$0;
                    this.L$0 = null;
                    this.label = 4;
                    if (spotAnalysisPnlDetailViewModel2.copydefault((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel3 = (SpotAnalysisPnlDetailViewModel) this.L$1;
                InterfaceC49371unL interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                spotAnalysisPnlDetailViewModel = spotAnalysisPnlDetailViewModel3;
                interfaceC49371unL = interfaceC49371unL2;
                objEZpvd2 = obj;
                this.L$0 = interfaceC49371unL;
                this.L$1 = null;
                this.label = 3;
                if (spotAnalysisPnlDetailViewModel.EZpvd((InterfaceC49371unL<Unit>) objEZpvd2, this) == objCopydefault) {
                    return objCopydefault;
                }
                spotAnalysisPnlDetailViewModel2 = this.this$0;
                this.L$0 = null;
                this.label = 4;
                if (spotAnalysisPnlDetailViewModel2.copydefault((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        interfaceC49371unL = (InterfaceC49371unL) objEZpvd;
        spotAnalysisPnlDetailViewModel = this.this$0;
        jMF jmfAEQbTJ = spotAnalysisPnlDetailViewModel.AEQbTJ();
        this.L$0 = interfaceC49371unL;
        this.L$1 = spotAnalysisPnlDetailViewModel;
        this.label = 2;
        objEZpvd2 = jmfAEQbTJ.EZpvd(interfaceC49371unL, (Continuation) this);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        this.L$0 = interfaceC49371unL;
        this.L$1 = null;
        this.label = 3;
        if (spotAnalysisPnlDetailViewModel.EZpvd((InterfaceC49371unL<Unit>) objEZpvd2, this) == objCopydefault) {
        }
        spotAnalysisPnlDetailViewModel2 = this.this$0;
        this.L$0 = null;
        this.label = 4;
        if (spotAnalysisPnlDetailViewModel2.copydefault((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
