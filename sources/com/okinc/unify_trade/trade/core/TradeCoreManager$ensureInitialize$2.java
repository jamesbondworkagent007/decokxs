package com.okinc.unify_trade.trade.core;

import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1;
import com.okinc.tradeapi.bean.BizApiException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54610xOt;
import o.C54582xNs;
import o.C54588xNy;
import o.C54589xNz;
import o.C54614xOx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeCoreManager$ensureInitialize$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC54581xNr>>, Object> {
    final /* synthetic */ C54588xNy $config;
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ String $traceId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreManager$ensureInitialize$2(String str, C54588xNy c54588xNy, boolean z, Continuation<? super TradeCoreManager$ensureInitialize$2> continuation) {
        super(2, continuation);
        this.$traceId = str;
        this.$config = c54588xNy;
        this.$isForce = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreManager$ensureInitialize$2(this.$traceId, this.$config, this.$isForce, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC54581xNr>> continuation) {
        return ((TradeCoreManager$ensureInitialize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("trade_init", "[" + this.$traceId + "] ensureInitialize, dispatchers");
            C54614xOx c54614xOx = (C54614xOx) C54589xNz.KWHzl(-2021296261, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 2021296261, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
            C54588xNy c54588xNy = this.$config;
            boolean z = this.$isForce;
            String str = this.$traceId;
            this.label = 1;
            obj = c54614xOx.AEQbTJ(c54588xNy, z, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC54610xOt abstractC54610xOt = (AbstractC54610xOt) obj;
        pUU.KWHzl("trade_init", "[" + this.$traceId + "] tradecore manager, loadTrade(" + this.$isForce + ")=" + abstractC54610xOt);
        if (abstractC54610xOt instanceof AbstractC54610xOt.TaskDescription) {
            if (C54589xNz.djBIcL() == null) {
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                C54589xNz.copydefault(new C54582xNs((C54614xOx) C54589xNz.KWHzl(-2021296261, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 2021296261, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ())));
                C54589xNz.AYXKKw().EZpvd().OLrzqt();
            }
            InterfaceC54581xNr interfaceC54581xNrDjBIcL = C54589xNz.djBIcL();
            if (interfaceC54581xNrDjBIcL != null) {
                interfaceC54581xNrDjBIcL.AxsJAY();
                interfaceC54581xNrDjBIcL.QOLQEE();
            }
            Result.Application application = Result.Companion;
            InterfaceC54581xNr interfaceC54581xNrDjBIcL2 = C54589xNz.djBIcL();
            Intrinsics.copydefault(interfaceC54581xNrDjBIcL2);
            objM7377constructorimpl = Result.m7377constructorimpl(interfaceC54581xNrDjBIcL2);
        } else {
            if (!(abstractC54610xOt instanceof AbstractC54610xOt.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new BizApiException(((AbstractC54610xOt.StateListAnimator) abstractC54610xOt).copydefault(), null, null, null, null, 30, null)));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
