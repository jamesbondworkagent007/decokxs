package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.server.AppLink;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C38313pUd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$requestLangPackGroupInfo$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$requestLangPackGroupInfo$1(C38313pUd c38313pUd, Continuation<? super LanguagePackRepo$requestLangPackGroupInfo$1> continuation) {
        super(continuation);
        this.this$0 = c38313pUd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((LanguageUnit) null, (Continuation<? super AppLink>) this);
    }
}
