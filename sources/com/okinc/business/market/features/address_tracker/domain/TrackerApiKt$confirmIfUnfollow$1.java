package com.okinc.business.market.features.address_tracker.domain;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import o.C25640jAx;
import o.InterfaceC25657jBn;
import o.jAF;
import o.jAT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$confirmIfUnfollow$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerApiKt$confirmIfUnfollow$1(Continuation<? super TrackerApiKt$confirmIfUnfollow$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return jAT.copydefault((jAF) null, (C25640jAx) null, (InterfaceC25657jBn) null, (String) null, (List<Integer>) null, false, (Context) null, (Function1<? super Boolean, Unit>) null, (Continuation<? super Unit>) this);
    }
}
