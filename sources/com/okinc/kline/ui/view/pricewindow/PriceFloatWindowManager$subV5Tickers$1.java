package com.okinc.kline.ui.view.pricewindow;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pBO;

/* JADX INFO: loaded from: classes9.dex */
public final class PriceFloatWindowManager$subV5Tickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceFloatWindowManager$subV5Tickers$1(Continuation<? super PriceFloatWindowManager$subV5Tickers$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceFloatWindowManager$subV5Tickers$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceFloatWindowManager$subV5Tickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:27:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        Iterator it;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((AbstractC54531xLw) obj) != null) {
                    pBO pbo = pBO.dxcTrN;
                    pbo.valueOf().addAndGet(1);
                    if (pbo.valueOf().get() == pbo.fetchVPNInfo().size()) {
                        pbo.AEQbTJ((ArrayList<String>) pbo.AhwBna());
                    }
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                    if (interfaceC54581xNr != null) {
                        this.L$0 = obj2;
                        this.L$1 = it;
                        this.label = 2;
                        obj = interfaceC54581xNr.EZpvd(str, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        if (((AbstractC54531xLw) obj) != null) {
                        }
                        while (it.hasNext()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            pBO pbo2 = pBO.dxcTrN;
            pbo2.gHZMYf();
            it = pbo2.fetchVPNInfo().iterator();
            obj2 = objM8790ensureInitialize0E7RQCE$default;
            while (it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }
}
