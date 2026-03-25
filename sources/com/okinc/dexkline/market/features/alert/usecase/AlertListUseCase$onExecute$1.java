package com.okinc.dexkline.market.features.alert.usecase;

import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C32277mWa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class AlertListUseCase$onExecute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C32277mWa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertListUseCase$onExecute$1(C32277mWa c32277mWa, Continuation<? super AlertListUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c32277mWa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Unit) null, (Continuation<? super List<AlertRemindPo>>) this);
    }
}
