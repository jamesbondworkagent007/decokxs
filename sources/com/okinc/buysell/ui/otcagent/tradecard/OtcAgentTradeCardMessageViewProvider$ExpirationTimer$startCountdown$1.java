package com.okinc.buysell.ui.otcagent.tradecard;

import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Long, Unit> $updateRunningState;
    final /* synthetic */ Function0<Unit> $updateTerminalState;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OtcAgentTradeCardMessageViewProvider.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1(OtcAgentTradeCardMessageViewProvider.StateListAnimator stateListAnimator, Function1<? super Long, Unit> function1, Function0<Unit> function0, Continuation<? super OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = stateListAnimator;
        this.$updateRunningState = function1;
        this.$updateTerminalState = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1 otcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1 = new OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1(this.this$0, this.$updateRunningState, this.$updateTerminalState, continuation);
        otcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1.L$0 = obj;
        return otcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:14:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jAEQbTJ;
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            jAEQbTJ = this.this$0.OLrzqt.AEQbTJ();
            coroutineScope = coroutineScope2;
            if (jAEQbTJ <= 0) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jAEQbTJ = this.J$0;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
            jAEQbTJ--;
            if (jAEQbTJ <= 0) {
                this.$updateRunningState.invoke(C56443yFo.KWHzl(jAEQbTJ));
                this.L$0 = coroutineScope;
                this.J$0 = jAEQbTJ;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else {
                this.$updateTerminalState.invoke();
                return Unit.INSTANCE;
            }
        }
    }
}
