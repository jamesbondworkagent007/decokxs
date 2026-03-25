package com.okinc.business.defi.wallet.tee.repository;

import com.okinc.business.defi.biz.net.bean.ChainStatusItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.fVG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ fVG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1(fVG fvg, Continuation<? super TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1> continuation) {
        super(continuation);
        this.this$0 = fvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((String) null, (List<ChainStatusItem>) null, (Continuation<? super Unit>) this);
    }
}
