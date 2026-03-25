package com.okinc.business.market.features.position.ui;

import com.okinc.business.dexlogic.txs.TxType;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C29128knm;
import o.C29176koh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$loadRecentTransactions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ long $lastItemId;
    Object L$0;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$loadRecentTransactions$1(PositionsViewModel positionsViewModel, long j, boolean z, Continuation<? super PositionsViewModel$loadRecentTransactions$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$lastItemId = j;
        this.$isFirstPage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$loadRecentTransactions$1(this.this$0, this.$lastItemId, this.$isFirstPage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$loadRecentTransactions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TxType next;
        TxType txType;
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC56445yFq<TxType> entries = TxType.getEntries();
            PositionsViewModel positionsViewModel = this.this$0;
            Iterator<TxType> it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) positionsViewModel.AEQbTJ().DbNXlk())) {
                    break;
                }
            }
            TxType txType2 = next;
            txType = txType2 == null ? TxType.ALL : txType2;
            C29128knm c29128knm = this.this$0.uzCIH;
            long j = this.$lastItemId;
            boolean z = this.this$0.isConnected;
            PositionDetailsParam positionDetailsParam = this.this$0.getNewProxyInstance;
            this.L$0 = txType;
            this.label = 1;
            objCopydefault = c29128knm.copydefault(j, z, positionDetailsParam, txType, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objCopydefault = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PositionsViewModel positionsViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    positionsViewModel2.AhwBna.setValue(new C29176koh(false, false, false, null, thM7380exceptionOrNullimpl, true, 11, null));
                }
                return Unit.INSTANCE;
            }
            TxType txType3 = (TxType) this.L$0;
            C56391yDq.AEQbTJ(obj);
            txType = txType3;
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        PositionsViewModel positionsViewModel3 = this.this$0;
        boolean z2 = this.$isFirstPage;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            Pair pair = (Pair) objCopydefault;
            positionsViewModel3.AhwBna.setValue(new C29176koh(false, false, ((Boolean) pair.component2()).booleanValue(), (List) pair.component1(), null, false, 51, null));
            if (z2 && positionsViewModel3.isConnected) {
                C29128knm c29128knm2 = positionsViewModel3.uzCIH;
                PositionDetailsParam positionDetailsParam2 = positionsViewModel3.getNewProxyInstance;
                this.L$0 = objCopydefault;
                this.label = 2;
                if (c29128knm2.KWHzl(positionDetailsParam2, txType, this) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        }
        PositionsViewModel positionsViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
