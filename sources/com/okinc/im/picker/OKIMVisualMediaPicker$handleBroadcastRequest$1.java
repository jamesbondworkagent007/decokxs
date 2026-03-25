package com.okinc.im.picker;

import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class OKIMVisualMediaPicker$handleBroadcastRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OKIMVisualMediaPicker this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMVisualMediaPicker$handleBroadcastRequest$1(OKIMVisualMediaPicker oKIMVisualMediaPicker, Continuation<? super OKIMVisualMediaPicker$handleBroadcastRequest$1> continuation) {
        super(continuation);
        this.this$0 = oKIMVisualMediaPicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((List<? extends Uri>) null, (Continuation<? super Unit>) this);
    }
}
