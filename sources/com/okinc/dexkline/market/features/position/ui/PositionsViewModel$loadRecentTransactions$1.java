package com.okinc.dexkline.market.features.position.ui;

import com.okinc.dexkline.dexlogic.txs.TxType;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34455ncR;
import o.C34466ncc;
import o.C34474nck;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$loadRecentTransactions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ long $lastItemId;
    Object L$0;
    Object L$1;
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TxType txType;
        Object objM7386unboximpl;
        TxType txType2;
        PositionsViewModel positionsViewModel;
        PositionsViewModel positionsViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TxType[] txTypeArrValues = TxType.values();
            PositionsViewModel positionsViewModel3 = this.this$0;
            int length = txTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    txType = null;
                    break;
                }
                txType = txTypeArrValues[i2];
                if (Intrinsics.EZpvd((Object) txType.getValue(), (Object) positionsViewModel3.EZpvd().isConnected())) {
                    break;
                }
                i2++;
            }
            TxType txType3 = txType == null ? TxType.ALL : txType;
            C34466ncc c34466ncc = this.this$0.iwGUEr;
            long j = this.$lastItemId;
            boolean z = this.this$0.fetchVPNInfo;
            PositionDetailsParam positionDetailsParam = this.this$0.AuCTel;
            this.L$0 = txType3;
            this.label = 1;
            Object objCopydefault2 = c34466ncc.copydefault(j, z, positionDetailsParam, txType3, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objCopydefault2;
            txType2 = txType3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                positionsViewModel2 = (PositionsViewModel) this.L$1;
                objM7386unboximpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                positionsViewModel = positionsViewModel2;
                positionsViewModel.KWHzl.setValue(new C34474nck(false, null, 3, null));
                PositionsViewModel positionsViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    positionsViewModel4.OLrzqt.setValue(new C34455ncR(false, false, false, null, thM7380exceptionOrNullimpl, true, 11, null));
                    positionsViewModel4.KWHzl.setValue(new C34474nck(false, null, 3, null));
                }
                return Unit.INSTANCE;
            }
            txType2 = (TxType) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        positionsViewModel = this.this$0;
        boolean z2 = this.$isFirstPage;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            Pair pair = (Pair) objM7386unboximpl;
            positionsViewModel.OLrzqt.setValue(new C34455ncR(false, false, ((Boolean) pair.component2()).booleanValue(), (List) pair.component1(), null, false, 51, null));
            if (z2 && positionsViewModel.fetchVPNInfo) {
                C34466ncc c34466ncc2 = positionsViewModel.iwGUEr;
                PositionDetailsParam positionDetailsParam2 = positionsViewModel.AuCTel;
                this.L$0 = objM7386unboximpl;
                this.L$1 = positionsViewModel;
                this.label = 2;
                if (c34466ncc2.KWHzl(positionDetailsParam2, txType2, this) == objCopydefault) {
                    return objCopydefault;
                }
                positionsViewModel2 = positionsViewModel;
                positionsViewModel = positionsViewModel2;
            }
            positionsViewModel.KWHzl.setValue(new C34474nck(false, null, 3, null));
        }
        PositionsViewModel positionsViewModel42 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
