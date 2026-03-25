package com.okinc.lifecycle.impl.clipboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38074pLg;
import o.C56391yDq;
import o.C56442yFn;
import o.pKA;
import o.pKB;

/* JADX INFO: loaded from: classes9.dex */
public final class ClipBoardContentManagerImpl$checkClipContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38074pLg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipBoardContentManagerImpl$checkClipContent$1(C38074pLg c38074pLg, Continuation<? super ClipBoardContentManagerImpl$checkClipContent$1> continuation) {
        super(2, continuation);
        this.this$0 = c38074pLg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClipBoardContentManagerImpl$checkClipContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClipBoardContentManagerImpl$checkClipContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        pKB pkb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.copydefault.EZpvd()) {
                C38074pLg c38074pLg = this.this$0;
                this.label = 1;
                if (c38074pLg.KWHzl((Continuation<? super Boolean>) this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            if (this.this$0.gEmmrt()) {
                C38074pLg c38074pLg2 = this.this$0;
                this.label = 2;
                obj = c38074pLg2.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                pkb = (pKB) obj;
                if (pkb != null) {
                }
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            pkb = (pKB) obj;
            if (pkb != null) {
                C38074pLg c38074pLg3 = this.this$0;
                if (c38074pLg3.djBIcL().containsKey(pkb.EZpvd())) {
                    pKA pka = c38074pLg3.djBIcL().get(pkb.EZpvd());
                    if (pka != null) {
                        pka.AEQbTJ(pkb);
                    }
                    c38074pLg3.OLrzqt();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
