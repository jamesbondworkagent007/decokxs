package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.AbstractC58260yxt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, Continuation<? super WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[Catch: all -> 0x013b, CancellationException -> 0x016c, TryCatch #2 {CancellationException -> 0x016c, all -> 0x013b, blocks: (B:11:0x0025, B:41:0x00c6, B:12:0x002a, B:57:0x0138, B:15:0x0037, B:24:0x0074, B:25:0x007a, B:27:0x0080, B:29:0x0086, B:31:0x008c, B:38:0x009f, B:34:0x0093, B:36:0x0099, B:42:0x00ce, B:44:0x00d4, B:46:0x00de, B:48:0x00e4, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:18:0x0040, B:20:0x0059), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4 A[Catch: all -> 0x013b, CancellationException -> 0x016c, TryCatch #2 {CancellationException -> 0x016c, all -> 0x013b, blocks: (B:11:0x0025, B:41:0x00c6, B:12:0x002a, B:57:0x0138, B:15:0x0037, B:24:0x0074, B:25:0x007a, B:27:0x0080, B:29:0x0086, B:31:0x008c, B:38:0x009f, B:34:0x0093, B:36:0x0099, B:42:0x00ce, B:44:0x00d4, B:46:0x00de, B:48:0x00e4, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:18:0x0040, B:20:0x0059), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4 A[Catch: all -> 0x013b, CancellationException -> 0x016c, TryCatch #2 {CancellationException -> 0x016c, all -> 0x013b, blocks: (B:11:0x0025, B:41:0x00c6, B:12:0x002a, B:57:0x0138, B:15:0x0037, B:24:0x0074, B:25:0x007a, B:27:0x0080, B:29:0x0086, B:31:0x008c, B:38:0x009f, B:34:0x0093, B:36:0x0099, B:42:0x00ce, B:44:0x00d4, B:46:0x00de, B:48:0x00e4, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:18:0x0040, B:20:0x0059), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel2;
        AbstractC12782ctV abstractC12782ctVValueOf;
        MutableSharedFlow mutableSharedFlow;
        AbstractC18226feR.Fragment fragment;
        AbstractC12782ctV abstractC12782ctVValueOf2;
        AbstractC12782ctV abstractC12782ctVValueOf3;
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
            walletUsdgActivityViewModel.OLrzqt((AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(walletUsdgActivityViewModel.AuCTelauCTel.copydefault()));
            if (walletUsdgActivityViewModel.valueOf() == null) {
                pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletAndSpecificChains: mainWallet is null");
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = walletUsdgActivityViewModel.AuCTelauCTel.copydefault(false);
                this.L$0 = walletUsdgActivityViewModel;
                this.L$1 = walletUsdgActivityViewModel;
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                walletUsdgActivityViewModel2 = walletUsdgActivityViewModel;
            }
            abstractC12782ctVValueOf = walletUsdgActivityViewModel.valueOf();
            if (abstractC12782ctVValueOf != null || !abstractC12782ctVValueOf.zLjUOn() || (((abstractC12782ctVValueOf2 = walletUsdgActivityViewModel.valueOf()) == null || !abstractC12782ctVValueOf2.AubY()) && ((abstractC12782ctVValueOf3 = walletUsdgActivityViewModel.valueOf()) == null || !abstractC12782ctVValueOf3.AwvSrB()))) {
                AbstractC12782ctV abstractC12782ctVValueOf4 = walletUsdgActivityViewModel.valueOf();
                Boolean boolKWHzl = abstractC12782ctVValueOf4 == null ? C56443yFo.KWHzl(abstractC12782ctVValueOf4.zLjUOn()) : null;
                AbstractC12782ctV abstractC12782ctVValueOf5 = walletUsdgActivityViewModel.valueOf();
                Boolean boolKWHzl2 = abstractC12782ctVValueOf5 == null ? C56443yFo.KWHzl(abstractC12782ctVValueOf5.AubY()) : null;
                AbstractC12782ctV abstractC12782ctVValueOf6 = walletUsdgActivityViewModel.valueOf();
                pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletAndSpecificChains: isBackUp:" + boolKWHzl + ",isHDWallet:" + boolKWHzl2 + ",isKeyWallet:" + (abstractC12782ctVValueOf6 == null ? C56443yFo.KWHzl(abstractC12782ctVValueOf6.AwvSrB()) : null));
                mutableSharedFlow = walletUsdgActivityViewModel.AYXKKw;
                fragment = new AbstractC18226feR.Fragment(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(fragment, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            MutableSharedFlow mutableSharedFlow2 = walletUsdgActivityViewModel.AYXKKw;
            AbstractC18226feR.Fragment fragment2 = new AbstractC18226feR.Fragment(!walletUsdgActivityViewModel.copydefault(walletUsdgActivityViewModel.valueOf(), (List<Long>) walletUsdgActivityViewModel.AkhnZx()).isEmpty());
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (mutableSharedFlow2.emit(fragment2, this) == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel3 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel32 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkWalletAndSpecificChains", thM7380exceptionOrNullimpl);
                MutableSharedFlow mutableSharedFlow3 = walletUsdgActivityViewModel32.AYXKKw;
                AbstractC18226feR.Fragment fragment3 = new AbstractC18226feR.Fragment(false);
                this.L$0 = objM7377constructorimpl;
                this.L$1 = null;
                this.label = 4;
                if (mutableSharedFlow3.emit(fragment3, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$1;
        walletUsdgActivityViewModel2 = (WalletUsdgActivityViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        walletUsdgActivityViewModel.OLrzqt((AbstractC12782ctV) obj);
        walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
        abstractC12782ctVValueOf = walletUsdgActivityViewModel.valueOf();
        if (abstractC12782ctVValueOf != null) {
        }
        AbstractC12782ctV abstractC12782ctVValueOf42 = walletUsdgActivityViewModel.valueOf();
        if (abstractC12782ctVValueOf42 == null) {
        }
        AbstractC12782ctV abstractC12782ctVValueOf52 = walletUsdgActivityViewModel.valueOf();
        if (abstractC12782ctVValueOf52 == null) {
        }
        AbstractC12782ctV abstractC12782ctVValueOf62 = walletUsdgActivityViewModel.valueOf();
        if (abstractC12782ctVValueOf62 == null) {
        }
        pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletAndSpecificChains: isBackUp:" + boolKWHzl + ",isHDWallet:" + boolKWHzl2 + ",isKeyWallet:" + (abstractC12782ctVValueOf62 == null ? C56443yFo.KWHzl(abstractC12782ctVValueOf62.AwvSrB()) : null));
        mutableSharedFlow = walletUsdgActivityViewModel.AYXKKw;
        fragment = new AbstractC18226feR.Fragment(false);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (mutableSharedFlow.emit(fragment, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
