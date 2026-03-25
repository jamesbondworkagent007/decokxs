package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C15835eXa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataViewModel$getWalletAddressAnalysis$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainIndex;
    final /* synthetic */ String $periodType;
    final /* synthetic */ String $walletAddress;
    Object L$0;
    int label;
    final /* synthetic */ WalletPnlDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataViewModel$getWalletAddressAnalysis$1(WalletPnlDataViewModel walletPnlDataViewModel, String str, String str2, long j, Continuation<? super WalletPnlDataViewModel$getWalletAddressAnalysis$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlDataViewModel;
        this.$periodType = str;
        this.$walletAddress = str2;
        this.$chainIndex = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlDataViewModel$getWalletAddressAnalysis$1(this.this$0, this.$periodType, this.$walletAddress, this.$chainIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlDataViewModel$getWalletAddressAnalysis$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
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
            C15835eXa c15835eXa = this.this$0.gEmmrt;
            String str = this.$periodType;
            String str2 = this.$walletAddress;
            long j = this.$chainIndex;
            Long lKWHzl = j != Long.MIN_VALUE ? C56443yFo.KWHzl(j) : null;
            this.label = 1;
            obj = c15835eXa.OLrzqt(str, str2, lKWHzl, this);
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
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    MutableSharedFlow mutableSharedFlow = walletPnlDataViewModel.OLrzqt;
                    Result.Application application = Result.Companion;
                    Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerException)));
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
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
            WalletPnlAnalysisResponse walletPnlAnalysisResponse = (WalletPnlAnalysisResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableSharedFlow mutableSharedFlow2 = walletPnlDataViewModel2.OLrzqt;
            Result.Application application2 = Result.Companion;
            Result resultM7376boximpl2 = Result.m7376boximpl(Result.m7377constructorimpl(walletPnlAnalysisResponse));
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(resultM7376boximpl2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        WalletPnlDataViewModel walletPnlDataViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
