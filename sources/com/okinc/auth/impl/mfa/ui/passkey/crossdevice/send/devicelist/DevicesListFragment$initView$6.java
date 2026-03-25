package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C5887aEu;
import o.C8281azl;

/* JADX INFO: loaded from: classes14.dex */
public final class DevicesListFragment$initView$6 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C5887aEu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicesListFragment$initView$6(C5887aEu c5887aEu, Continuation<? super DevicesListFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c5887aEu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DevicesListFragment$initView$6 devicesListFragment$initView$6 = new DevicesListFragment$initView$6(this.this$0, continuation);
        devicesListFragment$initView$6.Z$0 = ((Boolean) obj).booleanValue();
        return devicesListFragment$initView$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((DevicesListFragment$initView$6) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                C8281azl c8281azl = this.this$0.EZpvd;
                if (c8281azl != null && (c52794wYp2 = c8281azl.EZpvd) != null) {
                    C52794wYp.startLoading$default(c52794wYp2, 0L, 1, null);
                }
            } else {
                C8281azl c8281azl2 = this.this$0.EZpvd;
                if (c8281azl2 != null && (c52794wYp = c8281azl2.EZpvd) != null) {
                    c52794wYp.fIwbmz();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
