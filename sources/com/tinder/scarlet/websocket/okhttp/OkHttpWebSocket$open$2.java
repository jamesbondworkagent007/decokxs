package com.tinder.scarlet.websocket.okhttp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C58141yvg;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class OkHttpWebSocket$open$2 extends FunctionReferenceImpl implements Function1<InterfaceC58092yuk.Activity, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkHttpWebSocket$open$2(Object obj) {
        super(1, obj, C58141yvg.class, "handleWebSocketEvent", "handleWebSocketEvent(Lcom/tinder/scarlet/WebSocket$Event;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC58092yuk.Activity activity) {
        invoke2(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC58092yuk.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        ((C58141yvg) this.receiver).copydefault(activity);
    }
}
