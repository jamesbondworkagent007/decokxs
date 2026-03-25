package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17922fXg;
import o.C17924fXi;
import o.C56391yDq;
import o.C56442yFn;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletViewModel$fetchMetaData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$fetchMetaData$1(eUI eui, Continuation<? super WalletViewModel$fetchMetaData$1> continuation) {
        super(2, continuation);
        this.this$0 = eui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$fetchMetaData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$fetchMetaData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.ORxRYg) {
                this.this$0.ORxRYg = false;
                C17924fXi c17924fXi = this.this$0.fFgQHt;
                this.label = 1;
                obj = c17924fXi.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        TeeMetadata teeMetadata = (TeeMetadata) obj;
        if (teeMetadata != null) {
            C17922fXg.KWHzl(teeMetadata);
        }
        return Unit.INSTANCE;
    }
}
