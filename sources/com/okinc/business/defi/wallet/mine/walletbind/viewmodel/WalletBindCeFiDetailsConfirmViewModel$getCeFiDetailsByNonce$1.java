package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C19337fzQ;
import o.C19339fzS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $nonce;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WalletBindCeFiDetailsConfirmViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1(String str, WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel, Continuation<? super WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1> continuation) {
        super(2, continuation);
        this.$nonce = str;
        this.this$0 = walletBindCeFiDetailsConfirmViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1(this.$nonce, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:14:0x0042, B:41:0x0102, B:43:0x0124, B:17:0x004f, B:28:0x00af, B:32:0x00b8, B:34:0x00bc, B:35:0x00e5, B:37:0x00eb, B:24:0x0091), top: B:59:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:14:0x0042, B:41:0x0102, B:43:0x0124, B:17:0x004f, B:28:0x00af, B:32:0x00b8, B:34:0x00bc, B:35:0x00e5, B:37:0x00eb, B:24:0x0091), top: B:59:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        Throwable th;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel;
        String str2;
        Object objM7386unboximpl;
        ValidateNonceResponseBody validateNonceResponseBody;
        Throwable thM7380exceptionOrNullimpl2;
        Unit unit;
        String str3;
        Throwable th2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th3) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce started,nonce:" + this.$nonce);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    str2 = (String) this.L$1;
                    walletBindCeFiDetailsConfirmViewModel = (WalletBindCeFiDetailsConfirmViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    validateNonceResponseBody = (ValidateNonceResponseBody) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                    if (validateNonceResponseBody != null) {
                        walletBindCeFiDetailsConfirmViewModel.EZpvd.setValue(validateNonceResponseBody);
                        C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce succeed,nonce:" + str2 + ",username:" + validateNonceResponseBody.getMaskedUserName());
                    }
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl2 == null) {
                        MutableSharedFlow mutableSharedFlow3 = walletBindCeFiDetailsConfirmViewModel.AEQbTJ;
                        String message = thM7380exceptionOrNullimpl2.getMessage();
                        this.L$0 = str2;
                        this.L$1 = thM7380exceptionOrNullimpl2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(message, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        str3 = str2;
                        th2 = thM7380exceptionOrNullimpl2;
                        C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce failed,nonce:" + str3 + ",error:" + th2.getMessage());
                        unit = Unit.INSTANCE;
                        objM7377constructorimpl = Result.m7377constructorimpl(unit);
                        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel2 = this.this$0;
                        String str4 = this.$nonce;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        mutableSharedFlow = this.this$0.KWHzl;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                    unit = null;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel22 = this.this$0;
                    String str42 = this.$nonce;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableSharedFlow = this.this$0.KWHzl;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    th = (Throwable) this.L$2;
                    str = (String) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce failed,nonce:" + str + ",error:" + th.getMessage());
                    mutableSharedFlow = this.this$0.KWHzl;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                th2 = (Throwable) this.L$1;
                str3 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce failed,nonce:" + str3 + ",error:" + th2.getMessage());
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel222 = this.this$0;
                String str422 = this.$nonce;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow4 = walletBindCeFiDetailsConfirmViewModel222.AEQbTJ;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = str422;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 4;
                    if (mutableSharedFlow4.emit(message2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    str = str422;
                    th = thM7380exceptionOrNullimpl;
                    C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "get cefi detail by nonce failed,nonce:" + str + ",error:" + th.getMessage());
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel3 = this.this$0;
        String str5 = this.$nonce;
        Result.Application application2 = Result.Companion;
        C19337fzQ c19337fzQ = walletBindCeFiDetailsConfirmViewModel3.ejfBZ;
        ValidateNonceRequestBody validateNonceRequestBody = new ValidateNonceRequestBody(str5);
        this.L$0 = walletBindCeFiDetailsConfirmViewModel3;
        this.L$1 = str5;
        this.label = 2;
        Object objEZpvd = c19337fzQ.EZpvd(validateNonceRequestBody, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        walletBindCeFiDetailsConfirmViewModel = walletBindCeFiDetailsConfirmViewModel3;
        str2 = str5;
        objM7386unboximpl = objEZpvd;
        validateNonceResponseBody = (ValidateNonceResponseBody) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        if (validateNonceResponseBody != null) {
        }
        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl2 == null) {
        }
    }
}
