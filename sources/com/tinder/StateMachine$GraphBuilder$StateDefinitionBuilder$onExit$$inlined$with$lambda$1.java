package com.tinder;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [STATE, EVENT] */
/* JADX INFO: loaded from: classes12.dex */
public final class StateMachine$GraphBuilder$StateDefinitionBuilder$onExit$$inlined$with$lambda$1<EVENT, STATE> extends Lambda implements Function2<STATE, EVENT, Unit> {
    final /* synthetic */ Function2 $listener$inlined;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$GraphBuilder$StateDefinitionBuilder$onExit$$inlined$with$lambda$1(Function2 function2) {
        super(2);
        this.$listener$inlined = function2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
        invoke2(obj, obj2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function2.invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull STATE state, @NotNull EVENT event) {
        Intrinsics.EZpvd((Object) state, "");
        Intrinsics.EZpvd((Object) event, "");
        this.$listener$inlined.invoke(state, event);
    }
}
