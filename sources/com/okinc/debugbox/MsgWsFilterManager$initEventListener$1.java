package com.okinc.debugbox;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C31969mKq;
import o.C33146mqu;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class MsgWsFilterManager$initEventListener$1 extends FunctionReferenceImpl implements Function1<C33146mqu, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MsgWsFilterManager$initEventListener$1(Object obj) {
        super(1, obj, C31969mKq.class, "handleSenderMsg", "handleSenderMsg(Lcom/okinc/core/net/ws/WsMsgSenderEvent;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C33146mqu c33146mqu) {
        invoke2(c33146mqu);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C33146mqu c33146mqu) {
        Intrinsics.checkNotNullParameter(c33146mqu, "");
        ((C31969mKq) this.receiver).copydefault(c33146mqu);
    }
}
