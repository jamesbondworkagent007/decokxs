package com.amplifyframework.predictions.aws.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3(Object obj) {
        super(1, obj, RunFaceLivenessSession.class, "stopLivenessSession", "stopLivenessSession(Ljava/lang/Integer;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        ((RunFaceLivenessSession) this.receiver).stopLivenessSession(num);
    }
}
