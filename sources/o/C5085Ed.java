package o;

import androidx.camera.video.AudioStats;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import o.C5085Ed;
import o.C59462zhW;
import o.InterfaceC5086Ee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5085Ed implements InterfaceC5086Ee {
    public static final Activity KWHzl = new Activity(null);
    public final Random.Default AEQbTJ;
    public final TaskDescription copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5085Ed() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Ee$ActionBar; */
    @Override // o.InterfaceC5086Ee
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription AEQbTJ() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.Ed$Activity */
    public static final class Activity implements InterfaceC5185Hz<TaskDescription.Activity, C5085Ed> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ed.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object; */
        @Override // o.InterfaceC5185Hz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C5085Ed OLrzqt(@NotNull Function1<? super TaskDescription.Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new C5085Ed(TaskDescription.AEQbTJ.KWHzl(function1));
        }
    }

    public C5085Ed(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault = taskDescription;
        this.AEQbTJ = kotlin.random.Random.Default;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.Ed$TaskDescription:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Ed$TaskDescription:0x0006: INVOKE 
  (wrap:o.Ed$TaskDescription$Application:0x0004: SGET  A[WRAPPED] (LINE:31) o.Ed.TaskDescription.AEQbTJ o.Ed$TaskDescription$Application)
 VIRTUAL call: o.Ed.TaskDescription.Application.AEQbTJ():o.Ed$TaskDescription A[MD:():o.Ed$TaskDescription (m), WRAPPED] (LINE:31)) : (r1v0 o.Ed$TaskDescription))
 A[MD:(o.Ed$TaskDescription):void (m)] (LINE:31) call: o.Ed.<init>(o.Ed$TaskDescription):void type: THIS */
    public /* synthetic */ C5085Ed(TaskDescription taskDescription, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaskDescription.AEQbTJ.AEQbTJ() : taskDescription);
    }

    @Override // o.InterfaceC5086Ee
    public java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Unit> continuation) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(("attempt was " + i + " but must be greater than 0").toString());
        }
        double dMin = java.lang.Math.min(C59462zhW.gEmmrt(AEQbTJ().KWHzl()) * java.lang.Math.pow(AEQbTJ().AhwBna(), i - 1), C59462zhW.EZpvd(AEQbTJ().EZpvd(), DurationUnit.MILLISECONDS));
        double dAEQbTJ = AEQbTJ().AEQbTJ();
        double dNextDouble = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            dNextDouble = this.AEQbTJ.nextDouble(AEQbTJ().AEQbTJ());
        }
        java.lang.Object objDelay = DelayKt.delay((long) (dMin * (1.0d - dNextDouble)), continuation);
        return objDelay == C56442yFn.copydefault() ? objDelay : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.Ed$TaskDescription */
    public static final class TaskDescription implements InterfaceC5086Ee.ActionBar {
        public static final Application AEQbTJ = new Application(null);
        public static final TaskDescription OLrzqt = new TaskDescription(new Activity());
        public final long EZpvd;
        public final double KWHzl;
        public final long copydefault;
        public final double valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.copydefault;
        }

        /* JADX INFO: renamed from: o.Ed$TaskDescription$Application */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ed.TaskDescription.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public final TaskDescription AEQbTJ() {
                return TaskDescription.OLrzqt;
            }

            public final TaskDescription KWHzl(@NotNull Function1<? super Activity, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                Activity activity = new Activity();
                function1.invoke(activity);
                return new TaskDescription(activity);
            }
        }

        public TaskDescription(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.copydefault = activity.copydefault();
            this.valueOf = activity.KWHzl();
            this.KWHzl = activity.AEQbTJ();
            this.EZpvd = activity.EZpvd();
        }

        @Override // o.InterfaceC5086Ee.ActionBar
        public Function1<InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, Unit> OLrzqt() {
            return new Function1<InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.retries.delay.ExponentialBackoffWithJitter$Config$toBuilderApplicator$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar interfaceC0800ActionBar) {
                    invoke2(interfaceC0800ActionBar);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar interfaceC0800ActionBar) {
                    Intrinsics.checkNotNullParameter(interfaceC0800ActionBar, "");
                    if (interfaceC0800ActionBar instanceof C5085Ed.TaskDescription.Activity) {
                        C5085Ed.TaskDescription.Activity activity = (C5085Ed.TaskDescription.Activity) interfaceC0800ActionBar;
                        activity.AEQbTJ(this.this$0.KWHzl());
                        activity.KWHzl(this.this$0.AhwBna());
                        activity.EZpvd(this.this$0.AEQbTJ());
                        activity.copydefault(this.this$0.EZpvd());
                    }
                }
            };
        }

        /* JADX INFO: renamed from: o.Ed$TaskDescription$Activity */
        public static final class Activity implements InterfaceC5086Ee.ActionBar.InterfaceC0800ActionBar {
            public double EZpvd;
            public double KWHzl;
            public long OLrzqt;
            public long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(long j) {
                this.OLrzqt = j;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(double d) {
                this.KWHzl = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final double KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void KWHzl(double d) {
                this.EZpvd = d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(long j) {
                this.copydefault = j;
            }

            public Activity() {
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                this.OLrzqt = C59519zia.EZpvd(10, DurationUnit.MILLISECONDS);
                this.EZpvd = 1.5d;
                this.KWHzl = 1.0d;
                this.copydefault = C59519zia.EZpvd(20, DurationUnit.SECONDS);
            }
        }
    }
}
