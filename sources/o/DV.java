package o;

import androidx.camera.video.AudioStats;
import aws.smithy.kotlin.runtime.retries.delay.AdaptiveRateLimiter$acquire$1;
import aws.smithy.kotlin.runtime.retries.delay.AdaptiveRateLimiter$update$1;
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
import o.C59462zhW;
import o.DV;
import o.InterfaceC5084Ec;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DV implements InterfaceC5084Ec {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public double AEQbTJ;
    public final DZ AYXKKw;
    public double AhwBna;
    public double KWHzl;
    public final Application OLrzqt;
    public TimeMark copydefault;
    public final C5083Eb djBIcL;
    public final InterfaceC59524zif gEmmrt;
    public final Mutex valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/Ec$Application; */
    @Override // o.InterfaceC5084Ec
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application EZpvd() {
        return this.OLrzqt;
    }

    public DV(@NotNull Application application, @NotNull InterfaceC59524zif interfaceC59524zif, @NotNull DZ dz, @NotNull C5083Eb c5083Eb) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interfaceC59524zif, "");
        Intrinsics.checkNotNullParameter(dz, "");
        Intrinsics.checkNotNullParameter(c5083Eb, "");
        this.OLrzqt = application;
        this.gEmmrt = interfaceC59524zif;
        this.AYXKKw = dz;
        this.djBIcL = c5083Eb;
        this.valueOf = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DV(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        InterfaceC59524zif.StateListAnimator stateListAnimator = InterfaceC59524zif.StateListAnimator.AEQbTJ;
        this(application, stateListAnimator, new DZ(application, stateListAnimator, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 28, null), new C5083Eb(application, stateListAnimator, AudioStats.AUDIO_AMPLITUDE_NONE, null, 12, null));
    }

    public static final class StateListAnimator implements InterfaceC5185Hz<Application.C0799Application, DV> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object; */
        @Override // o.InterfaceC5185Hz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public DV OLrzqt(@NotNull Function1<? super Application.C0799Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application.C0799Application c0799Application = new Application.C0799Application();
            function1.invoke(c0799Application);
            return new DV(new Application(c0799Application));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5084Ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdaptiveRateLimiter$acquire$1 adaptiveRateLimiter$acquire$1;
        Mutex mutex;
        DV dv;
        java.lang.Throwable th;
        Mutex mutex2;
        DV dv2;
        if (continuation instanceof AdaptiveRateLimiter$acquire$1) {
            adaptiveRateLimiter$acquire$1 = (AdaptiveRateLimiter$acquire$1) continuation;
            int i2 = adaptiveRateLimiter$acquire$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adaptiveRateLimiter$acquire$1.label = i2 - Integer.MIN_VALUE;
            } else {
                adaptiveRateLimiter$acquire$1 = new AdaptiveRateLimiter$acquire$1(this, continuation);
            }
        }
        java.lang.Object obj = adaptiveRateLimiter$acquire$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = adaptiveRateLimiter$acquire$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.valueOf;
                adaptiveRateLimiter$acquire$1.L$0 = this;
                adaptiveRateLimiter$acquire$1.L$1 = mutex;
                adaptiveRateLimiter$acquire$1.I$0 = i;
                adaptiveRateLimiter$acquire$1.label = 1;
                if (mutex.lock(null, adaptiveRateLimiter$acquire$1) == objCopydefault) {
                    return objCopydefault;
                }
                dv = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) adaptiveRateLimiter$acquire$1.L$1;
                    dv2 = (DV) adaptiveRateLimiter$acquire$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        dv2.KWHzl = AudioStats.AUDIO_AMPLITUDE_NONE;
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
                i = adaptiveRateLimiter$acquire$1.I$0;
                mutex = (Mutex) adaptiveRateLimiter$acquire$1.L$1;
                dv = (DV) adaptiveRateLimiter$acquire$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (dv.djBIcL.OLrzqt()) {
                dv.KWHzl();
                double d = i;
                double d2 = dv.KWHzl;
                if (d <= d2) {
                    dv.KWHzl = d2 - d;
                } else {
                    C59462zhW.Activity activity = C59462zhW.OLrzqt;
                    long jOLrzqt = C59519zia.OLrzqt((d - d2) / dv.AhwBna, DurationUnit.SECONDS);
                    adaptiveRateLimiter$acquire$1.L$0 = dv;
                    adaptiveRateLimiter$acquire$1.L$1 = mutex;
                    adaptiveRateLimiter$acquire$1.label = 2;
                    if (DelayKt.m7393delayVtjQ1oo(jOLrzqt, adaptiveRateLimiter$acquire$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutex2 = mutex;
                    dv2 = dv;
                    dv2.KWHzl = AudioStats.AUDIO_AMPLITUDE_NONE;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
            }
            mutex2 = mutex;
            Unit unit22 = Unit.INSTANCE;
            mutex2.unlock(null);
            return unit22;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    public final void KWHzl() {
        TimeMark timeMark = this.copydefault;
        if (timeMark != null) {
            double dEZpvd = C59462zhW.EZpvd(timeMark.copydefault(), DurationUnit.SECONDS);
            this.KWHzl = java.lang.Math.min(this.AEQbTJ, this.KWHzl + (this.AhwBna * dEZpvd));
        }
        this.copydefault = this.gEmmrt.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5084Ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(RetryErrorType retryErrorType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdaptiveRateLimiter$update$1 adaptiveRateLimiter$update$1;
        DV dv;
        RetryErrorType retryErrorType2;
        Mutex mutex;
        if (continuation instanceof AdaptiveRateLimiter$update$1) {
            adaptiveRateLimiter$update$1 = (AdaptiveRateLimiter$update$1) continuation;
            int i = adaptiveRateLimiter$update$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adaptiveRateLimiter$update$1.label = i - Integer.MIN_VALUE;
            } else {
                adaptiveRateLimiter$update$1 = new AdaptiveRateLimiter$update$1(this, continuation);
            }
        }
        java.lang.Object obj = adaptiveRateLimiter$update$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adaptiveRateLimiter$update$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.valueOf;
            adaptiveRateLimiter$update$1.L$0 = this;
            adaptiveRateLimiter$update$1.L$1 = retryErrorType;
            adaptiveRateLimiter$update$1.L$2 = mutex2;
            adaptiveRateLimiter$update$1.label = 1;
            if (mutex2.lock(null, adaptiveRateLimiter$update$1) == objCopydefault) {
                return objCopydefault;
            }
            dv = this;
            retryErrorType2 = retryErrorType;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) adaptiveRateLimiter$update$1.L$2;
            RetryErrorType retryErrorType3 = (RetryErrorType) adaptiveRateLimiter$update$1.L$1;
            dv = (DV) adaptiveRateLimiter$update$1.L$0;
            C56391yDq.AEQbTJ(obj);
            retryErrorType2 = retryErrorType3;
        }
        try {
            double dCopydefault = dv.AYXKKw.copydefault();
            dv.AEQbTJ(java.lang.Math.min(dv.djBIcL.KWHzl(retryErrorType2, dCopydefault, dv.AhwBna), ((double) 2) * dCopydefault));
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    public final void AEQbTJ(double d) {
        KWHzl();
        this.AhwBna = java.lang.Math.max(d, EZpvd().AEQbTJ());
        double dMax = java.lang.Math.max(d, EZpvd().KWHzl());
        this.AEQbTJ = dMax;
        this.KWHzl = java.lang.Math.min(this.KWHzl, dMax);
    }

    public static final class Application implements InterfaceC5084Ec.Application {
        public static final StateListAnimator KWHzl = new StateListAnimator(null);
        public static final Application OLrzqt = new Application(new C0799Application());
        public final long AEQbTJ;
        public final double AYXKKw;
        public final double AhwBna;
        public final double EZpvd;
        public final double copydefault;
        public final double valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double djBIcL() {
            return this.AYXKKw;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DV.Application.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }

        public Application(@NotNull C0799Application c0799Application) {
            Intrinsics.checkNotNullParameter(c0799Application, "");
            this.copydefault = c0799Application.AEQbTJ();
            this.AEQbTJ = c0799Application.KWHzl();
            this.EZpvd = c0799Application.EZpvd();
            this.valueOf = c0799Application.copydefault();
            this.AhwBna = c0799Application.OLrzqt();
            this.AYXKKw = c0799Application.AhwBna();
        }

        @Override // o.InterfaceC5084Ec.Application
        public Function1<InterfaceC5084Ec.Application.TaskDescription, Unit> AYXKKw() {
            return new Function1<InterfaceC5084Ec.Application.TaskDescription, Unit>() { // from class: aws.smithy.kotlin.runtime.retries.delay.AdaptiveRateLimiter$Config$toBuilderApplicator$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5084Ec.Application.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5084Ec.Application.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    if (taskDescription instanceof DV.Application.C0799Application) {
                        DV.Application.C0799Application c0799Application = (DV.Application.C0799Application) taskDescription;
                        c0799Application.EZpvd(this.this$0.copydefault());
                        c0799Application.AEQbTJ(this.this$0.OLrzqt());
                        c0799Application.KWHzl(this.this$0.KWHzl());
                        c0799Application.AEQbTJ(this.this$0.AEQbTJ());
                        c0799Application.OLrzqt(this.this$0.EZpvd());
                        c0799Application.copydefault(this.this$0.djBIcL());
                    }
                }
            };
        }

        /* JADX INFO: renamed from: o.DV$Application$Application, reason: collision with other inner class name */
        public static final class C0799Application implements InterfaceC5084Ec.Application.TaskDescription {
            public long AEQbTJ;
            public double EZpvd;
            public double KWHzl;
            public double OLrzqt = 0.7d;
            public double copydefault;
            public double gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(double d) {
                this.copydefault = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(long j) {
                this.AEQbTJ = j;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(double d) {
                this.OLrzqt = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void KWHzl(double d) {
                this.EZpvd = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void OLrzqt(double d) {
                this.KWHzl = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(double d) {
                this.gEmmrt = d;
            }

            public C0799Application() {
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                this.AEQbTJ = C59519zia.OLrzqt(0.5d, DurationUnit.SECONDS);
                this.EZpvd = 1.0d;
                this.copydefault = 0.5d;
                this.KWHzl = 0.4d;
                this.gEmmrt = 0.8d;
            }
        }
    }
}
