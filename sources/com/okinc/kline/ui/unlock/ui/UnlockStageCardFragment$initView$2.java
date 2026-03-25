package com.okinc.kline.ui.unlock.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C36110oPq;
import o.C39705pxQ;
import o.C39738pxx;
import o.C39784pyq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.oOX;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class UnlockStageCardFragment$initView$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C39705pxQ>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C39738pxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockStageCardFragment$initView$2(C39738pxx c39738pxx, View view, Continuation<? super UnlockStageCardFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c39738pxx;
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnlockStageCardFragment$initView$2 unlockStageCardFragment$initView$2 = new UnlockStageCardFragment$initView$2(this.this$0, this.$view, continuation);
        unlockStageCardFragment$initView$2.L$0 = obj;
        return unlockStageCardFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39705pxQ> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C39705pxQ>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C39705pxQ> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((UnlockStageCardFragment$initView$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36110oPq c36110oPq;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C39738pxx c39738pxx = this.this$0;
            View view = this.$view;
            try {
                Result.Application application = Result.Companion;
                if ((interfaceC49371unL instanceof InterfaceC49371unL.Activity) && ((C39705pxQ) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).copydefault() > -1 && (!((C39705pxQ) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).EZpvd().isEmpty())) {
                    UnlockTokenStageDataVo unlockTokenStageDataVo = ((C39705pxQ) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).EZpvd().get(((C39705pxQ) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).copydefault());
                    UnlockTokenStageDataVo unlockTokenStageDataVo2 = unlockTokenStageDataVo;
                    oOX oox = c39738pxx.AhwBna;
                    if (oox != null && (c36110oPq = oox.KWHzl) != null) {
                        C39784pyq.AEQbTJ(c36110oPq, unlockTokenStageDataVo2);
                    }
                    c39738pxx.valueOf = unlockTokenStageDataVo;
                    view.setVisibility(0);
                    rVN.reportFullyDrawn$default((Fragment) c39738pxx, true, (String) null, 2, (Object) null);
                } else {
                    view.setVisibility(8);
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        rVN.reportFullyDrawn$default((Fragment) c39738pxx, false, (String) null, 2, (Object) null);
                    }
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
