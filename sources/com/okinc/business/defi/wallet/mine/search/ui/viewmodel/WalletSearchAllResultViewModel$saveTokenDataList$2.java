package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C18914frR;
import o.C18982fsg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchAllResultViewModel$saveTokenDataList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18982fsg $requireData;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletSearchAllResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchAllResultViewModel$saveTokenDataList$2(WalletSearchAllResultViewModel walletSearchAllResultViewModel, C18982fsg c18982fsg, Continuation<? super WalletSearchAllResultViewModel$saveTokenDataList$2> continuation) {
        super(2, continuation);
        this.this$0 = walletSearchAllResultViewModel;
        this.$requireData = c18982fsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchAllResultViewModel$saveTokenDataList$2(this.this$0, this.$requireData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchAllResultViewModel$saveTokenDataList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        OKServerException oKServerException;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18914frR c18914frR = this.this$0.fetchVPNInfo;
            long jOLrzqt = this.$requireData.copydefault().OLrzqt();
            String strOLrzqt = this.$requireData.OLrzqt();
            this.label = 1;
            obj = c18914frR.copydefault(String.valueOf(jOLrzqt), strOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oKServerException = (OKServerException) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault("WalletSearchAllResultViewModel", "error message = " + oKServerException.getMessage());
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                WalletSearchAllResultViewModel walletSearchAllResultViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException2 = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    MutableSharedFlow mutableSharedFlow = walletSearchAllResultViewModel.AEQbTJ;
                    this.L$0 = abstractC43419rot;
                    this.L$1 = oKServerException2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    oKServerException = oKServerException2;
                    pUU.copydefault("WalletSearchAllResultViewModel", "error message = " + oKServerException.getMessage());
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        WalletSearchAllResultViewModel walletSearchAllResultViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            SearchRecommendResponse searchRecommendResponse = (SearchRecommendResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableSharedFlow mutableSharedFlow2 = walletSearchAllResultViewModel2.AEQbTJ;
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(searchRecommendResponse, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        WalletSearchAllResultViewModel walletSearchAllResultViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
