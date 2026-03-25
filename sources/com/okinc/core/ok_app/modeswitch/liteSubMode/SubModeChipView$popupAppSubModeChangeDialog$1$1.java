package com.okinc.core.ok_app.modeswitch.liteSubMode;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33249msr;
import o.C33250mss;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33237msf;

/* JADX INFO: loaded from: classes8.dex */
public final class SubModeChipView$popupAppSubModeChangeDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Integer, Integer, Unit> $callback;
    final /* synthetic */ AbstractC33249msr $currentMode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubModeChipView$popupAppSubModeChangeDialog$1$1(Function2<? super Integer, ? super Integer, Unit> function2, AbstractC33249msr abstractC33249msr, Continuation<? super SubModeChipView$popupAppSubModeChangeDialog$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$currentMode = abstractC33249msr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubModeChipView$popupAppSubModeChangeDialog$1$1(this.$callback, this.$currentMode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SubModeChipView$popupAppSubModeChangeDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$callback.invoke(C56443yFo.AEQbTJ(C33250mss.copydefault(this.$currentMode)), C56443yFo.AEQbTJ(C33250mss.copydefault(((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue())));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
