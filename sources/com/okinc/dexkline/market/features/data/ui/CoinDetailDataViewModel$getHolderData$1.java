package com.okinc.dexkline.market.features.data.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32254mVe;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mXJ;
import o.mXK;
import o.mXM;
import o.mXQ;

/* JADX INFO: loaded from: classes8.dex */
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
        boolean zCopydefault;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            boolean z = this.$isRefresh;
            mutableStateFlow.setValue(new mXJ(new mXK((z || this.$isReload) ? false : true, this.$isReload, z), false, null, 6, null));
            zCopydefault = this.this$0.isConnected.copydefault(this.this$0.copydefault().getChainId(), this.this$0.copydefault().getTokenContractAddress());
            C32254mVe c32254mVe = this.this$0.isConnected;
            String chainId = this.this$0.copydefault().getChainId();
            this.Z$0 = zCopydefault;
            this.label = 1;
            obj = c32254mVe.EZpvd(chainId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                CoinDetailDataViewModel coinDetailDataViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    coinDetailDataViewModel.AEQbTJ.setValue(new mXJ(null, false, (mXM) objKWHzl, 3, null));
                }
                CoinDetailDataViewModel coinDetailDataViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
                    coinDetailDataViewModel2.AEQbTJ.setValue(new mXJ(null, true, null, 5, null));
                }
                return Unit.INSTANCE;
            }
            zCopydefault = this.Z$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.KWHzl.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(zCopydefault), C56443yFo.KWHzl(((Boolean) obj).booleanValue())));
        mXQ mxq = this.this$0.AYXKKw;
        String chainId2 = this.this$0.copydefault().getChainId();
        String tokenContractAddress = this.this$0.copydefault().getTokenContractAddress();
        this.label = 2;
        objKWHzl = mxq.KWHzl(chainId2, tokenContractAddress, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        CoinDetailDataViewModel coinDetailDataViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        CoinDetailDataViewModel coinDetailDataViewModel22 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
        }
        return Unit.INSTANCE;
    }
}
