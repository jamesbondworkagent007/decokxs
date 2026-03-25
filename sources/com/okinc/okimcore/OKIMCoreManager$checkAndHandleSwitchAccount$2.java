package com.okinc.okimcore;

import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sDO;

/* JADX INFO: loaded from: classes10.dex */
public final class OKIMCoreManager$checkAndHandleSwitchAccount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ sDO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMCoreManager$checkAndHandleSwitchAccount$2(sDO sdo, Continuation<? super OKIMCoreManager$checkAndHandleSwitchAccount$2> continuation) {
        super(2, continuation);
        this.this$0 = sdo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMCoreManager$checkAndHandleSwitchAccount$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMCoreManager$checkAndHandleSwitchAccount$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strCopydefault = C44157sFk.copydefault(this.this$0.AuCTel);
            C44124sEe.imLogLogin$default("start check switch account, userId:" + this.this$0.gEmmrt() + ", currentUserId:" + strCopydefault, null, 2, null);
            if (this.this$0.gEmmrt() == null) {
                C44124sEe.imLogLogin$default("checkAndHandleSwitchAccount: start user login", null, 2, null);
                this.this$0.AEQbTJ(strCopydefault);
            } else if (!Intrinsics.EZpvd((Object) this.this$0.gEmmrt(), (Object) strCopydefault)) {
                C44124sEe.imLogLogin$default("Handle switch account", null, 2, null);
                RxBus.KWHzl("event_im_gray_scale_change");
                pUU.EZpvd("OKIMCoreManager", "Before user logout");
                this.this$0.AYXKKw();
                this.this$0.AEQbTJ(strCopydefault);
            } else {
                C44124sEe.imLogLogin$default("No action needed, userId is the same as currentUserId", null, 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
