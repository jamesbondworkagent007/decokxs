package com.okinc.im.imui.messageV2.view.banner.joincall;

import androidx.fragment.app.Fragment;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.nJO;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class JoinOnGoingCallFragment$initObserver$2 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ JoinOnGoingCallFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinOnGoingCallFragment$initObserver$2(JoinOnGoingCallFragment joinOnGoingCallFragment, Continuation<? super JoinOnGoingCallFragment$initObserver$2> continuation) {
        super(3, continuation);
        this.this$0 = joinOnGoingCallFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        JoinOnGoingCallFragment$initObserver$2 joinOnGoingCallFragment$initObserver$2 = new JoinOnGoingCallFragment$initObserver$2(this.this$0, continuation);
        joinOnGoingCallFragment$initObserver$2.Z$0 = z;
        return joinOnGoingCallFragment$initObserver$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKAlertBanner oKAlertBanner;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            nJO njo = this.this$0.djBIcL;
            if (njo != null && (oKAlertBanner = njo.KWHzl) != null) {
                oKAlertBanner.setVisibility(z ? 0 : 8);
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
