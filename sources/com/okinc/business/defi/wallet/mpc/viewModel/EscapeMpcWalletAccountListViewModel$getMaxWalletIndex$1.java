package com.okinc.business.defi.wallet.mpc.viewModel;

import com.okinc.business.defi.api.bean.MpcMaxIndexResponse;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mpcId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EscapeMpcWalletAccountListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1(EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel, String str, Continuation<? super EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1> continuation) {
        super(2, continuation);
        this.this$0 = escapeMpcWalletAccountListViewModel;
        this.$mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1(this.this$0, this.$mpcId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeMpcWalletAccountListViewModel$getMaxWalletIndex$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel;
        OKServerException oKServerException;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Channel channel = this.this$0.gEmmrt;
            EscapeMpcWalletAccountListViewModel.RequestStatus requestStatus = EscapeMpcWalletAccountListViewModel.RequestStatus.LOADING;
            this.label = 1;
            if (channel.send(requestStatus, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oKServerException = (OKServerException) this.L$2;
                    escapeMpcWalletAccountListViewModel = (EscapeMpcWalletAccountListViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault(escapeMpcWalletAccountListViewModel.valueOf, "getMaxWalletIndex error message = " + oKServerException.getCode() + " " + oKServerException.getMessage());
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    escapeMpcWalletAccountListViewModel2.EZpvd(((MpcMaxIndexResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getDeriveIndex());
                }
                escapeMpcWalletAccountListViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException2 = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    Channel channel2 = escapeMpcWalletAccountListViewModel.gEmmrt;
                    EscapeMpcWalletAccountListViewModel.RequestStatus requestStatus2 = EscapeMpcWalletAccountListViewModel.RequestStatus.FAILED;
                    this.L$0 = escapeMpcWalletAccountListViewModel;
                    this.L$1 = abstractC43419rot;
                    this.L$2 = oKServerException2;
                    this.label = 3;
                    if (channel2.send(requestStatus2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    oKServerException = oKServerException2;
                    pUU.copydefault(escapeMpcWalletAccountListViewModel.valueOf, "getMaxWalletIndex error message = " + oKServerException.getCode() + " " + oKServerException.getMessage());
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C13934dbu c13934dbu = this.this$0.fetchVPNInfo;
        String str = this.$mpcId;
        this.label = 2;
        obj = c13934dbu.AhwBna(str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        escapeMpcWalletAccountListViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
