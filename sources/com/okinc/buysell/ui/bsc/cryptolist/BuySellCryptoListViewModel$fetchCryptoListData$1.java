package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$fetchCryptoListData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellCryptoListViewModel$fetchCryptoListData$1(BuySellCryptoListViewModel buySellCryptoListViewModel, Continuation<? super BuySellCryptoListViewModel$fetchCryptoListData$1> continuation) {
        super(continuation);
        this.this$0 = buySellCryptoListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((List<? extends BuySellCryptoListViewModel.ApiTask>) null, (LifecycleOwner) null, (Continuation<? super Unit>) this);
    }
}
