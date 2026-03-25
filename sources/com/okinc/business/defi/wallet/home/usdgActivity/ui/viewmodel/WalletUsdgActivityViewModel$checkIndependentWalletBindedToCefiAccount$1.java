package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.C19331fzK;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRetryScene;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, boolean z, Continuation<? super WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
        this.$isRetryScene = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1(this.this$0, this.$isRetryScene, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[Catch: all -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {CancellationException -> 0x0049, all -> 0x0046, blocks: (B:8:0x001c, B:50:0x010f, B:55:0x012e, B:11:0x0029, B:40:0x00d0, B:42:0x00d6, B:44:0x00dd, B:47:0x00f8, B:14:0x0036, B:34:0x0088, B:36:0x008e, B:15:0x0041, B:54:0x012c, B:22:0x0053, B:24:0x005b, B:27:0x0063, B:30:0x006b, B:51:0x0114), top: B:71:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[Catch: all -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {CancellationException -> 0x0049, all -> 0x0046, blocks: (B:8:0x001c, B:50:0x010f, B:55:0x012e, B:11:0x0029, B:40:0x00d0, B:42:0x00d6, B:44:0x00dd, B:47:0x00f8, B:14:0x0036, B:34:0x0088, B:36:0x008e, B:15:0x0041, B:54:0x012c, B:22:0x0053, B:24:0x005b, B:27:0x0063, B:30:0x006b, B:51:0x0114), top: B:71:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        boolean z;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        Object objM7386unboximpl;
        Object objM7376boximpl;
        Object obj2;
        boolean z2;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                WalletUsdgActivityViewModel walletUsdgActivityViewModel2 = this.this$0;
                z = this.$isRetryScene;
                Result.Application application2 = Result.Companion;
                AbstractC12782ctV abstractC12782ctVValueOf = walletUsdgActivityViewModel2.valueOf();
                String strDbNXlk = abstractC12782ctVValueOf != null ? abstractC12782ctVValueOf.DbNXlk() : null;
                if (strDbNXlk != null && strDbNXlk.length() != 0) {
                    C19331fzK c19331fzK = walletUsdgActivityViewModel2.wlaJM;
                    C19331fzK.StateListAnimator stateListAnimator = new C19331fzK.StateListAnimator(C56402yEa.EZpvd(strDbNXlk));
                    this.L$0 = walletUsdgActivityViewModel2;
                    this.Z$0 = z;
                    this.label = 2;
                    Object objEZpvd = c19331fzK.EZpvd(stateListAnimator, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
                    objM7386unboximpl = objEZpvd;
                    if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                        C19331fzK.ActionBar actionBar = (C19331fzK.ActionBar) objM7386unboximpl;
                        pUU.EZpvd("WalletUsdgActivityViewModel", "checkIndependentWalletBindedToCefiAccount-success, status: " + actionBar);
                        walletUsdgActivityViewModel.getFieldNames = C33129mqd.gEmmrt(actionBar.AEQbTJ());
                        MutableSharedFlow mutableSharedFlow = walletUsdgActivityViewModel.AEQbTJ;
                        AbstractC18226feR.Application application3 = new AbstractC18226feR.Application(actionBar.KWHzl());
                        this.L$0 = walletUsdgActivityViewModel;
                        this.L$1 = objM7386unboximpl;
                        this.Z$0 = z;
                        this.label = 3;
                        if (mutableSharedFlow.emit(application3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    boolean z3 = z;
                    obj2 = objM7386unboximpl;
                    z2 = z3;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkIndependentWalletBindedToCefiAccount-fail", thM7380exceptionOrNullimpl2);
                        if (z2) {
                            MutableSharedFlow mutableSharedFlow2 = walletUsdgActivityViewModel.AEQbTJ;
                            AbstractC18226feR.Activity activity = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl2.getMessage());
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.label = 4;
                            if (mutableSharedFlow2.emit(activity, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow3 = walletUsdgActivityViewModel.AEQbTJ;
                            AbstractC18226feR.Application application4 = new AbstractC18226feR.Application(false);
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.label = 5;
                            if (mutableSharedFlow3.emit(application4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    objM7376boximpl = Result.m7376boximpl(obj2);
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                    boolean z4 = this.$isRetryScene;
                    WalletUsdgActivityViewModel walletUsdgActivityViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkIndependentWalletBindedToCefiAccount1-fail", thM7380exceptionOrNullimpl);
                        if (z4) {
                            MutableSharedFlow mutableSharedFlow4 = walletUsdgActivityViewModel3.AEQbTJ;
                            AbstractC18226feR.Activity activity2 = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl.getMessage());
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.label = 6;
                            if (mutableSharedFlow4.emit(activity2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow5 = walletUsdgActivityViewModel3.AEQbTJ;
                            AbstractC18226feR.Application application5 = new AbstractC18226feR.Application(false);
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.label = 7;
                            if (mutableSharedFlow5.emit(application5, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                pUU.copydefault("WalletUsdgActivityViewModel", "checkIndependentWalletBindedToCefiAccount, walletId is null");
                MutableSharedFlow mutableSharedFlow6 = walletUsdgActivityViewModel2.copydefault;
                AbstractC18226feR.Dialog dialog = new AbstractC18226feR.Dialog(false);
                this.label = 1;
                if (mutableSharedFlow6.emit(dialog, this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7376boximpl = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                boolean z42 = this.$isRetryScene;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objM7376boximpl = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                boolean z422 = this.$isRetryScene;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 2:
                z = this.Z$0;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel4 = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                walletUsdgActivityViewModel = walletUsdgActivityViewModel4;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                }
                boolean z32 = z;
                obj2 = objM7386unboximpl;
                z2 = z32;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7376boximpl = Result.m7376boximpl(obj2);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                boolean z4222 = this.$isRetryScene;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                boolean z5 = this.Z$0;
                Object obj3 = this.L$1;
                walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z2 = z5;
                obj2 = obj3;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7376boximpl = Result.m7376boximpl(obj2);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                boolean z42222 = this.$isRetryScene;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel32222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7376boximpl = Result.m7376boximpl(obj2);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                boolean z422222 = this.$isRetryScene;
                WalletUsdgActivityViewModel walletUsdgActivityViewModel322222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
