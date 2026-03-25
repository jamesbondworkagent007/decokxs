package com.okinc.localization2.repo;

import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C38314pUe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C38314pUe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1(C38314pUe c38314pUe, Continuation<? super LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1> continuation) {
        super(continuation);
        this.this$0 = c38314pUe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((String) null, (Continuation<? super Locale>) this);
    }
}
