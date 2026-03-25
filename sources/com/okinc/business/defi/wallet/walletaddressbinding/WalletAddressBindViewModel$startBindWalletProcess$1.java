package com.okinc.business.defi.wallet.walletaddressbinding;

import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.gJK;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBindViewModel$startBindWalletProcess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAddressBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBindViewModel$startBindWalletProcess$1(WalletAddressBindViewModel walletAddressBindViewModel, String str, Continuation<? super WalletAddressBindViewModel$startBindWalletProcess$1> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBindViewModel;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBindViewModel$startBindWalletProcess$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBindViewModel$startBindWalletProcess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x00f2, CancellationException -> 0x00ff, TryCatch #2 {CancellationException -> 0x00ff, all -> 0x00f2, blocks: (B:13:0x0029, B:31:0x0079, B:34:0x0082, B:37:0x008d, B:40:0x0093, B:43:0x009f, B:59:0x00ec, B:47:0x00ae, B:49:0x00b8, B:51:0x00c7, B:53:0x00cd, B:14:0x0033, B:21:0x0054, B:23:0x005c, B:25:0x0062, B:27:0x0068, B:56:0x00dd), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: all -> 0x00f2, CancellationException -> 0x00ff, TryCatch #2 {CancellationException -> 0x00ff, all -> 0x00f2, blocks: (B:13:0x0029, B:31:0x0079, B:34:0x0082, B:37:0x008d, B:40:0x0093, B:43:0x009f, B:59:0x00ec, B:47:0x00ae, B:49:0x00b8, B:51:0x00c7, B:53:0x00cd, B:14:0x0033, B:21:0x0054, B:23:0x005c, B:25:0x0062, B:27:0x0068, B:56:0x00dd), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[Catch: all -> 0x00f2, CancellationException -> 0x00ff, TryCatch #2 {CancellationException -> 0x00ff, all -> 0x00f2, blocks: (B:13:0x0029, B:31:0x0079, B:34:0x0082, B:37:0x008d, B:40:0x0093, B:43:0x009f, B:59:0x00ec, B:47:0x00ae, B:49:0x00b8, B:51:0x00c7, B:53:0x00cd, B:14:0x0033, B:21:0x0054, B:23:0x005c, B:25:0x0062, B:27:0x0068, B:56:0x00dd), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[Catch: all -> 0x00f2, CancellationException -> 0x00ff, TryCatch #2 {CancellationException -> 0x00ff, all -> 0x00f2, blocks: (B:13:0x0029, B:31:0x0079, B:34:0x0082, B:37:0x008d, B:40:0x0093, B:43:0x009f, B:59:0x00ec, B:47:0x00ae, B:49:0x00b8, B:51:0x00c7, B:53:0x00cd, B:14:0x0033, B:21:0x0054, B:23:0x005c, B:25:0x0062, B:27:0x0068, B:56:0x00dd), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        WalletAddressBindViewModel walletAddressBindViewModel;
        Result resultM7376boximpl;
        Object objM7386unboximpl;
        BindWalletPreCheckResult bindWalletPreCheckResult;
        MutableSharedFlow mutableSharedFlow;
        gJK.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
            gJK.TaskDescription taskDescription = gJK.TaskDescription.copydefault;
            this.label = 1;
            if (mutableSharedFlow2.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = (String) this.L$1;
                        walletAddressBindViewModel = (WalletAddressBindViewModel) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objM7386unboximpl = ((Result) obj).m7386unboximpl();
                        resultM7376boximpl = Result.m7376boximpl(objM7386unboximpl);
                        if (resultM7376boximpl != null) {
                            Object objM7386unboximpl2 = resultM7376boximpl.m7386unboximpl();
                            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                                objM7386unboximpl2 = null;
                            }
                            bindWalletPreCheckResult = (BindWalletPreCheckResult) objM7386unboximpl2;
                        } else {
                            bindWalletPreCheckResult = null;
                        }
                        if (resultM7376boximpl != null && Result.m7384isSuccessimpl(resultM7376boximpl.m7386unboximpl()) && bindWalletPreCheckResult != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (walletAddressBindViewModel.AEQbTJ(bindWalletPreCheckResult, str, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            Throwable thM7380exceptionOrNullimpl = resultM7376boximpl == null ? Result.m7380exceptionOrNullimpl(resultM7376boximpl.m7386unboximpl()) : null;
                            pUU.AEQbTJ("WalletBindViewModel", "bindWalletPreCheck onFailure", thM7380exceptionOrNullimpl);
                            mutableSharedFlow = walletAddressBindViewModel.KWHzl;
                            application = new gJK.Application(thM7380exceptionOrNullimpl == null ? thM7380exceptionOrNullimpl.getMessage() : null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 5;
                            if (mutableSharedFlow.emit(application, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        Result.m7377constructorimpl(Unit.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        WalletAddressBindViewModel walletAddressBindViewModel2 = this.this$0;
        str = this.$walletId;
        Result.Application application3 = Result.Companion;
        InterfaceC8107awW interfaceC8107awW = walletAddressBindViewModel2.EZpvd;
        if (interfaceC8107awW == null || !interfaceC8107awW.OLrzqt()) {
            MutableSharedFlow mutableSharedFlow3 = walletAddressBindViewModel2.KWHzl;
            gJK.StateListAnimator stateListAnimator = gJK.StateListAnimator.EZpvd;
            this.label = 2;
            if (mutableSharedFlow3.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        InterfaceC8107awW interfaceC8107awW2 = walletAddressBindViewModel2.EZpvd;
        if (interfaceC8107awW2 == null) {
            walletAddressBindViewModel = walletAddressBindViewModel2;
            resultM7376boximpl = null;
            if (resultM7376boximpl != null) {
            }
            if (resultM7376boximpl != null) {
            }
            return Unit.INSTANCE;
        }
        this.L$0 = walletAddressBindViewModel2;
        this.L$1 = str;
        this.label = 3;
        Object objM8562bindWalletPreCheckgIAlus$default = InterfaceC8107awW.StateListAnimator.m8562bindWalletPreCheckgIAlus$default(interfaceC8107awW2, false, this, 1, null);
        if (objM8562bindWalletPreCheckgIAlus$default == objCopydefault) {
            return objCopydefault;
        }
        walletAddressBindViewModel = walletAddressBindViewModel2;
        objM7386unboximpl = objM8562bindWalletPreCheckgIAlus$default;
        resultM7376boximpl = Result.m7376boximpl(objM7386unboximpl);
        if (resultM7376boximpl != null) {
        }
        if (resultM7376boximpl != null) {
            if (resultM7376boximpl == null) {
            }
            pUU.AEQbTJ("WalletBindViewModel", "bindWalletPreCheck onFailure", thM7380exceptionOrNullimpl);
            mutableSharedFlow = walletAddressBindViewModel.KWHzl;
            application = new gJK.Application(thM7380exceptionOrNullimpl == null ? thM7380exceptionOrNullimpl.getMessage() : null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (mutableSharedFlow.emit(application, this) == objCopydefault) {
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
