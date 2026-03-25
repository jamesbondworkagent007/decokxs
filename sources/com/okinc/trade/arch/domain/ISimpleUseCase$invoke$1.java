package com.okinc.trade.arch.domain;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC49405unt;

/* JADX INFO: Add missing generic type declarations: [Input, Output] */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ISimpleUseCase$invoke$1<Input, Output> extends FunctionReferenceImpl implements Function1<Input, Output> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ISimpleUseCase$invoke$1(Object obj) {
        super(1, obj, InterfaceC49405unt.class, "onExecute", "onExecute(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Output invoke(Input input) {
        return (Output) ((InterfaceC49405unt) this.receiver).AEQbTJ(input);
    }
}
