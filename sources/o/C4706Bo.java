package o;

import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeAttemptCompletion$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeCompletion$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeDeserialization$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeRetryLoop$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeSerialization$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeSigning$1;
import aws.smithy.kotlin.runtime.http.interceptors.InterceptorExecutor$modifyBeforeTransmit$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4706Bo<I, O> {
    public I AEQbTJ;
    public final DT EZpvd;
    public InterfaceC5037Ch KWHzl;
    public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> OLrzqt;
    public InterfaceC5039Cj copydefault;
    public final BW gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.xT<java.lang.Object, java.lang.Object, o.Ch, o.Cj>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4706Bo(@NotNull DT dt, @NotNull java.util.List<? extends InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> list, @NotNull BW bw) {
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bw, "");
        this.EZpvd = dt;
        this.OLrzqt = list;
        this.gEmmrt = bw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T OLrzqt(java.lang.String str, InterfaceC56551yJo<?> interfaceC56551yJo, java.lang.Object obj) {
        if (interfaceC56551yJo.copydefault(obj)) {
            return obj;
        }
        throw new java.lang.IllegalStateException((str + " invalid type conversion: found " + C56524yIo.AEQbTJ(obj.getClass()) + "; expected " + interfaceC56551yJo).toString());
    }

    public final <T> java.lang.Object OLrzqt(java.lang.String str, java.lang.Object obj, InterfaceC56551yJo<?> interfaceC56551yJo) {
        if (!Result.m7384isSuccessimpl(obj)) {
            return Result.m7377constructorimpl(obj);
        }
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(OLrzqt(str, interfaceC56551yJo, obj));
    }

    public final java.lang.Object AEQbTJ(I i) {
        java.lang.Object objM7377constructorimpl;
        this.AEQbTJ = i;
        Intrinsics.copydefault(i, "");
        C4544Bi c4544Bi = new C4544Bi(i, this.EZpvd);
        java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> list = this.OLrzqt;
        Result.Application application = Result.Companion;
        java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            try {
                Result.Application application2 = Result.Companion;
                interfaceC54725xT.readBeforeExecution(c4544Bi);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            } else {
                java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C56379yDe.EZpvd(thM7380exceptionOrNullimpl, thM7380exceptionOrNullimpl2);
                }
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            }
        }
        return objM7377constructorimpl2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: o.Bi */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: o.Bi */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: o.Bi */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:20:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(I i, @NotNull Continuation<? super I> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeSerialization$1 interceptorExecutor$modifyBeforeSerialization$1;
        C4706Bo<I, O> c4706Bo;
        java.util.Iterator it;
        C4544Bi c4544Bi;
        java.lang.Object obj;
        if (continuation instanceof InterceptorExecutor$modifyBeforeSerialization$1) {
            interceptorExecutor$modifyBeforeSerialization$1 = (InterceptorExecutor$modifyBeforeSerialization$1) continuation;
            int i2 = interceptorExecutor$modifyBeforeSerialization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeSerialization$1.label = i2 - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeSerialization$1 = new InterceptorExecutor$modifyBeforeSerialization$1(this, continuation);
            }
        }
        java.lang.Object objModifyBeforeSerialization = interceptorExecutor$modifyBeforeSerialization$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = interceptorExecutor$modifyBeforeSerialization$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objModifyBeforeSerialization);
            Intrinsics.copydefault(i, "");
            C4544Bi c4544Bi2 = new C4544Bi(i, this.EZpvd);
            c4706Bo = this;
            it = this.OLrzqt.iterator();
            c4544Bi = c4544Bi2;
            obj = c4544Bi;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4544Bi = (C4544Bi) interceptorExecutor$modifyBeforeSerialization$1.L$3;
            it = (java.util.Iterator) interceptorExecutor$modifyBeforeSerialization$1.L$2;
            C4544Bi c4544Bi3 = (C4544Bi) interceptorExecutor$modifyBeforeSerialization$1.L$1;
            c4706Bo = (C4706Bo) interceptorExecutor$modifyBeforeSerialization$1.L$0;
            C56391yDq.AEQbTJ(objModifyBeforeSerialization);
            C4544Bi c4544Bi4 = c4544Bi3;
            c4706Bo.OLrzqt("modifyBeforeSerialization", c4706Bo.gEmmrt.EZpvd(), objModifyBeforeSerialization);
            c4544Bi4.AEQbTJ(objModifyBeforeSerialization);
            obj = c4544Bi4;
            if (it.hasNext()) {
                InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
                interceptorExecutor$modifyBeforeSerialization$1.L$0 = c4706Bo;
                interceptorExecutor$modifyBeforeSerialization$1.L$1 = obj;
                interceptorExecutor$modifyBeforeSerialization$1.L$2 = it;
                interceptorExecutor$modifyBeforeSerialization$1.L$3 = c4544Bi;
                interceptorExecutor$modifyBeforeSerialization$1.label = 1;
                objModifyBeforeSerialization = interfaceC54725xT.modifyBeforeSerialization(c4544Bi, interceptorExecutor$modifyBeforeSerialization$1);
                c4544Bi4 = obj;
                if (objModifyBeforeSerialization == objCopydefault) {
                    return objCopydefault;
                }
                c4706Bo.OLrzqt("modifyBeforeSerialization", c4706Bo.gEmmrt.EZpvd(), objModifyBeforeSerialization);
                c4544Bi4.AEQbTJ(objModifyBeforeSerialization);
                obj = c4544Bi4;
                if (it.hasNext()) {
                    return c4544Bi.OLrzqt();
                }
            }
        }
    }

    public final void OLrzqt(I i) {
        this.AEQbTJ = i;
        Intrinsics.copydefault(i, "");
        C4544Bi c4544Bi = new C4544Bi(i, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readBeforeSerialization(c4544Bi);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:26:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeRetryLoop$1 interceptorExecutor$modifyBeforeRetryLoop$1;
        java.lang.Object objM7377constructorimpl;
        C4652Bm c4652Bm;
        java.util.Iterator it;
        C4652Bm c4652Bm2;
        if (continuation instanceof InterceptorExecutor$modifyBeforeRetryLoop$1) {
            interceptorExecutor$modifyBeforeRetryLoop$1 = (InterceptorExecutor$modifyBeforeRetryLoop$1) continuation;
            int i = interceptorExecutor$modifyBeforeRetryLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeRetryLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeRetryLoop$1 = new InterceptorExecutor$modifyBeforeRetryLoop$1(this, continuation);
            }
        }
        java.lang.Object objModifyBeforeRetryLoop = interceptorExecutor$modifyBeforeRetryLoop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeRetryLoop$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objModifyBeforeRetryLoop);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            c4652Bm = new C4652Bm(i3, interfaceC5037Ch, this.EZpvd);
            Result.Application application2 = Result.Companion;
            it = this.OLrzqt.iterator();
            c4652Bm2 = c4652Bm;
            if (it.hasNext()) {
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4652Bm2 = (C4652Bm) interceptorExecutor$modifyBeforeRetryLoop$1.L$3;
        c4652Bm = (C4652Bm) interceptorExecutor$modifyBeforeRetryLoop$1.L$2;
        it = (java.util.Iterator) interceptorExecutor$modifyBeforeRetryLoop$1.L$1;
        C4652Bm c4652Bm3 = (C4652Bm) interceptorExecutor$modifyBeforeRetryLoop$1.L$0;
        C56391yDq.AEQbTJ(objModifyBeforeRetryLoop);
        c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeRetryLoop);
        c4652Bm2 = c4652Bm3;
        if (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            interceptorExecutor$modifyBeforeRetryLoop$1.L$0 = c4652Bm2;
            interceptorExecutor$modifyBeforeRetryLoop$1.L$1 = it;
            interceptorExecutor$modifyBeforeRetryLoop$1.L$2 = c4652Bm;
            interceptorExecutor$modifyBeforeRetryLoop$1.L$3 = c4652Bm2;
            interceptorExecutor$modifyBeforeRetryLoop$1.label = 1;
            objModifyBeforeRetryLoop = interfaceC54725xT.modifyBeforeRetryLoop(c4652Bm2, interceptorExecutor$modifyBeforeRetryLoop$1);
            if (objModifyBeforeRetryLoop == objCopydefault) {
                return objCopydefault;
            }
            c4652Bm3 = c4652Bm2;
            c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeRetryLoop);
            c4652Bm2 = c4652Bm3;
            if (it.hasNext()) {
                objM7377constructorimpl = Result.m7377constructorimpl(c4652Bm);
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
    }

    public final java.lang.Object copydefault(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.copydefault = null;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4652Bm c4652Bm = new C4652Bm(i, interfaceC5037Ch, this.EZpvd);
        java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> list = this.OLrzqt;
        Result.Application application = Result.Companion;
        java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            try {
                Result.Application application2 = Result.Companion;
                interfaceC54725xT.readBeforeAttempt(c4652Bm);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            } else {
                java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C56379yDe.EZpvd(thM7380exceptionOrNullimpl, thM7380exceptionOrNullimpl2);
                }
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            }
        }
        return objM7377constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:26:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeSigning$1 interceptorExecutor$modifyBeforeSigning$1;
        java.lang.Object objM7377constructorimpl;
        C4652Bm c4652Bm;
        java.util.Iterator it;
        C4652Bm c4652Bm2;
        if (continuation instanceof InterceptorExecutor$modifyBeforeSigning$1) {
            interceptorExecutor$modifyBeforeSigning$1 = (InterceptorExecutor$modifyBeforeSigning$1) continuation;
            int i = interceptorExecutor$modifyBeforeSigning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeSigning$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeSigning$1 = new InterceptorExecutor$modifyBeforeSigning$1(this, continuation);
            }
        }
        java.lang.Object objModifyBeforeSigning = interceptorExecutor$modifyBeforeSigning$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeSigning$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objModifyBeforeSigning);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            c4652Bm = new C4652Bm(i3, interfaceC5037Ch, this.EZpvd);
            Result.Application application2 = Result.Companion;
            it = this.OLrzqt.iterator();
            c4652Bm2 = c4652Bm;
            if (it.hasNext()) {
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4652Bm2 = (C4652Bm) interceptorExecutor$modifyBeforeSigning$1.L$3;
        c4652Bm = (C4652Bm) interceptorExecutor$modifyBeforeSigning$1.L$2;
        it = (java.util.Iterator) interceptorExecutor$modifyBeforeSigning$1.L$1;
        C4652Bm c4652Bm3 = (C4652Bm) interceptorExecutor$modifyBeforeSigning$1.L$0;
        C56391yDq.AEQbTJ(objModifyBeforeSigning);
        c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeSigning);
        c4652Bm2 = c4652Bm3;
        if (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            interceptorExecutor$modifyBeforeSigning$1.L$0 = c4652Bm2;
            interceptorExecutor$modifyBeforeSigning$1.L$1 = it;
            interceptorExecutor$modifyBeforeSigning$1.L$2 = c4652Bm;
            interceptorExecutor$modifyBeforeSigning$1.L$3 = c4652Bm2;
            interceptorExecutor$modifyBeforeSigning$1.label = 1;
            objModifyBeforeSigning = interfaceC54725xT.modifyBeforeSigning(c4652Bm2, interceptorExecutor$modifyBeforeSigning$1);
            if (objModifyBeforeSigning == objCopydefault) {
                return objCopydefault;
            }
            c4652Bm3 = c4652Bm2;
            c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeSigning);
            c4652Bm2 = c4652Bm3;
            if (it.hasNext()) {
                objM7377constructorimpl = Result.m7377constructorimpl(c4652Bm);
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:12:0x0035, B:26:0x007c, B:20:0x005e, B:22:0x0064, B:27:0x0083, B:19:0x0054), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:26:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeTransmit$1 interceptorExecutor$modifyBeforeTransmit$1;
        java.lang.Object objM7377constructorimpl;
        C4652Bm c4652Bm;
        java.util.Iterator it;
        C4652Bm c4652Bm2;
        if (continuation instanceof InterceptorExecutor$modifyBeforeTransmit$1) {
            interceptorExecutor$modifyBeforeTransmit$1 = (InterceptorExecutor$modifyBeforeTransmit$1) continuation;
            int i = interceptorExecutor$modifyBeforeTransmit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeTransmit$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeTransmit$1 = new InterceptorExecutor$modifyBeforeTransmit$1(this, continuation);
            }
        }
        java.lang.Object objModifyBeforeTransmit = interceptorExecutor$modifyBeforeTransmit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeTransmit$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objModifyBeforeTransmit);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            c4652Bm = new C4652Bm(i3, interfaceC5037Ch, this.EZpvd);
            Result.Application application2 = Result.Companion;
            it = this.OLrzqt.iterator();
            c4652Bm2 = c4652Bm;
            if (it.hasNext()) {
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4652Bm2 = (C4652Bm) interceptorExecutor$modifyBeforeTransmit$1.L$3;
        c4652Bm = (C4652Bm) interceptorExecutor$modifyBeforeTransmit$1.L$2;
        it = (java.util.Iterator) interceptorExecutor$modifyBeforeTransmit$1.L$1;
        C4652Bm c4652Bm3 = (C4652Bm) interceptorExecutor$modifyBeforeTransmit$1.L$0;
        C56391yDq.AEQbTJ(objModifyBeforeTransmit);
        c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeTransmit);
        c4652Bm2 = c4652Bm3;
        if (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            interceptorExecutor$modifyBeforeTransmit$1.L$0 = c4652Bm2;
            interceptorExecutor$modifyBeforeTransmit$1.L$1 = it;
            interceptorExecutor$modifyBeforeTransmit$1.L$2 = c4652Bm;
            interceptorExecutor$modifyBeforeTransmit$1.L$3 = c4652Bm2;
            interceptorExecutor$modifyBeforeTransmit$1.label = 1;
            objModifyBeforeTransmit = interfaceC54725xT.modifyBeforeTransmit(c4652Bm2, interceptorExecutor$modifyBeforeTransmit$1);
            if (objModifyBeforeTransmit == objCopydefault) {
                return objCopydefault;
            }
            c4652Bm3 = c4652Bm2;
            c4652Bm2.OLrzqt((InterfaceC5037Ch) objModifyBeforeTransmit);
            c4652Bm2 = c4652Bm3;
            if (it.hasNext()) {
                objM7377constructorimpl = Result.m7377constructorimpl(c4652Bm);
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return ((C4652Bm) objM7377constructorimpl).AEQbTJ();
    }

    public final void KWHzl(@NotNull C58859zS c58859zS) {
        Intrinsics.checkNotNullParameter(c58859zS, "");
        InterfaceC5037Ch interfaceC5037ChOLrzqt = c58859zS.OLrzqt();
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4733Bp c4733Bp = new C4733Bp(i, interfaceC5037ChOLrzqt, interfaceC5039CjAEQbTJ, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readAfterTransmit(c4733Bp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:12:0x0035, B:26:0x0084, B:20:0x0066, B:22:0x006c, B:27:0x008b, B:19:0x005c), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:12:0x0035, B:26:0x0084, B:20:0x0066, B:22:0x006c, B:27:0x008b, B:19:0x005c), top: B:35:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C58859zS c58859zS, @NotNull Continuation<? super InterfaceC5039Cj> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeDeserialization$1 interceptorExecutor$modifyBeforeDeserialization$1;
        java.lang.Object objM7377constructorimpl;
        C4733Bp c4733Bp;
        java.util.Iterator it;
        C4733Bp c4733Bp2;
        if (continuation instanceof InterceptorExecutor$modifyBeforeDeserialization$1) {
            interceptorExecutor$modifyBeforeDeserialization$1 = (InterceptorExecutor$modifyBeforeDeserialization$1) continuation;
            int i = interceptorExecutor$modifyBeforeDeserialization$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeDeserialization$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeDeserialization$1 = new InterceptorExecutor$modifyBeforeDeserialization$1(this, continuation);
            }
        }
        java.lang.Object objModifyBeforeDeserialization = interceptorExecutor$modifyBeforeDeserialization$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeDeserialization$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objModifyBeforeDeserialization);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            c4733Bp = new C4733Bp(i3, c58859zS.OLrzqt(), c58859zS.AEQbTJ(), this.EZpvd);
            Result.Application application2 = Result.Companion;
            it = this.OLrzqt.iterator();
            c4733Bp2 = c4733Bp;
            if (it.hasNext()) {
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return ((C4733Bp) objM7377constructorimpl).EZpvd();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4733Bp2 = (C4733Bp) interceptorExecutor$modifyBeforeDeserialization$1.L$3;
        c4733Bp = (C4733Bp) interceptorExecutor$modifyBeforeDeserialization$1.L$2;
        it = (java.util.Iterator) interceptorExecutor$modifyBeforeDeserialization$1.L$1;
        C4733Bp c4733Bp3 = (C4733Bp) interceptorExecutor$modifyBeforeDeserialization$1.L$0;
        C56391yDq.AEQbTJ(objModifyBeforeDeserialization);
        c4733Bp2.EZpvd((InterfaceC5039Cj) objModifyBeforeDeserialization);
        c4733Bp2 = c4733Bp3;
        if (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            interceptorExecutor$modifyBeforeDeserialization$1.L$0 = c4733Bp2;
            interceptorExecutor$modifyBeforeDeserialization$1.L$1 = it;
            interceptorExecutor$modifyBeforeDeserialization$1.L$2 = c4733Bp;
            interceptorExecutor$modifyBeforeDeserialization$1.L$3 = c4733Bp2;
            interceptorExecutor$modifyBeforeDeserialization$1.label = 1;
            objModifyBeforeDeserialization = interfaceC54725xT.modifyBeforeDeserialization(c4733Bp2, interceptorExecutor$modifyBeforeDeserialization$1);
            if (objModifyBeforeDeserialization == objCopydefault) {
                return objCopydefault;
            }
            c4733Bp3 = c4733Bp2;
            c4733Bp2.EZpvd((InterfaceC5039Cj) objModifyBeforeDeserialization);
            c4733Bp2 = c4733Bp3;
            if (it.hasNext()) {
                objM7377constructorimpl = Result.m7377constructorimpl(c4733Bp);
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return ((C4733Bp) objM7377constructorimpl).EZpvd();
    }

    public final void EZpvd(@NotNull C58859zS c58859zS) {
        Intrinsics.checkNotNullParameter(c58859zS, "");
        InterfaceC5037Ch interfaceC5037ChOLrzqt = c58859zS.OLrzqt();
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4733Bp c4733Bp = new C4733Bp(i, interfaceC5037ChOLrzqt, interfaceC5039CjAEQbTJ, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readBeforeDeserialization(c4733Bp);
        }
    }

    public final void OLrzqt(O o2, @NotNull C58859zS c58859zS) {
        Intrinsics.checkNotNullParameter(c58859zS, "");
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Result.Application application = Result.Companion;
        Intrinsics.copydefault(o2, "");
        java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(o2);
        Intrinsics.copydefault(i, "");
        C4625Bl c4625Bl = new C4625Bl(i, objM7377constructorimpl, c58859zS, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readAfterDeserialization(c4625Bl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x0037, B:28:0x008c, B:23:0x006f, B:25:0x0075, B:29:0x0099), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x0037, B:28:0x008c, B:23:0x006f, B:25:0x0075, B:29:0x0099), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:28:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.Object obj, @NotNull InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, @NotNull Continuation<? super Result<? extends O>> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeAttemptCompletion$1 interceptorExecutor$modifyBeforeAttemptCompletion$1;
        C4706Bo<I, O> c4706Bo;
        C4706Bo<I, O> c4706Bo2;
        java.util.Iterator it;
        C4517Bh c4517Bh;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objMo5946modifyBeforeAttemptCompletiongIAlus;
        if (continuation instanceof InterceptorExecutor$modifyBeforeAttemptCompletion$1) {
            interceptorExecutor$modifyBeforeAttemptCompletion$1 = (InterceptorExecutor$modifyBeforeAttemptCompletion$1) continuation;
            int i = interceptorExecutor$modifyBeforeAttemptCompletion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeAttemptCompletion$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeAttemptCompletion$1 = new InterceptorExecutor$modifyBeforeAttemptCompletion$1(this, continuation);
            }
        }
        java.lang.Object obj2 = interceptorExecutor$modifyBeforeAttemptCompletion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeAttemptCompletion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            C4517Bh c4517Bh2 = new C4517Bh(i3, obj, interfaceC5037Ch, interfaceC5039Cj, this.EZpvd);
            try {
                Result.Application application = Result.Companion;
                c4706Bo2 = this;
                c4706Bo = c4706Bo2;
                it = this.OLrzqt.iterator();
                c4517Bh = c4517Bh2;
                if (it.hasNext()) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c4706Bo = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4517Bh = (C4517Bh) interceptorExecutor$modifyBeforeAttemptCompletion$1.L$3;
            it = (java.util.Iterator) interceptorExecutor$modifyBeforeAttemptCompletion$1.L$2;
            c4706Bo2 = (C4706Bo) interceptorExecutor$modifyBeforeAttemptCompletion$1.L$1;
            c4706Bo = (C4706Bo) interceptorExecutor$modifyBeforeAttemptCompletion$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                objMo5946modifyBeforeAttemptCompletiongIAlus = ((Result) obj2).m7386unboximpl();
                c4706Bo2.OLrzqt("modifyBeforeAttemptCompletion", objMo5946modifyBeforeAttemptCompletiongIAlus, c4706Bo2.gEmmrt.KWHzl());
                c4517Bh.AEQbTJ(objMo5946modifyBeforeAttemptCompletiongIAlus);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (it.hasNext()) {
                InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
                interceptorExecutor$modifyBeforeAttemptCompletion$1.L$0 = c4706Bo;
                interceptorExecutor$modifyBeforeAttemptCompletion$1.L$1 = c4706Bo2;
                interceptorExecutor$modifyBeforeAttemptCompletion$1.L$2 = it;
                interceptorExecutor$modifyBeforeAttemptCompletion$1.L$3 = c4517Bh;
                interceptorExecutor$modifyBeforeAttemptCompletion$1.label = 1;
                objMo5946modifyBeforeAttemptCompletiongIAlus = interfaceC54725xT.mo5946modifyBeforeAttemptCompletiongIAlus(c4517Bh, interceptorExecutor$modifyBeforeAttemptCompletion$1);
                if (objMo5946modifyBeforeAttemptCompletiongIAlus == objCopydefault) {
                    return objCopydefault;
                }
                c4706Bo2.OLrzqt("modifyBeforeAttemptCompletion", objMo5946modifyBeforeAttemptCompletiongIAlus, c4706Bo2.gEmmrt.KWHzl());
                c4517Bh.AEQbTJ(objMo5946modifyBeforeAttemptCompletiongIAlus);
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(c4517Bh.copydefault()));
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl == null) {
                        return c4706Bo.OLrzqt("modifyBeforeAttemptCompletion", ((Result) objM7377constructorimpl).m7386unboximpl(), c4706Bo.gEmmrt.KWHzl());
                    }
                    Result.Application application3 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
                }
            }
        }
    }

    public final void copydefault(@NotNull java.lang.Object obj, @NotNull InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.copydefault = interfaceC5039Cj;
        Intrinsics.copydefault(i, "");
        C4517Bh c4517Bh = new C4517Bh(i, obj, interfaceC5037Ch, interfaceC5039Cj, this.EZpvd);
        java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> list = this.OLrzqt;
        Result.Application application = Result.Companion;
        java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            try {
                Result.Application application2 = Result.Companion;
                interfaceC54725xT.readAfterAttempt(c4517Bh);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            } else {
                java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C56379yDe.EZpvd(thM7380exceptionOrNullimpl, thM7380exceptionOrNullimpl2);
                }
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            }
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x0037, B:28:0x008d, B:23:0x0070, B:25:0x0076, B:29:0x009a), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x0037, B:28:0x008d, B:23:0x0070, B:25:0x0076, B:29:0x009a), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008a -> B:28:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.Object obj, @NotNull Continuation<? super Result<? extends O>> continuation) throws java.lang.Throwable {
        InterceptorExecutor$modifyBeforeCompletion$1 interceptorExecutor$modifyBeforeCompletion$1;
        C4706Bo<I, O> c4706Bo;
        C4706Bo<I, O> c4706Bo2;
        java.util.Iterator it;
        C4571Bj c4571Bj;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objMo5947modifyBeforeCompletiongIAlus;
        if (continuation instanceof InterceptorExecutor$modifyBeforeCompletion$1) {
            interceptorExecutor$modifyBeforeCompletion$1 = (InterceptorExecutor$modifyBeforeCompletion$1) continuation;
            int i = interceptorExecutor$modifyBeforeCompletion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                interceptorExecutor$modifyBeforeCompletion$1.label = i - Integer.MIN_VALUE;
            } else {
                interceptorExecutor$modifyBeforeCompletion$1 = new InterceptorExecutor$modifyBeforeCompletion$1(this, continuation);
            }
        }
        java.lang.Object obj2 = interceptorExecutor$modifyBeforeCompletion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = interceptorExecutor$modifyBeforeCompletion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            I i3 = this.AEQbTJ;
            if (i3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            Intrinsics.copydefault(i3, "");
            C4571Bj c4571Bj2 = new C4571Bj(i3, obj, this.KWHzl, this.copydefault, this.EZpvd);
            try {
                Result.Application application = Result.Companion;
                c4706Bo2 = this;
                c4706Bo = c4706Bo2;
                it = this.OLrzqt.iterator();
                c4571Bj = c4571Bj2;
                if (it.hasNext()) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c4706Bo = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4571Bj = (C4571Bj) interceptorExecutor$modifyBeforeCompletion$1.L$3;
            it = (java.util.Iterator) interceptorExecutor$modifyBeforeCompletion$1.L$2;
            c4706Bo2 = (C4706Bo) interceptorExecutor$modifyBeforeCompletion$1.L$1;
            c4706Bo = (C4706Bo) interceptorExecutor$modifyBeforeCompletion$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                objMo5947modifyBeforeCompletiongIAlus = ((Result) obj2).m7386unboximpl();
                c4706Bo2.OLrzqt("modifyBeforeCompletion", objMo5947modifyBeforeCompletiongIAlus, c4706Bo2.gEmmrt.KWHzl());
                c4571Bj.AEQbTJ(objMo5947modifyBeforeCompletiongIAlus);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (it.hasNext()) {
                InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
                interceptorExecutor$modifyBeforeCompletion$1.L$0 = c4706Bo;
                interceptorExecutor$modifyBeforeCompletion$1.L$1 = c4706Bo2;
                interceptorExecutor$modifyBeforeCompletion$1.L$2 = it;
                interceptorExecutor$modifyBeforeCompletion$1.L$3 = c4571Bj;
                interceptorExecutor$modifyBeforeCompletion$1.label = 1;
                objMo5947modifyBeforeCompletiongIAlus = interfaceC54725xT.mo5947modifyBeforeCompletiongIAlus(c4571Bj, interceptorExecutor$modifyBeforeCompletion$1);
                if (objMo5947modifyBeforeCompletiongIAlus == objCopydefault) {
                    return objCopydefault;
                }
                c4706Bo2.OLrzqt("modifyBeforeCompletion", objMo5947modifyBeforeCompletiongIAlus, c4706Bo2.gEmmrt.KWHzl());
                c4571Bj.AEQbTJ(objMo5947modifyBeforeCompletiongIAlus);
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(c4571Bj.copydefault()));
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl == null) {
                        return c4706Bo.OLrzqt("modifyBeforeCompletion", ((Result) objM7377constructorimpl).m7386unboximpl(), c4706Bo.gEmmrt.KWHzl());
                    }
                    Result.Application application3 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
                }
            }
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.Object obj) {
        java.lang.Object objM7377constructorimpl;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4571Bj c4571Bj = new C4571Bj(i, obj, this.KWHzl, this.copydefault, this.EZpvd);
        java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> list = this.OLrzqt;
        Result.Application application = Result.Companion;
        java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC54725xT interfaceC54725xT = (InterfaceC54725xT) it.next();
            try {
                Result.Application application2 = Result.Companion;
                interfaceC54725xT.readAfterExecution(c4571Bj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            } else {
                java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C56379yDe.EZpvd(thM7380exceptionOrNullimpl, thM7380exceptionOrNullimpl2);
                }
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl3 == null) {
            return OLrzqt("readAfterExecution", c4571Bj.copydefault(), this.gEmmrt.KWHzl());
        }
        java.lang.Throwable thM7380exceptionOrNullimpl4 = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl4 != null) {
            C56379yDe.EZpvd(thM7380exceptionOrNullimpl3, thM7380exceptionOrNullimpl4);
        }
        Result.Application application5 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl3));
    }

    public final void EZpvd(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.KWHzl = interfaceC5037Ch;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4652Bm c4652Bm = new C4652Bm(i, interfaceC5037Ch, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readAfterSerialization(c4652Bm);
        }
    }

    public final void OLrzqt(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.KWHzl = interfaceC5037Ch;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4652Bm c4652Bm = new C4652Bm(i, interfaceC5037Ch, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readBeforeSigning(c4652Bm);
        }
    }

    public final void KWHzl(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.KWHzl = interfaceC5037Ch;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4652Bm c4652Bm = new C4652Bm(i, interfaceC5037Ch, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readAfterSigning(c4652Bm);
        }
    }

    public final void AEQbTJ(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.KWHzl = interfaceC5037Ch;
        I i = this.AEQbTJ;
        if (i == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.copydefault(i, "");
        C4652Bm c4652Bm = new C4652Bm(i, interfaceC5037Ch, this.EZpvd);
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC54725xT) it.next()).readBeforeTransmit(c4652Bm);
        }
    }
}
