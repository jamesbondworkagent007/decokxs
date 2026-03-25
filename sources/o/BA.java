package o;

import aws.smithy.kotlin.runtime.http.operation.HttpCallMiddleware$handle$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BA implements InterfaceC5075Dt<BP<C5036Cg>, C58859zS> {
    public final java.util.List<C58859zS> copydefault = new java.util.ArrayList();

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lo/CG;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5075Dt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super BP<C5036Cg>, ? extends C58859zS>> java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull H h, @NotNull Continuation<? super C58859zS> continuation) throws java.lang.Throwable {
        HttpCallMiddleware$handle$1 httpCallMiddleware$handle$1;
        CG cg;
        BA ba;
        if (continuation instanceof HttpCallMiddleware$handle$1) {
            httpCallMiddleware$handle$1 = (HttpCallMiddleware$handle$1) continuation;
            int i = httpCallMiddleware$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCallMiddleware$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCallMiddleware$handle$1 = new HttpCallMiddleware$handle$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = httpCallMiddleware$handle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = httpCallMiddleware$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!this.copydefault.isEmpty()) {
                C58859zS c58859zS = (C58859zS) CollectionsKt___CollectionsKt.AubY(this.copydefault);
                httpCallMiddleware$handle$1.L$0 = this;
                httpCallMiddleware$handle$1.L$1 = bp;
                httpCallMiddleware$handle$1.L$2 = h;
                httpCallMiddleware$handle$1.label = 1;
                if (C58805zQ.EZpvd(c58859zS, httpCallMiddleware$handle$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            cg = h;
            ba = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bp = (BP) httpCallMiddleware$handle$1.L$1;
                ba = (BA) httpCallMiddleware$handle$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                C58859zS c58859zS2 = (C58859zS) objOLrzqt;
                ba.copydefault.add(c58859zS2);
                bp.OLrzqt().OLrzqt(BC.copydefault.copydefault(), ba.copydefault);
                return c58859zS2;
            }
            CG cg2 = (CG) httpCallMiddleware$handle$1.L$2;
            bp = (BP) httpCallMiddleware$handle$1.L$1;
            BA ba2 = (BA) httpCallMiddleware$handle$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            cg = cg2;
            ba = ba2;
        }
        httpCallMiddleware$handle$1.L$0 = ba;
        httpCallMiddleware$handle$1.L$1 = bp;
        httpCallMiddleware$handle$1.L$2 = null;
        httpCallMiddleware$handle$1.label = 2;
        objOLrzqt = cg.OLrzqt(bp, httpCallMiddleware$handle$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        C58859zS c58859zS22 = (C58859zS) objOLrzqt;
        ba.copydefault.add(c58859zS22);
        bp.OLrzqt().OLrzqt(BC.copydefault.copydefault(), ba.copydefault);
        return c58859zS22;
    }
}
