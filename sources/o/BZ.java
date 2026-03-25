package o;

import aws.smithy.kotlin.runtime.http.operation.SerializeHandler$call$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BZ<Input, Output> implements CG<BP<Input>, Output> {
    public final CG<BP<C5036Cg>, Output> AEQbTJ;
    public final C4706Bo<Input, Output> KWHzl;
    public final yHO<DT, Input, Continuation<? super C5036Cg>, java.lang.Object> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super o.BP<o.Cg>, ? extends Output> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super o.DT, ? super Input, ? super kotlin.coroutines.Continuation<? super o.Cg>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public BZ(@NotNull CG<? super BP<C5036Cg>, ? extends Output> cg, @NotNull yHO<? super DT, ? super Input, ? super Continuation<? super C5036Cg>, ? extends java.lang.Object> yho, @NotNull C4706Bo<Input, Output> c4706Bo) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        this.AEQbTJ = cg;
        this.OLrzqt = yho;
        this.KWHzl = c4706Bo;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[PHI: r13
  0x00c9: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v1 java.lang.Object) binds: [B:27:0x00c6, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CG
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull BP<Input> bp, @NotNull Continuation<? super Output> continuation) throws java.lang.Throwable {
        SerializeHandler$call$1 serializeHandler$call$1;
        BZ<Input, Output> bz;
        BP bp2;
        if (continuation instanceof SerializeHandler$call$1) {
            serializeHandler$call$1 = (SerializeHandler$call$1) continuation;
            int i = serializeHandler$call$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serializeHandler$call$1.label = i - Integer.MIN_VALUE;
            } else {
                serializeHandler$call$1 = new SerializeHandler$call$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = serializeHandler$call$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = serializeHandler$call$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C4706Bo<Input, Output> c4706Bo = this.KWHzl;
            Input inputEZpvd = bp.EZpvd();
            serializeHandler$call$1.L$0 = this;
            serializeHandler$call$1.L$1 = bp;
            serializeHandler$call$1.label = 1;
            objEZpvd = c4706Bo.EZpvd(inputEZpvd, serializeHandler$call$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            bz = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objEZpvd);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bp2 = (BP) serializeHandler$call$1.L$1;
                bz = (BZ) serializeHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                C5036Cg c5036Cg = (C5036Cg) objEZpvd;
                bz.KWHzl.EZpvd(C5034Ce.immutableView$default(c5036Cg, false, 1, null));
                CG<BP<C5036Cg>, Output> cg = bz.AEQbTJ;
                BP<C5036Cg> bp3 = new BP<>(bp2.OLrzqt(), c5036Cg);
                serializeHandler$call$1.L$0 = null;
                serializeHandler$call$1.L$1 = null;
                serializeHandler$call$1.label = 3;
                objEZpvd = cg.OLrzqt(bp3, serializeHandler$call$1);
                return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
            }
            bp = (BP) serializeHandler$call$1.L$1;
            bz = (BZ) serializeHandler$call$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        BP bpCopy$default = BP.copy$default(bp, null, objEZpvd, 1, null);
        bz.KWHzl.OLrzqt((Input) bpCopy$default.EZpvd());
        DT dtOLrzqt = bp.OLrzqt();
        C57737yo<java.lang.Object> c57737yoGEmmrt = BC.copydefault.gEmmrt();
        java.lang.Object objEZpvd2 = bpCopy$default.EZpvd();
        Intrinsics.copydefault(objEZpvd2, "");
        dtOLrzqt.OLrzqt(c57737yoGEmmrt, objEZpvd2);
        yHO<DT, Input, Continuation<? super C5036Cg>, java.lang.Object> yho = bz.OLrzqt;
        DT dtOLrzqt2 = bpCopy$default.OLrzqt();
        java.lang.Object objEZpvd3 = bpCopy$default.EZpvd();
        serializeHandler$call$1.L$0 = bz;
        serializeHandler$call$1.L$1 = bpCopy$default;
        serializeHandler$call$1.label = 2;
        java.lang.Object objInvoke = yho.invoke(dtOLrzqt2, (Input) objEZpvd3, serializeHandler$call$1);
        if (objInvoke == objCopydefault) {
            return objCopydefault;
        }
        objEZpvd = objInvoke;
        bp2 = bpCopy$default;
        C5036Cg c5036Cg2 = (C5036Cg) objEZpvd;
        bz.KWHzl.EZpvd(C5034Ce.immutableView$default(c5036Cg2, false, 1, null));
        CG<BP<C5036Cg>, Output> cg2 = bz.AEQbTJ;
        BP<C5036Cg> bp32 = new BP<>(bp2.OLrzqt(), c5036Cg2);
        serializeHandler$call$1.L$0 = null;
        serializeHandler$call$1.L$1 = null;
        serializeHandler$call$1.label = 3;
        objEZpvd = cg2.OLrzqt(bp32, serializeHandler$call$1);
        if (objEZpvd != objCopydefault) {
        }
    }
}
