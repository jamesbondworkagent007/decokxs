package com.okinc.uilab.dialog;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.wZL;

/* JADX INFO: loaded from: classes19.dex */
public final class OKDialog$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ViewOnClickListenerC54939xaY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKDialog$onCreate$2(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Continuation<? super OKDialog$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC54939xaY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKDialog$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKDialog$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityKWHzl = C55296xhK.KWHzl(context);
            if (activityKWHzl == null || activityKWHzl.isFinishing() || activityKWHzl.isDestroyed()) {
                pUU.EZpvd("windowInfoTracker failed to create flow inside OKDialog.onCreate, host activity isNull=" + (activityKWHzl == null) + ", isFinishing=" + (activityKWHzl != null ? C56443yFo.KWHzl(activityKWHzl.isFinishing()) : null) + ", isDestroyed=" + (activityKWHzl != null ? C56443yFo.KWHzl(activityKWHzl.isDestroyed()) : null));
                return Unit.INSTANCE;
            }
            Flow<WindowLayoutInfo> flowWindowLayoutInfo = WindowInfoTracker.Companion.getOrCreate(activityKWHzl).windowLayoutInfo(activityKWHzl);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.this$0;
            FlowCollector<? super WindowLayoutInfo> flowCollector = new FlowCollector() { // from class: com.okinc.uilab.dialog.OKDialog$onCreate$2.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(WindowLayoutInfo windowLayoutInfo, Continuation<? super Unit> continuation) {
                    wZL wzl = viewOnClickListenerC54939xaY.AuCTel;
                    if (wzl != null) {
                        viewOnClickListenerC54939xaY.EZpvd(wzl);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWindowLayoutInfo.collect(flowCollector, this) == objCopydefault) {
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
