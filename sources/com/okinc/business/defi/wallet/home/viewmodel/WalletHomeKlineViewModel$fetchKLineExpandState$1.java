package com.okinc.business.defi.wallet.home.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C18275ffN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeKlineViewModel$fetchKLineExpandState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C18275ffN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeKlineViewModel$fetchKLineExpandState$1(AbstractC12782ctV abstractC12782ctV, C18275ffN c18275ffN, Continuation<? super WalletHomeKlineViewModel$fetchKLineExpandState$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c18275ffN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeKlineViewModel$fetchKLineExpandState$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeKlineViewModel$fetchKLineExpandState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC9738bbJ interfaceC9738bbJ;
        MutableStateFlow mutableStateFlow;
        Boolean boolKWHzl;
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
            interfaceC9738bbJ = this.$wallet;
            if (interfaceC9738bbJ == null) {
                C18275ffN c18275ffN = this.this$0;
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = c18275ffN.AkhnZx.KWHzl();
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            boolean zCopydefault = this.this$0.valueOf.copydefault(interfaceC9738bbJ.DbNXlk());
            mutableStateFlow = this.this$0.copydefault;
            boolKWHzl = C56443yFo.KWHzl(zCopydefault);
            this.label = 2;
            if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) obj);
        C18275ffN c18275ffN2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletHomeKlineViewModel", "fetchKlineState error", thM7380exceptionOrNullimpl);
            c18275ffN2.valueOf();
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
        if (interfaceC9738bbJ == null) {
            return Unit.INSTANCE;
        }
        boolean zCopydefault2 = this.this$0.valueOf.copydefault(interfaceC9738bbJ.DbNXlk());
        mutableStateFlow = this.this$0.copydefault;
        boolKWHzl = C56443yFo.KWHzl(zCopydefault2);
        this.label = 2;
        if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
