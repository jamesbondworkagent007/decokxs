package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC20007gXl;
import o.C20013gXr;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.gLQ;
import o.gWN;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ Triple<String, String, String> $idTitleChain;
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingWalletPageStrategiesVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1(boolean z, CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM, Triple<String, String, String> triple, Continuation<? super CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1> continuation) {
        super(2, continuation);
        this.$active = z;
        this.this$0 = copyTradingWalletPageStrategiesVM;
        this.$idTitleChain = triple;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1(this.$active, this.this$0, this.$idTitleChain, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyStatus strategyStatus;
        Object objOLrzqt;
        StrategyStatus strategyStatus2;
        Throwable thM7380exceptionOrNullimpl;
        Object taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StrategyStatus strategyStatus3 = this.$active ? StrategyStatus.Active : StrategyStatus.Pause;
            gWN gwn = this.this$0.ejfBZ;
            this.L$0 = strategyStatus3;
            this.label = 1;
            Object objCheckSAState$default = gWN.checkSAState$default(gwn, null, this, 1, null);
            if (objCheckSAState$default == objCopydefault) {
                return objCopydefault;
            }
            strategyStatus = strategyStatus3;
            obj = objCheckSAState$default;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strategyStatus2 = (StrategyStatus) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM = this.this$0;
                Triple<String, String, String> triple = this.$idTitleChain;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    int iIntValue = ((Number) objOLrzqt).intValue();
                    MutableStateFlow mutableStateFlow = copyTradingWalletPageStrategiesVM.EZpvd;
                    if (iIntValue == 0) {
                        taskDescription = new AbstractC20007gXl.ActionBar(triple, false, strategyStatus2, null, null, 24, null);
                    } else {
                        taskDescription = new AbstractC20007gXl.TaskDescription(triple.getSecond(), strategyStatus2);
                    }
                    mutableStateFlow.setValue(taskDescription);
                }
                CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM2 = this.this$0;
                Triple<String, String, String> triple2 = this.$idTitleChain;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    boolean z2 = thM7380exceptionOrNullimpl instanceof OKServerException;
                    OKServerException oKServerException = z2 ? (OKServerException) thM7380exceptionOrNullimpl : null;
                    String message = oKServerException != null ? oKServerException.getMessage() : null;
                    MutableStateFlow mutableStateFlow2 = copyTradingWalletPageStrategiesVM2.EZpvd;
                    if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                        z = z2 ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
                    }
                    mutableStateFlow2.setValue(new AbstractC20007gXl.ActionBar(triple2, z, strategyStatus2, message, null, 16, null));
                }
                return Unit.INSTANCE;
            }
            StrategyStatus strategyStatus4 = (StrategyStatus) this.L$0;
            C56391yDq.AEQbTJ(obj);
            strategyStatus = strategyStatus4;
        }
        gLQ glq = (gLQ) obj;
        if (!this.$active || glq == null || this.this$0.AEQbTJ(glq)) {
            this.this$0.EZpvd.setValue(AbstractC20007gXl.Activity.copydefault);
            C20013gXr c20013gXr = this.this$0.isConnected;
            List<String> listEZpvd = C56402yEa.EZpvd(this.$idTitleChain.getFirst());
            this.L$0 = strategyStatus;
            this.label = 2;
            objOLrzqt = c20013gXr.OLrzqt(listEZpvd, strategyStatus, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            strategyStatus2 = strategyStatus;
            CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM3 = this.this$0;
            Triple<String, String, String> triple3 = this.$idTitleChain;
            if (Result.m7384isSuccessimpl(objOLrzqt)) {
            }
            CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM22 = this.this$0;
            Triple<String, String, String> triple22 = this.$idTitleChain;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        this.this$0.EZpvd.setValue(new AbstractC20007gXl.ActionBar(this.$idTitleChain, false, strategyStatus, null, glq, 8, null));
        return Unit.INSTANCE;
    }
}
