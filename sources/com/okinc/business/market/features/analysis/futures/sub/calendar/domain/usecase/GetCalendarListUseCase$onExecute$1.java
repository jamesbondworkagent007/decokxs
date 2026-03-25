package com.okinc.business.market.features.analysis.futures.sub.calendar.domain.usecase;

import java.util.Date;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C25876jJq;
import o.jIU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class GetCalendarListUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jIU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCalendarListUseCase$onExecute$1(jIU jiu, Continuation<? super GetCalendarListUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = jiu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Triple<? extends Date, String, String>) null, (Continuation<? super C25876jJq>) this);
    }
}
