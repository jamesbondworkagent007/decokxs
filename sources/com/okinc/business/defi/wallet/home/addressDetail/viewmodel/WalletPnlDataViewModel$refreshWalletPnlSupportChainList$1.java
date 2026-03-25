package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C15835eXa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ WalletPnlDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1(WalletPnlDataViewModel walletPnlDataViewModel, Continuation<? super WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlDataViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Collection collectionAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15835eXa c15835eXa = this.this$0.gEmmrt;
            this.label = 1;
            obj = c15835eXa.EZpvd(this);
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
                WalletPnlDataViewModel walletPnlDataViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableStateFlow mutableStateFlow = walletPnlDataViewModel.AEQbTJ;
                    List listAhwBna = yDY.AhwBna();
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        WalletPnlDataViewModel walletPnlDataViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            WalletSupportPnlChainListResponse walletSupportPnlChainListResponse = (WalletSupportPnlChainListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableStateFlow mutableStateFlow2 = walletPnlDataViewModel2.AEQbTJ;
            List<SupportPnlChainResponse> chains = walletSupportPnlChainListResponse.getChains();
            if (chains == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(chains, 10));
                Iterator<T> it = chains.iterator();
                while (it.hasNext()) {
                    Long chainId = ((SupportPnlChainResponse) it.next()).getChainId();
                    Intrinsics.copydefault(chainId);
                    collectionAhwBna.add(C56443yFo.KWHzl(chainId.longValue()));
                }
            }
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableStateFlow2.emit(collectionAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        WalletPnlDataViewModel walletPnlDataViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
