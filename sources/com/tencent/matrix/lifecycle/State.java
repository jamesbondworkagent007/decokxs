package com.tencent.matrix.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57916yrT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public enum State {
    INIT(null),
    ON(new Function1<InterfaceC57916yrT, Unit>() { // from class: com.tencent.matrix.lifecycle.State.1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC57916yrT interfaceC57916yrT) {
            invoke2(interfaceC57916yrT);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            interfaceC57916yrT.KWHzl();
        }
    }),
    OFF(new Function1<InterfaceC57916yrT, Unit>() { // from class: com.tencent.matrix.lifecycle.State.2
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC57916yrT interfaceC57916yrT) {
            invoke2(interfaceC57916yrT);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            interfaceC57916yrT.OLrzqt();
        }
    });

    private final Function1<InterfaceC57916yrT, Unit> dispatch;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<InterfaceC57916yrT, Unit> getDispatch() {
        return this.dispatch;
    }

    State(Function1 function1) {
        this.dispatch = function1;
    }
}
