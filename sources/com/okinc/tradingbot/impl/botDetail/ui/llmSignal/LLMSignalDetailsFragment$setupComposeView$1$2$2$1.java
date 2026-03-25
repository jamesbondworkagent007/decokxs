package com.okinc.tradingbot.impl.botDetail.ui.llmSignal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C48213uJd;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class LLMSignalDetailsFragment$setupComposeView$1$2$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LLMSignalDetailsFragment$setupComposeView$1$2$2$1(Object obj) {
        super(0, obj, C48213uJd.class, "onPromptExpandClick", "onPromptExpandClick()V", 0);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((C48213uJd) this.receiver).fetchVPNInfo();
    }
}
