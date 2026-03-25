package com.okinc.lifecycle.impl.deeplink.wrapper.core;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC38113pMs;
import o.pMZ;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreLinkDependencyHelperImpl$performAuth$1$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $shouldGoToSignup;
    int label;
    final /* synthetic */ pMZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreLinkDependencyHelperImpl$performAuth$1$execute$2(pMZ pmz, boolean z, Continuation<? super CoreLinkDependencyHelperImpl$performAuth$1$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = pmz;
        this.$shouldGoToSignup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreLinkDependencyHelperImpl$performAuth$1$execute$2(this.this$0, this.$shouldGoToSignup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CoreLinkDependencyHelperImpl$performAuth$1$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context contextCopydefault = this.this$0.AEQbTJ.copydefault();
            if (contextCopydefault != null) {
                pMZ pmz = this.this$0;
                boolean z = this.$shouldGoToSignup;
                InterfaceC38113pMs interfaceC38113pMs = pmz.EZpvd;
                this.label = 1;
                obj = interfaceC38113pMs.EZpvd(contextCopydefault, z, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        boolean z2 = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(z2);
    }
}
