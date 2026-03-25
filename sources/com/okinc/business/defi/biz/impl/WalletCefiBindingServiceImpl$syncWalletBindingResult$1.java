package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.wallet.walletaddressbinding.repository.CeFiBindResultSyncStatus;
import com.okinc.wallet.api.WalletCefiBindingService;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C11707cYf;
import o.C56391yDq;
import o.C56442yFn;
import o.gJS;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCefiBindingServiceImpl$syncWalletBindingResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletCefiBindingService.WalletCefiBindingResult $cefiBindingResult;
    final /* synthetic */ WalletCefiBindingService.FragmentManager $config;
    int label;
    final /* synthetic */ C11707cYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCefiBindingServiceImpl$syncWalletBindingResult$1(WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult, WalletCefiBindingService.FragmentManager fragmentManager, C11707cYf c11707cYf, Continuation<? super WalletCefiBindingServiceImpl$syncWalletBindingResult$1> continuation) {
        super(2, continuation);
        this.$cefiBindingResult = walletCefiBindingResult;
        this.$config = fragmentManager;
        this.this$0 = c11707cYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletCefiBindingServiceImpl$syncWalletBindingResult$1(this.$cefiBindingResult, this.$config, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletCefiBindingServiceImpl$syncWalletBindingResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CeFiBindResultSyncStatus ceFiBindResultSyncStatus;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult = this.$cefiBindingResult;
                WalletCefiBindingService.FragmentManager fragmentManager = this.$config;
                C11707cYf c11707cYf = this.this$0;
                Result.Application application = Result.Companion;
                if (walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.WalletAlreadyBound) {
                    ceFiBindResultSyncStatus = CeFiBindResultSyncStatus.ALREADY_BOUND;
                } else if ((walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.Success) && Intrinsics.EZpvd((Object) ((WalletCefiBindingService.WalletCefiBindingResult.Success) walletCefiBindingResult).OLrzqt().KWHzl(), (Object) fragmentManager.KWHzl())) {
                    ceFiBindResultSyncStatus = CeFiBindResultSyncStatus.SUCCESS;
                } else {
                    ceFiBindResultSyncStatus = CeFiBindResultSyncStatus.CANCEL;
                }
                CeFiBindResultSyncStatus ceFiBindResultSyncStatus2 = ceFiBindResultSyncStatus;
                gJS gjs = c11707cYf.AhwBna;
                String strKWHzl = fragmentManager.KWHzl();
                String strEZpvd = fragmentManager.EZpvd();
                String strAEQbTJ = fragmentManager.AEQbTJ();
                this.label = 1;
                objEZpvd = gjs.EZpvd(strEZpvd, strKWHzl, ceFiBindResultSyncStatus2, strAEQbTJ, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C11707cYf c11707cYf2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c11707cYf2.AEQbTJ, "syncWalletBindingResult error: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
