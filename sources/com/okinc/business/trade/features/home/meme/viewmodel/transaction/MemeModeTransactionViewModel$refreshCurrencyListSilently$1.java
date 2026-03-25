package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.kVP;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$refreshCurrencyListSilently$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $tokenBase;
    Object L$0;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$refreshCurrencyListSilently$1(MemeModeTransactionViewModel memeModeTransactionViewModel, TokenBase tokenBase, Continuation<? super MemeModeTransactionViewModel$refreshCurrencyListSilently$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$tokenBase = tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$refreshCurrencyListSilently$1(this.this$0, this.$tokenBase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$refreshCurrencyListSilently$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKG kkg = this.this$0.QfsBiF;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    kVP kvpZsXlph = this.this$0.zsXlph();
                    String chainId = this.$tokenBase.getChainId();
                    this.L$0 = null;
                    this.label = 3;
                    objCopydefault = kvpZsXlph.copydefault(chainId, "1", str, (String) obj, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    MemeModeTransactionViewModel memeModeTransactionViewModel = this.this$0;
                    TokenBase tokenBase = this.$tokenBase;
                    if (Result.m7384isSuccessimpl(objCopydefault)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
                TokenBase tokenBase2 = this.$tokenBase;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    memeModeTransactionViewModel2.zsXlph().EZpvd(tokenBase2.getChainId(), (List<MemeCurrencyBean>) objCopydefault);
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("MemeModeTransactionViewModel", "refreshCurrencyListSilently error: " + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        str = (String) obj;
        kKG kkg2 = this.this$0.QfsBiF;
        this.L$0 = str;
        this.label = 2;
        obj = kkg2.copydefault(this);
        if (obj == objCopydefault2) {
            return objCopydefault2;
        }
        kVP kvpZsXlph2 = this.this$0.zsXlph();
        String chainId2 = this.$tokenBase.getChainId();
        this.L$0 = null;
        this.label = 3;
        objCopydefault = kvpZsXlph2.copydefault(chainId2, "1", str, (String) obj, this);
        if (objCopydefault == objCopydefault2) {
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel22 = this.this$0;
        TokenBase tokenBase22 = this.$tokenBase;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
