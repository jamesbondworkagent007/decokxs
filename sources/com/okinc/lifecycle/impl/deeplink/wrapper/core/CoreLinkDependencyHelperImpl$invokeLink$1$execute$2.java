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
import o.pMZ;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreLinkDependencyHelperImpl$invokeLink$1$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $link;
    int label;
    final /* synthetic */ pMZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreLinkDependencyHelperImpl$invokeLink$1$execute$2(pMZ pmz, String str, Continuation<? super CoreLinkDependencyHelperImpl$invokeLink$1$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = pmz;
        this.$link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreLinkDependencyHelperImpl$invokeLink$1$execute$2(this.this$0, this.$link, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CoreLinkDependencyHelperImpl$invokeLink$1$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Context contextCopydefault = this.this$0.AEQbTJ.copydefault();
            if (contextCopydefault != null) {
                z = ((Boolean) this.this$0.valueOf.invoke(contextCopydefault, this.$link)).booleanValue();
            }
            return C56443yFo.KWHzl(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
