package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$handleSearchResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$handleSearchResult$1(MemeModeTransactionViewModel memeModeTransactionViewModel, Continuation<? super MemeModeTransactionViewModel$handleSearchResult$1> continuation) {
        super(continuation);
        this.this$0 = memeModeTransactionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (TokenBase) null, (Function2<? super TokenBase, ? super TokenBase, Unit>) null, (Continuation<? super Unit>) this);
    }
}
