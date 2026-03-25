package com.amplitude.android;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C5216Je;
import o.C5221Jj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Configuration$defaultTracking$2 extends Lambda implements Function1<C5221Jj, Unit> {
    final /* synthetic */ C5216Je this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Configuration$defaultTracking$2(C5216Je c5216Je) {
        super(1);
        this.this$0 = c5216Je;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C5221Jj c5221Jj) {
        invoke2(c5221Jj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull C5221Jj c5221Jj) {
        Intrinsics.checkNotNullParameter(c5221Jj, "");
        this.this$0.copydefault(c5221Jj);
    }
}
