package com.okinc.oklive.app.ui.floatingwindow;

import android.content.Context;
import com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C44564sUp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44531sTi;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveFloatingWindowManager$resumeLiveActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentShareCode;
    final /* synthetic */ LiveFloatingWindowUIState $currentState;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ C44564sUp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveFloatingWindowManager$resumeLiveActivity$2(C44564sUp c44564sUp, String str, LiveFloatingWindowUIState liveFloatingWindowUIState, Map<String, Object> map, Continuation<? super LiveFloatingWindowManager$resumeLiveActivity$2> continuation) {
        super(2, continuation);
        this.this$0 = c44564sUp;
        this.$currentShareCode = str;
        this.$currentState = liveFloatingWindowUIState;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveFloatingWindowManager$resumeLiveActivity$2(this.this$0, this.$currentShareCode, this.$currentState, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveFloatingWindowManager$resumeLiveActivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
            if (interfaceC44531sTi != null) {
                Context context2 = this.this$0.AkhnZx;
                if (context2 == null) {
                    Intrinsics.gEmmrt("");
                    context = null;
                } else {
                    context = context2;
                }
                String str = this.$currentShareCode;
                String strAEQbTJ = this.$currentState.AEQbTJ();
                Map<String, Object> map = this.$params;
                Map<String, Object> map2 = map.isEmpty() ? null : map;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(872415232);
                this.label = 1;
                if (InterfaceC44531sTi.Application.navigateToLiveStreamPage$default(interfaceC44531sTi, context, str, strAEQbTJ, null, map2, numAEQbTJ, this, 8, null) == objCopydefault) {
                    return objCopydefault;
                }
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
