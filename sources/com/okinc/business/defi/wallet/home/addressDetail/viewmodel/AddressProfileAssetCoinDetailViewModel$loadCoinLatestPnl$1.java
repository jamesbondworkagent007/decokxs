package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    int label;
    final /* synthetic */ AddressProfileAssetCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1(AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel, long j, String str, String str2, Continuation<? super AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetCoinDetailViewModel;
        this.$chainId = j;
        this.$address = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1(this.this$0, this.$chainId, this.$address, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbuDjBIcL = this.this$0.djBIcL();
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$chainId));
            String str = this.$address;
            String str2 = this.$tokenAddress;
            this.label = 1;
            obj = c13934dbuDjBIcL.KWHzl(strGEmmrt, str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            WalletCoinLatestPnlResponse walletCoinLatestPnlResponse = (WalletCoinLatestPnlResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableSharedFlow mutableSharedFlow = addressProfileAssetCoinDetailViewModel.copydefault;
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow.emit(walletCoinLatestPnlResponse, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
