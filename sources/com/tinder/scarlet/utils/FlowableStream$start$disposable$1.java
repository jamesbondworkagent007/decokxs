package com.tinder.scarlet.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC58090yui;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class FlowableStream$start$disposable$1<T> extends FunctionReferenceImpl implements Function1<T, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FlowableStream$start$disposable$1(Object obj) {
        super(1, obj, InterfaceC58090yui.Activity.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t) {
        ((InterfaceC58090yui.Activity) this.receiver).copydefault(t);
    }
}
