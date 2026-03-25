package com.okinc.business.defi.wallet.home.tab;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18166fdK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9777bbw;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackerTabPageDefi$enabledEnter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ C18166fdK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerTabPageDefi$enabledEnter$1(C18166fdK c18166fdK, Context context, Continuation<? super TrackerTabPageDefi$enabledEnter$1> continuation) {
        super(2, continuation);
        this.this$0 = c18166fdK;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerTabPageDefi$enabledEnter$1(this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((TrackerTabPageDefi$enabledEnter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9777bbw interfaceC9777bbwAEQbTJ = this.this$0.AEQbTJ();
            if (interfaceC9777bbwAEQbTJ == null) {
                zBooleanValue = false;
                return C56443yFo.KWHzl(!zBooleanValue);
            }
            Context context = this.$context;
            this.label = 1;
            obj = interfaceC9777bbwAEQbTJ.EZpvd(context, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(!zBooleanValue);
    }
}
