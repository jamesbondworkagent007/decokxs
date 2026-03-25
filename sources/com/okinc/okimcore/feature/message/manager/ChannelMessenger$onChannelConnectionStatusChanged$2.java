package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AbstractC44292sKk;
import o.yHT;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ChannelMessenger$onChannelConnectionStatusChanged$2 extends FunctionReferenceImpl implements yHT<OKMessage, Boolean, String, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelMessenger$onChannelConnectionStatusChanged$2(Object obj) {
        super(4, obj, AbstractC44292sKk.class, "onReceiveMessage", "onReceiveMessage(Lcom/okinc/okimcore/model/im/OKMessage;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(OKMessage oKMessage, boolean z, String str, Continuation<? super Unit> continuation) {
        return ((AbstractC44292sKk) this.receiver).copydefault(oKMessage, z, str, continuation);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(OKMessage oKMessage, Boolean bool, String str, Continuation<? super Unit> continuation) {
        return invoke(oKMessage, bool.booleanValue(), str, continuation);
    }
}
