package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dexlogic.error.NoWallet;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel$checkWallet$1;
import com.okinc.wallet.api.MpcWalletService;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23194htd;
import o.InterfaceC9738bbJ;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$checkWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $chainId;
    final /* synthetic */ Function0<Unit> $resultCallback;
    final /* synthetic */ String $sourceType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$checkWallet$1(String str, FragmentActivity fragmentActivity, String str2, MemeModeTransactionViewModel memeModeTransactionViewModel, Function0<Unit> function0, Continuation<? super MemeModeTransactionViewModel$checkWallet$1> continuation) {
        super(2, continuation);
        this.$sourceType = str;
        this.$activity = fragmentActivity;
        this.$chainId = str2;
        this.this$0 = memeModeTransactionViewModel;
        this.$resultCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$checkWallet$1(this.$sourceType, this.$activity, this.$chainId, this.this$0, this.$resultCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$checkWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        final String str;
        final Function0<Unit> function0;
        InterfaceC23194htd interfaceC23194htd;
        FragmentActivity fragmentActivity;
        final MemeModeTransactionViewModel memeModeTransactionViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str2 = this.$sourceType;
                FragmentActivity fragmentActivity2 = this.$activity;
                str = this.$chainId;
                MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
                function0 = this.$resultCallback;
                Result.Application application = Result.Companion;
                InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str2).fARcdN();
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = interfaceC23194htdFARcdN.OLrzqt();
                this.L$0 = fragmentActivity2;
                this.L$1 = str;
                this.L$2 = memeModeTransactionViewModel2;
                this.L$3 = function0;
                this.L$4 = interfaceC23194htdFARcdN;
                this.label = 1;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC23194htd = interfaceC23194htdFARcdN;
                obj = objAwait;
                fragmentActivity = fragmentActivity2;
                memeModeTransactionViewModel = memeModeTransactionViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC23194htd interfaceC23194htd2 = (InterfaceC23194htd) this.L$4;
                Function0<Unit> function02 = (Function0) this.L$3;
                MemeModeTransactionViewModel memeModeTransactionViewModel3 = (MemeModeTransactionViewModel) this.L$2;
                str = (String) this.L$1;
                FragmentActivity fragmentActivity3 = (FragmentActivity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC23194htd = interfaceC23194htd2;
                function0 = function02;
                fragmentActivity = fragmentActivity3;
                memeModeTransactionViewModel = memeModeTransactionViewModel3;
            }
            final InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            Intrinsics.copydefault(interfaceC9738bbJ);
            final boolean zCopydefault = interfaceC23194htd.copydefault(interfaceC9738bbJ);
            final InterfaceC23194htd interfaceC23194htd3 = interfaceC23194htd;
            interfaceC23194htd.KWHzl(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.kXR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeModeTransactionViewModel$checkWallet$1.invokeSuspend$lambda$1$lambda$0(interfaceC23194htd3, interfaceC9738bbJ, str, memeModeTransactionViewModel, function0, zCopydefault, (MpcWalletService.MpcWalletAbleStatus) obj2);
                }
            });
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel4 = this.this$0;
        Function0<Unit> function03 = this.$resultCallback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            if (thM7380exceptionOrNullimpl instanceof NoWallet) {
                memeModeTransactionViewModel4.hDKMBd().setValue(SwapState.NO_WALLET);
                if (function03 != null) {
                    function03.invoke();
                }
            } else {
                memeModeTransactionViewModel4.hDKMBd().setValue(SwapState.WALLET_LEGAL);
                if (function03 != null) {
                    function03.invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(InterfaceC23194htd interfaceC23194htd, InterfaceC9738bbJ interfaceC9738bbJ, String str, MemeModeTransactionViewModel memeModeTransactionViewModel, Function0 function0, boolean z, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        if (interfaceC23194htd.OLrzqt(interfaceC9738bbJ, str, true)) {
            memeModeTransactionViewModel.DbNXlk().setValue(mpcWalletAbleStatus);
            if (interfaceC9738bbJ.ORxRYg() && yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen).contains(mpcWalletAbleStatus)) {
                memeModeTransactionViewModel.hDKMBd().setValue(SwapState.MPC_WALLET_LEGAL);
            } else {
                memeModeTransactionViewModel.hDKMBd().setValue(SwapState.WALLET_SUCCESS);
            }
            if (function0 != null) {
                function0.invoke();
            }
        } else if (z) {
            memeModeTransactionViewModel.hDKMBd().setValue(SwapState.TRACKING_WALLET_SUCCESS);
            if (function0 != null) {
                function0.invoke();
            }
        } else if (interfaceC9738bbJ.zsXlph()) {
            memeModeTransactionViewModel.hDKMBd().setValue(SwapState.NO_WALLET);
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            memeModeTransactionViewModel.hDKMBd().setValue(SwapState.WALLET_LEGAL);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
