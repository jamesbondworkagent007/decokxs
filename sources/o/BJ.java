package o;

import aws.smithy.kotlin.runtime.http.operation.InterceptorTransmitMiddleware$handle$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BJ<I, O> implements InterfaceC5075Dt<BP<C5036Cg>, C58859zS> {
    public final C4706Bo<I, O> KWHzl;

    public BJ(@NotNull C4706Bo<I, O> c4706Bo) {
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        this.KWHzl = c4706Bo;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lo/CG;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5075Dt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super BP<C5036Cg>, ? extends C58859zS>> java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull H h, @NotNull Continuation<? super C58859zS> continuation) throws java.lang.Throwable {
        InterceptorTransmitMiddleware$handle$1 interceptorTransmitMiddleware$handle$1;
        BJ<I, O> bj;
        BJ<I, O> bj2;
        if (continuation instanceof InterceptorTransmitMiddleware$handle$1) {
            interceptorTransmitMiddleware$handle$1 = (InterceptorTransmitMiddleware$handle$1) continuation;
            int i = interceptorTransmitMiddleware$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorTransmitMiddleware$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorTransmitMiddleware$handle$1 = new InterceptorTransmitMiddleware$handle$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = interceptorTransmitMiddleware$handle$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = interceptorTransmitMiddleware$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C4706Bo<I, O> c4706Bo = this.KWHzl;
            InterfaceC5037Ch interfaceC5037ChOLrzqt = C5034Ce.OLrzqt(bp.EZpvd(), true);
            interceptorTransmitMiddleware$handle$1.L$0 = this;
            interceptorTransmitMiddleware$handle$1.L$1 = bp;
            interceptorTransmitMiddleware$handle$1.L$2 = h;
            interceptorTransmitMiddleware$handle$1.label = 1;
            objCopydefault = c4706Bo.copydefault(interfaceC5037ChOLrzqt, (Continuation<? super InterfaceC5037Ch>) interceptorTransmitMiddleware$handle$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            bj = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bj2 = (BJ) interceptorTransmitMiddleware$handle$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                C58859zS c58859zS = (C58859zS) objCopydefault;
                bj2.KWHzl.KWHzl(c58859zS);
                return c58859zS;
            }
            h = (H) interceptorTransmitMiddleware$handle$1.L$2;
            bp = (BP) interceptorTransmitMiddleware$handle$1.L$1;
            bj = (BJ) interceptorTransmitMiddleware$handle$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        BP bpCopy$default = BP.copy$default(bp, null, C5043Cn.EZpvd((InterfaceC5037Ch) objCopydefault), 1, null);
        bj.KWHzl.AEQbTJ(C5034Ce.immutableView$default((C5036Cg) bpCopy$default.EZpvd(), false, 1, null));
        interceptorTransmitMiddleware$handle$1.L$0 = bj;
        interceptorTransmitMiddleware$handle$1.L$1 = null;
        interceptorTransmitMiddleware$handle$1.L$2 = null;
        interceptorTransmitMiddleware$handle$1.label = 2;
        objCopydefault = h.OLrzqt(bpCopy$default, interceptorTransmitMiddleware$handle$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bj2 = bj;
        C58859zS c58859zS2 = (C58859zS) objCopydefault;
        bj2.KWHzl.KWHzl(c58859zS2);
        return c58859zS2;
    }
}
