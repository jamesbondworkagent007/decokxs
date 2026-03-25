package com.okinc.unify_trade;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC54646xQb;
import o.C55608xnE;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ITradeExtKt$createMarginDataSource$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ITradeExtKt$createMarginDataSource$1(Continuation<? super ITradeExtKt$createMarginDataSource$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C55608xnE.AEQbTJ((InterfaceC54581xNr) null, (MutableLiveData<SourceResp<AbstractC54646xQb>>) null, this);
    }
}
