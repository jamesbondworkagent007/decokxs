package o;

import aws.smithy.kotlin.runtime.retries.AdaptiveRetryStrategy$afterTry$1;
import aws.smithy.kotlin.runtime.retries.AdaptiveRetryStrategy$beforeInitialTry$1;
import aws.smithy.kotlin.runtime.retries.AdaptiveRetryStrategy$beforeRetry$1;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import o.DY;
import o.InterfaceC5084Ec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DR extends DY {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final Activity OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/DY$TaskDescription; */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/DW$Application; */
    @Override // o.DY, o.DW
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity copydefault() {
        return this.OLrzqt;
    }

    public static final class TaskDescription implements InterfaceC5185Hz<Activity.TaskDescription, DR> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object; */
        @Override // o.InterfaceC5185Hz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public DR OLrzqt(@NotNull Function1<? super Activity.TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity.TaskDescription taskDescription = new Activity.TaskDescription();
            function1.invoke(taskDescription);
            return new DR(new Activity(taskDescription));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DR(@NotNull Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.DR$Activity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.DR$Activity:0x0006: INVOKE (wrap:o.DR$Activity$Activity:0x0004: SGET  A[WRAPPED] (LINE:23) o.DR.Activity.KWHzl o.DR$Activity$Activity) VIRTUAL call: o.DR.Activity.Activity.copydefault():o.DR$Activity A[MD:():o.DR$Activity (m), WRAPPED] (LINE:23)) : (r1v0 o.DR$Activity))
 A[MD:(o.DR$Activity):void (m)] (LINE:23) call: o.DR.<init>(o.DR$Activity):void type: THIS */
    public /* synthetic */ DR(Activity activity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Activity.KWHzl.copydefault() : activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.DY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdaptiveRetryStrategy$beforeInitialTry$1 adaptiveRetryStrategy$beforeInitialTry$1;
        DR dr;
        if (continuation instanceof AdaptiveRetryStrategy$beforeInitialTry$1) {
            adaptiveRetryStrategy$beforeInitialTry$1 = (AdaptiveRetryStrategy$beforeInitialTry$1) continuation;
            int i = adaptiveRetryStrategy$beforeInitialTry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adaptiveRetryStrategy$beforeInitialTry$1.label = i - Integer.MIN_VALUE;
            } else {
                adaptiveRetryStrategy$beforeInitialTry$1 = new AdaptiveRetryStrategy$beforeInitialTry$1(this, continuation);
            }
        }
        java.lang.Object obj = adaptiveRetryStrategy$beforeInitialTry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adaptiveRetryStrategy$beforeInitialTry$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            adaptiveRetryStrategy$beforeInitialTry$1.L$0 = this;
            adaptiveRetryStrategy$beforeInitialTry$1.label = 1;
            if (super.AEQbTJ(adaptiveRetryStrategy$beforeInitialTry$1) == objCopydefault) {
                return objCopydefault;
            }
            dr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            dr = (DR) adaptiveRetryStrategy$beforeInitialTry$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC5084Ec interfaceC5084EcAEQbTJ = dr.copydefault().AEQbTJ();
        adaptiveRetryStrategy$beforeInitialTry$1.L$0 = null;
        adaptiveRetryStrategy$beforeInitialTry$1.label = 2;
        if (interfaceC5084EcAEQbTJ.copydefault(1, adaptiveRetryStrategy$beforeInitialTry$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.DY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> java.lang.Object AEQbTJ(int i, @NotNull java.lang.Object obj, @NotNull AbstractC5091Ej abstractC5091Ej, @NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdaptiveRetryStrategy$afterTry$1 adaptiveRetryStrategy$afterTry$1;
        DR dr;
        if (continuation instanceof AdaptiveRetryStrategy$afterTry$1) {
            adaptiveRetryStrategy$afterTry$1 = (AdaptiveRetryStrategy$afterTry$1) continuation;
            int i2 = adaptiveRetryStrategy$afterTry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adaptiveRetryStrategy$afterTry$1.label = i2 - Integer.MIN_VALUE;
            } else {
                adaptiveRetryStrategy$afterTry$1 = new AdaptiveRetryStrategy$afterTry$1(this, continuation);
            }
        }
        java.lang.Object obj2 = adaptiveRetryStrategy$afterTry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = adaptiveRetryStrategy$afterTry$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj2);
            adaptiveRetryStrategy$afterTry$1.L$0 = this;
            adaptiveRetryStrategy$afterTry$1.L$1 = abstractC5091Ej;
            adaptiveRetryStrategy$afterTry$1.label = 1;
            if (super.AEQbTJ(i, obj, abstractC5091Ej, interfaceC5093El, adaptiveRetryStrategy$afterTry$1) == objCopydefault) {
                return objCopydefault;
            }
            dr = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            }
            abstractC5091Ej = (AbstractC5091Ej) adaptiveRetryStrategy$afterTry$1.L$1;
            dr = (DR) adaptiveRetryStrategy$afterTry$1.L$0;
            C56391yDq.AEQbTJ(obj2);
        }
        AbstractC5091Ej.StateListAnimator stateListAnimator = abstractC5091Ej instanceof AbstractC5091Ej.StateListAnimator ? (AbstractC5091Ej.StateListAnimator) abstractC5091Ej : null;
        RetryErrorType retryErrorTypeKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
        InterfaceC5084Ec interfaceC5084EcAEQbTJ = dr.copydefault().AEQbTJ();
        adaptiveRetryStrategy$afterTry$1.L$0 = null;
        adaptiveRetryStrategy$afterTry$1.L$1 = null;
        adaptiveRetryStrategy$afterTry$1.label = 2;
        if (interfaceC5084EcAEQbTJ.EZpvd(retryErrorTypeKWHzl, adaptiveRetryStrategy$afterTry$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.DY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> java.lang.Object EZpvd(int i, @NotNull java.lang.Object obj, @NotNull AbstractC5091Ej abstractC5091Ej, @NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdaptiveRetryStrategy$beforeRetry$1 adaptiveRetryStrategy$beforeRetry$1;
        DR dr;
        if (continuation instanceof AdaptiveRetryStrategy$beforeRetry$1) {
            adaptiveRetryStrategy$beforeRetry$1 = (AdaptiveRetryStrategy$beforeRetry$1) continuation;
            int i2 = adaptiveRetryStrategy$beforeRetry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adaptiveRetryStrategy$beforeRetry$1.label = i2 - Integer.MIN_VALUE;
            } else {
                adaptiveRetryStrategy$beforeRetry$1 = new AdaptiveRetryStrategy$beforeRetry$1(this, continuation);
            }
        }
        java.lang.Object obj2 = adaptiveRetryStrategy$beforeRetry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = adaptiveRetryStrategy$beforeRetry$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj2);
            adaptiveRetryStrategy$beforeRetry$1.L$0 = this;
            adaptiveRetryStrategy$beforeRetry$1.label = 1;
            if (super.EZpvd(i, obj, abstractC5091Ej, interfaceC5093El, adaptiveRetryStrategy$beforeRetry$1) == objCopydefault) {
                return objCopydefault;
            }
            dr = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            }
            dr = (DR) adaptiveRetryStrategy$beforeRetry$1.L$0;
            C56391yDq.AEQbTJ(obj2);
        }
        InterfaceC5084Ec interfaceC5084EcAEQbTJ = dr.copydefault().AEQbTJ();
        adaptiveRetryStrategy$beforeRetry$1.L$0 = null;
        adaptiveRetryStrategy$beforeRetry$1.label = 2;
        if (interfaceC5084EcAEQbTJ.copydefault(1, adaptiveRetryStrategy$beforeRetry$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static final class Activity extends DY.TaskDescription {
        public final InterfaceC5084Ec AEQbTJ;
        public static final C0798Activity KWHzl = new C0798Activity(null);
        public static final Activity EZpvd = new Activity(new TaskDescription());

        public static final class TaskDescription extends DY.TaskDescription.ActionBar {
            public final HC<InterfaceC5084Ec.Application.TaskDescription, InterfaceC5084Ec> KWHzl = new HC<>(DV.EZpvd, new Function1<InterfaceC5084Ec, Function1<? super InterfaceC5084Ec.Application.TaskDescription, ? extends Unit>>() { // from class: aws.smithy.kotlin.runtime.retries.AdaptiveRetryStrategy$Config$Builder$rateLimiterProperty$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Function1<InterfaceC5084Ec.Application.TaskDescription, Unit> invoke(@NotNull InterfaceC5084Ec interfaceC5084Ec) {
                    Intrinsics.checkNotNullParameter(interfaceC5084Ec, "");
                    return interfaceC5084Ec.EZpvd().AYXKKw();
                }
            }, null, 4, null);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HC<InterfaceC5084Ec.Application.TaskDescription, InterfaceC5084Ec> AEQbTJ() {
                return this.KWHzl;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC5084Ec AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX INFO: renamed from: o.DR$Activity$Activity, reason: collision with other inner class name */
        public static final class C0798Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DR.Activity.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0798Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0798Activity() {
            }

            public final Activity copydefault() {
                return Activity.EZpvd;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull TaskDescription taskDescription) {
            super(taskDescription);
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.AEQbTJ = taskDescription.AEQbTJ().EZpvd().invoke();
        }
    }
}
