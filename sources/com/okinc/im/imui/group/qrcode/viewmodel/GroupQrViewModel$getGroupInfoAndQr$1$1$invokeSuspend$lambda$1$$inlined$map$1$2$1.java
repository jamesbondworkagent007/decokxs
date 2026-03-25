package com.okinc.im.imui.group.qrcode.viewmodel;

import com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfoAndQr$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupQrViewModel$getGroupInfoAndQr$1.AnonymousClass1.Activity.C04521 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(GroupQrViewModel$getGroupInfoAndQr$1.AnonymousClass1.Activity.C04521 c04521, Continuation continuation) {
        super(continuation);
        this.this$0 = c04521;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
