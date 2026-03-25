package com.okinc.kline.ui;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C38614pck;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineMoreTradeFragment$initBizData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C38614pck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineMoreTradeFragment$initBizData$1(C38614pck c38614pck, Continuation<? super KLineMoreTradeFragment$initBizData$1> continuation) {
        super(2, continuation);
        this.this$0 = c38614pck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineMoreTradeFragment$initBizData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineMoreTradeFragment$initBizData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:39:0x00c9) to fix multi-entry loop: BACK_EDGE: B:39:0x00c9 -> B:18:0x006f */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        r5.KWHzl(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        C38614pck c38614pck;
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
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                c38614pck = (C38614pck) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8790ensureInitialize0E7RQCE$default = obj2;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default) ? null : objM8790ensureInitialize0E7RQCE$default);
                    if (interfaceC54581xNr != null) {
                        this.L$0 = objM8790ensureInitialize0E7RQCE$default;
                        this.L$1 = c38614pck;
                        this.L$2 = it;
                        this.label = 2;
                        Object objEZpvd = interfaceC54581xNr.EZpvd(str, this);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objM8790ensureInitialize0E7RQCE$default;
                        obj = objEZpvd;
                        if (((AbstractC54531xLw) obj) == null) {
                            c38614pck.EZpvd.addAndGet(1);
                            if (c38614pck.EZpvd.get() == c38614pck.values.size()) {
                                this.L$0 = obj2;
                                this.L$1 = c38614pck;
                                this.L$2 = it;
                                this.label = 3;
                                if (c38614pck.EZpvd((Continuation<? super Unit>) this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            objM8790ensureInitialize0E7RQCE$default = obj2;
                            while (it.hasNext()) {
                            }
                        } else {
                            objM8790ensureInitialize0E7RQCE$default = obj2;
                        }
                    }
                    c38614pck.KWHzl(true);
                    while (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            it = (Iterator) this.L$2;
            c38614pck = (C38614pck) this.L$1;
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (((AbstractC54531xLw) obj) == null) {
            }
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            this.this$0.EZpvd.set(0);
            ArrayList arrayList = this.this$0.values;
            c38614pck = this.this$0;
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        this.this$0.KWHzl(true);
        return Unit.INSTANCE;
    }
}
