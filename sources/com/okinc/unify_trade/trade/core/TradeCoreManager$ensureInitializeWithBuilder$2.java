package com.okinc.unify_trade.trade.core;

import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1;
import com.okinc.unify_trade.trade.core.config.TradeInit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54610xOt;
import o.C54589xNz;
import o.C54614xOx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54572xNi;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xNA;
import o.xNH;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeCoreManager$ensureInitializeWithBuilder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super xNA>, Object> {
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ xNH $mergedConfig;
    final /* synthetic */ String $traceId;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreManager$ensureInitializeWithBuilder$2(String str, boolean z, xNH xnh, Continuation<? super TradeCoreManager$ensureInitializeWithBuilder$2> continuation) {
        super(2, continuation);
        this.$traceId = str;
        this.$isForce = z;
        this.$mergedConfig = xnh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreManager$ensureInitializeWithBuilder$2(this.$traceId, this.$isForce, this.$mergedConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super xNA> continuation) {
        return ((TradeCoreManager$ensureInitializeWithBuilder$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        C54589xNz c54589xNz;
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("trade_init", "[" + this.$traceId + "] ensureInitializeWithBuilder(isForce=" + this.$isForce + ", config=" + this.$mergedConfig + ")");
            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
            C54614xOx c54614xOx = (C54614xOx) C54589xNz.KWHzl(-2021296261, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 2021296261, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
            xNH xnh = this.$mergedConfig;
            boolean z = this.$isForce;
            String str = this.$traceId;
            this.L$0 = c54589xNz2;
            this.label = 1;
            objAEQbTJ = c54614xOx.AEQbTJ(xnh, z, str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c54589xNz = c54589xNz2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c54589xNz = (C54589xNz) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        C56391yDq.AEQbTJ(C54589xNz.copydefault(c54589xNz, (AbstractC54610xOt) objAEQbTJ));
        C54589xNz.AEQbTJ(C54589xNz.EZpvd, this.$mergedConfig);
        TradeInit.StateListAnimator stateListAnimator = TradeInit.Companion;
        if (stateListAnimator.KWHzl(this.$mergedConfig.AEQbTJ())) {
            if (C54589xNz.djBIcL() != null) {
                Result.Application application = Result.Companion;
                InterfaceC54581xNr interfaceC54581xNrDjBIcL = C54589xNz.djBIcL();
                Intrinsics.copydefault(interfaceC54581xNrDjBIcL);
                objM7377constructorimpl = Result.m7377constructorimpl(interfaceC54581xNrDjBIcL);
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("ITrade instance not initialized")));
            }
        } else {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(null);
        }
        if (stateListAnimator.AEQbTJ(this.$mergedConfig.AEQbTJ())) {
            if (((InterfaceC54572xNi) C54589xNz.KWHzl(1397675941, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), -1397675939, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ())) != null) {
                Result.Application application4 = Result.Companion;
                InterfaceC54572xNi interfaceC54572xNi = (InterfaceC54572xNi) C54589xNz.KWHzl(1397675941, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), -1397675939, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
                Intrinsics.copydefault(interfaceC54572xNi);
                objM7377constructorimpl2 = Result.m7377constructorimpl(interfaceC54572xNi);
            } else {
                Result.Application application5 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("IDexTrade instance not initialized")));
            }
        } else {
            Result.Application application6 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(null);
        }
        return new xNA(objM7377constructorimpl, objM7377constructorimpl2);
    }
}
