package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25973jNf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jME;
import o.jMF;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $costPriceType;
    final /* synthetic */ String $uid;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SpotAnalysisPnlDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1(SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel, String str, String str2, Continuation<? super SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = spotAnalysisPnlDetailViewModel;
        this.$costPriceType = str;
        this.$uid = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1(this.this$0, this.$costPriceType, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String str;
        jME jme;
        int i;
        Object objEZpvd;
        InterfaceC49371unL interfaceC49371unL;
        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel;
        Object objEZpvd2;
        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jME jmeCopydefault = this.this$0.copydefault();
            int value = PnlDetailPageType.CURRENT_HOLDINGS.getValue();
            String unit = this.this$0.EZpvd().OLrzqt().getValue().getUnit();
            SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel3 = this.this$0;
            this.L$0 = unit;
            this.L$1 = jmeCopydefault;
            this.I$0 = value;
            this.label = 1;
            objOLrzqt = spotAnalysisPnlDetailViewModel3.OLrzqt(spotAnalysisPnlDetailViewModel3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str = unit;
            jme = jmeCopydefault;
            i = value;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    interfaceC49371unL = (InterfaceC49371unL) objEZpvd;
                    spotAnalysisPnlDetailViewModel = this.this$0;
                    jMF jmfAEQbTJ = spotAnalysisPnlDetailViewModel.AEQbTJ();
                    this.L$0 = interfaceC49371unL;
                    this.L$1 = spotAnalysisPnlDetailViewModel;
                    this.label = 3;
                    objEZpvd2 = jmfAEQbTJ.EZpvd(interfaceC49371unL, (Continuation) this);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    this.L$0 = interfaceC49371unL;
                    this.L$1 = null;
                    this.label = 4;
                    if (spotAnalysisPnlDetailViewModel.EZpvd((InterfaceC49371unL<Unit>) objEZpvd2, this) == objCopydefault) {
                    }
                    spotAnalysisPnlDetailViewModel2 = this.this$0;
                    this.L$0 = null;
                    this.label = 5;
                    if (spotAnalysisPnlDetailViewModel2.KWHzl((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    spotAnalysisPnlDetailViewModel2 = this.this$0;
                    this.L$0 = null;
                    this.label = 5;
                    if (spotAnalysisPnlDetailViewModel2.KWHzl((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModel4 = (SpotAnalysisPnlDetailViewModel) this.L$1;
                InterfaceC49371unL interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                spotAnalysisPnlDetailViewModel = spotAnalysisPnlDetailViewModel4;
                interfaceC49371unL = interfaceC49371unL2;
                objEZpvd2 = obj;
                this.L$0 = interfaceC49371unL;
                this.L$1 = null;
                this.label = 4;
                if (spotAnalysisPnlDetailViewModel.EZpvd((InterfaceC49371unL<Unit>) objEZpvd2, this) == objCopydefault) {
                    return objCopydefault;
                }
                spotAnalysisPnlDetailViewModel2 = this.this$0;
                this.L$0 = null;
                this.label = 5;
                if (spotAnalysisPnlDetailViewModel2.KWHzl((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            i = this.I$0;
            jME jme2 = (jME) this.L$1;
            String str2 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str2;
            jme = jme2;
            objOLrzqt = obj;
        }
        jME.Activity activity = new jME.Activity(str, this.$costPriceType, C56443yFo.AEQbTJ(i), C56443yFo.KWHzl(((C25973jNf) objOLrzqt).AYXKKw()), this.$uid);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        objEZpvd = jme.EZpvd(activity, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        interfaceC49371unL = (InterfaceC49371unL) objEZpvd;
        spotAnalysisPnlDetailViewModel = this.this$0;
        jMF jmfAEQbTJ2 = spotAnalysisPnlDetailViewModel.AEQbTJ();
        this.L$0 = interfaceC49371unL;
        this.L$1 = spotAnalysisPnlDetailViewModel;
        this.label = 3;
        objEZpvd2 = jmfAEQbTJ2.EZpvd(interfaceC49371unL, (Continuation) this);
        if (objEZpvd2 == objCopydefault) {
        }
        this.L$0 = interfaceC49371unL;
        this.L$1 = null;
        this.label = 4;
        if (spotAnalysisPnlDetailViewModel.EZpvd((InterfaceC49371unL<Unit>) objEZpvd2, this) == objCopydefault) {
        }
        spotAnalysisPnlDetailViewModel2 = this.this$0;
        this.L$0 = null;
        this.label = 5;
        if (spotAnalysisPnlDetailViewModel2.KWHzl((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, (Continuation<? super Unit>) this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
