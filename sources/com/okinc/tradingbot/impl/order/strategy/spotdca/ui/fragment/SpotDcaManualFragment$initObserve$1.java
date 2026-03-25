package com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C50410vNj;
import o.C53273wiQ;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes16.dex */
public final class SpotDcaManualFragment$initObserve$1 extends SuspendLambda implements Function2<vNB<? extends ArrayList<DcaPreviewOrderInfo>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C53273wiQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaManualFragment$initObserve$1(C53273wiQ c53273wiQ, Continuation<? super SpotDcaManualFragment$initObserve$1> continuation) {
        super(2, continuation);
        this.this$0 = c53273wiQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotDcaManualFragment$initObserve$1 spotDcaManualFragment$initObserve$1 = new SpotDcaManualFragment$initObserve$1(this.this$0, continuation);
        spotDcaManualFragment$initObserve$1.L$0 = obj;
        return spotDcaManualFragment$initObserve$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vNB<? extends ArrayList<DcaPreviewOrderInfo>> vnb, Continuation<? super Unit> continuation) {
        return ((SpotDcaManualFragment$initObserve$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                C55326xho.toast$default(((vNB.StateListAnimator) vnb).AEQbTJ().getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (vnb instanceof vNB.TaskDescription) {
                C50410vNj.Activity activity = C50410vNj.Companion;
                FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                activity.KWHzl(parentFragmentManager, (ArrayList) ((vNB.TaskDescription) vnb).AEQbTJ(), C53273wiQ.gEmmrt(this.this$0).fvQaOB().gEmmrt(), C53273wiQ.gEmmrt(this.this$0).fvQaOB().djBIcL());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
