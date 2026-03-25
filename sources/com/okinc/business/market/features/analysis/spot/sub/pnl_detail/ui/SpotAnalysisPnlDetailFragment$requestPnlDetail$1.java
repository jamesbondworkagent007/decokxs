package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25973jNf;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.jMI;
import o.xOW;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$requestPnlDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PnlDetailPageType.values().length];
            try {
                iArr[PnlDetailPageType.ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PnlDetailPageType.CURRENT_HOLDINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$requestPnlDetail$1(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$requestPnlDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailFragment$requestPnlDetail$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$requestPnlDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:7:0x0013, B:26:0x0053, B:29:0x0066, B:31:0x0074, B:33:0x007a, B:34:0x007e, B:35:0x0082, B:36:0x0087, B:37:0x0088, B:39:0x0096, B:41:0x009c, B:42:0x00a0, B:11:0x001f, B:17:0x0035, B:19:0x0039, B:22:0x0040, B:45:0x00ab, B:14:0x0026), top: B:51:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                SpotAnalysisViewModel spotAnalysisViewModelAYXKKw = this.this$0.AYXKKw();
                this.label = 1;
                obj = spotAnalysisViewModelAYXKKw.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    i = TaskDescription.EZpvd[((C25973jNf) obj).copydefault().ordinal()];
                    String strSSMYrx = null;
                    if (i != 1) {
                        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna = this.this$0.AhwBna();
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                            strSSMYrx = newProxyInstance.sSMYrx();
                        }
                        spotAnalysisPnlDetailViewModelAhwBna.KWHzl(strSSMYrx, str);
                    } else if (i == 2) {
                        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna2 = this.this$0.AhwBna();
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
                            strSSMYrx = newProxyInstance2.sSMYrx();
                        }
                        spotAnalysisPnlDetailViewModelAhwBna2.copydefault(strSSMYrx, str);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.djBIcL = false;
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                jMI jmi = this.this$0;
                SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna3 = jmi.AhwBna();
                this.L$0 = str2;
                this.label = 2;
                Object objAEQbTJ = jmi.AEQbTJ(spotAnalysisPnlDetailViewModelAhwBna3, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
                obj = objAEQbTJ;
                i = TaskDescription.EZpvd[((C25973jNf) obj).copydefault().ordinal()];
                String strSSMYrx2 = null;
                if (i != 1) {
                }
                this.this$0.djBIcL = false;
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        } finally {
            this.this$0.djBIcL = false;
        }
    }
}
