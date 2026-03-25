package com.okinc.business.market.features.data.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27633jyq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jQD;
import o.jQE;
import o.jQF;
import o.jQG;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinDetailDataViewModel$getHolderData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ boolean $isReload;
    boolean Z$0;
    int label;
    final /* synthetic */ CoinDetailDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailDataViewModel$getHolderData$1(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, Continuation<? super CoinDetailDataViewModel$getHolderData$1> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailDataViewModel;
        this.$isRefresh = z;
        this.$isReload = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailDataViewModel$getHolderData$1(this.this$0, this.$isRefresh, this.$isReload, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailDataViewModel$getHolderData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zAEQbTJ;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            boolean z = this.$isRefresh;
            mutableStateFlow.setValue(new jQG(new jQE((z || this.$isReload) ? false : true, this.$isReload, z), false, null, 6, null));
            zAEQbTJ = this.this$0.fetchVPNInfo.AEQbTJ(this.this$0.valueOf().getChainId(), this.this$0.valueOf().getTokenContractAddress());
            C27633jyq c27633jyq = this.this$0.fetchVPNInfo;
            String chainId = this.this$0.valueOf().getChainId();
            this.Z$0 = zAEQbTJ;
            this.label = 1;
            obj = c27633jyq.copydefault(chainId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                CoinDetailDataViewModel coinDetailDataViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    coinDetailDataViewModel.KWHzl.setValue(new jQG(null, false, (jQD) objEZpvd, 3, null));
                }
                CoinDetailDataViewModel coinDetailDataViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    coinDetailDataViewModel2.KWHzl.setValue(new jQG(null, true, null, 5, null));
                }
                return Unit.INSTANCE;
            }
            zAEQbTJ = this.Z$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.OLrzqt.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(zAEQbTJ), C56443yFo.KWHzl(((Boolean) obj).booleanValue())));
        jQF jqf = this.this$0.valueOf;
        String chainId2 = this.this$0.valueOf().getChainId();
        String tokenContractAddress = this.this$0.valueOf().getTokenContractAddress();
        this.label = 2;
        objEZpvd = jqf.EZpvd(chainId2, tokenContractAddress, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        CoinDetailDataViewModel coinDetailDataViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
        }
        CoinDetailDataViewModel coinDetailDataViewModel22 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }
}
