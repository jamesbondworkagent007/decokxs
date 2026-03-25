package com.okinc.business.market.features.coincheck;

import androidx.lifecycle.MutableLiveData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AAL;
import o.ACT;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.jNF;
import o.pUU;
import uniffi.dex.CoinCheckResult;

/* JADX INFO: loaded from: classes6.dex */
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
        Object objAEQbTJ;
        jNF jnf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(new jNF(this.$needLoading, null, false, 6, null));
            ACT coinRisk = AAL.getCoinRisk(this.$tokenContractAddress, this.$chainId);
            C33077mpe c33077mpe = new C33077mpe(new CoinCheckViewModel$loadCoinCheckData$1$1$1(coinRisk), new CoinCheckViewModel$loadCoinCheckData$1$1$2(coinRisk), new CoinCheckViewModel$loadCoinCheckData$1$1$3(coinRisk), new CoinCheckViewModel$loadCoinCheckData$1$1$4(coinRisk), null, 16, null);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        CoinCheckViewModel coinCheckViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            CoinCheckResult coinCheckResult = (CoinCheckResult) objAEQbTJ;
            pUU.KWHzl("CoinCheckViewModel", "loadCoinCheckData core success");
            MutableLiveData mutableLiveData = coinCheckViewModel.OLrzqt;
            if (Intrinsics.EZpvd(coinCheckResult, CoinCheckResult.Activity.INSTANCE)) {
                jnf = new jNF(false, null, true, 3, null);
            } else {
                if (!(coinCheckResult instanceof CoinCheckResult.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                jnf = new jNF(false, ((CoinCheckResult.ActionBar) coinCheckResult).OLrzqt(), false, 5, null);
            }
            mutableLiveData.setValue(jnf);
        }
        CoinCheckViewModel coinCheckViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CoinCheckViewModel", "loadCoinCheckData core failed", thM7380exceptionOrNullimpl);
            coinCheckViewModel2.OLrzqt.setValue(new jNF(false, null, true, 3, null));
        }
        return Unit.INSTANCE;
    }
}
