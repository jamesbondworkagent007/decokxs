package o;

import aws.smithy.kotlin.runtime.retries.RetryFailureException;
import aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$doTryLoop$1;
import aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$retry$1;
import aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$success$1;
import aws.smithy.kotlin.runtime.retries.TooManyAttemptsException;
import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import o.C5085Ed;
import o.DQ;
import o.DW;
import o.DY;
import o.InterfaceC5086Ee;
import o.InterfaceC5087Ef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class DY implements DW {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final TaskDescription EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DY() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public <R> java.lang.Object AEQbTJ(int i, @NotNull java.lang.Object obj, @NotNull AbstractC5091Ej abstractC5091Ej, @NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, i, obj, abstractC5091Ej, interfaceC5093El, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public <R> java.lang.Object EZpvd(int i, @NotNull java.lang.Object obj, @NotNull AbstractC5091Ej abstractC5091Ej, @NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, i, obj, abstractC5091Ej, interfaceC5093El, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.DW
    public <R> java.lang.Object KWHzl(@NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, @NotNull Continuation<? super DQ<? extends R>> continuation) {
        return KWHzl(this, interfaceC5093El, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/DW$Application; */
    @Override // o.DW
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription copydefault() {
        return this.EZpvd;
    }

    public static final class StateListAnimator implements InterfaceC5185Hz<TaskDescription.ActionBar, DY> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object; */
        @Override // o.InterfaceC5185Hz
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public DY OLrzqt(@NotNull Function1<? super TaskDescription.ActionBar, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TaskDescription.ActionBar actionBar = new TaskDescription.ActionBar();
            function1.invoke(actionBar);
            return new DY(new TaskDescription(actionBar));
        }
    }

    public DY(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.DY$TaskDescription:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.DY$TaskDescription:0x0006: INVOKE 
  (wrap:o.DY$TaskDescription$Activity:0x0004: SGET  A[WRAPPED] (LINE:23) o.DY.TaskDescription.OLrzqt o.DY$TaskDescription$Activity)
 VIRTUAL call: o.DY.TaskDescription.Activity.OLrzqt():o.DY$TaskDescription A[MD:():o.DY$TaskDescription (m), WRAPPED] (LINE:23)) : (r1v0 o.DY$TaskDescription))
 A[MD:(o.DY$TaskDescription):void (m)] (LINE:23) call: o.DY.<init>(o.DY$TaskDescription):void type: THIS */
    public /* synthetic */ DY(TaskDescription taskDescription, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaskDescription.OLrzqt.OLrzqt() : taskDescription);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[PHI: r10
  0x00a1: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x009e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <R> java.lang.Object KWHzl(DY dy, InterfaceC5093El<? super R> interfaceC5093El, Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, Continuation<? super DQ<? extends R>> continuation) throws java.lang.Throwable {
        StandardRetryStrategy$retry$1 standardRetryStrategy$retry$1;
        DY dy2;
        InterfaceC5093El<? super R> interfaceC5093El2;
        int i;
        if (continuation instanceof StandardRetryStrategy$retry$1) {
            standardRetryStrategy$retry$1 = (StandardRetryStrategy$retry$1) continuation;
            int i2 = standardRetryStrategy$retry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                standardRetryStrategy$retry$1.label = i2 - Integer.MIN_VALUE;
            } else {
                standardRetryStrategy$retry$1 = new StandardRetryStrategy$retry$1(dy, continuation);
            }
        }
        StandardRetryStrategy$retry$1 standardRetryStrategy$retry$12 = standardRetryStrategy$retry$1;
        java.lang.Object objCopydefault = standardRetryStrategy$retry$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = standardRetryStrategy$retry$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                standardRetryStrategy$retry$12.L$0 = dy;
                standardRetryStrategy$retry$12.L$1 = interfaceC5093El;
                standardRetryStrategy$retry$12.L$2 = function1;
                standardRetryStrategy$retry$12.label = 1;
                if (dy.AEQbTJ(standardRetryStrategy$retry$12) == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            C56391yDq.AEQbTJ(objCopydefault);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = standardRetryStrategy$retry$12.I$0;
                    InterfaceC5093El<? super R> interfaceC5093El3 = (InterfaceC5093El) standardRetryStrategy$retry$12.L$2;
                    function1 = (Function1) standardRetryStrategy$retry$12.L$1;
                    dy2 = (DY) standardRetryStrategy$retry$12.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    interfaceC5093El2 = interfaceC5093El3;
                    standardRetryStrategy$retry$12.L$0 = null;
                    standardRetryStrategy$retry$12.L$1 = null;
                    standardRetryStrategy$retry$12.L$2 = null;
                    standardRetryStrategy$retry$12.label = 3;
                    objCopydefault = dy2.AEQbTJ(function1, interfaceC5093El2, i, (InterfaceC5088Eg) objCopydefault, standardRetryStrategy$retry$12);
                    return objCopydefault != objCopydefault2 ? objCopydefault2 : objCopydefault;
                }
                function1 = (Function1) standardRetryStrategy$retry$12.L$2;
                interfaceC5093El = (InterfaceC5093El) standardRetryStrategy$retry$12.L$1;
                dy = (DY) standardRetryStrategy$retry$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            InterfaceC5087Ef interfaceC5087EfDjBIcL = dy.copydefault().djBIcL();
            standardRetryStrategy$retry$12.L$0 = dy;
            standardRetryStrategy$retry$12.L$1 = function1;
            standardRetryStrategy$retry$12.L$2 = interfaceC5093El;
            standardRetryStrategy$retry$12.I$0 = 1;
            standardRetryStrategy$retry$12.label = 2;
            objCopydefault = interfaceC5087EfDjBIcL.copydefault(standardRetryStrategy$retry$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            dy2 = dy;
            interfaceC5093El2 = interfaceC5093El;
            i = 1;
            standardRetryStrategy$retry$12.L$0 = null;
            standardRetryStrategy$retry$12.L$1 = null;
            standardRetryStrategy$retry$12.L$2 = null;
            standardRetryStrategy$retry$12.label = 3;
            objCopydefault = dy2.AEQbTJ(function1, interfaceC5093El2, i, (InterfaceC5088Eg) objCopydefault, standardRetryStrategy$retry$12);
            if (objCopydefault != objCopydefault2) {
            }
        } catch (RetryCapacityExceededException e) {
            dy.EZpvd(e, 1, null);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x024c: MOVE (r8 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:95:0x024b */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x024b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:95:0x024b */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d A[Catch: all -> 0x00cf, RetryCapacityExceededException -> 0x00d2, TryCatch #8 {RetryCapacityExceededException -> 0x00d2, all -> 0x00cf, blocks: (B:14:0x0054, B:57:0x0189, B:59:0x018d, B:63:0x01a6, B:65:0x01aa, B:67:0x01ae, B:69:0x01b8, B:72:0x01d8, B:89:0x0233, B:90:0x023b, B:91:0x023c, B:92:0x0241, B:93:0x0242, B:94:0x024a, B:17:0x0074, B:20:0x009a, B:23:0x00ad, B:26:0x00ca), top: B:118:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6 A[Catch: all -> 0x00cf, RetryCapacityExceededException -> 0x00d2, TryCatch #8 {RetryCapacityExceededException -> 0x00d2, all -> 0x00cf, blocks: (B:14:0x0054, B:57:0x0189, B:59:0x018d, B:63:0x01a6, B:65:0x01aa, B:67:0x01ae, B:69:0x01b8, B:72:0x01d8, B:89:0x0233, B:90:0x023b, B:91:0x023c, B:92:0x0241, B:93:0x0242, B:94:0x024a, B:17:0x0074, B:20:0x009a, B:23:0x00ad, B:26:0x00ca), top: B:118:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x021b -> B:81:0x0222). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object AEQbTJ(Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, InterfaceC5093El<? super R> interfaceC5093El, int i, InterfaceC5088Eg interfaceC5088Eg, Continuation<? super DQ<? extends R>> continuation) throws java.lang.Throwable {
        StandardRetryStrategy$doTryLoop$1 standardRetryStrategy$doTryLoop$1;
        DY dy;
        java.lang.Object obj;
        java.lang.Object objM7377constructorimpl;
        DY dy2;
        DY dy3;
        InterfaceC5088Eg interfaceC5088Eg2;
        InterfaceC5093El<? super R> interfaceC5093El2;
        int i2;
        InterfaceC5088Eg interfaceC5088Eg3;
        StandardRetryStrategy$doTryLoop$1 standardRetryStrategy$doTryLoop$12;
        DY dy4;
        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function12;
        InterfaceC5088Eg interfaceC5088Eg4;
        InterfaceC5093El<? super R> interfaceC5093El3;
        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function13;
        AbstractC5091Ej abstractC5091Ej;
        java.lang.Object obj2;
        InterfaceC5088Eg interfaceC5088Eg5;
        InterfaceC5093El<? super R> interfaceC5093El4;
        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function14;
        DY dy5;
        java.lang.Throwable th;
        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function15;
        DY dy6;
        java.lang.Object obj3;
        InterfaceC5093El<? super R> interfaceC5093El5;
        AbstractC5091Ej abstractC5091Ej2;
        DY dy7;
        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function16;
        DY dy8;
        InterfaceC5093El<? super R> interfaceC5093El6;
        DY dy9;
        CancellationException cancellationException;
        if (continuation instanceof StandardRetryStrategy$doTryLoop$1) {
            standardRetryStrategy$doTryLoop$1 = (StandardRetryStrategy$doTryLoop$1) continuation;
            int i3 = standardRetryStrategy$doTryLoop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                standardRetryStrategy$doTryLoop$1.label = i3 - Integer.MIN_VALUE;
                dy = this;
            } else {
                dy = this;
                standardRetryStrategy$doTryLoop$1 = new StandardRetryStrategy$doTryLoop$1(dy, continuation);
            }
        }
        java.lang.Object objCopydefault = standardRetryStrategy$doTryLoop$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = standardRetryStrategy$doTryLoop$1.label;
        try {
            switch (i4) {
                case 0:
                    C56391yDq.AEQbTJ(objCopydefault);
                    interfaceC5093El2 = interfaceC5093El;
                    i2 = i;
                    interfaceC5088Eg3 = interfaceC5088Eg;
                    standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$1;
                    dy4 = dy;
                    function12 = function1;
                    try {
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        Result.Application application = Result.Companion;
                        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function17 = function12;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        function15 = function17;
                        dy6 = dy4;
                        interfaceC5093El4 = interfaceC5093El2;
                        i4 = i2;
                        interfaceC5088Eg4 = interfaceC5088Eg3;
                        dy3 = dy6;
                        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (!(thM7380exceptionOrNullimpl instanceof CancellationException)) {
                        }
                        if (cancellationException == null) {
                        }
                    }
                    Result.Application application2 = Result.Companion;
                    standardRetryStrategy$doTryLoop$12.L$0 = dy4;
                    standardRetryStrategy$doTryLoop$12.L$1 = function12;
                    standardRetryStrategy$doTryLoop$12.L$2 = interfaceC5093El2;
                    standardRetryStrategy$doTryLoop$12.L$3 = interfaceC5088Eg3;
                    standardRetryStrategy$doTryLoop$12.L$4 = null;
                    standardRetryStrategy$doTryLoop$12.L$5 = null;
                    standardRetryStrategy$doTryLoop$12.I$0 = i2;
                    standardRetryStrategy$doTryLoop$12.label = 1;
                    objCopydefault = function12.invoke(standardRetryStrategy$doTryLoop$12);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    StandardRetryStrategy$doTryLoop$1 standardRetryStrategy$doTryLoop$13 = standardRetryStrategy$doTryLoop$12;
                    function13 = function12;
                    standardRetryStrategy$doTryLoop$1 = standardRetryStrategy$doTryLoop$13;
                    InterfaceC5088Eg interfaceC5088Eg6 = interfaceC5088Eg3;
                    interfaceC5093El3 = interfaceC5093El2;
                    i4 = i2;
                    interfaceC5088Eg4 = interfaceC5088Eg6;
                    StandardRetryStrategy$doTryLoop$1 standardRetryStrategy$doTryLoop$14 = standardRetryStrategy$doTryLoop$1;
                    objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
                    function15 = function13;
                    standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$14;
                    dy6 = dy4;
                    interfaceC5093El4 = interfaceC5093El3;
                    dy3 = dy6;
                    java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    cancellationException = !(thM7380exceptionOrNullimpl2 instanceof CancellationException) ? (CancellationException) thM7380exceptionOrNullimpl2 : null;
                    if (cancellationException == null) {
                        throw cancellationException;
                    }
                    AbstractC5091Ej abstractC5091EjKWHzl = interfaceC5093El4.KWHzl(objM7377constructorimpl);
                    try {
                        standardRetryStrategy$doTryLoop$12.L$0 = dy3;
                        standardRetryStrategy$doTryLoop$12.L$1 = function15;
                        standardRetryStrategy$doTryLoop$12.L$2 = interfaceC5093El4;
                        standardRetryStrategy$doTryLoop$12.L$3 = interfaceC5088Eg4;
                        standardRetryStrategy$doTryLoop$12.L$4 = objM7377constructorimpl;
                        standardRetryStrategy$doTryLoop$12.L$5 = abstractC5091EjKWHzl;
                        standardRetryStrategy$doTryLoop$12.I$0 = i4;
                        standardRetryStrategy$doTryLoop$12.label = 2;
                        if (dy3.AEQbTJ(i4, objM7377constructorimpl, abstractC5091EjKWHzl, interfaceC5093El4, standardRetryStrategy$doTryLoop$12) == objCopydefault2) {
                            return objCopydefault2;
                        }
                        function14 = function15;
                        dy5 = dy3;
                        obj2 = objM7377constructorimpl;
                        standardRetryStrategy$doTryLoop$1 = standardRetryStrategy$doTryLoop$12;
                        interfaceC5088Eg5 = interfaceC5088Eg4;
                        abstractC5091Ej = abstractC5091EjKWHzl;
                        if (abstractC5091Ej instanceof AbstractC5091Ej.Activity) {
                            standardRetryStrategy$doTryLoop$1.L$0 = dy5;
                            standardRetryStrategy$doTryLoop$1.L$1 = interfaceC5088Eg5;
                            standardRetryStrategy$doTryLoop$1.L$2 = obj2;
                            standardRetryStrategy$doTryLoop$1.L$3 = null;
                            standardRetryStrategy$doTryLoop$1.L$4 = null;
                            standardRetryStrategy$doTryLoop$1.L$5 = null;
                            standardRetryStrategy$doTryLoop$1.I$0 = i4;
                            standardRetryStrategy$doTryLoop$1.label = 3;
                            objCopydefault = dy5.OLrzqt(interfaceC5088Eg5, i4, obj2, standardRetryStrategy$doTryLoop$1);
                            return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
                        }
                        if (abstractC5091Ej instanceof AbstractC5091Ej.Application) {
                            dy5.OLrzqt(i4, obj2);
                            throw new KotlinNothingValueException();
                        }
                        if (abstractC5091Ej instanceof AbstractC5091Ej.StateListAnimator) {
                            if (i4 >= dy5.copydefault().EZpvd()) {
                                dy5.AEQbTJ(i4, obj2);
                                throw new KotlinNothingValueException();
                            }
                            try {
                                try {
                                    try {
                                        InterfaceC5086Ee interfaceC5086EeCopydefault = dy5.copydefault().copydefault();
                                        standardRetryStrategy$doTryLoop$1.L$0 = dy5;
                                        standardRetryStrategy$doTryLoop$1.L$1 = function14;
                                        standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El4;
                                        standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg5;
                                        standardRetryStrategy$doTryLoop$1.L$4 = obj2;
                                        standardRetryStrategy$doTryLoop$1.L$5 = abstractC5091Ej;
                                        standardRetryStrategy$doTryLoop$1.I$0 = i4;
                                        standardRetryStrategy$doTryLoop$1.label = 4;
                                        if (interfaceC5086EeCopydefault.AEQbTJ(i4, standardRetryStrategy$doTryLoop$1) == objCopydefault2) {
                                            return objCopydefault2;
                                        }
                                        RetryErrorType retryErrorTypeKWHzl = ((AbstractC5091Ej.StateListAnimator) abstractC5091Ej).KWHzl();
                                        standardRetryStrategy$doTryLoop$1.L$0 = dy5;
                                        standardRetryStrategy$doTryLoop$1.L$1 = function14;
                                        standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El4;
                                        standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg5;
                                        standardRetryStrategy$doTryLoop$1.L$4 = obj2;
                                        standardRetryStrategy$doTryLoop$1.L$5 = abstractC5091Ej;
                                        standardRetryStrategy$doTryLoop$1.I$0 = i4;
                                        standardRetryStrategy$doTryLoop$1.label = 5;
                                        objCopydefault = interfaceC5088Eg5.copydefault(retryErrorTypeKWHzl, standardRetryStrategy$doTryLoop$1);
                                        if (objCopydefault == objCopydefault2) {
                                            return objCopydefault2;
                                        }
                                        InterfaceC5088Eg interfaceC5088Eg7 = (InterfaceC5088Eg) objCopydefault;
                                        standardRetryStrategy$doTryLoop$1.L$0 = dy7;
                                        standardRetryStrategy$doTryLoop$1.L$1 = function16;
                                        standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El5;
                                        standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg2;
                                        standardRetryStrategy$doTryLoop$1.L$4 = obj3;
                                        standardRetryStrategy$doTryLoop$1.L$5 = interfaceC5088Eg7;
                                        standardRetryStrategy$doTryLoop$1.I$0 = i4;
                                        standardRetryStrategy$doTryLoop$1.label = 6;
                                        if (dy7.EZpvd(i4 + 1, obj3, abstractC5091Ej2, interfaceC5093El5, standardRetryStrategy$doTryLoop$1) == objCopydefault2) {
                                            return objCopydefault2;
                                        }
                                        interfaceC5088Eg3 = interfaceC5088Eg7;
                                        standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$1;
                                        interfaceC5093El6 = interfaceC5093El5;
                                        dy9 = dy8;
                                        function12 = function16;
                                        i2 = i4 + 1;
                                        interfaceC5093El2 = interfaceC5093El6;
                                        dy4 = dy9;
                                        Result.Application application22 = Result.Companion;
                                        standardRetryStrategy$doTryLoop$12.L$0 = dy4;
                                        standardRetryStrategy$doTryLoop$12.L$1 = function12;
                                        standardRetryStrategy$doTryLoop$12.L$2 = interfaceC5093El2;
                                        standardRetryStrategy$doTryLoop$12.L$3 = interfaceC5088Eg3;
                                        standardRetryStrategy$doTryLoop$12.L$4 = null;
                                        standardRetryStrategy$doTryLoop$12.L$5 = null;
                                        standardRetryStrategy$doTryLoop$12.I$0 = i2;
                                        standardRetryStrategy$doTryLoop$12.label = 1;
                                        objCopydefault = function12.invoke(standardRetryStrategy$doTryLoop$12);
                                        if (objCopydefault == objCopydefault2) {
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        standardRetryStrategy$doTryLoop$1.L$0 = th;
                                        standardRetryStrategy$doTryLoop$1.L$1 = null;
                                        standardRetryStrategy$doTryLoop$1.L$2 = null;
                                        standardRetryStrategy$doTryLoop$1.L$3 = null;
                                        standardRetryStrategy$doTryLoop$1.L$4 = null;
                                        standardRetryStrategy$doTryLoop$1.L$5 = null;
                                        standardRetryStrategy$doTryLoop$1.label = 7;
                                        if (interfaceC5088Eg2.OLrzqt(standardRetryStrategy$doTryLoop$1) != objCopydefault2) {
                                            return objCopydefault2;
                                        }
                                        throw th;
                                    }
                                } catch (RetryCapacityExceededException e) {
                                    e = e;
                                    objM7377constructorimpl = obj3;
                                    dy3 = dy8;
                                    dy3.EZpvd(e, i4, Result.m7376boximpl(objM7377constructorimpl));
                                    throw new KotlinNothingValueException();
                                }
                                dy8 = dy7;
                            } catch (RetryCapacityExceededException e2) {
                                e = e2;
                                dy8 = dy7;
                            }
                            obj3 = obj2;
                            interfaceC5088Eg2 = interfaceC5088Eg5;
                            interfaceC5093El5 = interfaceC5093El4;
                            abstractC5091Ej2 = abstractC5091Ej;
                            dy7 = dy5;
                            function16 = function14;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } catch (RetryCapacityExceededException e3) {
                        e = e3;
                        dy3.EZpvd(e, i4, Result.m7376boximpl(objM7377constructorimpl));
                        throw new KotlinNothingValueException();
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        standardRetryStrategy$doTryLoop$1 = standardRetryStrategy$doTryLoop$12;
                        InterfaceC5088Eg interfaceC5088Eg8 = interfaceC5088Eg4;
                        interfaceC5088Eg2 = interfaceC5088Eg8;
                        standardRetryStrategy$doTryLoop$1.L$0 = th;
                        standardRetryStrategy$doTryLoop$1.L$1 = null;
                        standardRetryStrategy$doTryLoop$1.L$2 = null;
                        standardRetryStrategy$doTryLoop$1.L$3 = null;
                        standardRetryStrategy$doTryLoop$1.L$4 = null;
                        standardRetryStrategy$doTryLoop$1.L$5 = null;
                        standardRetryStrategy$doTryLoop$1.label = 7;
                        if (interfaceC5088Eg2.OLrzqt(standardRetryStrategy$doTryLoop$1) != objCopydefault2) {
                        }
                    }
                    break;
                case 1:
                    i4 = standardRetryStrategy$doTryLoop$1.I$0;
                    interfaceC5088Eg4 = (InterfaceC5088Eg) standardRetryStrategy$doTryLoop$1.L$3;
                    interfaceC5093El3 = (InterfaceC5093El) standardRetryStrategy$doTryLoop$1.L$2;
                    function13 = (Function1) standardRetryStrategy$doTryLoop$1.L$1;
                    dy4 = (DY) standardRetryStrategy$doTryLoop$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function18 = function13;
                        standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$1;
                        function12 = function18;
                        InterfaceC5088Eg interfaceC5088Eg9 = interfaceC5088Eg4;
                        i2 = i4;
                        interfaceC5093El2 = interfaceC5093El3;
                        interfaceC5088Eg3 = interfaceC5088Eg9;
                        Result.Application application3 = Result.Companion;
                        Function1<? super Continuation<? super R>, ? extends java.lang.Object> function172 = function12;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        function15 = function172;
                        dy6 = dy4;
                        interfaceC5093El4 = interfaceC5093El2;
                        i4 = i2;
                        interfaceC5088Eg4 = interfaceC5088Eg3;
                        dy3 = dy6;
                        java.lang.Throwable thM7380exceptionOrNullimpl22 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (!(thM7380exceptionOrNullimpl22 instanceof CancellationException)) {
                        }
                        if (cancellationException == null) {
                        }
                    }
                    StandardRetryStrategy$doTryLoop$1 standardRetryStrategy$doTryLoop$142 = standardRetryStrategy$doTryLoop$1;
                    objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
                    function15 = function13;
                    standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$142;
                    dy6 = dy4;
                    interfaceC5093El4 = interfaceC5093El3;
                    dy3 = dy6;
                    java.lang.Throwable thM7380exceptionOrNullimpl222 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (!(thM7380exceptionOrNullimpl222 instanceof CancellationException)) {
                    }
                    if (cancellationException == null) {
                    }
                    break;
                case 2:
                    i4 = standardRetryStrategy$doTryLoop$1.I$0;
                    abstractC5091Ej = (AbstractC5091Ej) standardRetryStrategy$doTryLoop$1.L$5;
                    obj2 = standardRetryStrategy$doTryLoop$1.L$4;
                    interfaceC5088Eg5 = (InterfaceC5088Eg) standardRetryStrategy$doTryLoop$1.L$3;
                    interfaceC5093El4 = (InterfaceC5093El) standardRetryStrategy$doTryLoop$1.L$2;
                    function14 = (Function1) standardRetryStrategy$doTryLoop$1.L$1;
                    dy5 = (DY) standardRetryStrategy$doTryLoop$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    if (abstractC5091Ej instanceof AbstractC5091Ej.Activity) {
                    }
                    break;
                case 3:
                    int i5 = standardRetryStrategy$doTryLoop$1.I$0;
                    java.lang.Object obj4 = standardRetryStrategy$doTryLoop$1.L$2;
                    C56391yDq.AEQbTJ(objCopydefault);
                case 4:
                    i4 = standardRetryStrategy$doTryLoop$1.I$0;
                    abstractC5091Ej = (AbstractC5091Ej) standardRetryStrategy$doTryLoop$1.L$5;
                    obj2 = standardRetryStrategy$doTryLoop$1.L$4;
                    interfaceC5088Eg5 = (InterfaceC5088Eg) standardRetryStrategy$doTryLoop$1.L$3;
                    interfaceC5093El4 = (InterfaceC5093El) standardRetryStrategy$doTryLoop$1.L$2;
                    function14 = (Function1) standardRetryStrategy$doTryLoop$1.L$1;
                    dy5 = (DY) standardRetryStrategy$doTryLoop$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    RetryErrorType retryErrorTypeKWHzl2 = ((AbstractC5091Ej.StateListAnimator) abstractC5091Ej).KWHzl();
                    standardRetryStrategy$doTryLoop$1.L$0 = dy5;
                    standardRetryStrategy$doTryLoop$1.L$1 = function14;
                    standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El4;
                    standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg5;
                    standardRetryStrategy$doTryLoop$1.L$4 = obj2;
                    standardRetryStrategy$doTryLoop$1.L$5 = abstractC5091Ej;
                    standardRetryStrategy$doTryLoop$1.I$0 = i4;
                    standardRetryStrategy$doTryLoop$1.label = 5;
                    objCopydefault = interfaceC5088Eg5.copydefault(retryErrorTypeKWHzl2, standardRetryStrategy$doTryLoop$1);
                    if (objCopydefault == objCopydefault2) {
                    }
                    obj3 = obj2;
                    interfaceC5088Eg2 = interfaceC5088Eg5;
                    interfaceC5093El5 = interfaceC5093El4;
                    abstractC5091Ej2 = abstractC5091Ej;
                    dy7 = dy5;
                    function16 = function14;
                    InterfaceC5088Eg interfaceC5088Eg72 = (InterfaceC5088Eg) objCopydefault;
                    standardRetryStrategy$doTryLoop$1.L$0 = dy7;
                    standardRetryStrategy$doTryLoop$1.L$1 = function16;
                    standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El5;
                    standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg2;
                    standardRetryStrategy$doTryLoop$1.L$4 = obj3;
                    standardRetryStrategy$doTryLoop$1.L$5 = interfaceC5088Eg72;
                    standardRetryStrategy$doTryLoop$1.I$0 = i4;
                    standardRetryStrategy$doTryLoop$1.label = 6;
                    dy8 = dy7;
                    if (dy7.EZpvd(i4 + 1, obj3, abstractC5091Ej2, interfaceC5093El5, standardRetryStrategy$doTryLoop$1) == objCopydefault2) {
                    }
                    break;
                case 5:
                    i4 = standardRetryStrategy$doTryLoop$1.I$0;
                    abstractC5091Ej = (AbstractC5091Ej) standardRetryStrategy$doTryLoop$1.L$5;
                    obj2 = standardRetryStrategy$doTryLoop$1.L$4;
                    interfaceC5088Eg5 = (InterfaceC5088Eg) standardRetryStrategy$doTryLoop$1.L$3;
                    interfaceC5093El4 = (InterfaceC5093El) standardRetryStrategy$doTryLoop$1.L$2;
                    function14 = (Function1) standardRetryStrategy$doTryLoop$1.L$1;
                    dy5 = (DY) standardRetryStrategy$doTryLoop$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    obj3 = obj2;
                    interfaceC5088Eg2 = interfaceC5088Eg5;
                    interfaceC5093El5 = interfaceC5093El4;
                    abstractC5091Ej2 = abstractC5091Ej;
                    dy7 = dy5;
                    function16 = function14;
                    InterfaceC5088Eg interfaceC5088Eg722 = (InterfaceC5088Eg) objCopydefault;
                    standardRetryStrategy$doTryLoop$1.L$0 = dy7;
                    standardRetryStrategy$doTryLoop$1.L$1 = function16;
                    standardRetryStrategy$doTryLoop$1.L$2 = interfaceC5093El5;
                    standardRetryStrategy$doTryLoop$1.L$3 = interfaceC5088Eg2;
                    standardRetryStrategy$doTryLoop$1.L$4 = obj3;
                    standardRetryStrategy$doTryLoop$1.L$5 = interfaceC5088Eg722;
                    standardRetryStrategy$doTryLoop$1.I$0 = i4;
                    standardRetryStrategy$doTryLoop$1.label = 6;
                    dy8 = dy7;
                    if (dy7.EZpvd(i4 + 1, obj3, abstractC5091Ej2, interfaceC5093El5, standardRetryStrategy$doTryLoop$1) == objCopydefault2) {
                    }
                    break;
                case 6:
                    i4 = standardRetryStrategy$doTryLoop$1.I$0;
                    InterfaceC5088Eg interfaceC5088Eg10 = (InterfaceC5088Eg) standardRetryStrategy$doTryLoop$1.L$5;
                    java.lang.Object obj5 = standardRetryStrategy$doTryLoop$1.L$4;
                    interfaceC5093El6 = (InterfaceC5093El) standardRetryStrategy$doTryLoop$1.L$2;
                    Function1<? super Continuation<? super R>, ? extends java.lang.Object> function19 = (Function1) standardRetryStrategy$doTryLoop$1.L$1;
                    dy9 = (DY) standardRetryStrategy$doTryLoop$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    standardRetryStrategy$doTryLoop$12 = standardRetryStrategy$doTryLoop$1;
                    interfaceC5088Eg3 = interfaceC5088Eg10;
                    function12 = function19;
                    i2 = i4 + 1;
                    interfaceC5093El2 = interfaceC5093El6;
                    dy4 = dy9;
                    Result.Application application222 = Result.Companion;
                    standardRetryStrategy$doTryLoop$12.L$0 = dy4;
                    standardRetryStrategy$doTryLoop$12.L$1 = function12;
                    standardRetryStrategy$doTryLoop$12.L$2 = interfaceC5093El2;
                    standardRetryStrategy$doTryLoop$12.L$3 = interfaceC5088Eg3;
                    standardRetryStrategy$doTryLoop$12.L$4 = null;
                    standardRetryStrategy$doTryLoop$12.L$5 = null;
                    standardRetryStrategy$doTryLoop$12.I$0 = i2;
                    standardRetryStrategy$doTryLoop$12.label = 1;
                    objCopydefault = function12.invoke(standardRetryStrategy$doTryLoop$12);
                    if (objCopydefault == objCopydefault2) {
                    }
                    break;
                case 7:
                    java.lang.Throwable th6 = (java.lang.Throwable) standardRetryStrategy$doTryLoop$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    throw th6;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (RetryCapacityExceededException e4) {
            e = e4;
            objM7377constructorimpl = obj;
            dy3 = dy2;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static /* synthetic */ java.lang.Object OLrzqt(DY dy, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ <R> java.lang.Object EZpvd(DY dy, int i, java.lang.Object obj, AbstractC5091Ej abstractC5091Ej, InterfaceC5093El<? super R> interfaceC5093El, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ <R> java.lang.Object copydefault(DY dy, int i, java.lang.Object obj, AbstractC5091Ej abstractC5091Ej, InterfaceC5093El<? super R> interfaceC5093El, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object OLrzqt(InterfaceC5088Eg interfaceC5088Eg, int i, java.lang.Object obj, Continuation<? super DQ<? extends R>> continuation) throws java.lang.Throwable {
        StandardRetryStrategy$success$1 standardRetryStrategy$success$1;
        if (continuation instanceof StandardRetryStrategy$success$1) {
            standardRetryStrategy$success$1 = (StandardRetryStrategy$success$1) continuation;
            int i2 = standardRetryStrategy$success$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                standardRetryStrategy$success$1.label = i2 - Integer.MIN_VALUE;
            } else {
                standardRetryStrategy$success$1 = new StandardRetryStrategy$success$1(this, continuation);
            }
        }
        java.lang.Object obj2 = standardRetryStrategy$success$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = standardRetryStrategy$success$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj2);
            standardRetryStrategy$success$1.L$0 = obj;
            standardRetryStrategy$success$1.I$0 = i;
            standardRetryStrategy$success$1.label = 1;
            if (interfaceC5088Eg.EZpvd(standardRetryStrategy$success$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = standardRetryStrategy$success$1.I$0;
            obj = standardRetryStrategy$success$1.L$0;
            C56391yDq.AEQbTJ(obj2);
        }
        java.lang.Object obj3 = Result.m7383isFailureimpl(obj) ? null : obj;
        if (obj3 == null) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
            Intrinsics.copydefault(thM7380exceptionOrNullimpl);
            return new DQ.Activity(i, thM7380exceptionOrNullimpl);
        }
        return new DQ.ActionBar(i, obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Void EZpvd(java.lang.Throwable th, int i, Result<? extends R> result) throws java.lang.Throwable {
        java.lang.Object obj;
        java.lang.Throwable thM7380exceptionOrNullimpl = result != null ? Result.m7380exceptionOrNullimpl(result.m7386unboximpl()) : null;
        if (thM7380exceptionOrNullimpl == null) {
            java.lang.String message = th.getMessage();
            Intrinsics.copydefault((java.lang.Object) message);
            if (result != null) {
                java.lang.Object objM7386unboximpl = result.m7386unboximpl();
                obj = Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl;
            }
            throw new TooManyAttemptsException(message, th, i, obj, result != null ? Result.m7380exceptionOrNullimpl(result.m7386unboximpl()) : null);
        }
        throw thM7380exceptionOrNullimpl;
    }

    public final <R> java.lang.Void OLrzqt(int i, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl == null) {
            if (Result.m7383isFailureimpl(obj)) {
                obj = null;
            }
            throw new RetryFailureException("The operation resulted in a non-retryable failure", null, i, obj);
        }
        throw thM7380exceptionOrNullimpl;
    }

    public final <R> java.lang.Void AEQbTJ(int i, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl == null) {
            throw new TooManyAttemptsException("Took more than " + copydefault().EZpvd() + " attempts to get a successful response", null, i, Result.m7383isFailureimpl(obj) ? null : obj, Result.m7380exceptionOrNullimpl(obj));
        }
        throw thM7380exceptionOrNullimpl;
    }

    public static class TaskDescription implements DW.Application {
        public static final Activity OLrzqt = new Activity(null);
        public final int AYXKKw;
        public final InterfaceC5087Ef AhwBna;
        public final InterfaceC5086Ee copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DW.Application
        public int EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC5086Ee copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC5087Ef djBIcL() {
            return this.AhwBna;
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DY.TaskDescription.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final TaskDescription OLrzqt() {
                return new TaskDescription(new ActionBar());
            }
        }

        public TaskDescription(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.copydefault = actionBar.OLrzqt().EZpvd().invoke();
            this.AYXKKw = actionBar.EZpvd();
            this.AhwBna = actionBar.copydefault().EZpvd().invoke();
        }

        @Override // o.DW.Application
        public Function1<DW.Application.ActionBar, Unit> OLrzqt() {
            return new Function1<DW.Application.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$Config$toBuilderApplicator$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DW.Application.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DW.Application.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                    if (actionBar instanceof DY.TaskDescription.ActionBar) {
                        DY.TaskDescription.ActionBar actionBar2 = (DY.TaskDescription.ActionBar) actionBar;
                        actionBar2.KWHzl(this.this$0.copydefault());
                        actionBar.EZpvd(this.this$0.EZpvd());
                        actionBar2.AEQbTJ(this.this$0.djBIcL());
                    }
                }
            };
        }

        public static class ActionBar implements DW.Application.ActionBar {
            public final HC<InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, InterfaceC5086Ee> AEQbTJ = new HC<>(C5085Ed.KWHzl, new Function1<InterfaceC5086Ee, Function1<? super InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, ? extends Unit>>() { // from class: aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$Config$Builder$delayProviderProperty$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Function1<InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, Unit> invoke(@NotNull InterfaceC5086Ee interfaceC5086Ee) {
                    Intrinsics.checkNotNullParameter(interfaceC5086Ee, "");
                    return interfaceC5086Ee.AEQbTJ().OLrzqt();
                }
            }, null, 4, null);
            public int copydefault = 3;
            public final HC<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, InterfaceC5087Ef> OLrzqt = new HC<>(C5089Eh.OLrzqt, new Function1<InterfaceC5087Ef, Function1<? super InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, ? extends Unit>>() { // from class: aws.smithy.kotlin.runtime.retries.StandardRetryStrategy$Config$Builder$tokenBucketProperty$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Function1<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, Unit> invoke(@NotNull InterfaceC5087Ef interfaceC5087Ef) {
                    Intrinsics.checkNotNullParameter(interfaceC5087Ef, "");
                    return interfaceC5087Ef.OLrzqt().EZpvd();
                }
            }, null, 4, null);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.DW.Application.ActionBar
            public void EZpvd(int i) {
                this.copydefault = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HC<InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, InterfaceC5086Ee> OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HC<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, InterfaceC5087Ef> copydefault() {
                return this.OLrzqt;
            }

            public final void KWHzl(InterfaceC5086Ee interfaceC5086Ee) {
                this.AEQbTJ.OLrzqt(interfaceC5086Ee);
            }

            public final void AEQbTJ(@NotNull Function1<? super C5085Ed.TaskDescription.Activity, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.AEQbTJ.OLrzqt(C5085Ed.KWHzl, function1);
            }

            public final void AEQbTJ(InterfaceC5087Ef interfaceC5087Ef) {
                this.OLrzqt.OLrzqt(interfaceC5087Ef);
            }
        }
    }
}
