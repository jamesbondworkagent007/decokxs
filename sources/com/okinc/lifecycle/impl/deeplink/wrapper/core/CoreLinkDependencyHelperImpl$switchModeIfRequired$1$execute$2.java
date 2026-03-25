package com.okinc.lifecycle.impl.deeplink.wrapper.core;

import android.content.Context;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pMA;
import o.pMZ;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $deeplinkMode;
    final /* synthetic */ String $linkPath;
    int label;
    final /* synthetic */ pMZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2(pMZ pmz, String str, String str2, Continuation<? super CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = pmz;
        this.$deeplinkMode = str;
        this.$linkPath = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2(this.this$0, this.$deeplinkMode, this.$linkPath, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DeeplinkMode deeplinkModeKWHzl = this.this$0.KWHzl(this.$deeplinkMode);
            if (deeplinkModeKWHzl == null) {
                return C56443yFo.KWHzl(false);
            }
            Context contextCopydefault = this.this$0.AEQbTJ.copydefault();
            if (contextCopydefault != null) {
                pMZ pmz = this.this$0;
                String str = this.$linkPath;
                pMA pma = pmz.djBIcL;
                this.label = 1;
                obj = pma.EZpvd(contextCopydefault, deeplinkModeKWHzl, str, this);
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
        boolean z = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(z);
    }
}
