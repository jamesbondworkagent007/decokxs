package com.okinc.business.defi.wallet.eip7702.ui.viewmodel;

import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C15272eCe;
import o.C56391yDq;
import o.C56442yFn;
import o.eCH;

/* JADX INFO: loaded from: classes5.dex */
public final class EIP7702UpgradeViewModel$refreshChainStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ eCH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702UpgradeViewModel$refreshChainStatus$1(eCH ech, Continuation<? super EIP7702UpgradeViewModel$refreshChainStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = ech;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702UpgradeViewModel$refreshChainStatus$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702UpgradeViewModel$refreshChainStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        eCH ech;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ech = this.this$0;
            Result.Application application2 = Result.Companion;
            C15272eCe c15272eCe = ech.OLrzqt;
            String str = ech.AYXKKw;
            if (str == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = ech;
            this.label = 1;
            objAEQbTJ = c15272eCe.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            ech = (eCH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        for (Object obj2 : ((EIP7702ChainStatusResp) objAEQbTJ).getChainList()) {
            long chainIndex = ((EIP7702ChainStatusResp.ChainStatusItem) obj2).getChainIndex();
            Long l = ech.copydefault;
            if (l != null && chainIndex == l.longValue()) {
                objM7377constructorimpl = Result.m7377constructorimpl((EIP7702ChainStatusResp.ChainStatusItem) obj2);
                eCH ech2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    MutableSharedFlow mutableSharedFlow = ech2.AEQbTJ;
                    this.L$0 = objM7377constructorimpl;
                    this.label = 2;
                    if (mutableSharedFlow.emit((EIP7702ChainStatusResp.ChainStatusItem) objM7377constructorimpl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
