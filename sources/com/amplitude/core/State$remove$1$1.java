package com.amplitude.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AbstractC5258Ku;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class State$remove$1$1 extends Lambda implements Function1<AbstractC5258Ku, Boolean> {
    final /* synthetic */ AbstractC5258Ku $plugin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public State$remove$1$1(AbstractC5258Ku abstractC5258Ku) {
        super(1);
        this.$plugin = abstractC5258Ku;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull AbstractC5258Ku abstractC5258Ku) {
        Intrinsics.checkNotNullParameter(abstractC5258Ku, "");
        return Boolean.valueOf(abstractC5258Ku == this.$plugin);
    }
}
