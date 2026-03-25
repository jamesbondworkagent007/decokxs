package com.okinc.business.defi.wallet.home.walletconnect;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C18347fgg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectConnectionViewModel$initListeners$walletFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC12782ctV>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $initState;
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18347fgg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionViewModel$initListeners$walletFlow$1(String str, C18347fgg c18347fgg, int i, Continuation<? super WalletConnectConnectionViewModel$initListeners$walletFlow$1> continuation) {
        super(2, continuation);
        this.$walletId = str;
        this.this$0 = c18347fgg;
        this.$initState = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletConnectConnectionViewModel$initListeners$walletFlow$1 walletConnectConnectionViewModel$initListeners$walletFlow$1 = new WalletConnectConnectionViewModel$initListeners$walletFlow$1(this.$walletId, this.this$0, this.$initState, continuation);
        walletConnectConnectionViewModel$initListeners$walletFlow$1.L$0 = obj;
        return walletConnectConnectionViewModel$initListeners$walletFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC12782ctV> flowCollector, Continuation<? super Unit> continuation) {
        return ((WalletConnectConnectionViewModel$initListeners$walletFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0008 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r12;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = this.$walletId;
            C18347fgg c18347fgg = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = StringsKt__StringsKt.fARcdN((CharSequence) str) ^ true ? c18347fgg.AEQbTJ.OLrzqt(str, true) : c18347fgg.AEQbTJ.copydefault(true);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
            r12 = flowCollector;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = flowCollector2;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        r1 = r12;
        int i = this.$initState;
        String str2 = this.$walletId;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectConnectionViewModel", "initListeners(" + i + ", " + str2 + ")", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        this.L$0 = null;
        this.label = 2;
        if (r1.emit((AbstractC12782ctV) objM7377constructorimpl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
