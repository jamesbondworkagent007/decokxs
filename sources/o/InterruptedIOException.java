package o;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import aws.sdk.kotlin.runtime.config.imds.ImdsClient$get$2;
import aws.sdk.kotlin.runtime.config.imds.ImdsClient$get$op$1$1$deserialize$1;
import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AbstractC54779xV;
import o.BY;
import o.C59462zhW;
import o.C59519zia;
import o.InputStreamReader;
import o.InterfaceC4078Ay;
import o.InterfaceC5168Hi;
import o.PipedReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InterruptedIOException implements NotSerializableException {
    public static final ActionBar copydefault = new ActionBar(null);
    public final zU AEQbTJ;
    public final AbstractC54779xV AYXKKw;
    public final int AhwBna;
    public final LineNumberInputStream AkhnZx;
    public final long DbNXlk;
    public final InputStreamReader EZpvd;
    public final InterfaceC5168Hi KWHzl;
    public final InterfaceC3972Aw OLrzqt;
    public final HL djBIcL;
    public final boolean gEmmrt;
    public final SyncFailedException isConnected;
    public final InvalidClassException valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.InterruptedIOException$Activity) A[MD:(o.InterruptedIOException$Activity):void (m)] call: o.InterruptedIOException.<init>(o.InterruptedIOException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InterruptedIOException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public InterruptedIOException(Activity activity) {
        int iOLrzqt = activity.OLrzqt();
        this.AhwBna = iOLrzqt;
        InputStreamReader inputStreamReaderAEQbTJ = activity.AEQbTJ();
        this.EZpvd = inputStreamReaderAEQbTJ;
        long jDjBIcL = activity.djBIcL();
        this.DbNXlk = jDjBIcL;
        InterfaceC5168Hi interfaceC5168HiCopydefault = activity.copydefault();
        this.KWHzl = interfaceC5168HiCopydefault;
        HL hlAYXKKw = activity.AYXKKw();
        this.djBIcL = hlAYXKKw;
        this.AYXKKw = activity.EZpvd();
        this.gEmmrt = activity.KWHzl() == null;
        if (iOLrzqt <= 0) {
            throw new java.lang.IllegalArgumentException("maxRetries must be greater than zero".toString());
        }
        InterfaceC3972Aw interfaceC3972AwKWHzl = activity.KWHzl();
        interfaceC3972AwKWHzl = interfaceC3972AwKWHzl == null ? C3919Av.copydefault(new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.config.imds.ImdsClient$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                invoke2(actionBar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                actionBar.copydefault(C59519zia.EZpvd(1, durationUnit));
                actionBar.OLrzqt(C59519zia.EZpvd(1, durationUnit));
            }
        }) : interfaceC3972AwKWHzl;
        this.OLrzqt = interfaceC3972AwKWHzl;
        zU zUVar = new zU(interfaceC3972AwKWHzl);
        this.AEQbTJ = zUVar;
        this.isConnected = new SyncFailedException(PipedReader.TaskDescription.fromEnvironment$default(PipedReader.EZpvd, new PrintStream("imds", "unknown"), null, 2, null));
        InvalidClassException invalidClassException = new InvalidClassException(hlAYXKKw, inputStreamReaderAEQbTJ);
        this.valueOf = invalidClassException;
        this.AkhnZx = new LineNumberInputStream(zUVar, invalidClassException, jDjBIcL, interfaceC5168HiCopydefault, null);
    }

    public InterruptedIOException() {
        this(new Activity());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.InterruptedIOException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterruptedIOException KWHzl(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return new InterruptedIOException(activity, null);
        }
    }

    @Override // o.NotSerializableException
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        BY.Activity activity = BY.KWHzl;
        BV bv = new BV(C56524yIo.AEQbTJ(Unit.class), C56524yIo.AEQbTJ(java.lang.String.class));
        bv.EZpvd(C5038Ci.AEQbTJ);
        bv.OLrzqt(new TaskDescription());
        bv.AEQbTJ(str);
        bv.EZpvd("IMDS");
        bv.copydefault().OLrzqt(C57578yl.EZpvd.EZpvd(), this.AYXKKw);
        bv.AEQbTJ().OLrzqt(this.valueOf);
        BY byOLrzqt = bv.OLrzqt();
        byOLrzqt.copydefault().AEQbTJ(new InvalidObjectException(continuation.getContext()));
        byOLrzqt.AEQbTJ(this.isConnected);
        byOLrzqt.AEQbTJ(this.AkhnZx);
        byOLrzqt.copydefault().copydefault().OLrzqt(Phase.Order.Before, new ImdsClient$get$2(str, null));
        return C5030Ca.EZpvd(byOLrzqt, this.AEQbTJ, Unit.INSTANCE, continuation);
    }

    public static final class TaskDescription implements BB<java.lang.String> {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.BB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
            ImdsClient$get$op$1$1$deserialize$1 imdsClient$get$op$1$1$deserialize$1;
            InterfaceC5039Cj interfaceC5039Cj;
            if (continuation instanceof ImdsClient$get$op$1$1$deserialize$1) {
                imdsClient$get$op$1$1$deserialize$1 = (ImdsClient$get$op$1$1$deserialize$1) continuation;
                int i = imdsClient$get$op$1$1$deserialize$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    imdsClient$get$op$1$1$deserialize$1.label = i - Integer.MIN_VALUE;
                } else {
                    imdsClient$get$op$1$1$deserialize$1 = new ImdsClient$get$op$1$1$deserialize$1(this, continuation);
                }
            }
            java.lang.Object objCopydefault = imdsClient$get$op$1$1$deserialize$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = imdsClient$get$op$1$1$deserialize$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
                if (zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
                    zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
                    imdsClient$get$op$1$1$deserialize$1.L$0 = interfaceC5039CjAEQbTJ;
                    imdsClient$get$op$1$1$deserialize$1.label = 1;
                    objCopydefault = C58752zO.copydefault(zPVarEZpvd, imdsClient$get$op$1$1$deserialize$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    interfaceC5039Cj = interfaceC5039CjAEQbTJ;
                } else {
                    throw new EC2MetadataError(interfaceC5039CjAEQbTJ.OLrzqt().flVtFt(), "error retrieving instance metadata");
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5039Cj = (InterfaceC5039Cj) imdsClient$get$op$1$1$deserialize$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            byte[] bArr = (byte[]) objCopydefault;
            if (bArr == null) {
                throw new EC2MetadataError(interfaceC5039Cj.OLrzqt().flVtFt(), "no metadata payload");
            }
            return C59449zhJ.copydefault(bArr);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.gEmmrt) {
            CB.copydefault(this.OLrzqt);
        }
    }

    public static final class Activity {
        public HL AhwBna;
        public InterfaceC3972Aw KWHzl;
        public InterfaceC5168Hi OLrzqt;
        public AbstractC54779xV copydefault;
        public long valueOf;
        public int EZpvd = 3;
        public InputStreamReader AEQbTJ = InputStreamReader.ActionBar.KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputStreamReader AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull HL hl) {
            Intrinsics.checkNotNullParameter(hl, "");
            this.AhwBna = hl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HL AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC54779xV EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC3972Aw KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(InterfaceC3972Aw interfaceC3972Aw) {
            this.KWHzl = interfaceC3972Aw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC5168Hi copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long djBIcL() {
            return this.valueOf;
        }

        public Activity() {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            this.valueOf = C59519zia.EZpvd(21600, DurationUnit.SECONDS);
            this.copydefault = AbstractC54779xV.Application.EZpvd;
            this.OLrzqt = InterfaceC5168Hi.Activity.AEQbTJ;
            this.AhwBna = HL.OLrzqt.copydefault();
        }
    }
}
