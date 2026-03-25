package o;

import aws.smithy.kotlin.runtime.http.operation.DeserializeHandler$call$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BE<Input, Output> implements CG<BP<C5036Cg>, Output> {
    public final yHO<DT, C58859zS, Continuation<? super Output>, java.lang.Object> EZpvd;
    public final CG<BP<C5036Cg>, C58859zS> KWHzl;
    public final C4706Bo<Input, Output> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super o.BP<o.Cg>, ? extends o.zS> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super o.DT, ? super o.zS, ? super kotlin.coroutines.Continuation<? super Output>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public BE(@NotNull CG<? super BP<C5036Cg>, ? extends C58859zS> cg, @NotNull yHO<? super DT, ? super C58859zS, ? super Continuation<? super Output>, ? extends java.lang.Object> yho, @NotNull C4706Bo<Input, Output> c4706Bo) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        this.KWHzl = cg;
        this.EZpvd = yho;
        this.OLrzqt = c4706Bo;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super Output> continuation) throws java.lang.Throwable {
        DeserializeHandler$call$1 deserializeHandler$call$1;
        BE<Input, Output> be;
        BP<C5036Cg> bp2;
        C58859zS c58859zS;
        C58859zS c58859zSCopy$default;
        BE<Input, Output> be2;
        if (continuation instanceof DeserializeHandler$call$1) {
            deserializeHandler$call$1 = (DeserializeHandler$call$1) continuation;
            int i = deserializeHandler$call$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deserializeHandler$call$1.label = i - Integer.MIN_VALUE;
            } else {
                deserializeHandler$call$1 = new DeserializeHandler$call$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = deserializeHandler$call$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deserializeHandler$call$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            CG<BP<C5036Cg>, C58859zS> cg = this.KWHzl;
            deserializeHandler$call$1.L$0 = this;
            deserializeHandler$call$1.L$1 = bp;
            deserializeHandler$call$1.label = 1;
            objOLrzqt = cg.OLrzqt(bp, deserializeHandler$call$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            be = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c58859zSCopy$default = (C58859zS) deserializeHandler$call$1.L$1;
                    be2 = (BE) deserializeHandler$call$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    be2.OLrzqt.OLrzqt((Output) objOLrzqt, c58859zSCopy$default);
                    return objOLrzqt;
                }
                c58859zS = (C58859zS) deserializeHandler$call$1.L$2;
                BP<C5036Cg> bp3 = (BP) deserializeHandler$call$1.L$1;
                BE<Input, Output> be3 = (BE) deserializeHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                bp2 = bp3;
                be = be3;
                c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, (InterfaceC5039Cj) objOLrzqt, 1, null);
                be.OLrzqt.EZpvd(c58859zSCopy$default);
                yHO<DT, C58859zS, Continuation<? super Output>, java.lang.Object> yho = be.EZpvd;
                DT dtOLrzqt = bp2.OLrzqt();
                deserializeHandler$call$1.L$0 = be;
                deserializeHandler$call$1.L$1 = c58859zSCopy$default;
                deserializeHandler$call$1.L$2 = null;
                deserializeHandler$call$1.label = 3;
                objOLrzqt = yho.invoke(dtOLrzqt, c58859zSCopy$default, deserializeHandler$call$1);
                if (objOLrzqt != objCopydefault) {
                    return objCopydefault;
                }
                be2 = be;
                be2.OLrzqt.OLrzqt((Output) objOLrzqt, c58859zSCopy$default);
                return objOLrzqt;
            }
            bp = (BP) deserializeHandler$call$1.L$1;
            be = (BE) deserializeHandler$call$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C58859zS c58859zS2 = (C58859zS) objOLrzqt;
        C4706Bo<Input, Output> c4706Bo = be.OLrzqt;
        deserializeHandler$call$1.L$0 = be;
        deserializeHandler$call$1.L$1 = bp;
        deserializeHandler$call$1.L$2 = c58859zS2;
        deserializeHandler$call$1.label = 2;
        java.lang.Object objKWHzl = c4706Bo.KWHzl(c58859zS2, deserializeHandler$call$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        bp2 = bp;
        c58859zS = c58859zS2;
        objOLrzqt = objKWHzl;
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, (InterfaceC5039Cj) objOLrzqt, 1, null);
        be.OLrzqt.EZpvd(c58859zSCopy$default);
        yHO<DT, C58859zS, Continuation<? super Output>, java.lang.Object> yho2 = be.EZpvd;
        DT dtOLrzqt2 = bp2.OLrzqt();
        deserializeHandler$call$1.L$0 = be;
        deserializeHandler$call$1.L$1 = c58859zSCopy$default;
        deserializeHandler$call$1.L$2 = null;
        deserializeHandler$call$1.label = 3;
        objOLrzqt = yho2.invoke(dtOLrzqt2, c58859zSCopy$default, deserializeHandler$call$1);
        if (objOLrzqt != objCopydefault) {
        }
    }
}
