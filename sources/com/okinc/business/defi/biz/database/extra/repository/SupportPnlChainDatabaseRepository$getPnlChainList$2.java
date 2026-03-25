package com.okinc.business.defi.biz.database.extra.repository;

import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11285cIo;
import o.C56391yDq;
import o.C56442yFn;
import o.cHZ;

/* JADX INFO: loaded from: classes4.dex */
public final class SupportPnlChainDatabaseRepository$getPnlChainList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SupportPnlChainEntity>>, Object> {
    int label;
    final /* synthetic */ C11285cIo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportPnlChainDatabaseRepository$getPnlChainList$2(C11285cIo c11285cIo, Continuation<? super SupportPnlChainDatabaseRepository$getPnlChainList$2> continuation) {
        super(2, continuation);
        this.this$0 = c11285cIo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportPnlChainDatabaseRepository$getPnlChainList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SupportPnlChainEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SupportPnlChainEntity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SupportPnlChainEntity>> continuation) {
        return ((SupportPnlChainDatabaseRepository$getPnlChainList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cHZ chz = this.this$0.AEQbTJ;
            this.label = 1;
            obj = chz.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
