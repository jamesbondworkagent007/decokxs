package com.amplitude.experiment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C5287Lx;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultExperimentClient$flags$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultExperimentClient$flags$1(Object obj) {
        super(0, obj, C5287Lx.class, "mergeInitialFlagsWithStorage", "mergeInitialFlagsWithStorage()V", 0);
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
        ((C5287Lx) this.receiver).valueOf();
    }
}
