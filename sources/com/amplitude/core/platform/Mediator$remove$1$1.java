package com.amplitude.core.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Mediator$remove$1$1 extends Lambda implements Function1<Plugin, Boolean> {
    final /* synthetic */ Plugin $plugin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mediator$remove$1$1(Plugin plugin) {
        super(1);
        this.$plugin = plugin;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull Plugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "");
        return Boolean.valueOf(plugin == this.$plugin);
    }
}
