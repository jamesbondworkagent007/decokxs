package com.tinder.scarlet.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58090yui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class FlowableStream$start$disposable$2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FlowableStream$start$disposable$2(Object obj) {
        super(1, obj, InterfaceC58090yui.Activity.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        ((InterfaceC58090yui.Activity) this.receiver).EZpvd(th);
    }
}
