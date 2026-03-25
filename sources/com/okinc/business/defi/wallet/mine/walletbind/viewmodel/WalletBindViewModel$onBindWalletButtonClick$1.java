package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C34703nhO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54824xWr;
import o.InterfaceC8107awW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$onBindWalletButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindViewModel$onBindWalletButtonClick$1(WalletBindViewModel walletBindViewModel, Continuation<? super WalletBindViewModel$onBindWalletButtonClick$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindViewModel$onBindWalletButtonClick$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindViewModel$onBindWalletButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {CancellationException -> 0x0043, all -> 0x0040, blocks: (B:8:0x001b, B:72:0x0142, B:73:0x0145, B:11:0x0026, B:67:0x011e, B:69:0x0124, B:14:0x002f, B:51:0x00d1, B:53:0x00d7, B:55:0x00de, B:58:0x00f2, B:60:0x00f6, B:63:0x010a, B:16:0x003b, B:23:0x004a, B:33:0x0082, B:36:0x0089, B:38:0x0095, B:41:0x00a7, B:43:0x00ad, B:46:0x00bf, B:48:0x00c5, B:30:0x0070), top: B:82:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {CancellationException -> 0x0043, all -> 0x0040, blocks: (B:8:0x001b, B:72:0x0142, B:73:0x0145, B:11:0x0026, B:67:0x011e, B:69:0x0124, B:14:0x002f, B:51:0x00d1, B:53:0x00d7, B:55:0x00de, B:58:0x00f2, B:60:0x00f6, B:63:0x010a, B:16:0x003b, B:23:0x004a, B:33:0x0082, B:36:0x0089, B:38:0x0095, B:41:0x00a7, B:43:0x00ad, B:46:0x00bf, B:48:0x00c5, B:30:0x0070), top: B:82:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {CancellationException -> 0x0043, all -> 0x0040, blocks: (B:8:0x001b, B:72:0x0142, B:73:0x0145, B:11:0x0026, B:67:0x011e, B:69:0x0124, B:14:0x002f, B:51:0x00d1, B:53:0x00d7, B:55:0x00de, B:58:0x00f2, B:60:0x00f6, B:63:0x010a, B:16:0x003b, B:23:0x004a, B:33:0x0082, B:36:0x0089, B:38:0x0095, B:41:0x00a7, B:43:0x00ad, B:46:0x00bf, B:48:0x00c5, B:30:0x0070), top: B:82:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124 A[Catch: all -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {CancellationException -> 0x0043, all -> 0x0040, blocks: (B:8:0x001b, B:72:0x0142, B:73:0x0145, B:11:0x0026, B:67:0x011e, B:69:0x0124, B:14:0x002f, B:51:0x00d1, B:53:0x00d7, B:55:0x00de, B:58:0x00f2, B:60:0x00f6, B:63:0x010a, B:16:0x003b, B:23:0x004a, B:33:0x0082, B:36:0x0089, B:38:0x0095, B:41:0x00a7, B:43:0x00ad, B:46:0x00bf, B:48:0x00c5, B:30:0x0070), top: B:82:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        WalletBindViewModel walletBindViewModel;
        Object objAEQbTJ;
        Object objM8562bindWalletPreCheckgIAlus$default;
        WalletBindViewModel walletBindViewModel2;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.isConnected;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                walletBindViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                InterfaceC54824xWr interfaceC54824xWr = walletBindViewModel.fARcdN;
                this.L$0 = walletBindViewModel;
                this.label = 2;
                objAEQbTJ = interfaceC54824xWr.AEQbTJ(null, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = null;
                }
                if (!Intrinsics.EZpvd((Boolean) objAEQbTJ, C56443yFo.KWHzl(true))) {
                    MutableSharedFlow mutableSharedFlow3 = walletBindViewModel.KWHzl;
                    Unit unit = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(unit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (C34703nhO.copydefault()) {
                    MutableSharedFlow mutableSharedFlow4 = walletBindViewModel.gEmmrt;
                    Unit unit2 = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow4.emit(unit2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    InterfaceC8107awW interfaceC8107awW = walletBindViewModel.fJNWhG;
                    if (interfaceC8107awW != null) {
                        this.L$0 = walletBindViewModel;
                        this.label = 5;
                        objM8562bindWalletPreCheckgIAlus$default = InterfaceC8107awW.StateListAnimator.m8562bindWalletPreCheckgIAlus$default(interfaceC8107awW, false, this, 1, null);
                        if (objM8562bindWalletPreCheckgIAlus$default == objCopydefault) {
                            return objCopydefault;
                        }
                        walletBindViewModel2 = walletBindViewModel;
                        if (Result.m7384isSuccessimpl(objM8562bindWalletPreCheckgIAlus$default)) {
                            BindWalletPreCheckResult bindWalletPreCheckResult = (BindWalletPreCheckResult) objM8562bindWalletPreCheckgIAlus$default;
                            if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.Success) {
                                MutableSharedFlow mutableSharedFlow5 = walletBindViewModel2.AEQbTJ;
                                Unit unit3 = Unit.INSTANCE;
                                this.L$0 = walletBindViewModel2;
                                this.L$1 = objM8562bindWalletPreCheckgIAlus$default;
                                this.label = 6;
                                if (mutableSharedFlow5.emit(unit3, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedKYC) {
                                MutableSharedFlow mutableSharedFlow6 = walletBindViewModel2.valueOf;
                                Unit unit4 = Unit.INSTANCE;
                                this.L$0 = walletBindViewModel2;
                                this.L$1 = objM8562bindWalletPreCheckgIAlus$default;
                                this.label = 7;
                                if (mutableSharedFlow6.emit(unit4, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                MutableSharedFlow mutableSharedFlow7 = walletBindViewModel2.AkhnZx;
                                this.L$0 = walletBindViewModel2;
                                this.L$1 = objM8562bindWalletPreCheckgIAlus$default;
                                this.label = 8;
                                if (mutableSharedFlow7.emit(bindWalletPreCheckResult, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                        obj2 = objM8562bindWalletPreCheckgIAlus$default;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("WalletBindViewModel", "bindWalletPreCheck onFailure", thM7380exceptionOrNullimpl);
                            MutableSharedFlow mutableSharedFlow8 = walletBindViewModel2.AhwBna;
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.label = 9;
                            if (mutableSharedFlow8.emit(message, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        Result.m7376boximpl(obj2);
                    }
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                walletBindViewModel = this.this$0;
                Result.Application application22 = Result.Companion;
                InterfaceC54824xWr interfaceC54824xWr2 = walletBindViewModel.fARcdN;
                this.L$0 = walletBindViewModel;
                this.label = 2;
                objAEQbTJ = interfaceC54824xWr2.AEQbTJ(null, this);
                if (objAEQbTJ == objCopydefault) {
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                if (!Intrinsics.EZpvd((Boolean) objAEQbTJ, C56443yFo.KWHzl(true))) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                walletBindViewModel = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                if (!Intrinsics.EZpvd((Boolean) objAEQbTJ, C56443yFo.KWHzl(true))) {
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                walletBindViewModel = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8562bindWalletPreCheckgIAlus$default = ((Result) obj).m7386unboximpl();
                walletBindViewModel2 = walletBindViewModel;
                if (Result.m7384isSuccessimpl(objM8562bindWalletPreCheckgIAlus$default)) {
                }
                obj2 = objM8562bindWalletPreCheckgIAlus$default;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(obj2);
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
            case 8:
                obj2 = this.L$1;
                walletBindViewModel2 = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(obj2);
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 9:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                Result.m7376boximpl(obj2);
                Result.m7377constructorimpl(Unit.INSTANCE);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
