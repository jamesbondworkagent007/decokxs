package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.eWW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AddressProfileAssetCoinInformationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1(AddressProfileAssetCoinInformationViewModel addressProfileAssetCoinInformationViewModel, long j, String str, Continuation<? super AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetCoinInformationViewModel;
        this.$chainId = j;
        this.$tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eWW eww = this.this$0.copydefault;
            long j = this.$chainId;
            String str = this.$tokenAddress;
            this.label = 1;
            obj = eww.EZpvd(j, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                AddressProfileAssetCoinInformationViewModel addressProfileAssetCoinInformationViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    addressProfileAssetCoinInformationViewModel.KWHzl(false);
                    pUU.copydefault("AddressProfileAssetCoinInformationViewModel", "error message:" + oKServerException.getMessage());
                    MutableSharedFlow<CoinInfoBean> mutableSharedFlowAEQbTJ = addressProfileAssetCoinInformationViewModel.AEQbTJ();
                    this.L$0 = abstractC43419rot;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableSharedFlowAEQbTJ.emit(null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        AddressProfileAssetCoinInformationViewModel addressProfileAssetCoinInformationViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            CoinInfoBean coinInfoBean = (CoinInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            addressProfileAssetCoinInformationViewModel2.KWHzl(true);
            MutableSharedFlow<CoinInfoBean> mutableSharedFlowAEQbTJ2 = addressProfileAssetCoinInformationViewModel2.AEQbTJ();
            this.L$0 = abstractC43419rot;
            this.L$1 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlowAEQbTJ2.emit(coinInfoBean, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        AddressProfileAssetCoinInformationViewModel addressProfileAssetCoinInformationViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
