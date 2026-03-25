package com.okinc.lifecycle.impl.serviceImpl.core;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C2712AWi;
import o.C33077mpe;
import o.C38167pOs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes9.dex */
public final class CoreLifecycleLinkServiceImpl$processExternalLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $link;
    int label;
    final /* synthetic */ C38167pOs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreLifecycleLinkServiceImpl$processExternalLink$1(C38167pOs c38167pOs, String str, Continuation<? super CoreLifecycleLinkServiceImpl$processExternalLink$1> continuation) {
        super(2, continuation);
        this.this$0 = c38167pOs;
        this.$link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreLifecycleLinkServiceImpl$processExternalLink$1(this.this$0, this.$link, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CoreLifecycleLinkServiceImpl$processExternalLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C2712AWi c2712AWiOLrzqt = this.this$0.KWHzl.OLrzqt(this.$link);
            C33077mpe c33077mpe = new C33077mpe(new CoreLifecycleLinkServiceImpl$processExternalLink$1$wrapper$1(c2712AWiOLrzqt), new CoreLifecycleLinkServiceImpl$processExternalLink$1$wrapper$2(c2712AWiOLrzqt), new CoreLifecycleLinkServiceImpl$processExternalLink$1$wrapper$3(c2712AWiOLrzqt), new CoreLifecycleLinkServiceImpl$processExternalLink$1$wrapper$4(c2712AWiOLrzqt), null, 16, null);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        return C56443yFo.KWHzl(Intrinsics.EZpvd(objAEQbTJ, C56443yFo.KWHzl(true)));
    }
}
