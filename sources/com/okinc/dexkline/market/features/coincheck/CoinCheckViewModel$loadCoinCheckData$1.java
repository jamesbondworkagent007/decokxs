package com.okinc.dexkline.market.features.coincheck;

import com.okinc.dexkline.market.common.constants.RiskControlLevel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32296mWt;
import o.C32299mWw;
import o.C32302mWz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinCheckViewModel$loadCoinCheckData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $needLoading;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ CoinCheckViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinCheckViewModel$loadCoinCheckData$1(CoinCheckViewModel coinCheckViewModel, boolean z, String str, String str2, Continuation<? super CoinCheckViewModel$loadCoinCheckData$1> continuation) {
        super(2, continuation);
        this.this$0 = coinCheckViewModel;
        this.$needLoading = z;
        this.$tokenContractAddress = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinCheckViewModel$loadCoinCheckData$1(this.this$0, this.$needLoading, this.$tokenContractAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinCheckViewModel$loadCoinCheckData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(new C32296mWt(this.$needLoading, null, false, 6, null));
            C32302mWz c32302mWz = this.this$0.KWHzl;
            String str = this.$tokenContractAddress;
            String str2 = this.$chainId;
            this.label = 1;
            objKWHzl = c32302mWz.KWHzl(str, str2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        CoinCheckViewModel coinCheckViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            coinCheckViewModel.OLrzqt.setValue(new C32296mWt(false, (C32299mWw) objKWHzl, false, 5, null));
        }
        CoinCheckViewModel coinCheckViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            OKServerException oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
            Throwable origin = oKServerException != null ? oKServerException.getOrigin() : null;
            OKServerException oKServerException2 = origin instanceof OKServerException ? (OKServerException) origin : null;
            if (oKServerException2 == null || oKServerException2.getCode() != coinCheckViewModel2.copydefault) {
                coinCheckViewModel2.OLrzqt.setValue(new C32296mWt(false, null, true, 3, null));
            } else {
                coinCheckViewModel2.OLrzqt.setValue(new C32296mWt(false, new C32299mWw(null, null, null, null, null, null, null, RiskControlLevel.UNKNOWN, 127, null), false, 5, null));
            }
        }
        return Unit.INSTANCE;
    }
}
