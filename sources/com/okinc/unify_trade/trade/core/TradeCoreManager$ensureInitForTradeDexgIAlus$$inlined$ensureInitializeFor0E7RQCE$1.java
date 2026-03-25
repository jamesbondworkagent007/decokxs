package com.okinc.unify_trade.trade.core;

import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1;
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
import o.C56524yIo;
import o.InterfaceC54572xNi;
import o.InterfaceC54581xNr;
import o.InterfaceC56551yJo;
import o.pUU;
import o.xNC;
import o.xNH;

/* JADX INFO: renamed from: com.okinc.unify_trade.trade.core.TradeCoreManager$ensureInitForTradeDex-gIAlu-s$$inlined$ensureInitializeFor-0E7RQCE$1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC54572xNi>>, Object> {
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ String $traceId;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1(String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$traceId = str;
        this.$isForce = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1(this.$traceId, this.$isForce, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC54572xNi>> continuation) {
        return ((TradeCoreManager$ensureInitForTradeDexgIAlus$$inlined$ensureInitializeFor0E7RQCE$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xNH xnhCopydefault;
        Object objAEQbTJ;
        C54589xNz c54589xNz;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xNC xnc = new xNC();
            xnc.OLrzqt();
            xnhCopydefault = xnc.copydefault();
            pUU.KWHzl("trade_init", "[" + this.$traceId + "] Initializing " + C56524yIo.AEQbTJ(InterfaceC54572xNi.class).valueOf() + " with config=" + xnhCopydefault + ", isForce=" + this.$isForce);
            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
            C54614xOx c54614xOx = (C54614xOx) C54589xNz.KWHzl(-2021296261, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 2021296261, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
            boolean z = this.$isForce;
            String str = this.$traceId;
            this.L$0 = xnhCopydefault;
            this.L$1 = c54589xNz2;
            this.label = 1;
            objAEQbTJ = c54614xOx.AEQbTJ(xnhCopydefault, z, str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c54589xNz = c54589xNz2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c54589xNz = (C54589xNz) this.L$1;
            xnhCopydefault = (xNH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        C56391yDq.AEQbTJ(C54589xNz.copydefault(c54589xNz, (AbstractC54610xOt) objAEQbTJ));
        C54589xNz.AEQbTJ(C54589xNz.EZpvd, xnhCopydefault);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(InterfaceC54572xNi.class);
        if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(InterfaceC54581xNr.class))) {
            if (C54589xNz.djBIcL() != null) {
                Result.Application application = Result.Companion;
                InterfaceC54581xNr interfaceC54581xNrDjBIcL = C54589xNz.djBIcL();
                Intrinsics.copydefault(interfaceC54581xNrDjBIcL);
                if (interfaceC54581xNrDjBIcL == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.okinc.unify_trade.trade.core.IDexTrade");
                }
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC54572xNi) interfaceC54581xNrDjBIcL);
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("")));
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(InterfaceC54572xNi.class))) {
            if (((InterfaceC54572xNi) C54589xNz.KWHzl(1397675941, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), -1397675939, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ())) != null) {
                Result.Application application3 = Result.Companion;
                InterfaceC54572xNi interfaceC54572xNi = (InterfaceC54572xNi) C54589xNz.KWHzl(1397675941, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), -1397675939, new Object[0], EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
                Intrinsics.copydefault(interfaceC54572xNi);
                if (interfaceC54572xNi == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.okinc.unify_trade.trade.core.IDexTrade");
                }
                objM7377constructorimpl = Result.m7377constructorimpl(interfaceC54572xNi);
            } else {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("")));
            }
        } else {
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("")));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
