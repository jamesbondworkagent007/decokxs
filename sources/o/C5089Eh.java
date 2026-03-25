package o;

import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import aws.smithy.kotlin.runtime.retries.delay.StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1;
import aws.smithy.kotlin.runtime.retries.delay.StandardRetryTokenBucket$acquireToken$1;
import aws.smithy.kotlin.runtime.retries.delay.StandardRetryTokenBucket$checkoutCapacity$1;
import aws.smithy.kotlin.runtime.retries.delay.StandardRetryTokenBucket$returnCapacity$1;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C5089Eh;
import o.C59462zhW;
import o.InterfaceC5087Ef;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5089Eh implements InterfaceC5087Ef {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final Mutex AEQbTJ;
    public int EZpvd;
    public TimeMark KWHzl;
    public final Activity copydefault;
    public final InterfaceC59524zif valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/Ef$StateListAnimator; */
    @Override // o.InterfaceC5087Ef
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity OLrzqt() {
        return this.copydefault;
    }

    public C5089Eh(@NotNull Activity activity, @NotNull InterfaceC59524zif interfaceC59524zif) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(interfaceC59524zif, "");
        this.copydefault = activity;
        this.valueOf = interfaceC59524zif;
        this.EZpvd = OLrzqt().KWHzl();
        this.KWHzl = interfaceC59524zif.KWHzl();
        this.AEQbTJ = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5089Eh(@NotNull Activity activity) {
        this(activity, InterfaceC59524zif.StateListAnimator.AEQbTJ);
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX INFO: renamed from: o.Eh$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5185Hz<Activity.C0802Activity, C5089Eh> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Eh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object; */
        @Override // o.InterfaceC5185Hz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public C5089Eh OLrzqt(@NotNull Function1<? super Activity.C0802Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity.C0802Activity c0802Activity = new Activity.C0802Activity();
            function1.invoke(c0802Activity);
            return new C5089Eh(new Activity(c0802Activity));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5087Ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super InterfaceC5088Eg> continuation) throws java.lang.Throwable {
        StandardRetryTokenBucket$acquireToken$1 standardRetryTokenBucket$acquireToken$1;
        C5089Eh c5089Eh;
        if (continuation instanceof StandardRetryTokenBucket$acquireToken$1) {
            standardRetryTokenBucket$acquireToken$1 = (StandardRetryTokenBucket$acquireToken$1) continuation;
            int i = standardRetryTokenBucket$acquireToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                standardRetryTokenBucket$acquireToken$1.label = i - Integer.MIN_VALUE;
            } else {
                standardRetryTokenBucket$acquireToken$1 = new StandardRetryTokenBucket$acquireToken$1(this, continuation);
            }
        }
        java.lang.Object obj = standardRetryTokenBucket$acquireToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = standardRetryTokenBucket$acquireToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int iAEQbTJ = OLrzqt().AEQbTJ();
            standardRetryTokenBucket$acquireToken$1.L$0 = this;
            standardRetryTokenBucket$acquireToken$1.label = 1;
            if (KWHzl(iAEQbTJ, standardRetryTokenBucket$acquireToken$1) == objCopydefault) {
                return objCopydefault;
            }
            c5089Eh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5089Eh = (C5089Eh) standardRetryTokenBucket$acquireToken$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return c5089Eh.new TaskDescription(c5089Eh.OLrzqt().OLrzqt());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        StandardRetryTokenBucket$checkoutCapacity$1 standardRetryTokenBucket$checkoutCapacity$1;
        Mutex mutex;
        C5089Eh c5089Eh;
        java.lang.Throwable th;
        Mutex mutex2;
        C5089Eh c5089Eh2;
        if (continuation instanceof StandardRetryTokenBucket$checkoutCapacity$1) {
            standardRetryTokenBucket$checkoutCapacity$1 = (StandardRetryTokenBucket$checkoutCapacity$1) continuation;
            int i2 = standardRetryTokenBucket$checkoutCapacity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                standardRetryTokenBucket$checkoutCapacity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                standardRetryTokenBucket$checkoutCapacity$1 = new StandardRetryTokenBucket$checkoutCapacity$1(this, continuation);
            }
        }
        java.lang.Object obj = standardRetryTokenBucket$checkoutCapacity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = standardRetryTokenBucket$checkoutCapacity$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.AEQbTJ;
                standardRetryTokenBucket$checkoutCapacity$1.L$0 = this;
                standardRetryTokenBucket$checkoutCapacity$1.L$1 = mutex;
                standardRetryTokenBucket$checkoutCapacity$1.I$0 = i;
                standardRetryTokenBucket$checkoutCapacity$1.label = 1;
                if (mutex.lock(null, standardRetryTokenBucket$checkoutCapacity$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5089Eh = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) standardRetryTokenBucket$checkoutCapacity$1.L$1;
                    c5089Eh2 = (C5089Eh) standardRetryTokenBucket$checkoutCapacity$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        c5089Eh2.EZpvd = 0;
                        c5089Eh = c5089Eh2;
                        c5089Eh.KWHzl = c5089Eh.valueOf.KWHzl();
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                i = standardRetryTokenBucket$checkoutCapacity$1.I$0;
                mutex = (Mutex) standardRetryTokenBucket$checkoutCapacity$1.L$1;
                c5089Eh = (C5089Eh) standardRetryTokenBucket$checkoutCapacity$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            c5089Eh.EZpvd();
            int i4 = c5089Eh.EZpvd;
            if (i <= i4) {
                c5089Eh.EZpvd = i4 - i;
                mutex2 = mutex;
                c5089Eh.KWHzl = c5089Eh.valueOf.KWHzl();
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            }
            if (c5089Eh.OLrzqt().djBIcL()) {
                throw new RetryCapacityExceededException("Insufficient capacity to attempt another retry");
            }
            int i5 = c5089Eh.EZpvd;
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jOLrzqt = C59519zia.OLrzqt(java.lang.Math.ceil(((double) (i - i5)) / ((double) c5089Eh.OLrzqt().copydefault())), DurationUnit.SECONDS);
            standardRetryTokenBucket$checkoutCapacity$1.L$0 = c5089Eh;
            standardRetryTokenBucket$checkoutCapacity$1.L$1 = mutex;
            standardRetryTokenBucket$checkoutCapacity$1.label = 2;
            if (DelayKt.m7393delayVtjQ1oo(jOLrzqt, standardRetryTokenBucket$checkoutCapacity$1) == objCopydefault) {
                return objCopydefault;
            }
            mutex2 = mutex;
            c5089Eh2 = c5089Eh;
            c5089Eh2.EZpvd = 0;
            c5089Eh = c5089Eh2;
            c5089Eh.KWHzl = c5089Eh.valueOf.KWHzl();
            Unit unit22 = Unit.INSTANCE;
            mutex2.unlock(null);
            return unit22;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    public final void EZpvd() {
        this.EZpvd = java.lang.Math.min(OLrzqt().KWHzl(), this.EZpvd + ((int) java.lang.Math.floor(((double) OLrzqt().copydefault()) * C59462zhW.EZpvd(this.KWHzl.copydefault(), DurationUnit.SECONDS))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        StandardRetryTokenBucket$returnCapacity$1 standardRetryTokenBucket$returnCapacity$1;
        C5089Eh c5089Eh;
        Mutex mutex;
        if (continuation instanceof StandardRetryTokenBucket$returnCapacity$1) {
            standardRetryTokenBucket$returnCapacity$1 = (StandardRetryTokenBucket$returnCapacity$1) continuation;
            int i2 = standardRetryTokenBucket$returnCapacity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                standardRetryTokenBucket$returnCapacity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                standardRetryTokenBucket$returnCapacity$1 = new StandardRetryTokenBucket$returnCapacity$1(this, continuation);
            }
        }
        java.lang.Object obj = standardRetryTokenBucket$returnCapacity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = standardRetryTokenBucket$returnCapacity$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.AEQbTJ;
            standardRetryTokenBucket$returnCapacity$1.L$0 = this;
            standardRetryTokenBucket$returnCapacity$1.L$1 = mutex2;
            standardRetryTokenBucket$returnCapacity$1.I$0 = i;
            standardRetryTokenBucket$returnCapacity$1.label = 1;
            if (mutex2.lock(null, standardRetryTokenBucket$returnCapacity$1) == objCopydefault) {
                return objCopydefault;
            }
            c5089Eh = this;
            mutex = mutex2;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = standardRetryTokenBucket$returnCapacity$1.I$0;
            mutex = (Mutex) standardRetryTokenBucket$returnCapacity$1.L$1;
            c5089Eh = (C5089Eh) standardRetryTokenBucket$returnCapacity$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            c5089Eh.EZpvd();
            c5089Eh.EZpvd = java.lang.Math.min(c5089Eh.OLrzqt().KWHzl(), c5089Eh.EZpvd + i);
            c5089Eh.KWHzl = c5089Eh.valueOf.KWHzl();
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: renamed from: o.Eh$TaskDescription */
    public final class TaskDescription implements InterfaceC5088Eg {
        public final int copydefault;

        /* JADX INFO: renamed from: o.Eh$TaskDescription$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[RetryErrorType.values().length];
                try {
                    iArr[RetryErrorType.Transient.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[RetryErrorType.Throttling.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        public TaskDescription(int i) {
            this.copydefault = i;
        }

        @Override // o.InterfaceC5088Eg
        public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC5088Eg
        public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            java.lang.Object objOLrzqt = C5089Eh.this.OLrzqt(this.copydefault, continuation);
            return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.InterfaceC5088Eg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object copydefault(@NotNull RetryErrorType retryErrorType, @NotNull Continuation<? super InterfaceC5088Eg> continuation) throws java.lang.Throwable {
            StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1 standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1;
            int iAYXKKw;
            TaskDescription taskDescription;
            if (continuation instanceof StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1) {
                standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1 = (StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1) continuation;
                int i = standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.label = i - Integer.MIN_VALUE;
                } else {
                    standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1 = new StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1(this, continuation);
                }
            }
            java.lang.Object obj = standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int i3 = StateListAnimator.AEQbTJ[retryErrorType.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    iAYXKKw = C5089Eh.this.OLrzqt().AYXKKw();
                } else {
                    iAYXKKw = C5089Eh.this.OLrzqt().valueOf();
                }
                C5089Eh c5089Eh = C5089Eh.this;
                standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.L$0 = this;
                standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.I$0 = iAYXKKw;
                standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.label = 1;
                if (c5089Eh.KWHzl(iAYXKKw, standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1) == objCopydefault) {
                    return objCopydefault;
                }
                taskDescription = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iAYXKKw = standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.I$0;
                taskDescription = (TaskDescription) standardRetryTokenBucket$StandardRetryToken$scheduleRetry$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C5089Eh.this.new TaskDescription(iAYXKKw);
        }
    }

    /* JADX INFO: renamed from: o.Eh$Activity */
    public static final class Activity implements InterfaceC5087Ef.StateListAnimator {
        public static final TaskDescription AEQbTJ = new TaskDescription(null);
        public static final Activity EZpvd = new Activity(new C0802Activity());
        public final boolean AYXKKw;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final int djBIcL;
        public final int gEmmrt;
        public final int valueOf;

        /* JADX INFO: renamed from: o.Eh$Activity$Activity, reason: collision with other inner class name */
        public static final class C0802Activity implements InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator {
            public int EZpvd;
            public int copydefault;
            public boolean gEmmrt = true;
            public int KWHzl = 1;
            public int AEQbTJ = 500;
            public int OLrzqt = 5;
            public int valueOf = 10;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(int i) {
                if (i == 0) {
                    this.gEmmrt = true;
                }
                this.EZpvd = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(boolean z) {
                this.gEmmrt = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AYXKKw(int i) {
                this.valueOf = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AYXKKw() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(int i) {
                this.AEQbTJ = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void KWHzl(int i) {
                this.OLrzqt = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void OLrzqt(int i) {
                this.KWHzl = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(int i) {
                this.copydefault = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int gEmmrt() {
                return this.valueOf;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.djBIcL;
        }

        /* JADX INFO: renamed from: o.Eh$Activity$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Eh.Activity.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        public Activity(@NotNull C0802Activity c0802Activity) {
            Intrinsics.checkNotNullParameter(c0802Activity, "");
            this.AYXKKw = c0802Activity.AYXKKw();
            this.copydefault = c0802Activity.KWHzl();
            this.OLrzqt = c0802Activity.copydefault();
            this.KWHzl = c0802Activity.OLrzqt();
            this.gEmmrt = c0802Activity.AEQbTJ();
            this.djBIcL = c0802Activity.EZpvd();
            this.valueOf = c0802Activity.gEmmrt();
        }

        @Override // o.InterfaceC5087Ef.StateListAnimator
        public Function1<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, Unit> EZpvd() {
            return new Function1<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, Unit>() { // from class: aws.smithy.kotlin.runtime.retries.delay.StandardRetryTokenBucket$Config$toBuilderApplicator$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator interfaceC0801StateListAnimator) {
                    invoke2(interfaceC0801StateListAnimator);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator interfaceC0801StateListAnimator) {
                    Intrinsics.checkNotNullParameter(interfaceC0801StateListAnimator, "");
                    if (interfaceC0801StateListAnimator instanceof C5089Eh.Activity.C0802Activity) {
                        C5089Eh.Activity.C0802Activity c0802Activity = (C5089Eh.Activity.C0802Activity) interfaceC0801StateListAnimator;
                        c0802Activity.AEQbTJ(this.this$0.djBIcL());
                        c0802Activity.copydefault(this.this$0.AEQbTJ());
                        c0802Activity.OLrzqt(this.this$0.OLrzqt());
                        c0802Activity.EZpvd(this.this$0.KWHzl());
                        c0802Activity.AEQbTJ(this.this$0.copydefault());
                        c0802Activity.KWHzl(this.this$0.valueOf());
                        c0802Activity.AYXKKw(this.this$0.AYXKKw());
                    }
                }
            };
        }
    }
}
