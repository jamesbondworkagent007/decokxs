package com.okinc.okpush.sdk.init;

import android.content.Context;
import com.okinc.okpush.sdk.init.PushInitManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46921tgL;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PushInitManager$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushInitManager$init$1(Context context, Continuation<? super PushInitManager$init$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushInitManager$init$1(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushInitManager$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PushInitManager pushInitManager = PushInitManager.OLrzqt;
            Context context = this.$context;
            this.label = 1;
            obj = pushInitManager.OLrzqt(context, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                PushInitManager pushInitManager2 = PushInitManager.OLrzqt;
                pushInitManager2.valueOf(this.$context);
                pUU.KWHzl("PushInitManager", "initOneSignal cost time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                pushInitManager2.AhwBna(this.$context);
            } catch (Throwable th) {
                pUU.valueOf("PushInitManager", "initOneSignal failed, fallback to JPush: " + th);
                PushInitManager pushInitManager3 = PushInitManager.OLrzqt;
                pushInitManager3.KWHzl(PushInitManager.FallbackReason.ONE_SIGNAL_INIT_EXCEPTION, th.toString());
                pushInitManager3.KWHzl(this.$context);
            }
        } else {
            PushInitManager pushInitManager4 = PushInitManager.OLrzqt;
            pushInitManager4.KWHzl(PushInitManager.FallbackReason.DECIDE_BY_CONFIGURATION, "Decided by configuration");
            pushInitManager4.KWHzl(this.$context);
        }
        PushInitManager pushInitManager5 = PushInitManager.OLrzqt;
        InterfaceC46921tgL interfaceC46921tgLValueOf = pushInitManager5.valueOf();
        if (interfaceC46921tgLValueOf != null) {
            interfaceC46921tgLValueOf.AEQbTJ();
        }
        pushInitManager5.EZpvd();
        pushInitManager5.ejfBZ();
        return Unit.INSTANCE;
    }
}
