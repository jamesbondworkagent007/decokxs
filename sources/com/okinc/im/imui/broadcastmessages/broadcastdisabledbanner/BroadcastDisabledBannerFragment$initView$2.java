package com.okinc.im.imui.broadcastmessages.broadcastdisabledbanner;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33892nJs;
import o.C35394nuX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastDisabledBannerFragment$initView$2 extends SuspendLambda implements yHO<FlowCollector<? super Boolean>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C35394nuX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastDisabledBannerFragment$initView$2(C35394nuX c35394nuX, Continuation<? super BroadcastDisabledBannerFragment$initView$2> continuation) {
        super(3, continuation);
        this.this$0 = c35394nuX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(flowCollector, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, boolean z, Continuation<? super Unit> continuation) {
        BroadcastDisabledBannerFragment$initView$2 broadcastDisabledBannerFragment$initView$2 = new BroadcastDisabledBannerFragment$initView$2(this.this$0, continuation);
        broadcastDisabledBannerFragment$initView$2.L$0 = flowCollector;
        broadcastDisabledBannerFragment$initView$2.Z$0 = z;
        return broadcastDisabledBannerFragment$initView$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayout root;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            boolean z = this.Z$0;
            C33892nJs c33892nJs = this.this$0.copydefault;
            if (c33892nJs != null && (root = c33892nJs.getRoot()) != null) {
                root.setVisibility(z ? 0 : 8);
            }
            Boolean boolKWHzl = C56443yFo.KWHzl(z);
            this.label = 1;
            if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
