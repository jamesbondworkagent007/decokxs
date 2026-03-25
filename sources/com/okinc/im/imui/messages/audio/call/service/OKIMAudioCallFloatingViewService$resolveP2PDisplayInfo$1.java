package com.okinc.im.imui.messages.audio.call.service;

import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC35331ntM;
import o.ServiceC37177oos;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ServiceC37177oos this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1(ServiceC37177oos serviceC37177oos, Continuation<? super OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$1> continuation) {
        super(continuation);
        this.this$0 = serviceC37177oos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((InterfaceC35331ntM) null, (OKCallSession) null, (Continuation<? super Pair<String, OfficialTagInfo>>) this);
    }
}
