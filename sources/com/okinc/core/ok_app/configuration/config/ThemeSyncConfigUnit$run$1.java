package com.okinc.core.ok_app.configuration.config;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C33290mtf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ThemeSyncConfigUnit$run$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C33290mtf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSyncConfigUnit$run$1(C33290mtf c33290mtf, Continuation<? super ThemeSyncConfigUnit$run$1> continuation) {
        super(continuation);
        this.this$0 = c33290mtf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, this);
    }
}
