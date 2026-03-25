package com.okinc.business.defi.wallet.home.addressDetail.data.resposity;

import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.eWC;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataRemoteDataSource$getSupportPnlChainList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends WalletSupportPnlChainListResponse, ? extends OKServerException>>, Object> {
    int label;
    final /* synthetic */ eWC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataRemoteDataSource$getSupportPnlChainList$2(eWC ewc, Continuation<? super WalletPnlDataRemoteDataSource$getSupportPnlChainList$2> continuation) {
        super(2, continuation);
        this.this$0 = ewc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlDataRemoteDataSource$getSupportPnlChainList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends WalletSupportPnlChainListResponse, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>> continuation) {
        return ((WalletPnlDataRemoteDataSource$getSupportPnlChainList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.this$0.AEQbTJ;
            this.label = 1;
            obj = c13934dbu.fJNWhG(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator((WalletSupportPnlChainListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
