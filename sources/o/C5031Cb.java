package o;

import aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$decorate$1;
import aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$decorate$2;
import aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$decorate$3;
import aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$httpTraceMiddleware$1;
import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC54779xV;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5031Cb {
    public static final <Request, Response> CG<BP<Request>, Response> KWHzl(@NotNull C5032Cc<Request, Response> c5032Cc, @NotNull CG<? super BP<C5036Cg>, ? extends C58859zS> cg, @NotNull BY<Request, Response> by) {
        Intrinsics.checkNotNullParameter(c5032Cc, "");
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(by, "");
        C4706Bo c4706Bo = new C4706Bo(by.KWHzl(), by.EZpvd(), by.AhwBna());
        Phase.register$default(c5032Cc.djBIcL(), new BA(), (Phase.Order) null, 2, (java.lang.Object) null);
        Phase.register$default(c5032Cc.djBIcL(), new BJ(c4706Bo), (Phase.Order) null, 2, (java.lang.Object) null);
        c5032Cc.djBIcL().OLrzqt(Phase.Order.After, SdkOperationExecutionKt$decorate$1.INSTANCE);
        return new BS(C5077Dv.OLrzqt(new BG(copydefault(by.AEQbTJ(), C5077Dv.OLrzqt(new BN(C5077Dv.OLrzqt(C5077Dv.OLrzqt(new C4895Bv(copydefault(by.OLrzqt(), (CG<? super BP<C5036Cg>, ? extends C58859zS>) C5077Dv.OLrzqt(cg, c5032Cc.djBIcL()), c4706Bo), c4706Bo, c5032Cc.EZpvd(), c5032Cc.AEQbTJ()), c5032Cc.KWHzl()), new C5003Bz(c5032Cc.valueOf(), c5032Cc.gEmmrt(), c4706Bo))), c5032Cc.copydefault()), c4706Bo)), c5032Cc.OLrzqt()), c4706Bo);
    }

    public static final <I, O> CG<BP<I>, O> copydefault(BH<I> bh, CG<? super BP<C5036Cg>, ? extends O> cg, C4706Bo<I, O> c4706Bo) {
        return new BZ(cg, new SdkOperationExecutionKt$decorate$2(bh), c4706Bo);
    }

    public static final <I, O> CG<BP<C5036Cg>, O> copydefault(BB<O> bb, CG<? super BP<C5036Cg>, ? extends C58859zS> cg, C4706Bo<I, O> c4706Bo) {
        return new BE(cg, new SdkOperationExecutionKt$decorate$3(bb), c4706Bo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, o.zS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(BP<C5036Cg> bp, CG<? super BP<C5036Cg>, ? extends C58859zS> cg, Continuation<? super C58859zS> continuation) throws java.lang.Throwable {
        SdkOperationExecutionKt$httpTraceMiddleware$1 sdkOperationExecutionKt$httpTraceMiddleware$1;
        AbstractC54779xV abstractC54779xVAEQbTJ;
        InterfaceC5148Go interfaceC5148GoOLrzqt;
        java.lang.Object obj;
        BP<C5036Cg> bp2;
        InterfaceC5148Go interfaceC5148Go;
        java.lang.Object objOLrzqt;
        AbstractC54779xV abstractC54779xV;
        final Ref.ObjectRef objectRef;
        T t;
        Ref.ObjectRef objectRef2;
        java.lang.Object objCopydefault;
        Ref.ObjectRef objectRef3;
        InterfaceC5148Go interfaceC5148Go2;
        java.lang.Object obj2;
        if (continuation instanceof SdkOperationExecutionKt$httpTraceMiddleware$1) {
            sdkOperationExecutionKt$httpTraceMiddleware$1 = (SdkOperationExecutionKt$httpTraceMiddleware$1) continuation;
            int i = sdkOperationExecutionKt$httpTraceMiddleware$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdkOperationExecutionKt$httpTraceMiddleware$1.label = i - Integer.MIN_VALUE;
            } else {
                sdkOperationExecutionKt$httpTraceMiddleware$1 = new SdkOperationExecutionKt$httpTraceMiddleware$1(continuation);
            }
        }
        java.lang.Object obj3 = sdkOperationExecutionKt$httpTraceMiddleware$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = sdkOperationExecutionKt$httpTraceMiddleware$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj3);
            abstractC54779xVAEQbTJ = C57419yi.AEQbTJ(bp.OLrzqt());
            interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(sdkOperationExecutionKt$httpTraceMiddleware$1.getContext(), "httpTraceMiddleware");
            if (abstractC54779xVAEQbTJ.KWHzl(AbstractC54779xV.Activity.KWHzl) || abstractC54779xVAEQbTJ.KWHzl(AbstractC54779xV.ActionBar.copydefault)) {
                C5036Cg c5036CgEZpvd = bp.EZpvd();
                boolean zKWHzl = abstractC54779xVAEQbTJ.KWHzl(AbstractC54779xV.ActionBar.copydefault);
                sdkOperationExecutionKt$httpTraceMiddleware$1.L$0 = bp;
                sdkOperationExecutionKt$httpTraceMiddleware$1.L$1 = cg;
                sdkOperationExecutionKt$httpTraceMiddleware$1.L$2 = abstractC54779xVAEQbTJ;
                sdkOperationExecutionKt$httpTraceMiddleware$1.L$3 = interfaceC5148GoOLrzqt;
                sdkOperationExecutionKt$httpTraceMiddleware$1.label = 1;
                java.lang.Object objCopydefault3 = C5034Ce.copydefault(c5036CgEZpvd, zKWHzl, sdkOperationExecutionKt$httpTraceMiddleware$1);
                if (objCopydefault3 == objCopydefault2) {
                    return objCopydefault2;
                }
                obj = objCopydefault3;
                bp2 = bp;
                interfaceC5148Go = interfaceC5148GoOLrzqt;
            }
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$0 = abstractC54779xVAEQbTJ;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$1 = interfaceC5148GoOLrzqt;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$2 = objectRef4;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$3 = objectRef4;
            sdkOperationExecutionKt$httpTraceMiddleware$1.label = 2;
            objOLrzqt = cg.OLrzqt(bp, sdkOperationExecutionKt$httpTraceMiddleware$1);
            if (objOLrzqt != objCopydefault2) {
                return objCopydefault2;
            }
            abstractC54779xV = abstractC54779xVAEQbTJ;
            objectRef = objectRef4;
            t = objOLrzqt;
            objectRef2 = objectRef;
            objectRef2.element = t;
            if (!abstractC54779xV.KWHzl(AbstractC54779xV.Fragment.copydefault)) {
            }
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = ((C58859zS) objectRef.element).AEQbTJ();
            boolean zKWHzl2 = abstractC54779xV.KWHzl(AbstractC54779xV.FragmentManager.EZpvd);
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$0 = interfaceC5148GoOLrzqt;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$1 = objectRef;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$2 = null;
            sdkOperationExecutionKt$httpTraceMiddleware$1.L$3 = null;
            sdkOperationExecutionKt$httpTraceMiddleware$1.label = 3;
            objCopydefault = C5040Ck.copydefault(interfaceC5039CjAEQbTJ, zKWHzl2, sdkOperationExecutionKt$httpTraceMiddleware$1);
            if (objCopydefault != objCopydefault2) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) sdkOperationExecutionKt$httpTraceMiddleware$1.L$1;
                    interfaceC5148Go2 = (InterfaceC5148Go) sdkOperationExecutionKt$httpTraceMiddleware$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    obj2 = obj3;
                    kotlin.Pair pair = (kotlin.Pair) obj2;
                    InterfaceC5039Cj interfaceC5039Cj = (InterfaceC5039Cj) pair.component1();
                    final java.lang.String str = (java.lang.String) pair.component2();
                    objectRef3.element = C58859zS.copy$default((C58859zS) objectRef3.element, null, interfaceC5039Cj, 1, null);
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$httpTraceMiddleware$3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "HttpResponse:\n" + str;
                        }
                    }, 1, null);
                    objectRef = objectRef3;
                    return objectRef.element;
                }
                objectRef2 = (Ref.ObjectRef) sdkOperationExecutionKt$httpTraceMiddleware$1.L$3;
                objectRef = (Ref.ObjectRef) sdkOperationExecutionKt$httpTraceMiddleware$1.L$2;
                interfaceC5148GoOLrzqt = (InterfaceC5148Go) sdkOperationExecutionKt$httpTraceMiddleware$1.L$1;
                abstractC54779xV = (AbstractC54779xV) sdkOperationExecutionKt$httpTraceMiddleware$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                t = obj3;
                objectRef2.element = t;
                if (!abstractC54779xV.KWHzl(AbstractC54779xV.Fragment.copydefault) || abstractC54779xV.KWHzl(AbstractC54779xV.FragmentManager.EZpvd)) {
                    InterfaceC5039Cj interfaceC5039CjAEQbTJ2 = ((C58859zS) objectRef.element).AEQbTJ();
                    boolean zKWHzl22 = abstractC54779xV.KWHzl(AbstractC54779xV.FragmentManager.EZpvd);
                    sdkOperationExecutionKt$httpTraceMiddleware$1.L$0 = interfaceC5148GoOLrzqt;
                    sdkOperationExecutionKt$httpTraceMiddleware$1.L$1 = objectRef;
                    sdkOperationExecutionKt$httpTraceMiddleware$1.L$2 = null;
                    sdkOperationExecutionKt$httpTraceMiddleware$1.L$3 = null;
                    sdkOperationExecutionKt$httpTraceMiddleware$1.label = 3;
                    objCopydefault = C5040Ck.copydefault(interfaceC5039CjAEQbTJ2, zKWHzl22, sdkOperationExecutionKt$httpTraceMiddleware$1);
                    if (objCopydefault != objCopydefault2) {
                        return objCopydefault2;
                    }
                    objectRef3 = objectRef;
                    interfaceC5148Go2 = interfaceC5148GoOLrzqt;
                    obj2 = objCopydefault;
                    kotlin.Pair pair2 = (kotlin.Pair) obj2;
                    InterfaceC5039Cj interfaceC5039Cj2 = (InterfaceC5039Cj) pair2.component1();
                    final java.lang.String str2 = (java.lang.String) pair2.component2();
                    objectRef3.element = C58859zS.copy$default((C58859zS) objectRef3.element, null, interfaceC5039Cj2, 1, null);
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$httpTraceMiddleware$3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "HttpResponse:\n" + str2;
                        }
                    }, 1, null);
                    objectRef = objectRef3;
                    return objectRef.element;
                }
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$httpTraceMiddleware$4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "HttpResponse: " + objectRef.element.AEQbTJ().OLrzqt();
                    }
                }, 1, null);
                return objectRef.element;
            }
            interfaceC5148Go = (InterfaceC5148Go) sdkOperationExecutionKt$httpTraceMiddleware$1.L$3;
            AbstractC54779xV abstractC54779xV2 = (AbstractC54779xV) sdkOperationExecutionKt$httpTraceMiddleware$1.L$2;
            CG<? super BP<C5036Cg>, ? extends C58859zS> cg2 = (CG) sdkOperationExecutionKt$httpTraceMiddleware$1.L$1;
            bp2 = (BP) sdkOperationExecutionKt$httpTraceMiddleware$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            obj = obj3;
            abstractC54779xVAEQbTJ = abstractC54779xV2;
            cg = cg2;
        }
        final java.lang.String str3 = (java.lang.String) obj;
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.SdkOperationExecutionKt$httpTraceMiddleware$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "HttpRequest:\n" + str3;
            }
        }, 1, null);
        interfaceC5148GoOLrzqt = interfaceC5148Go;
        bp = bp2;
        Ref.ObjectRef objectRef42 = new Ref.ObjectRef();
        sdkOperationExecutionKt$httpTraceMiddleware$1.L$0 = abstractC54779xVAEQbTJ;
        sdkOperationExecutionKt$httpTraceMiddleware$1.L$1 = interfaceC5148GoOLrzqt;
        sdkOperationExecutionKt$httpTraceMiddleware$1.L$2 = objectRef42;
        sdkOperationExecutionKt$httpTraceMiddleware$1.L$3 = objectRef42;
        sdkOperationExecutionKt$httpTraceMiddleware$1.label = 2;
        objOLrzqt = cg.OLrzqt(bp, sdkOperationExecutionKt$httpTraceMiddleware$1);
        if (objOLrzqt != objCopydefault2) {
        }
    }
}
