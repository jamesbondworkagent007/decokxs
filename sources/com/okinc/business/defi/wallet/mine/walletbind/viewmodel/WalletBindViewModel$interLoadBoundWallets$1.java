package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C18877fqh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$interLoadBoundWallets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletBindViewModel$interLoadBoundWallets$1(WalletBindViewModel walletBindViewModel, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super WalletBindViewModel$interLoadBoundWallets$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
        this.$block = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindViewModel$interLoadBoundWallets$1 walletBindViewModel$interLoadBoundWallets$1 = new WalletBindViewModel$interLoadBoundWallets$1(this.this$0, this.$block, continuation);
        walletBindViewModel$interLoadBoundWallets$1.L$0 = obj;
        return walletBindViewModel$interLoadBoundWallets$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindViewModel$interLoadBoundWallets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objOLrzqt;
        Object obj2;
        WalletBindViewModel walletBindViewModel;
        List list;
        WalletBindViewModel walletBindViewModel2;
        List list2;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MutableSharedFlow mutableSharedFlow2 = this.this$0.isConnected;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    obj2 = objOLrzqt;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    walletBindViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        list = (List) obj2;
                        if (function2 != null) {
                            this.L$0 = obj2;
                            this.L$1 = walletBindViewModel;
                            this.L$2 = list;
                            this.label = 3;
                            if (function2.invoke(coroutineScope, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            walletBindViewModel2 = walletBindViewModel;
                            list2 = list;
                            list = list2;
                            walletBindViewModel = walletBindViewModel2;
                        }
                        walletBindViewModel.copydefault.setValue(list);
                    }
                    WalletBindViewModel walletBindViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableSharedFlow = this.this$0.isConnected;
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
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.isConnected;
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
                list2 = (List) this.L$2;
                walletBindViewModel2 = (WalletBindViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list2;
                walletBindViewModel = walletBindViewModel2;
                walletBindViewModel.copydefault.setValue(list);
                WalletBindViewModel walletBindViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow3 = walletBindViewModel32.AhwBna;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        WalletBindViewModel walletBindViewModel4 = this.this$0;
        this.L$0 = coroutineScope;
        this.label = 2;
        objOLrzqt = walletBindViewModel4.OLrzqt((Continuation<? super Result<? extends List<C18877fqh>>>) this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objOLrzqt;
        Function2<CoroutineScope, Continuation<? super Unit>, Object> function22 = this.$block;
        walletBindViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        WalletBindViewModel walletBindViewModel322 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        mutableSharedFlow = this.this$0.isConnected;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 5;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
