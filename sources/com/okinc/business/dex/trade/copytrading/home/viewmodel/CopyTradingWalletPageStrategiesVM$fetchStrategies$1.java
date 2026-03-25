package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gWI;
import o.gWK;
import o.gWO;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingWalletPageStrategiesVM$fetchStrategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $refresh;
    int label;
    final /* synthetic */ CopyTradingWalletPageStrategiesVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingWalletPageStrategiesVM$fetchStrategies$1(CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM, boolean z, Continuation<? super CopyTradingWalletPageStrategiesVM$fetchStrategies$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingWalletPageStrategiesVM;
        this.$refresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingWalletPageStrategiesVM$fetchStrategies$1(this.this$0, this.$refresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingWalletPageStrategiesVM$fetchStrategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.this$0.AEQbTJ.getValue() instanceof gWO.Application;
            if (this.$refresh) {
                this.this$0.AEQbTJ.setValue(new gWO.ActionBar(!z));
            }
            gWI gwi = this.this$0.KWHzl;
            this.label = 1;
            obj = gwi.OLrzqt(this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM = this.this$0;
                boolean z2 = this.$refresh;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    copyTradingWalletPageStrategiesVM.copydefault((OrderListPagerResult<CTStrategy>) objCopydefault, z2);
                }
                CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    copyTradingWalletPageStrategiesVM2.OLrzqt(thM7380exceptionOrNullimpl);
                }
                Result.m7376boximpl(objCopydefault);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (C33129mqd.valueOf(C56443yFo.AEQbTJ(((Number) obj).intValue()), C56443yFo.AEQbTJ(0))) {
            this.this$0.copydefault();
            return Unit.INSTANCE;
        }
        String str = this.$refresh ? "" : this.this$0.valueOf;
        gWK gwk = this.this$0.DbNXlk;
        String str2 = this.this$0.copydefault;
        this.label = 2;
        objCopydefault = gwk.copydefault(str, false, str2, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM3 = this.this$0;
        boolean z22 = this.$refresh;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        Result.m7376boximpl(objCopydefault);
        return Unit.INSTANCE;
    }
}
