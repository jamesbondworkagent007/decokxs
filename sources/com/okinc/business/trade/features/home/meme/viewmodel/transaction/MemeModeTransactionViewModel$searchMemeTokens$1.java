package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$searchMemeTokens$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$searchMemeTokens$1(MemeModeTransactionViewModel memeModeTransactionViewModel, Continuation<? super MemeModeTransactionViewModel$searchMemeTokens$1> continuation) {
        super(continuation);
        this.this$0 = memeModeTransactionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl((String) null, (String) null, (String) null, (Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>) this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
