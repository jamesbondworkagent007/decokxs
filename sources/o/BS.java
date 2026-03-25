package o;

import aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$1;
import aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$2;
import aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$3;
import aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$4;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BS<Input, Output> implements CG<BP<Input>, Output> {
    public final CG<BP<Input>, Output> AEQbTJ;
    public final C4706Bo<Input, Output> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super o.BP<Input>, ? extends Output> */
    /* JADX WARN: Multi-variable type inference failed */
    public BS(@NotNull CG<? super BP<Input>, ? extends Output> cg, @NotNull C4706Bo<Input, Output> c4706Bo) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        this.AEQbTJ = cg;
        this.copydefault = c4706Bo;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CG
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull BP<Input> bp, @NotNull Continuation<? super Output> continuation) throws java.lang.Throwable {
        OperationHandler$call$1 operationHandler$call$1;
        java.lang.Throwable th;
        BS<Input, Output> bs;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objCopydefault;
        java.lang.Object objEZpvd;
        if (continuation instanceof OperationHandler$call$1) {
            operationHandler$call$1 = (OperationHandler$call$1) continuation;
            int i = operationHandler$call$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                operationHandler$call$1.label = i - Integer.MIN_VALUE;
            } else {
                operationHandler$call$1 = new OperationHandler$call$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = operationHandler$call$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = operationHandler$call$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            CoroutineContext context = operationHandler$call$1.getContext();
            OperationHandler$call$2 operationHandler$call$2 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "operation started";
                }
            };
            LogLevel logLevel = LogLevel.Trace;
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(BS.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            C5141Gh.copydefault(context, logLevel, strGEmmrt, null, operationHandler$call$2);
            java.lang.Object objAEQbTJ = this.copydefault.AEQbTJ(bp.EZpvd());
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                try {
                    Result.Application application = Result.Companion;
                    CG<BP<Input>, Output> cg = this.AEQbTJ;
                    operationHandler$call$1.L$0 = this;
                    operationHandler$call$1.label = 1;
                    objOLrzqt = cg.OLrzqt(bp, operationHandler$call$1);
                    if (objOLrzqt == objCopydefault2) {
                        return objCopydefault2;
                    }
                    bs = this;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bs = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
                bs = this;
                C4706Bo<Input, Output> c4706Bo = bs.copydefault;
                operationHandler$call$1.L$0 = bs;
                operationHandler$call$1.label = 2;
                objCopydefault = c4706Bo.copydefault(objM7377constructorimpl, operationHandler$call$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                objEZpvd = bs.copydefault.EZpvd(objCopydefault);
                if (!Result.m7384isSuccessimpl(objEZpvd)) {
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return objEZpvd;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bs = (BS) operationHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objCopydefault = ((Result) objOLrzqt).m7386unboximpl();
                objEZpvd = bs.copydefault.EZpvd(objCopydefault);
                if (!Result.m7384isSuccessimpl(objEZpvd)) {
                    if (Result.m7383isFailureimpl(objEZpvd)) {
                        CoroutineContext context2 = operationHandler$call$1.getContext();
                        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                        OperationHandler$call$4 operationHandler$call$4 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "operation failed";
                            }
                        };
                        LogLevel logLevel2 = LogLevel.Trace;
                        java.lang.String strGEmmrt2 = C56524yIo.AEQbTJ(BS.class).gEmmrt();
                        if (strGEmmrt2 == null) {
                            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                        }
                        C5141Gh.copydefault(context2, logLevel2, strGEmmrt2, thM7380exceptionOrNullimpl, operationHandler$call$4);
                    }
                } else {
                    CoroutineContext context3 = operationHandler$call$1.getContext();
                    OperationHandler$call$3 operationHandler$call$3 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.OperationHandler$call$3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "operation completed successfully";
                        }
                    };
                    LogLevel logLevel3 = LogLevel.Trace;
                    java.lang.String strGEmmrt3 = C56524yIo.AEQbTJ(BS.class).gEmmrt();
                    if (strGEmmrt3 == null) {
                        throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    C5141Gh.copydefault(context3, logLevel3, strGEmmrt3, null, operationHandler$call$3);
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return objEZpvd;
            }
            bs = (BS) operationHandler$call$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt);
        C4706Bo<Input, Output> c4706Bo2 = bs.copydefault;
        operationHandler$call$1.L$0 = bs;
        operationHandler$call$1.label = 2;
        objCopydefault = c4706Bo2.copydefault(objM7377constructorimpl, operationHandler$call$1);
        if (objCopydefault == objCopydefault2) {
        }
        objEZpvd = bs.copydefault.EZpvd(objCopydefault);
        if (!Result.m7384isSuccessimpl(objEZpvd)) {
        }
        C56391yDq.AEQbTJ(objEZpvd);
        return objEZpvd;
    }
}
