package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import com.okinc.account.api.model.wallet.BindWalletCheckResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, Continuation<? super WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0103, CancellationException -> 0x0138, TryCatch #2 {CancellationException -> 0x0138, all -> 0x0103, blocks: (B:13:0x0029, B:46:0x00df, B:51:0x00fe, B:16:0x0034, B:41:0x00ba, B:43:0x00c0, B:19:0x003d, B:34:0x007f, B:36:0x0085, B:20:0x004a, B:50:0x00fc, B:23:0x0054, B:25:0x005c, B:28:0x0064, B:31:0x006c, B:47:0x00e4), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[Catch: all -> 0x0103, CancellationException -> 0x0138, TryCatch #2 {CancellationException -> 0x0138, all -> 0x0103, blocks: (B:13:0x0029, B:46:0x00df, B:51:0x00fe, B:16:0x0034, B:41:0x00ba, B:43:0x00c0, B:19:0x003d, B:34:0x007f, B:36:0x0085, B:20:0x004a, B:50:0x00fc, B:23:0x0054, B:25:0x005c, B:28:0x0064, B:31:0x006c, B:47:0x00e4), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        Object objEZpvd;
        Object objM7376boximpl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel2;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            walletUsdgActivityViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC12782ctV abstractC12782ctVValueOf = walletUsdgActivityViewModel.valueOf();
            String strDbNXlk = abstractC12782ctVValueOf != null ? abstractC12782ctVValueOf.DbNXlk() : null;
            if (strDbNXlk != null && strDbNXlk.length() != 0) {
                InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.copydefault(InterfaceC8107awW.class);
                this.L$0 = walletUsdgActivityViewModel;
                this.label = 2;
                objEZpvd = interfaceC8107awW.EZpvd(strDbNXlk, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7376boximpl = Result.m7376boximpl(objEZpvd);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                WalletUsdgActivityViewModel walletUsdgActivityViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
            }
            pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletBindedToCefiAccount, walletId is null");
            MutableSharedFlow mutableSharedFlow = walletUsdgActivityViewModel.copydefault;
            AbstractC18226feR.Dialog dialog = new AbstractC18226feR.Dialog(false);
            this.label = 1;
            if (mutableSharedFlow.emit(dialog, this) == objCopydefault) {
                return objCopydefault;
            }
            objM7376boximpl = Unit.INSTANCE;
            objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel32 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objM7376boximpl = Unit.INSTANCE;
            objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel322 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i == 2) {
            WalletUsdgActivityViewModel walletUsdgActivityViewModel4 = (WalletUsdgActivityViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            walletUsdgActivityViewModel = walletUsdgActivityViewModel4;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
                BindWalletCheckResult bindWalletCheckResult = (BindWalletCheckResult) objEZpvd;
                pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletBindedToCefiAccount-success, status: " + bindWalletCheckResult);
                MutableSharedFlow mutableSharedFlow2 = walletUsdgActivityViewModel.copydefault;
                AbstractC18226feR.Dialog dialog2 = new AbstractC18226feR.Dialog(Intrinsics.EZpvd(bindWalletCheckResult, BindWalletCheckResult.AlreadyBound.INSTANCE));
                this.L$0 = walletUsdgActivityViewModel;
                this.L$1 = objEZpvd;
                this.label = 3;
                if (mutableSharedFlow2.emit(dialog2, this) == objCopydefault) {
                    return objCopydefault;
                }
                walletUsdgActivityViewModel2 = walletUsdgActivityViewModel;
                walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
            }
            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
            if (thM7380exceptionOrNullimpl2 != null) {
            }
            objM7376boximpl = Result.m7376boximpl(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel3222 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i == 3) {
            objEZpvd = this.L$1;
            walletUsdgActivityViewModel2 = (WalletUsdgActivityViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkWalletBindedToCefiAccount-fail", thM7380exceptionOrNullimpl2);
                MutableSharedFlow mutableSharedFlow3 = walletUsdgActivityViewModel.copydefault;
                AbstractC18226feR.Activity activity = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl2.getMessage());
                this.L$0 = objEZpvd;
                this.L$1 = null;
                this.label = 4;
                if (mutableSharedFlow3.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7376boximpl = Result.m7376boximpl(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel32222 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i == 4) {
            objEZpvd = this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7376boximpl = Result.m7376boximpl(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel322222 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkWalletBindedToCefiAccount1-fail", thM7380exceptionOrNullimpl);
                MutableSharedFlow mutableSharedFlow4 = walletUsdgActivityViewModel322222.copydefault;
                AbstractC18226feR.Activity activity2 = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl.getMessage());
                this.L$0 = objM7377constructorimpl;
                this.L$1 = null;
                this.label = 5;
                if (mutableSharedFlow4.emit(activity2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
