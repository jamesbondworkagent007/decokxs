package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C17304fAj;
import o.C19332fzL;
import o.C19339fzS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$onBindWalletSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletInfo $walletInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindViewModel$onBindWalletSelected$1(WalletBindViewModel walletBindViewModel, WalletInfo walletInfo, Continuation<? super WalletBindViewModel$onBindWalletSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
        this.$walletInfo = walletInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindViewModel$onBindWalletSelected$1(this.this$0, this.$walletInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindViewModel$onBindWalletSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #0 {all -> 0x013f, blocks: (B:9:0x001c, B:55:0x0138, B:14:0x0031, B:51:0x0107, B:52:0x0120, B:17:0x0040, B:44:0x00ce, B:45:0x00e9, B:47:0x00ef, B:20:0x004d, B:31:0x009f, B:35:0x00a8, B:37:0x00ac, B:40:0x00bd, B:27:0x007c), top: B:64:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:9:0x001c, B:55:0x0138, B:14:0x0031, B:51:0x0107, B:52:0x0120, B:17:0x0040, B:44:0x00ce, B:45:0x00e9, B:47:0x00ef, B:20:0x004d, B:31:0x009f, B:35:0x00a8, B:37:0x00ac, B:40:0x00bd, B:27:0x007c), top: B:64:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletInfo walletInfo;
        WalletBindViewModel walletBindViewModel;
        Object objM7386unboximpl;
        C19332fzL.Application application;
        Object obj2;
        C19332fzL.Application application2;
        Throwable thM7380exceptionOrNullimpl2;
        WalletBindViewModel walletBindViewModel2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.isConnected;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    walletInfo = (WalletInfo) this.L$1;
                    walletBindViewModel = (WalletBindViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    application = (C19332fzL.Application) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                    if (application != null) {
                        C17304fAj.EZpvd.AEQbTJ(walletInfo);
                        MutableSharedFlow mutableSharedFlow3 = walletBindViewModel.AYXKKw;
                        String strKWHzl = application.KWHzl();
                        if (strKWHzl == null) {
                            strKWHzl = "";
                        }
                        this.L$0 = walletBindViewModel;
                        this.L$1 = objM7386unboximpl;
                        this.L$2 = application;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(strKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objM7386unboximpl;
                        application2 = application;
                        C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info success,token is:" + application2.KWHzl());
                        objM7386unboximpl = obj2;
                    }
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    mutableSharedFlow = walletBindViewModel.isConnected;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info error:" + thM7380exceptionOrNullimpl.getMessage());
                        }
                        return Unit.INSTANCE;
                    }
                    thM7380exceptionOrNullimpl2 = (Throwable) this.L$1;
                    walletBindViewModel2 = (WalletBindViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info error:" + thM7380exceptionOrNullimpl2.getMessage());
                    walletBindViewModel = walletBindViewModel2;
                    mutableSharedFlow = walletBindViewModel.isConnected;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                application2 = (C19332fzL.Application) this.L$2;
                obj2 = this.L$1;
                walletBindViewModel = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info success,token is:" + application2.KWHzl());
                objM7386unboximpl = obj2;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                    MutableSharedFlow mutableSharedFlow4 = walletBindViewModel.AhwBna;
                    String message = thM7380exceptionOrNullimpl2.getMessage();
                    this.L$0 = walletBindViewModel;
                    this.L$1 = thM7380exceptionOrNullimpl2;
                    this.L$2 = null;
                    this.label = 4;
                    if (mutableSharedFlow4.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    walletBindViewModel2 = walletBindViewModel;
                    C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info error:" + thM7380exceptionOrNullimpl2.getMessage());
                    walletBindViewModel = walletBindViewModel2;
                }
                mutableSharedFlow = walletBindViewModel.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get token by wallet info started");
        WalletBindViewModel walletBindViewModel3 = this.this$0;
        walletInfo = this.$walletInfo;
        Result.Application application4 = Result.Companion;
        C19332fzL c19332fzL = walletBindViewModel3.QbewEr;
        C19332fzL.Activity activity = new C19332fzL.Activity(walletInfo.KWHzl(), walletInfo.OLrzqt());
        this.L$0 = walletBindViewModel3;
        this.L$1 = walletInfo;
        this.label = 2;
        Object objEZpvd = c19332fzL.EZpvd(activity, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        walletBindViewModel = walletBindViewModel3;
        objM7386unboximpl = objEZpvd;
        application = (C19332fzL.Application) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        if (application != null) {
        }
        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl2 != null) {
        }
        mutableSharedFlow = walletBindViewModel.isConnected;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 5;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
