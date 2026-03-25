package com.okinc.oklive.app.ui.service;

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
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44531sTi;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveFloatingWindowService$resumeLiveActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ String $shareCode;
    final /* synthetic */ LiveFloatingWindowUIState $uiState;
    int label;
    final /* synthetic */ LiveFloatingWindowService this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveFloatingWindowService$resumeLiveActivity$2(LiveFloatingWindowService liveFloatingWindowService, String str, LiveFloatingWindowUIState liveFloatingWindowUIState, Map<String, Object> map, Continuation<? super LiveFloatingWindowService$resumeLiveActivity$2> continuation) {
        super(2, continuation);
        this.this$0 = liveFloatingWindowService;
        this.$shareCode = str;
        this.$uiState = liveFloatingWindowUIState;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveFloatingWindowService$resumeLiveActivity$2(this.this$0, this.$shareCode, this.$uiState, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveFloatingWindowService$resumeLiveActivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
            if (interfaceC44531sTi != null) {
                Context applicationContext = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                String str = this.$shareCode;
                String strAEQbTJ = this.$uiState.AEQbTJ();
                Map<String, Object> map = this.$params;
                if (map.isEmpty()) {
                    map = null;
                }
                Integer numAEQbTJ = C56443yFo.AEQbTJ(872415232);
                this.label = 1;
                if (InterfaceC44531sTi.Application.navigateToLiveStreamPage$default(interfaceC44531sTi, applicationContext, str, strAEQbTJ, null, map, numAEQbTJ, this, 8, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.gEmmrt();
        return Unit.INSTANCE;
    }
}
