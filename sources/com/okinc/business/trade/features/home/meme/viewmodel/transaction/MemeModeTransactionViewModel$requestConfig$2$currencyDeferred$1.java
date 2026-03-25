package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

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
import o.kVP;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends MemeCurrencyBean>>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $userUniqueId;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, String str2, String str3, Continuation<? super MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$chainId = str;
        this.$accountId = str2;
        this.$userUniqueId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1(this.this$0, this.$chainId, this.$accountId, this.$userUniqueId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends MemeCurrencyBean>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<MemeCurrencyBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<MemeCurrencyBean>>> continuation) {
        return ((MemeModeTransactionViewModel$requestConfig$2$currencyDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kVP kvpZsXlph = this.this$0.zsXlph();
            String str = this.$chainId;
            String str2 = this.$accountId;
            String str3 = this.$userUniqueId;
            this.label = 1;
            objCopydefault = kvpZsXlph.copydefault(str, "1", str2, str3, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objCopydefault);
    }
}
